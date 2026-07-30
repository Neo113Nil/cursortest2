package defpackage;

import android.content.Context;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class gg3 implements nd3, io3 {
    public final /* synthetic */ int m;
    public static final /* synthetic */ gg3 n = new gg3(0);
    public static final /* synthetic */ gg3 o = new gg3(1);
    public static final /* synthetic */ gg3 p = new gg3(2);
    public static final /* synthetic */ gg3 q = new gg3(3);
    public static final /* synthetic */ gg3 r = new gg3(4);
    public static final /* synthetic */ gg3 s = new gg3(5);
    public static final /* synthetic */ gg3 t = new gg3(6);
    public static final /* synthetic */ gg3 u = new gg3(7);
    public static final /* synthetic */ gg3 v = new gg3(8);
    public static final /* synthetic */ gg3 w = new gg3(9);
    public static final /* synthetic */ gg3 x = new gg3(10);
    public static final /* synthetic */ gg3 y = new gg3(11);
    public static final /* synthetic */ gg3 z = new gg3(12);
    public static final /* synthetic */ gg3 A = new gg3(13);
    public static final /* synthetic */ gg3 B = new gg3(14);
    public static final /* synthetic */ gg3 C = new gg3(15);
    public static final /* synthetic */ gg3 D = new gg3(16);

    public /* synthetic */ gg3(int i) {
        this.m = i;
    }

    public static final go3 b(Object obj, Object obj2) {
        go3 go3Var = (go3) obj;
        go3 go3Var2 = (go3) obj2;
        if (!go3Var2.isEmpty()) {
            if (!go3Var.m) {
                go3Var = go3Var.a();
            }
            go3Var.c();
            if (!go3Var2.isEmpty()) {
                go3Var.putAll(go3Var2);
            }
        }
        return go3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r5 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5 == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xe0 a(Context context, String str, we0 we0Var) {
        int b;
        int i = 0;
        switch (this.m) {
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                xe0 xe0Var = new xe0();
                int a = we0Var.a(context, str);
                xe0Var.a = a;
                if (a != 0) {
                    xe0Var.c = -1;
                } else {
                    int b2 = we0Var.b(context, str, true);
                    xe0Var.b = b2;
                    if (b2 != 0) {
                        xe0Var.c = 1;
                    }
                }
                return xe0Var;
            case 18:
                xe0 xe0Var2 = new xe0();
                xe0Var2.a = we0Var.a(context, str);
                int b3 = we0Var.b(context, str, true);
                xe0Var2.b = b3;
                int i2 = xe0Var2.a;
                if (i2 != 0) {
                    i = i2;
                }
                i = i >= b3 ? -1 : 1;
                xe0Var2.c = i;
                return xe0Var2;
            default:
                xe0 xe0Var3 = new xe0();
                int a2 = we0Var.a(context, str);
                xe0Var3.a = a2;
                if (a2 != 0) {
                    b = we0Var.b(context, str, false);
                    xe0Var3.b = b;
                } else {
                    b = we0Var.b(context, str, true);
                    xe0Var3.b = b;
                }
                int i3 = xe0Var3.a;
                if (i3 != 0) {
                    i = i3;
                }
                i = i >= b ? -1 : 1;
                xe0Var3.c = i;
                return xe0Var3;
        }
    }

    @Override // defpackage.io3
    public boolean h(Class cls) {
        return false;
    }

    @Override // defpackage.io3
    public wo3 p(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.nd3
    public Object zza() {
        switch (this.m) {
            case 0:
                List list = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.m0.b()).longValue());
            case 1:
                List list2 = ug3.a;
                vr3.n.get();
                Boolean bool = (Boolean) wr3.a.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = ug3.a;
                vr3.n.get();
                Boolean bool2 = (Boolean) wr3.h.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = ug3.a;
                vr3.n.get();
                Boolean bool3 = (Boolean) wr3.g.b();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = ug3.a;
                vr3.n.get();
                Boolean bool4 = (Boolean) wr3.b.b();
                bool4.getClass();
                return bool4;
            case 5:
                List list6 = ug3.a;
                vr3.n.get();
                Boolean bool5 = (Boolean) wr3.e.b();
                bool5.getClass();
                return bool5;
            case 6:
                List list7 = ug3.a;
                Boolean bool6 = (Boolean) wq3.b.b();
                bool6.getClass();
                return bool6;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = ug3.a;
                Boolean bool7 = (Boolean) wq3.a.b();
                bool7.getClass();
                return bool7;
            case 8:
                List list9 = ug3.a;
                Boolean bool8 = (Boolean) cq3.a.b();
                bool8.getClass();
                return bool8;
            case 9:
                List list10 = ug3.a;
                vr3.n.get();
                Boolean bool9 = (Boolean) wr3.d.b();
                bool9.getClass();
                return bool9;
            case 10:
                List list11 = ug3.a;
                Boolean bool10 = (Boolean) as3.a.b();
                bool10.getClass();
                return bool10;
            case 11:
                List list12 = ug3.a;
                jq3.n.get();
                return Integer.valueOf((int) ((Long) mq3.n0.b()).longValue());
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                List list13 = ug3.a;
                jq3.n.get();
                Long l = (Long) mq3.a.b();
                l.getClass();
                return l;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return new Boolean(((Boolean) or3.a.b()).booleanValue());
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return new Boolean(((Boolean) qr3.a.b()).booleanValue());
            case 15:
                return new Boolean(((Boolean) yr3.a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) is3.a.b()).booleanValue());
        }
    }
}
