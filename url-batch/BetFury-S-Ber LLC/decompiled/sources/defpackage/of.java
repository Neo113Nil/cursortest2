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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class of {
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

    public static int[] c(d8 d8Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = d8Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = v60.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && d8Var.isInEditMode() && (d8Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) d8Var.getParent();
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

    public static jf d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        jf jfVar = new jf();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? x60.c : x60.a);
        String[] strArr = d50.c;
        mf mfVar = jfVar.b;
        nf nfVar = jfVar.e;
        lf lfVar = jfVar.c;
        kf kfVar = jfVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            hf hfVar = new hf();
            hfVar.a = new int[10];
            hfVar.b = new int[10];
            hfVar.c = 0;
            hfVar.d = new int[10];
            hfVar.e = new float[10];
            hfVar.f = 0;
            hfVar.g = new int[5];
            hfVar.h = new String[5];
            hfVar.i = 0;
            hfVar.j = new int[4];
            hfVar.k = new boolean[4];
            hfVar.l = 0;
            lfVar.getClass();
            kfVar.getClass();
            nfVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        hfVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.I));
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
                        hfVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        hfVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kfVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        hfVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kfVar.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        hfVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        hfVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        hfVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        hfVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        hfVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        hfVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        hfVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        hfVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kfVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        hfVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kfVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        hfVar.a(19, obtainStyledAttributes.getFloat(index, kfVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        hfVar.a(20, obtainStyledAttributes.getFloat(index, kfVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        hfVar.b(21, obtainStyledAttributes.getLayoutDimension(index, kfVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        hfVar.b(22, iArr[obtainStyledAttributes.getInt(index, mfVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        hfVar.b(23, obtainStyledAttributes.getLayoutDimension(index, kfVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        hfVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        hfVar.b(27, obtainStyledAttributes.getInt(index, kfVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        hfVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        hfVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        hfVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        hfVar.a(37, obtainStyledAttributes.getFloat(index, kfVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jfVar.a);
                        jfVar.a = resourceId;
                        hfVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        hfVar.a(39, obtainStyledAttributes.getFloat(index, kfVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        hfVar.a(40, obtainStyledAttributes.getFloat(index, kfVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        hfVar.b(41, obtainStyledAttributes.getInt(index, kfVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        hfVar.b(42, obtainStyledAttributes.getInt(index, kfVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        hfVar.a(43, obtainStyledAttributes.getFloat(index, mfVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        hfVar.c(44, true);
                        hfVar.a(44, obtainStyledAttributes.getDimension(index, nfVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        hfVar.a(45, obtainStyledAttributes.getFloat(index, nfVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        hfVar.a(46, obtainStyledAttributes.getFloat(index, nfVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        hfVar.a(47, obtainStyledAttributes.getFloat(index, nfVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        hfVar.a(48, obtainStyledAttributes.getFloat(index, nfVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        hfVar.a(49, obtainStyledAttributes.getDimension(index, nfVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        hfVar.a(50, obtainStyledAttributes.getDimension(index, nfVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        hfVar.a(51, obtainStyledAttributes.getDimension(index, nfVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        hfVar.a(52, obtainStyledAttributes.getDimension(index, nfVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        hfVar.a(53, obtainStyledAttributes.getDimension(index, nfVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        hfVar.b(54, obtainStyledAttributes.getInt(index, kfVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        hfVar.b(55, obtainStyledAttributes.getInt(index, kfVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        hfVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        hfVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        hfVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        hfVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        hfVar.a(60, obtainStyledAttributes.getFloat(index, nfVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        hfVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        hfVar.a(63, obtainStyledAttributes.getFloat(index, kfVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        hfVar.b(64, f(obtainStyledAttributes, index, lfVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hfVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            hfVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        hfVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        hfVar.a(67, obtainStyledAttributes.getFloat(index, lfVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        hfVar.a(68, obtainStyledAttributes.getFloat(index, mfVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        hfVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        hfVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        hfVar.b(72, obtainStyledAttributes.getInt(index, kfVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        hfVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        hfVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        hfVar.c(75, obtainStyledAttributes.getBoolean(index, kfVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        hfVar.b(76, obtainStyledAttributes.getInt(index, lfVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        hfVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        hfVar.b(78, obtainStyledAttributes.getInt(index, mfVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        hfVar.a(79, obtainStyledAttributes.getFloat(index, lfVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        hfVar.c(80, obtainStyledAttributes.getBoolean(index, kfVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        hfVar.c(81, obtainStyledAttributes.getBoolean(index, kfVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        hfVar.b(82, obtainStyledAttributes.getInteger(index, lfVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        hfVar.b(83, f(obtainStyledAttributes, index, nfVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        hfVar.b(84, obtainStyledAttributes.getInteger(index, lfVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        hfVar.a(85, obtainStyledAttributes.getFloat(index, lfVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lfVar.i = resourceId2;
                            hfVar.b(89, resourceId2);
                            if (lfVar.i != -1) {
                                hfVar.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lfVar.h = string;
                            hfVar.d(string, 90);
                            if (lfVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lfVar.i = resourceId3;
                                hfVar.b(89, resourceId3);
                                hfVar.b(88, -2);
                                break;
                            } else {
                                hfVar.b(88, -1);
                                break;
                            }
                        } else {
                            hfVar.b(88, obtainStyledAttributes.getInteger(index, lfVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        hfVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        hfVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kfVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(hfVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(hfVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        hfVar.b(97, obtainStyledAttributes.getInt(index, kfVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = q20.v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            jfVar.a = obtainStyledAttributes.getResourceId(index, jfVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        hfVar.c(99, obtainStyledAttributes.getBoolean(index, kfVar.g));
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
                        lfVar.getClass();
                        kfVar.getClass();
                        nfVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        kfVar.p = f(obtainStyledAttributes, index2, kfVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        kfVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        kfVar.o = f(obtainStyledAttributes, index2, kfVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        kfVar.n = f(obtainStyledAttributes, index2, kfVar.n);
                        continue;
                    case 5:
                        i = indexCount2;
                        kfVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        kfVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, kfVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        kfVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, kfVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        kfVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        kfVar.v = f(obtainStyledAttributes, index2, kfVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        kfVar.u = f(obtainStyledAttributes, index2, kfVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        kfVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        kfVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        kfVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        kfVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        kfVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        kfVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        kfVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, kfVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        kfVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, kfVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        kfVar.f = obtainStyledAttributes.getFloat(index2, kfVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        kfVar.w = obtainStyledAttributes.getFloat(index2, kfVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        kfVar.c = obtainStyledAttributes.getLayoutDimension(index2, kfVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, mfVar.a);
                        mfVar.a = i8;
                        mfVar.a = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        kfVar.b = obtainStyledAttributes.getLayoutDimension(index2, kfVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        kfVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        kfVar.h = f(obtainStyledAttributes, index2, kfVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        kfVar.i = f(obtainStyledAttributes, index2, kfVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        kfVar.E = obtainStyledAttributes.getInt(index2, kfVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        kfVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        kfVar.j = f(obtainStyledAttributes, index2, kfVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        kfVar.k = f(obtainStyledAttributes, index2, kfVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        kfVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        kfVar.s = f(obtainStyledAttributes, index2, kfVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        kfVar.t = f(obtainStyledAttributes, index2, kfVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        kfVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        kfVar.m = f(obtainStyledAttributes, index2, kfVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        kfVar.l = f(obtainStyledAttributes, index2, kfVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        kfVar.x = obtainStyledAttributes.getFloat(index2, kfVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        jfVar.a = obtainStyledAttributes.getResourceId(index2, jfVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        kfVar.U = obtainStyledAttributes.getFloat(index2, kfVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        kfVar.T = obtainStyledAttributes.getFloat(index2, kfVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        kfVar.V = obtainStyledAttributes.getInt(index2, kfVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        kfVar.W = obtainStyledAttributes.getInt(index2, kfVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        mfVar.c = obtainStyledAttributes.getFloat(index2, mfVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        nfVar.l = true;
                        nfVar.m = obtainStyledAttributes.getDimension(index2, nfVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        nfVar.b = obtainStyledAttributes.getFloat(index2, nfVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        nfVar.c = obtainStyledAttributes.getFloat(index2, nfVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        nfVar.d = obtainStyledAttributes.getFloat(index2, nfVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        nfVar.e = obtainStyledAttributes.getFloat(index2, nfVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        nfVar.f = obtainStyledAttributes.getDimension(index2, nfVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        nfVar.g = obtainStyledAttributes.getDimension(index2, nfVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        nfVar.i = obtainStyledAttributes.getDimension(index2, nfVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        nfVar.j = obtainStyledAttributes.getDimension(index2, nfVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        nfVar.k = obtainStyledAttributes.getDimension(index2, nfVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        kfVar.X = obtainStyledAttributes.getInt(index2, kfVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        kfVar.Y = obtainStyledAttributes.getInt(index2, kfVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        kfVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        kfVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        kfVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        kfVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        nfVar.a = obtainStyledAttributes.getFloat(index2, nfVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        kfVar.z = f(obtainStyledAttributes, index2, kfVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        kfVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        kfVar.B = obtainStyledAttributes.getFloat(index2, kfVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        lfVar.a = f(obtainStyledAttributes, index2, lfVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            lfVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            lfVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        lfVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        lfVar.e = obtainStyledAttributes.getFloat(index2, lfVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        mfVar.d = obtainStyledAttributes.getFloat(index2, mfVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        kfVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        kfVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        kfVar.f0 = obtainStyledAttributes.getInt(index2, kfVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        kfVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        kfVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        kfVar.n0 = obtainStyledAttributes.getBoolean(index2, kfVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        lfVar.c = obtainStyledAttributes.getInt(index2, lfVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        kfVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        mfVar.b = obtainStyledAttributes.getInt(index2, mfVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        lfVar.d = obtainStyledAttributes.getFloat(index2, lfVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        kfVar.l0 = obtainStyledAttributes.getBoolean(index2, kfVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        kfVar.m0 = obtainStyledAttributes.getBoolean(index2, kfVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        lfVar.b = obtainStyledAttributes.getInteger(index2, lfVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        nfVar.h = f(obtainStyledAttributes, index2, nfVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        lfVar.g = obtainStyledAttributes.getInteger(index2, lfVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        lfVar.f = obtainStyledAttributes.getFloat(index2, lfVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            lfVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            lfVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                lfVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, lfVar.i);
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
                        kfVar.q = f(obtainStyledAttributes, index2, kfVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        kfVar.r = f(obtainStyledAttributes, index2, kfVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        kfVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        kfVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, kfVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(kfVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(kfVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        kfVar.o0 = obtainStyledAttributes.getInt(index2, kfVar.o0);
                        break;
                }
                i7++;
            }
            if (kfVar.j0 != null) {
                kfVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jfVar;
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
                    if (obj instanceof df) {
                        df dfVar = (df) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) dfVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) dfVar).height = 0;
                        }
                        h(dfVar, trim2);
                        return;
                    }
                    if (obj instanceof kf) {
                        ((kf) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof hf) {
                            ((hf) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof df) {
                            df dfVar2 = (df) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) dfVar2).width = 0;
                                dfVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) dfVar2).height = 0;
                                dfVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof kf) {
                            kf kfVar = (kf) obj;
                            if (i2 == 0) {
                                kfVar.b = 0;
                                kfVar.U = parseFloat;
                                return;
                            } else {
                                kfVar.c = 0;
                                kfVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof hf) {
                            hf hfVar = (hf) obj;
                            if (i2 == 0) {
                                hfVar.b(23, 0);
                                hfVar.a(39, parseFloat);
                                return;
                            } else {
                                hfVar.b(21, 0);
                                hfVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof df) {
                            df dfVar3 = (df) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) dfVar3).width = 0;
                                dfVar3.R = max;
                                dfVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) dfVar3).height = 0;
                                dfVar3.S = max;
                                dfVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof kf) {
                            kf kfVar2 = (kf) obj;
                            if (i2 == 0) {
                                kfVar2.b = 0;
                                kfVar2.d0 = max;
                                kfVar2.X = 2;
                                return;
                            } else {
                                kfVar2.c = 0;
                                kfVar2.e0 = max;
                                kfVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof hf) {
                            hf hfVar2 = (hf) obj;
                            if (i2 == 0) {
                                hfVar2.b(23, 0);
                                hfVar2.b(54, 2);
                                return;
                            } else {
                                hfVar2.b(21, 0);
                                hfVar2.b(55, 2);
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
            if (!(obj instanceof df)) {
                df dfVar4 = (df) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) dfVar4).width = i4;
                    dfVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) dfVar4).height = i4;
                    dfVar4.X = z;
                    return;
                }
            }
            if (obj instanceof kf) {
                kf kfVar3 = (kf) obj;
                if (i2 == 0) {
                    kfVar3.b = i4;
                    kfVar3.l0 = z;
                    return;
                } else {
                    kfVar3.c = i4;
                    kfVar3.m0 = z;
                    return;
                }
            }
            if (obj instanceof hf) {
                hf hfVar3 = (hf) obj;
                if (i2 == 0) {
                    hfVar3.b(23, i4);
                    hfVar3.c(80, z);
                    return;
                } else {
                    hfVar3.b(21, i4);
                    hfVar3.c(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof df)) {
        }
    }

    public static void h(df dfVar, String str) {
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
        dfVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        of ofVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = ofVar.c;
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
                if (ofVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        jf jfVar = (jf) hashMap2.get(Integer.valueOf(id));
                        if (jfVar != null) {
                            mf mfVar = jfVar.b;
                            kf kfVar = jfVar.d;
                            nf nfVar = jfVar.e;
                            if (childAt instanceof d8) {
                                kfVar.h0 = 1;
                                d8 d8Var = (d8) childAt;
                                d8Var.setId(id);
                                d8Var.setType(kfVar.f0);
                                d8Var.setMargin(kfVar.g0);
                                d8Var.setAllowsGoneWidget(kfVar.n0);
                                int[] iArr = kfVar.i0;
                                if (iArr != null) {
                                    d8Var.setReferencedIds(iArr);
                                } else {
                                    String str3 = kfVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(d8Var, str3);
                                        kfVar.i0 = c;
                                        d8Var.setReferencedIds(c);
                                    }
                                }
                            }
                            df dfVar = (df) childAt.getLayoutParams();
                            dfVar.a();
                            jfVar.a(dfVar);
                            HashMap hashMap3 = jfVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                ze zeVar = (ze) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (zeVar.a) {
                                    i2 = i3;
                                    str = str4;
                                } else {
                                    i2 = i3;
                                    str = "set" + str4;
                                }
                                try {
                                    int ordinal = zeVar.b.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (ordinal) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(zeVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(zeVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(zeVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(zeVar.g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, zeVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(zeVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(zeVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(zeVar.c));
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
                            childAt.setLayoutParams(dfVar);
                            if (mfVar.b == 0) {
                                childAt.setVisibility(mfVar.a);
                            }
                            childAt.setAlpha(mfVar.c);
                            childAt.setRotation(nfVar.a);
                            childAt.setRotationX(nfVar.b);
                            childAt.setRotationY(nfVar.c);
                            childAt.setScaleX(nfVar.d);
                            childAt.setScaleY(nfVar.e);
                            if (nfVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(nfVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nfVar.f)) {
                                    childAt.setPivotX(nfVar.f);
                                }
                                if (!Float.isNaN(nfVar.g)) {
                                    childAt.setPivotY(nfVar.g);
                                }
                            }
                            childAt.setTranslationX(nfVar.i);
                            childAt.setTranslationY(nfVar.j);
                            childAt.setTranslationZ(nfVar.k);
                            if (nfVar.l) {
                                childAt.setElevation(nfVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    ofVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            ofVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            jf jfVar2 = (jf) hashMap2.get(num);
            if (jfVar2 != null) {
                kf kfVar2 = jfVar2.d;
                if (kfVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    d8 d8Var2 = new d8(context);
                    d8Var2.f = new int[32];
                    d8Var2.l = new HashMap();
                    d8Var2.h = context;
                    e8 e8Var = new e8();
                    e8Var.s0 = 0;
                    e8Var.t0 = true;
                    e8Var.u0 = 0;
                    e8Var.v0 = false;
                    d8Var2.o = e8Var;
                    d8Var2.i = e8Var;
                    d8Var2.i();
                    d8Var2.setVisibility(8);
                    d8Var2.setId(num.intValue());
                    int[] iArr2 = kfVar2.i0;
                    if (iArr2 != null) {
                        d8Var2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kfVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(d8Var2, str5);
                            kfVar2.i0 = c2;
                            d8Var2.setReferencedIds(c2);
                        }
                    }
                    d8Var2.setType(kfVar2.f0);
                    d8Var2.setMargin(kfVar2.g0);
                    df g = ConstraintLayout.g();
                    d8Var2.i();
                    jfVar2.a(g);
                    constraintLayout.addView(d8Var2, g);
                }
                if (kfVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    df g2 = ConstraintLayout.g();
                    jfVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof af) {
                ((af) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        of ofVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = ofVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            df dfVar = (df) childAt.getLayoutParams();
            int id = childAt.getId();
            if (ofVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new jf());
            }
            jf jfVar = (jf) hashMap2.get(Integer.valueOf(id));
            if (jfVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                mf mfVar = jfVar.b;
                kf kfVar = jfVar.d;
                nf nfVar = jfVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = ofVar.a;
                for (String str : hashMap4.keySet()) {
                    ze zeVar = (ze) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new ze(zeVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new ze(zeVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
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
                jfVar.f = hashMap3;
                jfVar.a = id;
                kfVar.h = dfVar.e;
                kfVar.i = dfVar.f;
                kfVar.j = dfVar.g;
                kfVar.k = dfVar.h;
                kfVar.l = dfVar.i;
                kfVar.m = dfVar.j;
                kfVar.n = dfVar.k;
                kfVar.o = dfVar.l;
                kfVar.p = dfVar.m;
                kfVar.q = dfVar.n;
                kfVar.r = dfVar.o;
                kfVar.s = dfVar.s;
                kfVar.t = dfVar.t;
                kfVar.u = dfVar.u;
                kfVar.v = dfVar.v;
                kfVar.w = dfVar.E;
                kfVar.x = dfVar.F;
                kfVar.y = dfVar.G;
                kfVar.z = dfVar.p;
                kfVar.A = dfVar.q;
                kfVar.B = dfVar.r;
                kfVar.C = dfVar.T;
                kfVar.D = dfVar.U;
                kfVar.E = dfVar.V;
                kfVar.f = dfVar.c;
                kfVar.d = dfVar.a;
                kfVar.e = dfVar.b;
                kfVar.b = ((ViewGroup.MarginLayoutParams) dfVar).width;
                kfVar.c = ((ViewGroup.MarginLayoutParams) dfVar).height;
                kfVar.F = ((ViewGroup.MarginLayoutParams) dfVar).leftMargin;
                kfVar.G = ((ViewGroup.MarginLayoutParams) dfVar).rightMargin;
                kfVar.H = ((ViewGroup.MarginLayoutParams) dfVar).topMargin;
                kfVar.I = ((ViewGroup.MarginLayoutParams) dfVar).bottomMargin;
                kfVar.L = dfVar.D;
                kfVar.T = dfVar.I;
                kfVar.U = dfVar.H;
                kfVar.W = dfVar.K;
                kfVar.V = dfVar.J;
                kfVar.l0 = dfVar.W;
                kfVar.m0 = dfVar.X;
                kfVar.X = dfVar.L;
                kfVar.Y = dfVar.M;
                kfVar.Z = dfVar.P;
                kfVar.a0 = dfVar.Q;
                kfVar.b0 = dfVar.N;
                kfVar.c0 = dfVar.O;
                kfVar.d0 = dfVar.R;
                kfVar.e0 = dfVar.S;
                kfVar.k0 = dfVar.Y;
                kfVar.N = dfVar.x;
                kfVar.P = dfVar.z;
                kfVar.M = dfVar.w;
                kfVar.O = dfVar.y;
                kfVar.R = dfVar.A;
                kfVar.Q = dfVar.B;
                kfVar.S = dfVar.C;
                kfVar.o0 = dfVar.Z;
                kfVar.J = dfVar.getMarginEnd();
                kfVar.K = dfVar.getMarginStart();
                mfVar.a = childAt.getVisibility();
                mfVar.c = childAt.getAlpha();
                nfVar.a = childAt.getRotation();
                nfVar.b = childAt.getRotationX();
                nfVar.c = childAt.getRotationY();
                nfVar.d = childAt.getScaleX();
                nfVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nfVar.f = pivotX;
                    nfVar.g = pivotY;
                }
                nfVar.i = childAt.getTranslationX();
                nfVar.j = childAt.getTranslationY();
                nfVar.k = childAt.getTranslationZ();
                if (nfVar.l) {
                    nfVar.m = childAt.getElevation();
                }
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    kfVar.n0 = d8Var.getAllowsGoneWidget();
                    kfVar.i0 = d8Var.getReferencedIds();
                    kfVar.f0 = d8Var.getType();
                    kfVar.g0 = d8Var.getMargin();
                }
            }
            i3 = i2 + 1;
            ofVar = this;
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
                    jf d2 = d(context, Xml.asAttributeSet(xml), false);
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
