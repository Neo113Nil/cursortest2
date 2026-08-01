package y;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4081e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4082f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4083a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4084b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4085c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4081e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4082f = sparseIntArray2;
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

    public static int[] c(a aVar, String str) {
        int i;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            Object obj = null;
            try {
                i = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f378r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f378r.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = i;
            i4++;
            i5++;
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z4) {
        int i;
        int i4;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? q.f4088c : q.f4086a);
        l lVar = iVar.f4019b;
        m mVar = iVar.f4021e;
        k kVar = iVar.f4020c;
        j jVar = iVar.d;
        int[] iArr = d;
        String[] strArr = u.a.f3541a;
        SparseIntArray sparseIntArray = f4081e;
        if (z4) {
            h hVar = new h();
            hVar.f4009a = new int[10];
            hVar.f4010b = new int[10];
            hVar.f4011c = 0;
            hVar.d = new int[10];
            hVar.f4012e = new float[10];
            hVar.f4013f = 0;
            hVar.f4014g = new int[5];
            hVar.h = new String[5];
            hVar.i = 0;
            hVar.f4015j = new int[4];
            hVar.f4016k = new boolean[4];
            hVar.f4017l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i5 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i5 < indexCount; indexCount = i4) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = i5;
                switch (f4082f.get(index)) {
                    case 2:
                        i4 = indexCount;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
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
                        i4 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i4 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i4 = indexCount;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        i4 = indexCount;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        i4 = indexCount;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i4 = indexCount;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        i4 = indexCount;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        i4 = indexCount;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        i4 = indexCount;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        i4 = indexCount;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        i4 = indexCount;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        i4 = indexCount;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.d));
                        break;
                    case 18:
                        i4 = indexCount;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4030e));
                        break;
                    case 19:
                        i4 = indexCount;
                        hVar.a(19, obtainStyledAttributes.getFloat(index, jVar.f4032f));
                        break;
                    case 20:
                        i4 = indexCount;
                        hVar.a(20, obtainStyledAttributes.getFloat(index, jVar.f4056w));
                        break;
                    case 21:
                        i4 = indexCount;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f4028c));
                        break;
                    case 22:
                        i4 = indexCount;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4067a)]);
                        break;
                    case 23:
                        i4 = indexCount;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f4026b));
                        break;
                    case 24:
                        i4 = indexCount;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        i4 = indexCount;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        i4 = indexCount;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        i4 = indexCount;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        i4 = indexCount;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        i4 = indexCount;
                        hVar.a(37, obtainStyledAttributes.getFloat(index, jVar.f4057x));
                        break;
                    case 38:
                        i4 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f4018a);
                        iVar.f4018a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i4 = indexCount;
                        hVar.a(39, obtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case 40:
                        i4 = indexCount;
                        hVar.a(40, obtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 41:
                        i4 = indexCount;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        i4 = indexCount;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 43:
                        i4 = indexCount;
                        hVar.a(43, obtainStyledAttributes.getFloat(index, lVar.f4069c));
                        break;
                    case 44:
                        i4 = indexCount;
                        hVar.c(44, true);
                        hVar.a(44, obtainStyledAttributes.getDimension(index, mVar.f4080m));
                        break;
                    case 45:
                        i4 = indexCount;
                        hVar.a(45, obtainStyledAttributes.getFloat(index, mVar.f4072b));
                        break;
                    case 46:
                        i4 = indexCount;
                        hVar.a(46, obtainStyledAttributes.getFloat(index, mVar.f4073c));
                        break;
                    case 47:
                        i4 = indexCount;
                        hVar.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        break;
                    case 48:
                        i4 = indexCount;
                        hVar.a(48, obtainStyledAttributes.getFloat(index, mVar.f4074e));
                        break;
                    case 49:
                        i4 = indexCount;
                        hVar.a(49, obtainStyledAttributes.getDimension(index, mVar.f4075f));
                        break;
                    case 50:
                        i4 = indexCount;
                        hVar.a(50, obtainStyledAttributes.getDimension(index, mVar.f4076g));
                        break;
                    case 51:
                        i4 = indexCount;
                        hVar.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        break;
                    case 52:
                        i4 = indexCount;
                        hVar.a(52, obtainStyledAttributes.getDimension(index, mVar.f4077j));
                        break;
                    case 53:
                        i4 = indexCount;
                        hVar.a(53, obtainStyledAttributes.getDimension(index, mVar.f4078k));
                        break;
                    case 54:
                        i4 = indexCount;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        i4 = indexCount;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        i4 = indexCount;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        i4 = indexCount;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4025a0));
                        break;
                    case 58:
                        i4 = indexCount;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4027b0));
                        break;
                    case 59:
                        i4 = indexCount;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4029c0));
                        break;
                    case 60:
                        i4 = indexCount;
                        hVar.a(60, obtainStyledAttributes.getFloat(index, mVar.f4071a));
                        break;
                    case 62:
                        i4 = indexCount;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        i4 = indexCount;
                        hVar.a(63, obtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case 64:
                        i4 = indexCount;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f4061a));
                        break;
                    case 65:
                        i4 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            hVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i4 = indexCount;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i4 = indexCount;
                        hVar.a(67, obtainStyledAttributes.getFloat(index, kVar.f4064e));
                        break;
                    case 68:
                        i4 = indexCount;
                        hVar.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        break;
                    case 69:
                        i4 = indexCount;
                        hVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i4 = indexCount;
                        hVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i4 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f4033f0));
                        break;
                    case 73:
                        i4 = indexCount;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4035g0));
                        break;
                    case 74:
                        i4 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i4 = indexCount;
                        hVar.c(75, obtainStyledAttributes.getBoolean(index, jVar.f4046n0));
                        break;
                    case 76:
                        i4 = indexCount;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f4063c));
                        break;
                    case 77:
                        i4 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i4 = indexCount;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f4068b));
                        break;
                    case 79:
                        i4 = indexCount;
                        hVar.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        break;
                    case 80:
                        i4 = indexCount;
                        hVar.c(80, obtainStyledAttributes.getBoolean(index, jVar.f4042l0));
                        break;
                    case 81:
                        i4 = indexCount;
                        hVar.c(81, obtainStyledAttributes.getBoolean(index, jVar.f4044m0));
                        break;
                    case 82:
                        i4 = indexCount;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f4062b));
                        break;
                    case 83:
                        i4 = indexCount;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.h));
                        break;
                    case 84:
                        i4 = indexCount;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f4066g));
                        break;
                    case 85:
                        i4 = indexCount;
                        hVar.a(85, obtainStyledAttributes.getFloat(index, kVar.f4065f));
                        break;
                    case 86:
                        i4 = indexCount;
                        int i7 = obtainStyledAttributes.peekValue(index).type;
                        if (i7 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                                break;
                            }
                        } else if (i7 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            hVar.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                                break;
                            } else {
                                hVar.b(88, -1);
                                break;
                            }
                        } else {
                            hVar.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i4 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i4 = indexCount;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        i4 = indexCount;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        i4 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i4 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i4 = indexCount;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f4048o0));
                        break;
                    case 98:
                        i4 = indexCount;
                        int i8 = x.a.f3836v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.f4018a = obtainStyledAttributes.getResourceId(index, iVar.f4018a);
                            break;
                        }
                    case 99:
                        i4 = indexCount;
                        hVar.c(99, obtainStyledAttributes.getBoolean(index, jVar.f4034g));
                        break;
                }
                i5 = i6 + 1;
            }
        } else {
            int i9 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i9 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        jVar.f4049p = f(obtainStyledAttributes, index2, jVar.f4049p);
                        continue;
                    case 2:
                        i = indexCount2;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        jVar.f4047o = f(obtainStyledAttributes, index2, jVar.f4047o);
                        continue;
                    case 4:
                        i = indexCount2;
                        jVar.f4045n = f(obtainStyledAttributes, index2, jVar.f4045n);
                        continue;
                    case 5:
                        i = indexCount2;
                        jVar.f4058y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        jVar.f4055v = f(obtainStyledAttributes, index2, jVar.f4055v);
                        continue;
                    case 10:
                        i = indexCount2;
                        jVar.f4054u = f(obtainStyledAttributes, index2, jVar.f4054u);
                        continue;
                    case 11:
                        i = indexCount2;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        jVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        jVar.f4030e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4030e);
                        continue;
                    case 19:
                        i = indexCount2;
                        jVar.f4032f = obtainStyledAttributes.getFloat(index2, jVar.f4032f);
                        continue;
                    case 20:
                        i = indexCount2;
                        jVar.f4056w = obtainStyledAttributes.getFloat(index2, jVar.f4056w);
                        continue;
                    case 21:
                        i = indexCount2;
                        jVar.f4028c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4028c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4067a);
                        lVar.f4067a = i10;
                        lVar.f4067a = iArr[i10];
                        continue;
                    case 23:
                        i = indexCount2;
                        jVar.f4026b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4026b);
                        continue;
                    case 24:
                        i = indexCount2;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        jVar.h = f(obtainStyledAttributes, index2, jVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        jVar.E = obtainStyledAttributes.getInt(index2, jVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        jVar.f4037j = f(obtainStyledAttributes, index2, jVar.f4037j);
                        continue;
                    case 30:
                        i = indexCount2;
                        jVar.f4039k = f(obtainStyledAttributes, index2, jVar.f4039k);
                        continue;
                    case 31:
                        i = indexCount2;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        jVar.f4052s = f(obtainStyledAttributes, index2, jVar.f4052s);
                        continue;
                    case 33:
                        i = indexCount2;
                        jVar.f4053t = f(obtainStyledAttributes, index2, jVar.f4053t);
                        continue;
                    case 34:
                        i = indexCount2;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        jVar.f4043m = f(obtainStyledAttributes, index2, jVar.f4043m);
                        continue;
                    case 36:
                        i = indexCount2;
                        jVar.f4041l = f(obtainStyledAttributes, index2, jVar.f4041l);
                        continue;
                    case 37:
                        i = indexCount2;
                        jVar.f4057x = obtainStyledAttributes.getFloat(index2, jVar.f4057x);
                        continue;
                    case 38:
                        i = indexCount2;
                        iVar.f4018a = obtainStyledAttributes.getResourceId(index2, iVar.f4018a);
                        continue;
                    case 39:
                        i = indexCount2;
                        jVar.U = obtainStyledAttributes.getFloat(index2, jVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        jVar.T = obtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        jVar.V = obtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        jVar.W = obtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        lVar.f4069c = obtainStyledAttributes.getFloat(index2, lVar.f4069c);
                        continue;
                    case 44:
                        i = indexCount2;
                        mVar.f4079l = true;
                        mVar.f4080m = obtainStyledAttributes.getDimension(index2, mVar.f4080m);
                        continue;
                    case 45:
                        i = indexCount2;
                        mVar.f4072b = obtainStyledAttributes.getFloat(index2, mVar.f4072b);
                        continue;
                    case 46:
                        i = indexCount2;
                        mVar.f4073c = obtainStyledAttributes.getFloat(index2, mVar.f4073c);
                        continue;
                    case 47:
                        i = indexCount2;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        mVar.f4074e = obtainStyledAttributes.getFloat(index2, mVar.f4074e);
                        continue;
                    case 49:
                        i = indexCount2;
                        mVar.f4075f = obtainStyledAttributes.getDimension(index2, mVar.f4075f);
                        continue;
                    case 50:
                        i = indexCount2;
                        mVar.f4076g = obtainStyledAttributes.getDimension(index2, mVar.f4076g);
                        continue;
                    case 51:
                        i = indexCount2;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        mVar.f4077j = obtainStyledAttributes.getDimension(index2, mVar.f4077j);
                        continue;
                    case 53:
                        i = indexCount2;
                        mVar.f4078k = obtainStyledAttributes.getDimension(index2, mVar.f4078k);
                        continue;
                    case 54:
                        i = indexCount2;
                        jVar.X = obtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        jVar.f4025a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4025a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        jVar.f4027b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4027b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        jVar.f4029c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4029c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        mVar.f4071a = obtainStyledAttributes.getFloat(index2, mVar.f4071a);
                        continue;
                    case 61:
                        i = indexCount2;
                        jVar.f4059z = f(obtainStyledAttributes, index2, jVar.f4059z);
                        continue;
                    case 62:
                        i = indexCount2;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        jVar.B = obtainStyledAttributes.getFloat(index2, jVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        kVar.f4061a = f(obtainStyledAttributes, index2, kVar.f4061a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        kVar.f4064e = obtainStyledAttributes.getFloat(index2, kVar.f4064e);
                        break;
                    case 68:
                        i = indexCount2;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        jVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        jVar.f4031e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        jVar.f4033f0 = obtainStyledAttributes.getInt(index2, jVar.f4033f0);
                        break;
                    case 73:
                        i = indexCount2;
                        jVar.f4035g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4035g0);
                        break;
                    case 74:
                        i = indexCount2;
                        jVar.f4038j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        jVar.f4046n0 = obtainStyledAttributes.getBoolean(index2, jVar.f4046n0);
                        break;
                    case 76:
                        i = indexCount2;
                        kVar.f4063c = obtainStyledAttributes.getInt(index2, kVar.f4063c);
                        break;
                    case 77:
                        i = indexCount2;
                        jVar.f4040k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f4068b = obtainStyledAttributes.getInt(index2, lVar.f4068b);
                        break;
                    case 79:
                        i = indexCount2;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        jVar.f4042l0 = obtainStyledAttributes.getBoolean(index2, jVar.f4042l0);
                        break;
                    case 81:
                        i = indexCount2;
                        jVar.f4044m0 = obtainStyledAttributes.getBoolean(index2, jVar.f4044m0);
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f4062b = obtainStyledAttributes.getInteger(index2, kVar.f4062b);
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f4066g = obtainStyledAttributes.getInteger(index2, kVar.f4066g);
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f4065f = obtainStyledAttributes.getFloat(index2, kVar.f4065f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
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
                        jVar.f4050q = f(obtainStyledAttributes, index2, jVar.f4050q);
                        break;
                    case 92:
                        i = indexCount2;
                        jVar.f4051r = f(obtainStyledAttributes, index2, jVar.f4051r);
                        break;
                    case 93:
                        i = indexCount2;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        jVar.f4048o0 = obtainStyledAttributes.getInt(index2, jVar.f4048o0);
                        break;
                }
                i9++;
            }
            if (jVar.f4038j0 != null) {
                jVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i4) {
        int resourceId = typedArray.getResourceId(i, i4);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i4) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i5 = typedArray.peekValue(i).type;
        boolean z4 = true;
        int i6 = 0;
        if (i5 == 3) {
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
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i4 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f4058y = trim2;
                        return;
                    } else {
                        if (obj instanceof h) {
                            ((h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof e) {
                            e eVar2 = (e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i4 == 0) {
                                jVar.f4026b = 0;
                                jVar.U = parseFloat;
                                return;
                            } else {
                                jVar.f4028c = 0;
                                jVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i4 == 0) {
                                hVar.b(23, 0);
                                hVar.a(39, parseFloat);
                                return;
                            } else {
                                hVar.b(21, 0);
                                hVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.R = max;
                                eVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.S = max;
                                eVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i4 == 0) {
                                jVar2.f4026b = 0;
                                jVar2.d0 = max;
                                jVar2.X = 2;
                                return;
                            } else {
                                jVar2.f4028c = 0;
                                jVar2.f4031e0 = max;
                                jVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i4 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                                return;
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
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
        if (i5 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i6 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z4 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i4 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i6;
                    eVar4.W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i6;
                    eVar4.X = z4;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i4 == 0) {
                    jVar3.f4026b = i6;
                    jVar3.f4042l0 = z4;
                    return;
                } else {
                    jVar3.f4028c = i6;
                    jVar3.f4044m0 = z4;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i4 == 0) {
                    hVar3.b(23, i6);
                    hVar3.c(80, z4);
                    return;
                } else {
                    hVar3.b(21, i6);
                    hVar3.c(81, z4);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z4 = false;
        i6 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
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
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i4;
        String str;
        HashMap hashMap;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f4085c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
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
                if (nVar.f4084b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.f4019b;
                            j jVar = iVar.d;
                            m mVar = iVar.f4021e;
                            if (childAt instanceof a) {
                                jVar.f4036h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f4033f0);
                                aVar.setMargin(jVar.f4035g0);
                                aVar.setAllowsGoneWidget(jVar.f4046n0);
                                int[] iArr = jVar.i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f4038j0;
                                    if (str3 != null) {
                                        int[] c5 = c(aVar, str3);
                                        jVar.i0 = c5;
                                        aVar.setReferencedIds(c5);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f4022f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (bVar.f3950a) {
                                    i4 = i5;
                                    str = str4;
                                } else {
                                    i4 = i5;
                                    str = "set" + str4;
                                }
                                try {
                                    int a5 = t.e.a(bVar.f3951b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (a5) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3952c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3955g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f3955g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i5 = i4;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f3953e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f3954f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3952c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e8) {
                                    e = e8;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e9) {
                                    e = e9;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i5 = i4;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i5;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f4068b == 0) {
                                childAt.setVisibility(lVar.f4067a);
                            }
                            childAt.setAlpha(lVar.f4069c);
                            childAt.setRotation(mVar.f4071a);
                            childAt.setRotationX(mVar.f4072b);
                            childAt.setRotationY(mVar.f4073c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4074e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4075f)) {
                                    childAt.setPivotX(mVar.f4075f);
                                }
                                if (!Float.isNaN(mVar.f4076g)) {
                                    childAt.setPivotY(mVar.f4076g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4077j);
                            childAt.setTranslationZ(mVar.f4078k);
                            if (mVar.f4079l) {
                                childAt.setElevation(mVar.f4080m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i5;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i5 = i + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i5;
            i5 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.d;
                if (jVar2.f4036h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f3956f = new int[32];
                    aVar2.f3960l = new HashMap();
                    aVar2.h = context;
                    v.a aVar3 = new v.a();
                    aVar3.f3587s0 = 0;
                    aVar3.f3588t0 = true;
                    aVar3.f3589u0 = 0;
                    aVar3.f3590v0 = false;
                    aVar2.f3949o = aVar3;
                    aVar2.i = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f4038j0;
                        if (str5 != null) {
                            int[] c6 = c(aVar2, str5);
                            jVar2.i0 = c6;
                            aVar2.setReferencedIds(c6);
                        }
                    }
                    aVar2.setType(jVar2.f4033f0);
                    aVar2.setMargin(jVar2.f4035g0);
                    e g3 = ConstraintLayout.g();
                    aVar2.i();
                    iVar2.a(g3);
                    constraintLayout.addView(aVar2, g3);
                }
                if (jVar2.f4024a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e g5 = ConstraintLayout.g();
                    iVar2.a(g5);
                    constraintLayout.addView(guideline, g5);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i4;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f4085c;
        hashMap2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4084b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap2.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i4 = i5;
            } else {
                l lVar = iVar.f4019b;
                j jVar = iVar.d;
                m mVar = iVar.f4021e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i4 = i5;
                HashMap hashMap4 = nVar.f4083a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    } catch (NoSuchMethodException e5) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e5);
                    } catch (InvocationTargetException e6) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e6);
                    }
                    hashMap4 = hashMap5;
                }
                iVar.f4022f = hashMap3;
                iVar.f4018a = id;
                jVar.h = eVar.f3968e;
                jVar.i = eVar.f3970f;
                jVar.f4037j = eVar.f3972g;
                jVar.f4039k = eVar.h;
                jVar.f4041l = eVar.i;
                jVar.f4043m = eVar.f3975j;
                jVar.f4045n = eVar.f3977k;
                jVar.f4047o = eVar.f3979l;
                jVar.f4049p = eVar.f3981m;
                jVar.f4050q = eVar.f3983n;
                jVar.f4051r = eVar.f3985o;
                jVar.f4052s = eVar.f3991s;
                jVar.f4053t = eVar.f3992t;
                jVar.f4054u = eVar.f3993u;
                jVar.f4055v = eVar.f3994v;
                jVar.f4056w = eVar.E;
                jVar.f4057x = eVar.F;
                jVar.f4058y = eVar.G;
                jVar.f4059z = eVar.f3987p;
                jVar.A = eVar.f3989q;
                jVar.B = eVar.f3990r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f4032f = eVar.f3966c;
                jVar.d = eVar.f3962a;
                jVar.f4030e = eVar.f3964b;
                jVar.f4026b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f4028c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.f4042l0 = eVar.W;
                jVar.f4044m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.f4025a0 = eVar.Q;
                jVar.f4027b0 = eVar.N;
                jVar.f4029c0 = eVar.O;
                jVar.d0 = eVar.R;
                jVar.f4031e0 = eVar.S;
                jVar.f4040k0 = eVar.Y;
                jVar.N = eVar.f3996x;
                jVar.P = eVar.f3998z;
                jVar.M = eVar.f3995w;
                jVar.O = eVar.f3997y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f4048o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                lVar.f4067a = childAt.getVisibility();
                lVar.f4069c = childAt.getAlpha();
                mVar.f4071a = childAt.getRotation();
                mVar.f4072b = childAt.getRotationX();
                mVar.f4073c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4074e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4075f = pivotX;
                    mVar.f4076g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4077j = childAt.getTranslationY();
                mVar.f4078k = childAt.getTranslationZ();
                if (mVar.f4079l) {
                    mVar.f4080m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f4046n0 = aVar.getAllowsGoneWidget();
                    jVar.i0 = aVar.getReferencedIds();
                    jVar.f4033f0 = aVar.getType();
                    jVar.f4035g0 = aVar.getMargin();
                }
            }
            i5 = i4 + 1;
            nVar = this;
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
                    i d5 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d5.d.f4024a = true;
                    }
                    this.f4085c.put(Integer.valueOf(d5.f4018a), d5);
                }
            }
        } catch (IOException e4) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e4);
        } catch (XmlPullParserException e5) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e5);
        }
    }
}
