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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zd {
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

    public static int[] c(r7 r7Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = r7Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = r00.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && r7Var.isInEditMode() && (r7Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) r7Var.getParent();
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

    public static ud d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        ud udVar = new ud();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? t00.c : t00.a);
        String[] strArr = b9.c;
        xd xdVar = udVar.b;
        yd ydVar = udVar.e;
        wd wdVar = udVar.c;
        vd vdVar = udVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            td tdVar = new td();
            tdVar.a = new int[10];
            tdVar.b = new int[10];
            tdVar.c = 0;
            tdVar.d = new int[10];
            tdVar.e = new float[10];
            tdVar.f = 0;
            tdVar.g = new int[5];
            tdVar.h = new String[5];
            tdVar.i = 0;
            tdVar.j = new int[4];
            tdVar.k = new boolean[4];
            tdVar.l = 0;
            wdVar.getClass();
            vdVar.getClass();
            ydVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        tdVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.I));
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
                    case 5:
                        i2 = indexCount;
                        tdVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        tdVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, vdVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        tdVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, vdVar.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        tdVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        tdVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        tdVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        tdVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        tdVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        tdVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        tdVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        tdVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, vdVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        tdVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, vdVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        tdVar.a(19, obtainStyledAttributes.getFloat(index, vdVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        tdVar.a(20, obtainStyledAttributes.getFloat(index, vdVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        tdVar.b(21, obtainStyledAttributes.getLayoutDimension(index, vdVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        tdVar.b(22, iArr[obtainStyledAttributes.getInt(index, xdVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        tdVar.b(23, obtainStyledAttributes.getLayoutDimension(index, vdVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        tdVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        tdVar.b(27, obtainStyledAttributes.getInt(index, vdVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        tdVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        tdVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        tdVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        tdVar.a(37, obtainStyledAttributes.getFloat(index, vdVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, udVar.a);
                        udVar.a = resourceId;
                        tdVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        tdVar.a(39, obtainStyledAttributes.getFloat(index, vdVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        tdVar.a(40, obtainStyledAttributes.getFloat(index, vdVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        tdVar.b(41, obtainStyledAttributes.getInt(index, vdVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        tdVar.b(42, obtainStyledAttributes.getInt(index, vdVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        tdVar.a(43, obtainStyledAttributes.getFloat(index, xdVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        tdVar.c(44, true);
                        tdVar.a(44, obtainStyledAttributes.getDimension(index, ydVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        tdVar.a(45, obtainStyledAttributes.getFloat(index, ydVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        tdVar.a(46, obtainStyledAttributes.getFloat(index, ydVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        tdVar.a(47, obtainStyledAttributes.getFloat(index, ydVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        tdVar.a(48, obtainStyledAttributes.getFloat(index, ydVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        tdVar.a(49, obtainStyledAttributes.getDimension(index, ydVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        tdVar.a(50, obtainStyledAttributes.getDimension(index, ydVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        tdVar.a(51, obtainStyledAttributes.getDimension(index, ydVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        tdVar.a(52, obtainStyledAttributes.getDimension(index, ydVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        tdVar.a(53, obtainStyledAttributes.getDimension(index, ydVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        tdVar.b(54, obtainStyledAttributes.getInt(index, vdVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        tdVar.b(55, obtainStyledAttributes.getInt(index, vdVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        tdVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        tdVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        tdVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        tdVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        tdVar.a(60, obtainStyledAttributes.getFloat(index, ydVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        tdVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        tdVar.a(63, obtainStyledAttributes.getFloat(index, vdVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        tdVar.b(64, f(obtainStyledAttributes, index, wdVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            tdVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            tdVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        tdVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        tdVar.a(67, obtainStyledAttributes.getFloat(index, wdVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        tdVar.a(68, obtainStyledAttributes.getFloat(index, xdVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        tdVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        tdVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        tdVar.b(72, obtainStyledAttributes.getInt(index, vdVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        tdVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        tdVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        tdVar.c(75, obtainStyledAttributes.getBoolean(index, vdVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        tdVar.b(76, obtainStyledAttributes.getInt(index, wdVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        tdVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        tdVar.b(78, obtainStyledAttributes.getInt(index, xdVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        tdVar.a(79, obtainStyledAttributes.getFloat(index, wdVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        tdVar.c(80, obtainStyledAttributes.getBoolean(index, vdVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        tdVar.c(81, obtainStyledAttributes.getBoolean(index, vdVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        tdVar.b(82, obtainStyledAttributes.getInteger(index, wdVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        tdVar.b(83, f(obtainStyledAttributes, index, ydVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        tdVar.b(84, obtainStyledAttributes.getInteger(index, wdVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        tdVar.a(85, obtainStyledAttributes.getFloat(index, wdVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            wdVar.i = resourceId2;
                            tdVar.b(89, resourceId2);
                            if (wdVar.i != -1) {
                                tdVar.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            wdVar.h = string;
                            tdVar.d(string, 90);
                            if (wdVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                wdVar.i = resourceId3;
                                tdVar.b(89, resourceId3);
                                tdVar.b(88, -2);
                                break;
                            } else {
                                tdVar.b(88, -1);
                                break;
                            }
                        } else {
                            tdVar.b(88, obtainStyledAttributes.getInteger(index, wdVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        tdVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        tdVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, vdVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(tdVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(tdVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        tdVar.b(97, obtainStyledAttributes.getInt(index, vdVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = mx.v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            udVar.a = obtainStyledAttributes.getResourceId(index, udVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        tdVar.c(99, obtainStyledAttributes.getBoolean(index, vdVar.g));
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
                        wdVar.getClass();
                        vdVar.getClass();
                        ydVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        vdVar.p = f(obtainStyledAttributes, index2, vdVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        vdVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        vdVar.o = f(obtainStyledAttributes, index2, vdVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        vdVar.n = f(obtainStyledAttributes, index2, vdVar.n);
                        continue;
                    case 5:
                        i = indexCount2;
                        vdVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        vdVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, vdVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        vdVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, vdVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        vdVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        vdVar.v = f(obtainStyledAttributes, index2, vdVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        vdVar.u = f(obtainStyledAttributes, index2, vdVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        vdVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        vdVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        vdVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        vdVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        vdVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        vdVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        vdVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, vdVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        vdVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, vdVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        vdVar.f = obtainStyledAttributes.getFloat(index2, vdVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        vdVar.w = obtainStyledAttributes.getFloat(index2, vdVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        vdVar.c = obtainStyledAttributes.getLayoutDimension(index2, vdVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, xdVar.a);
                        xdVar.a = i8;
                        xdVar.a = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        vdVar.b = obtainStyledAttributes.getLayoutDimension(index2, vdVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        vdVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        vdVar.h = f(obtainStyledAttributes, index2, vdVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        vdVar.i = f(obtainStyledAttributes, index2, vdVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        vdVar.E = obtainStyledAttributes.getInt(index2, vdVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        vdVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        vdVar.j = f(obtainStyledAttributes, index2, vdVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        vdVar.k = f(obtainStyledAttributes, index2, vdVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        vdVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        vdVar.s = f(obtainStyledAttributes, index2, vdVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        vdVar.t = f(obtainStyledAttributes, index2, vdVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        vdVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        vdVar.m = f(obtainStyledAttributes, index2, vdVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        vdVar.l = f(obtainStyledAttributes, index2, vdVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        vdVar.x = obtainStyledAttributes.getFloat(index2, vdVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        udVar.a = obtainStyledAttributes.getResourceId(index2, udVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        vdVar.U = obtainStyledAttributes.getFloat(index2, vdVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        vdVar.T = obtainStyledAttributes.getFloat(index2, vdVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        vdVar.V = obtainStyledAttributes.getInt(index2, vdVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        vdVar.W = obtainStyledAttributes.getInt(index2, vdVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        xdVar.c = obtainStyledAttributes.getFloat(index2, xdVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        ydVar.l = true;
                        ydVar.m = obtainStyledAttributes.getDimension(index2, ydVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        ydVar.b = obtainStyledAttributes.getFloat(index2, ydVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        ydVar.c = obtainStyledAttributes.getFloat(index2, ydVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        ydVar.d = obtainStyledAttributes.getFloat(index2, ydVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        ydVar.e = obtainStyledAttributes.getFloat(index2, ydVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        ydVar.f = obtainStyledAttributes.getDimension(index2, ydVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        ydVar.g = obtainStyledAttributes.getDimension(index2, ydVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        ydVar.i = obtainStyledAttributes.getDimension(index2, ydVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        ydVar.j = obtainStyledAttributes.getDimension(index2, ydVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        ydVar.k = obtainStyledAttributes.getDimension(index2, ydVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        vdVar.X = obtainStyledAttributes.getInt(index2, vdVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        vdVar.Y = obtainStyledAttributes.getInt(index2, vdVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        vdVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        vdVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        vdVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        vdVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        ydVar.a = obtainStyledAttributes.getFloat(index2, ydVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        vdVar.z = f(obtainStyledAttributes, index2, vdVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        vdVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        vdVar.B = obtainStyledAttributes.getFloat(index2, vdVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        wdVar.a = f(obtainStyledAttributes, index2, wdVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            wdVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            wdVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        wdVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        wdVar.e = obtainStyledAttributes.getFloat(index2, wdVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        xdVar.d = obtainStyledAttributes.getFloat(index2, xdVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        vdVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        vdVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        vdVar.f0 = obtainStyledAttributes.getInt(index2, vdVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        vdVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        vdVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        vdVar.n0 = obtainStyledAttributes.getBoolean(index2, vdVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        wdVar.c = obtainStyledAttributes.getInt(index2, wdVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        vdVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        xdVar.b = obtainStyledAttributes.getInt(index2, xdVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        wdVar.d = obtainStyledAttributes.getFloat(index2, wdVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        vdVar.l0 = obtainStyledAttributes.getBoolean(index2, vdVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        vdVar.m0 = obtainStyledAttributes.getBoolean(index2, vdVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        wdVar.b = obtainStyledAttributes.getInteger(index2, wdVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        ydVar.h = f(obtainStyledAttributes, index2, ydVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        wdVar.g = obtainStyledAttributes.getInteger(index2, wdVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        wdVar.f = obtainStyledAttributes.getFloat(index2, wdVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            wdVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            wdVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                wdVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, wdVar.i);
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
                        vdVar.q = f(obtainStyledAttributes, index2, vdVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        vdVar.r = f(obtainStyledAttributes, index2, vdVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        vdVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        vdVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, vdVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(vdVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(vdVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        vdVar.o0 = obtainStyledAttributes.getInt(index2, vdVar.o0);
                        break;
                }
                i7++;
            }
            if (vdVar.j0 != null) {
                vdVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return udVar;
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
                    if (obj instanceof pd) {
                        pd pdVar = (pd) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) pdVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) pdVar).height = 0;
                        }
                        h(pdVar, trim2);
                        return;
                    }
                    if (obj instanceof vd) {
                        ((vd) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof td) {
                            ((td) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof pd) {
                            pd pdVar2 = (pd) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) pdVar2).width = 0;
                                pdVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) pdVar2).height = 0;
                                pdVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof vd) {
                            vd vdVar = (vd) obj;
                            if (i2 == 0) {
                                vdVar.b = 0;
                                vdVar.U = parseFloat;
                                return;
                            } else {
                                vdVar.c = 0;
                                vdVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof td) {
                            td tdVar = (td) obj;
                            if (i2 == 0) {
                                tdVar.b(23, 0);
                                tdVar.a(39, parseFloat);
                                return;
                            } else {
                                tdVar.b(21, 0);
                                tdVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof pd) {
                            pd pdVar3 = (pd) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) pdVar3).width = 0;
                                pdVar3.R = max;
                                pdVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) pdVar3).height = 0;
                                pdVar3.S = max;
                                pdVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof vd) {
                            vd vdVar2 = (vd) obj;
                            if (i2 == 0) {
                                vdVar2.b = 0;
                                vdVar2.d0 = max;
                                vdVar2.X = 2;
                                return;
                            } else {
                                vdVar2.c = 0;
                                vdVar2.e0 = max;
                                vdVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof td) {
                            td tdVar2 = (td) obj;
                            if (i2 == 0) {
                                tdVar2.b(23, 0);
                                tdVar2.b(54, 2);
                                return;
                            } else {
                                tdVar2.b(21, 0);
                                tdVar2.b(55, 2);
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
            if (!(obj instanceof pd)) {
                pd pdVar4 = (pd) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) pdVar4).width = i4;
                    pdVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) pdVar4).height = i4;
                    pdVar4.X = z;
                    return;
                }
            }
            if (obj instanceof vd) {
                vd vdVar3 = (vd) obj;
                if (i2 == 0) {
                    vdVar3.b = i4;
                    vdVar3.l0 = z;
                    return;
                } else {
                    vdVar3.c = i4;
                    vdVar3.m0 = z;
                    return;
                }
            }
            if (obj instanceof td) {
                td tdVar3 = (td) obj;
                if (i2 == 0) {
                    tdVar3.b(23, i4);
                    tdVar3.c(80, z);
                    return;
                } else {
                    tdVar3.b(21, i4);
                    tdVar3.c(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof pd)) {
        }
    }

    public static void h(pd pdVar, String str) {
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
        pdVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        zd zdVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zdVar.c;
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
                if (zdVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        ud udVar = (ud) hashMap2.get(Integer.valueOf(id));
                        if (udVar != null) {
                            xd xdVar = udVar.b;
                            vd vdVar = udVar.d;
                            yd ydVar = udVar.e;
                            if (childAt instanceof r7) {
                                vdVar.h0 = 1;
                                r7 r7Var = (r7) childAt;
                                r7Var.setId(id);
                                r7Var.setType(vdVar.f0);
                                r7Var.setMargin(vdVar.g0);
                                r7Var.setAllowsGoneWidget(vdVar.n0);
                                int[] iArr = vdVar.i0;
                                if (iArr != null) {
                                    r7Var.setReferencedIds(iArr);
                                } else {
                                    String str3 = vdVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(r7Var, str3);
                                        vdVar.i0 = c;
                                        r7Var.setReferencedIds(c);
                                    }
                                }
                            }
                            pd pdVar = (pd) childAt.getLayoutParams();
                            pdVar.a();
                            udVar.a(pdVar);
                            HashMap hashMap3 = udVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                md mdVar = (md) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (mdVar.a) {
                                    i2 = i3;
                                    str = str4;
                                } else {
                                    i2 = i3;
                                    str = "set" + str4;
                                }
                                try {
                                    int j = f60.j(mdVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (j) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mdVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(mdVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mdVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(mdVar.g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, mdVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(mdVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(mdVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mdVar.c));
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
                            childAt.setLayoutParams(pdVar);
                            if (xdVar.b == 0) {
                                childAt.setVisibility(xdVar.a);
                            }
                            childAt.setAlpha(xdVar.c);
                            childAt.setRotation(ydVar.a);
                            childAt.setRotationX(ydVar.b);
                            childAt.setRotationY(ydVar.c);
                            childAt.setScaleX(ydVar.d);
                            childAt.setScaleY(ydVar.e);
                            if (ydVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(ydVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(ydVar.f)) {
                                    childAt.setPivotX(ydVar.f);
                                }
                                if (!Float.isNaN(ydVar.g)) {
                                    childAt.setPivotY(ydVar.g);
                                }
                            }
                            childAt.setTranslationX(ydVar.i);
                            childAt.setTranslationY(ydVar.j);
                            childAt.setTranslationZ(ydVar.k);
                            if (ydVar.l) {
                                childAt.setElevation(ydVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    zdVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            zdVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ud udVar2 = (ud) hashMap2.get(num);
            if (udVar2 != null) {
                vd vdVar2 = udVar2.d;
                if (vdVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    r7 r7Var2 = new r7(context);
                    r7Var2.f = new int[32];
                    r7Var2.l = new HashMap();
                    r7Var2.h = context;
                    s7 s7Var = new s7();
                    s7Var.s0 = 0;
                    s7Var.t0 = true;
                    s7Var.u0 = 0;
                    s7Var.v0 = false;
                    r7Var2.o = s7Var;
                    r7Var2.i = s7Var;
                    r7Var2.i();
                    r7Var2.setVisibility(8);
                    r7Var2.setId(num.intValue());
                    int[] iArr2 = vdVar2.i0;
                    if (iArr2 != null) {
                        r7Var2.setReferencedIds(iArr2);
                    } else {
                        String str5 = vdVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(r7Var2, str5);
                            vdVar2.i0 = c2;
                            r7Var2.setReferencedIds(c2);
                        }
                    }
                    r7Var2.setType(vdVar2.f0);
                    r7Var2.setMargin(vdVar2.g0);
                    pd g = ConstraintLayout.g();
                    r7Var2.i();
                    udVar2.a(g);
                    constraintLayout.addView(r7Var2, g);
                }
                if (vdVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    pd g2 = ConstraintLayout.g();
                    udVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof nd) {
                ((nd) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        zd zdVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zdVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            pd pdVar = (pd) childAt.getLayoutParams();
            int id = childAt.getId();
            if (zdVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new ud());
            }
            ud udVar = (ud) hashMap2.get(Integer.valueOf(id));
            if (udVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                xd xdVar = udVar.b;
                vd vdVar = udVar.d;
                yd ydVar = udVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = zdVar.a;
                for (String str : hashMap4.keySet()) {
                    md mdVar = (md) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new md(mdVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new md(mdVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
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
                udVar.f = hashMap3;
                udVar.a = id;
                vdVar.h = pdVar.e;
                vdVar.i = pdVar.f;
                vdVar.j = pdVar.g;
                vdVar.k = pdVar.h;
                vdVar.l = pdVar.i;
                vdVar.m = pdVar.j;
                vdVar.n = pdVar.k;
                vdVar.o = pdVar.l;
                vdVar.p = pdVar.m;
                vdVar.q = pdVar.n;
                vdVar.r = pdVar.o;
                vdVar.s = pdVar.s;
                vdVar.t = pdVar.t;
                vdVar.u = pdVar.u;
                vdVar.v = pdVar.v;
                vdVar.w = pdVar.E;
                vdVar.x = pdVar.F;
                vdVar.y = pdVar.G;
                vdVar.z = pdVar.p;
                vdVar.A = pdVar.q;
                vdVar.B = pdVar.r;
                vdVar.C = pdVar.T;
                vdVar.D = pdVar.U;
                vdVar.E = pdVar.V;
                vdVar.f = pdVar.c;
                vdVar.d = pdVar.a;
                vdVar.e = pdVar.b;
                vdVar.b = ((ViewGroup.MarginLayoutParams) pdVar).width;
                vdVar.c = ((ViewGroup.MarginLayoutParams) pdVar).height;
                vdVar.F = ((ViewGroup.MarginLayoutParams) pdVar).leftMargin;
                vdVar.G = ((ViewGroup.MarginLayoutParams) pdVar).rightMargin;
                vdVar.H = ((ViewGroup.MarginLayoutParams) pdVar).topMargin;
                vdVar.I = ((ViewGroup.MarginLayoutParams) pdVar).bottomMargin;
                vdVar.L = pdVar.D;
                vdVar.T = pdVar.I;
                vdVar.U = pdVar.H;
                vdVar.W = pdVar.K;
                vdVar.V = pdVar.J;
                vdVar.l0 = pdVar.W;
                vdVar.m0 = pdVar.X;
                vdVar.X = pdVar.L;
                vdVar.Y = pdVar.M;
                vdVar.Z = pdVar.P;
                vdVar.a0 = pdVar.Q;
                vdVar.b0 = pdVar.N;
                vdVar.c0 = pdVar.O;
                vdVar.d0 = pdVar.R;
                vdVar.e0 = pdVar.S;
                vdVar.k0 = pdVar.Y;
                vdVar.N = pdVar.x;
                vdVar.P = pdVar.z;
                vdVar.M = pdVar.w;
                vdVar.O = pdVar.y;
                vdVar.R = pdVar.A;
                vdVar.Q = pdVar.B;
                vdVar.S = pdVar.C;
                vdVar.o0 = pdVar.Z;
                vdVar.J = pdVar.getMarginEnd();
                vdVar.K = pdVar.getMarginStart();
                xdVar.a = childAt.getVisibility();
                xdVar.c = childAt.getAlpha();
                ydVar.a = childAt.getRotation();
                ydVar.b = childAt.getRotationX();
                ydVar.c = childAt.getRotationY();
                ydVar.d = childAt.getScaleX();
                ydVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    ydVar.f = pivotX;
                    ydVar.g = pivotY;
                }
                ydVar.i = childAt.getTranslationX();
                ydVar.j = childAt.getTranslationY();
                ydVar.k = childAt.getTranslationZ();
                if (ydVar.l) {
                    ydVar.m = childAt.getElevation();
                }
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    vdVar.n0 = r7Var.getAllowsGoneWidget();
                    vdVar.i0 = r7Var.getReferencedIds();
                    vdVar.f0 = r7Var.getType();
                    vdVar.g0 = r7Var.getMargin();
                }
            }
            i3 = i2 + 1;
            zdVar = this;
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
                    ud d2 = d(context, Xml.asAttributeSet(xml), false);
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
