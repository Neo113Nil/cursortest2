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
import s.C0290a;
import u.AbstractC0312a;

/* loaded from: classes.dex */
public final class o {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4019e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4020f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4021a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4022b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4023c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4019e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4020f = sparseIntArray2;
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

    public static int[] c(C0314a c0314a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0314a.getContext();
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
            if (i == 0 && c0314a.isInEditMode() && (c0314a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0314a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1366m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1366m.get(trim);
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
    public static C0323j d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0323j c0323j = new C0323j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? s.f4027c : s.f4025a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4019e;
        m mVar = c0323j.f3931b;
        String[] strArr = AbstractC0288a.f3497a;
        n nVar = c0323j.f3933e;
        l lVar = c0323j.f3932c;
        k kVar = c0323j.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0322i c0322i = new C0322i();
            c0322i.f3921a = new int[10];
            c0322i.f3922b = new int[10];
            c0322i.f3923c = 0;
            c0322i.d = new int[10];
            c0322i.f3924e = new float[10];
            c0322i.f3925f = 0;
            c0322i.f3926g = new int[5];
            c0322i.h = new String[5];
            c0322i.i = 0;
            c0322i.f3927j = new int[4];
            c0322i.f3928k = new boolean[4];
            c0322i.f3929l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4020f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0322i.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3943I));
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
                        c0322i.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0322i.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3938C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0322i.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3939D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0322i.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3944J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0322i.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3950P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0322i.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3951Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0322i.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3947M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0322i.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3949O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0322i.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3952R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0322i.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3948N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0322i.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0322i.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3968e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0322i.a(19, obtainStyledAttributes.getFloat(index, kVar.f3970f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0322i.a(20, obtainStyledAttributes.getFloat(index, kVar.f3994w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0322i.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f3965c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0322i.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f4005a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0322i.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f3963b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0322i.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0322i.b(27, obtainStyledAttributes.getInt(index, kVar.f3940E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0322i.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3941G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0322i.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3945K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0322i.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3942H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0322i.a(37, obtainStyledAttributes.getFloat(index, kVar.f3995x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0323j.f3930a);
                        c0323j.f3930a = resourceId;
                        c0322i.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0322i.a(39, obtainStyledAttributes.getFloat(index, kVar.f3955U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0322i.a(40, obtainStyledAttributes.getFloat(index, kVar.f3954T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0322i.b(41, obtainStyledAttributes.getInt(index, kVar.f3956V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0322i.b(42, obtainStyledAttributes.getInt(index, kVar.f3957W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0322i.a(43, obtainStyledAttributes.getFloat(index, mVar.f4007c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0322i.c(44, true);
                        c0322i.a(44, obtainStyledAttributes.getDimension(index, nVar.f4018m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0322i.a(45, obtainStyledAttributes.getFloat(index, nVar.f4010b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0322i.a(46, obtainStyledAttributes.getFloat(index, nVar.f4011c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0322i.a(47, obtainStyledAttributes.getFloat(index, nVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0322i.a(48, obtainStyledAttributes.getFloat(index, nVar.f4012e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0322i.a(49, obtainStyledAttributes.getDimension(index, nVar.f4013f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0322i.a(50, obtainStyledAttributes.getDimension(index, nVar.f4014g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0322i.a(51, obtainStyledAttributes.getDimension(index, nVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0322i.a(52, obtainStyledAttributes.getDimension(index, nVar.f4015j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0322i.a(53, obtainStyledAttributes.getDimension(index, nVar.f4016k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0322i.b(54, obtainStyledAttributes.getInt(index, kVar.f3958X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0322i.b(55, obtainStyledAttributes.getInt(index, kVar.f3959Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0322i.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3960Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0322i.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3962a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0322i.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3964b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0322i.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3966c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0322i.a(60, obtainStyledAttributes.getFloat(index, nVar.f4009a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0322i.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3936A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0322i.a(63, obtainStyledAttributes.getFloat(index, kVar.f3937B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0322i.b(64, f(obtainStyledAttributes, index, lVar.f3999a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0322i.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0322i.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0322i.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0322i.a(67, obtainStyledAttributes.getFloat(index, lVar.f4002e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0322i.a(68, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0322i.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0322i.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0322i.b(72, obtainStyledAttributes.getInt(index, kVar.f3971f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0322i.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3973g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0322i.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0322i.c(75, obtainStyledAttributes.getBoolean(index, kVar.n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0322i.b(76, obtainStyledAttributes.getInt(index, lVar.f4001c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0322i.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0322i.b(78, obtainStyledAttributes.getInt(index, mVar.f4006b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0322i.a(79, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0322i.c(80, obtainStyledAttributes.getBoolean(index, kVar.f3981l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0322i.c(81, obtainStyledAttributes.getBoolean(index, kVar.f3983m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0322i.b(82, obtainStyledAttributes.getInteger(index, lVar.f4000b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0322i.b(83, f(obtainStyledAttributes, index, nVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0322i.b(84, obtainStyledAttributes.getInteger(index, lVar.f4004g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0322i.a(85, obtainStyledAttributes.getFloat(index, lVar.f4003f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            c0322i.b(89, resourceId2);
                            if (lVar.i != -1) {
                                c0322i.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.h = string;
                            c0322i.d(string, 90);
                            if (lVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                c0322i.b(89, resourceId3);
                                c0322i.b(88, -2);
                            } else {
                                c0322i.b(88, -1);
                            }
                        } else {
                            c0322i.b(88, obtainStyledAttributes.getInteger(index, lVar.i));
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
                        c0322i.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3946L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0322i.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3953S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0322i, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0322i, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0322i.b(97, obtainStyledAttributes.getInt(index, kVar.f3986o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0312a.f3798s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0323j.f3930a = obtainStyledAttributes.getResourceId(index, c0323j.f3930a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0322i.c(99, obtainStyledAttributes.getBoolean(index, kVar.f3972g));
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
                        kVar.f3987p = f(obtainStyledAttributes, index2, kVar.f3987p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3943I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3943I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3985o = f(obtainStyledAttributes, index2, kVar.f3985o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3984n = f(obtainStyledAttributes, index2, kVar.f3984n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3996y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3938C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3938C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3939D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3939D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3944J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3944J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3993v = f(obtainStyledAttributes, index2, kVar.f3993v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3992u = f(obtainStyledAttributes, index2, kVar.f3992u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3950P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3950P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3951Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3951Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3947M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3947M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3949O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3949O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3952R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3952R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3948N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3948N);
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
                        kVar.f3968e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3968e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3970f = obtainStyledAttributes.getFloat(index2, kVar.f3970f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3994w = obtainStyledAttributes.getFloat(index2, kVar.f3994w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3965c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3965c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, mVar.f4005a);
                        mVar.f4005a = i10;
                        mVar.f4005a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3963b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3963b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
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
                        kVar.f3940E = obtainStyledAttributes.getInt(index2, kVar.f3940E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3941G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3941G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3976j = f(obtainStyledAttributes, index2, kVar.f3976j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3978k = f(obtainStyledAttributes, index2, kVar.f3978k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3945K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3945K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3990s = f(obtainStyledAttributes, index2, kVar.f3990s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3991t = f(obtainStyledAttributes, index2, kVar.f3991t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3942H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3942H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3982m = f(obtainStyledAttributes, index2, kVar.f3982m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3980l = f(obtainStyledAttributes, index2, kVar.f3980l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3995x = obtainStyledAttributes.getFloat(index2, kVar.f3995x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0323j.f3930a = obtainStyledAttributes.getResourceId(index2, c0323j.f3930a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3955U = obtainStyledAttributes.getFloat(index2, kVar.f3955U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3954T = obtainStyledAttributes.getFloat(index2, kVar.f3954T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3956V = obtainStyledAttributes.getInt(index2, kVar.f3956V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3957W = obtainStyledAttributes.getInt(index2, kVar.f3957W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4007c = obtainStyledAttributes.getFloat(index2, mVar.f4007c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4017l = true;
                        nVar.f4018m = obtainStyledAttributes.getDimension(index2, nVar.f4018m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4010b = obtainStyledAttributes.getFloat(index2, nVar.f4010b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4011c = obtainStyledAttributes.getFloat(index2, nVar.f4011c);
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
                        nVar.f4012e = obtainStyledAttributes.getFloat(index2, nVar.f4012e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4013f = obtainStyledAttributes.getDimension(index2, nVar.f4013f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4014g = obtainStyledAttributes.getDimension(index2, nVar.f4014g);
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
                        nVar.f4015j = obtainStyledAttributes.getDimension(index2, nVar.f4015j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4016k = obtainStyledAttributes.getDimension(index2, nVar.f4016k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3958X = obtainStyledAttributes.getInt(index2, kVar.f3958X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3959Y = obtainStyledAttributes.getInt(index2, kVar.f3959Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3960Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3960Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3962a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3962a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3964b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3964b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3966c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3966c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4009a = obtainStyledAttributes.getFloat(index2, nVar.f4009a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3997z = f(obtainStyledAttributes, index2, kVar.f3997z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3936A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3936A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3937B = obtainStyledAttributes.getFloat(index2, kVar.f3937B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f3999a = f(obtainStyledAttributes, index2, lVar.f3999a);
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
                        lVar.f4002e = obtainStyledAttributes.getFloat(index2, lVar.f4002e);
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
                        kVar.f3967d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f3969e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        kVar.f3971f0 = obtainStyledAttributes.getInt(index2, kVar.f3971f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3973g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3973g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3977j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        kVar.n0 = obtainStyledAttributes.getBoolean(index2, kVar.n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4001c = obtainStyledAttributes.getInt(index2, lVar.f4001c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3979k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        mVar.f4006b = obtainStyledAttributes.getInt(index2, mVar.f4006b);
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
                        kVar.f3981l0 = obtainStyledAttributes.getBoolean(index2, kVar.f3981l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3983m0 = obtainStyledAttributes.getBoolean(index2, kVar.f3983m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4000b = obtainStyledAttributes.getInteger(index2, lVar.f4000b);
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
                        lVar.f4004g = obtainStyledAttributes.getInteger(index2, lVar.f4004g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4003f = obtainStyledAttributes.getFloat(index2, lVar.f4003f);
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
                        kVar.f3988q = f(obtainStyledAttributes, index2, kVar.f3988q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3989r = f(obtainStyledAttributes, index2, kVar.f3989r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3946L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3946L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3953S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3953S);
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
                        kVar.f3986o0 = obtainStyledAttributes.getInt(index2, kVar.f3986o0);
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
            if (kVar.f3977j0 != null) {
                kVar.f3975i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0323j;
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
                    if (obj instanceof C0318e) {
                        C0318e c0318e = (C0318e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0318e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0318e).height = 0;
                        }
                        h(c0318e, trim2);
                        return;
                    }
                    if (obj instanceof k) {
                        ((k) obj).f3996y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0322i) {
                            ((C0322i) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0318e) {
                            C0318e c0318e2 = (C0318e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0318e2).width = 0;
                                c0318e2.f3851H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0318e2).height = 0;
                                c0318e2.f3852I = parseFloat;
                            }
                        } else if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i2 == 0) {
                                kVar.f3963b = 0;
                                kVar.f3955U = parseFloat;
                            } else {
                                kVar.f3965c = 0;
                                kVar.f3954T = parseFloat;
                            }
                        } else if (obj instanceof C0322i) {
                            C0322i c0322i = (C0322i) obj;
                            if (i2 == 0) {
                                c0322i.b(23, 0);
                                c0322i.a(39, parseFloat);
                            } else {
                                c0322i.b(21, 0);
                                c0322i.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0318e) {
                            C0318e c0318e3 = (C0318e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0318e3).width = 0;
                                c0318e3.f3861R = max;
                                c0318e3.f3855L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0318e3).height = 0;
                                c0318e3.f3862S = max;
                                c0318e3.f3856M = 2;
                            }
                        } else if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i2 == 0) {
                                kVar2.f3963b = 0;
                                kVar2.f3967d0 = max;
                                kVar2.f3958X = 2;
                            } else {
                                kVar2.f3965c = 0;
                                kVar2.f3969e0 = max;
                                kVar2.f3959Y = 2;
                            }
                        } else if (obj instanceof C0322i) {
                            C0322i c0322i2 = (C0322i) obj;
                            if (i2 == 0) {
                                c0322i2.b(23, 0);
                                c0322i2.b(54, 2);
                            } else {
                                c0322i2.b(21, 0);
                                c0322i2.b(55, 2);
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
            if (!(obj instanceof C0318e)) {
                C0318e c0318e4 = (C0318e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0318e4).width = i4;
                    c0318e4.f3866W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0318e4).height = i4;
                    c0318e4.f3867X = z2;
                    return;
                }
            }
            if (obj instanceof k) {
                k kVar3 = (k) obj;
                if (i2 == 0) {
                    kVar3.f3963b = i4;
                    kVar3.f3981l0 = z2;
                    return;
                } else {
                    kVar3.f3965c = i4;
                    kVar3.f3983m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0322i) {
                C0322i c0322i3 = (C0322i) obj;
                if (i2 == 0) {
                    c0322i3.b(23, i4);
                    c0322i3.c(80, z2);
                    return;
                } else {
                    c0322i3.b(21, i4);
                    c0322i3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0318e)) {
        }
    }

    public static void h(C0318e c0318e, String str) {
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
        c0318e.f3850G = str;
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
        HashMap hashMap2 = oVar.f4023c;
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
                if (oVar.f4022b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0323j c0323j = (C0323j) hashMap2.get(Integer.valueOf(id));
                        if (c0323j != null) {
                            if (childAt instanceof C0314a) {
                                k kVar = c0323j.d;
                                kVar.f3974h0 = 1;
                                C0314a c0314a = (C0314a) childAt;
                                c0314a.setId(id);
                                c0314a.setType(kVar.f3971f0);
                                c0314a.setMargin(kVar.f3973g0);
                                c0314a.setAllowsGoneWidget(kVar.n0);
                                int[] iArr = kVar.f3975i0;
                                if (iArr != null) {
                                    c0314a.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f3977j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0314a, str3);
                                        kVar.f3975i0 = c2;
                                        c0314a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0318e c0318e = (C0318e) childAt.getLayoutParams();
                            c0318e.a();
                            c0323j.a(c0318e);
                            HashMap hashMap3 = c0323j.f3934f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0315b c0315b = (C0315b) hashMap3.get(str4);
                                if (c0315b.f3832a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0285e.a(c0315b.f3833b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0315b.f3834c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0315b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0315b.f3837g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0315b.f3837g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0315b.f3835e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0315b.f3836f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0315b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0315b.f3834c));
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
                            childAt.setLayoutParams(c0318e);
                            m mVar = c0323j.f3931b;
                            if (mVar.f4006b == 0) {
                                childAt.setVisibility(mVar.f4005a);
                            }
                            childAt.setAlpha(mVar.f4007c);
                            n nVar = c0323j.f3933e;
                            childAt.setRotation(nVar.f4009a);
                            childAt.setRotationX(nVar.f4010b);
                            childAt.setRotationY(nVar.f4011c);
                            childAt.setScaleX(nVar.d);
                            childAt.setScaleY(nVar.f4012e);
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
                                if (!Float.isNaN(nVar.f4013f)) {
                                    childAt.setPivotX(nVar.f4013f);
                                }
                                if (!Float.isNaN(nVar.f4014g)) {
                                    childAt.setPivotY(nVar.f4014g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f4015j);
                            childAt.setTranslationZ(nVar.f4016k);
                            if (nVar.f4017l) {
                                childAt.setElevation(nVar.f4018m);
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
            C0323j c0323j2 = (C0323j) hashMap2.get(num);
            if (c0323j2 != null) {
                k kVar2 = c0323j2.d;
                if (kVar2.f3974h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0314a c0314a2 = new C0314a(context);
                    c0314a2.f3838a = new int[32];
                    c0314a2.f3843g = new HashMap();
                    c0314a2.f3840c = context;
                    C0290a c0290a = new C0290a();
                    c0290a.f3501s0 = 0;
                    c0290a.f3502t0 = true;
                    c0290a.f3503u0 = 0;
                    c0290a.f3504v0 = false;
                    c0314a2.f3831j = c0290a;
                    c0314a2.d = c0290a;
                    c0314a2.i();
                    c0314a2.setVisibility(8);
                    c0314a2.setId(num.intValue());
                    int[] iArr2 = kVar2.f3975i0;
                    if (iArr2 != null) {
                        c0314a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f3977j0;
                        if (str5 != null) {
                            int[] c3 = c(c0314a2, str5);
                            kVar2.f3975i0 = c3;
                            c0314a2.setReferencedIds(c3);
                        }
                    }
                    c0314a2.setType(kVar2.f3971f0);
                    c0314a2.setMargin(kVar2.f3973g0);
                    C0318e g2 = ConstraintLayout.g();
                    c0314a2.i();
                    c0323j2.a(g2);
                    constraintLayout.addView(c0314a2, g2);
                }
                if (kVar2.f3961a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    C0318e g3 = ConstraintLayout.g();
                    c0323j2.a(g3);
                    constraintLayout.addView(qVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0316c) {
                ((AbstractC0316c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = oVar.f4023c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0318e c0318e = (C0318e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f4022b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0323j());
            }
            C0323j c0323j = (C0323j) hashMap.get(Integer.valueOf(id));
            if (c0323j != null) {
                HashMap hashMap2 = oVar.f4021a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0315b c0315b = (C0315b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0315b(c0315b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0315b(c0315b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0323j.f3934f = hashMap3;
                c0323j.f3930a = id;
                int i2 = c0318e.f3877e;
                k kVar = c0323j.d;
                kVar.h = i2;
                kVar.i = c0318e.f3879f;
                kVar.f3976j = c0318e.f3881g;
                kVar.f3978k = c0318e.h;
                kVar.f3980l = c0318e.i;
                kVar.f3982m = c0318e.f3885j;
                kVar.f3984n = c0318e.f3887k;
                kVar.f3985o = c0318e.f3889l;
                kVar.f3987p = c0318e.f3891m;
                kVar.f3988q = c0318e.f3893n;
                kVar.f3989r = c0318e.f3894o;
                kVar.f3990s = c0318e.f3900s;
                kVar.f3991t = c0318e.f3901t;
                kVar.f3992u = c0318e.f3902u;
                kVar.f3993v = c0318e.f3903v;
                kVar.f3994w = c0318e.f3849E;
                kVar.f3995x = c0318e.F;
                kVar.f3996y = c0318e.f3850G;
                kVar.f3997z = c0318e.f3896p;
                kVar.f3936A = c0318e.f3898q;
                kVar.f3937B = c0318e.f3899r;
                kVar.f3938C = c0318e.f3863T;
                kVar.f3939D = c0318e.f3864U;
                kVar.f3940E = c0318e.f3865V;
                kVar.f3970f = c0318e.f3874c;
                kVar.d = c0318e.f3870a;
                kVar.f3968e = c0318e.f3872b;
                kVar.f3963b = ((ViewGroup.MarginLayoutParams) c0318e).width;
                kVar.f3965c = ((ViewGroup.MarginLayoutParams) c0318e).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) c0318e).leftMargin;
                kVar.f3941G = ((ViewGroup.MarginLayoutParams) c0318e).rightMargin;
                kVar.f3942H = ((ViewGroup.MarginLayoutParams) c0318e).topMargin;
                kVar.f3943I = ((ViewGroup.MarginLayoutParams) c0318e).bottomMargin;
                kVar.f3946L = c0318e.f3848D;
                kVar.f3954T = c0318e.f3852I;
                kVar.f3955U = c0318e.f3851H;
                kVar.f3957W = c0318e.f3854K;
                kVar.f3956V = c0318e.f3853J;
                kVar.f3981l0 = c0318e.f3866W;
                kVar.f3983m0 = c0318e.f3867X;
                kVar.f3958X = c0318e.f3855L;
                kVar.f3959Y = c0318e.f3856M;
                kVar.f3960Z = c0318e.f3859P;
                kVar.f3962a0 = c0318e.f3860Q;
                kVar.f3964b0 = c0318e.f3857N;
                kVar.f3966c0 = c0318e.f3858O;
                kVar.f3967d0 = c0318e.f3861R;
                kVar.f3969e0 = c0318e.f3862S;
                kVar.f3979k0 = c0318e.f3868Y;
                kVar.f3948N = c0318e.f3905x;
                kVar.f3950P = c0318e.f3907z;
                kVar.f3947M = c0318e.f3904w;
                kVar.f3949O = c0318e.f3906y;
                kVar.f3952R = c0318e.f3845A;
                kVar.f3951Q = c0318e.f3846B;
                kVar.f3953S = c0318e.f3847C;
                kVar.f3986o0 = c0318e.f3869Z;
                kVar.f3944J = c0318e.getMarginEnd();
                kVar.f3945K = c0318e.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = c0323j.f3931b;
                mVar.f4005a = visibility;
                mVar.f4007c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = c0323j.f3933e;
                nVar.f4009a = rotation;
                nVar.f4010b = childAt.getRotationX();
                nVar.f4011c = childAt.getRotationY();
                nVar.d = childAt.getScaleX();
                nVar.f4012e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f4013f = pivotX;
                    nVar.f4014g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f4015j = childAt.getTranslationY();
                nVar.f4016k = childAt.getTranslationZ();
                if (nVar.f4017l) {
                    nVar.f4018m = childAt.getElevation();
                }
                if (childAt instanceof C0314a) {
                    C0314a c0314a = (C0314a) childAt;
                    kVar.n0 = c0314a.getAllowsGoneWidget();
                    kVar.f3975i0 = c0314a.getReferencedIds();
                    kVar.f3971f0 = c0314a.getType();
                    kVar.f3973g0 = c0314a.getMargin();
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
                    C0323j d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f3961a = true;
                    }
                    this.f4023c.put(Integer.valueOf(d2.f3930a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
