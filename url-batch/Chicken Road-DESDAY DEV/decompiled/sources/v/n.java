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
import q.AbstractC0288e;
import r.AbstractC0291a;
import s.C0293a;
import u.AbstractC0317a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4091e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4092f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4093a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4094b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4095c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4091e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4092f = sparseIntArray2;
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
                    HashMap hashMap = constraintLayout.f1321m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1321m.get(trim);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4099c : r.f4097a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4091e;
        l lVar = c0327i.f4003b;
        String[] strArr = AbstractC0291a.f3512a;
        m mVar = c0327i.f4005e;
        k kVar = c0327i.f4004c;
        C0328j c0328j = c0327i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0326h c0326h = new C0326h();
            c0326h.f3993a = new int[10];
            c0326h.f3994b = new int[10];
            c0326h.f3995c = 0;
            c0326h.d = new int[10];
            c0326h.f3996e = new float[10];
            c0326h.f3997f = 0;
            c0326h.f3998g = new int[5];
            c0326h.h = new String[5];
            c0326h.i = 0;
            c0326h.f3999j = new int[4];
            c0326h.f4000k = new boolean[4];
            c0326h.f4001l = 0;
            kVar.getClass();
            c0328j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4092f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0326h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4015I));
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
                        c0326h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f4010C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0326h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f4011D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0326h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4016J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0326h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4022P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0326h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4023Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0326h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4019M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0326h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4021O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0326h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4024R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0326h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4020N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0326h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0326h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0328j.f4040e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0326h.a(19, obtainStyledAttributes.getFloat(index, c0328j.f4042f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0326h.a(20, obtainStyledAttributes.getFloat(index, c0328j.f4066w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0326h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0328j.f4037c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0326h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4077a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0326h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0328j.f4035b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0326h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0326h.b(27, obtainStyledAttributes.getInt(index, c0328j.f4012E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0326h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4013G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0326h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4017K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0326h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4014H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0326h.a(37, obtainStyledAttributes.getFloat(index, c0328j.f4067x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0327i.f4002a);
                        c0327i.f4002a = resourceId;
                        c0326h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0326h.a(39, obtainStyledAttributes.getFloat(index, c0328j.f4027U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0326h.a(40, obtainStyledAttributes.getFloat(index, c0328j.f4026T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0326h.b(41, obtainStyledAttributes.getInt(index, c0328j.f4028V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0326h.b(42, obtainStyledAttributes.getInt(index, c0328j.f4029W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0326h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4079c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0326h.c(44, true);
                        c0326h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4090m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0326h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4082b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0326h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4083c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0326h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0326h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4084e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0326h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4085f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0326h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4086g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0326h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0326h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4087j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0326h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4088k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0326h.b(54, obtainStyledAttributes.getInt(index, c0328j.f4030X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0326h.b(55, obtainStyledAttributes.getInt(index, c0328j.f4031Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0326h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4032Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0326h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4034a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0326h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4036b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0326h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4038c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0326h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4081a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0326h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4008A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0326h.a(63, obtainStyledAttributes.getFloat(index, c0328j.f4009B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0326h.b(64, f(obtainStyledAttributes, index, kVar.f4071a));
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
                        c0326h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4074e));
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
                        c0326h.b(72, obtainStyledAttributes.getInt(index, c0328j.f4043f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0326h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4045g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0326h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0326h.c(75, obtainStyledAttributes.getBoolean(index, c0328j.n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0326h.b(76, obtainStyledAttributes.getInt(index, kVar.f4073c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0326h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0326h.b(78, obtainStyledAttributes.getInt(index, lVar.f4078b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0326h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0326h.c(80, obtainStyledAttributes.getBoolean(index, c0328j.f4053l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0326h.c(81, obtainStyledAttributes.getBoolean(index, c0328j.f4055m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0326h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4072b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0326h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0326h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4076g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0326h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4075f));
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
                        c0326h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4018L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0326h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0328j.f4025S));
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
                        c0326h.b(97, obtainStyledAttributes.getInt(index, c0328j.f4058o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0317a.f3860s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0327i.f4002a = obtainStyledAttributes.getResourceId(index, c0327i.f4002a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0326h.c(99, obtainStyledAttributes.getBoolean(index, c0328j.f4044g));
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
                        c0328j.f4059p = f(obtainStyledAttributes, index2, c0328j.f4059p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4015I = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4015I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4057o = f(obtainStyledAttributes, index2, c0328j.f4057o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4056n = f(obtainStyledAttributes, index2, c0328j.f4056n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4068y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4010C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f4010C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4011D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f4011D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4016J = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4016J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4065v = f(obtainStyledAttributes, index2, c0328j.f4065v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4064u = f(obtainStyledAttributes, index2, c0328j.f4064u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4022P = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4022P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4023Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4023Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4019M = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4019M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4021O = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4021O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4024R = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4024R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4020N = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4020N);
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
                        c0328j.f4040e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0328j.f4040e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4042f = obtainStyledAttributes.getFloat(index2, c0328j.f4042f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4066w = obtainStyledAttributes.getFloat(index2, c0328j.f4066w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4037c = obtainStyledAttributes.getLayoutDimension(index2, c0328j.f4037c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4077a);
                        lVar.f4077a = i10;
                        lVar.f4077a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4035b = obtainStyledAttributes.getLayoutDimension(index2, c0328j.f4035b);
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
                        c0328j.f4012E = obtainStyledAttributes.getInt(index2, c0328j.f4012E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4013G = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4013G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4048j = f(obtainStyledAttributes, index2, c0328j.f4048j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4050k = f(obtainStyledAttributes, index2, c0328j.f4050k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4017K = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4017K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4062s = f(obtainStyledAttributes, index2, c0328j.f4062s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4063t = f(obtainStyledAttributes, index2, c0328j.f4063t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4014H = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4014H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4054m = f(obtainStyledAttributes, index2, c0328j.f4054m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4052l = f(obtainStyledAttributes, index2, c0328j.f4052l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4067x = obtainStyledAttributes.getFloat(index2, c0328j.f4067x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0327i.f4002a = obtainStyledAttributes.getResourceId(index2, c0327i.f4002a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4027U = obtainStyledAttributes.getFloat(index2, c0328j.f4027U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4026T = obtainStyledAttributes.getFloat(index2, c0328j.f4026T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4028V = obtainStyledAttributes.getInt(index2, c0328j.f4028V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4029W = obtainStyledAttributes.getInt(index2, c0328j.f4029W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4079c = obtainStyledAttributes.getFloat(index2, lVar.f4079c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4089l = true;
                        mVar.f4090m = obtainStyledAttributes.getDimension(index2, mVar.f4090m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4082b = obtainStyledAttributes.getFloat(index2, mVar.f4082b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4083c = obtainStyledAttributes.getFloat(index2, mVar.f4083c);
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
                        mVar.f4084e = obtainStyledAttributes.getFloat(index2, mVar.f4084e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4085f = obtainStyledAttributes.getDimension(index2, mVar.f4085f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4086g = obtainStyledAttributes.getDimension(index2, mVar.f4086g);
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
                        mVar.f4087j = obtainStyledAttributes.getDimension(index2, mVar.f4087j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4088k = obtainStyledAttributes.getDimension(index2, mVar.f4088k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4030X = obtainStyledAttributes.getInt(index2, c0328j.f4030X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4031Y = obtainStyledAttributes.getInt(index2, c0328j.f4031Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4032Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4032Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4034a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4034a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4036b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4036b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4038c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4038c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4081a = obtainStyledAttributes.getFloat(index2, mVar.f4081a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4069z = f(obtainStyledAttributes, index2, c0328j.f4069z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4008A = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4008A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328j.f4009B = obtainStyledAttributes.getFloat(index2, c0328j.f4009B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4071a = f(obtainStyledAttributes, index2, kVar.f4071a);
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
                        kVar.f4074e = obtainStyledAttributes.getFloat(index2, kVar.f4074e);
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
                        c0328j.f4039d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0328j.f4041e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0328j.f4043f0 = obtainStyledAttributes.getInt(index2, c0328j.f4043f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4045g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4045g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4049j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.n0 = obtainStyledAttributes.getBoolean(index2, c0328j.n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4073c = obtainStyledAttributes.getInt(index2, kVar.f4073c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4051k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4078b = obtainStyledAttributes.getInt(index2, lVar.f4078b);
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
                        c0328j.f4053l0 = obtainStyledAttributes.getBoolean(index2, c0328j.f4053l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4055m0 = obtainStyledAttributes.getBoolean(index2, c0328j.f4055m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4072b = obtainStyledAttributes.getInteger(index2, kVar.f4072b);
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
                        kVar.f4076g = obtainStyledAttributes.getInteger(index2, kVar.f4076g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4075f = obtainStyledAttributes.getFloat(index2, kVar.f4075f);
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
                        c0328j.f4060q = f(obtainStyledAttributes, index2, c0328j.f4060q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4061r = f(obtainStyledAttributes, index2, c0328j.f4061r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4018L = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4018L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0328j.f4025S = obtainStyledAttributes.getDimensionPixelSize(index2, c0328j.f4025S);
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
                        c0328j.f4058o0 = obtainStyledAttributes.getInt(index2, c0328j.f4058o0);
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
            if (c0328j.f4049j0 != null) {
                c0328j.f4047i0 = null;
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
                        ((C0328j) obj).f4068y = trim2;
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
                                c0323e2.f3926H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0323e2).height = 0;
                                c0323e2.f3927I = parseFloat;
                            }
                        } else if (obj instanceof C0328j) {
                            C0328j c0328j = (C0328j) obj;
                            if (i2 == 0) {
                                c0328j.f4035b = 0;
                                c0328j.f4027U = parseFloat;
                            } else {
                                c0328j.f4037c = 0;
                                c0328j.f4026T = parseFloat;
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
                                c0323e3.f3936R = max;
                                c0323e3.f3930L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0323e3).height = 0;
                                c0323e3.f3937S = max;
                                c0323e3.f3931M = 2;
                            }
                        } else if (obj instanceof C0328j) {
                            C0328j c0328j2 = (C0328j) obj;
                            if (i2 == 0) {
                                c0328j2.f4035b = 0;
                                c0328j2.f4039d0 = max;
                                c0328j2.f4030X = 2;
                            } else {
                                c0328j2.f4037c = 0;
                                c0328j2.f4041e0 = max;
                                c0328j2.f4031Y = 2;
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
                    c0323e4.f3941W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0323e4).height = i4;
                    c0323e4.f3942X = z2;
                    return;
                }
            }
            if (obj instanceof C0328j) {
                C0328j c0328j3 = (C0328j) obj;
                if (i2 == 0) {
                    c0328j3.f4035b = i4;
                    c0328j3.f4053l0 = z2;
                    return;
                } else {
                    c0328j3.f4037c = i4;
                    c0328j3.f4055m0 = z2;
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
        c0323e.f3925G = str;
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
        HashMap hashMap2 = nVar.f4095c;
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
                if (nVar.f4094b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0327i c0327i = (C0327i) hashMap2.get(Integer.valueOf(id));
                        if (c0327i != null) {
                            if (childAt instanceof C0319a) {
                                C0328j c0328j = c0327i.d;
                                c0328j.f4046h0 = 1;
                                C0319a c0319a = (C0319a) childAt;
                                c0319a.setId(id);
                                c0319a.setType(c0328j.f4043f0);
                                c0319a.setMargin(c0328j.f4045g0);
                                c0319a.setAllowsGoneWidget(c0328j.n0);
                                int[] iArr = c0328j.f4047i0;
                                if (iArr != null) {
                                    c0319a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0328j.f4049j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0319a, str3);
                                        c0328j.f4047i0 = c2;
                                        c0319a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0323e c0323e = (C0323e) childAt.getLayoutParams();
                            c0323e.a();
                            c0327i.a(c0323e);
                            HashMap hashMap3 = c0327i.f4006f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0320b c0320b = (C0320b) hashMap3.get(str4);
                                if (c0320b.f3907a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0288e.a(c0320b.f3908b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3909c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0320b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3912g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0320b.f3912g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0320b.f3910e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0320b.f3911f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0320b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0320b.f3909c));
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
                            l lVar = c0327i.f4003b;
                            if (lVar.f4078b == 0) {
                                childAt.setVisibility(lVar.f4077a);
                            }
                            childAt.setAlpha(lVar.f4079c);
                            m mVar = c0327i.f4005e;
                            childAt.setRotation(mVar.f4081a);
                            childAt.setRotationX(mVar.f4082b);
                            childAt.setRotationY(mVar.f4083c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4084e);
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
                                if (!Float.isNaN(mVar.f4085f)) {
                                    childAt.setPivotX(mVar.f4085f);
                                }
                                if (!Float.isNaN(mVar.f4086g)) {
                                    childAt.setPivotY(mVar.f4086g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4087j);
                            childAt.setTranslationZ(mVar.f4088k);
                            if (mVar.f4089l) {
                                childAt.setElevation(mVar.f4090m);
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
                if (c0328j2.f4046h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0319a c0319a2 = new C0319a(context);
                    c0319a2.f3913a = new int[32];
                    c0319a2.f3918g = new HashMap();
                    c0319a2.f3915c = context;
                    C0293a c0293a = new C0293a();
                    c0293a.f3525s0 = 0;
                    c0293a.f3526t0 = true;
                    c0293a.f3527u0 = 0;
                    c0293a.f3528v0 = false;
                    c0319a2.f3906j = c0293a;
                    c0319a2.d = c0293a;
                    c0319a2.i();
                    c0319a2.setVisibility(8);
                    c0319a2.setId(num.intValue());
                    int[] iArr2 = c0328j2.f4047i0;
                    if (iArr2 != null) {
                        c0319a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0328j2.f4049j0;
                        if (str5 != null) {
                            int[] c3 = c(c0319a2, str5);
                            c0328j2.f4047i0 = c3;
                            c0319a2.setReferencedIds(c3);
                        }
                    }
                    c0319a2.setType(c0328j2.f4043f0);
                    c0319a2.setMargin(c0328j2.f4045g0);
                    C0323e g2 = ConstraintLayout.g();
                    c0319a2.i();
                    c0327i2.a(g2);
                    constraintLayout.addView(c0319a2, g2);
                }
                if (c0328j2.f4033a) {
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
        HashMap hashMap = nVar.f4095c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0323e c0323e = (C0323e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4094b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0327i());
            }
            C0327i c0327i = (C0327i) hashMap.get(Integer.valueOf(id));
            if (c0327i != null) {
                HashMap hashMap2 = nVar.f4093a;
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
                c0327i.f4006f = hashMap3;
                c0327i.f4002a = id;
                int i2 = c0323e.f3952e;
                C0328j c0328j = c0327i.d;
                c0328j.h = i2;
                c0328j.i = c0323e.f3954f;
                c0328j.f4048j = c0323e.f3956g;
                c0328j.f4050k = c0323e.h;
                c0328j.f4052l = c0323e.i;
                c0328j.f4054m = c0323e.f3960j;
                c0328j.f4056n = c0323e.f3962k;
                c0328j.f4057o = c0323e.f3964l;
                c0328j.f4059p = c0323e.f3966m;
                c0328j.f4060q = c0323e.f3968n;
                c0328j.f4061r = c0323e.f3969o;
                c0328j.f4062s = c0323e.f3975s;
                c0328j.f4063t = c0323e.f3976t;
                c0328j.f4064u = c0323e.f3977u;
                c0328j.f4065v = c0323e.f3978v;
                c0328j.f4066w = c0323e.f3924E;
                c0328j.f4067x = c0323e.F;
                c0328j.f4068y = c0323e.f3925G;
                c0328j.f4069z = c0323e.f3971p;
                c0328j.f4008A = c0323e.f3973q;
                c0328j.f4009B = c0323e.f3974r;
                c0328j.f4010C = c0323e.f3938T;
                c0328j.f4011D = c0323e.f3939U;
                c0328j.f4012E = c0323e.f3940V;
                c0328j.f4042f = c0323e.f3949c;
                c0328j.d = c0323e.f3945a;
                c0328j.f4040e = c0323e.f3947b;
                c0328j.f4035b = ((ViewGroup.MarginLayoutParams) c0323e).width;
                c0328j.f4037c = ((ViewGroup.MarginLayoutParams) c0323e).height;
                c0328j.F = ((ViewGroup.MarginLayoutParams) c0323e).leftMargin;
                c0328j.f4013G = ((ViewGroup.MarginLayoutParams) c0323e).rightMargin;
                c0328j.f4014H = ((ViewGroup.MarginLayoutParams) c0323e).topMargin;
                c0328j.f4015I = ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin;
                c0328j.f4018L = c0323e.f3923D;
                c0328j.f4026T = c0323e.f3927I;
                c0328j.f4027U = c0323e.f3926H;
                c0328j.f4029W = c0323e.f3929K;
                c0328j.f4028V = c0323e.f3928J;
                c0328j.f4053l0 = c0323e.f3941W;
                c0328j.f4055m0 = c0323e.f3942X;
                c0328j.f4030X = c0323e.f3930L;
                c0328j.f4031Y = c0323e.f3931M;
                c0328j.f4032Z = c0323e.f3934P;
                c0328j.f4034a0 = c0323e.f3935Q;
                c0328j.f4036b0 = c0323e.f3932N;
                c0328j.f4038c0 = c0323e.f3933O;
                c0328j.f4039d0 = c0323e.f3936R;
                c0328j.f4041e0 = c0323e.f3937S;
                c0328j.f4051k0 = c0323e.f3943Y;
                c0328j.f4020N = c0323e.f3980x;
                c0328j.f4022P = c0323e.f3982z;
                c0328j.f4019M = c0323e.f3979w;
                c0328j.f4021O = c0323e.f3981y;
                c0328j.f4024R = c0323e.f3920A;
                c0328j.f4023Q = c0323e.f3921B;
                c0328j.f4025S = c0323e.f3922C;
                c0328j.f4058o0 = c0323e.f3944Z;
                c0328j.f4016J = c0323e.getMarginEnd();
                c0328j.f4017K = c0323e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0327i.f4003b;
                lVar.f4077a = visibility;
                lVar.f4079c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0327i.f4005e;
                mVar.f4081a = rotation;
                mVar.f4082b = childAt.getRotationX();
                mVar.f4083c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4084e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4085f = pivotX;
                    mVar.f4086g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4087j = childAt.getTranslationY();
                mVar.f4088k = childAt.getTranslationZ();
                if (mVar.f4089l) {
                    mVar.f4090m = childAt.getElevation();
                }
                if (childAt instanceof C0319a) {
                    C0319a c0319a = (C0319a) childAt;
                    c0328j.n0 = c0319a.getAllowsGoneWidget();
                    c0328j.f4047i0 = c0319a.getReferencedIds();
                    c0328j.f4043f0 = c0319a.getType();
                    c0328j.f4045g0 = c0319a.getMargin();
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
                        d2.d.f4033a = true;
                    }
                    this.f4095c.put(Integer.valueOf(d2.f4002a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
