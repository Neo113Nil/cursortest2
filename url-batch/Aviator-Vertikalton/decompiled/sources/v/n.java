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
import r.AbstractC0320a;
import s.C0322a;
import u.AbstractC0344a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4430d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4431e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4432f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4433a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4434b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4435c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4431e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4432f = sparseIntArray2;
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

    public static int[] c(C0345a c0345a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0345a.getContext();
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
            if (i == 0 && c0345a.isInEditMode() && (c0345a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0345a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1120m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1120m.get(trim);
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
    public static C0353i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0353i c0353i = new C0353i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4439c : r.f4437a);
        int[] iArr = f4430d;
        SparseIntArray sparseIntArray = f4431e;
        l lVar = c0353i.f4338b;
        String[] strArr = AbstractC0320a.f3962a;
        m mVar = c0353i.f4341e;
        k kVar = c0353i.f4339c;
        C0354j c0354j = c0353i.f4340d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0352h c0352h = new C0352h();
            c0352h.f4327a = new int[10];
            c0352h.f4328b = new int[10];
            c0352h.f4329c = 0;
            c0352h.f4330d = new int[10];
            c0352h.f4331e = new float[10];
            c0352h.f4332f = 0;
            c0352h.f4333g = new int[5];
            c0352h.h = new String[5];
            c0352h.i = 0;
            c0352h.f4334j = new int[4];
            c0352h.f4335k = new boolean[4];
            c0352h.f4336l = 0;
            kVar.getClass();
            c0354j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4432f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0352h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4351I));
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
                        c0352h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0352h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0354j.f4346C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0352h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0354j.f4347D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0352h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4352J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0352h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4358P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0352h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4359Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0352h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4355M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0352h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4357O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0352h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4360R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0352h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4356N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0352h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0354j.f4375d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0352h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0354j.f4377e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0352h.a(19, obtainStyledAttributes.getFloat(index, c0354j.f4379f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0352h.a(20, obtainStyledAttributes.getFloat(index, c0354j.f4402w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0352h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0354j.f4373c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0352h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4414a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0352h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0354j.f4371b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0352h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0352h.b(27, obtainStyledAttributes.getInt(index, c0354j.f4348E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0352h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4349G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0352h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4353K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0352h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4350H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0352h.a(37, obtainStyledAttributes.getFloat(index, c0354j.f4403x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0353i.f4337a);
                        c0353i.f4337a = resourceId;
                        c0352h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0352h.a(39, obtainStyledAttributes.getFloat(index, c0354j.f4363U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0352h.a(40, obtainStyledAttributes.getFloat(index, c0354j.f4362T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0352h.b(41, obtainStyledAttributes.getInt(index, c0354j.f4364V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0352h.b(42, obtainStyledAttributes.getInt(index, c0354j.f4365W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0352h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4416c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0352h.c(44, true);
                        c0352h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4429m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0352h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4420b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0352h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4421c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0352h.a(47, obtainStyledAttributes.getFloat(index, mVar.f4422d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0352h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4423e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0352h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4424f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0352h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4425g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0352h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0352h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4426j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0352h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4427k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0352h.b(54, obtainStyledAttributes.getInt(index, c0354j.f4366X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0352h.b(55, obtainStyledAttributes.getInt(index, c0354j.f4367Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0352h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4368Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0352h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4370a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0352h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4372b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0352h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4374c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0352h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4419a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0352h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4344A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0352h.a(63, obtainStyledAttributes.getFloat(index, c0354j.f4345B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0352h.b(64, f(obtainStyledAttributes, index, kVar.f4407a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0352h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0352h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0352h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0352h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4411e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0352h.a(68, obtainStyledAttributes.getFloat(index, lVar.f4417d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0352h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0352h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0352h.b(72, obtainStyledAttributes.getInt(index, c0354j.f4380f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0352h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4382g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0352h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0352h.c(75, obtainStyledAttributes.getBoolean(index, c0354j.f4392n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0352h.b(76, obtainStyledAttributes.getInt(index, kVar.f4409c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0352h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0352h.b(78, obtainStyledAttributes.getInt(index, lVar.f4415b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0352h.a(79, obtainStyledAttributes.getFloat(index, kVar.f4410d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0352h.c(80, obtainStyledAttributes.getBoolean(index, c0354j.f4389l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0352h.c(81, obtainStyledAttributes.getBoolean(index, c0354j.m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0352h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4408b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0352h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0352h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4413g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0352h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4412f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0352h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0352h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0352h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0352h.b(89, resourceId3);
                                c0352h.b(88, -2);
                            } else {
                                c0352h.b(88, -1);
                            }
                        } else {
                            c0352h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0352h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4354L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0352h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0354j.f4361S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0352h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0352h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0352h.b(97, obtainStyledAttributes.getInt(index, c0354j.f4394o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0344a.f4224s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0353i.f4337a = obtainStyledAttributes.getResourceId(index, c0353i.f4337a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0352h.c(99, obtainStyledAttributes.getBoolean(index, c0354j.f4381g));
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
                    c0354j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4395p = f(obtainStyledAttributes, index2, c0354j.f4395p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4351I = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4351I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4393o = f(obtainStyledAttributes, index2, c0354j.f4393o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4391n = f(obtainStyledAttributes, index2, c0354j.f4391n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4404y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4346C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0354j.f4346C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4347D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0354j.f4347D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4352J = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4352J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4401v = f(obtainStyledAttributes, index2, c0354j.f4401v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4400u = f(obtainStyledAttributes, index2, c0354j.f4400u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4358P = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4358P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4359Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4359Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4355M = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4355M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4357O = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4357O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4360R = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4360R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4356N = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4356N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4375d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0354j.f4375d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4377e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0354j.f4377e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4379f = obtainStyledAttributes.getFloat(index2, c0354j.f4379f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4402w = obtainStyledAttributes.getFloat(index2, c0354j.f4402w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4373c = obtainStyledAttributes.getLayoutDimension(index2, c0354j.f4373c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4414a);
                        lVar.f4414a = i10;
                        lVar.f4414a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4371b = obtainStyledAttributes.getLayoutDimension(index2, c0354j.f4371b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.h = f(obtainStyledAttributes, index2, c0354j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.i = f(obtainStyledAttributes, index2, c0354j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4348E = obtainStyledAttributes.getInt(index2, c0354j.f4348E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4349G = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4349G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4384j = f(obtainStyledAttributes, index2, c0354j.f4384j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4386k = f(obtainStyledAttributes, index2, c0354j.f4386k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4353K = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4353K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4398s = f(obtainStyledAttributes, index2, c0354j.f4398s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4399t = f(obtainStyledAttributes, index2, c0354j.f4399t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4350H = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4350H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4390m = f(obtainStyledAttributes, index2, c0354j.f4390m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4388l = f(obtainStyledAttributes, index2, c0354j.f4388l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4403x = obtainStyledAttributes.getFloat(index2, c0354j.f4403x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0353i.f4337a = obtainStyledAttributes.getResourceId(index2, c0353i.f4337a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4363U = obtainStyledAttributes.getFloat(index2, c0354j.f4363U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4362T = obtainStyledAttributes.getFloat(index2, c0354j.f4362T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4364V = obtainStyledAttributes.getInt(index2, c0354j.f4364V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4365W = obtainStyledAttributes.getInt(index2, c0354j.f4365W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4416c = obtainStyledAttributes.getFloat(index2, lVar.f4416c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4428l = true;
                        mVar.f4429m = obtainStyledAttributes.getDimension(index2, mVar.f4429m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4420b = obtainStyledAttributes.getFloat(index2, mVar.f4420b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4421c = obtainStyledAttributes.getFloat(index2, mVar.f4421c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4422d = obtainStyledAttributes.getFloat(index2, mVar.f4422d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4423e = obtainStyledAttributes.getFloat(index2, mVar.f4423e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4424f = obtainStyledAttributes.getDimension(index2, mVar.f4424f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4425g = obtainStyledAttributes.getDimension(index2, mVar.f4425g);
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
                        mVar.f4426j = obtainStyledAttributes.getDimension(index2, mVar.f4426j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4427k = obtainStyledAttributes.getDimension(index2, mVar.f4427k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4366X = obtainStyledAttributes.getInt(index2, c0354j.f4366X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4367Y = obtainStyledAttributes.getInt(index2, c0354j.f4367Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4368Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4368Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4370a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4370a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4372b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4372b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4374c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4374c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4419a = obtainStyledAttributes.getFloat(index2, mVar.f4419a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4405z = f(obtainStyledAttributes, index2, c0354j.f4405z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4344A = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4344A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0354j.f4345B = obtainStyledAttributes.getFloat(index2, c0354j.f4345B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4407a = f(obtainStyledAttributes, index2, kVar.f4407a);
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
                        kVar.f4411e = obtainStyledAttributes.getFloat(index2, kVar.f4411e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f4417d = obtainStyledAttributes.getFloat(index2, lVar.f4417d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0354j.f4376d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0354j.f4378e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0354j.f4380f0 = obtainStyledAttributes.getInt(index2, c0354j.f4380f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4382g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4382g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4385j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4392n0 = obtainStyledAttributes.getBoolean(index2, c0354j.f4392n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4409c = obtainStyledAttributes.getInt(index2, kVar.f4409c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4387k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4415b = obtainStyledAttributes.getInt(index2, lVar.f4415b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4410d = obtainStyledAttributes.getFloat(index2, kVar.f4410d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4389l0 = obtainStyledAttributes.getBoolean(index2, c0354j.f4389l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.m0 = obtainStyledAttributes.getBoolean(index2, c0354j.m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4408b = obtainStyledAttributes.getInteger(index2, kVar.f4408b);
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
                        kVar.f4413g = obtainStyledAttributes.getInteger(index2, kVar.f4413g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4412f = obtainStyledAttributes.getFloat(index2, kVar.f4412f);
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
                        c0354j.f4396q = f(obtainStyledAttributes, index2, c0354j.f4396q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4397r = f(obtainStyledAttributes, index2, c0354j.f4397r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4354L = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4354L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4361S = obtainStyledAttributes.getDimensionPixelSize(index2, c0354j.f4361S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0354j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0354j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0354j.f4394o0 = obtainStyledAttributes.getInt(index2, c0354j.f4394o0);
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
            if (c0354j.f4385j0 != null) {
                c0354j.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0353i;
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
                    if (obj instanceof C0349e) {
                        C0349e c0349e = (C0349e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0349e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0349e).height = 0;
                        }
                        h(c0349e, trim2);
                        return;
                    }
                    if (obj instanceof C0354j) {
                        ((C0354j) obj).f4404y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0352h) {
                            ((C0352h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0349e) {
                            C0349e c0349e2 = (C0349e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0349e2).width = 0;
                                c0349e2.f4258H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0349e2).height = 0;
                                c0349e2.f4259I = parseFloat;
                            }
                        } else if (obj instanceof C0354j) {
                            C0354j c0354j = (C0354j) obj;
                            if (i2 == 0) {
                                c0354j.f4371b = 0;
                                c0354j.f4363U = parseFloat;
                            } else {
                                c0354j.f4373c = 0;
                                c0354j.f4362T = parseFloat;
                            }
                        } else if (obj instanceof C0352h) {
                            C0352h c0352h = (C0352h) obj;
                            if (i2 == 0) {
                                c0352h.b(23, 0);
                                c0352h.a(39, parseFloat);
                            } else {
                                c0352h.b(21, 0);
                                c0352h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0349e) {
                            C0349e c0349e3 = (C0349e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0349e3).width = 0;
                                c0349e3.f4268R = max;
                                c0349e3.f4262L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0349e3).height = 0;
                                c0349e3.f4269S = max;
                                c0349e3.f4263M = 2;
                            }
                        } else if (obj instanceof C0354j) {
                            C0354j c0354j2 = (C0354j) obj;
                            if (i2 == 0) {
                                c0354j2.f4371b = 0;
                                c0354j2.f4376d0 = max;
                                c0354j2.f4366X = 2;
                            } else {
                                c0354j2.f4373c = 0;
                                c0354j2.f4378e0 = max;
                                c0354j2.f4367Y = 2;
                            }
                        } else if (obj instanceof C0352h) {
                            C0352h c0352h2 = (C0352h) obj;
                            if (i2 == 0) {
                                c0352h2.b(23, 0);
                                c0352h2.b(54, 2);
                            } else {
                                c0352h2.b(21, 0);
                                c0352h2.b(55, 2);
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
            if (!(obj instanceof C0349e)) {
                C0349e c0349e4 = (C0349e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0349e4).width = i4;
                    c0349e4.f4273W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0349e4).height = i4;
                    c0349e4.f4274X = z2;
                    return;
                }
            }
            if (obj instanceof C0354j) {
                C0354j c0354j3 = (C0354j) obj;
                if (i2 == 0) {
                    c0354j3.f4371b = i4;
                    c0354j3.f4389l0 = z2;
                    return;
                } else {
                    c0354j3.f4373c = i4;
                    c0354j3.m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0352h) {
                C0352h c0352h3 = (C0352h) obj;
                if (i2 == 0) {
                    c0352h3.b(23, i4);
                    c0352h3.c(80, z2);
                    return;
                } else {
                    c0352h3.b(21, i4);
                    c0352h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0349e)) {
        }
    }

    public static void h(C0349e c0349e, String str) {
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
        c0349e.f4257G = str;
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
        HashMap hashMap2 = nVar.f4435c;
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
                if (nVar.f4434b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0353i c0353i = (C0353i) hashMap2.get(Integer.valueOf(id));
                        if (c0353i != null) {
                            if (childAt instanceof C0345a) {
                                C0354j c0354j = c0353i.f4340d;
                                c0354j.f4383h0 = 1;
                                C0345a c0345a = (C0345a) childAt;
                                c0345a.setId(id);
                                c0345a.setType(c0354j.f4380f0);
                                c0345a.setMargin(c0354j.f4382g0);
                                c0345a.setAllowsGoneWidget(c0354j.f4392n0);
                                int[] iArr = c0354j.i0;
                                if (iArr != null) {
                                    c0345a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0354j.f4385j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0345a, str3);
                                        c0354j.i0 = c2;
                                        c0345a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0349e c0349e = (C0349e) childAt.getLayoutParams();
                            c0349e.a();
                            c0353i.a(c0349e);
                            HashMap hashMap3 = c0353i.f4342f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0346b c0346b = (C0346b) hashMap3.get(str4);
                                if (c0346b.f4237a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0317e.a(c0346b.f4238b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0346b.f4239c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0346b.f4240d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0346b.f4243g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0346b.f4243g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0346b.f4241e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0346b.f4242f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0346b.f4240d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0346b.f4239c));
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
                            childAt.setLayoutParams(c0349e);
                            l lVar = c0353i.f4338b;
                            if (lVar.f4415b == 0) {
                                childAt.setVisibility(lVar.f4414a);
                            }
                            childAt.setAlpha(lVar.f4416c);
                            m mVar = c0353i.f4341e;
                            childAt.setRotation(mVar.f4419a);
                            childAt.setRotationX(mVar.f4420b);
                            childAt.setRotationY(mVar.f4421c);
                            childAt.setScaleX(mVar.f4422d);
                            childAt.setScaleY(mVar.f4423e);
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
                                if (!Float.isNaN(mVar.f4424f)) {
                                    childAt.setPivotX(mVar.f4424f);
                                }
                                if (!Float.isNaN(mVar.f4425g)) {
                                    childAt.setPivotY(mVar.f4425g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4426j);
                            childAt.setTranslationZ(mVar.f4427k);
                            if (mVar.f4428l) {
                                childAt.setElevation(mVar.f4429m);
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
            C0353i c0353i2 = (C0353i) hashMap2.get(num);
            if (c0353i2 != null) {
                C0354j c0354j2 = c0353i2.f4340d;
                if (c0354j2.f4383h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0345a c0345a2 = new C0345a(context);
                    c0345a2.f4244a = new int[32];
                    c0345a2.f4250g = new HashMap();
                    c0345a2.f4246c = context;
                    C0322a c0322a = new C0322a();
                    c0322a.f3979s0 = 0;
                    c0322a.f3980t0 = true;
                    c0322a.f3981u0 = 0;
                    c0322a.f3982v0 = false;
                    c0345a2.f4236j = c0322a;
                    c0345a2.f4247d = c0322a;
                    c0345a2.i();
                    c0345a2.setVisibility(8);
                    c0345a2.setId(num.intValue());
                    int[] iArr2 = c0354j2.i0;
                    if (iArr2 != null) {
                        c0345a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0354j2.f4385j0;
                        if (str5 != null) {
                            int[] c3 = c(c0345a2, str5);
                            c0354j2.i0 = c3;
                            c0345a2.setReferencedIds(c3);
                        }
                    }
                    c0345a2.setType(c0354j2.f4380f0);
                    c0345a2.setMargin(c0354j2.f4382g0);
                    C0349e g2 = ConstraintLayout.g();
                    c0345a2.i();
                    c0353i2.a(g2);
                    constraintLayout.addView(c0345a2, g2);
                }
                if (c0354j2.f4369a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0349e g3 = ConstraintLayout.g();
                    c0353i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0347c) {
                ((AbstractC0347c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4435c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0349e c0349e = (C0349e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4434b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0353i());
            }
            C0353i c0353i = (C0353i) hashMap.get(Integer.valueOf(id));
            if (c0353i != null) {
                HashMap hashMap2 = nVar.f4433a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0346b c0346b = (C0346b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0346b(c0346b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0346b(c0346b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0353i.f4342f = hashMap3;
                c0353i.f4337a = id;
                int i2 = c0349e.f4285e;
                C0354j c0354j = c0353i.f4340d;
                c0354j.h = i2;
                c0354j.i = c0349e.f4287f;
                c0354j.f4384j = c0349e.f4289g;
                c0354j.f4386k = c0349e.h;
                c0354j.f4388l = c0349e.i;
                c0354j.f4390m = c0349e.f4292j;
                c0354j.f4391n = c0349e.f4294k;
                c0354j.f4393o = c0349e.f4296l;
                c0354j.f4395p = c0349e.f4298m;
                c0354j.f4396q = c0349e.f4299n;
                c0354j.f4397r = c0349e.f4301o;
                c0354j.f4398s = c0349e.f4307s;
                c0354j.f4399t = c0349e.f4308t;
                c0354j.f4400u = c0349e.f4309u;
                c0354j.f4401v = c0349e.f4310v;
                c0354j.f4402w = c0349e.f4256E;
                c0354j.f4403x = c0349e.F;
                c0354j.f4404y = c0349e.f4257G;
                c0354j.f4405z = c0349e.f4303p;
                c0354j.f4344A = c0349e.f4305q;
                c0354j.f4345B = c0349e.f4306r;
                c0354j.f4346C = c0349e.f4270T;
                c0354j.f4347D = c0349e.f4271U;
                c0354j.f4348E = c0349e.f4272V;
                c0354j.f4379f = c0349e.f4281c;
                c0354j.f4375d = c0349e.f4277a;
                c0354j.f4377e = c0349e.f4279b;
                c0354j.f4371b = ((ViewGroup.MarginLayoutParams) c0349e).width;
                c0354j.f4373c = ((ViewGroup.MarginLayoutParams) c0349e).height;
                c0354j.F = ((ViewGroup.MarginLayoutParams) c0349e).leftMargin;
                c0354j.f4349G = ((ViewGroup.MarginLayoutParams) c0349e).rightMargin;
                c0354j.f4350H = ((ViewGroup.MarginLayoutParams) c0349e).topMargin;
                c0354j.f4351I = ((ViewGroup.MarginLayoutParams) c0349e).bottomMargin;
                c0354j.f4354L = c0349e.f4255D;
                c0354j.f4362T = c0349e.f4259I;
                c0354j.f4363U = c0349e.f4258H;
                c0354j.f4365W = c0349e.f4261K;
                c0354j.f4364V = c0349e.f4260J;
                c0354j.f4389l0 = c0349e.f4273W;
                c0354j.m0 = c0349e.f4274X;
                c0354j.f4366X = c0349e.f4262L;
                c0354j.f4367Y = c0349e.f4263M;
                c0354j.f4368Z = c0349e.f4266P;
                c0354j.f4370a0 = c0349e.f4267Q;
                c0354j.f4372b0 = c0349e.f4264N;
                c0354j.f4374c0 = c0349e.f4265O;
                c0354j.f4376d0 = c0349e.f4268R;
                c0354j.f4378e0 = c0349e.f4269S;
                c0354j.f4387k0 = c0349e.f4275Y;
                c0354j.f4356N = c0349e.f4312x;
                c0354j.f4358P = c0349e.f4314z;
                c0354j.f4355M = c0349e.f4311w;
                c0354j.f4357O = c0349e.f4313y;
                c0354j.f4360R = c0349e.f4252A;
                c0354j.f4359Q = c0349e.f4253B;
                c0354j.f4361S = c0349e.f4254C;
                c0354j.f4394o0 = c0349e.f4276Z;
                c0354j.f4352J = c0349e.getMarginEnd();
                c0354j.f4353K = c0349e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0353i.f4338b;
                lVar.f4414a = visibility;
                lVar.f4416c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0353i.f4341e;
                mVar.f4419a = rotation;
                mVar.f4420b = childAt.getRotationX();
                mVar.f4421c = childAt.getRotationY();
                mVar.f4422d = childAt.getScaleX();
                mVar.f4423e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4424f = pivotX;
                    mVar.f4425g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4426j = childAt.getTranslationY();
                mVar.f4427k = childAt.getTranslationZ();
                if (mVar.f4428l) {
                    mVar.f4429m = childAt.getElevation();
                }
                if (childAt instanceof C0345a) {
                    C0345a c0345a = (C0345a) childAt;
                    c0354j.f4392n0 = c0345a.getAllowsGoneWidget();
                    c0354j.i0 = c0345a.getReferencedIds();
                    c0354j.f4380f0 = c0345a.getType();
                    c0354j.f4382g0 = c0345a.getMargin();
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
                    C0353i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f4340d.f4369a = true;
                    }
                    this.f4435c.put(Integer.valueOf(d2.f4337a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
