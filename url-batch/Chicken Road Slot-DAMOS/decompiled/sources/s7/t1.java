package s7;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9016e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9017i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f9018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9019s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9020t;

    public t1(b3 b3Var, Bundle bundle, y2 y2Var, y2 y2Var2, long j) {
        this.f9015d = 2;
        this.f9016e = bundle;
        this.f9017i = y2Var;
        this.f9019s = y2Var2;
        this.f9018r = j;
        Objects.requireNonNull(b3Var);
        this.f9020t = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9015d) {
            case 0:
                String str = (String) this.f9017i;
                w1 w1Var = (w1) this.f9020t;
                String str2 = (String) this.f9016e;
                if (str2 != null) {
                    y2 y2Var = new y2((String) this.f9019s, str2, this.f9018r);
                    j4 j4Var = w1Var.f9082d;
                    j4Var.d().s();
                    String str3 = j4Var.U;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    j4Var.U = str;
                    j4Var.T = y2Var;
                    break;
                } else {
                    j4 j4Var2 = w1Var.f9082d;
                    j4Var2.d().s();
                    String str4 = j4Var2.U;
                    if (str4 == null || str4.equals(str)) {
                        j4Var2.U = str;
                        j4Var2.T = null;
                        break;
                    }
                }
                break;
            case 1:
                q2 q2Var = (q2) this.f9020t;
                String str5 = (String) this.f9016e;
                String str6 = (String) this.f9017i;
                q2Var.D(this.f9018r, this.f9019s, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.f9016e;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                b3 b3Var = (b3) this.f9020t;
                p4 p4Var = ((q1) b3Var.f1478d).f8940w;
                q1.j(p4Var);
                b3Var.y((y2) this.f9017i, (y2) this.f9019s, this.f9018r, true, p4Var.C("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ t1(Object obj, String str, String str2, Object obj2, long j, int i3) {
        this.f9015d = i3;
        this.f9016e = str;
        this.f9017i = str2;
        this.f9019s = obj2;
        this.f9018r = j;
        this.f9020t = obj;
    }
}
