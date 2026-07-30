package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qw0 extends v0 {
    public final /* synthetic */ int e;
    public final b0 g;

    public /* synthetic */ qw0(b0 b0Var, int i) {
        this.e = i;
        this.g = b0Var;
    }

    @Override // defpackage.m
    public final int a() {
        int i = this.e;
        b0 b0Var = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((lw0) b0Var).i;
            case 1:
                return ((lw0) b0Var).i;
            default:
                return b0Var.c();
        }
    }

    @Override // defpackage.m, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        b0 b0Var = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    lw0 lw0Var = (lw0) b0Var;
                    Object obj2 = lw0Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && lw0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((lw0) b0Var).containsKey(obj);
            default:
                return b0Var.containsKey(obj);
        }
    }

    @Override // defpackage.v0, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        b0 b0Var = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                oj1 oj1Var = ((lw0) b0Var).h;
                pj1[] pj1VarArr = new pj1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    pj1VarArr[i2] = new qj1(0);
                }
                return new rw0(oj1Var, pj1VarArr);
            case 1:
                oj1 oj1Var2 = ((lw0) b0Var).h;
                pj1[] pj1VarArr2 = new pj1[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    pj1VarArr2[i3] = new qj1(1);
                }
                return new rw0(oj1Var2, pj1VarArr2);
            default:
                return new z(((qw0) b0Var.a()).iterator(), 0);
        }
    }
}
