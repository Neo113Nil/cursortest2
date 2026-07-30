package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i51 extends l51 implements Iterator {
    public j51 d;
    public j51 e;
    public final /* synthetic */ int g;

    public i51(j51 j51Var, j51 j51Var2, int i) {
        this.g = i;
        this.d = j51Var2;
        this.e = j51Var;
    }

    @Override // defpackage.l51
    public final void a(j51 j51Var) {
        j51 j51Var2;
        j51 j51Var3 = null;
        if (this.d == j51Var && j51Var == this.e) {
            this.e = null;
            this.d = null;
        }
        j51 j51Var4 = this.d;
        if (j51Var4 == j51Var) {
            switch (this.g) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    j51Var2 = j51Var4.h;
                    break;
                default:
                    j51Var2 = j51Var4.g;
                    break;
            }
            this.d = j51Var2;
        }
        j51 j51Var5 = this.e;
        if (j51Var5 == j51Var) {
            j51 j51Var6 = this.d;
            if (j51Var5 != j51Var6 && j51Var6 != null) {
                j51Var3 = b(j51Var5);
            }
            this.e = j51Var3;
        }
    }

    public final j51 b(j51 j51Var) {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return j51Var.g;
            default:
                return j51Var.h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        j51 j51Var = this.e;
        j51 j51Var2 = this.d;
        this.e = (j51Var == j51Var2 || j51Var2 == null) ? null : b(j51Var);
        return j51Var;
    }
}
