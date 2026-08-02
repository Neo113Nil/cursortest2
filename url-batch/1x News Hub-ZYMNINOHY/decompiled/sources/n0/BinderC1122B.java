package n0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0217e;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import java.lang.ref.WeakReference;

/* renamed from: n0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1122B extends X0.a {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f9988c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReceiverC1162x f9989d;

    public BinderC1122B(WeakReference weakReference, ResultReceiverC1162x resultReceiverC1162x) {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback", 2);
        this.f9988c = weakReference;
        this.f9989d = resultReceiverC1162x;
    }

    @Override // X0.a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0217e.a(parcel);
        AbstractC0217e.b(parcel);
        ResultReceiverC1162x resultReceiverC1162x = this.f9989d;
        if (bundle == null) {
            resultReceiverC1162x.send(6, null);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            AbstractC0248o0.g("BillingClient", "Response bundle doesn't contain a response code");
            resultReceiverC1162x.send(6, bundle);
            return true;
        }
        int a3 = AbstractC0248o0.a(bundle, "BillingClient");
        if (a3 != 0) {
            AbstractC0248o0.g("BillingClient", "Unable to launch intent for alternative billing only dialog" + a3);
            resultReceiverC1162x.send(a3, bundle);
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            AbstractC0248o0.f("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            resultReceiverC1162x.send(0, bundle);
            return true;
        }
        try {
            Activity activity = (Activity) this.f9988c.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiverC1162x);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
            return true;
        } catch (RuntimeException e3) {
            AbstractC0248o0.h("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e3);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            String name = e3.getClass().getName();
            String message = e3.getMessage();
            if (message == null) {
                message = "";
            }
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + message);
            resultReceiverC1162x.send(6, bundle2);
            return true;
        }
    }
}
