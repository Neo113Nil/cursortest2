package x;

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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC0267e;
import t.AbstractC0270a;
import u.C0272a;
import w.AbstractC0294a;

/* loaded from: classes.dex */
public final class o {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4136e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4137f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4138a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4139b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4140c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4136e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4137f = sparseIntArray2;
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

    public static int[] c(C0300a c0300a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0300a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0300a.isInEditMode() && (c0300a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0300a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1468m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1468m.get(trim);
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

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    public static C0309j d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0309j c0309j = new C0309j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? s.f4144c : s.f4142a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4136e;
        m mVar = c0309j.f4048b;
        String[] strArr = AbstractC0270a.f3613a;
        n nVar = c0309j.f4050e;
        l lVar = c0309j.f4049c;
        k kVar = c0309j.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0308i c0308i = new C0308i();
            c0308i.f4038a = new int[10];
            c0308i.f4039b = new int[10];
            c0308i.f4040c = 0;
            c0308i.d = new int[10];
            c0308i.f4041e = new float[10];
            c0308i.f4042f = 0;
            c0308i.f4043g = new int[5];
            c0308i.h = new String[5];
            c0308i.i = 0;
            c0308i.f4044j = new int[4];
            c0308i.f4045k = new boolean[4];
            c0308i.f4046l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4137f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0308i.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4059I));
                        i3 = 1;
                        break;
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
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c0308i.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0308i.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4054C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0308i.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4055D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0308i.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4060J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0308i.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4066P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0308i.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4067Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0308i.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4063M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0308i.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4065O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0308i.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4068R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0308i.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4064N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0308i.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0308i.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4084e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0308i.a(19, obtainStyledAttributes.getFloat(index, kVar.f4086f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0308i.a(20, obtainStyledAttributes.getFloat(index, kVar.f4111w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0308i.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f4081c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0308i.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f4122a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0308i.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f4079b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0308i.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4057F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0308i.b(27, obtainStyledAttributes.getInt(index, kVar.f4056E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0308i.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4058G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0308i.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4061K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0308i.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0308i.a(37, obtainStyledAttributes.getFloat(index, kVar.f4112x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0309j.f4047a);
                        c0309j.f4047a = resourceId;
                        c0308i.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0308i.a(39, obtainStyledAttributes.getFloat(index, kVar.f4071U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0308i.a(40, obtainStyledAttributes.getFloat(index, kVar.f4070T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0308i.b(41, obtainStyledAttributes.getInt(index, kVar.f4072V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0308i.b(42, obtainStyledAttributes.getInt(index, kVar.f4073W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0308i.a(43, obtainStyledAttributes.getFloat(index, mVar.f4124c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0308i.c(44, true);
                        c0308i.a(44, obtainStyledAttributes.getDimension(index, nVar.f4135m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0308i.a(45, obtainStyledAttributes.getFloat(index, nVar.f4127b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0308i.a(46, obtainStyledAttributes.getFloat(index, nVar.f4128c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0308i.a(47, obtainStyledAttributes.getFloat(index, nVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0308i.a(48, obtainStyledAttributes.getFloat(index, nVar.f4129e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0308i.a(49, obtainStyledAttributes.getDimension(index, nVar.f4130f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0308i.a(50, obtainStyledAttributes.getDimension(index, nVar.f4131g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0308i.a(51, obtainStyledAttributes.getDimension(index, nVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0308i.a(52, obtainStyledAttributes.getDimension(index, nVar.f4132j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0308i.a(53, obtainStyledAttributes.getDimension(index, nVar.f4133k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0308i.b(54, obtainStyledAttributes.getInt(index, kVar.f4074X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0308i.b(55, obtainStyledAttributes.getInt(index, kVar.f4075Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0308i.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4076Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0308i.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4078a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0308i.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4080b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0308i.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4082c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0308i.a(60, obtainStyledAttributes.getFloat(index, nVar.f4126a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0308i.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4052A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0308i.a(63, obtainStyledAttributes.getFloat(index, kVar.f4053B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0308i.b(64, f(obtainStyledAttributes, index, lVar.f4116a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0308i.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0308i.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0308i.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0308i.a(67, obtainStyledAttributes.getFloat(index, lVar.f4119e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0308i.a(68, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0308i.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0308i.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0308i.b(72, obtainStyledAttributes.getInt(index, kVar.f4087f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0308i.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4089g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0308i.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0308i.c(75, obtainStyledAttributes.getBoolean(index, kVar.f4101n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0308i.b(76, obtainStyledAttributes.getInt(index, lVar.f4118c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0308i.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0308i.b(78, obtainStyledAttributes.getInt(index, mVar.f4123b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0308i.a(79, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0308i.c(80, obtainStyledAttributes.getBoolean(index, kVar.f4097l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0308i.c(81, obtainStyledAttributes.getBoolean(index, kVar.f4099m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0308i.b(82, obtainStyledAttributes.getInteger(index, lVar.f4117b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0308i.b(83, f(obtainStyledAttributes, index, nVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0308i.b(84, obtainStyledAttributes.getInteger(index, lVar.f4121g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0308i.a(85, obtainStyledAttributes.getFloat(index, lVar.f4120f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            c0308i.b(89, resourceId2);
                            if (lVar.i != -1) {
                                c0308i.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.h = string;
                            c0308i.d(string, 90);
                            if (lVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                c0308i.b(89, resourceId3);
                                c0308i.b(88, -2);
                            } else {
                                c0308i.b(88, -1);
                            }
                        } else {
                            c0308i.b(88, obtainStyledAttributes.getInteger(index, lVar.i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c0308i.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4062L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0308i.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4069S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0308i, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0308i, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0308i.b(97, obtainStyledAttributes.getInt(index, kVar.f4103o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0294a.f3915s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0309j.f4047a = obtainStyledAttributes.getResourceId(index, c0309j.f4047a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0308i.c(99, obtainStyledAttributes.getBoolean(index, kVar.f4088g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    lVar.getClass();
                    kVar.getClass();
                    nVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4104p = f(obtainStyledAttributes, index2, kVar.f4104p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4059I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4059I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4102o = f(obtainStyledAttributes, index2, kVar.f4102o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4100n = f(obtainStyledAttributes, index2, kVar.f4100n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4113y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4054C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4054C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4055D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4055D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4060J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4060J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4110v = f(obtainStyledAttributes, index2, kVar.f4110v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4109u = f(obtainStyledAttributes, index2, kVar.f4109u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4066P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4066P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4067Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4067Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4063M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4063M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4065O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4065O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4068R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4068R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4064N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4064N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4084e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4084e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4086f = obtainStyledAttributes.getFloat(index2, kVar.f4086f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4111w = obtainStyledAttributes.getFloat(index2, kVar.f4111w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4081c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f4081c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, mVar.f4122a);
                        mVar.f4122a = i10;
                        mVar.f4122a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4079b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f4079b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4057F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4057F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.h = f(obtainStyledAttributes, index2, kVar.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.i = f(obtainStyledAttributes, index2, kVar.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4056E = obtainStyledAttributes.getInt(index2, kVar.f4056E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4058G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4058G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4092j = f(obtainStyledAttributes, index2, kVar.f4092j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4094k = f(obtainStyledAttributes, index2, kVar.f4094k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4061K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4061K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4107s = f(obtainStyledAttributes, index2, kVar.f4107s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4108t = f(obtainStyledAttributes, index2, kVar.f4108t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4098m = f(obtainStyledAttributes, index2, kVar.f4098m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4096l = f(obtainStyledAttributes, index2, kVar.f4096l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4112x = obtainStyledAttributes.getFloat(index2, kVar.f4112x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0309j.f4047a = obtainStyledAttributes.getResourceId(index2, c0309j.f4047a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4071U = obtainStyledAttributes.getFloat(index2, kVar.f4071U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4070T = obtainStyledAttributes.getFloat(index2, kVar.f4070T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4072V = obtainStyledAttributes.getInt(index2, kVar.f4072V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4073W = obtainStyledAttributes.getInt(index2, kVar.f4073W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4124c = obtainStyledAttributes.getFloat(index2, mVar.f4124c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4134l = true;
                        nVar.f4135m = obtainStyledAttributes.getDimension(index2, nVar.f4135m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4127b = obtainStyledAttributes.getFloat(index2, nVar.f4127b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4128c = obtainStyledAttributes.getFloat(index2, nVar.f4128c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.d = obtainStyledAttributes.getFloat(index2, nVar.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4129e = obtainStyledAttributes.getFloat(index2, nVar.f4129e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4130f = obtainStyledAttributes.getDimension(index2, nVar.f4130f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4131g = obtainStyledAttributes.getDimension(index2, nVar.f4131g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.i = obtainStyledAttributes.getDimension(index2, nVar.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4132j = obtainStyledAttributes.getDimension(index2, nVar.f4132j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4133k = obtainStyledAttributes.getDimension(index2, nVar.f4133k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4074X = obtainStyledAttributes.getInt(index2, kVar.f4074X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4075Y = obtainStyledAttributes.getInt(index2, kVar.f4075Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4076Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4076Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4078a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4078a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4080b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4080b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4082c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4082c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4126a = obtainStyledAttributes.getFloat(index2, nVar.f4126a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4114z = f(obtainStyledAttributes, index2, kVar.f4114z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4052A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4052A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4053B = obtainStyledAttributes.getFloat(index2, kVar.f4053B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4116a = f(obtainStyledAttributes, index2, lVar.f4116a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f4119e = obtainStyledAttributes.getFloat(index2, lVar.f4119e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f4083d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f4085e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4087f0 = obtainStyledAttributes.getInt(index2, kVar.f4087f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4089g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4089g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4093j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4101n0 = obtainStyledAttributes.getBoolean(index2, kVar.f4101n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4118c = obtainStyledAttributes.getInt(index2, lVar.f4118c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4095k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        mVar.f4123b = obtainStyledAttributes.getInt(index2, mVar.f4123b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4097l0 = obtainStyledAttributes.getBoolean(index2, kVar.f4097l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4099m0 = obtainStyledAttributes.getBoolean(index2, kVar.f4099m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4117b = obtainStyledAttributes.getInteger(index2, lVar.f4117b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        nVar.h = f(obtainStyledAttributes, index2, nVar.h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4121g = obtainStyledAttributes.getInteger(index2, lVar.f4121g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4120f = obtainStyledAttributes.getFloat(index2, lVar.f4120f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            lVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            lVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, lVar.i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4105q = f(obtainStyledAttributes, index2, kVar.f4105q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4106r = f(obtainStyledAttributes, index2, kVar.f4106r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4062L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4062L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4069S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4069S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(kVar, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(kVar, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4103o0 = obtainStyledAttributes.getInt(index2, kVar.f4103o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i8 = i2;
                str6 = str3;
                str7 = str10;
            }
            if (kVar.f4093j0 != null) {
                kVar.f4091i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0309j;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
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
                    if (obj instanceof C0304e) {
                        C0304e c0304e = (C0304e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0304e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0304e).height = 0;
                        }
                        h(c0304e, trim2);
                        return;
                    }
                    if (obj instanceof k) {
                        ((k) obj).f4113y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0308i) {
                            ((C0308i) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0304e) {
                            C0304e c0304e2 = (C0304e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0304e2).width = 0;
                                c0304e2.H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0304e2).height = 0;
                                c0304e2.f3969I = parseFloat;
                            }
                        } else if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i2 == 0) {
                                kVar.f4079b = 0;
                                kVar.f4071U = parseFloat;
                            } else {
                                kVar.f4081c = 0;
                                kVar.f4070T = parseFloat;
                            }
                        } else if (obj instanceof C0308i) {
                            C0308i c0308i = (C0308i) obj;
                            if (i2 == 0) {
                                c0308i.b(23, 0);
                                c0308i.a(39, parseFloat);
                            } else {
                                c0308i.b(21, 0);
                                c0308i.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0304e) {
                            C0304e c0304e3 = (C0304e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0304e3).width = 0;
                                c0304e3.f3978R = max;
                                c0304e3.f3972L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0304e3).height = 0;
                                c0304e3.f3979S = max;
                                c0304e3.f3973M = 2;
                            }
                        } else if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i2 == 0) {
                                kVar2.f4079b = 0;
                                kVar2.f4083d0 = max;
                                kVar2.f4074X = 2;
                            } else {
                                kVar2.f4081c = 0;
                                kVar2.f4085e0 = max;
                                kVar2.f4075Y = 2;
                            }
                        } else if (obj instanceof C0308i) {
                            C0308i c0308i2 = (C0308i) obj;
                            if (i2 == 0) {
                                c0308i2.b(23, 0);
                                c0308i2.b(54, 2);
                            } else {
                                c0308i2.b(21, 0);
                                c0308i2.b(55, 2);
                            }
                        }
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
                z2 = false;
            }
            if (!(obj instanceof C0304e)) {
                C0304e c0304e4 = (C0304e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0304e4).width = i4;
                    c0304e4.f3983W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0304e4).height = i4;
                    c0304e4.f3984X = z2;
                    return;
                }
            }
            if (obj instanceof k) {
                k kVar3 = (k) obj;
                if (i2 == 0) {
                    kVar3.f4079b = i4;
                    kVar3.f4097l0 = z2;
                    return;
                } else {
                    kVar3.f4081c = i4;
                    kVar3.f4099m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0308i) {
                C0308i c0308i3 = (C0308i) obj;
                if (i2 == 0) {
                    c0308i3.b(23, i4);
                    c0308i3.c(80, z2);
                    return;
                } else {
                    c0308i3.b(21, i4);
                    c0308i3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0304e)) {
        }
    }

    public static void h(C0304e c0304e, String str) {
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
        c0304e.f3968G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f4140c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
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
                if (oVar.f4139b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0309j c0309j = (C0309j) hashMap2.get(Integer.valueOf(id));
                        if (c0309j != null) {
                            if (childAt instanceof C0300a) {
                                k kVar = c0309j.d;
                                kVar.f4090h0 = 1;
                                C0300a c0300a = (C0300a) childAt;
                                c0300a.setId(id);
                                c0300a.setType(kVar.f4087f0);
                                c0300a.setMargin(kVar.f4089g0);
                                c0300a.setAllowsGoneWidget(kVar.f4101n0);
                                int[] iArr = kVar.f4091i0;
                                if (iArr != null) {
                                    c0300a.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f4093j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0300a, str3);
                                        kVar.f4091i0 = c2;
                                        c0300a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0304e c0304e = (C0304e) childAt.getLayoutParams();
                            c0304e.a();
                            c0309j.a(c0304e);
                            HashMap hashMap3 = c0309j.f4051f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0301b c0301b = (C0301b) hashMap3.get(str4);
                                if (c0301b.f3949a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0267e.a(c0301b.f3950b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0301b.f3951c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0301b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0301b.f3954g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0301b.f3954g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0301b.f3952e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0301b.f3953f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0301b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0301b.f3951c));
                                            i2 = childCount;
                                            break;
                                        default:
                                            i2 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i2 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i2 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i2;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c0304e);
                            m mVar = c0309j.f4048b;
                            if (mVar.f4123b == 0) {
                                childAt.setVisibility(mVar.f4122a);
                            }
                            childAt.setAlpha(mVar.f4124c);
                            n nVar = c0309j.f4050e;
                            childAt.setRotation(nVar.f4126a);
                            childAt.setRotationX(nVar.f4127b);
                            childAt.setRotationY(nVar.f4128c);
                            childAt.setScaleX(nVar.d);
                            childAt.setScaleY(nVar.f4129e);
                            if (nVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f4130f)) {
                                    childAt.setPivotX(nVar.f4130f);
                                }
                                if (!Float.isNaN(nVar.f4131g)) {
                                    childAt.setPivotY(nVar.f4131g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f4132j);
                            childAt.setTranslationZ(nVar.f4133k);
                            if (nVar.f4134l) {
                                childAt.setElevation(nVar.f4135m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    oVar = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            oVar = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0309j c0309j2 = (C0309j) hashMap2.get(num);
            if (c0309j2 != null) {
                k kVar2 = c0309j2.d;
                if (kVar2.f4090h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0300a c0300a2 = new C0300a(context);
                    c0300a2.f3955a = new int[32];
                    c0300a2.f3960g = new HashMap();
                    c0300a2.f3957c = context;
                    C0272a c0272a = new C0272a();
                    c0272a.f3617s0 = 0;
                    c0272a.f3618t0 = true;
                    c0272a.f3619u0 = 0;
                    c0272a.f3620v0 = false;
                    c0300a2.f3948j = c0272a;
                    c0300a2.d = c0272a;
                    c0300a2.i();
                    c0300a2.setVisibility(8);
                    c0300a2.setId(num.intValue());
                    int[] iArr2 = kVar2.f4091i0;
                    if (iArr2 != null) {
                        c0300a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f4093j0;
                        if (str5 != null) {
                            int[] c3 = c(c0300a2, str5);
                            kVar2.f4091i0 = c3;
                            c0300a2.setReferencedIds(c3);
                        }
                    }
                    c0300a2.setType(kVar2.f4087f0);
                    c0300a2.setMargin(kVar2.f4089g0);
                    C0304e g2 = ConstraintLayout.g();
                    c0300a2.i();
                    c0309j2.a(g2);
                    constraintLayout.addView(c0300a2, g2);
                }
                if (kVar2.f4077a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    C0304e g3 = ConstraintLayout.g();
                    c0309j2.a(g3);
                    constraintLayout.addView(qVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0302c) {
                ((AbstractC0302c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = oVar.f4140c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0304e c0304e = (C0304e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f4139b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0309j());
            }
            C0309j c0309j = (C0309j) hashMap.get(Integer.valueOf(id));
            if (c0309j != null) {
                HashMap hashMap2 = oVar.f4138a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0301b c0301b = (C0301b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0301b(c0301b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0301b(c0301b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0309j.f4051f = hashMap3;
                c0309j.f4047a = id;
                int i2 = c0304e.f3994e;
                k kVar = c0309j.d;
                kVar.h = i2;
                kVar.i = c0304e.f3996f;
                kVar.f4092j = c0304e.f3998g;
                kVar.f4094k = c0304e.h;
                kVar.f4096l = c0304e.i;
                kVar.f4098m = c0304e.f4002j;
                kVar.f4100n = c0304e.f4004k;
                kVar.f4102o = c0304e.f4006l;
                kVar.f4104p = c0304e.f4008m;
                kVar.f4105q = c0304e.f4010n;
                kVar.f4106r = c0304e.f4012o;
                kVar.f4107s = c0304e.f4017s;
                kVar.f4108t = c0304e.f4018t;
                kVar.f4109u = c0304e.f4019u;
                kVar.f4110v = c0304e.f4020v;
                kVar.f4111w = c0304e.f3966E;
                kVar.f4112x = c0304e.f3967F;
                kVar.f4113y = c0304e.f3968G;
                kVar.f4114z = c0304e.f4014p;
                kVar.f4052A = c0304e.f4015q;
                kVar.f4053B = c0304e.f4016r;
                kVar.f4054C = c0304e.f3980T;
                kVar.f4055D = c0304e.f3981U;
                kVar.f4056E = c0304e.f3982V;
                kVar.f4086f = c0304e.f3991c;
                kVar.d = c0304e.f3987a;
                kVar.f4084e = c0304e.f3989b;
                kVar.f4079b = ((ViewGroup.MarginLayoutParams) c0304e).width;
                kVar.f4081c = ((ViewGroup.MarginLayoutParams) c0304e).height;
                kVar.f4057F = ((ViewGroup.MarginLayoutParams) c0304e).leftMargin;
                kVar.f4058G = ((ViewGroup.MarginLayoutParams) c0304e).rightMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) c0304e).topMargin;
                kVar.f4059I = ((ViewGroup.MarginLayoutParams) c0304e).bottomMargin;
                kVar.f4062L = c0304e.f3965D;
                kVar.f4070T = c0304e.f3969I;
                kVar.f4071U = c0304e.H;
                kVar.f4073W = c0304e.f3971K;
                kVar.f4072V = c0304e.f3970J;
                kVar.f4097l0 = c0304e.f3983W;
                kVar.f4099m0 = c0304e.f3984X;
                kVar.f4074X = c0304e.f3972L;
                kVar.f4075Y = c0304e.f3973M;
                kVar.f4076Z = c0304e.f3976P;
                kVar.f4078a0 = c0304e.f3977Q;
                kVar.f4080b0 = c0304e.f3974N;
                kVar.f4082c0 = c0304e.f3975O;
                kVar.f4083d0 = c0304e.f3978R;
                kVar.f4085e0 = c0304e.f3979S;
                kVar.f4095k0 = c0304e.f3985Y;
                kVar.f4064N = c0304e.f4022x;
                kVar.f4066P = c0304e.f4024z;
                kVar.f4063M = c0304e.f4021w;
                kVar.f4065O = c0304e.f4023y;
                kVar.f4068R = c0304e.f3962A;
                kVar.f4067Q = c0304e.f3963B;
                kVar.f4069S = c0304e.f3964C;
                kVar.f4103o0 = c0304e.f3986Z;
                kVar.f4060J = c0304e.getMarginEnd();
                kVar.f4061K = c0304e.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = c0309j.f4048b;
                mVar.f4122a = visibility;
                mVar.f4124c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = c0309j.f4050e;
                nVar.f4126a = rotation;
                nVar.f4127b = childAt.getRotationX();
                nVar.f4128c = childAt.getRotationY();
                nVar.d = childAt.getScaleX();
                nVar.f4129e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f4130f = pivotX;
                    nVar.f4131g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f4132j = childAt.getTranslationY();
                nVar.f4133k = childAt.getTranslationZ();
                if (nVar.f4134l) {
                    nVar.f4135m = childAt.getElevation();
                }
                if (childAt instanceof C0300a) {
                    C0300a c0300a = (C0300a) childAt;
                    kVar.f4101n0 = c0300a.getAllowsGoneWidget();
                    kVar.f4091i0 = c0300a.getReferencedIds();
                    kVar.f4087f0 = c0300a.getType();
                    kVar.f4089g0 = c0300a.getMargin();
                }
            }
            i++;
            oVar = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0309j d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4077a = true;
                    }
                    this.f4140c.put(Integer.valueOf(d2.f4047a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
