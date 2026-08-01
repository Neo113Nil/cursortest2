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
import com.winpower.neonfit.data.UserPreferences;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC0380e;
import t.AbstractC0382a;
import u.C0384a;
import w.AbstractC0408a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4696d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4697f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4698a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4699b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4700c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4697f = sparseIntArray2;
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

    public static int[] c(C0410a c0410a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0410a.getContext();
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
            if (i == 0 && c0410a.isInEditMode() && (c0410a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0410a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1830m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1830m.get(trim);
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
    public static C0418i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0418i c0418i = new C0418i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4704c : r.f4702a);
        int[] iArr = f4696d;
        SparseIntArray sparseIntArray = e;
        l lVar = c0418i.f4607b;
        String[] strArr = AbstractC0382a.f4143a;
        m mVar = c0418i.e;
        k kVar = c0418i.f4608c;
        C0419j c0419j = c0418i.f4609d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0417h c0417h = new C0417h();
            c0417h.f4597a = new int[10];
            c0417h.f4598b = new int[10];
            c0417h.f4599c = 0;
            c0417h.f4600d = new int[10];
            c0417h.e = new float[10];
            c0417h.f4601f = 0;
            c0417h.f4602g = new int[5];
            c0417h.f4603h = new String[5];
            c0417h.i = 0;
            c0417h.j = new int[4];
            c0417h.f4604k = new boolean[4];
            c0417h.f4605l = 0;
            kVar.getClass();
            c0419j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4697f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0417h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4619I));
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
                        c0417h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0417h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0419j.f4614C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0417h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0419j.f4615D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0417h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4620J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0417h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4626P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0417h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4627Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0417h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4623M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0417h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4625O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0417h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4628R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0417h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4624N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0417h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0419j.f4643d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0417h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0419j.e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0417h.a(19, obtainStyledAttributes.getFloat(index, c0419j.f4646f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0417h.a(20, obtainStyledAttributes.getFloat(index, c0419j.f4670w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0417h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0419j.f4641c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0417h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4681a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0417h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0419j.f4639b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0417h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4617F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0417h.b(27, obtainStyledAttributes.getInt(index, c0419j.f4616E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0417h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4618G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0417h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4621K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0417h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0417h.a(37, obtainStyledAttributes.getFloat(index, c0419j.f4671x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0418i.f4606a);
                        c0418i.f4606a = resourceId;
                        c0417h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0417h.a(39, obtainStyledAttributes.getFloat(index, c0419j.f4631U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0417h.a(40, obtainStyledAttributes.getFloat(index, c0419j.f4630T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0417h.b(41, obtainStyledAttributes.getInt(index, c0419j.f4632V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0417h.b(42, obtainStyledAttributes.getInt(index, c0419j.f4633W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0417h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4683c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0417h.c(44, true);
                        c0417h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4695m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0417h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4687b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0417h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4688c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0417h.a(47, obtainStyledAttributes.getFloat(index, mVar.f4689d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0417h.a(48, obtainStyledAttributes.getFloat(index, mVar.e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0417h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4690f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0417h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4691g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0417h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0417h.a(52, obtainStyledAttributes.getDimension(index, mVar.j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0417h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4693k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0417h.b(54, obtainStyledAttributes.getInt(index, c0419j.f4634X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0417h.b(55, obtainStyledAttributes.getInt(index, c0419j.f4635Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0417h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4636Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0417h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4638a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0417h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4640b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0417h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4642c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0417h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4686a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0417h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4612A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0417h.a(63, obtainStyledAttributes.getFloat(index, c0419j.f4613B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0417h.b(64, f(obtainStyledAttributes, index, kVar.f4674a));
                        i3 = 1;
                        break;
                    case UserPreferences.DEFAULT_FAT_GOAL /* 65 */:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0417h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0417h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0417h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0417h.a(67, obtainStyledAttributes.getFloat(index, kVar.e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0417h.a(68, obtainStyledAttributes.getFloat(index, lVar.f4684d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0417h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0417h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0417h.b(72, obtainStyledAttributes.getInt(index, c0419j.f4647f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0417h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4649g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0417h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0417h.c(75, obtainStyledAttributes.getBoolean(index, c0419j.f4661n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0417h.b(76, obtainStyledAttributes.getInt(index, kVar.f4676c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0417h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0417h.b(78, obtainStyledAttributes.getInt(index, lVar.f4682b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0417h.a(79, obtainStyledAttributes.getFloat(index, kVar.f4677d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0417h.c(80, obtainStyledAttributes.getBoolean(index, c0419j.f4657l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0417h.c(81, obtainStyledAttributes.getBoolean(index, c0419j.f4659m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0417h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4675b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0417h.b(83, f(obtainStyledAttributes, index, mVar.f4692h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0417h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4679g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0417h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4678f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0417h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0417h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f4680h = string;
                            c0417h.d(string, 90);
                            if (kVar.f4680h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0417h.b(89, resourceId3);
                                c0417h.b(88, -2);
                            } else {
                                c0417h.b(88, -1);
                            }
                        } else {
                            c0417h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0417h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4622L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0417h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0419j.f4629S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0417h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0417h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0417h.b(97, obtainStyledAttributes.getInt(index, c0419j.o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0408a.f4458s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0418i.f4606a = obtainStyledAttributes.getResourceId(index, c0418i.f4606a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0417h.c(99, obtainStyledAttributes.getBoolean(index, c0419j.f4648g));
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
                    c0419j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4663p = f(obtainStyledAttributes, index2, c0419j.f4663p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4619I = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4619I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4662o = f(obtainStyledAttributes, index2, c0419j.f4662o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4660n = f(obtainStyledAttributes, index2, c0419j.f4660n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4672y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4614C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0419j.f4614C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4615D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0419j.f4615D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4620J = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4620J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4669v = f(obtainStyledAttributes, index2, c0419j.f4669v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4668u = f(obtainStyledAttributes, index2, c0419j.f4668u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4626P = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4626P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4627Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4627Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4623M = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4623M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4625O = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4625O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4628R = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4628R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4624N = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4624N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4643d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0419j.f4643d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0419j.e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4646f = obtainStyledAttributes.getFloat(index2, c0419j.f4646f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4670w = obtainStyledAttributes.getFloat(index2, c0419j.f4670w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4641c = obtainStyledAttributes.getLayoutDimension(index2, c0419j.f4641c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4681a);
                        lVar.f4681a = i10;
                        lVar.f4681a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4639b = obtainStyledAttributes.getLayoutDimension(index2, c0419j.f4639b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4617F = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4617F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4650h = f(obtainStyledAttributes, index2, c0419j.f4650h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.i = f(obtainStyledAttributes, index2, c0419j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4616E = obtainStyledAttributes.getInt(index2, c0419j.f4616E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4618G = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4618G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.j = f(obtainStyledAttributes, index2, c0419j.j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4654k = f(obtainStyledAttributes, index2, c0419j.f4654k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4621K = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4621K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4666s = f(obtainStyledAttributes, index2, c0419j.f4666s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4667t = f(obtainStyledAttributes, index2, c0419j.f4667t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.H = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4658m = f(obtainStyledAttributes, index2, c0419j.f4658m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4656l = f(obtainStyledAttributes, index2, c0419j.f4656l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4671x = obtainStyledAttributes.getFloat(index2, c0419j.f4671x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0418i.f4606a = obtainStyledAttributes.getResourceId(index2, c0418i.f4606a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4631U = obtainStyledAttributes.getFloat(index2, c0419j.f4631U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4630T = obtainStyledAttributes.getFloat(index2, c0419j.f4630T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4632V = obtainStyledAttributes.getInt(index2, c0419j.f4632V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4633W = obtainStyledAttributes.getInt(index2, c0419j.f4633W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4683c = obtainStyledAttributes.getFloat(index2, lVar.f4683c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4694l = true;
                        mVar.f4695m = obtainStyledAttributes.getDimension(index2, mVar.f4695m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4687b = obtainStyledAttributes.getFloat(index2, mVar.f4687b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4688c = obtainStyledAttributes.getFloat(index2, mVar.f4688c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4689d = obtainStyledAttributes.getFloat(index2, mVar.f4689d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.e = obtainStyledAttributes.getFloat(index2, mVar.e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4690f = obtainStyledAttributes.getDimension(index2, mVar.f4690f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4691g = obtainStyledAttributes.getDimension(index2, mVar.f4691g);
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
                        mVar.j = obtainStyledAttributes.getDimension(index2, mVar.j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4693k = obtainStyledAttributes.getDimension(index2, mVar.f4693k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4634X = obtainStyledAttributes.getInt(index2, c0419j.f4634X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4635Y = obtainStyledAttributes.getInt(index2, c0419j.f4635Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4636Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4636Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4638a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4638a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4640b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4640b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4642c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4642c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4686a = obtainStyledAttributes.getFloat(index2, mVar.f4686a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4673z = f(obtainStyledAttributes, index2, c0419j.f4673z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4612A = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4612A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0419j.f4613B = obtainStyledAttributes.getFloat(index2, c0419j.f4613B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4674a = f(obtainStyledAttributes, index2, kVar.f4674a);
                        i2 = 1;
                        break;
                    case UserPreferences.DEFAULT_FAT_GOAL /* 65 */:
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
                        kVar.e = obtainStyledAttributes.getFloat(index2, kVar.e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f4684d = obtainStyledAttributes.getFloat(index2, lVar.f4684d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0419j.f4644d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0419j.f4645e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0419j.f4647f0 = obtainStyledAttributes.getInt(index2, c0419j.f4647f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4649g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4649g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4653j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4661n0 = obtainStyledAttributes.getBoolean(index2, c0419j.f4661n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4676c = obtainStyledAttributes.getInt(index2, kVar.f4676c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4655k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4682b = obtainStyledAttributes.getInt(index2, lVar.f4682b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4677d = obtainStyledAttributes.getFloat(index2, kVar.f4677d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4657l0 = obtainStyledAttributes.getBoolean(index2, c0419j.f4657l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4659m0 = obtainStyledAttributes.getBoolean(index2, c0419j.f4659m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4675b = obtainStyledAttributes.getInteger(index2, kVar.f4675b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        mVar.f4692h = f(obtainStyledAttributes, index2, mVar.f4692h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4679g = obtainStyledAttributes.getInteger(index2, kVar.f4679g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4678f = obtainStyledAttributes.getFloat(index2, kVar.f4678f);
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
                            kVar.f4680h = string2;
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
                        c0419j.f4664q = f(obtainStyledAttributes, index2, c0419j.f4664q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4665r = f(obtainStyledAttributes, index2, c0419j.f4665r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4622L = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4622L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.f4629S = obtainStyledAttributes.getDimensionPixelSize(index2, c0419j.f4629S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0419j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0419j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0419j.o0 = obtainStyledAttributes.getInt(index2, c0419j.o0);
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
            if (c0419j.f4653j0 != null) {
                c0419j.f4652i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0418i;
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
                    if (obj instanceof C0414e) {
                        C0414e c0414e = (C0414e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0414e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0414e).height = 0;
                        }
                        h(c0414e, trim2);
                        return;
                    }
                    if (obj instanceof C0419j) {
                        ((C0419j) obj).f4672y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0417h) {
                            ((C0417h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0414e) {
                            C0414e c0414e2 = (C0414e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0414e2).width = 0;
                                c0414e2.H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0414e2).height = 0;
                                c0414e2.f4530I = parseFloat;
                            }
                        } else if (obj instanceof C0419j) {
                            C0419j c0419j = (C0419j) obj;
                            if (i2 == 0) {
                                c0419j.f4639b = 0;
                                c0419j.f4631U = parseFloat;
                            } else {
                                c0419j.f4641c = 0;
                                c0419j.f4630T = parseFloat;
                            }
                        } else if (obj instanceof C0417h) {
                            C0417h c0417h = (C0417h) obj;
                            if (i2 == 0) {
                                c0417h.b(23, 0);
                                c0417h.a(39, parseFloat);
                            } else {
                                c0417h.b(21, 0);
                                c0417h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0414e) {
                            C0414e c0414e3 = (C0414e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0414e3).width = 0;
                                c0414e3.f4539R = max;
                                c0414e3.f4533L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0414e3).height = 0;
                                c0414e3.f4540S = max;
                                c0414e3.f4534M = 2;
                            }
                        } else if (obj instanceof C0419j) {
                            C0419j c0419j2 = (C0419j) obj;
                            if (i2 == 0) {
                                c0419j2.f4639b = 0;
                                c0419j2.f4644d0 = max;
                                c0419j2.f4634X = 2;
                            } else {
                                c0419j2.f4641c = 0;
                                c0419j2.f4645e0 = max;
                                c0419j2.f4635Y = 2;
                            }
                        } else if (obj instanceof C0417h) {
                            C0417h c0417h2 = (C0417h) obj;
                            if (i2 == 0) {
                                c0417h2.b(23, 0);
                                c0417h2.b(54, 2);
                            } else {
                                c0417h2.b(21, 0);
                                c0417h2.b(55, 2);
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
            if (!(obj instanceof C0414e)) {
                C0414e c0414e4 = (C0414e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0414e4).width = i4;
                    c0414e4.f4544W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0414e4).height = i4;
                    c0414e4.f4545X = z2;
                    return;
                }
            }
            if (obj instanceof C0419j) {
                C0419j c0419j3 = (C0419j) obj;
                if (i2 == 0) {
                    c0419j3.f4639b = i4;
                    c0419j3.f4657l0 = z2;
                    return;
                } else {
                    c0419j3.f4641c = i4;
                    c0419j3.f4659m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0417h) {
                C0417h c0417h3 = (C0417h) obj;
                if (i2 == 0) {
                    c0417h3.b(23, i4);
                    c0417h3.c(80, z2);
                    return;
                } else {
                    c0417h3.b(21, i4);
                    c0417h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0414e)) {
        }
    }

    public static void h(C0414e c0414e, String str) {
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
        c0414e.f4529G = str;
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
        HashMap hashMap2 = nVar.f4700c;
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
                if (nVar.f4699b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0418i c0418i = (C0418i) hashMap2.get(Integer.valueOf(id));
                        if (c0418i != null) {
                            if (childAt instanceof C0410a) {
                                C0419j c0419j = c0418i.f4609d;
                                c0419j.f4651h0 = 1;
                                C0410a c0410a = (C0410a) childAt;
                                c0410a.setId(id);
                                c0410a.setType(c0419j.f4647f0);
                                c0410a.setMargin(c0419j.f4649g0);
                                c0410a.setAllowsGoneWidget(c0419j.f4661n0);
                                int[] iArr = c0419j.f4652i0;
                                if (iArr != null) {
                                    c0410a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0419j.f4653j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0410a, str3);
                                        c0419j.f4652i0 = c2;
                                        c0410a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0414e c0414e = (C0414e) childAt.getLayoutParams();
                            c0414e.a();
                            c0418i.a(c0414e);
                            HashMap hashMap3 = c0418i.f4610f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0411b c0411b = (C0411b) hashMap3.get(str4);
                                if (c0411b.f4510a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0380e.a(c0411b.f4511b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0411b.f4512c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0411b.f4513d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0411b.f4515g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0411b.f4515g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0411b.e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0411b.f4514f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0411b.f4513d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0411b.f4512c));
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
                            childAt.setLayoutParams(c0414e);
                            l lVar = c0418i.f4607b;
                            if (lVar.f4682b == 0) {
                                childAt.setVisibility(lVar.f4681a);
                            }
                            childAt.setAlpha(lVar.f4683c);
                            m mVar = c0418i.e;
                            childAt.setRotation(mVar.f4686a);
                            childAt.setRotationX(mVar.f4687b);
                            childAt.setRotationY(mVar.f4688c);
                            childAt.setScaleX(mVar.f4689d);
                            childAt.setScaleY(mVar.e);
                            if (mVar.f4692h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f4692h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4690f)) {
                                    childAt.setPivotX(mVar.f4690f);
                                }
                                if (!Float.isNaN(mVar.f4691g)) {
                                    childAt.setPivotY(mVar.f4691g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.f4693k);
                            if (mVar.f4694l) {
                                childAt.setElevation(mVar.f4695m);
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
            C0418i c0418i2 = (C0418i) hashMap2.get(num);
            if (c0418i2 != null) {
                C0419j c0419j2 = c0418i2.f4609d;
                if (c0419j2.f4651h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0410a c0410a2 = new C0410a(context);
                    c0410a2.f4516a = new int[32];
                    c0410a2.f4521g = new HashMap();
                    c0410a2.f4518c = context;
                    C0384a c0384a = new C0384a();
                    c0384a.s0 = 0;
                    c0384a.f4205t0 = true;
                    c0384a.f4206u0 = 0;
                    c0384a.f4207v0 = false;
                    c0410a2.j = c0384a;
                    c0410a2.f4519d = c0384a;
                    c0410a2.i();
                    c0410a2.setVisibility(8);
                    c0410a2.setId(num.intValue());
                    int[] iArr2 = c0419j2.f4652i0;
                    if (iArr2 != null) {
                        c0410a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0419j2.f4653j0;
                        if (str5 != null) {
                            int[] c3 = c(c0410a2, str5);
                            c0419j2.f4652i0 = c3;
                            c0410a2.setReferencedIds(c3);
                        }
                    }
                    c0410a2.setType(c0419j2.f4647f0);
                    c0410a2.setMargin(c0419j2.f4649g0);
                    C0414e g2 = ConstraintLayout.g();
                    c0410a2.i();
                    c0418i2.a(g2);
                    constraintLayout.addView(c0410a2, g2);
                }
                if (c0419j2.f4637a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0414e g3 = ConstraintLayout.g();
                    c0418i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0412c) {
                ((AbstractC0412c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4700c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0414e c0414e = (C0414e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4699b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0418i());
            }
            C0418i c0418i = (C0418i) hashMap.get(Integer.valueOf(id));
            if (c0418i != null) {
                HashMap hashMap2 = nVar.f4698a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0411b c0411b = (C0411b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0411b(c0411b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0411b(c0411b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0418i.f4610f = hashMap3;
                c0418i.f4606a = id;
                int i2 = c0414e.e;
                C0419j c0419j = c0418i.f4609d;
                c0419j.f4650h = i2;
                c0419j.i = c0414e.f4557f;
                c0419j.j = c0414e.f4559g;
                c0419j.f4654k = c0414e.f4561h;
                c0419j.f4656l = c0414e.i;
                c0419j.f4658m = c0414e.j;
                c0419j.f4660n = c0414e.f4565k;
                c0419j.f4662o = c0414e.f4567l;
                c0419j.f4663p = c0414e.f4569m;
                c0419j.f4664q = c0414e.f4571n;
                c0419j.f4665r = c0414e.f4573o;
                c0419j.f4666s = c0414e.f4578s;
                c0419j.f4667t = c0414e.f4579t;
                c0419j.f4668u = c0414e.f4580u;
                c0419j.f4669v = c0414e.f4581v;
                c0419j.f4670w = c0414e.f4527E;
                c0419j.f4671x = c0414e.f4528F;
                c0419j.f4672y = c0414e.f4529G;
                c0419j.f4673z = c0414e.f4574p;
                c0419j.f4612A = c0414e.f4576q;
                c0419j.f4613B = c0414e.f4577r;
                c0419j.f4614C = c0414e.f4541T;
                c0419j.f4615D = c0414e.f4542U;
                c0419j.f4616E = c0414e.f4543V;
                c0419j.f4646f = c0414e.f4552c;
                c0419j.f4643d = c0414e.f4548a;
                c0419j.e = c0414e.f4550b;
                c0419j.f4639b = ((ViewGroup.MarginLayoutParams) c0414e).width;
                c0419j.f4641c = ((ViewGroup.MarginLayoutParams) c0414e).height;
                c0419j.f4617F = ((ViewGroup.MarginLayoutParams) c0414e).leftMargin;
                c0419j.f4618G = ((ViewGroup.MarginLayoutParams) c0414e).rightMargin;
                c0419j.H = ((ViewGroup.MarginLayoutParams) c0414e).topMargin;
                c0419j.f4619I = ((ViewGroup.MarginLayoutParams) c0414e).bottomMargin;
                c0419j.f4622L = c0414e.f4526D;
                c0419j.f4630T = c0414e.f4530I;
                c0419j.f4631U = c0414e.H;
                c0419j.f4633W = c0414e.f4532K;
                c0419j.f4632V = c0414e.f4531J;
                c0419j.f4657l0 = c0414e.f4544W;
                c0419j.f4659m0 = c0414e.f4545X;
                c0419j.f4634X = c0414e.f4533L;
                c0419j.f4635Y = c0414e.f4534M;
                c0419j.f4636Z = c0414e.f4537P;
                c0419j.f4638a0 = c0414e.f4538Q;
                c0419j.f4640b0 = c0414e.f4535N;
                c0419j.f4642c0 = c0414e.f4536O;
                c0419j.f4644d0 = c0414e.f4539R;
                c0419j.f4645e0 = c0414e.f4540S;
                c0419j.f4655k0 = c0414e.f4546Y;
                c0419j.f4624N = c0414e.f4583x;
                c0419j.f4626P = c0414e.f4585z;
                c0419j.f4623M = c0414e.f4582w;
                c0419j.f4625O = c0414e.f4584y;
                c0419j.f4628R = c0414e.f4523A;
                c0419j.f4627Q = c0414e.f4524B;
                c0419j.f4629S = c0414e.f4525C;
                c0419j.o0 = c0414e.f4547Z;
                c0419j.f4620J = c0414e.getMarginEnd();
                c0419j.f4621K = c0414e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0418i.f4607b;
                lVar.f4681a = visibility;
                lVar.f4683c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0418i.e;
                mVar.f4686a = rotation;
                mVar.f4687b = childAt.getRotationX();
                mVar.f4688c = childAt.getRotationY();
                mVar.f4689d = childAt.getScaleX();
                mVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4690f = pivotX;
                    mVar.f4691g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.f4693k = childAt.getTranslationZ();
                if (mVar.f4694l) {
                    mVar.f4695m = childAt.getElevation();
                }
                if (childAt instanceof C0410a) {
                    C0410a c0410a = (C0410a) childAt;
                    c0419j.f4661n0 = c0410a.getAllowsGoneWidget();
                    c0419j.f4652i0 = c0410a.getReferencedIds();
                    c0419j.f4647f0 = c0410a.getType();
                    c0419j.f4649g0 = c0410a.getMargin();
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
                    C0418i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f4609d.f4637a = true;
                    }
                    this.f4700c.put(Integer.valueOf(d2.f4606a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
