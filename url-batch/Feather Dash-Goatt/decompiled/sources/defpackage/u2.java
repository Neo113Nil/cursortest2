package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u2 implements to0 {
    public final /* synthetic */ int d;
    public final Object e;
    public boolean g;

    public /* synthetic */ u2(Object obj, boolean z, int i) {
        this.d = i;
        this.e = obj;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.to0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(long j, long j2, dn dnVar) {
        q71 q71Var;
        int i;
        long j3;
        if (dnVar instanceof q71) {
            q71Var = (q71) dnVar;
            int i2 = q71Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q71Var.k = i2 - Integer.MIN_VALUE;
                Object obj = q71Var.i;
                tn tnVar = tn.d;
                i = q71Var.k;
                if (i != 0) {
                    ca0.v(obj);
                    j3 = 0;
                    if (this.g) {
                        d81 d81Var = (d81) this.e;
                        if (!d81Var.i) {
                            q71Var.h = j2;
                            q71Var.k = 1;
                            obj = d81Var.a(j2, q71Var);
                            if (obj == tnVar) {
                                return tnVar;
                            }
                        }
                        j3 = xm1.d(j2, j3);
                    }
                    return new xm1(j3);
                }
                if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = q71Var.h;
                ca0.v(obj);
                j3 = ((xm1) obj).a;
                j3 = xm1.d(j2, j3);
                return new xm1(j3);
            }
        }
        q71Var = new q71(this, (fn) dnVar);
        Object obj2 = q71Var.i;
        tn tnVar2 = tn.d;
        i = q71Var.k;
        if (i != 0) {
        }
        j3 = ((xm1) obj2).a;
        j3 = xm1.d(j2, j3);
        return new xm1(j3);
    }

    @Override // defpackage.to0
    public long E(int i, long j, long j2) {
        if (!this.g) {
            return 0L;
        }
        d81 d81Var = (d81) this.e;
        if (d81Var.a.b()) {
            return 0L;
        }
        return d81Var.h(d81Var.d(d81Var.a.e(d81Var.d(d81Var.g(j2)))));
    }

    public String toString() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "{" + ((String) this.e) + "}" + this.g;
            default:
                return super.toString();
        }
    }
}
