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
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0287e;
import r.AbstractC0292a;
import s.C0294a;
import u.AbstractC0303a;

/* loaded from: classes.dex */
public final class o {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4016e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4017f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4018a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4019b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4020c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4016e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4017f = sparseIntArray2;
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

    public static int[] c(C0305a c0305a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0305a.getContext();
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
            if (i == 0 && c0305a.isInEditMode() && (c0305a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0305a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1380m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1380m.get(trim);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? s.f4024c : s.f4022a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4016e;
        m mVar = jVar.f3929b;
        String[] strArr = AbstractC0292a.f3507a;
        n nVar = jVar.f3931e;
        l lVar = jVar.f3930c;
        k kVar = jVar.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            i iVar = new i();
            iVar.f3919a = new int[10];
            iVar.f3920b = new int[10];
            iVar.f3921c = 0;
            iVar.d = new int[10];
            iVar.f3922e = new float[10];
            iVar.f3923f = 0;
            iVar.f3924g = new int[5];
            iVar.h = new String[5];
            iVar.i = 0;
            iVar.f3925j = new int[4];
            iVar.f3926k = new boolean[4];
            iVar.f3927l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4017f.get(index)) {
                    case 2:
                        str4 = str5;
                        iVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3941I));
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
                        iVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3936C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        iVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3937D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        iVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3942J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        iVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3948P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        iVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3949Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        iVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3945M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        iVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3947O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        iVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3950R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        iVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3946N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        iVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        iVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3966e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        iVar.a(19, obtainStyledAttributes.getFloat(index, kVar.f3968f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        iVar.a(20, obtainStyledAttributes.getFloat(index, kVar.f3991w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        iVar.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f3963c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        iVar.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f4002a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        iVar.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f3961b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        iVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        iVar.b(27, obtainStyledAttributes.getInt(index, kVar.f3938E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        iVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3939G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        iVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3943K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        iVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3940H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        iVar.a(37, obtainStyledAttributes.getFloat(index, kVar.f3992x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jVar.f3928a);
                        jVar.f3928a = resourceId;
                        iVar.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        iVar.a(39, obtainStyledAttributes.getFloat(index, kVar.f3953U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        iVar.a(40, obtainStyledAttributes.getFloat(index, kVar.f3952T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        iVar.b(41, obtainStyledAttributes.getInt(index, kVar.f3954V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        iVar.b(42, obtainStyledAttributes.getInt(index, kVar.f3955W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        iVar.a(43, obtainStyledAttributes.getFloat(index, mVar.f4004c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        iVar.c(44, true);
                        iVar.a(44, obtainStyledAttributes.getDimension(index, nVar.f4015m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        iVar.a(45, obtainStyledAttributes.getFloat(index, nVar.f4007b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        iVar.a(46, obtainStyledAttributes.getFloat(index, nVar.f4008c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        iVar.a(47, obtainStyledAttributes.getFloat(index, nVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        iVar.a(48, obtainStyledAttributes.getFloat(index, nVar.f4009e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        iVar.a(49, obtainStyledAttributes.getDimension(index, nVar.f4010f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        iVar.a(50, obtainStyledAttributes.getDimension(index, nVar.f4011g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        iVar.a(51, obtainStyledAttributes.getDimension(index, nVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        iVar.a(52, obtainStyledAttributes.getDimension(index, nVar.f4012j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        iVar.a(53, obtainStyledAttributes.getDimension(index, nVar.f4013k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        iVar.b(54, obtainStyledAttributes.getInt(index, kVar.f3956X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        iVar.b(55, obtainStyledAttributes.getInt(index, kVar.f3957Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        iVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3958Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        iVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3960a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        iVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3962b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        iVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3964c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        iVar.a(60, obtainStyledAttributes.getFloat(index, nVar.f4006a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        iVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3934A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        iVar.a(63, obtainStyledAttributes.getFloat(index, kVar.f3935B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        iVar.b(64, f(obtainStyledAttributes, index, lVar.f3996a));
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
                        iVar.a(67, obtainStyledAttributes.getFloat(index, lVar.f3999e));
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
                        iVar.b(72, obtainStyledAttributes.getInt(index, kVar.f3969f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        iVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3971g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        iVar.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        iVar.c(75, obtainStyledAttributes.getBoolean(index, kVar.f3982n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        iVar.b(76, obtainStyledAttributes.getInt(index, lVar.f3998c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        iVar.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        iVar.b(78, obtainStyledAttributes.getInt(index, mVar.f4003b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        iVar.a(79, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        iVar.c(80, obtainStyledAttributes.getBoolean(index, kVar.f3978l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        iVar.c(81, obtainStyledAttributes.getBoolean(index, kVar.f3980m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        iVar.b(82, obtainStyledAttributes.getInteger(index, lVar.f3997b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        iVar.b(83, f(obtainStyledAttributes, index, nVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        iVar.b(84, obtainStyledAttributes.getInteger(index, lVar.f4001g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        iVar.a(85, obtainStyledAttributes.getFloat(index, lVar.f4000f));
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
                            lVar.h = string;
                            iVar.d(string, 90);
                            if (lVar.h.indexOf("/") > 0) {
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
                        iVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3944L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        iVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3951S));
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
                        iVar.b(97, obtainStyledAttributes.getInt(index, kVar.o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0303a.f3812s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            jVar.f3928a = obtainStyledAttributes.getResourceId(index, jVar.f3928a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        iVar.c(99, obtainStyledAttributes.getBoolean(index, kVar.f3970g));
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
                        kVar.f3984p = f(obtainStyledAttributes, index2, kVar.f3984p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3941I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3941I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3983o = f(obtainStyledAttributes, index2, kVar.f3983o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3981n = f(obtainStyledAttributes, index2, kVar.f3981n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3993y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3936C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3936C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3937D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3937D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3942J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3942J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3990v = f(obtainStyledAttributes, index2, kVar.f3990v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3989u = f(obtainStyledAttributes, index2, kVar.f3989u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3948P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3948P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3949Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3949Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3945M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3945M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3947O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3947O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3950R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3950R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3946N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3946N);
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
                        kVar.f3966e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3966e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3968f = obtainStyledAttributes.getFloat(index2, kVar.f3968f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3991w = obtainStyledAttributes.getFloat(index2, kVar.f3991w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3963c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3963c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, mVar.f4002a);
                        mVar.f4002a = i10;
                        mVar.f4002a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3961b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3961b);
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
                        kVar.f3938E = obtainStyledAttributes.getInt(index2, kVar.f3938E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3939G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3939G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3974j = f(obtainStyledAttributes, index2, kVar.f3974j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3976k = f(obtainStyledAttributes, index2, kVar.f3976k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3943K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3943K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3987s = f(obtainStyledAttributes, index2, kVar.f3987s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3988t = f(obtainStyledAttributes, index2, kVar.f3988t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3940H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3940H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3979m = f(obtainStyledAttributes, index2, kVar.f3979m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3977l = f(obtainStyledAttributes, index2, kVar.f3977l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3992x = obtainStyledAttributes.getFloat(index2, kVar.f3992x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f3928a = obtainStyledAttributes.getResourceId(index2, jVar.f3928a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3953U = obtainStyledAttributes.getFloat(index2, kVar.f3953U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3952T = obtainStyledAttributes.getFloat(index2, kVar.f3952T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3954V = obtainStyledAttributes.getInt(index2, kVar.f3954V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3955W = obtainStyledAttributes.getInt(index2, kVar.f3955W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4004c = obtainStyledAttributes.getFloat(index2, mVar.f4004c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4014l = true;
                        nVar.f4015m = obtainStyledAttributes.getDimension(index2, nVar.f4015m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4007b = obtainStyledAttributes.getFloat(index2, nVar.f4007b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4008c = obtainStyledAttributes.getFloat(index2, nVar.f4008c);
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
                        nVar.f4009e = obtainStyledAttributes.getFloat(index2, nVar.f4009e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4010f = obtainStyledAttributes.getDimension(index2, nVar.f4010f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4011g = obtainStyledAttributes.getDimension(index2, nVar.f4011g);
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
                        nVar.f4012j = obtainStyledAttributes.getDimension(index2, nVar.f4012j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4013k = obtainStyledAttributes.getDimension(index2, nVar.f4013k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3956X = obtainStyledAttributes.getInt(index2, kVar.f3956X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3957Y = obtainStyledAttributes.getInt(index2, kVar.f3957Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3958Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3958Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3960a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3960a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3962b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3962b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3964c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3964c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f4006a = obtainStyledAttributes.getFloat(index2, nVar.f4006a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3994z = f(obtainStyledAttributes, index2, kVar.f3994z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3934A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3934A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3935B = obtainStyledAttributes.getFloat(index2, kVar.f3935B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f3996a = f(obtainStyledAttributes, index2, lVar.f3996a);
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
                        lVar.f3999e = obtainStyledAttributes.getFloat(index2, lVar.f3999e);
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
                        kVar.f3965d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f3967e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        kVar.f3969f0 = obtainStyledAttributes.getInt(index2, kVar.f3969f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3971g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3971g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3975j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3982n0 = obtainStyledAttributes.getBoolean(index2, kVar.f3982n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f3998c = obtainStyledAttributes.getInt(index2, lVar.f3998c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        kVar.k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        mVar.f4003b = obtainStyledAttributes.getInt(index2, mVar.f4003b);
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
                        kVar.f3978l0 = obtainStyledAttributes.getBoolean(index2, kVar.f3978l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3980m0 = obtainStyledAttributes.getBoolean(index2, kVar.f3980m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f3997b = obtainStyledAttributes.getInteger(index2, lVar.f3997b);
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
                        lVar.f4001g = obtainStyledAttributes.getInteger(index2, lVar.f4001g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4000f = obtainStyledAttributes.getFloat(index2, lVar.f4000f);
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
                        kVar.f3985q = f(obtainStyledAttributes, index2, kVar.f3985q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3986r = f(obtainStyledAttributes, index2, kVar.f3986r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3944L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3944L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3951S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3951S);
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
                        kVar.o0 = obtainStyledAttributes.getInt(index2, kVar.o0);
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
            if (kVar.f3975j0 != null) {
                kVar.f3973i0 = null;
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
                        ((k) obj).f3993y = trim2;
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
                                eVar2.f3850H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f3851I = parseFloat;
                            }
                        } else if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i2 == 0) {
                                kVar.f3961b = 0;
                                kVar.f3953U = parseFloat;
                            } else {
                                kVar.f3963c = 0;
                                kVar.f3952T = parseFloat;
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
                        float max = Math.max(RecyclerView.f1530C0, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f3860R = max;
                                eVar3.f3854L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f3861S = max;
                                eVar3.f3855M = 2;
                            }
                        } else if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i2 == 0) {
                                kVar2.f3961b = 0;
                                kVar2.f3965d0 = max;
                                kVar2.f3956X = 2;
                            } else {
                                kVar2.f3963c = 0;
                                kVar2.f3967e0 = max;
                                kVar2.f3957Y = 2;
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
                    eVar4.f3865W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i4;
                    eVar4.f3866X = z2;
                    return;
                }
            }
            if (obj instanceof k) {
                k kVar3 = (k) obj;
                if (i2 == 0) {
                    kVar3.f3961b = i4;
                    kVar3.f3978l0 = z2;
                    return;
                } else {
                    kVar3.f3963c = i4;
                    kVar3.f3980m0 = z2;
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
                        if (parseFloat > RecyclerView.f1530C0 && parseFloat2 > RecyclerView.f1530C0) {
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
        eVar.f3849G = str;
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
        HashMap hashMap2 = oVar.f4020c;
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
                if (oVar.f4019b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        j jVar = (j) hashMap2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            if (childAt instanceof C0305a) {
                                k kVar = jVar.d;
                                kVar.f3972h0 = 1;
                                C0305a c0305a = (C0305a) childAt;
                                c0305a.setId(id);
                                c0305a.setType(kVar.f3969f0);
                                c0305a.setMargin(kVar.f3971g0);
                                c0305a.setAllowsGoneWidget(kVar.f3982n0);
                                int[] iArr = kVar.f3973i0;
                                if (iArr != null) {
                                    c0305a.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f3975j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0305a, str3);
                                        kVar.f3973i0 = c2;
                                        c0305a.setReferencedIds(c2);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap hashMap3 = jVar.f3932f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0306b c0306b = (C0306b) hashMap3.get(str4);
                                if (c0306b.f3831a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0287e.a(c0306b.f3832b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0306b.f3833c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0306b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0306b.f3836g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0306b.f3836g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0306b.f3834e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0306b.f3835f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0306b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0306b.f3833c));
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
                            m mVar = jVar.f3929b;
                            if (mVar.f4003b == 0) {
                                childAt.setVisibility(mVar.f4002a);
                            }
                            childAt.setAlpha(mVar.f4004c);
                            n nVar = jVar.f3931e;
                            childAt.setRotation(nVar.f4006a);
                            childAt.setRotationX(nVar.f4007b);
                            childAt.setRotationY(nVar.f4008c);
                            childAt.setScaleX(nVar.d);
                            childAt.setScaleY(nVar.f4009e);
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
                                if (!Float.isNaN(nVar.f4010f)) {
                                    childAt.setPivotX(nVar.f4010f);
                                }
                                if (!Float.isNaN(nVar.f4011g)) {
                                    childAt.setPivotY(nVar.f4011g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f4012j);
                            childAt.setTranslationZ(nVar.f4013k);
                            if (nVar.f4014l) {
                                childAt.setElevation(nVar.f4015m);
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
                if (kVar2.f3972h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0305a c0305a2 = new C0305a(context);
                    c0305a2.f3837a = new int[32];
                    c0305a2.f3842g = new HashMap();
                    c0305a2.f3839c = context;
                    C0294a c0294a = new C0294a();
                    c0294a.f3525s0 = 0;
                    c0294a.f3526t0 = true;
                    c0294a.f3527u0 = 0;
                    c0294a.f3528v0 = false;
                    c0305a2.f3830j = c0294a;
                    c0305a2.d = c0294a;
                    c0305a2.i();
                    c0305a2.setVisibility(8);
                    c0305a2.setId(num.intValue());
                    int[] iArr2 = kVar2.f3973i0;
                    if (iArr2 != null) {
                        c0305a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f3975j0;
                        if (str5 != null) {
                            int[] c3 = c(c0305a2, str5);
                            kVar2.f3973i0 = c3;
                            c0305a2.setReferencedIds(c3);
                        }
                    }
                    c0305a2.setType(kVar2.f3969f0);
                    c0305a2.setMargin(kVar2.f3971g0);
                    e g2 = ConstraintLayout.g();
                    c0305a2.i();
                    jVar2.a(g2);
                    constraintLayout.addView(c0305a2, g2);
                }
                if (kVar2.f3959a) {
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
        HashMap hashMap = oVar.f4020c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f4019b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) hashMap.get(Integer.valueOf(id));
            if (jVar != null) {
                HashMap hashMap2 = oVar.f4018a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0306b c0306b = (C0306b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0306b(c0306b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0306b(c0306b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                jVar.f3932f = hashMap3;
                jVar.f3928a = id;
                int i2 = eVar.f3876e;
                k kVar = jVar.d;
                kVar.h = i2;
                kVar.i = eVar.f3878f;
                kVar.f3974j = eVar.f3880g;
                kVar.f3976k = eVar.h;
                kVar.f3977l = eVar.i;
                kVar.f3979m = eVar.f3884j;
                kVar.f3981n = eVar.f3886k;
                kVar.f3983o = eVar.f3887l;
                kVar.f3984p = eVar.f3889m;
                kVar.f3985q = eVar.f3891n;
                kVar.f3986r = eVar.f3893o;
                kVar.f3987s = eVar.f3898s;
                kVar.f3988t = eVar.f3899t;
                kVar.f3989u = eVar.f3900u;
                kVar.f3990v = eVar.f3901v;
                kVar.f3991w = eVar.f3848E;
                kVar.f3992x = eVar.F;
                kVar.f3993y = eVar.f3849G;
                kVar.f3994z = eVar.f3894p;
                kVar.f3934A = eVar.f3896q;
                kVar.f3935B = eVar.f3897r;
                kVar.f3936C = eVar.f3862T;
                kVar.f3937D = eVar.f3863U;
                kVar.f3938E = eVar.f3864V;
                kVar.f3968f = eVar.f3873c;
                kVar.d = eVar.f3869a;
                kVar.f3966e = eVar.f3871b;
                kVar.f3961b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f3963c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.f3939G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.f3940H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.f3941I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.f3944L = eVar.f3847D;
                kVar.f3952T = eVar.f3851I;
                kVar.f3953U = eVar.f3850H;
                kVar.f3955W = eVar.f3853K;
                kVar.f3954V = eVar.f3852J;
                kVar.f3978l0 = eVar.f3865W;
                kVar.f3980m0 = eVar.f3866X;
                kVar.f3956X = eVar.f3854L;
                kVar.f3957Y = eVar.f3855M;
                kVar.f3958Z = eVar.f3858P;
                kVar.f3960a0 = eVar.f3859Q;
                kVar.f3962b0 = eVar.f3856N;
                kVar.f3964c0 = eVar.f3857O;
                kVar.f3965d0 = eVar.f3860R;
                kVar.f3967e0 = eVar.f3861S;
                kVar.k0 = eVar.f3867Y;
                kVar.f3946N = eVar.f3903x;
                kVar.f3948P = eVar.f3905z;
                kVar.f3945M = eVar.f3902w;
                kVar.f3947O = eVar.f3904y;
                kVar.f3950R = eVar.f3844A;
                kVar.f3949Q = eVar.f3845B;
                kVar.f3951S = eVar.f3846C;
                kVar.o0 = eVar.f3868Z;
                kVar.f3942J = eVar.getMarginEnd();
                kVar.f3943K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = jVar.f3929b;
                mVar.f4002a = visibility;
                mVar.f4004c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = jVar.f3931e;
                nVar.f4006a = rotation;
                nVar.f4007b = childAt.getRotationX();
                nVar.f4008c = childAt.getRotationY();
                nVar.d = childAt.getScaleX();
                nVar.f4009e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f4010f = pivotX;
                    nVar.f4011g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f4012j = childAt.getTranslationY();
                nVar.f4013k = childAt.getTranslationZ();
                if (nVar.f4014l) {
                    nVar.f4015m = childAt.getElevation();
                }
                if (childAt instanceof C0305a) {
                    C0305a c0305a = (C0305a) childAt;
                    kVar.f3982n0 = c0305a.getAllowsGoneWidget();
                    kVar.f3973i0 = c0305a.getReferencedIds();
                    kVar.f3969f0 = c0305a.getType();
                    kVar.f3971g0 = c0305a.getMargin();
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
                        d2.d.f3959a = true;
                    }
                    this.f4020c.put(Integer.valueOf(d2.f3928a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
