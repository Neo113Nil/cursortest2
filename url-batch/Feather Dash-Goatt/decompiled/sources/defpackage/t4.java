package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t4 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(Object obj, int i, Object obj2) {
        super(1);
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        int i = 0;
        int i2 = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = (Context) this.e;
                Context applicationContext = context.getApplicationContext();
                u4 u4Var = (u4) this.g;
                applicationContext.registerComponentCallbacks(u4Var);
                return new s4(context, i, u4Var);
            case 1:
                Context context2 = (Context) this.e;
                Context applicationContext2 = context2.getApplicationContext();
                v4 v4Var = (v4) this.g;
                applicationContext2.registerComponentCallbacks(v4Var);
                return new s4(context2, i2, v4Var);
            case 2:
                p6 p6Var = (p6) this.e;
                q6 q6Var = (q6) this.g;
                synchronized (p6Var.i) {
                    p6Var.k.remove(q6Var);
                }
                return Unit.a;
            case 3:
                ((r6) this.e).d.removeFrameCallback((q6) this.g);
                return Unit.a;
            case 4:
                ((jd0) this.e).b0(((am0) obj).c((am0) this.g));
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                xx0 xx0Var = (xx0) this.g;
                if (motionEvent.getActionMasked() == 0) {
                    o91 o91Var = (o91) this.e;
                    x6 x6Var = xx0Var.a;
                    if (x6Var == null) {
                        Intrinsics.e("onTouchEvent");
                        throw null;
                    }
                    o91Var.e = ((Boolean) x6Var.invoke(motionEvent)).booleanValue() ? vx0.e : vx0.g;
                } else {
                    x6 x6Var2 = xx0Var.a;
                    if (x6Var2 == null) {
                        Intrinsics.e("onTouchEvent");
                        throw null;
                    }
                    x6Var2.invoke(motionEvent);
                }
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                Throwable th = (Throwable) obj;
                ((a3) this.e).invoke(th);
                we weVar = (we) ((o91) this.g).g;
                weVar.g(th, false);
                do {
                    Object q = weVar.q();
                    if (q instanceof og) {
                        q = null;
                    }
                    if (q != null) {
                        ((fl0) q).b.Y(new hj(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        unit = Unit.a;
                    } else {
                        unit = null;
                    }
                } while (unit != null);
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                yw0 yw0Var = (yw0) obj;
                zw0 zw0Var = (zw0) this.e;
                a3 a3Var = ((ra1) this.g).D;
                yw0Var.getClass();
                yw0.a(yw0Var, zw0Var);
                zw0Var.Y(s90.c(0L, zw0Var.i), 0.0f, a3Var);
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                s3 s3Var = (s3) obj;
                Function2 function2 = (Function2) this.g;
                kq1 kq1Var = (kq1) this.e;
                if (!kq1Var.g) {
                    xg0 f = s3Var.a.f();
                    kq1Var.i = function2;
                    if (kq1Var.h == null) {
                        kq1Var.h = f;
                        f.a(kq1Var);
                    } else if (f.c.compareTo(og0.g) >= 0) {
                        kq1Var.e.B(new hk(1330788943, true, new jq1(kq1Var, function2, i2)));
                    }
                }
                return Unit.a;
            default:
                yw0 yw0Var2 = (yw0) obj;
                zw0 zw0Var2 = (zw0) this.e;
                float f2 = ((tq1) this.g).s;
                yw0Var2.getClass();
                yw0.a(yw0Var2, zw0Var2);
                zw0Var2.Y(s90.c(0L, zw0Var2.i), f2, null);
                return Unit.a;
        }
    }
}
