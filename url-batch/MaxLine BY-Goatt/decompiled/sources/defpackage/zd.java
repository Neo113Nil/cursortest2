package defpackage;

import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class zd implements Function1 {
    public final /* synthetic */ int m;

    public /* synthetic */ zd(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        un2 un2Var = null;
        un2Var = null;
        switch (this.m) {
            case 0:
                return Boolean.valueOf(!(((ud) obj) instanceof ez1));
            case 1:
                return Unit.a;
            case 2:
                return (cj) obj;
            case 3:
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                uc2 M = nc2Var.M("DELETE FROM atlas_progress");
                try {
                    M.E();
                    M.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                uc2 M2 = nc2Var2.M("SELECT * FROM atlas_progress");
                try {
                    int t = bd3.t(M2, "slug");
                    int t2 = bd3.t(M2, "studied");
                    int t3 = bd3.t(M2, "favourite");
                    int t4 = bd3.t(M2, "owned");
                    ArrayList arrayList = new ArrayList();
                    while (M2.E()) {
                        arrayList.add(new kk(M2.j(t), ((int) M2.getLong(t2)) != 0, ((int) M2.getLong(t3)) != 0, ((int) M2.getLong(t4)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                nc2 nc2Var3 = (nc2) obj;
                nc2Var3.getClass();
                uc2 M3 = nc2Var3.M("SELECT COUNT(*) FROM atlas_entry");
                try {
                    int i3 = M3.E() ? (int) M3.getLong(0) : 0;
                    M3.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 6:
                nc2 nc2Var4 = (nc2) obj;
                nc2Var4.getClass();
                uc2 M4 = nc2Var4.M("SELECT COUNT(*) FROM atlas_progress WHERE studied = 1");
                try {
                    int i4 = M4.E() ? (int) M4.getLong(0) : 0;
                    M4.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                nc2 nc2Var5 = (nc2) obj;
                nc2Var5.getClass();
                uc2 M5 = nc2Var5.M("SELECT * FROM atlas_entry ORDER BY nameEn");
                try {
                    int t5 = bd3.t(M5, "slug");
                    int t6 = bd3.t(M5, "kind");
                    int t7 = bd3.t(M5, "nameRu");
                    int t8 = bd3.t(M5, "nameEn");
                    int t9 = bd3.t(M5, "formula");
                    int t10 = bd3.t(M5, "colorRu");
                    int t11 = bd3.t(M5, "colorEn");
                    int t12 = bd3.t(M5, "mohsMin");
                    int t13 = bd3.t(M5, "mohsMax");
                    int t14 = bd3.t(M5, "lustreRu");
                    int t15 = bd3.t(M5, "lustreEn");
                    int t16 = bd3.t(M5, "originRu");
                    int t17 = bd3.t(M5, "originEn");
                    int t18 = bd3.t(M5, "symbolismRu");
                    int t19 = bd3.t(M5, "symbolismEn");
                    int t20 = bd3.t(M5, "careRu");
                    int t21 = bd3.t(M5, "careEn");
                    int t22 = bd3.t(M5, "factsRu");
                    int t23 = bd3.t(M5, "factsEn");
                    int t24 = bd3.t(M5, "birthMonth");
                    int t25 = bd3.t(M5, "zodiac");
                    int t26 = bd3.t(M5, "sources");
                    ArrayList arrayList2 = new ArrayList();
                    while (M5.E()) {
                        String j = M5.j(t5);
                        jk r = u30.r(M5.j(t6));
                        String j2 = M5.j(t7);
                        String j3 = M5.j(t8);
                        String j4 = M5.isNull(t9) ? null : M5.j(t9);
                        String j5 = M5.j(t10);
                        String j6 = M5.j(t11);
                        Double valueOf2 = M5.isNull(t12) ? null : Double.valueOf(M5.getDouble(t12));
                        Double valueOf3 = M5.isNull(t13) ? null : Double.valueOf(M5.getDouble(t13));
                        String j7 = M5.j(t14);
                        String j8 = M5.j(t15);
                        String j9 = M5.j(t16);
                        String j10 = M5.j(t17);
                        String j11 = M5.j(t18);
                        int i5 = t5;
                        int i6 = t19;
                        String j12 = M5.j(i6);
                        t19 = i6;
                        int i7 = t20;
                        String j13 = M5.j(i7);
                        t20 = i7;
                        int i8 = t21;
                        String j14 = M5.j(i8);
                        t21 = i8;
                        int i9 = t22;
                        List n = u30.n(M5.j(i9));
                        t22 = i9;
                        int i10 = t23;
                        List n2 = u30.n(M5.j(i10));
                        t23 = i10;
                        int i11 = t24;
                        if (M5.isNull(i11)) {
                            i = t6;
                            i2 = t7;
                            valueOf = null;
                        } else {
                            i = t6;
                            i2 = t7;
                            valueOf = Integer.valueOf((int) M5.getLong(i11));
                        }
                        int i12 = t25;
                        int i13 = t26;
                        arrayList2.add(new ik(j, r, j2, j3, j4, j5, j6, valueOf2, valueOf3, j7, j8, j9, j10, j11, j12, j13, j14, n, n2, valueOf, M5.isNull(i12) ? null : M5.j(i12), u30.n(M5.j(i13))));
                        t25 = i12;
                        t6 = i;
                        t24 = i11;
                        t26 = i13;
                        t5 = i5;
                        t7 = i2;
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                nc2 nc2Var6 = (nc2) obj;
                nc2Var6.getClass();
                uc2 M6 = nc2Var6.M("SELECT * FROM atlas_progress");
                try {
                    int t27 = bd3.t(M6, "slug");
                    int t28 = bd3.t(M6, "studied");
                    int t29 = bd3.t(M6, "favourite");
                    int t30 = bd3.t(M6, "owned");
                    ArrayList arrayList3 = new ArrayList();
                    while (M6.E()) {
                        arrayList3.add(new kk(M6.j(t27), ((int) M6.getLong(t28)) != 0, ((int) M6.getLong(t29)) != 0, ((int) M6.getLong(t30)) != 0));
                    }
                    return arrayList3;
                } finally {
                }
            case 9:
                ((ra1) obj).getClass();
                return new mw0(yj1.d(ra1.b));
            case 10:
                ((ra1) obj).getClass();
                return new mw0(yj1.d(ra1.b));
            case 11:
                ik ikVar = (ik) obj;
                ikVar.getClass();
                return ikVar.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof t40) {
                    return (t40) element;
                }
                return null;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                synchronized (tm2.c) {
                    List list = tm2.i;
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((Function1) list.get(i14)).invoke(obj);
                    }
                }
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                nc2 nc2Var7 = (nc2) obj;
                nc2Var7.getClass();
                uc2 M7 = nc2Var7.M("SELECT * FROM jewelry_item ORDER BY createdAt DESC");
                try {
                    int t31 = bd3.t(M7, "id");
                    int t32 = bd3.t(M7, "name");
                    int t33 = bd3.t(M7, "type");
                    int t34 = bd3.t(M7, "metal");
                    int t35 = bd3.t(M7, "fineness");
                    int t36 = bd3.t(M7, "weightGrams");
                    int t37 = bd3.t(M7, "purchaseDateEpochDay");
                    int t38 = bd3.t(M7, "place");
                    int t39 = bd3.t(M7, "valueEntered");
                    int t40 = bd3.t(M7, "notes");
                    int t41 = bd3.t(M7, "photoUri");
                    int t42 = bd3.t(M7, "favourite");
                    int t43 = bd3.t(M7, "createdAt");
                    ArrayList arrayList4 = new ArrayList();
                    while (M7.E()) {
                        int i15 = t32;
                        int i16 = t33;
                        arrayList4.add(new a61(M7.getLong(t31), M7.j(t32), M7.j(t33), M7.j(t34), M7.isNull(t35) ? null : M7.j(t35), M7.isNull(t36) ? null : Double.valueOf(M7.getDouble(t36)), M7.isNull(t37) ? null : Long.valueOf(M7.getLong(t37)), M7.isNull(t38) ? null : M7.j(t38), M7.isNull(t39) ? null : Double.valueOf(M7.getDouble(t39)), M7.isNull(t40) ? null : M7.j(t40), M7.isNull(t41) ? null : M7.j(t41), ((int) M7.getLong(t42)) != 0, M7.getLong(t43)));
                        t32 = i15;
                        t33 = i16;
                    }
                    return arrayList4;
                } finally {
                }
            case 15:
                nc2 nc2Var8 = (nc2) obj;
                nc2Var8.getClass();
                uc2 M8 = nc2Var8.M("DELETE FROM jewelry_item");
                try {
                    M8.E();
                    M8.close();
                    return Unit.a;
                } finally {
                }
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                nc2 nc2Var9 = (nc2) obj;
                nc2Var9.getClass();
                uc2 M9 = nc2Var9.M("DELETE FROM item_stone");
                try {
                    M9.E();
                    M9.close();
                    return Unit.a;
                } finally {
                }
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                nc2 nc2Var10 = (nc2) obj;
                nc2Var10.getClass();
                uc2 M10 = nc2Var10.M("SELECT * FROM item_stone");
                try {
                    int t44 = bd3.t(M10, "itemId");
                    int t45 = bd3.t(M10, "atlasSlug");
                    ArrayList arrayList5 = new ArrayList();
                    while (M10.E()) {
                        arrayList5.add(new h51(M10.getLong(t44), M10.j(t45)));
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                nc2 nc2Var11 = (nc2) obj;
                nc2Var11.getClass();
                uc2 M11 = nc2Var11.M("SELECT * FROM jewelry_item");
                try {
                    int t46 = bd3.t(M11, "id");
                    int t47 = bd3.t(M11, "name");
                    int t48 = bd3.t(M11, "type");
                    int t49 = bd3.t(M11, "metal");
                    int t50 = bd3.t(M11, "fineness");
                    int t51 = bd3.t(M11, "weightGrams");
                    int t52 = bd3.t(M11, "purchaseDateEpochDay");
                    int t53 = bd3.t(M11, "place");
                    int t54 = bd3.t(M11, "valueEntered");
                    int t55 = bd3.t(M11, "notes");
                    int t56 = bd3.t(M11, "photoUri");
                    int t57 = bd3.t(M11, "favourite");
                    int t58 = bd3.t(M11, "createdAt");
                    ArrayList arrayList6 = new ArrayList();
                    while (M11.E()) {
                        int i17 = t47;
                        arrayList6.add(new a61(M11.getLong(t46), M11.j(t47), M11.j(t48), M11.j(t49), M11.isNull(t50) ? null : M11.j(t50), M11.isNull(t51) ? null : Double.valueOf(M11.getDouble(t51)), M11.isNull(t52) ? null : Long.valueOf(M11.getLong(t52)), M11.isNull(t53) ? null : M11.j(t53), M11.isNull(t54) ? null : Double.valueOf(M11.getDouble(t54)), M11.isNull(t55) ? null : M11.j(t55), M11.isNull(t56) ? null : M11.j(t56), ((int) M11.getLong(t57)) != 0, M11.getLong(t58)));
                        t47 = i17;
                    }
                    return arrayList6;
                } finally {
                }
            case 19:
                nc2 nc2Var12 = (nc2) obj;
                nc2Var12.getClass();
                uc2 M12 = nc2Var12.M("SELECT COUNT(*) FROM jewelry_item");
                try {
                    int i18 = M12.E() ? (int) M12.getLong(0) : 0;
                    M12.close();
                    return Integer.valueOf(i18);
                } finally {
                }
            case 20:
                az1 az1Var = (az1) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(az1Var.b);
                sb.append(", ");
                return q40.o(sb, az1Var.c, ')');
            case 21:
                ((ra1) obj).getClass();
                return new mw0(yj1.d(ra1.b));
            case 22:
                ((ra1) obj).getClass();
                return new mw0(yj1.d(ra1.b));
            case 23:
                a61 a61Var = (a61) obj;
                a61Var.getClass();
                return Long.valueOf(a61Var.a);
            case 24:
                throw q40.h(obj);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                ((k70) obj).getClass();
                throw new ws1(null, 1, null);
            case 26:
                return new kd2((Map) obj);
            case 27:
                return obj;
            case 28:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                Function1 function1 = (Function1) he2.h.o;
                Boolean bool = Boolean.FALSE;
                un2 un2Var2 = (Intrinsics.b(obj2, bool) || obj2 == null) ? null : (un2) function1.invoke(obj2);
                Object obj3 = list2.get(1);
                un2 un2Var3 = (Intrinsics.b(obj3, bool) || obj3 == null) ? null : (un2) function1.invoke(obj3);
                Object obj4 = list2.get(2);
                un2 un2Var4 = (Intrinsics.b(obj4, bool) || obj4 == null) ? null : (un2) function1.invoke(obj4);
                Object obj5 = list2.get(3);
                if (!Intrinsics.b(obj5, bool) && obj5 != null) {
                    un2Var = (un2) function1.invoke(obj5);
                }
                return new fw2(un2Var2, un2Var3, un2Var4, un2Var);
            default:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                List list4 = (Intrinsics.b(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) he2.a.o).invoke(obj6);
                Object obj7 = list3.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new yd(list4, str);
        }
    }

    public /* synthetic */ zd(int i, Object obj) {
        this.m = i;
    }
}
