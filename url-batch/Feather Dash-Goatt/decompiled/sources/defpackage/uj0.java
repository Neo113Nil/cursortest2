package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uj0 extends wj0 implements Iterator, yb0 {
    public final /* synthetic */ int i;

    public uj0(xj0 xj0Var, int i) {
        this.i = i;
        xj0Var.getClass();
        this.h = xj0Var;
        this.e = -1;
        this.g = xj0Var.l;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b();
                int i = this.d;
                xj0 xj0Var = (xj0) this.h;
                if (i >= xj0Var.j) {
                    dd0.c();
                    break;
                } else {
                    this.d = i + 1;
                    this.e = i;
                    vj0 vj0Var = new vj0(xj0Var, i);
                    c();
                    break;
                }
            case 1:
                b();
                int i2 = this.d;
                xj0 xj0Var2 = (xj0) this.h;
                if (i2 >= xj0Var2.j) {
                    dd0.c();
                    break;
                } else {
                    this.d = i2 + 1;
                    this.e = i2;
                    Object obj = xj0Var2.d[i2];
                    c();
                    break;
                }
            default:
                b();
                int i3 = this.d;
                xj0 xj0Var3 = (xj0) this.h;
                if (i3 >= xj0Var3.j) {
                    dd0.c();
                    break;
                } else {
                    this.d = i3 + 1;
                    this.e = i3;
                    Object[] objArr = xj0Var3.e;
                    objArr.getClass();
                    Object obj2 = objArr[this.e];
                    c();
                    break;
                }
        }
        return null;
    }
}
