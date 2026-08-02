package E1;

import E.AbstractC0005f;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.l1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.inapppurchase.f f498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0029e f499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0029e c0029e, Handler handler, io.flutter.plugins.inapppurchase.f fVar) {
        super(handler);
        this.f498a = fVar;
        Objects.requireNonNull(c0029e);
        this.f499b = c0029e;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        C0036l a3 = C0037m.a();
        a3.f630a = i4;
        io.flutter.plugins.inapppurchase.f fVar = this.f498a;
        if (i4 != 0) {
            C0029e c0029e = this.f499b;
            if (bundle == null) {
                c0029e.p(fVar, W.f540h, 73, null);
                return;
            }
            a3.f632c = AbstractC0352w.f(bundle, "BillingClient");
            int i5 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            int b4 = i5 != 0 ? AbstractC0005f.b(i5) : 23;
            C0037m a4 = a3.a();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i6 = U.f526a;
            c0029e.q(U.b(b4, 16, a4, string, l1.BROADCAST_ACTION_UNSPECIFIED));
        }
        fVar.c(a3.a());
    }
}
