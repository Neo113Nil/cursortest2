package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fi2 extends o81 implements Function2 {
    public static final fi2 A;
    public static final fi2 B;
    public static final fi2 C;
    public static final fi2 D;
    public static final fi2 E;
    public static final fi2 F;
    public static final fi2 n;
    public static final fi2 o;
    public static final fi2 p;
    public static final fi2 q;
    public static final fi2 r;
    public static final fi2 s;
    public static final fi2 t;
    public static final fi2 u;
    public static final fi2 v;
    public static final fi2 w;
    public static final fi2 x;
    public static final fi2 y;
    public static final fi2 z;
    public final /* synthetic */ int m;

    static {
        int i = 2;
        n = new fi2(i, 0);
        o = new fi2(i, 1);
        p = new fi2(i, 2);
        q = new fi2(i, 3);
        r = new fi2(i, 4);
        s = new fi2(i, 5);
        t = new fi2(i, 6);
        u = new fi2(i, 7);
        v = new fi2(i, 8);
        w = new fi2(i, 9);
        x = new fi2(i, 10);
        y = new fi2(i, 11);
        z = new fi2(i, 12);
        A = new fi2(i, 13);
        B = new fi2(i, 14);
        C = new fi2(i, 15);
        D = new fi2(i, 16);
        E = new fi2(i, 17);
        F = new fi2(i, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi2(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        tt0 tt0Var;
        switch (this.m) {
            case 0:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 1:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 2:
                return (Unit) obj;
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 4:
                fb2 fb2Var = (fb2) obj;
                int i = ((fb2) obj2).a;
                return fb2Var;
            case 5:
                return (fk2) obj;
            case 6:
                return (String) obj;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 8:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 9:
                return (String) obj;
            case 10:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 11:
                r1 r1Var = (r1) obj;
                r1 r1Var2 = (r1) obj2;
                if (r1Var == null || (str = r1Var.a) == null) {
                    str = r1Var2.a;
                }
                if (r1Var == null || (tt0Var = r1Var.b) == null) {
                    tt0Var = r1Var2.b;
                }
                return new r1(str, tt0Var);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return obj == null ? obj2 : obj;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ai2 ai2Var = (ai2) obj2;
                Object valueOf = Float.valueOf(0.0f);
                sh2 sh2Var = ((ai2) obj).d;
                ji2 ji2Var = gi2.s;
                Object g = sh2Var.m.g(ji2Var);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = ai2Var.d.m.g(ji2Var);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return Integer.valueOf(((jj1) obj).e(((Number) obj2).intValue()));
            case 15:
                return Integer.valueOf(((jj1) obj).Y(((Number) obj2).intValue()));
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return Integer.valueOf(((jj1) obj).a0(((Number) obj2).intValue()));
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return Integer.valueOf(((jj1) obj).V(((Number) obj2).intValue()));
            default:
                dv2 dv2Var = (dv2) obj2;
                return qv.g(Float.valueOf(dv2Var.a.h()), Boolean.valueOf(((ww1) dv2Var.e.getValue()) == ww1.m));
        }
    }
}
