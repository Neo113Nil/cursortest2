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
import q.AbstractC0317e;
import r.AbstractC0319a;
import s.C0337a;
import u.AbstractC0360a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3968e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f3969f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3970a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3971b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3972c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3968e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3969f = sparseIntArray2;
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

    public static int[] c(C0362a c0362a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0362a.getContext();
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
            if (i == 0 && c0362a.isInEditMode() && (c0362a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0362a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1403m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1403m.get(trim);
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
    public static C0370i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0370i c0370i = new C0370i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f3976c : r.f3974a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f3968e;
        l lVar = c0370i.f3880b;
        String[] strArr = AbstractC0319a.f3437a;
        m mVar = c0370i.f3882e;
        k kVar = c0370i.f3881c;
        C0371j c0371j = c0370i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0369h c0369h = new C0369h();
            c0369h.f3870a = new int[10];
            c0369h.f3871b = new int[10];
            c0369h.f3872c = 0;
            c0369h.d = new int[10];
            c0369h.f3873e = new float[10];
            c0369h.f3874f = 0;
            c0369h.f3875g = new int[5];
            c0369h.h = new String[5];
            c0369h.i = 0;
            c0369h.f3876j = new int[4];
            c0369h.f3877k = new boolean[4];
            c0369h.f3878l = 0;
            kVar.getClass();
            c0371j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f3969f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0369h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3892I));
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
                        c0369h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0369h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0371j.f3887C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0369h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0371j.f3888D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0369h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3893J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0369h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3899P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0369h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3900Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0369h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3896M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0369h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3898O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0369h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3901R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0369h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3897N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0369h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0371j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0369h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0371j.f3917e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0369h.a(19, obtainStyledAttributes.getFloat(index, c0371j.f3919f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0369h.a(20, obtainStyledAttributes.getFloat(index, c0371j.f3943w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0369h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0371j.f3914c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0369h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f3954a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0369h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0371j.f3912b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0369h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0369h.b(27, obtainStyledAttributes.getInt(index, c0371j.f3889E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0369h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3890G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0369h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3894K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0369h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3891H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0369h.a(37, obtainStyledAttributes.getFloat(index, c0371j.f3944x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0370i.f3879a);
                        c0370i.f3879a = resourceId;
                        c0369h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0369h.a(39, obtainStyledAttributes.getFloat(index, c0371j.f3904U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0369h.a(40, obtainStyledAttributes.getFloat(index, c0371j.f3903T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0369h.b(41, obtainStyledAttributes.getInt(index, c0371j.f3905V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0369h.b(42, obtainStyledAttributes.getInt(index, c0371j.f3906W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0369h.a(43, obtainStyledAttributes.getFloat(index, lVar.f3956c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0369h.c(44, true);
                        c0369h.a(44, obtainStyledAttributes.getDimension(index, mVar.f3967m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0369h.a(45, obtainStyledAttributes.getFloat(index, mVar.f3959b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0369h.a(46, obtainStyledAttributes.getFloat(index, mVar.f3960c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0369h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0369h.a(48, obtainStyledAttributes.getFloat(index, mVar.f3961e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0369h.a(49, obtainStyledAttributes.getDimension(index, mVar.f3962f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0369h.a(50, obtainStyledAttributes.getDimension(index, mVar.f3963g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0369h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0369h.a(52, obtainStyledAttributes.getDimension(index, mVar.f3964j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0369h.a(53, obtainStyledAttributes.getDimension(index, mVar.f3965k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0369h.b(54, obtainStyledAttributes.getInt(index, c0371j.f3907X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0369h.b(55, obtainStyledAttributes.getInt(index, c0371j.f3908Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0369h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3909Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0369h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3911a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0369h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3913b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0369h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3915c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0369h.a(60, obtainStyledAttributes.getFloat(index, mVar.f3958a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0369h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3885A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0369h.a(63, obtainStyledAttributes.getFloat(index, c0371j.f3886B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0369h.b(64, f(obtainStyledAttributes, index, kVar.f3948a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0369h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0369h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0369h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0369h.a(67, obtainStyledAttributes.getFloat(index, kVar.f3951e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0369h.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0369h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0369h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0369h.b(72, obtainStyledAttributes.getInt(index, c0371j.f3920f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0369h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3922g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0369h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0369h.c(75, obtainStyledAttributes.getBoolean(index, c0371j.f3933n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0369h.b(76, obtainStyledAttributes.getInt(index, kVar.f3950c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0369h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0369h.b(78, obtainStyledAttributes.getInt(index, lVar.f3955b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0369h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0369h.c(80, obtainStyledAttributes.getBoolean(index, c0371j.f3930l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0369h.c(81, obtainStyledAttributes.getBoolean(index, c0371j.m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0369h.b(82, obtainStyledAttributes.getInteger(index, kVar.f3949b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0369h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0369h.b(84, obtainStyledAttributes.getInteger(index, kVar.f3953g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0369h.a(85, obtainStyledAttributes.getFloat(index, kVar.f3952f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0369h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0369h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0369h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0369h.b(89, resourceId3);
                                c0369h.b(88, -2);
                            } else {
                                c0369h.b(88, -1);
                            }
                        } else {
                            c0369h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0369h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3895L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0369h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0371j.f3902S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0369h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0369h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0369h.b(97, obtainStyledAttributes.getInt(index, c0371j.f3935o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0360a.f3725s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0370i.f3879a = obtainStyledAttributes.getResourceId(index, c0370i.f3879a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0369h.c(99, obtainStyledAttributes.getBoolean(index, c0371j.f3921g));
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
                    c0371j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3936p = f(obtainStyledAttributes, index2, c0371j.f3936p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3892I = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3892I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3934o = f(obtainStyledAttributes, index2, c0371j.f3934o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3932n = f(obtainStyledAttributes, index2, c0371j.f3932n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3945y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3887C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0371j.f3887C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3888D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0371j.f3888D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3893J = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3893J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3942v = f(obtainStyledAttributes, index2, c0371j.f3942v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3941u = f(obtainStyledAttributes, index2, c0371j.f3941u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3899P = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3899P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3900Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3900Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3896M = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3896M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3898O = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3898O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3901R = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3901R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3897N = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3897N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0371j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3917e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0371j.f3917e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3919f = obtainStyledAttributes.getFloat(index2, c0371j.f3919f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3943w = obtainStyledAttributes.getFloat(index2, c0371j.f3943w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3914c = obtainStyledAttributes.getLayoutDimension(index2, c0371j.f3914c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f3954a);
                        lVar.f3954a = i10;
                        lVar.f3954a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3912b = obtainStyledAttributes.getLayoutDimension(index2, c0371j.f3912b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.h = f(obtainStyledAttributes, index2, c0371j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.i = f(obtainStyledAttributes, index2, c0371j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3889E = obtainStyledAttributes.getInt(index2, c0371j.f3889E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3890G = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3890G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3925j = f(obtainStyledAttributes, index2, c0371j.f3925j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3927k = f(obtainStyledAttributes, index2, c0371j.f3927k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3894K = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3894K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3939s = f(obtainStyledAttributes, index2, c0371j.f3939s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3940t = f(obtainStyledAttributes, index2, c0371j.f3940t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3891H = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3891H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3931m = f(obtainStyledAttributes, index2, c0371j.f3931m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3929l = f(obtainStyledAttributes, index2, c0371j.f3929l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3944x = obtainStyledAttributes.getFloat(index2, c0371j.f3944x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0370i.f3879a = obtainStyledAttributes.getResourceId(index2, c0370i.f3879a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3904U = obtainStyledAttributes.getFloat(index2, c0371j.f3904U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3903T = obtainStyledAttributes.getFloat(index2, c0371j.f3903T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3905V = obtainStyledAttributes.getInt(index2, c0371j.f3905V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3906W = obtainStyledAttributes.getInt(index2, c0371j.f3906W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f3956c = obtainStyledAttributes.getFloat(index2, lVar.f3956c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3966l = true;
                        mVar.f3967m = obtainStyledAttributes.getDimension(index2, mVar.f3967m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3959b = obtainStyledAttributes.getFloat(index2, mVar.f3959b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3960c = obtainStyledAttributes.getFloat(index2, mVar.f3960c);
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
                        mVar.f3961e = obtainStyledAttributes.getFloat(index2, mVar.f3961e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3962f = obtainStyledAttributes.getDimension(index2, mVar.f3962f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3963g = obtainStyledAttributes.getDimension(index2, mVar.f3963g);
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
                        mVar.f3964j = obtainStyledAttributes.getDimension(index2, mVar.f3964j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3965k = obtainStyledAttributes.getDimension(index2, mVar.f3965k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3907X = obtainStyledAttributes.getInt(index2, c0371j.f3907X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3908Y = obtainStyledAttributes.getInt(index2, c0371j.f3908Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3909Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3909Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3911a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3911a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3913b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3913b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3915c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3915c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3958a = obtainStyledAttributes.getFloat(index2, mVar.f3958a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3946z = f(obtainStyledAttributes, index2, c0371j.f3946z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3885A = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3885A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0371j.f3886B = obtainStyledAttributes.getFloat(index2, c0371j.f3886B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3948a = f(obtainStyledAttributes, index2, kVar.f3948a);
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
                        kVar.f3951e = obtainStyledAttributes.getFloat(index2, kVar.f3951e);
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
                        c0371j.f3916d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0371j.f3918e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0371j.f3920f0 = obtainStyledAttributes.getInt(index2, c0371j.f3920f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3922g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3922g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3926j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3933n0 = obtainStyledAttributes.getBoolean(index2, c0371j.f3933n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3950c = obtainStyledAttributes.getInt(index2, kVar.f3950c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3928k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f3955b = obtainStyledAttributes.getInt(index2, lVar.f3955b);
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
                        c0371j.f3930l0 = obtainStyledAttributes.getBoolean(index2, c0371j.f3930l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.m0 = obtainStyledAttributes.getBoolean(index2, c0371j.m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3949b = obtainStyledAttributes.getInteger(index2, kVar.f3949b);
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
                        kVar.f3953g = obtainStyledAttributes.getInteger(index2, kVar.f3953g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3952f = obtainStyledAttributes.getFloat(index2, kVar.f3952f);
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
                        c0371j.f3937q = f(obtainStyledAttributes, index2, c0371j.f3937q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3938r = f(obtainStyledAttributes, index2, c0371j.f3938r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3895L = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3895L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3902S = obtainStyledAttributes.getDimensionPixelSize(index2, c0371j.f3902S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0371j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0371j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0371j.f3935o0 = obtainStyledAttributes.getInt(index2, c0371j.f3935o0);
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
            if (c0371j.f3926j0 != null) {
                c0371j.f3924i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0370i;
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
                    if (obj instanceof C0366e) {
                        C0366e c0366e = (C0366e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0366e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0366e).height = 0;
                        }
                        h(c0366e, trim2);
                        return;
                    }
                    if (obj instanceof C0371j) {
                        ((C0371j) obj).f3945y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0369h) {
                            ((C0369h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0366e) {
                            C0366e c0366e2 = (C0366e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0366e2).width = 0;
                                c0366e2.f3803H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0366e2).height = 0;
                                c0366e2.f3804I = parseFloat;
                            }
                        } else if (obj instanceof C0371j) {
                            C0371j c0371j = (C0371j) obj;
                            if (i2 == 0) {
                                c0371j.f3912b = 0;
                                c0371j.f3904U = parseFloat;
                            } else {
                                c0371j.f3914c = 0;
                                c0371j.f3903T = parseFloat;
                            }
                        } else if (obj instanceof C0369h) {
                            C0369h c0369h = (C0369h) obj;
                            if (i2 == 0) {
                                c0369h.b(23, 0);
                                c0369h.a(39, parseFloat);
                            } else {
                                c0369h.b(21, 0);
                                c0369h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0366e) {
                            C0366e c0366e3 = (C0366e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0366e3).width = 0;
                                c0366e3.f3813R = max;
                                c0366e3.f3807L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0366e3).height = 0;
                                c0366e3.f3814S = max;
                                c0366e3.f3808M = 2;
                            }
                        } else if (obj instanceof C0371j) {
                            C0371j c0371j2 = (C0371j) obj;
                            if (i2 == 0) {
                                c0371j2.f3912b = 0;
                                c0371j2.f3916d0 = max;
                                c0371j2.f3907X = 2;
                            } else {
                                c0371j2.f3914c = 0;
                                c0371j2.f3918e0 = max;
                                c0371j2.f3908Y = 2;
                            }
                        } else if (obj instanceof C0369h) {
                            C0369h c0369h2 = (C0369h) obj;
                            if (i2 == 0) {
                                c0369h2.b(23, 0);
                                c0369h2.b(54, 2);
                            } else {
                                c0369h2.b(21, 0);
                                c0369h2.b(55, 2);
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
            if (!(obj instanceof C0366e)) {
                C0366e c0366e4 = (C0366e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0366e4).width = i4;
                    c0366e4.f3818W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0366e4).height = i4;
                    c0366e4.f3819X = z2;
                    return;
                }
            }
            if (obj instanceof C0371j) {
                C0371j c0371j3 = (C0371j) obj;
                if (i2 == 0) {
                    c0371j3.f3912b = i4;
                    c0371j3.f3930l0 = z2;
                    return;
                } else {
                    c0371j3.f3914c = i4;
                    c0371j3.m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0369h) {
                C0369h c0369h3 = (C0369h) obj;
                if (i2 == 0) {
                    c0369h3.b(23, i4);
                    c0369h3.c(80, z2);
                    return;
                } else {
                    c0369h3.b(21, i4);
                    c0369h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0366e)) {
        }
    }

    public static void h(C0366e c0366e, String str) {
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
        c0366e.f3802G = str;
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
        HashMap hashMap2 = nVar.f3972c;
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
                if (nVar.f3971b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0370i c0370i = (C0370i) hashMap2.get(Integer.valueOf(id));
                        if (c0370i != null) {
                            if (childAt instanceof C0362a) {
                                C0371j c0371j = c0370i.d;
                                c0371j.f3923h0 = 1;
                                C0362a c0362a = (C0362a) childAt;
                                c0362a.setId(id);
                                c0362a.setType(c0371j.f3920f0);
                                c0362a.setMargin(c0371j.f3922g0);
                                c0362a.setAllowsGoneWidget(c0371j.f3933n0);
                                int[] iArr = c0371j.f3924i0;
                                if (iArr != null) {
                                    c0362a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0371j.f3926j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0362a, str3);
                                        c0371j.f3924i0 = c2;
                                        c0362a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0366e c0366e = (C0366e) childAt.getLayoutParams();
                            c0366e.a();
                            c0370i.a(c0366e);
                            HashMap hashMap3 = c0370i.f3883f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0363b c0363b = (C0363b) hashMap3.get(str4);
                                if (c0363b.f3784a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0317e.a(c0363b.f3785b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0363b.f3786c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0363b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0363b.f3789g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0363b.f3789g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0363b.f3787e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0363b.f3788f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0363b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0363b.f3786c));
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
                            childAt.setLayoutParams(c0366e);
                            l lVar = c0370i.f3880b;
                            if (lVar.f3955b == 0) {
                                childAt.setVisibility(lVar.f3954a);
                            }
                            childAt.setAlpha(lVar.f3956c);
                            m mVar = c0370i.f3882e;
                            childAt.setRotation(mVar.f3958a);
                            childAt.setRotationX(mVar.f3959b);
                            childAt.setRotationY(mVar.f3960c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f3961e);
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
                                if (!Float.isNaN(mVar.f3962f)) {
                                    childAt.setPivotX(mVar.f3962f);
                                }
                                if (!Float.isNaN(mVar.f3963g)) {
                                    childAt.setPivotY(mVar.f3963g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f3964j);
                            childAt.setTranslationZ(mVar.f3965k);
                            if (mVar.f3966l) {
                                childAt.setElevation(mVar.f3967m);
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
            C0370i c0370i2 = (C0370i) hashMap2.get(num);
            if (c0370i2 != null) {
                C0371j c0371j2 = c0370i2.d;
                if (c0371j2.f3923h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0362a c0362a2 = new C0362a(context);
                    c0362a2.f3790a = new int[32];
                    c0362a2.f3795g = new HashMap();
                    c0362a2.f3792c = context;
                    C0337a c0337a = new C0337a();
                    c0337a.f3473s0 = 0;
                    c0337a.f3474t0 = true;
                    c0337a.f3475u0 = 0;
                    c0337a.f3476v0 = false;
                    c0362a2.f3783j = c0337a;
                    c0362a2.d = c0337a;
                    c0362a2.i();
                    c0362a2.setVisibility(8);
                    c0362a2.setId(num.intValue());
                    int[] iArr2 = c0371j2.f3924i0;
                    if (iArr2 != null) {
                        c0362a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0371j2.f3926j0;
                        if (str5 != null) {
                            int[] c3 = c(c0362a2, str5);
                            c0371j2.f3924i0 = c3;
                            c0362a2.setReferencedIds(c3);
                        }
                    }
                    c0362a2.setType(c0371j2.f3920f0);
                    c0362a2.setMargin(c0371j2.f3922g0);
                    C0366e g2 = ConstraintLayout.g();
                    c0362a2.i();
                    c0370i2.a(g2);
                    constraintLayout.addView(c0362a2, g2);
                }
                if (c0371j2.f3910a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0366e g3 = ConstraintLayout.g();
                    c0370i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0364c) {
                ((AbstractC0364c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f3972c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0366e c0366e = (C0366e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f3971b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0370i());
            }
            C0370i c0370i = (C0370i) hashMap.get(Integer.valueOf(id));
            if (c0370i != null) {
                HashMap hashMap2 = nVar.f3970a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0363b c0363b = (C0363b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0363b(c0363b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0363b(c0363b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0370i.f3883f = hashMap3;
                c0370i.f3879a = id;
                int i2 = c0366e.f3829e;
                C0371j c0371j = c0370i.d;
                c0371j.h = i2;
                c0371j.i = c0366e.f3831f;
                c0371j.f3925j = c0366e.f3833g;
                c0371j.f3927k = c0366e.h;
                c0371j.f3929l = c0366e.i;
                c0371j.f3931m = c0366e.f3837j;
                c0371j.f3932n = c0366e.f3839k;
                c0371j.f3934o = c0366e.f3841l;
                c0371j.f3936p = c0366e.f3843m;
                c0371j.f3937q = c0366e.f3844n;
                c0371j.f3938r = c0366e.f3846o;
                c0371j.f3939s = c0366e.f3852s;
                c0371j.f3940t = c0366e.f3853t;
                c0371j.f3941u = c0366e.f3854u;
                c0371j.f3942v = c0366e.f3855v;
                c0371j.f3943w = c0366e.f3801E;
                c0371j.f3944x = c0366e.F;
                c0371j.f3945y = c0366e.f3802G;
                c0371j.f3946z = c0366e.f3848p;
                c0371j.f3885A = c0366e.f3850q;
                c0371j.f3886B = c0366e.f3851r;
                c0371j.f3887C = c0366e.f3815T;
                c0371j.f3888D = c0366e.f3816U;
                c0371j.f3889E = c0366e.f3817V;
                c0371j.f3919f = c0366e.f3826c;
                c0371j.d = c0366e.f3822a;
                c0371j.f3917e = c0366e.f3824b;
                c0371j.f3912b = ((ViewGroup.MarginLayoutParams) c0366e).width;
                c0371j.f3914c = ((ViewGroup.MarginLayoutParams) c0366e).height;
                c0371j.F = ((ViewGroup.MarginLayoutParams) c0366e).leftMargin;
                c0371j.f3890G = ((ViewGroup.MarginLayoutParams) c0366e).rightMargin;
                c0371j.f3891H = ((ViewGroup.MarginLayoutParams) c0366e).topMargin;
                c0371j.f3892I = ((ViewGroup.MarginLayoutParams) c0366e).bottomMargin;
                c0371j.f3895L = c0366e.f3800D;
                c0371j.f3903T = c0366e.f3804I;
                c0371j.f3904U = c0366e.f3803H;
                c0371j.f3906W = c0366e.f3806K;
                c0371j.f3905V = c0366e.f3805J;
                c0371j.f3930l0 = c0366e.f3818W;
                c0371j.m0 = c0366e.f3819X;
                c0371j.f3907X = c0366e.f3807L;
                c0371j.f3908Y = c0366e.f3808M;
                c0371j.f3909Z = c0366e.f3811P;
                c0371j.f3911a0 = c0366e.f3812Q;
                c0371j.f3913b0 = c0366e.f3809N;
                c0371j.f3915c0 = c0366e.f3810O;
                c0371j.f3916d0 = c0366e.f3813R;
                c0371j.f3918e0 = c0366e.f3814S;
                c0371j.f3928k0 = c0366e.f3820Y;
                c0371j.f3897N = c0366e.f3857x;
                c0371j.f3899P = c0366e.f3859z;
                c0371j.f3896M = c0366e.f3856w;
                c0371j.f3898O = c0366e.f3858y;
                c0371j.f3901R = c0366e.f3797A;
                c0371j.f3900Q = c0366e.f3798B;
                c0371j.f3902S = c0366e.f3799C;
                c0371j.f3935o0 = c0366e.f3821Z;
                c0371j.f3893J = c0366e.getMarginEnd();
                c0371j.f3894K = c0366e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0370i.f3880b;
                lVar.f3954a = visibility;
                lVar.f3956c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0370i.f3882e;
                mVar.f3958a = rotation;
                mVar.f3959b = childAt.getRotationX();
                mVar.f3960c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f3961e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f3962f = pivotX;
                    mVar.f3963g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f3964j = childAt.getTranslationY();
                mVar.f3965k = childAt.getTranslationZ();
                if (mVar.f3966l) {
                    mVar.f3967m = childAt.getElevation();
                }
                if (childAt instanceof C0362a) {
                    C0362a c0362a = (C0362a) childAt;
                    c0371j.f3933n0 = c0362a.getAllowsGoneWidget();
                    c0371j.f3924i0 = c0362a.getReferencedIds();
                    c0371j.f3920f0 = c0362a.getType();
                    c0371j.f3922g0 = c0362a.getMargin();
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
                    C0370i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f3910a = true;
                    }
                    this.f3972c.put(Integer.valueOf(d2.f3879a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
