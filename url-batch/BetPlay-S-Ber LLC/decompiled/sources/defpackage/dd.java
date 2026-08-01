package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dd {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(t7 t7Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = t7Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = ey.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && t7Var.isInEditMode() && (t7Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) t7Var.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.r.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static yc d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        yc ycVar = new yc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? gy.c : gy.a);
        String[] strArr = l70.e;
        bd bdVar = ycVar.b;
        cd cdVar = ycVar.e;
        ad adVar = ycVar.c;
        zc zcVar = ycVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            xc xcVar = new xc();
            xcVar.a = new int[10];
            xcVar.b = new int[10];
            xcVar.c = 0;
            xcVar.d = new int[10];
            xcVar.e = new float[10];
            xcVar.f = 0;
            xcVar.g = new int[5];
            xcVar.h = new String[5];
            xcVar.i = 0;
            xcVar.j = new int[4];
            xcVar.k = new boolean[4];
            xcVar.l = 0;
            adVar.getClass();
            zcVar.getClass();
            cdVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        xcVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                        i2 = indexCount;
                        xcVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                        i2 = indexCount;
                        xcVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, zcVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        xcVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, zcVar.D));
                        break;
                    case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                        i2 = indexCount;
                        xcVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        xcVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        xcVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        xcVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        xcVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        xcVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        xcVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        xcVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, zcVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        xcVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, zcVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        xcVar.a(19, obtainStyledAttributes.getFloat(index, zcVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        xcVar.a(20, obtainStyledAttributes.getFloat(index, zcVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        xcVar.b(21, obtainStyledAttributes.getLayoutDimension(index, zcVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        xcVar.b(22, iArr[obtainStyledAttributes.getInt(index, bdVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        xcVar.b(23, obtainStyledAttributes.getLayoutDimension(index, zcVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        xcVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        xcVar.b(27, obtainStyledAttributes.getInt(index, zcVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        xcVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        xcVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        xcVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        xcVar.a(37, obtainStyledAttributes.getFloat(index, zcVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, ycVar.a);
                        ycVar.a = resourceId;
                        xcVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        xcVar.a(39, obtainStyledAttributes.getFloat(index, zcVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        xcVar.a(40, obtainStyledAttributes.getFloat(index, zcVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        xcVar.b(41, obtainStyledAttributes.getInt(index, zcVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        xcVar.b(42, obtainStyledAttributes.getInt(index, zcVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        xcVar.a(43, obtainStyledAttributes.getFloat(index, bdVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        xcVar.c(44, true);
                        xcVar.a(44, obtainStyledAttributes.getDimension(index, cdVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        xcVar.a(45, obtainStyledAttributes.getFloat(index, cdVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        xcVar.a(46, obtainStyledAttributes.getFloat(index, cdVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        xcVar.a(47, obtainStyledAttributes.getFloat(index, cdVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        xcVar.a(48, obtainStyledAttributes.getFloat(index, cdVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        xcVar.a(49, obtainStyledAttributes.getDimension(index, cdVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        xcVar.a(50, obtainStyledAttributes.getDimension(index, cdVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        xcVar.a(51, obtainStyledAttributes.getDimension(index, cdVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        xcVar.a(52, obtainStyledAttributes.getDimension(index, cdVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        xcVar.a(53, obtainStyledAttributes.getDimension(index, cdVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        xcVar.b(54, obtainStyledAttributes.getInt(index, zcVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        xcVar.b(55, obtainStyledAttributes.getInt(index, zcVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        xcVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        xcVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        xcVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        xcVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        xcVar.a(60, obtainStyledAttributes.getFloat(index, cdVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        xcVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        xcVar.a(63, obtainStyledAttributes.getFloat(index, zcVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        xcVar.b(64, f(obtainStyledAttributes, index, adVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            xcVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            xcVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        xcVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        xcVar.a(67, obtainStyledAttributes.getFloat(index, adVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        xcVar.a(68, obtainStyledAttributes.getFloat(index, bdVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        xcVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        xcVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        xcVar.b(72, obtainStyledAttributes.getInt(index, zcVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        xcVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        xcVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        xcVar.c(75, obtainStyledAttributes.getBoolean(index, zcVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        xcVar.b(76, obtainStyledAttributes.getInt(index, adVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        xcVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        xcVar.b(78, obtainStyledAttributes.getInt(index, bdVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        xcVar.a(79, obtainStyledAttributes.getFloat(index, adVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        xcVar.c(80, obtainStyledAttributes.getBoolean(index, zcVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        xcVar.c(81, obtainStyledAttributes.getBoolean(index, zcVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        xcVar.b(82, obtainStyledAttributes.getInteger(index, adVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        xcVar.b(83, f(obtainStyledAttributes, index, cdVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        xcVar.b(84, obtainStyledAttributes.getInteger(index, adVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        xcVar.a(85, obtainStyledAttributes.getFloat(index, adVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            adVar.i = resourceId2;
                            xcVar.b(89, resourceId2);
                            if (adVar.i != -1) {
                                xcVar.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            adVar.h = string;
                            xcVar.d(string, 90);
                            if (adVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                adVar.i = resourceId3;
                                xcVar.b(89, resourceId3);
                                xcVar.b(88, -2);
                                break;
                            } else {
                                xcVar.b(88, -1);
                                break;
                            }
                        } else {
                            xcVar.b(88, obtainStyledAttributes.getInteger(index, adVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        xcVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        xcVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, zcVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(xcVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(xcVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        xcVar.b(97, obtainStyledAttributes.getInt(index, zcVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = av.v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ycVar.a = obtainStyledAttributes.getResourceId(index, ycVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        xcVar.c(99, obtainStyledAttributes.getBoolean(index, zcVar.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        adVar.getClass();
                        zcVar.getClass();
                        cdVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        zcVar.p = f(obtainStyledAttributes, index2, zcVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        zcVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        zcVar.o = f(obtainStyledAttributes, index2, zcVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        zcVar.n = f(obtainStyledAttributes, index2, zcVar.n);
                        continue;
                    case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                        i = indexCount2;
                        zcVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                        i = indexCount2;
                        zcVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, zcVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        zcVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, zcVar.D);
                        continue;
                    case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                        i = indexCount2;
                        zcVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        zcVar.v = f(obtainStyledAttributes, index2, zcVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        zcVar.u = f(obtainStyledAttributes, index2, zcVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        zcVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        zcVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        zcVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        zcVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        zcVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        zcVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        zcVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, zcVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        zcVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, zcVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        zcVar.f = obtainStyledAttributes.getFloat(index2, zcVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        zcVar.w = obtainStyledAttributes.getFloat(index2, zcVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        zcVar.c = obtainStyledAttributes.getLayoutDimension(index2, zcVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, bdVar.a);
                        bdVar.a = i8;
                        bdVar.a = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        zcVar.b = obtainStyledAttributes.getLayoutDimension(index2, zcVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        zcVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        zcVar.h = f(obtainStyledAttributes, index2, zcVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        zcVar.i = f(obtainStyledAttributes, index2, zcVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        zcVar.E = obtainStyledAttributes.getInt(index2, zcVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        zcVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        zcVar.j = f(obtainStyledAttributes, index2, zcVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        zcVar.k = f(obtainStyledAttributes, index2, zcVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        zcVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        zcVar.s = f(obtainStyledAttributes, index2, zcVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        zcVar.t = f(obtainStyledAttributes, index2, zcVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        zcVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        zcVar.m = f(obtainStyledAttributes, index2, zcVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        zcVar.l = f(obtainStyledAttributes, index2, zcVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        zcVar.x = obtainStyledAttributes.getFloat(index2, zcVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        ycVar.a = obtainStyledAttributes.getResourceId(index2, ycVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        zcVar.U = obtainStyledAttributes.getFloat(index2, zcVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        zcVar.T = obtainStyledAttributes.getFloat(index2, zcVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        zcVar.V = obtainStyledAttributes.getInt(index2, zcVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        zcVar.W = obtainStyledAttributes.getInt(index2, zcVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        bdVar.c = obtainStyledAttributes.getFloat(index2, bdVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        cdVar.l = true;
                        cdVar.m = obtainStyledAttributes.getDimension(index2, cdVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        cdVar.b = obtainStyledAttributes.getFloat(index2, cdVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        cdVar.c = obtainStyledAttributes.getFloat(index2, cdVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        cdVar.d = obtainStyledAttributes.getFloat(index2, cdVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        cdVar.e = obtainStyledAttributes.getFloat(index2, cdVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        cdVar.f = obtainStyledAttributes.getDimension(index2, cdVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        cdVar.g = obtainStyledAttributes.getDimension(index2, cdVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        cdVar.i = obtainStyledAttributes.getDimension(index2, cdVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        cdVar.j = obtainStyledAttributes.getDimension(index2, cdVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        cdVar.k = obtainStyledAttributes.getDimension(index2, cdVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        zcVar.X = obtainStyledAttributes.getInt(index2, zcVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        zcVar.Y = obtainStyledAttributes.getInt(index2, zcVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        zcVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        zcVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        zcVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        zcVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        cdVar.a = obtainStyledAttributes.getFloat(index2, cdVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        zcVar.z = f(obtainStyledAttributes, index2, zcVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        zcVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        zcVar.B = obtainStyledAttributes.getFloat(index2, zcVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        adVar.a = f(obtainStyledAttributes, index2, adVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            adVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            adVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        adVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        adVar.e = obtainStyledAttributes.getFloat(index2, adVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        bdVar.d = obtainStyledAttributes.getFloat(index2, bdVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        zcVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        zcVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        zcVar.f0 = obtainStyledAttributes.getInt(index2, zcVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        zcVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        zcVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        zcVar.n0 = obtainStyledAttributes.getBoolean(index2, zcVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        adVar.c = obtainStyledAttributes.getInt(index2, adVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        zcVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        bdVar.b = obtainStyledAttributes.getInt(index2, bdVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        adVar.d = obtainStyledAttributes.getFloat(index2, adVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        zcVar.l0 = obtainStyledAttributes.getBoolean(index2, zcVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        zcVar.m0 = obtainStyledAttributes.getBoolean(index2, zcVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        adVar.b = obtainStyledAttributes.getInteger(index2, adVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        cdVar.h = f(obtainStyledAttributes, index2, cdVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        adVar.g = obtainStyledAttributes.getInteger(index2, adVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        adVar.f = obtainStyledAttributes.getFloat(index2, adVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            adVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            adVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                adVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, adVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        zcVar.q = f(obtainStyledAttributes, index2, zcVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        zcVar.r = f(obtainStyledAttributes, index2, zcVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        zcVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        zcVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, zcVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(zcVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(zcVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        zcVar.o0 = obtainStyledAttributes.getInt(index2, zcVar.o0);
                        break;
                }
                i7++;
            }
            if (zcVar.j0 != null) {
                zcVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return ycVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof tc) {
                        tc tcVar = (tc) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) tcVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) tcVar).height = 0;
                        }
                        h(tcVar, trim2);
                        return;
                    }
                    if (obj instanceof zc) {
                        ((zc) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof xc) {
                            ((xc) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof tc) {
                            tc tcVar2 = (tc) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) tcVar2).width = 0;
                                tcVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) tcVar2).height = 0;
                                tcVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof zc) {
                            zc zcVar = (zc) obj;
                            if (i2 == 0) {
                                zcVar.b = 0;
                                zcVar.U = parseFloat;
                                return;
                            } else {
                                zcVar.c = 0;
                                zcVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof xc) {
                            xc xcVar = (xc) obj;
                            if (i2 == 0) {
                                xcVar.b(23, 0);
                                xcVar.a(39, parseFloat);
                                return;
                            } else {
                                xcVar.b(21, 0);
                                xcVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof tc) {
                            tc tcVar3 = (tc) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) tcVar3).width = 0;
                                tcVar3.R = max;
                                tcVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) tcVar3).height = 0;
                                tcVar3.S = max;
                                tcVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof zc) {
                            zc zcVar2 = (zc) obj;
                            if (i2 == 0) {
                                zcVar2.b = 0;
                                zcVar2.d0 = max;
                                zcVar2.X = 2;
                                return;
                            } else {
                                zcVar2.c = 0;
                                zcVar2.e0 = max;
                                zcVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof xc) {
                            xc xcVar2 = (xc) obj;
                            if (i2 == 0) {
                                xcVar2.b(23, 0);
                                xcVar2.b(54, 2);
                                return;
                            } else {
                                xcVar2.b(21, 0);
                                xcVar2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof tc)) {
                tc tcVar4 = (tc) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) tcVar4).width = i4;
                    tcVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) tcVar4).height = i4;
                    tcVar4.X = z;
                    return;
                }
            }
            if (obj instanceof zc) {
                zc zcVar3 = (zc) obj;
                if (i2 == 0) {
                    zcVar3.b = i4;
                    zcVar3.l0 = z;
                    return;
                } else {
                    zcVar3.c = i4;
                    zcVar3.m0 = z;
                    return;
                }
            }
            if (obj instanceof xc) {
                xc xcVar3 = (xc) obj;
                if (i2 == 0) {
                    xcVar3.b(23, i4);
                    xcVar3.c(80, z);
                    return;
                } else {
                    xcVar3.b(21, i4);
                    xcVar3.c(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof tc)) {
        }
    }

    public static void h(tc tcVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        tcVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        dd ddVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = ddVar.c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (ddVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        yc ycVar = (yc) hashMap2.get(Integer.valueOf(id));
                        if (ycVar != null) {
                            bd bdVar = ycVar.b;
                            zc zcVar = ycVar.d;
                            cd cdVar = ycVar.e;
                            if (childAt instanceof t7) {
                                zcVar.h0 = 1;
                                t7 t7Var = (t7) childAt;
                                t7Var.setId(id);
                                t7Var.setType(zcVar.f0);
                                t7Var.setMargin(zcVar.g0);
                                t7Var.setAllowsGoneWidget(zcVar.n0);
                                int[] iArr = zcVar.i0;
                                if (iArr != null) {
                                    t7Var.setReferencedIds(iArr);
                                } else {
                                    String str3 = zcVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(t7Var, str3);
                                        zcVar.i0 = c;
                                        t7Var.setReferencedIds(c);
                                    }
                                }
                            }
                            tc tcVar = (tc) childAt.getLayoutParams();
                            tcVar.a();
                            ycVar.a(tcVar);
                            HashMap hashMap3 = ycVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                qc qcVar = (qc) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (qcVar.a) {
                                    i2 = i3;
                                    str = str4;
                                } else {
                                    i2 = i3;
                                    str = "set" + str4;
                                }
                                try {
                                    int i4 = o30.i(qcVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (i4) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(qcVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(qcVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(qcVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(qcVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, qcVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(qcVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(qcVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(qcVar.c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i2;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i3;
                            childAt.setLayoutParams(tcVar);
                            if (bdVar.b == 0) {
                                childAt.setVisibility(bdVar.a);
                            }
                            childAt.setAlpha(bdVar.c);
                            childAt.setRotation(cdVar.a);
                            childAt.setRotationX(cdVar.b);
                            childAt.setRotationY(cdVar.c);
                            childAt.setScaleX(cdVar.d);
                            childAt.setScaleY(cdVar.e);
                            if (cdVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(cdVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(cdVar.f)) {
                                    childAt.setPivotX(cdVar.f);
                                }
                                if (!Float.isNaN(cdVar.g)) {
                                    childAt.setPivotY(cdVar.g);
                                }
                            }
                            childAt.setTranslationX(cdVar.i);
                            childAt.setTranslationY(cdVar.j);
                            childAt.setTranslationZ(cdVar.k);
                            if (cdVar.l) {
                                childAt.setElevation(cdVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    ddVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            ddVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            yc ycVar2 = (yc) hashMap2.get(num);
            if (ycVar2 != null) {
                zc zcVar2 = ycVar2.d;
                if (zcVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    t7 t7Var2 = new t7(context);
                    t7Var2.f = new int[32];
                    t7Var2.l = new HashMap();
                    t7Var2.h = context;
                    u7 u7Var = new u7();
                    u7Var.s0 = 0;
                    u7Var.t0 = true;
                    u7Var.u0 = 0;
                    u7Var.v0 = false;
                    t7Var2.o = u7Var;
                    t7Var2.i = u7Var;
                    t7Var2.i();
                    t7Var2.setVisibility(8);
                    t7Var2.setId(num.intValue());
                    int[] iArr2 = zcVar2.i0;
                    if (iArr2 != null) {
                        t7Var2.setReferencedIds(iArr2);
                    } else {
                        String str5 = zcVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(t7Var2, str5);
                            zcVar2.i0 = c2;
                            t7Var2.setReferencedIds(c2);
                        }
                    }
                    t7Var2.setType(zcVar2.f0);
                    t7Var2.setMargin(zcVar2.g0);
                    tc g = ConstraintLayout.g();
                    t7Var2.i();
                    ycVar2.a(g);
                    constraintLayout.addView(t7Var2, g);
                }
                if (zcVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    tc g2 = ConstraintLayout.g();
                    ycVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof rc) {
                ((rc) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        dd ddVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = ddVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            tc tcVar = (tc) childAt.getLayoutParams();
            int id = childAt.getId();
            if (ddVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new yc());
            }
            yc ycVar = (yc) hashMap2.get(Integer.valueOf(id));
            if (ycVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                bd bdVar = ycVar.b;
                zc zcVar = ycVar.d;
                cd cdVar = ycVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = ddVar.a;
                for (String str : hashMap4.keySet()) {
                    qc qcVar = (qc) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new qc(qcVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new qc(qcVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    }
                    hashMap4 = hashMap5;
                }
                ycVar.f = hashMap3;
                ycVar.a = id;
                zcVar.h = tcVar.e;
                zcVar.i = tcVar.f;
                zcVar.j = tcVar.g;
                zcVar.k = tcVar.h;
                zcVar.l = tcVar.i;
                zcVar.m = tcVar.j;
                zcVar.n = tcVar.k;
                zcVar.o = tcVar.l;
                zcVar.p = tcVar.m;
                zcVar.q = tcVar.n;
                zcVar.r = tcVar.o;
                zcVar.s = tcVar.s;
                zcVar.t = tcVar.t;
                zcVar.u = tcVar.u;
                zcVar.v = tcVar.v;
                zcVar.w = tcVar.E;
                zcVar.x = tcVar.F;
                zcVar.y = tcVar.G;
                zcVar.z = tcVar.p;
                zcVar.A = tcVar.q;
                zcVar.B = tcVar.r;
                zcVar.C = tcVar.T;
                zcVar.D = tcVar.U;
                zcVar.E = tcVar.V;
                zcVar.f = tcVar.c;
                zcVar.d = tcVar.a;
                zcVar.e = tcVar.b;
                zcVar.b = ((ViewGroup.MarginLayoutParams) tcVar).width;
                zcVar.c = ((ViewGroup.MarginLayoutParams) tcVar).height;
                zcVar.F = ((ViewGroup.MarginLayoutParams) tcVar).leftMargin;
                zcVar.G = ((ViewGroup.MarginLayoutParams) tcVar).rightMargin;
                zcVar.H = ((ViewGroup.MarginLayoutParams) tcVar).topMargin;
                zcVar.I = ((ViewGroup.MarginLayoutParams) tcVar).bottomMargin;
                zcVar.L = tcVar.D;
                zcVar.T = tcVar.I;
                zcVar.U = tcVar.H;
                zcVar.W = tcVar.K;
                zcVar.V = tcVar.J;
                zcVar.l0 = tcVar.W;
                zcVar.m0 = tcVar.X;
                zcVar.X = tcVar.L;
                zcVar.Y = tcVar.M;
                zcVar.Z = tcVar.P;
                zcVar.a0 = tcVar.Q;
                zcVar.b0 = tcVar.N;
                zcVar.c0 = tcVar.O;
                zcVar.d0 = tcVar.R;
                zcVar.e0 = tcVar.S;
                zcVar.k0 = tcVar.Y;
                zcVar.N = tcVar.x;
                zcVar.P = tcVar.z;
                zcVar.M = tcVar.w;
                zcVar.O = tcVar.y;
                zcVar.R = tcVar.A;
                zcVar.Q = tcVar.B;
                zcVar.S = tcVar.C;
                zcVar.o0 = tcVar.Z;
                zcVar.J = tcVar.getMarginEnd();
                zcVar.K = tcVar.getMarginStart();
                bdVar.a = childAt.getVisibility();
                bdVar.c = childAt.getAlpha();
                cdVar.a = childAt.getRotation();
                cdVar.b = childAt.getRotationX();
                cdVar.c = childAt.getRotationY();
                cdVar.d = childAt.getScaleX();
                cdVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    cdVar.f = pivotX;
                    cdVar.g = pivotY;
                }
                cdVar.i = childAt.getTranslationX();
                cdVar.j = childAt.getTranslationY();
                cdVar.k = childAt.getTranslationZ();
                if (cdVar.l) {
                    cdVar.m = childAt.getElevation();
                }
                if (childAt instanceof t7) {
                    t7 t7Var = (t7) childAt;
                    zcVar.n0 = t7Var.getAllowsGoneWidget();
                    zcVar.i0 = t7Var.getReferencedIds();
                    zcVar.f0 = t7Var.getType();
                    zcVar.g0 = t7Var.getMargin();
                }
            }
            i3 = i2 + 1;
            ddVar = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    yc d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.a = true;
                    }
                    this.c.put(Integer.valueOf(d2.a), d2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
