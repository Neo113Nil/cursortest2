package s7;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r3 extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, y1 y1Var, int i3) {
        super(y1Var);
        this.f8974e = i3;
        this.f8975f = obj;
    }

    @Override // s7.n
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.f8974e) {
            case 0:
                s3 s3Var = (s3) this.f8975f;
                t3 t3Var = s3Var.f9002d;
                t3Var.s();
                q1 q1Var = (q1) t3Var.f1478d;
                q1Var.f8942y.getClass();
                s3Var.a(false, false, SystemClock.elapsedRealtime());
                z zVar = q1Var.B;
                q1.i(zVar);
                q1Var.f8942y.getClass();
                zVar.v(SystemClock.elapsedRealtime());
                break;
            case 1:
                y3 y3Var = (y3) this.f8975f;
                y3Var.x();
                v0 v0Var = ((q1) y3Var.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.B.a("Starting upload from DelayedRunnable");
                y3Var.f9150e.q();
                break;
            default:
                j4 j4Var = (j4) this.f8975f;
                j4Var.d().s();
                String str = (String) j4Var.E.pollFirst();
                if (str != null) {
                    j4Var.f().getClass();
                    j4Var.W = SystemClock.elapsedRealtime();
                    j4Var.b().B.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = j4Var.f8771z.f8932d;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    }
                }
                j4Var.H();
                break;
        }
    }
}
