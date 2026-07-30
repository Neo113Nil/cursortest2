package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n13 {
    public static final bp2 a = new bp2(m13.n);

    public static final pw2 a(int i, a00 a00Var) {
        l13 l13Var = (l13) a00Var.j(a);
        switch (q40.u(i)) {
            case 0:
                return l13Var.j;
            case 1:
                return l13Var.k;
            case 2:
                return l13Var.l;
            case 3:
                return l13Var.a;
            case 4:
                return l13Var.b;
            case 5:
                return l13Var.c;
            case 6:
                return l13Var.d;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return l13Var.e;
            case 8:
                return l13Var.f;
            case 9:
                return l13Var.m;
            case 10:
                return l13Var.n;
            case 11:
                return l13Var.o;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return l13Var.g;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return l13Var.h;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return l13Var.i;
            default:
                a.b();
                return null;
        }
    }
}
