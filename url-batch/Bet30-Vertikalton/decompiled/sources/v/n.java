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
import q.AbstractC0290e;
import r.AbstractC0293a;
import s.C0295a;
import u.AbstractC0317a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4021e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4022f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4023a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4024b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4025c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4021e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4022f = sparseIntArray2;
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

    public static int[] c(C0319a c0319a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0319a.getContext();
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
            if (i == 0 && c0319a.isInEditMode() && (c0319a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0319a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1261m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1261m.get(trim);
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
    public static C0327i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0327i c0327i = new C0327i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4029c : r.f4027a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4021e;
        l lVar = c0327i.f3933b;
        String[] strArr = AbstractC0293a.f3573a;
        m mVar = c0327i.f3935e;
        k kVar = c0327i.f3934c;
        C0328j c0328j = c0327i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0326h c0326h = new C0326h();
            c0326h.f3923a = new int[10];
            c0326h.f3924b = new int[10];
            c0326h.f3925c = 0;
            c0326h.d = new int[10];
            c0326h.f3926e = new float[10];
            c0326h.f3927f = 0;
            c0326h.f3928g = new int[5];
            c0326h.h = new String[5];
            c0326h.i = 0;
            c0326h.f3929j = new int[4];
            c0326h.f3930k = new boolean[4];
            c0326h.f3931l = 0;
            kVar.getClass();
            c0328j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4022f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0326h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3945I));
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
                        c0326h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0326h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f3940C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0326h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f3941D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0326h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3946J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0326h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3952P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0326h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3953Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0326h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3949M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0326h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3951O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0326h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3954R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0326h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3950N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0326h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0326h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f3970e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0326h.a(19, obtainStyledAttributes.getFloat(index, c0328j.f3972f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0326h.a(20, obtainStyledAttributes.getFloat(index, c0328j.f3996w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0326h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0328j.f3967c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0326h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4007a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0326h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0328j.f3965b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0326h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0326h.b(27, obtainStyledAttributes.getInt(index, c0328j.f3942E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0326h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3943G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0326h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3947K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0326h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3944H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0326h.a(37, obtainStyledAttributes.getFloat(index, c0328j.f3997x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0327i.f3932a);
                        c0327i.f3932a = resourceId;
                        c0326h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0326h.a(39, obtainStyledAttributes.getFloat(index, c0328j.f3957U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0326h.a(40, obtainStyledAttributes.getFloat(index, c0328j.f3956T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0326h.b(41, obtainStyledAttributes.getInt(index, c0328j.f3958V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0326h.b(42, obtainStyledAttributes.getInt(index, c0328j.f3959W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0326h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4009c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0326h.c(44, true);
                        c0326h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4020m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0326h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4012b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0326h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4013c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0326h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0326h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4014e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0326h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4015f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0326h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4016g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0326h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0326h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4017j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0326h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4018k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0326h.b(54, obtainStyledAttributes.getInt(index, c0328j.f3960X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0326h.b(55, obtainStyledAttributes.getInt(index, c0328j.f3961Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0326h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3962Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0326h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3964a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0326h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3966b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0326h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3968c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0326h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4011a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0326h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3938A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0326h.a(63, obtainStyledAttributes.getFloat(index, c0328j.f3939B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0326h.b(64, f(obtainStyledAttributes, index, kVar.f4001a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0326h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0326h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0326h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0326h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4004e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0326h.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0326h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0326h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0326h.b(72, obtainStyledAttributes.getInt(index, c0328j.f3973f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0326h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3975g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0326h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0326h.c(75, obtainStyledAttributes.getBoolean(index, c0328j.f3986n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0326h.b(76, obtainStyledAttributes.getInt(index, kVar.f4003c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0326h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0326h.b(78, obtainStyledAttributes.getInt(index, lVar.f4008b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0326h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0326h.c(80, obtainStyledAttributes.getBoolean(index, c0328j.f3982l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0326h.c(81, obtainStyledAttributes.getBoolean(index, c0328j.f3984m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0326h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4002b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0326h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0326h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4006g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0326h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4005f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0326h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0326h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0326h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0326h.b(89, resourceId3);
                                c0326h.b(88, -2);
                            } else {
                                c0326h.b(88, -1);
                            }
                        } else {
                            c0326h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0326h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3948L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0326h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f3955S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0326h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0326h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0326h.b(97, obtainStyledAttributes.getInt(index, c0328j.f3988o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0317a.f3824s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0327i.f3932a = obtainStyledAttributes.getResourceId(index, c0327i.f3932a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0326h.c(99, obtainStyledAttributes.getBoolean(index, c0328j.f3974g));
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
                    c0328j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3989p = f(obtainStyledAttributes, index2, c0328j.f3989p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3945I = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3945I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3987o = f(obtainStyledAttributes, index2, c0328j.f3987o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3985n = f(obtainStyledAttributes, index2, c0328j.f3985n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3998y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3940C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f3940C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3941D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f3941D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3946J = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3946J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3995v = f(obtainStyledAttributes, index2, c0328j.f3995v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3994u = f(obtainStyledAttributes, index2, c0328j.f3994u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3952P = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3952P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3953Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3953Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3949M = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3949M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3951O = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3951O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3954R = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3954R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3950N = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3950N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3970e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f3970e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3972f = obtainStyledAttributes.getFloat(index2, c0328j.f3972f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3996w = obtainStyledAttributes.getFloat(index2, c0328j.f3996w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3967c = obtainStyledAttributes.getLayoutDimension(index2, c0328j.f3967c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4007a);
                        lVar.f4007a = i10;
                        lVar.f4007a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3965b = obtainStyledAttributes.getLayoutDimension(index2, c0328j.f3965b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.h = f(obtainStyledAttributes, index2, c0328j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.i = f(obtainStyledAttributes, index2, c0328j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3942E = obtainStyledAttributes.getInt(index2, c0328j.f3942E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3943G = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3943G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3978j = f(obtainStyledAttributes, index2, c0328j.f3978j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3979k = f(obtainStyledAttributes, index2, c0328j.f3979k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3947K = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3947K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3992s = f(obtainStyledAttributes, index2, c0328j.f3992s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3993t = f(obtainStyledAttributes, index2, c0328j.f3993t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3944H = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3944H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3983m = f(obtainStyledAttributes, index2, c0328j.f3983m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3981l = f(obtainStyledAttributes, index2, c0328j.f3981l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3997x = obtainStyledAttributes.getFloat(index2, c0328j.f3997x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0327i.f3932a = obtainStyledAttributes.getResourceId(index2, c0327i.f3932a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3957U = obtainStyledAttributes.getFloat(index2, c0328j.f3957U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3956T = obtainStyledAttributes.getFloat(index2, c0328j.f3956T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3958V = obtainStyledAttributes.getInt(index2, c0328j.f3958V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3959W = obtainStyledAttributes.getInt(index2, c0328j.f3959W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4009c = obtainStyledAttributes.getFloat(index2, lVar.f4009c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4019l = true;
                        mVar.f4020m = obtainStyledAttributes.getDimension(index2, mVar.f4020m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4012b = obtainStyledAttributes.getFloat(index2, mVar.f4012b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4013c = obtainStyledAttributes.getFloat(index2, mVar.f4013c);
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
                        mVar.f4014e = obtainStyledAttributes.getFloat(index2, mVar.f4014e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4015f = obtainStyledAttributes.getDimension(index2, mVar.f4015f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4016g = obtainStyledAttributes.getDimension(index2, mVar.f4016g);
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
                        mVar.f4017j = obtainStyledAttributes.getDimension(index2, mVar.f4017j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4018k = obtainStyledAttributes.getDimension(index2, mVar.f4018k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3960X = obtainStyledAttributes.getInt(index2, c0328j.f3960X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3961Y = obtainStyledAttributes.getInt(index2, c0328j.f3961Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3962Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3962Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3964a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3964a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3966b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3966b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3968c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3968c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4011a = obtainStyledAttributes.getFloat(index2, mVar.f4011a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3999z = f(obtainStyledAttributes, index2, c0328j.f3999z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3938A = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3938A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f3939B = obtainStyledAttributes.getFloat(index2, c0328j.f3939B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4001a = f(obtainStyledAttributes, index2, kVar.f4001a);
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
                        kVar.f4004e = obtainStyledAttributes.getFloat(index2, kVar.f4004e);
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
                        c0328j.f3969d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0328j.f3971e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0328j.f3973f0 = obtainStyledAttributes.getInt(index2, c0328j.f3973f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3975g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3975g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3986n0 = obtainStyledAttributes.getBoolean(index2, c0328j.f3986n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4003c = obtainStyledAttributes.getInt(index2, kVar.f4003c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3980k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4008b = obtainStyledAttributes.getInt(index2, lVar.f4008b);
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
                        c0328j.f3982l0 = obtainStyledAttributes.getBoolean(index2, c0328j.f3982l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3984m0 = obtainStyledAttributes.getBoolean(index2, c0328j.f3984m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4002b = obtainStyledAttributes.getInteger(index2, kVar.f4002b);
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
                        kVar.f4006g = obtainStyledAttributes.getInteger(index2, kVar.f4006g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4005f = obtainStyledAttributes.getFloat(index2, kVar.f4005f);
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
                        c0328j.f3990q = f(obtainStyledAttributes, index2, c0328j.f3990q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3991r = f(obtainStyledAttributes, index2, c0328j.f3991r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3948L = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3948L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3955S = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f3955S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0328j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0328j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f3988o0 = obtainStyledAttributes.getInt(index2, c0328j.f3988o0);
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
            if (c0328j.j0 != null) {
                c0328j.f3977i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0327i;
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
                    if (obj instanceof C0323e) {
                        C0323e c0323e = (C0323e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0323e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0323e).height = 0;
                        }
                        h(c0323e, trim2);
                        return;
                    }
                    if (obj instanceof C0328j) {
                        ((C0328j) obj).f3998y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0326h) {
                            ((C0326h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0323e) {
                            C0323e c0323e2 = (C0323e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0323e2).width = 0;
                                c0323e2.f3856H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0323e2).height = 0;
                                c0323e2.f3857I = parseFloat;
                            }
                        } else if (obj instanceof C0328j) {
                            C0328j c0328j = (C0328j) obj;
                            if (i2 == 0) {
                                c0328j.f3965b = 0;
                                c0328j.f3957U = parseFloat;
                            } else {
                                c0328j.f3967c = 0;
                                c0328j.f3956T = parseFloat;
                            }
                        } else if (obj instanceof C0326h) {
                            C0326h c0326h = (C0326h) obj;
                            if (i2 == 0) {
                                c0326h.b(23, 0);
                                c0326h.a(39, parseFloat);
                            } else {
                                c0326h.b(21, 0);
                                c0326h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0323e) {
                            C0323e c0323e3 = (C0323e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0323e3).width = 0;
                                c0323e3.f3866R = max;
                                c0323e3.f3860L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0323e3).height = 0;
                                c0323e3.f3867S = max;
                                c0323e3.f3861M = 2;
                            }
                        } else if (obj instanceof C0328j) {
                            C0328j c0328j2 = (C0328j) obj;
                            if (i2 == 0) {
                                c0328j2.f3965b = 0;
                                c0328j2.f3969d0 = max;
                                c0328j2.f3960X = 2;
                            } else {
                                c0328j2.f3967c = 0;
                                c0328j2.f3971e0 = max;
                                c0328j2.f3961Y = 2;
                            }
                        } else if (obj instanceof C0326h) {
                            C0326h c0326h2 = (C0326h) obj;
                            if (i2 == 0) {
                                c0326h2.b(23, 0);
                                c0326h2.b(54, 2);
                            } else {
                                c0326h2.b(21, 0);
                                c0326h2.b(55, 2);
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
            if (!(obj instanceof C0323e)) {
                C0323e c0323e4 = (C0323e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0323e4).width = i4;
                    c0323e4.f3871W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0323e4).height = i4;
                    c0323e4.f3872X = z2;
                    return;
                }
            }
            if (obj instanceof C0328j) {
                C0328j c0328j3 = (C0328j) obj;
                if (i2 == 0) {
                    c0328j3.f3965b = i4;
                    c0328j3.f3982l0 = z2;
                    return;
                } else {
                    c0328j3.f3967c = i4;
                    c0328j3.f3984m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0326h) {
                C0326h c0326h3 = (C0326h) obj;
                if (i2 == 0) {
                    c0326h3.b(23, i4);
                    c0326h3.c(80, z2);
                    return;
                } else {
                    c0326h3.b(21, i4);
                    c0326h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0323e)) {
        }
    }

    public static void h(C0323e c0323e, String str) {
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
        c0323e.f3855G = str;
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
        HashMap hashMap2 = nVar.f4025c;
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
                if (nVar.f4024b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0327i c0327i = (C0327i) hashMap2.get(Integer.valueOf(id));
                        if (c0327i != null) {
                            if (childAt instanceof C0319a) {
                                C0328j c0328j = c0327i.d;
                                c0328j.f3976h0 = 1;
                                C0319a c0319a = (C0319a) childAt;
                                c0319a.setId(id);
                                c0319a.setType(c0328j.f3973f0);
                                c0319a.setMargin(c0328j.f3975g0);
                                c0319a.setAllowsGoneWidget(c0328j.f3986n0);
                                int[] iArr = c0328j.f3977i0;
                                if (iArr != null) {
                                    c0319a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0328j.j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0319a, str3);
                                        c0328j.f3977i0 = c2;
                                        c0319a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0323e c0323e = (C0323e) childAt.getLayoutParams();
                            c0323e.a();
                            c0327i.a(c0323e);
                            HashMap hashMap3 = c0327i.f3936f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0320b c0320b = (C0320b) hashMap3.get(str4);
                                if (c0320b.f3837a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0290e.a(c0320b.f3838b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3839c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0320b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3842g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0320b.f3842g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0320b.f3840e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0320b.f3841f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0320b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3839c));
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
                            childAt.setLayoutParams(c0323e);
                            l lVar = c0327i.f3933b;
                            if (lVar.f4008b == 0) {
                                childAt.setVisibility(lVar.f4007a);
                            }
                            childAt.setAlpha(lVar.f4009c);
                            m mVar = c0327i.f3935e;
                            childAt.setRotation(mVar.f4011a);
                            childAt.setRotationX(mVar.f4012b);
                            childAt.setRotationY(mVar.f4013c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4014e);
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
                                if (!Float.isNaN(mVar.f4015f)) {
                                    childAt.setPivotX(mVar.f4015f);
                                }
                                if (!Float.isNaN(mVar.f4016g)) {
                                    childAt.setPivotY(mVar.f4016g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4017j);
                            childAt.setTranslationZ(mVar.f4018k);
                            if (mVar.f4019l) {
                                childAt.setElevation(mVar.f4020m);
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
            C0327i c0327i2 = (C0327i) hashMap2.get(num);
            if (c0327i2 != null) {
                C0328j c0328j2 = c0327i2.d;
                if (c0328j2.f3976h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0319a c0319a2 = new C0319a(context);
                    c0319a2.f3843a = new int[32];
                    c0319a2.f3848g = new HashMap();
                    c0319a2.f3845c = context;
                    C0295a c0295a = new C0295a();
                    c0295a.f3589s0 = 0;
                    c0295a.f3590t0 = true;
                    c0295a.f3591u0 = 0;
                    c0295a.f3592v0 = false;
                    c0319a2.f3836j = c0295a;
                    c0319a2.d = c0295a;
                    c0319a2.i();
                    c0319a2.setVisibility(8);
                    c0319a2.setId(num.intValue());
                    int[] iArr2 = c0328j2.f3977i0;
                    if (iArr2 != null) {
                        c0319a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0328j2.j0;
                        if (str5 != null) {
                            int[] c3 = c(c0319a2, str5);
                            c0328j2.f3977i0 = c3;
                            c0319a2.setReferencedIds(c3);
                        }
                    }
                    c0319a2.setType(c0328j2.f3973f0);
                    c0319a2.setMargin(c0328j2.f3975g0);
                    C0323e g2 = ConstraintLayout.g();
                    c0319a2.i();
                    c0327i2.a(g2);
                    constraintLayout.addView(c0319a2, g2);
                }
                if (c0328j2.f3963a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0323e g3 = ConstraintLayout.g();
                    c0327i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0321c) {
                ((AbstractC0321c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4025c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0323e c0323e = (C0323e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4024b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0327i());
            }
            C0327i c0327i = (C0327i) hashMap.get(Integer.valueOf(id));
            if (c0327i != null) {
                HashMap hashMap2 = nVar.f4023a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0320b c0320b = (C0320b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0320b(c0320b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0320b(c0320b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0327i.f3936f = hashMap3;
                c0327i.f3932a = id;
                int i2 = c0323e.f3882e;
                C0328j c0328j = c0327i.d;
                c0328j.h = i2;
                c0328j.i = c0323e.f3884f;
                c0328j.f3978j = c0323e.f3886g;
                c0328j.f3979k = c0323e.h;
                c0328j.f3981l = c0323e.i;
                c0328j.f3983m = c0323e.f3890j;
                c0328j.f3985n = c0323e.f3891k;
                c0328j.f3987o = c0323e.f3893l;
                c0328j.f3989p = c0323e.f3895m;
                c0328j.f3990q = c0323e.f3897n;
                c0328j.f3991r = c0323e.f3899o;
                c0328j.f3992s = c0323e.f3905s;
                c0328j.f3993t = c0323e.f3906t;
                c0328j.f3994u = c0323e.f3907u;
                c0328j.f3995v = c0323e.f3908v;
                c0328j.f3996w = c0323e.f3854E;
                c0328j.f3997x = c0323e.F;
                c0328j.f3998y = c0323e.f3855G;
                c0328j.f3999z = c0323e.f3901p;
                c0328j.f3938A = c0323e.f3903q;
                c0328j.f3939B = c0323e.f3904r;
                c0328j.f3940C = c0323e.f3868T;
                c0328j.f3941D = c0323e.f3869U;
                c0328j.f3942E = c0323e.f3870V;
                c0328j.f3972f = c0323e.f3879c;
                c0328j.d = c0323e.f3875a;
                c0328j.f3970e = c0323e.f3877b;
                c0328j.f3965b = ((ViewGroup.MarginLayoutParams) c0323e).width;
                c0328j.f3967c = ((ViewGroup.MarginLayoutParams) c0323e).height;
                c0328j.F = ((ViewGroup.MarginLayoutParams) c0323e).leftMargin;
                c0328j.f3943G = ((ViewGroup.MarginLayoutParams) c0323e).rightMargin;
                c0328j.f3944H = ((ViewGroup.MarginLayoutParams) c0323e).topMargin;
                c0328j.f3945I = ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin;
                c0328j.f3948L = c0323e.f3853D;
                c0328j.f3956T = c0323e.f3857I;
                c0328j.f3957U = c0323e.f3856H;
                c0328j.f3959W = c0323e.f3859K;
                c0328j.f3958V = c0323e.f3858J;
                c0328j.f3982l0 = c0323e.f3871W;
                c0328j.f3984m0 = c0323e.f3872X;
                c0328j.f3960X = c0323e.f3860L;
                c0328j.f3961Y = c0323e.f3861M;
                c0328j.f3962Z = c0323e.f3864P;
                c0328j.f3964a0 = c0323e.f3865Q;
                c0328j.f3966b0 = c0323e.f3862N;
                c0328j.f3968c0 = c0323e.f3863O;
                c0328j.f3969d0 = c0323e.f3866R;
                c0328j.f3971e0 = c0323e.f3867S;
                c0328j.f3980k0 = c0323e.f3873Y;
                c0328j.f3950N = c0323e.f3910x;
                c0328j.f3952P = c0323e.f3912z;
                c0328j.f3949M = c0323e.f3909w;
                c0328j.f3951O = c0323e.f3911y;
                c0328j.f3954R = c0323e.f3850A;
                c0328j.f3953Q = c0323e.f3851B;
                c0328j.f3955S = c0323e.f3852C;
                c0328j.f3988o0 = c0323e.f3874Z;
                c0328j.f3946J = c0323e.getMarginEnd();
                c0328j.f3947K = c0323e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0327i.f3933b;
                lVar.f4007a = visibility;
                lVar.f4009c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0327i.f3935e;
                mVar.f4011a = rotation;
                mVar.f4012b = childAt.getRotationX();
                mVar.f4013c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4014e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4015f = pivotX;
                    mVar.f4016g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4017j = childAt.getTranslationY();
                mVar.f4018k = childAt.getTranslationZ();
                if (mVar.f4019l) {
                    mVar.f4020m = childAt.getElevation();
                }
                if (childAt instanceof C0319a) {
                    C0319a c0319a = (C0319a) childAt;
                    c0328j.f3986n0 = c0319a.getAllowsGoneWidget();
                    c0328j.f3977i0 = c0319a.getReferencedIds();
                    c0328j.f3973f0 = c0319a.getType();
                    c0328j.f3975g0 = c0319a.getMargin();
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
                    C0327i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f3963a = true;
                    }
                    this.f4025c.put(Integer.valueOf(d2.f3932a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
