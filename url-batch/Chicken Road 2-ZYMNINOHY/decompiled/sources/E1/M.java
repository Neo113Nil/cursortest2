package E1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import com.google.android.gms.internal.play_billing.AbstractC0313f;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class M extends AbstractBinderC0310e {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f509b;

    /* renamed from: c, reason: collision with root package name */
    public final I f510c;

    public M(WeakReference weakReference, I i4) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 0);
        this.f509b = weakReference;
        this.f510c = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0310e
    public final boolean e(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0313f.a(parcel);
        AbstractC0313f.b(parcel);
        I i5 = this.f510c;
        if (bundle == null) {
            i5.send(6, null);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            AbstractC0352w.h("BillingClient", "Response bundle doesn't contain a response code");
            i5.send(6, bundle);
            return true;
        }
        int a3 = AbstractC0352w.a(bundle, "BillingClient");
        if (a3 != 0) {
            AbstractC0352w.h("BillingClient", "Unable to launch intent for alternative billing only dialog" + a3);
            i5.send(a3, bundle);
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            AbstractC0352w.g("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            i5.send(0, bundle);
            return true;
        }
        try {
            Activity activity = (Activity) this.f509b.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", i5);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
            return true;
        } catch (RuntimeException e4) {
            AbstractC0352w.i("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e4);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e4.getClass().getName();
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            i5.send(6, bundle2);
            return true;
        }
    }
}
