package defpackage;

import android.content.Context;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class le3 implements nd3, we0 {
    public final /* synthetic */ int m;
    public static final /* synthetic */ le3 n = new le3(0);
    public static final /* synthetic */ le3 o = new le3(1);
    public static final /* synthetic */ le3 p = new le3(2);
    public static final /* synthetic */ le3 q = new le3(3);
    public static final /* synthetic */ le3 r = new le3(4);
    public static final /* synthetic */ le3 s = new le3(5);
    public static final /* synthetic */ le3 t = new le3(6);
    public static final /* synthetic */ le3 u = new le3(7);
    public static final /* synthetic */ le3 v = new le3(8);
    public static final /* synthetic */ le3 w = new le3(9);
    public static final /* synthetic */ le3 x = new le3(10);
    public static final /* synthetic */ le3 y = new le3(11);
    public static final /* synthetic */ le3 z = new le3(12);
    public static final /* synthetic */ le3 A = new le3(13);
    public static final /* synthetic */ le3 B = new le3(14);
    public static final /* synthetic */ le3 C = new le3(15);
    public static final /* synthetic */ le3 D = new le3(16);
    public static final /* synthetic */ le3 E = new le3(17);
    public static final /* synthetic */ le3 F = new le3(18);
    public static final /* synthetic */ le3 G = new le3(19);
    public static final /* synthetic */ le3 H = new le3(20);
    public static final /* synthetic */ le3 I = new le3(21);
    public static final /* synthetic */ le3 J = new le3(22);
    public static final /* synthetic */ le3 K = new le3(23);
    public static final /* synthetic */ le3 L = new le3(24);
    public static final /* synthetic */ le3 M = new le3(25);
    public static final /* synthetic */ le3 N = new le3(26);
    public static final /* synthetic */ le3 O = new le3(27);
    public static final /* synthetic */ le3 P = new le3(28);

    public /* synthetic */ le3(int i) {
        this.m = i;
    }

    @Override // defpackage.we0
    public int a(Context context, String str) {
        return ye0.a(context, str);
    }

    @Override // defpackage.we0
    public int b(Context context, String str, boolean z2) {
        return ye0.d(context, str, z2);
    }

    @Override // defpackage.nd3
    public Object zza() {
        switch (this.m) {
            case 0:
                List list = ug3.a;
                jq3.n.get();
                Long l = (Long) mq3.y.b();
                l.getClass();
                return l;
            case 1:
                List list2 = ug3.a;
                jq3.n.get();
                Long l2 = (Long) mq3.V.b();
                l2.getClass();
                return l2;
            case 2:
                List list3 = ug3.a;
                jq3.n.get();
                Long l3 = (Long) mq3.F.b();
                l3.getClass();
                return l3;
            case 3:
                List list4 = ug3.a;
                jq3.n.get();
                Long l4 = (Long) mq3.g0.b();
                l4.getClass();
                return l4;
            case 4:
                List list5 = ug3.a;
                jq3.n.get();
                return (String) mq3.h.b();
            case 5:
                List list6 = ug3.a;
                jq3.n.get();
                Long l5 = (Long) mq3.t0.b();
                l5.getClass();
                return l5;
            case 6:
                List list7 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.s0.b()).longValue());
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = ug3.a;
                jq3.n.get();
                Long l6 = (Long) mq3.p0.b();
                l6.getClass();
                return l6;
            case 8:
                List list9 = ug3.a;
                jq3.n.get();
                Long l7 = (Long) mq3.m.b();
                l7.getClass();
                return l7;
            case 9:
                List list10 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.o.b()).longValue());
            case 10:
                List list11 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.t.b()).longValue());
            case 11:
                List list12 = ug3.a;
                jq3.n.get();
                Long l8 = (Long) mq3.G.b();
                l8.getClass();
                return l8;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                List list13 = ug3.a;
                jq3.n.get();
                Long l9 = (Long) mq3.H.b();
                l9.getClass();
                return l9;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                List list14 = ug3.a;
                tr3.n.get();
                Boolean bool = (Boolean) ur3.a.b();
                bool.getClass();
                return bool;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                List list15 = ug3.a;
                tr3.n.get();
                return (String) ur3.f.b();
            case 15:
                List list16 = ug3.a;
                jq3.n.get();
                return (String) mq3.g.b();
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                List list17 = ug3.a;
                tr3.n.get();
                Long l10 = (Long) ur3.e.b();
                l10.getClass();
                return l10;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                List list18 = ug3.a;
                tr3.n.get();
                Long l11 = (Long) ur3.b.b();
                l11.getClass();
                return l11;
            case 18:
                List list19 = ug3.a;
                tr3.n.get();
                return Integer.valueOf((int) ((Long) ur3.d.b()).longValue());
            case 19:
                List list20 = ug3.a;
                tr3.n.get();
                Double d = (Double) ur3.c.b();
                d.getClass();
                return d;
            case 20:
                List list21 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.s.b()).longValue());
            case 21:
                List list22 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.u.b()).longValue());
            case 22:
                List list23 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.q.b()).longValue());
            case 23:
                List list24 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.d.b()).longValue());
            case 24:
                List list25 = ug3.a;
                jq3.n.get();
                Long l12 = (Long) mq3.d0.b();
                l12.getClass();
                return l12;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                List list26 = ug3.a;
                jq3.n.get();
                Long l13 = (Long) mq3.e0.b();
                l13.getClass();
                return l13;
            case 26:
                List list27 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.j0.b()).longValue());
            case 27:
                List list28 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.x.b()).longValue());
            default:
                List list29 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.p.b()).longValue());
        }
    }
}
