package w;

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
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC0290e;
import s.AbstractC0295a;
import t.C0297a;
import v.AbstractC0306a;

/* loaded from: classes.dex */
public final class o {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4167e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4168f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4169a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4170b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4171c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4167e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4168f = sparseIntArray2;
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

    public static int[] c(C0308a c0308a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0308a.getContext();
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
            if (i == 0 && c0308a.isInEditMode() && (c0308a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0308a.getParent();
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
    public static j d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        j jVar = new j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? s.f4175c : s.f4173a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4167e;
        m mVar = jVar.f4077b;
        String[] strArr = AbstractC0295a.f3575a;
        n nVar = jVar.f4079e;
        l lVar = jVar.f4078c;
        k kVar = jVar.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            i iVar = new i();
            iVar.f4066a = new int[10];
            iVar.f4067b = new int[10];
            iVar.f4068c = 0;
            iVar.d = new int[10];
            iVar.f4069e = new float[10];
            iVar.f4070f = 0;
            iVar.f4071g = new int[5];
            iVar.f4072h = new String[5];
            iVar.i = 0;
            iVar.f4073j = new int[4];
            iVar.f4074k = new boolean[4];
            iVar.f4075l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4168f.get(index)) {
                    case 2:
                        str4 = str5;
                        iVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4088I));
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
                        iVar.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        iVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4083C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        iVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4084D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        iVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4089J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        iVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4095P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        iVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4096Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        iVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4092M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        iVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4094O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        iVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4097R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        iVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4093N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        iVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        iVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4113e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        iVar.a(19, obtainStyledAttributes.getFloat(index, kVar.f4115f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        iVar.a(20, obtainStyledAttributes.getFloat(index, kVar.f4140w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        iVar.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f4110c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        iVar.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f4152a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        iVar.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f4108b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        iVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4086F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        iVar.b(27, obtainStyledAttributes.getInt(index, kVar.f4085E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        iVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        iVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4090K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        iVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4087H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        iVar.a(37, obtainStyledAttributes.getFloat(index, kVar.f4141x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jVar.f4076a);
                        jVar.f4076a = resourceId;
                        iVar.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        iVar.a(39, obtainStyledAttributes.getFloat(index, kVar.f4100U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        iVar.a(40, obtainStyledAttributes.getFloat(index, kVar.f4099T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        iVar.b(41, obtainStyledAttributes.getInt(index, kVar.f4101V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        iVar.b(42, obtainStyledAttributes.getInt(index, kVar.f4102W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        iVar.a(43, obtainStyledAttributes.getFloat(index, mVar.f4154c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        iVar.c(44, true);
                        iVar.a(44, obtainStyledAttributes.getDimension(index, nVar.f4166m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        iVar.a(45, obtainStyledAttributes.getFloat(index, nVar.f4157b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        iVar.a(46, obtainStyledAttributes.getFloat(index, nVar.f4158c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        iVar.a(47, obtainStyledAttributes.getFloat(index, nVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        iVar.a(48, obtainStyledAttributes.getFloat(index, nVar.f4159e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        iVar.a(49, obtainStyledAttributes.getDimension(index, nVar.f4160f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        iVar.a(50, obtainStyledAttributes.getDimension(index, nVar.f4161g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        iVar.a(51, obtainStyledAttributes.getDimension(index, nVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        iVar.a(52, obtainStyledAttributes.getDimension(index, nVar.f4163j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        iVar.a(53, obtainStyledAttributes.getDimension(index, nVar.f4164k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        iVar.b(54, obtainStyledAttributes.getInt(index, kVar.f4103X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        iVar.b(55, obtainStyledAttributes.getInt(index, kVar.f4104Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        iVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4105Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        iVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4107a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        iVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4109b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        iVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4111c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        iVar.a(60, obtainStyledAttributes.getFloat(index, nVar.f4156a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        iVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4081A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        iVar.a(63, obtainStyledAttributes.getFloat(index, kVar.f4082B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        iVar.b(64, f(obtainStyledAttributes, index, lVar.f4145a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            iVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        iVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        iVar.a(67, obtainStyledAttributes.getFloat(index, lVar.f4148e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        iVar.a(68, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        iVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        iVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        iVar.b(72, obtainStyledAttributes.getInt(index, kVar.f4116f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        iVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4118g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        iVar.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        iVar.c(75, obtainStyledAttributes.getBoolean(index, kVar.f4130n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        iVar.b(76, obtainStyledAttributes.getInt(index, lVar.f4147c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        iVar.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        iVar.b(78, obtainStyledAttributes.getInt(index, mVar.f4153b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        iVar.a(79, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        iVar.c(80, obtainStyledAttributes.getBoolean(index, kVar.l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        iVar.c(81, obtainStyledAttributes.getBoolean(index, kVar.f4128m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        iVar.b(82, obtainStyledAttributes.getInteger(index, lVar.f4146b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        iVar.b(83, f(obtainStyledAttributes, index, nVar.f4162h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        iVar.b(84, obtainStyledAttributes.getInteger(index, lVar.f4150g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        iVar.a(85, obtainStyledAttributes.getFloat(index, lVar.f4149f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.i != -1) {
                                iVar.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.f4151h = string;
                            iVar.d(string, 90);
                            if (lVar.f4151h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                            } else {
                                iVar.b(88, -1);
                            }
                        } else {
                            iVar.b(88, obtainStyledAttributes.getInteger(index, lVar.i));
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
                        iVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4091L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        iVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f4098S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(iVar, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(iVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        iVar.b(97, obtainStyledAttributes.getInt(index, kVar.f4132o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0306a.f3952s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            jVar.f4076a = obtainStyledAttributes.getResourceId(index, jVar.f4076a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        iVar.c(99, obtainStyledAttributes.getBoolean(index, kVar.f4117g));
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
                        kVar.f4133p = f(obtainStyledAttributes, index2, kVar.f4133p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4088I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4088I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4131o = f(obtainStyledAttributes, index2, kVar.f4131o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4129n = f(obtainStyledAttributes, index2, kVar.f4129n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4142y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4083C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4083C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4084D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4084D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4089J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4089J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4139v = f(obtainStyledAttributes, index2, kVar.f4139v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4138u = f(obtainStyledAttributes, index2, kVar.f4138u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4095P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4095P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4096Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4096Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4092M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4092M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4094O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4094O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4097R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4097R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4093N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4093N);
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
                        kVar.f4113e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4113e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4115f = obtainStyledAttributes.getFloat(index2, kVar.f4115f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4140w = obtainStyledAttributes.getFloat(index2, kVar.f4140w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4110c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f4110c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, mVar.f4152a);
                        mVar.f4152a = i10;
                        mVar.f4152a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4108b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f4108b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4086F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4086F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4119h = f(obtainStyledAttributes, index2, kVar.f4119h);
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
                        kVar.f4085E = obtainStyledAttributes.getInt(index2, kVar.f4085E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4122j = f(obtainStyledAttributes, index2, kVar.f4122j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4124k = f(obtainStyledAttributes, index2, kVar.f4124k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4090K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4090K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4136s = f(obtainStyledAttributes, index2, kVar.f4136s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4137t = f(obtainStyledAttributes, index2, kVar.f4137t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4087H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4087H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4127m = f(obtainStyledAttributes, index2, kVar.f4127m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4126l = f(obtainStyledAttributes, index2, kVar.f4126l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4141x = obtainStyledAttributes.getFloat(index2, kVar.f4141x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4076a = obtainStyledAttributes.getResourceId(index2, jVar.f4076a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4100U = obtainStyledAttributes.getFloat(index2, kVar.f4100U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4099T = obtainStyledAttributes.getFloat(index2, kVar.f4099T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4101V = obtainStyledAttributes.getInt(index2, kVar.f4101V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4102W = obtainStyledAttributes.getInt(index2, kVar.f4102W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4154c = obtainStyledAttributes.getFloat(index2, mVar.f4154c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4165l = true;
                        nVar.f4166m = obtainStyledAttributes.getDimension(index2, nVar.f4166m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4157b = obtainStyledAttributes.getFloat(index2, nVar.f4157b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4158c = obtainStyledAttributes.getFloat(index2, nVar.f4158c);
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
                        nVar.f4159e = obtainStyledAttributes.getFloat(index2, nVar.f4159e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4160f = obtainStyledAttributes.getDimension(index2, nVar.f4160f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4161g = obtainStyledAttributes.getDimension(index2, nVar.f4161g);
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
                        nVar.f4163j = obtainStyledAttributes.getDimension(index2, nVar.f4163j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4164k = obtainStyledAttributes.getDimension(index2, nVar.f4164k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4103X = obtainStyledAttributes.getInt(index2, kVar.f4103X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4104Y = obtainStyledAttributes.getInt(index2, kVar.f4104Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4105Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4105Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4107a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4107a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4109b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4109b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4111c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4111c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4156a = obtainStyledAttributes.getFloat(index2, nVar.f4156a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4143z = f(obtainStyledAttributes, index2, kVar.f4143z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4081A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4081A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4082B = obtainStyledAttributes.getFloat(index2, kVar.f4082B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4145a = f(obtainStyledAttributes, index2, lVar.f4145a);
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
                        lVar.f4148e = obtainStyledAttributes.getFloat(index2, lVar.f4148e);
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
                        kVar.f4112d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f4114e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        kVar.f4116f0 = obtainStyledAttributes.getInt(index2, kVar.f4116f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4118g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4118g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4123j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4130n0 = obtainStyledAttributes.getBoolean(index2, kVar.f4130n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4147c = obtainStyledAttributes.getInt(index2, lVar.f4147c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4125k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        mVar.f4153b = obtainStyledAttributes.getInt(index2, mVar.f4153b);
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
                        kVar.l0 = obtainStyledAttributes.getBoolean(index2, kVar.l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4128m0 = obtainStyledAttributes.getBoolean(index2, kVar.f4128m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4146b = obtainStyledAttributes.getInteger(index2, lVar.f4146b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        nVar.f4162h = f(obtainStyledAttributes, index2, nVar.f4162h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4150g = obtainStyledAttributes.getInteger(index2, lVar.f4150g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4149f = obtainStyledAttributes.getFloat(index2, lVar.f4149f);
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
                            lVar.f4151h = string2;
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
                        kVar.f4134q = f(obtainStyledAttributes, index2, kVar.f4134q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4135r = f(obtainStyledAttributes, index2, kVar.f4135r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4091L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4091L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4098S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4098S);
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
                        kVar.f4132o0 = obtainStyledAttributes.getInt(index2, kVar.f4132o0);
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
            if (kVar.f4123j0 != null) {
                kVar.f4121i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jVar;
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
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof k) {
                        ((k) obj).f4142y = trim2;
                        return;
                    } else {
                        if (obj instanceof i) {
                            ((i) obj).d(trim2, 5);
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
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.f3995H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f3996I = parseFloat;
                            }
                        } else if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i2 == 0) {
                                kVar.f4108b = 0;
                                kVar.f4100U = parseFloat;
                            } else {
                                kVar.f4110c = 0;
                                kVar.f4099T = parseFloat;
                            }
                        } else if (obj instanceof i) {
                            i iVar = (i) obj;
                            if (i2 == 0) {
                                iVar.b(23, 0);
                                iVar.a(39, parseFloat);
                            } else {
                                iVar.b(21, 0);
                                iVar.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(RecyclerView.A0, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f4005R = max;
                                eVar3.f3999L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f4006S = max;
                                eVar3.f4000M = 2;
                            }
                        } else if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i2 == 0) {
                                kVar2.f4108b = 0;
                                kVar2.f4112d0 = max;
                                kVar2.f4103X = 2;
                            } else {
                                kVar2.f4110c = 0;
                                kVar2.f4114e0 = max;
                                kVar2.f4104Y = 2;
                            }
                        } else if (obj instanceof i) {
                            i iVar2 = (i) obj;
                            if (i2 == 0) {
                                iVar2.b(23, 0);
                                iVar2.b(54, 2);
                            } else {
                                iVar2.b(21, 0);
                                iVar2.b(55, 2);
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
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i4;
                    eVar4.f4010W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i4;
                    eVar4.f4011X = z2;
                    return;
                }
            }
            if (obj instanceof k) {
                k kVar3 = (k) obj;
                if (i2 == 0) {
                    kVar3.f4108b = i4;
                    kVar3.l0 = z2;
                    return;
                } else {
                    kVar3.f4110c = i4;
                    kVar3.f4128m0 = z2;
                    return;
                }
            }
            if (obj instanceof i) {
                i iVar3 = (i) obj;
                if (i2 == 0) {
                    iVar3.b(23, i4);
                    iVar3.c(80, z2);
                    return;
                } else {
                    iVar3.b(21, i4);
                    iVar3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
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
                        if (parseFloat > RecyclerView.A0 && parseFloat2 > RecyclerView.A0) {
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
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f4171c;
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
                if (oVar.f4170b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        j jVar = (j) hashMap2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            if (childAt instanceof C0308a) {
                                k kVar = jVar.d;
                                kVar.f4120h0 = 1;
                                C0308a c0308a = (C0308a) childAt;
                                c0308a.setId(id);
                                c0308a.setType(kVar.f4116f0);
                                c0308a.setMargin(kVar.f4118g0);
                                c0308a.setAllowsGoneWidget(kVar.f4130n0);
                                int[] iArr = kVar.f4121i0;
                                if (iArr != null) {
                                    c0308a.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f4123j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0308a, str3);
                                        kVar.f4121i0 = c2;
                                        c0308a.setReferencedIds(c2);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap hashMap3 = jVar.f4080f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0309b c0309b = (C0309b) hashMap3.get(str4);
                                if (c0309b.f3976a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0290e.a(c0309b.f3977b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0309b.f3978c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0309b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0309b.f3981g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0309b.f3981g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0309b.f3979e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0309b.f3980f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0309b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0309b.f3978c));
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
                            childAt.setLayoutParams(eVar);
                            m mVar = jVar.f4077b;
                            if (mVar.f4153b == 0) {
                                childAt.setVisibility(mVar.f4152a);
                            }
                            childAt.setAlpha(mVar.f4154c);
                            n nVar = jVar.f4079e;
                            childAt.setRotation(nVar.f4156a);
                            childAt.setRotationX(nVar.f4157b);
                            childAt.setRotationY(nVar.f4158c);
                            childAt.setScaleX(nVar.d);
                            childAt.setScaleY(nVar.f4159e);
                            if (nVar.f4162h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f4162h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f4160f)) {
                                    childAt.setPivotX(nVar.f4160f);
                                }
                                if (!Float.isNaN(nVar.f4161g)) {
                                    childAt.setPivotY(nVar.f4161g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f4163j);
                            childAt.setTranslationZ(nVar.f4164k);
                            if (nVar.f4165l) {
                                childAt.setElevation(nVar.f4166m);
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
            j jVar2 = (j) hashMap2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.d;
                if (kVar2.f4120h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0308a c0308a2 = new C0308a(context);
                    c0308a2.f3982a = new int[32];
                    c0308a2.f3987g = new HashMap();
                    c0308a2.f3984c = context;
                    C0297a c0297a = new C0297a();
                    c0297a.f3725s0 = 0;
                    c0297a.f3726t0 = true;
                    c0297a.f3727u0 = 0;
                    c0297a.f3728v0 = false;
                    c0308a2.f3975j = c0297a;
                    c0308a2.d = c0297a;
                    c0308a2.i();
                    c0308a2.setVisibility(8);
                    c0308a2.setId(num.intValue());
                    int[] iArr2 = kVar2.f4121i0;
                    if (iArr2 != null) {
                        c0308a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f4123j0;
                        if (str5 != null) {
                            int[] c3 = c(c0308a2, str5);
                            kVar2.f4121i0 = c3;
                            c0308a2.setReferencedIds(c3);
                        }
                    }
                    c0308a2.setType(kVar2.f4116f0);
                    c0308a2.setMargin(kVar2.f4118g0);
                    e g2 = ConstraintLayout.g();
                    c0308a2.i();
                    jVar2.a(g2);
                    constraintLayout.addView(c0308a2, g2);
                }
                if (kVar2.f4106a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e g3 = ConstraintLayout.g();
                    jVar2.a(g3);
                    constraintLayout.addView(qVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = oVar.f4171c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f4170b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) hashMap.get(Integer.valueOf(id));
            if (jVar != null) {
                HashMap hashMap2 = oVar.f4169a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0309b c0309b = (C0309b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0309b(c0309b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0309b(c0309b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                jVar.f4080f = hashMap3;
                jVar.f4076a = id;
                int i2 = eVar.f4021e;
                k kVar = jVar.d;
                kVar.f4119h = i2;
                kVar.i = eVar.f4023f;
                kVar.f4122j = eVar.f4025g;
                kVar.f4124k = eVar.f4027h;
                kVar.f4126l = eVar.i;
                kVar.f4127m = eVar.f4030j;
                kVar.f4129n = eVar.f4032k;
                kVar.f4131o = eVar.f4034l;
                kVar.f4133p = eVar.f4035m;
                kVar.f4134q = eVar.f4037n;
                kVar.f4135r = eVar.f4039o;
                kVar.f4136s = eVar.f4044s;
                kVar.f4137t = eVar.f4045t;
                kVar.f4138u = eVar.f4046u;
                kVar.f4139v = eVar.f4047v;
                kVar.f4140w = eVar.f3993E;
                kVar.f4141x = eVar.f3994F;
                kVar.f4142y = eVar.G;
                kVar.f4143z = eVar.f4041p;
                kVar.f4081A = eVar.f4042q;
                kVar.f4082B = eVar.f4043r;
                kVar.f4083C = eVar.f4007T;
                kVar.f4084D = eVar.f4008U;
                kVar.f4085E = eVar.f4009V;
                kVar.f4115f = eVar.f4018c;
                kVar.d = eVar.f4014a;
                kVar.f4113e = eVar.f4016b;
                kVar.f4108b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f4110c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.f4086F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.f4087H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.f4088I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.f4091L = eVar.f3992D;
                kVar.f4099T = eVar.f3996I;
                kVar.f4100U = eVar.f3995H;
                kVar.f4102W = eVar.f3998K;
                kVar.f4101V = eVar.f3997J;
                kVar.l0 = eVar.f4010W;
                kVar.f4128m0 = eVar.f4011X;
                kVar.f4103X = eVar.f3999L;
                kVar.f4104Y = eVar.f4000M;
                kVar.f4105Z = eVar.f4003P;
                kVar.f4107a0 = eVar.f4004Q;
                kVar.f4109b0 = eVar.f4001N;
                kVar.f4111c0 = eVar.f4002O;
                kVar.f4112d0 = eVar.f4005R;
                kVar.f4114e0 = eVar.f4006S;
                kVar.f4125k0 = eVar.f4012Y;
                kVar.f4093N = eVar.f4049x;
                kVar.f4095P = eVar.f4051z;
                kVar.f4092M = eVar.f4048w;
                kVar.f4094O = eVar.f4050y;
                kVar.f4097R = eVar.f3989A;
                kVar.f4096Q = eVar.f3990B;
                kVar.f4098S = eVar.f3991C;
                kVar.f4132o0 = eVar.f4013Z;
                kVar.f4089J = eVar.getMarginEnd();
                kVar.f4090K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = jVar.f4077b;
                mVar.f4152a = visibility;
                mVar.f4154c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = jVar.f4079e;
                nVar.f4156a = rotation;
                nVar.f4157b = childAt.getRotationX();
                nVar.f4158c = childAt.getRotationY();
                nVar.d = childAt.getScaleX();
                nVar.f4159e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f4160f = pivotX;
                    nVar.f4161g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f4163j = childAt.getTranslationY();
                nVar.f4164k = childAt.getTranslationZ();
                if (nVar.f4165l) {
                    nVar.f4166m = childAt.getElevation();
                }
                if (childAt instanceof C0308a) {
                    C0308a c0308a = (C0308a) childAt;
                    kVar.f4130n0 = c0308a.getAllowsGoneWidget();
                    kVar.f4121i0 = c0308a.getReferencedIds();
                    kVar.f4116f0 = c0308a.getType();
                    kVar.f4118g0 = c0308a.getMargin();
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
                    j d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4106a = true;
                    }
                    this.f4171c.put(Integer.valueOf(d2.f4076a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
