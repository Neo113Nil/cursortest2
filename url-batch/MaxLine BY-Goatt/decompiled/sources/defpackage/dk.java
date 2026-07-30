package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ hk o;

    public /* synthetic */ dk(String str, hk hkVar, int i) {
        this.m = i;
        this.n = str;
        this.o = hkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v1, types: [ik] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uc2 M;
        int i;
        int i2;
        Integer valueOf;
        int i3 = this.m;
        hk hkVar = this.o;
        String str = this.n;
        switch (i3) {
            case 0:
                hk hkVar2 = hkVar;
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                M = nc2Var.M("SELECT * FROM atlas_entry WHERE nameRu LIKE '%' || ? || '%' OR nameEn LIKE '%' || ? || '%' ORDER BY nameEn");
                try {
                    M.w(1, str);
                    M.w(2, str);
                    int t = bd3.t(M, "slug");
                    int t2 = bd3.t(M, "kind");
                    int t3 = bd3.t(M, "nameRu");
                    int t4 = bd3.t(M, "nameEn");
                    int t5 = bd3.t(M, "formula");
                    int t6 = bd3.t(M, "colorRu");
                    int t7 = bd3.t(M, "colorEn");
                    int t8 = bd3.t(M, "mohsMin");
                    int t9 = bd3.t(M, "mohsMax");
                    int t10 = bd3.t(M, "lustreRu");
                    int t11 = bd3.t(M, "lustreEn");
                    int t12 = bd3.t(M, "originRu");
                    int t13 = bd3.t(M, "originEn");
                    int t14 = bd3.t(M, "symbolismRu");
                    int t15 = bd3.t(M, "symbolismEn");
                    int t16 = bd3.t(M, "careRu");
                    int t17 = bd3.t(M, "careEn");
                    int t18 = bd3.t(M, "factsRu");
                    int t19 = bd3.t(M, "factsEn");
                    int t20 = bd3.t(M, "birthMonth");
                    int t21 = bd3.t(M, "zodiac");
                    int t22 = bd3.t(M, "sources");
                    ArrayList arrayList = new ArrayList();
                    while (M.E()) {
                        String j = M.j(t);
                        String j2 = M.j(t2);
                        int i4 = t;
                        hk hkVar3 = hkVar2;
                        int i5 = t2;
                        u30 u30Var = hkVar3.c;
                        jk r = u30.r(j2);
                        String j3 = M.j(t3);
                        String j4 = M.j(t4);
                        String j5 = M.isNull(t5) ? null : M.j(t5);
                        String j6 = M.j(t6);
                        String j7 = M.j(t7);
                        Double valueOf2 = M.isNull(t8) ? null : Double.valueOf(M.getDouble(t8));
                        Double valueOf3 = M.isNull(t9) ? null : Double.valueOf(M.getDouble(t9));
                        String j8 = M.j(t10);
                        String j9 = M.j(t11);
                        String j10 = M.j(t12);
                        String j11 = M.j(t13);
                        String j12 = M.j(t14);
                        int i6 = t15;
                        String j13 = M.j(i6);
                        int i7 = t16;
                        String j14 = M.j(i7);
                        t16 = i7;
                        int i8 = t17;
                        String j15 = M.j(i8);
                        t17 = i8;
                        int i9 = t18;
                        List n = u30.n(M.j(i9));
                        t18 = i9;
                        int i10 = t19;
                        List n2 = u30.n(M.j(i10));
                        t19 = i10;
                        int i11 = t20;
                        if (M.isNull(i11)) {
                            i = t4;
                            i2 = t3;
                            valueOf = null;
                        } else {
                            i = t4;
                            i2 = t3;
                            valueOf = Integer.valueOf((int) M.getLong(i11));
                        }
                        int i12 = t21;
                        int i13 = t22;
                        arrayList.add(new ik(j, r, j3, j4, j5, j6, j7, valueOf2, valueOf3, j8, j9, j10, j11, j12, j13, j14, j15, n, n2, valueOf, M.isNull(i12) ? null : M.j(i12), u30.n(M.j(i13))));
                        t21 = i12;
                        t4 = i;
                        t20 = i11;
                        t22 = i13;
                        t = i4;
                        t3 = i2;
                        t15 = i6;
                        t2 = i5;
                        hkVar2 = hkVar3;
                    }
                    return arrayList;
                } finally {
                }
            default:
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                M = nc2Var2.M("SELECT * FROM atlas_entry WHERE slug = ? LIMIT 1");
                try {
                    M.w(1, str);
                    int t23 = bd3.t(M, "slug");
                    int t24 = bd3.t(M, "kind");
                    int t25 = bd3.t(M, "nameRu");
                    int t26 = bd3.t(M, "nameEn");
                    int t27 = bd3.t(M, "formula");
                    int t28 = bd3.t(M, "colorRu");
                    int t29 = bd3.t(M, "colorEn");
                    int t30 = bd3.t(M, "mohsMin");
                    int t31 = bd3.t(M, "mohsMax");
                    int t32 = bd3.t(M, "lustreRu");
                    int t33 = bd3.t(M, "lustreEn");
                    int t34 = bd3.t(M, "originRu");
                    int t35 = bd3.t(M, "originEn");
                    int t36 = bd3.t(M, "symbolismRu");
                    int t37 = bd3.t(M, "symbolismEn");
                    int t38 = bd3.t(M, "careRu");
                    int t39 = bd3.t(M, "careEn");
                    int t40 = bd3.t(M, "factsRu");
                    int t41 = bd3.t(M, "factsEn");
                    int t42 = bd3.t(M, "birthMonth");
                    int t43 = bd3.t(M, "zodiac");
                    int t44 = bd3.t(M, "sources");
                    if (M.E()) {
                        String j16 = M.j(t23);
                        String j17 = M.j(t24);
                        u30 u30Var2 = hkVar.c;
                        r21 = new ik(j16, u30.r(j17), M.j(t25), M.j(t26), M.isNull(t27) ? null : M.j(t27), M.j(t28), M.j(t29), M.isNull(t30) ? null : Double.valueOf(M.getDouble(t30)), M.isNull(t31) ? null : Double.valueOf(M.getDouble(t31)), M.j(t32), M.j(t33), M.j(t34), M.j(t35), M.j(t36), M.j(t37), M.j(t38), M.j(t39), u30.n(M.j(t40)), u30.n(M.j(t41)), M.isNull(t42) ? null : Integer.valueOf((int) M.getLong(t42)), M.isNull(t43) ? null : M.j(t43), u30.n(M.j(t44)));
                    }
                    return r21;
                } finally {
                }
        }
    }
}
