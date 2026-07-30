package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fo3 {
    public final tt1 a;

    public fo3(yp3 yp3Var, yp3 yp3Var2) {
        this.a = new tt1(26, yp3Var, yp3Var2);
    }

    public static void a(lm3 lm3Var, tt1 tt1Var, Object obj, Object obj2) {
        wm3.b(lm3Var, (yp3) tt1Var.n, 1, obj);
        wm3.b(lm3Var, (yp3) tt1Var.o, 2, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(tt1 tt1Var, Object obj, Object obj2) {
        int a;
        int c;
        int r;
        int c2;
        int r2;
        yp3 yp3Var = (yp3) tt1Var.n;
        yp3 yp3Var2 = (yp3) tt1Var.o;
        int i = wm3.c;
        int i2 = 8;
        int r3 = lm3.r(8);
        yp3 yp3Var3 = yp3.p;
        if (yp3Var == yp3Var3) {
            Charset charset = sn3.a;
            r3 += r3;
        }
        aq3 aq3Var = aq3.m;
        switch (yp3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                a = 8;
                int i3 = a + r3;
                int r4 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                    Charset charset2 = sn3.a;
                    r4 += r4;
                }
                switch (yp3Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return i2 + r4 + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + r4 + i3;
                    case 2:
                        i2 = lm3.a(((Long) obj2).longValue());
                        return i2 + r4 + i3;
                    case 3:
                        i2 = lm3.a(((Long) obj2).longValue());
                        return i2 + r4 + i3;
                    case 4:
                        i2 = lm3.a(((Integer) obj2).intValue());
                        return i2 + r4 + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        return i2 + r4 + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + r4 + i3;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        i2 = 1;
                        return i2 + r4 + i3;
                    case 8:
                        if (!(obj2 instanceof im3)) {
                            i2 = lm3.b((String) obj2);
                            return i2 + r4 + i3;
                        }
                        c2 = ((im3) obj2).c();
                        r2 = lm3.r(c2);
                        i2 = r2 + c2;
                        return i2 + r4 + i3;
                    case 9:
                        i2 = ((in3) ((zl3) obj2)).k();
                        return i2 + r4 + i3;
                    case 10:
                        c2 = ((in3) ((zl3) obj2)).k();
                        r2 = lm3.r(c2);
                        i2 = r2 + c2;
                        return i2 + r4 + i3;
                    case 11:
                        if (obj2 instanceof im3) {
                            c2 = ((im3) obj2).c();
                            r2 = lm3.r(c2);
                        } else {
                            c2 = ((byte[]) obj2).length;
                            r2 = lm3.r(c2);
                        }
                        i2 = r2 + c2;
                        return i2 + r4 + i3;
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                        i2 = lm3.r(((Integer) obj2).intValue());
                        return i2 + r4 + i3;
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        i2 = obj2 instanceof mn3 ? lm3.a(((mn3) obj2).zza()) : lm3.a(((Integer) obj2).intValue());
                        return i2 + r4 + i3;
                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + r4 + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        return i2 + r4 + i3;
                    case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = lm3.r((intValue >> 31) ^ (intValue + intValue));
                        return i2 + r4 + i3;
                    case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                        long longValue = ((Long) obj2).longValue();
                        i2 = lm3.a((longValue >> 63) ^ (longValue + longValue));
                        return i2 + r4 + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                a = 4;
                int i32 = a + r3;
                int r42 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 2:
                a = lm3.a(((Long) obj).longValue());
                int i322 = a + r3;
                int r422 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 3:
                a = lm3.a(((Long) obj).longValue());
                int i3222 = a + r3;
                int r4222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 4:
                a = lm3.a(((Integer) obj).intValue());
                int i32222 = a + r3;
                int r42222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                a = 8;
                int i322222 = a + r3;
                int r422222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                a = 4;
                int i3222222 = a + r3;
                int r4222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                a = 1;
                int i32222222 = a + r3;
                int r42222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 8:
                if (obj instanceof im3) {
                    c = ((im3) obj).c();
                    r = lm3.r(c);
                    a = c + r;
                    int i322222222 = a + r3;
                    int r422222222 = lm3.r(16);
                    if (yp3Var2 == yp3Var3) {
                    }
                    switch (yp3Var2.ordinal()) {
                    }
                } else {
                    a = lm3.b((String) obj);
                    int i3222222222 = a + r3;
                    int r4222222222 = lm3.r(16);
                    if (yp3Var2 == yp3Var3) {
                    }
                    switch (yp3Var2.ordinal()) {
                    }
                }
            case 9:
                a = ((in3) ((zl3) obj)).k();
                int i32222222222 = a + r3;
                int r42222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 10:
                c = ((in3) ((zl3) obj)).k();
                r = lm3.r(c);
                a = c + r;
                int i322222222222 = a + r3;
                int r422222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 11:
                if (obj instanceof im3) {
                    c = ((im3) obj).c();
                    r = lm3.r(c);
                } else {
                    c = ((byte[]) obj).length;
                    r = lm3.r(c);
                }
                a = c + r;
                int i3222222222222 = a + r3;
                int r4222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                a = lm3.r(((Integer) obj).intValue());
                int i32222222222222 = a + r3;
                int r42222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                a = obj instanceof mn3 ? lm3.a(((mn3) obj).zza()) : lm3.a(((Integer) obj).intValue());
                int i322222222222222 = a + r3;
                int r422222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ((Integer) obj).getClass();
                a = 4;
                int i3222222222222222 = a + r3;
                int r4222222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                a = 8;
                int i32222222222222222 = a + r3;
                int r42222222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                int intValue2 = ((Integer) obj).intValue();
                a = lm3.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i322222222222222222 = a + r3;
                int r422222222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                long longValue2 = ((Long) obj).longValue();
                a = lm3.a((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i3222222222222222222 = a + r3;
                int r4222222222222222222 = lm3.r(16);
                if (yp3Var2 == yp3Var3) {
                }
                switch (yp3Var2.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
