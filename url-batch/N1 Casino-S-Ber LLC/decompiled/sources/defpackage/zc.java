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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class zc {
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

    public static int[] c(h7 h7Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = h7Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = ox.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && h7Var.isInEditMode() && (h7Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) h7Var.getParent();
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

    public static uc d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        uc ucVar = new uc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? qx.c : qx.a);
        String[] strArr = zo.h;
        xc xcVar = ucVar.b;
        yc ycVar = ucVar.e;
        wc wcVar = ucVar.c;
        vc vcVar = ucVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            tc tcVar = new tc();
            tcVar.a = new int[10];
            tcVar.b = new int[10];
            tcVar.c = 0;
            tcVar.d = new int[10];
            tcVar.e = new float[10];
            tcVar.f = 0;
            tcVar.g = new int[5];
            tcVar.h = new String[5];
            tcVar.i = 0;
            tcVar.j = new int[4];
            tcVar.k = new boolean[4];
            tcVar.l = 0;
            wcVar.getClass();
            vcVar.getClass();
            ycVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        tcVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.I));
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
                        tcVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        tcVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, vcVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        tcVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, vcVar.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        tcVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        tcVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        tcVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        tcVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        tcVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        tcVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        tcVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        tcVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, vcVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        tcVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, vcVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        tcVar.a(19, obtainStyledAttributes.getFloat(index, vcVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        tcVar.a(20, obtainStyledAttributes.getFloat(index, vcVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        tcVar.b(21, obtainStyledAttributes.getLayoutDimension(index, vcVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        tcVar.b(22, iArr[obtainStyledAttributes.getInt(index, xcVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        tcVar.b(23, obtainStyledAttributes.getLayoutDimension(index, vcVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        tcVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        tcVar.b(27, obtainStyledAttributes.getInt(index, vcVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        tcVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        tcVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        tcVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        tcVar.a(37, obtainStyledAttributes.getFloat(index, vcVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, ucVar.a);
                        ucVar.a = resourceId;
                        tcVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        tcVar.a(39, obtainStyledAttributes.getFloat(index, vcVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        tcVar.a(40, obtainStyledAttributes.getFloat(index, vcVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        tcVar.b(41, obtainStyledAttributes.getInt(index, vcVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        tcVar.b(42, obtainStyledAttributes.getInt(index, vcVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        tcVar.a(43, obtainStyledAttributes.getFloat(index, xcVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        tcVar.c(44, true);
                        tcVar.a(44, obtainStyledAttributes.getDimension(index, ycVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        tcVar.a(45, obtainStyledAttributes.getFloat(index, ycVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        tcVar.a(46, obtainStyledAttributes.getFloat(index, ycVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        tcVar.a(47, obtainStyledAttributes.getFloat(index, ycVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        tcVar.a(48, obtainStyledAttributes.getFloat(index, ycVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        tcVar.a(49, obtainStyledAttributes.getDimension(index, ycVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        tcVar.a(50, obtainStyledAttributes.getDimension(index, ycVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        tcVar.a(51, obtainStyledAttributes.getDimension(index, ycVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        tcVar.a(52, obtainStyledAttributes.getDimension(index, ycVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        tcVar.a(53, obtainStyledAttributes.getDimension(index, ycVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        tcVar.b(54, obtainStyledAttributes.getInt(index, vcVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        tcVar.b(55, obtainStyledAttributes.getInt(index, vcVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        tcVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        tcVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        tcVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        tcVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        tcVar.a(60, obtainStyledAttributes.getFloat(index, ycVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        tcVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        tcVar.a(63, obtainStyledAttributes.getFloat(index, vcVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        tcVar.b(64, f(obtainStyledAttributes, index, wcVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            tcVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            tcVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        tcVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        tcVar.a(67, obtainStyledAttributes.getFloat(index, wcVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        tcVar.a(68, obtainStyledAttributes.getFloat(index, xcVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        tcVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        tcVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        tcVar.b(72, obtainStyledAttributes.getInt(index, vcVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        tcVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        tcVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        tcVar.c(75, obtainStyledAttributes.getBoolean(index, vcVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        tcVar.b(76, obtainStyledAttributes.getInt(index, wcVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        tcVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        tcVar.b(78, obtainStyledAttributes.getInt(index, xcVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        tcVar.a(79, obtainStyledAttributes.getFloat(index, wcVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        tcVar.c(80, obtainStyledAttributes.getBoolean(index, vcVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        tcVar.c(81, obtainStyledAttributes.getBoolean(index, vcVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        tcVar.b(82, obtainStyledAttributes.getInteger(index, wcVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        tcVar.b(83, f(obtainStyledAttributes, index, ycVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        tcVar.b(84, obtainStyledAttributes.getInteger(index, wcVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        tcVar.a(85, obtainStyledAttributes.getFloat(index, wcVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            wcVar.i = resourceId2;
                            tcVar.b(89, resourceId2);
                            if (wcVar.i != -1) {
                                tcVar.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            wcVar.h = string;
                            tcVar.d(string, 90);
                            if (wcVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                wcVar.i = resourceId3;
                                tcVar.b(89, resourceId3);
                                tcVar.b(88, -2);
                                break;
                            } else {
                                tcVar.b(88, -1);
                                break;
                            }
                        } else {
                            tcVar.b(88, obtainStyledAttributes.getInteger(index, wcVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        tcVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        tcVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, vcVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(tcVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(tcVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        tcVar.b(97, obtainStyledAttributes.getInt(index, vcVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = lu.v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ucVar.a = obtainStyledAttributes.getResourceId(index, ucVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        tcVar.c(99, obtainStyledAttributes.getBoolean(index, vcVar.g));
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
                        wcVar.getClass();
                        vcVar.getClass();
                        ycVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        vcVar.p = f(obtainStyledAttributes, index2, vcVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        vcVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        vcVar.o = f(obtainStyledAttributes, index2, vcVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        vcVar.n = f(obtainStyledAttributes, index2, vcVar.n);
                        continue;
                    case 5:
                        i = indexCount2;
                        vcVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        vcVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, vcVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        vcVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, vcVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        vcVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        vcVar.v = f(obtainStyledAttributes, index2, vcVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        vcVar.u = f(obtainStyledAttributes, index2, vcVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        vcVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        vcVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        vcVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        vcVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        vcVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        vcVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        vcVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, vcVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        vcVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, vcVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        vcVar.f = obtainStyledAttributes.getFloat(index2, vcVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        vcVar.w = obtainStyledAttributes.getFloat(index2, vcVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        vcVar.c = obtainStyledAttributes.getLayoutDimension(index2, vcVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, xcVar.a);
                        xcVar.a = i8;
                        xcVar.a = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        vcVar.b = obtainStyledAttributes.getLayoutDimension(index2, vcVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        vcVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        vcVar.h = f(obtainStyledAttributes, index2, vcVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        vcVar.i = f(obtainStyledAttributes, index2, vcVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        vcVar.E = obtainStyledAttributes.getInt(index2, vcVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        vcVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        vcVar.j = f(obtainStyledAttributes, index2, vcVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        vcVar.k = f(obtainStyledAttributes, index2, vcVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        vcVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        vcVar.s = f(obtainStyledAttributes, index2, vcVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        vcVar.t = f(obtainStyledAttributes, index2, vcVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        vcVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        vcVar.m = f(obtainStyledAttributes, index2, vcVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        vcVar.l = f(obtainStyledAttributes, index2, vcVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        vcVar.x = obtainStyledAttributes.getFloat(index2, vcVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        ucVar.a = obtainStyledAttributes.getResourceId(index2, ucVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        vcVar.U = obtainStyledAttributes.getFloat(index2, vcVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        vcVar.T = obtainStyledAttributes.getFloat(index2, vcVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        vcVar.V = obtainStyledAttributes.getInt(index2, vcVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        vcVar.W = obtainStyledAttributes.getInt(index2, vcVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        xcVar.c = obtainStyledAttributes.getFloat(index2, xcVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        ycVar.l = true;
                        ycVar.m = obtainStyledAttributes.getDimension(index2, ycVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        ycVar.b = obtainStyledAttributes.getFloat(index2, ycVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        ycVar.c = obtainStyledAttributes.getFloat(index2, ycVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        ycVar.d = obtainStyledAttributes.getFloat(index2, ycVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        ycVar.e = obtainStyledAttributes.getFloat(index2, ycVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        ycVar.f = obtainStyledAttributes.getDimension(index2, ycVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        ycVar.g = obtainStyledAttributes.getDimension(index2, ycVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        ycVar.i = obtainStyledAttributes.getDimension(index2, ycVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        ycVar.j = obtainStyledAttributes.getDimension(index2, ycVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        ycVar.k = obtainStyledAttributes.getDimension(index2, ycVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        vcVar.X = obtainStyledAttributes.getInt(index2, vcVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        vcVar.Y = obtainStyledAttributes.getInt(index2, vcVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        vcVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        vcVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        vcVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        vcVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        ycVar.a = obtainStyledAttributes.getFloat(index2, ycVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        vcVar.z = f(obtainStyledAttributes, index2, vcVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        vcVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        vcVar.B = obtainStyledAttributes.getFloat(index2, vcVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        wcVar.a = f(obtainStyledAttributes, index2, wcVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            wcVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            wcVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        wcVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        wcVar.e = obtainStyledAttributes.getFloat(index2, wcVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        xcVar.d = obtainStyledAttributes.getFloat(index2, xcVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        vcVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        vcVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        vcVar.f0 = obtainStyledAttributes.getInt(index2, vcVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        vcVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        vcVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        vcVar.n0 = obtainStyledAttributes.getBoolean(index2, vcVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        wcVar.c = obtainStyledAttributes.getInt(index2, wcVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        vcVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        xcVar.b = obtainStyledAttributes.getInt(index2, xcVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        wcVar.d = obtainStyledAttributes.getFloat(index2, wcVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        vcVar.l0 = obtainStyledAttributes.getBoolean(index2, vcVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        vcVar.m0 = obtainStyledAttributes.getBoolean(index2, vcVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        wcVar.b = obtainStyledAttributes.getInteger(index2, wcVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        ycVar.h = f(obtainStyledAttributes, index2, ycVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        wcVar.g = obtainStyledAttributes.getInteger(index2, wcVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        wcVar.f = obtainStyledAttributes.getFloat(index2, wcVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            wcVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            wcVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                wcVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, wcVar.i);
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
                        vcVar.q = f(obtainStyledAttributes, index2, vcVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        vcVar.r = f(obtainStyledAttributes, index2, vcVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        vcVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        vcVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, vcVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(vcVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(vcVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        vcVar.o0 = obtainStyledAttributes.getInt(index2, vcVar.o0);
                        break;
                }
                i7++;
            }
            if (vcVar.j0 != null) {
                vcVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return ucVar;
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
                    if (obj instanceof pc) {
                        pc pcVar = (pc) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) pcVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) pcVar).height = 0;
                        }
                        h(pcVar, trim2);
                        return;
                    }
                    if (obj instanceof vc) {
                        ((vc) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof tc) {
                            ((tc) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof pc) {
                            pc pcVar2 = (pc) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) pcVar2).width = 0;
                                pcVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) pcVar2).height = 0;
                                pcVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof vc) {
                            vc vcVar = (vc) obj;
                            if (i2 == 0) {
                                vcVar.b = 0;
                                vcVar.U = parseFloat;
                                return;
                            } else {
                                vcVar.c = 0;
                                vcVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof tc) {
                            tc tcVar = (tc) obj;
                            if (i2 == 0) {
                                tcVar.b(23, 0);
                                tcVar.a(39, parseFloat);
                                return;
                            } else {
                                tcVar.b(21, 0);
                                tcVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof pc) {
                            pc pcVar3 = (pc) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) pcVar3).width = 0;
                                pcVar3.R = max;
                                pcVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) pcVar3).height = 0;
                                pcVar3.S = max;
                                pcVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof vc) {
                            vc vcVar2 = (vc) obj;
                            if (i2 == 0) {
                                vcVar2.b = 0;
                                vcVar2.d0 = max;
                                vcVar2.X = 2;
                                return;
                            } else {
                                vcVar2.c = 0;
                                vcVar2.e0 = max;
                                vcVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof tc) {
                            tc tcVar2 = (tc) obj;
                            if (i2 == 0) {
                                tcVar2.b(23, 0);
                                tcVar2.b(54, 2);
                                return;
                            } else {
                                tcVar2.b(21, 0);
                                tcVar2.b(55, 2);
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
            if (!(obj instanceof pc)) {
                pc pcVar4 = (pc) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) pcVar4).width = i4;
                    pcVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar4).height = i4;
                    pcVar4.X = z;
                    return;
                }
            }
            if (obj instanceof vc) {
                vc vcVar3 = (vc) obj;
                if (i2 == 0) {
                    vcVar3.b = i4;
                    vcVar3.l0 = z;
                    return;
                } else {
                    vcVar3.c = i4;
                    vcVar3.m0 = z;
                    return;
                }
            }
            if (obj instanceof tc) {
                tc tcVar3 = (tc) obj;
                if (i2 == 0) {
                    tcVar3.b(23, i4);
                    tcVar3.c(80, z);
                    return;
                } else {
                    tcVar3.b(21, i4);
                    tcVar3.c(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof pc)) {
        }
    }

    public static void h(pc pcVar, String str) {
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
        pcVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        zc zcVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zcVar.c;
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
                if (zcVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        uc ucVar = (uc) hashMap2.get(Integer.valueOf(id));
                        if (ucVar != null) {
                            xc xcVar = ucVar.b;
                            vc vcVar = ucVar.d;
                            yc ycVar = ucVar.e;
                            if (childAt instanceof h7) {
                                vcVar.h0 = 1;
                                h7 h7Var = (h7) childAt;
                                h7Var.setId(id);
                                h7Var.setType(vcVar.f0);
                                h7Var.setMargin(vcVar.g0);
                                h7Var.setAllowsGoneWidget(vcVar.n0);
                                int[] iArr = vcVar.i0;
                                if (iArr != null) {
                                    h7Var.setReferencedIds(iArr);
                                } else {
                                    String str3 = vcVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(h7Var, str3);
                                        vcVar.i0 = c;
                                        h7Var.setReferencedIds(c);
                                    }
                                }
                            }
                            pc pcVar = (pc) childAt.getLayoutParams();
                            pcVar.a();
                            ucVar.a(pcVar);
                            HashMap hashMap3 = ucVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                mc mcVar = (mc) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (mcVar.a) {
                                    i2 = i3;
                                    str = str4;
                                } else {
                                    i2 = i3;
                                    str = "set" + str4;
                                }
                                try {
                                    int h = d30.h(mcVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (h) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mcVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(mcVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mcVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(mcVar.g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, mcVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(mcVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(mcVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(mcVar.c));
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
                            childAt.setLayoutParams(pcVar);
                            if (xcVar.b == 0) {
                                childAt.setVisibility(xcVar.a);
                            }
                            childAt.setAlpha(xcVar.c);
                            childAt.setRotation(ycVar.a);
                            childAt.setRotationX(ycVar.b);
                            childAt.setRotationY(ycVar.c);
                            childAt.setScaleX(ycVar.d);
                            childAt.setScaleY(ycVar.e);
                            if (ycVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(ycVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(ycVar.f)) {
                                    childAt.setPivotX(ycVar.f);
                                }
                                if (!Float.isNaN(ycVar.g)) {
                                    childAt.setPivotY(ycVar.g);
                                }
                            }
                            childAt.setTranslationX(ycVar.i);
                            childAt.setTranslationY(ycVar.j);
                            childAt.setTranslationZ(ycVar.k);
                            if (ycVar.l) {
                                childAt.setElevation(ycVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    zcVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            zcVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            uc ucVar2 = (uc) hashMap2.get(num);
            if (ucVar2 != null) {
                vc vcVar2 = ucVar2.d;
                if (vcVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    h7 h7Var2 = new h7(context);
                    h7Var2.f = new int[32];
                    h7Var2.l = new HashMap();
                    h7Var2.h = context;
                    i7 i7Var = new i7();
                    i7Var.s0 = 0;
                    i7Var.t0 = true;
                    i7Var.u0 = 0;
                    i7Var.v0 = false;
                    h7Var2.o = i7Var;
                    h7Var2.i = i7Var;
                    h7Var2.i();
                    h7Var2.setVisibility(8);
                    h7Var2.setId(num.intValue());
                    int[] iArr2 = vcVar2.i0;
                    if (iArr2 != null) {
                        h7Var2.setReferencedIds(iArr2);
                    } else {
                        String str5 = vcVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(h7Var2, str5);
                            vcVar2.i0 = c2;
                            h7Var2.setReferencedIds(c2);
                        }
                    }
                    h7Var2.setType(vcVar2.f0);
                    h7Var2.setMargin(vcVar2.g0);
                    pc g = ConstraintLayout.g();
                    h7Var2.i();
                    ucVar2.a(g);
                    constraintLayout.addView(h7Var2, g);
                }
                if (vcVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    pc g2 = ConstraintLayout.g();
                    ucVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof nc) {
                ((nc) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        zc zcVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = zcVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            pc pcVar = (pc) childAt.getLayoutParams();
            int id = childAt.getId();
            if (zcVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new uc());
            }
            uc ucVar = (uc) hashMap2.get(Integer.valueOf(id));
            if (ucVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                xc xcVar = ucVar.b;
                vc vcVar = ucVar.d;
                yc ycVar = ucVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = zcVar.a;
                for (String str : hashMap4.keySet()) {
                    mc mcVar = (mc) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new mc(mcVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new mc(mcVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
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
                ucVar.f = hashMap3;
                ucVar.a = id;
                vcVar.h = pcVar.e;
                vcVar.i = pcVar.f;
                vcVar.j = pcVar.g;
                vcVar.k = pcVar.h;
                vcVar.l = pcVar.i;
                vcVar.m = pcVar.j;
                vcVar.n = pcVar.k;
                vcVar.o = pcVar.l;
                vcVar.p = pcVar.m;
                vcVar.q = pcVar.n;
                vcVar.r = pcVar.o;
                vcVar.s = pcVar.s;
                vcVar.t = pcVar.t;
                vcVar.u = pcVar.u;
                vcVar.v = pcVar.v;
                vcVar.w = pcVar.E;
                vcVar.x = pcVar.F;
                vcVar.y = pcVar.G;
                vcVar.z = pcVar.p;
                vcVar.A = pcVar.q;
                vcVar.B = pcVar.r;
                vcVar.C = pcVar.T;
                vcVar.D = pcVar.U;
                vcVar.E = pcVar.V;
                vcVar.f = pcVar.c;
                vcVar.d = pcVar.a;
                vcVar.e = pcVar.b;
                vcVar.b = ((ViewGroup.MarginLayoutParams) pcVar).width;
                vcVar.c = ((ViewGroup.MarginLayoutParams) pcVar).height;
                vcVar.F = ((ViewGroup.MarginLayoutParams) pcVar).leftMargin;
                vcVar.G = ((ViewGroup.MarginLayoutParams) pcVar).rightMargin;
                vcVar.H = ((ViewGroup.MarginLayoutParams) pcVar).topMargin;
                vcVar.I = ((ViewGroup.MarginLayoutParams) pcVar).bottomMargin;
                vcVar.L = pcVar.D;
                vcVar.T = pcVar.I;
                vcVar.U = pcVar.H;
                vcVar.W = pcVar.K;
                vcVar.V = pcVar.J;
                vcVar.l0 = pcVar.W;
                vcVar.m0 = pcVar.X;
                vcVar.X = pcVar.L;
                vcVar.Y = pcVar.M;
                vcVar.Z = pcVar.P;
                vcVar.a0 = pcVar.Q;
                vcVar.b0 = pcVar.N;
                vcVar.c0 = pcVar.O;
                vcVar.d0 = pcVar.R;
                vcVar.e0 = pcVar.S;
                vcVar.k0 = pcVar.Y;
                vcVar.N = pcVar.x;
                vcVar.P = pcVar.z;
                vcVar.M = pcVar.w;
                vcVar.O = pcVar.y;
                vcVar.R = pcVar.A;
                vcVar.Q = pcVar.B;
                vcVar.S = pcVar.C;
                vcVar.o0 = pcVar.Z;
                vcVar.J = pcVar.getMarginEnd();
                vcVar.K = pcVar.getMarginStart();
                xcVar.a = childAt.getVisibility();
                xcVar.c = childAt.getAlpha();
                ycVar.a = childAt.getRotation();
                ycVar.b = childAt.getRotationX();
                ycVar.c = childAt.getRotationY();
                ycVar.d = childAt.getScaleX();
                ycVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    ycVar.f = pivotX;
                    ycVar.g = pivotY;
                }
                ycVar.i = childAt.getTranslationX();
                ycVar.j = childAt.getTranslationY();
                ycVar.k = childAt.getTranslationZ();
                if (ycVar.l) {
                    ycVar.m = childAt.getElevation();
                }
                if (childAt instanceof h7) {
                    h7 h7Var = (h7) childAt;
                    vcVar.n0 = h7Var.getAllowsGoneWidget();
                    vcVar.i0 = h7Var.getReferencedIds();
                    vcVar.f0 = h7Var.getType();
                    vcVar.g0 = h7Var.getMargin();
                }
            }
            i3 = i2 + 1;
            zcVar = this;
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
                    uc d2 = d(context, Xml.asAttributeSet(xml), false);
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
