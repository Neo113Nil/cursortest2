package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bk(iz izVar, boolean z) {
        this.m = 3;
        this.o = izVar;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        boolean z = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                String str = (String) obj2;
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                uc2 M = nc2Var.M("UPDATE atlas_progress SET owned = ? WHERE slug = ?");
                try {
                    M.d(z ? 1L : 0L, 1);
                    M.w(2, str);
                    M.E();
                    M.close();
                    return Unit.a;
                } finally {
                }
            case 1:
                String str2 = (String) obj2;
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                uc2 M2 = nc2Var2.M("UPDATE atlas_progress SET favourite = ? WHERE slug = ?");
                try {
                    M2.d(z ? 1L : 0L, 1);
                    M2.w(2, str2);
                    M2.E();
                    M2.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                String str3 = (String) obj2;
                nc2 nc2Var3 = (nc2) obj;
                nc2Var3.getClass();
                uc2 M3 = nc2Var3.M("UPDATE atlas_progress SET studied = ? WHERE slug = ?");
                try {
                    M3.d(z ? 1L : 0L, 1);
                    M3.w(2, str3);
                    M3.E();
                    M3.close();
                    return Unit.a;
                } finally {
                }
            default:
                iz izVar = (iz) obj2;
                izVar.e(z);
                return new y32((ld1) obj, izVar);
        }
    }

    public /* synthetic */ bk(String str, int i, boolean z) {
        this.m = i;
        this.n = z;
        this.o = str;
    }
}
