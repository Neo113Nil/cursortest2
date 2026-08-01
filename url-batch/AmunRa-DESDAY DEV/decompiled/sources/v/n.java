package v;

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
import q.AbstractC0285e;
import r.AbstractC0288a;
import s.C0292a;
import u.AbstractC0314a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4095e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4096f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4097a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4098b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4099c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4095e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4096f = sparseIntArray2;
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

    public static int[] c(C0316a c0316a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0316a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0316a.isInEditMode() && (c0316a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0316a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1296m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1296m.get(trim);
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
    public static C0324i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0324i c0324i = new C0324i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4103c : r.f4101a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4095e;
        l lVar = c0324i.f4008b;
        String[] strArr = AbstractC0288a.f3524a;
        m mVar = c0324i.f4010e;
        k kVar = c0324i.f4009c;
        C0325j c0325j = c0324i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0323h c0323h = new C0323h();
            c0323h.f3998a = new int[10];
            c0323h.f3999b = new int[10];
            c0323h.f4000c = 0;
            c0323h.d = new int[10];
            c0323h.f4001e = new float[10];
            c0323h.f4002f = 0;
            c0323h.f4003g = new int[5];
            c0323h.h = new String[5];
            c0323h.i = 0;
            c0323h.f4004j = new int[4];
            c0323h.f4005k = new boolean[4];
            c0323h.f4006l = 0;
            kVar.getClass();
            c0325j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4096f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0323h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4020I));
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
                        c0323h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0323h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0325j.f4015C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0323h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0325j.f4016D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0323h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4021J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0323h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4027P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0323h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4028Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0323h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4024M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0323h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4026O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0323h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4029R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0323h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4025N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0323h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0325j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0323h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0325j.f4045e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0323h.a(19, obtainStyledAttributes.getFloat(index, c0325j.f4047f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0323h.a(20, obtainStyledAttributes.getFloat(index, c0325j.f4070w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0323h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0325j.f4042c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0323h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4081a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0323h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0325j.f4040b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0323h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0323h.b(27, obtainStyledAttributes.getInt(index, c0325j.f4017E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0323h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4018G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0323h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4022K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0323h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4019H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0323h.a(37, obtainStyledAttributes.getFloat(index, c0325j.f4071x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0324i.f4007a);
                        c0324i.f4007a = resourceId;
                        c0323h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0323h.a(39, obtainStyledAttributes.getFloat(index, c0325j.f4032U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0323h.a(40, obtainStyledAttributes.getFloat(index, c0325j.f4031T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0323h.b(41, obtainStyledAttributes.getInt(index, c0325j.f4033V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0323h.b(42, obtainStyledAttributes.getInt(index, c0325j.f4034W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0323h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4083c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0323h.c(44, true);
                        c0323h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4094m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0323h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4086b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0323h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4087c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0323h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0323h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4088e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0323h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4089f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0323h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4090g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0323h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0323h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4091j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0323h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4092k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0323h.b(54, obtainStyledAttributes.getInt(index, c0325j.f4035X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0323h.b(55, obtainStyledAttributes.getInt(index, c0325j.f4036Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0323h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4037Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0323h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4039a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0323h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4041b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0323h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4043c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0323h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4085a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0323h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4013A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0323h.a(63, obtainStyledAttributes.getFloat(index, c0325j.f4014B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0323h.b(64, f(obtainStyledAttributes, index, kVar.f4075a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0323h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0323h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0323h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0323h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4078e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0323h.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0323h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0323h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0323h.b(72, obtainStyledAttributes.getInt(index, c0325j.f4048f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0323h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4050g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0323h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0323h.c(75, obtainStyledAttributes.getBoolean(index, c0325j.n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0323h.b(76, obtainStyledAttributes.getInt(index, kVar.f4077c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0323h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0323h.b(78, obtainStyledAttributes.getInt(index, lVar.f4082b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0323h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0323h.c(80, obtainStyledAttributes.getBoolean(index, c0325j.f4057l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0323h.c(81, obtainStyledAttributes.getBoolean(index, c0325j.f4059m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0323h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4076b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0323h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0323h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4080g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0323h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4079f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0323h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0323h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0323h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0323h.b(89, resourceId3);
                                c0323h.b(88, -2);
                            } else {
                                c0323h.b(88, -1);
                            }
                        } else {
                            c0323h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0323h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4023L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0323h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0325j.f4030S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0323h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0323h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0323h.b(97, obtainStyledAttributes.getInt(index, c0325j.f4062o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0314a.f3887s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0324i.f4007a = obtainStyledAttributes.getResourceId(index, c0324i.f4007a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0323h.c(99, obtainStyledAttributes.getBoolean(index, c0325j.f4049g));
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
                    kVar.getClass();
                    c0325j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4063p = f(obtainStyledAttributes, index2, c0325j.f4063p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4020I = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4020I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4061o = f(obtainStyledAttributes, index2, c0325j.f4061o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4060n = f(obtainStyledAttributes, index2, c0325j.f4060n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4072y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4015C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0325j.f4015C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4016D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0325j.f4016D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4021J = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4021J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4069v = f(obtainStyledAttributes, index2, c0325j.f4069v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4068u = f(obtainStyledAttributes, index2, c0325j.f4068u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4027P = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4027P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4028Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4028Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4024M = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4024M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4026O = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4026O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4029R = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4029R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4025N = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4025N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0325j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4045e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0325j.f4045e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4047f = obtainStyledAttributes.getFloat(index2, c0325j.f4047f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4070w = obtainStyledAttributes.getFloat(index2, c0325j.f4070w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4042c = obtainStyledAttributes.getLayoutDimension(index2, c0325j.f4042c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4081a);
                        lVar.f4081a = i10;
                        lVar.f4081a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4040b = obtainStyledAttributes.getLayoutDimension(index2, c0325j.f4040b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.h = f(obtainStyledAttributes, index2, c0325j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.i = f(obtainStyledAttributes, index2, c0325j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4017E = obtainStyledAttributes.getInt(index2, c0325j.f4017E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4018G = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4018G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4053j = f(obtainStyledAttributes, index2, c0325j.f4053j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4054k = f(obtainStyledAttributes, index2, c0325j.f4054k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4022K = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4022K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4066s = f(obtainStyledAttributes, index2, c0325j.f4066s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4067t = f(obtainStyledAttributes, index2, c0325j.f4067t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4019H = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4019H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4058m = f(obtainStyledAttributes, index2, c0325j.f4058m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4056l = f(obtainStyledAttributes, index2, c0325j.f4056l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4071x = obtainStyledAttributes.getFloat(index2, c0325j.f4071x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0324i.f4007a = obtainStyledAttributes.getResourceId(index2, c0324i.f4007a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4032U = obtainStyledAttributes.getFloat(index2, c0325j.f4032U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4031T = obtainStyledAttributes.getFloat(index2, c0325j.f4031T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4033V = obtainStyledAttributes.getInt(index2, c0325j.f4033V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4034W = obtainStyledAttributes.getInt(index2, c0325j.f4034W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4083c = obtainStyledAttributes.getFloat(index2, lVar.f4083c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4093l = true;
                        mVar.f4094m = obtainStyledAttributes.getDimension(index2, mVar.f4094m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4086b = obtainStyledAttributes.getFloat(index2, mVar.f4086b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4087c = obtainStyledAttributes.getFloat(index2, mVar.f4087c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4088e = obtainStyledAttributes.getFloat(index2, mVar.f4088e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4089f = obtainStyledAttributes.getDimension(index2, mVar.f4089f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4090g = obtainStyledAttributes.getDimension(index2, mVar.f4090g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4091j = obtainStyledAttributes.getDimension(index2, mVar.f4091j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4092k = obtainStyledAttributes.getDimension(index2, mVar.f4092k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4035X = obtainStyledAttributes.getInt(index2, c0325j.f4035X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4036Y = obtainStyledAttributes.getInt(index2, c0325j.f4036Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4037Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4037Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4039a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4039a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4041b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4041b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4043c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4043c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4085a = obtainStyledAttributes.getFloat(index2, mVar.f4085a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4073z = f(obtainStyledAttributes, index2, c0325j.f4073z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4013A = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4013A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325j.f4014B = obtainStyledAttributes.getFloat(index2, c0325j.f4014B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4075a = f(obtainStyledAttributes, index2, kVar.f4075a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f4078e = obtainStyledAttributes.getFloat(index2, kVar.f4078e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0325j.f4044d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0325j.f4046e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0325j.f4048f0 = obtainStyledAttributes.getInt(index2, c0325j.f4048f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4050g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4050g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.n0 = obtainStyledAttributes.getBoolean(index2, c0325j.n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4077c = obtainStyledAttributes.getInt(index2, kVar.f4077c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4055k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4082b = obtainStyledAttributes.getInt(index2, lVar.f4082b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4057l0 = obtainStyledAttributes.getBoolean(index2, c0325j.f4057l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4059m0 = obtainStyledAttributes.getBoolean(index2, c0325j.f4059m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4076b = obtainStyledAttributes.getInteger(index2, kVar.f4076b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4080g = obtainStyledAttributes.getInteger(index2, kVar.f4080g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4079f = obtainStyledAttributes.getFloat(index2, kVar.f4079f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
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
                        c0325j.f4064q = f(obtainStyledAttributes, index2, c0325j.f4064q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4065r = f(obtainStyledAttributes, index2, c0325j.f4065r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4023L = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4023L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4030S = obtainStyledAttributes.getDimensionPixelSize(index2, c0325j.f4030S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0325j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0325j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0325j.f4062o0 = obtainStyledAttributes.getInt(index2, c0325j.f4062o0);
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
            if (c0325j.j0 != null) {
                c0325j.f4052i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0324i;
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
                    if (obj instanceof C0320e) {
                        C0320e c0320e = (C0320e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0320e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0320e).height = 0;
                        }
                        h(c0320e, trim2);
                        return;
                    }
                    if (obj instanceof C0325j) {
                        ((C0325j) obj).f4072y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0323h) {
                            ((C0323h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0320e) {
                            C0320e c0320e2 = (C0320e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0320e2).width = 0;
                                c0320e2.f3932H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0320e2).height = 0;
                                c0320e2.f3933I = parseFloat;
                            }
                        } else if (obj instanceof C0325j) {
                            C0325j c0325j = (C0325j) obj;
                            if (i2 == 0) {
                                c0325j.f4040b = 0;
                                c0325j.f4032U = parseFloat;
                            } else {
                                c0325j.f4042c = 0;
                                c0325j.f4031T = parseFloat;
                            }
                        } else if (obj instanceof C0323h) {
                            C0323h c0323h = (C0323h) obj;
                            if (i2 == 0) {
                                c0323h.b(23, 0);
                                c0323h.a(39, parseFloat);
                            } else {
                                c0323h.b(21, 0);
                                c0323h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0320e) {
                            C0320e c0320e3 = (C0320e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0320e3).width = 0;
                                c0320e3.f3942R = max;
                                c0320e3.f3936L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0320e3).height = 0;
                                c0320e3.f3943S = max;
                                c0320e3.f3937M = 2;
                            }
                        } else if (obj instanceof C0325j) {
                            C0325j c0325j2 = (C0325j) obj;
                            if (i2 == 0) {
                                c0325j2.f4040b = 0;
                                c0325j2.f4044d0 = max;
                                c0325j2.f4035X = 2;
                            } else {
                                c0325j2.f4042c = 0;
                                c0325j2.f4046e0 = max;
                                c0325j2.f4036Y = 2;
                            }
                        } else if (obj instanceof C0323h) {
                            C0323h c0323h2 = (C0323h) obj;
                            if (i2 == 0) {
                                c0323h2.b(23, 0);
                                c0323h2.b(54, 2);
                            } else {
                                c0323h2.b(21, 0);
                                c0323h2.b(55, 2);
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
            if (!(obj instanceof C0320e)) {
                C0320e c0320e4 = (C0320e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0320e4).width = i4;
                    c0320e4.f3947W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0320e4).height = i4;
                    c0320e4.f3948X = z2;
                    return;
                }
            }
            if (obj instanceof C0325j) {
                C0325j c0325j3 = (C0325j) obj;
                if (i2 == 0) {
                    c0325j3.f4040b = i4;
                    c0325j3.f4057l0 = z2;
                    return;
                } else {
                    c0325j3.f4042c = i4;
                    c0325j3.f4059m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0323h) {
                C0323h c0323h3 = (C0323h) obj;
                if (i2 == 0) {
                    c0323h3.b(23, i4);
                    c0323h3.c(80, z2);
                    return;
                } else {
                    c0323h3.b(21, i4);
                    c0323h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0320e)) {
        }
    }

    public static void h(C0320e c0320e, String str) {
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
        c0320e.f3931G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f4099c;
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
                if (nVar.f4098b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0324i c0324i = (C0324i) hashMap2.get(Integer.valueOf(id));
                        if (c0324i != null) {
                            if (childAt instanceof C0316a) {
                                C0325j c0325j = c0324i.d;
                                c0325j.f4051h0 = 1;
                                C0316a c0316a = (C0316a) childAt;
                                c0316a.setId(id);
                                c0316a.setType(c0325j.f4048f0);
                                c0316a.setMargin(c0325j.f4050g0);
                                c0316a.setAllowsGoneWidget(c0325j.n0);
                                int[] iArr = c0325j.f4052i0;
                                if (iArr != null) {
                                    c0316a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0325j.j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0316a, str3);
                                        c0325j.f4052i0 = c2;
                                        c0316a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0320e c0320e = (C0320e) childAt.getLayoutParams();
                            c0320e.a();
                            c0324i.a(c0320e);
                            HashMap hashMap3 = c0324i.f4011f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0317b c0317b = (C0317b) hashMap3.get(str4);
                                if (c0317b.f3913a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0285e.a(c0317b.f3914b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0317b.f3915c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0317b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0317b.f3918g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0317b.f3918g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0317b.f3916e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0317b.f3917f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0317b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0317b.f3915c));
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
                            childAt.setLayoutParams(c0320e);
                            l lVar = c0324i.f4008b;
                            if (lVar.f4082b == 0) {
                                childAt.setVisibility(lVar.f4081a);
                            }
                            childAt.setAlpha(lVar.f4083c);
                            m mVar = c0324i.f4010e;
                            childAt.setRotation(mVar.f4085a);
                            childAt.setRotationX(mVar.f4086b);
                            childAt.setRotationY(mVar.f4087c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4088e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4089f)) {
                                    childAt.setPivotX(mVar.f4089f);
                                }
                                if (!Float.isNaN(mVar.f4090g)) {
                                    childAt.setPivotY(mVar.f4090g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4091j);
                            childAt.setTranslationZ(mVar.f4092k);
                            if (mVar.f4093l) {
                                childAt.setElevation(mVar.f4094m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    nVar = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            nVar = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0324i c0324i2 = (C0324i) hashMap2.get(num);
            if (c0324i2 != null) {
                C0325j c0325j2 = c0324i2.d;
                if (c0325j2.f4051h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0316a c0316a2 = new C0316a(context);
                    c0316a2.f3919a = new int[32];
                    c0316a2.f3924g = new HashMap();
                    c0316a2.f3921c = context;
                    C0292a c0292a = new C0292a();
                    c0292a.f3639s0 = 0;
                    c0292a.f3640t0 = true;
                    c0292a.f3641u0 = 0;
                    c0292a.f3642v0 = false;
                    c0316a2.f3912j = c0292a;
                    c0316a2.d = c0292a;
                    c0316a2.i();
                    c0316a2.setVisibility(8);
                    c0316a2.setId(num.intValue());
                    int[] iArr2 = c0325j2.f4052i0;
                    if (iArr2 != null) {
                        c0316a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0325j2.j0;
                        if (str5 != null) {
                            int[] c3 = c(c0316a2, str5);
                            c0325j2.f4052i0 = c3;
                            c0316a2.setReferencedIds(c3);
                        }
                    }
                    c0316a2.setType(c0325j2.f4048f0);
                    c0316a2.setMargin(c0325j2.f4050g0);
                    C0320e g2 = ConstraintLayout.g();
                    c0316a2.i();
                    c0324i2.a(g2);
                    constraintLayout.addView(c0316a2, g2);
                }
                if (c0325j2.f4038a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0320e g3 = ConstraintLayout.g();
                    c0324i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0318c) {
                ((AbstractC0318c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4099c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0320e c0320e = (C0320e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4098b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0324i());
            }
            C0324i c0324i = (C0324i) hashMap.get(Integer.valueOf(id));
            if (c0324i != null) {
                HashMap hashMap2 = nVar.f4097a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0317b c0317b = (C0317b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0317b(c0317b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0317b(c0317b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0324i.f4011f = hashMap3;
                c0324i.f4007a = id;
                int i2 = c0320e.f3958e;
                C0325j c0325j = c0324i.d;
                c0325j.h = i2;
                c0325j.i = c0320e.f3960f;
                c0325j.f4053j = c0320e.f3962g;
                c0325j.f4054k = c0320e.h;
                c0325j.f4056l = c0320e.i;
                c0325j.f4058m = c0320e.f3966j;
                c0325j.f4060n = c0320e.f3967k;
                c0325j.f4061o = c0320e.f3969l;
                c0325j.f4063p = c0320e.f3971m;
                c0325j.f4064q = c0320e.f3973n;
                c0325j.f4065r = c0320e.f3974o;
                c0325j.f4066s = c0320e.f3980s;
                c0325j.f4067t = c0320e.f3981t;
                c0325j.f4068u = c0320e.f3982u;
                c0325j.f4069v = c0320e.f3983v;
                c0325j.f4070w = c0320e.f3930E;
                c0325j.f4071x = c0320e.F;
                c0325j.f4072y = c0320e.f3931G;
                c0325j.f4073z = c0320e.f3976p;
                c0325j.f4013A = c0320e.f3978q;
                c0325j.f4014B = c0320e.f3979r;
                c0325j.f4015C = c0320e.f3944T;
                c0325j.f4016D = c0320e.f3945U;
                c0325j.f4017E = c0320e.f3946V;
                c0325j.f4047f = c0320e.f3955c;
                c0325j.d = c0320e.f3951a;
                c0325j.f4045e = c0320e.f3953b;
                c0325j.f4040b = ((ViewGroup.MarginLayoutParams) c0320e).width;
                c0325j.f4042c = ((ViewGroup.MarginLayoutParams) c0320e).height;
                c0325j.F = ((ViewGroup.MarginLayoutParams) c0320e).leftMargin;
                c0325j.f4018G = ((ViewGroup.MarginLayoutParams) c0320e).rightMargin;
                c0325j.f4019H = ((ViewGroup.MarginLayoutParams) c0320e).topMargin;
                c0325j.f4020I = ((ViewGroup.MarginLayoutParams) c0320e).bottomMargin;
                c0325j.f4023L = c0320e.f3929D;
                c0325j.f4031T = c0320e.f3933I;
                c0325j.f4032U = c0320e.f3932H;
                c0325j.f4034W = c0320e.f3935K;
                c0325j.f4033V = c0320e.f3934J;
                c0325j.f4057l0 = c0320e.f3947W;
                c0325j.f4059m0 = c0320e.f3948X;
                c0325j.f4035X = c0320e.f3936L;
                c0325j.f4036Y = c0320e.f3937M;
                c0325j.f4037Z = c0320e.f3940P;
                c0325j.f4039a0 = c0320e.f3941Q;
                c0325j.f4041b0 = c0320e.f3938N;
                c0325j.f4043c0 = c0320e.f3939O;
                c0325j.f4044d0 = c0320e.f3942R;
                c0325j.f4046e0 = c0320e.f3943S;
                c0325j.f4055k0 = c0320e.f3949Y;
                c0325j.f4025N = c0320e.f3985x;
                c0325j.f4027P = c0320e.f3987z;
                c0325j.f4024M = c0320e.f3984w;
                c0325j.f4026O = c0320e.f3986y;
                c0325j.f4029R = c0320e.f3926A;
                c0325j.f4028Q = c0320e.f3927B;
                c0325j.f4030S = c0320e.f3928C;
                c0325j.f4062o0 = c0320e.f3950Z;
                c0325j.f4021J = c0320e.getMarginEnd();
                c0325j.f4022K = c0320e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0324i.f4008b;
                lVar.f4081a = visibility;
                lVar.f4083c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0324i.f4010e;
                mVar.f4085a = rotation;
                mVar.f4086b = childAt.getRotationX();
                mVar.f4087c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4088e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4089f = pivotX;
                    mVar.f4090g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4091j = childAt.getTranslationY();
                mVar.f4092k = childAt.getTranslationZ();
                if (mVar.f4093l) {
                    mVar.f4094m = childAt.getElevation();
                }
                if (childAt instanceof C0316a) {
                    C0316a c0316a = (C0316a) childAt;
                    c0325j.n0 = c0316a.getAllowsGoneWidget();
                    c0325j.f4052i0 = c0316a.getReferencedIds();
                    c0325j.f4048f0 = c0316a.getType();
                    c0325j.f4050g0 = c0316a.getMargin();
                }
            }
            i++;
            nVar = this;
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
                    C0324i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4038a = true;
                    }
                    this.f4099c.put(Integer.valueOf(d2.f4007a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
