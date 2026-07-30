package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Layout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.e;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.messaging.ServiceStarter;
import com.majelw.libystne.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class s03 {
    public static final vh a = new vh(0);
    public static final vh b = new vh(1);
    public static final my c = new my(1398372097, new ww(10), false);
    public static final my d = new my(1161754272, new ww(11), false);
    public static final u30 e = new u30(9);
    public static final int[][] f = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, ServiceStarter.ERROR_UNKNOWN, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, ModuleDescriptor.MODULE_VERSION, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, FacebookRequestErrorClassification.EC_INVALID_SESSION, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, ModuleDescriptor.MODULE_VERSION, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};
    public static final w72 g = new w72(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Object h = new Object();
    public static boolean i = false;
    public static int j = 0;
    public static x01 k = null;
    public static boolean l = false;
    public static Method m = null;
    public static boolean n = false;
    public static Field o;

    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B(int i2, Object obj) {
        if (obj instanceof tt0) {
            if ((obj instanceof fu0 ? ((fu0) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof xt0 ? 3 : obj instanceof yt0 ? 4 : obj instanceof zt0 ? 5 : obj instanceof au0 ? 6 : obj instanceof bu0 ? 7 : obj instanceof cu0 ? 8 : obj instanceof du0 ? 9 : obj instanceof jt0 ? 10 : obj instanceof kt0 ? 11 : obj instanceof mt0 ? 13 : obj instanceof nt0 ? 14 : obj instanceof ot0 ? 15 : obj instanceof pt0 ? 16 : obj instanceof qt0 ? 17 : obj instanceof rt0 ? 18 : obj instanceof st0 ? 19 : obj instanceof ut0 ? 20 : obj instanceof vt0 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean C(ai2 ai2Var) {
        ks1 d2 = ai2Var.d();
        tn1 tn1Var = ai2Var.d.m;
        return (d2 != null ? d2.Y0() : false) || tn1Var.c(gi2.p) || tn1Var.c(gi2.o);
    }

    public static final boolean D(ai2 ai2Var) {
        if (!C(ai2Var)) {
            sh2 sh2Var = ai2Var.d;
            if (sh2Var.o) {
                return true;
            }
            tn1 tn1Var = sh2Var.m;
            Object[] objArr = tn1Var.b;
            Object[] objArr2 = tn1Var.c;
            long[] jArr = tn1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((ji2) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static long E(int i2, String str) {
        int h2 = h(0, i2, str, false);
        Matcher matcher = v30.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (h2 < i2) {
            int h3 = h(h2 + 1, i2, str, true);
            matcher.region(h2, h3);
            if (i4 == -1 && matcher.usePattern(v30.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(v30.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = v30.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = up2.w(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(v30.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            h2 = h(h3 + 1, i2, str, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            lh.e("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            lh.e("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            lh.e("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            lh.e("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            lh.e("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            lh.e("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(n33.d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final String F(String str, String str2, nh nhVar) {
        str.getClass();
        str2.getClass();
        nhVar.getClass();
        return nhVar == nh.m ? str : str2;
    }

    public static final jf2 G(a00 a00Var) {
        int i2 = 0;
        Object[] objArr = new Object[0];
        tt1 tt1Var = jf2.i;
        boolean d2 = a00Var.d(0);
        Object M = a00Var.M();
        if (d2 || M == sz.a) {
            M = new m13(i2, 4);
            a00Var.i0(M);
        }
        return (jf2) ll3.Q(objArr, tt1Var, (Function0) M, a00Var, 0, 4);
    }

    public static final ks1 H(o90 o90Var, int i2) {
        ks1 ks1Var = ((ul1) o90Var).m.t;
        ks1Var.getClass();
        if (ks1Var.Q0() != o90Var || !ls1.g(i2)) {
            return ks1Var;
        }
        ks1 ks1Var2 = ks1Var.B;
        ks1Var2.getClass();
        return ks1Var2;
    }

    public static final ks1 I(o90 o90Var) {
        if (!((ul1) o90Var).m.z) {
            h21.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        ks1 H = H(o90Var, 2);
        if (!H.Q0().z) {
            h21.b("LayoutCoordinates is not attached.");
        }
        return H;
    }

    public static final i91 J(o90 o90Var) {
        ks1 ks1Var = ((ul1) o90Var).m.t;
        if (ks1Var != null) {
            return ks1Var.A;
        }
        throw q40.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final rx1 K(o90 o90Var) {
        rx1 rx1Var = J(o90Var).y;
        if (rx1Var != null) {
            return rx1Var;
        }
        throw q40.f("This node does not have an owner.");
    }

    public static final void L(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void M(rw1 rw1Var, int i2, Object obj) {
        rw1Var.w[(rw1Var.x - rw1Var.s[rw1Var.t - 1].b) + i2] = obj;
    }

    public static final void N(rw1 rw1Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = rw1Var.x - rw1Var.s[rw1Var.t - 1].b;
        Object[] objArr = rw1Var.w;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static void O(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.e(classCastException, s03.class.getName());
        throw classCastException;
    }

    public static final void P(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j62, rp3] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList Q(vl2 vl2Var, int i2, Integer num) {
        ?? j62Var = new j62(vl2Var);
        int q = vl2Var.q(i2);
        m6 a2 = vl2Var.a(i2);
        while (i2 >= 0) {
            j62Var.l(vl2Var.a.f(i2), num);
            if (q >= 0) {
                m6 m6Var = a2;
                a2 = vl2Var.a(q);
                i2 = q;
                q = vl2Var.q(q);
                num = m6Var;
            } else {
                i2 = q;
                num = a2;
            }
        }
        return (ArrayList) j62Var.m;
    }

    public static final int R(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static final long S(long j2, long j3) {
        int c2;
        int e2 = jw2.e(j2);
        int d2 = jw2.d(j2);
        if ((jw2.e(j3) < jw2.d(j2)) && (jw2.e(j2) < jw2.d(j3))) {
            if ((jw2.e(j3) <= jw2.e(j2)) && (jw2.d(j2) <= jw2.d(j3))) {
                e2 = jw2.e(j3);
                d2 = e2;
            } else {
                if ((jw2.e(j2) <= jw2.e(j3)) && (jw2.d(j3) <= jw2.d(j2))) {
                    c2 = jw2.c(j3);
                } else {
                    int e3 = jw2.e(j3);
                    if (e2 >= jw2.d(j3) || e3 > e2) {
                        d2 = jw2.e(j3);
                    } else {
                        e2 = jw2.e(j3);
                        c2 = jw2.c(j3);
                    }
                }
                d2 -= c2;
            }
        } else if (d2 > jw2.e(j3)) {
            e2 -= jw2.c(j3);
            c2 = jw2.c(j3);
            d2 -= c2;
        }
        return th2.a(e2, d2);
    }

    public static vl1 T(vl1 vl1Var, jf2 jf2Var) {
        return bd3.n(vl1Var, new e(jf2Var, true));
    }

    public static final Object U(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, o30 o30Var) {
        Object invoke;
        Object c2 = zw2.c(coroutineContext, obj2);
        try {
            go2 go2Var = new go2(o30Var, coroutineContext);
            if (function2 == null) {
                invoke = q41.c(function2, obj, go2Var);
            } else {
                f(2, function2);
                invoke = function2.invoke(obj, go2Var);
            }
            zw2.a(coroutineContext, c2);
            if (invoke == b50.m) {
                o30Var.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            zw2.a(coroutineContext, c2);
            throw th;
        }
    }

    public static final long a(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void b(eo1 eo1Var, ul1 ul1Var) {
        eo1 y = J(ul1Var).y();
        int i2 = y.o - 1;
        Object[] objArr = y.m;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                eo1Var.b(((i91) objArr[i2]).P.f);
                i2--;
            }
        }
    }

    public static final ul1 c(eo1 eo1Var) {
        int i2;
        if (eo1Var == null || (i2 = eo1Var.o) == 0) {
            return null;
        }
        return (ul1) eo1Var.l(i2 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a91 d(ul1 ul1Var) {
        if ((ul1Var.o & 2) != 0) {
            if (ul1Var instanceof a91) {
                return (a91) ul1Var;
            }
            if (ul1Var instanceof p90) {
                ul1 ul1Var2 = ((p90) ul1Var).B;
                while (ul1Var2 != 0) {
                    if (ul1Var2 instanceof a91) {
                        return (a91) ul1Var2;
                    }
                    ul1Var2 = (!(ul1Var2 instanceof p90) || (ul1Var2.o & 2) == 0) ? ul1Var2.r : ((p90) ul1Var2).B;
                }
            }
        }
        return null;
    }

    public static Map e(Object obj) {
        if ((obj instanceof k71) && !(obj instanceof n71)) {
            O(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            Intrinsics.e(e2, s03.class.getName());
            throw e2;
        }
    }

    public static void f(int i2, Object obj) {
        if (obj == null || B(i2, obj)) {
            return;
        }
        O(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j62, rp3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m6] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List g(zl2 zl2Var, Integer num, int i2, Integer num2) {
        int i3;
        jn1 jn1Var;
        if (zl2Var.w || zl2Var.p() == 0) {
            return ah0.m;
        }
        ?? j62Var = new j62(zl2Var);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = zl2Var.v;
            if (i3 < 0) {
                i3 = zl2Var.D(zl2Var.b, i2);
            }
        }
        if (num == 0) {
            int M = zl2Var.i - zl2Var.M(zl2Var.b, zl2Var.r(i2));
            zm1 zm1Var = zl2Var.s;
            num = Integer.valueOf(M + ((zm1Var == null || (jn1Var = (jn1) zm1Var.b(i2)) == null) ? 0 : jn1Var.b));
        }
        while (i2 >= 0) {
            j62Var.l(zl2Var.N(i2), num);
            num = zl2Var.b(i2);
            if (i3 >= 0) {
                int i4 = i3;
                i3 = zl2Var.D(zl2Var.b, i3);
                i2 = i4;
            } else {
                i2 = i3;
            }
        }
        return (ArrayList) j62Var.m;
    }

    public static int h(int i2, int i3, String str, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = e53.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = d53.d;
            d53 d53Var = (d53) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (d53Var == null) {
                d53Var = new d53();
                d53Var.a = null;
                d53Var.b = null;
                d53Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, d53Var);
            }
            WeakReference weakReference2 = d53Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                d53Var.c = new WeakReference(keyEvent);
                if (d53Var.b == null) {
                    d53Var.b = new SparseArray();
                }
                SparseArray sparseArray = d53Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    b71.o();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(y71 y71Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (y71Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return y71Var.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!l) {
                            try {
                                m = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            l = true;
                        }
                        Method method = m;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (e53.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!n) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        o = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    n = true;
                }
                Field field = o;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (e53.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && e53.c(view, keyEvent)) || y71Var.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r2.d(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(ym0 ym0Var, gt gtVar, boolean z, o30 o30Var) {
        an0 an0Var;
        int i2;
        iq it;
        iq iqVar;
        ym0 ym0Var2;
        Object b2;
        try {
            if (o30Var instanceof an0) {
                an0Var = (an0) o30Var;
                int i3 = an0Var.r;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    an0Var.r = i3 - Integer.MIN_VALUE;
                    Object obj = an0Var.q;
                    b50 b50Var = b50.m;
                    i2 = an0Var.r;
                    CancellationException cancellationException = null;
                    if (i2 != 0) {
                        ca2.b(obj);
                        if (ym0Var instanceof kx2) {
                            throw ((kx2) ym0Var).m;
                        }
                        it = gtVar.iterator();
                        an0Var.m = ym0Var;
                        an0Var.n = gtVar;
                        an0Var.o = it;
                        an0Var.p = z;
                        an0Var.r = 1;
                        b2 = it.b(an0Var);
                        if (b2 != b50Var) {
                        }
                    } else if (i2 == 1) {
                        z = an0Var.p;
                        iqVar = an0Var.o;
                        gtVar = an0Var.n;
                        ym0Var2 = an0Var.m;
                        ca2.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = an0Var.p;
                        iqVar = an0Var.o;
                        gtVar = an0Var.n;
                        ym0Var2 = an0Var.m;
                        ca2.b(obj);
                        it = iqVar;
                        ym0Var = ym0Var2;
                        an0Var.m = ym0Var;
                        an0Var.n = gtVar;
                        an0Var.o = it;
                        an0Var.p = z;
                        an0Var.r = 1;
                        b2 = it.b(an0Var);
                        if (b2 != b50Var) {
                            return b50Var;
                        }
                        ym0Var2 = ym0Var;
                        iqVar = it;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                gtVar.f(null);
                            }
                            return Unit.a;
                        }
                        Object c2 = iqVar.c();
                        an0Var.m = ym0Var2;
                        an0Var.n = gtVar;
                        an0Var.o = iqVar;
                        an0Var.p = z;
                        an0Var.r = 2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        an0Var = new an0(o30Var);
        Object obj2 = an0Var.q;
        b50 b50Var2 = b50.m;
        i2 = an0Var.r;
        CancellationException cancellationException2 = null;
    }

    public static final void l(nc2 nc2Var, String str) {
        nc2Var.getClass();
        uc2 M = nc2Var.M(str);
        try {
            M.E();
            yk3.w(M, null);
        } finally {
        }
    }

    public static final int m(int i2, List list) {
        int i3;
        int i4 = ((az1) zv.B(list)).c;
        if (i2 > ((az1) zv.B(list)).c) {
            i21.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            az1 az1Var = (az1) list.get(i3);
            char c2 = az1Var.b > i2 ? (char) 1 : az1Var.c <= i2 ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder n2 = in1.n(i3, "Found paragraph index ", " should be in range [0, ");
        n2.append(list.size());
        n2.append(").\nDebug info: index=");
        n2.append(i2);
        n2.append(", paragraphs=[");
        n2.append(ze1.a(list, null, new zd(20), 31));
        n2.append(']');
        i21.a(n2.toString());
        return i3;
    }

    public static final int n(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            az1 az1Var = (az1) arrayList.get(i4);
            char c2 = az1Var.d > i2 ? (char) 1 : az1Var.e <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int o(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((az1) zv.B(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            az1 az1Var = (az1) arrayList.get(i3);
            char c2 = az1Var.f > f2 ? (char) 1 : az1Var.g <= f2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void p(ArrayList arrayList, long j2, Function1 function1) {
        int size = arrayList.size();
        for (int m2 = m(jw2.e(j2), arrayList); m2 < size; m2++) {
            az1 az1Var = (az1) arrayList.get(m2);
            if (az1Var.b >= jw2.d(j2)) {
                return;
            }
            if (az1Var.b != az1Var.c) {
                function1.invoke(az1Var);
            }
        }
    }

    public static final Integer q(vl2 vl2Var, d00 d00Var, int i2, int i3) {
        Integer q;
        int[] iArr = vl2Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (vl2Var.j(i2) && vl2Var.i(i2) == 206 && Intrinsics.b(vl2Var.p(iArr, i2), b00.e)) {
                Object h2 = vl2Var.h(i2, 0);
                wz wzVar = h2 instanceof wz ? (wz) h2 : null;
                if (wzVar != null && wzVar.m == d00Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (vl2Var.d(i2) && (q = q(vl2Var, d00Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(q.intValue());
            }
            i2 = i4;
        }
    }

    public static final zm1 r(ei2 ei2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            ai2 a2 = ei2Var.a();
            i91 i91Var = a2.c;
            if (i91Var.J() && i91Var.I()) {
                zm1 zm1Var = new zm1(48);
                at0 at0Var = new at0(20);
                u31 U = ll3.U(a2.g());
                ((Region) at0Var.m).set(U.a, U.b, U.c, U.d);
                s(at0Var, a2, zm1Var, a2, new at0(20));
                return zm1Var;
            }
            zm1 zm1Var2 = r31.a;
            zm1Var2.getClass();
            return zm1Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void s(at0 at0Var, ai2 ai2Var, zm1 zm1Var, ai2 ai2Var2, at0 at0Var2) {
        w72 m1;
        i91 i91Var;
        int i2 = ai2Var.g;
        Region region = (Region) at0Var2.m;
        i91 i91Var2 = ai2Var2.c;
        int i3 = ai2Var2.g;
        boolean z = (i91Var2.J() && i91Var2.I()) ? false : true;
        Region region2 = (Region) at0Var.m;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || ai2Var2.e) {
                o90 f2 = ai2Var2.f();
                if (f2 == null) {
                    m1 = i91Var2.P.c.m1();
                } else {
                    ul1 ul1Var = ((ul1) f2).m;
                    Object g2 = ai2Var2.d.m.g(rh2.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    boolean z2 = g2 != null;
                    if (!ul1Var.m.z) {
                        m1 = w72.e;
                    } else if (z2) {
                        m1 = H(ul1Var, 8).m1();
                    } else {
                        ks1 H = H(ul1Var, 8);
                        m1 = yk3.D(H).M(H, true);
                    }
                }
                u31 U = ll3.U(m1);
                region.set(U.a, U.b, U.c, U.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (ai2Var2.e) {
                        ai2 l2 = ai2Var2.l();
                        zm1Var.h(i3, new di2(ai2Var2, ll3.U((l2 == null || (i91Var = l2.c) == null || !i91Var.J()) ? g : l2.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            zm1Var.h(i3, new di2(ai2Var2, new u31(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                zm1Var.h(i3, new di2(ai2Var2, new u31(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j2 = ai2.j(4, ai2Var2);
                for (int size = j2.size() - 1; -1 < size; size--) {
                    if (!((ai2) j2.get(size)).k().m.c(gi2.z)) {
                        s(at0Var, ai2Var, zm1Var, (ai2) j2.get(size), at0Var2);
                    }
                }
                if (D(ai2Var2)) {
                    region2.op(U.a, U.b, U.c, U.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static sf1 t() {
        mh mhVar = t12.a;
        mhVar.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((dq2) mhVar.p)) {
            try {
                sf1 sf1Var = (sf1) mhVar.o;
                if (sf1Var != null && localeList == ((LocaleList) mhVar.n)) {
                    return sf1Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new rf1(localeList.get(i2)));
                }
                sf1 sf1Var2 = new sf1(arrayList);
                mhVar.n = localeList;
                mhVar.o = sf1Var2;
                return sf1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final float u(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        wt2 wt2Var = ew2.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : y11.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float v(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        wt2 wt2Var = ew2.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? y11.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static zs0 y(at0 at0Var, SQLiteDatabase sQLiteDatabase) {
        at0Var.getClass();
        sQLiteDatabase.getClass();
        zs0 zs0Var = (zs0) at0Var.m;
        if (zs0Var != null && Intrinsics.b(zs0Var.m, sQLiteDatabase)) {
            return zs0Var;
        }
        zs0 zs0Var2 = new zs0(sQLiteDatabase);
        at0Var.m = zs0Var2;
        return zs0Var2;
    }

    public static vl1 z(vl1 vl1Var, jf2 jf2Var) {
        return bd3.n(vl1Var, new e(jf2Var, false));
    }

    public abstract yf w();

    public Object x(int i2) {
        Object invoke;
        g41 f2 = w().f(i2);
        int i3 = i2 - f2.a;
        Function1 key = f2.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i3))) == null) ? new k80(i2) : invoke;
    }
}
