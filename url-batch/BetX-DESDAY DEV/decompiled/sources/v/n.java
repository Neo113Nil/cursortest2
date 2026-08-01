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
import com.luckyarcade.spinthrow.GameConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0319e;
import r.AbstractC0322a;
import s.C0324a;
import u.AbstractC0346a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4434d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4435e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4436f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4437a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4438b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4439c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4435e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4436f = sparseIntArray2;
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

    public static int[] c(C0347a c0347a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0347a.getContext();
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
            if (i == 0 && c0347a.isInEditMode() && (c0347a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0347a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1121m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1121m.get(trim);
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
    public static C0355i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0355i c0355i = new C0355i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4443c : r.f4441a);
        int[] iArr = f4434d;
        SparseIntArray sparseIntArray = f4435e;
        l lVar = c0355i.f4342b;
        String[] strArr = AbstractC0322a.f3966a;
        m mVar = c0355i.f4345e;
        k kVar = c0355i.f4343c;
        C0356j c0356j = c0355i.f4344d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0354h c0354h = new C0354h();
            c0354h.f4331a = new int[10];
            c0354h.f4332b = new int[10];
            c0354h.f4333c = 0;
            c0354h.f4334d = new int[10];
            c0354h.f4335e = new float[10];
            c0354h.f4336f = 0;
            c0354h.f4337g = new int[5];
            c0354h.h = new String[5];
            c0354h.i = 0;
            c0354h.f4338j = new int[4];
            c0354h.f4339k = new boolean[4];
            c0354h.f4340l = 0;
            kVar.getClass();
            c0356j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4436f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0354h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4355I));
                        i3 = 1;
                        break;
                    case GameConfig.COMBO_EVERY /* 3 */:
                    case 4:
                    case 9:
                    case GameConfig.SCORE_PER_STICK /* 10 */:
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
                        c0354h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0354h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0356j.f4350C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0354h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0356j.f4351D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0354h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4356J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0354h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4362P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0354h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4363Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0354h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4359M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0354h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4361O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0354h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4364R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0354h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4360N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0354h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0356j.f4379d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0354h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0356j.f4381e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0354h.a(19, obtainStyledAttributes.getFloat(index, c0356j.f4383f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0354h.a(20, obtainStyledAttributes.getFloat(index, c0356j.f4406w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0354h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0356j.f4377c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0354h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4418a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0354h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0356j.f4375b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0354h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0354h.b(27, obtainStyledAttributes.getInt(index, c0356j.f4352E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0354h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4353G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0354h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4357K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0354h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4354H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0354h.a(37, obtainStyledAttributes.getFloat(index, c0356j.f4407x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0355i.f4341a);
                        c0355i.f4341a = resourceId;
                        c0354h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0354h.a(39, obtainStyledAttributes.getFloat(index, c0356j.f4367U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0354h.a(40, obtainStyledAttributes.getFloat(index, c0356j.f4366T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0354h.b(41, obtainStyledAttributes.getInt(index, c0356j.f4368V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0354h.b(42, obtainStyledAttributes.getInt(index, c0356j.f4369W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0354h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4420c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0354h.c(44, true);
                        c0354h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4433m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0354h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4424b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0354h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4425c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0354h.a(47, obtainStyledAttributes.getFloat(index, mVar.f4426d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0354h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4427e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0354h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4428f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0354h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4429g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0354h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0354h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4430j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0354h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4431k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0354h.b(54, obtainStyledAttributes.getInt(index, c0356j.f4370X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0354h.b(55, obtainStyledAttributes.getInt(index, c0356j.f4371Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0354h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4372Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0354h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4374a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0354h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4376b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0354h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4378c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0354h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4423a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0354h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4348A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0354h.a(63, obtainStyledAttributes.getFloat(index, c0356j.f4349B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0354h.b(64, f(obtainStyledAttributes, index, kVar.f4411a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0354h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0354h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0354h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0354h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4415e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0354h.a(68, obtainStyledAttributes.getFloat(index, lVar.f4421d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0354h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0354h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0354h.b(72, obtainStyledAttributes.getInt(index, c0356j.f4384f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0354h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4386g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0354h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0354h.c(75, obtainStyledAttributes.getBoolean(index, c0356j.f4396n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0354h.b(76, obtainStyledAttributes.getInt(index, kVar.f4413c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0354h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0354h.b(78, obtainStyledAttributes.getInt(index, lVar.f4419b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0354h.a(79, obtainStyledAttributes.getFloat(index, kVar.f4414d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0354h.c(80, obtainStyledAttributes.getBoolean(index, c0356j.f4393l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0354h.c(81, obtainStyledAttributes.getBoolean(index, c0356j.m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0354h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4412b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0354h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0354h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4417g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0354h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4416f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0354h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0354h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0354h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0354h.b(89, resourceId3);
                                c0354h.b(88, -2);
                            } else {
                                c0354h.b(88, -1);
                            }
                        } else {
                            c0354h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0354h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4358L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0354h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0356j.f4365S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0354h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0354h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0354h.b(97, obtainStyledAttributes.getInt(index, c0356j.f4398o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0346a.f4228s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0355i.f4341a = obtainStyledAttributes.getResourceId(index, c0355i.f4341a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0354h.c(99, obtainStyledAttributes.getBoolean(index, c0356j.f4385g));
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
                    c0356j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4399p = f(obtainStyledAttributes, index2, c0356j.f4399p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4355I = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4355I);
                        i2 = 1;
                        break;
                    case GameConfig.COMBO_EVERY /* 3 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4397o = f(obtainStyledAttributes, index2, c0356j.f4397o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4395n = f(obtainStyledAttributes, index2, c0356j.f4395n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4408y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4350C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0356j.f4350C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4351D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0356j.f4351D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4356J = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4356J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4405v = f(obtainStyledAttributes, index2, c0356j.f4405v);
                        i2 = 1;
                        break;
                    case GameConfig.SCORE_PER_STICK /* 10 */:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4404u = f(obtainStyledAttributes, index2, c0356j.f4404u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4362P = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4362P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4363Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4363Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4359M = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4359M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4361O = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4361O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4364R = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4364R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4360N = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4360N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4379d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0356j.f4379d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4381e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0356j.f4381e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4383f = obtainStyledAttributes.getFloat(index2, c0356j.f4383f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4406w = obtainStyledAttributes.getFloat(index2, c0356j.f4406w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4377c = obtainStyledAttributes.getLayoutDimension(index2, c0356j.f4377c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4418a);
                        lVar.f4418a = i10;
                        lVar.f4418a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4375b = obtainStyledAttributes.getLayoutDimension(index2, c0356j.f4375b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.h = f(obtainStyledAttributes, index2, c0356j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.i = f(obtainStyledAttributes, index2, c0356j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4352E = obtainStyledAttributes.getInt(index2, c0356j.f4352E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4353G = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4353G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4388j = f(obtainStyledAttributes, index2, c0356j.f4388j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4390k = f(obtainStyledAttributes, index2, c0356j.f4390k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4357K = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4357K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4402s = f(obtainStyledAttributes, index2, c0356j.f4402s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4403t = f(obtainStyledAttributes, index2, c0356j.f4403t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4354H = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4354H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4394m = f(obtainStyledAttributes, index2, c0356j.f4394m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4392l = f(obtainStyledAttributes, index2, c0356j.f4392l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4407x = obtainStyledAttributes.getFloat(index2, c0356j.f4407x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0355i.f4341a = obtainStyledAttributes.getResourceId(index2, c0355i.f4341a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4367U = obtainStyledAttributes.getFloat(index2, c0356j.f4367U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4366T = obtainStyledAttributes.getFloat(index2, c0356j.f4366T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4368V = obtainStyledAttributes.getInt(index2, c0356j.f4368V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4369W = obtainStyledAttributes.getInt(index2, c0356j.f4369W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4420c = obtainStyledAttributes.getFloat(index2, lVar.f4420c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4432l = true;
                        mVar.f4433m = obtainStyledAttributes.getDimension(index2, mVar.f4433m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4424b = obtainStyledAttributes.getFloat(index2, mVar.f4424b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4425c = obtainStyledAttributes.getFloat(index2, mVar.f4425c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4426d = obtainStyledAttributes.getFloat(index2, mVar.f4426d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4427e = obtainStyledAttributes.getFloat(index2, mVar.f4427e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4428f = obtainStyledAttributes.getDimension(index2, mVar.f4428f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4429g = obtainStyledAttributes.getDimension(index2, mVar.f4429g);
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
                        mVar.f4430j = obtainStyledAttributes.getDimension(index2, mVar.f4430j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4431k = obtainStyledAttributes.getDimension(index2, mVar.f4431k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4370X = obtainStyledAttributes.getInt(index2, c0356j.f4370X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4371Y = obtainStyledAttributes.getInt(index2, c0356j.f4371Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4372Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4372Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4374a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4374a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4376b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4376b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4378c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4378c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4423a = obtainStyledAttributes.getFloat(index2, mVar.f4423a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4409z = f(obtainStyledAttributes, index2, c0356j.f4409z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4348A = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4348A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0356j.f4349B = obtainStyledAttributes.getFloat(index2, c0356j.f4349B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4411a = f(obtainStyledAttributes, index2, kVar.f4411a);
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
                        kVar.f4415e = obtainStyledAttributes.getFloat(index2, kVar.f4415e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f4421d = obtainStyledAttributes.getFloat(index2, lVar.f4421d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0356j.f4380d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0356j.f4382e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0356j.f4384f0 = obtainStyledAttributes.getInt(index2, c0356j.f4384f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4386g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4386g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4389j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4396n0 = obtainStyledAttributes.getBoolean(index2, c0356j.f4396n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4413c = obtainStyledAttributes.getInt(index2, kVar.f4413c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4391k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4419b = obtainStyledAttributes.getInt(index2, lVar.f4419b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4414d = obtainStyledAttributes.getFloat(index2, kVar.f4414d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4393l0 = obtainStyledAttributes.getBoolean(index2, c0356j.f4393l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.m0 = obtainStyledAttributes.getBoolean(index2, c0356j.m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4412b = obtainStyledAttributes.getInteger(index2, kVar.f4412b);
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
                        kVar.f4417g = obtainStyledAttributes.getInteger(index2, kVar.f4417g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4416f = obtainStyledAttributes.getFloat(index2, kVar.f4416f);
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
                        c0356j.f4400q = f(obtainStyledAttributes, index2, c0356j.f4400q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4401r = f(obtainStyledAttributes, index2, c0356j.f4401r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4358L = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4358L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4365S = obtainStyledAttributes.getDimensionPixelSize(index2, c0356j.f4365S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0356j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0356j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0356j.f4398o0 = obtainStyledAttributes.getInt(index2, c0356j.f4398o0);
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
            if (c0356j.f4389j0 != null) {
                c0356j.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0355i;
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
                    if (obj instanceof C0351e) {
                        C0351e c0351e = (C0351e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0351e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0351e).height = 0;
                        }
                        h(c0351e, trim2);
                        return;
                    }
                    if (obj instanceof C0356j) {
                        ((C0356j) obj).f4408y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0354h) {
                            ((C0354h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0351e) {
                            C0351e c0351e2 = (C0351e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0351e2).width = 0;
                                c0351e2.f4262H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0351e2).height = 0;
                                c0351e2.f4263I = parseFloat;
                            }
                        } else if (obj instanceof C0356j) {
                            C0356j c0356j = (C0356j) obj;
                            if (i2 == 0) {
                                c0356j.f4375b = 0;
                                c0356j.f4367U = parseFloat;
                            } else {
                                c0356j.f4377c = 0;
                                c0356j.f4366T = parseFloat;
                            }
                        } else if (obj instanceof C0354h) {
                            C0354h c0354h = (C0354h) obj;
                            if (i2 == 0) {
                                c0354h.b(23, 0);
                                c0354h.a(39, parseFloat);
                            } else {
                                c0354h.b(21, 0);
                                c0354h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0351e) {
                            C0351e c0351e3 = (C0351e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0351e3).width = 0;
                                c0351e3.f4272R = max;
                                c0351e3.f4266L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0351e3).height = 0;
                                c0351e3.f4273S = max;
                                c0351e3.f4267M = 2;
                            }
                        } else if (obj instanceof C0356j) {
                            C0356j c0356j2 = (C0356j) obj;
                            if (i2 == 0) {
                                c0356j2.f4375b = 0;
                                c0356j2.f4380d0 = max;
                                c0356j2.f4370X = 2;
                            } else {
                                c0356j2.f4377c = 0;
                                c0356j2.f4382e0 = max;
                                c0356j2.f4371Y = 2;
                            }
                        } else if (obj instanceof C0354h) {
                            C0354h c0354h2 = (C0354h) obj;
                            if (i2 == 0) {
                                c0354h2.b(23, 0);
                                c0354h2.b(54, 2);
                            } else {
                                c0354h2.b(21, 0);
                                c0354h2.b(55, 2);
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
            if (!(obj instanceof C0351e)) {
                C0351e c0351e4 = (C0351e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0351e4).width = i4;
                    c0351e4.f4277W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0351e4).height = i4;
                    c0351e4.f4278X = z2;
                    return;
                }
            }
            if (obj instanceof C0356j) {
                C0356j c0356j3 = (C0356j) obj;
                if (i2 == 0) {
                    c0356j3.f4375b = i4;
                    c0356j3.f4393l0 = z2;
                    return;
                } else {
                    c0356j3.f4377c = i4;
                    c0356j3.m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0354h) {
                C0354h c0354h3 = (C0354h) obj;
                if (i2 == 0) {
                    c0354h3.b(23, i4);
                    c0354h3.c(80, z2);
                    return;
                } else {
                    c0354h3.b(21, i4);
                    c0354h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0351e)) {
        }
    }

    public static void h(C0351e c0351e, String str) {
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
        c0351e.f4261G = str;
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
        HashMap hashMap2 = nVar.f4439c;
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
                if (nVar.f4438b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0355i c0355i = (C0355i) hashMap2.get(Integer.valueOf(id));
                        if (c0355i != null) {
                            if (childAt instanceof C0347a) {
                                C0356j c0356j = c0355i.f4344d;
                                c0356j.f4387h0 = 1;
                                C0347a c0347a = (C0347a) childAt;
                                c0347a.setId(id);
                                c0347a.setType(c0356j.f4384f0);
                                c0347a.setMargin(c0356j.f4386g0);
                                c0347a.setAllowsGoneWidget(c0356j.f4396n0);
                                int[] iArr = c0356j.i0;
                                if (iArr != null) {
                                    c0347a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0356j.f4389j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0347a, str3);
                                        c0356j.i0 = c2;
                                        c0347a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0351e c0351e = (C0351e) childAt.getLayoutParams();
                            c0351e.a();
                            c0355i.a(c0351e);
                            HashMap hashMap3 = c0355i.f4346f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0348b c0348b = (C0348b) hashMap3.get(str4);
                                if (c0348b.f4241a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0319e.a(c0348b.f4242b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0348b.f4243c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0348b.f4244d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0348b.f4247g));
                                            break;
                                        case GameConfig.COMBO_EVERY /* 3 */:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0348b.f4247g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0348b.f4245e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0348b.f4246f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0348b.f4244d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0348b.f4243c));
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
                            childAt.setLayoutParams(c0351e);
                            l lVar = c0355i.f4342b;
                            if (lVar.f4419b == 0) {
                                childAt.setVisibility(lVar.f4418a);
                            }
                            childAt.setAlpha(lVar.f4420c);
                            m mVar = c0355i.f4345e;
                            childAt.setRotation(mVar.f4423a);
                            childAt.setRotationX(mVar.f4424b);
                            childAt.setRotationY(mVar.f4425c);
                            childAt.setScaleX(mVar.f4426d);
                            childAt.setScaleY(mVar.f4427e);
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
                                if (!Float.isNaN(mVar.f4428f)) {
                                    childAt.setPivotX(mVar.f4428f);
                                }
                                if (!Float.isNaN(mVar.f4429g)) {
                                    childAt.setPivotY(mVar.f4429g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4430j);
                            childAt.setTranslationZ(mVar.f4431k);
                            if (mVar.f4432l) {
                                childAt.setElevation(mVar.f4433m);
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
            C0355i c0355i2 = (C0355i) hashMap2.get(num);
            if (c0355i2 != null) {
                C0356j c0356j2 = c0355i2.f4344d;
                if (c0356j2.f4387h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0347a c0347a2 = new C0347a(context);
                    c0347a2.f4248a = new int[32];
                    c0347a2.f4254g = new HashMap();
                    c0347a2.f4250c = context;
                    C0324a c0324a = new C0324a();
                    c0324a.f3983s0 = 0;
                    c0324a.f3984t0 = true;
                    c0324a.f3985u0 = 0;
                    c0324a.f3986v0 = false;
                    c0347a2.f4240j = c0324a;
                    c0347a2.f4251d = c0324a;
                    c0347a2.i();
                    c0347a2.setVisibility(8);
                    c0347a2.setId(num.intValue());
                    int[] iArr2 = c0356j2.i0;
                    if (iArr2 != null) {
                        c0347a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0356j2.f4389j0;
                        if (str5 != null) {
                            int[] c3 = c(c0347a2, str5);
                            c0356j2.i0 = c3;
                            c0347a2.setReferencedIds(c3);
                        }
                    }
                    c0347a2.setType(c0356j2.f4384f0);
                    c0347a2.setMargin(c0356j2.f4386g0);
                    C0351e g2 = ConstraintLayout.g();
                    c0347a2.i();
                    c0355i2.a(g2);
                    constraintLayout.addView(c0347a2, g2);
                }
                if (c0356j2.f4373a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0351e g3 = ConstraintLayout.g();
                    c0355i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0349c) {
                ((AbstractC0349c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4439c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0351e c0351e = (C0351e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4438b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0355i());
            }
            C0355i c0355i = (C0355i) hashMap.get(Integer.valueOf(id));
            if (c0355i != null) {
                HashMap hashMap2 = nVar.f4437a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0348b c0348b = (C0348b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0348b(c0348b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0348b(c0348b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0355i.f4346f = hashMap3;
                c0355i.f4341a = id;
                int i2 = c0351e.f4289e;
                C0356j c0356j = c0355i.f4344d;
                c0356j.h = i2;
                c0356j.i = c0351e.f4291f;
                c0356j.f4388j = c0351e.f4293g;
                c0356j.f4390k = c0351e.h;
                c0356j.f4392l = c0351e.i;
                c0356j.f4394m = c0351e.f4296j;
                c0356j.f4395n = c0351e.f4298k;
                c0356j.f4397o = c0351e.f4300l;
                c0356j.f4399p = c0351e.f4302m;
                c0356j.f4400q = c0351e.f4303n;
                c0356j.f4401r = c0351e.f4305o;
                c0356j.f4402s = c0351e.f4311s;
                c0356j.f4403t = c0351e.f4312t;
                c0356j.f4404u = c0351e.f4313u;
                c0356j.f4405v = c0351e.f4314v;
                c0356j.f4406w = c0351e.f4260E;
                c0356j.f4407x = c0351e.F;
                c0356j.f4408y = c0351e.f4261G;
                c0356j.f4409z = c0351e.f4307p;
                c0356j.f4348A = c0351e.f4309q;
                c0356j.f4349B = c0351e.f4310r;
                c0356j.f4350C = c0351e.f4274T;
                c0356j.f4351D = c0351e.f4275U;
                c0356j.f4352E = c0351e.f4276V;
                c0356j.f4383f = c0351e.f4285c;
                c0356j.f4379d = c0351e.f4281a;
                c0356j.f4381e = c0351e.f4283b;
                c0356j.f4375b = ((ViewGroup.MarginLayoutParams) c0351e).width;
                c0356j.f4377c = ((ViewGroup.MarginLayoutParams) c0351e).height;
                c0356j.F = ((ViewGroup.MarginLayoutParams) c0351e).leftMargin;
                c0356j.f4353G = ((ViewGroup.MarginLayoutParams) c0351e).rightMargin;
                c0356j.f4354H = ((ViewGroup.MarginLayoutParams) c0351e).topMargin;
                c0356j.f4355I = ((ViewGroup.MarginLayoutParams) c0351e).bottomMargin;
                c0356j.f4358L = c0351e.f4259D;
                c0356j.f4366T = c0351e.f4263I;
                c0356j.f4367U = c0351e.f4262H;
                c0356j.f4369W = c0351e.f4265K;
                c0356j.f4368V = c0351e.f4264J;
                c0356j.f4393l0 = c0351e.f4277W;
                c0356j.m0 = c0351e.f4278X;
                c0356j.f4370X = c0351e.f4266L;
                c0356j.f4371Y = c0351e.f4267M;
                c0356j.f4372Z = c0351e.f4270P;
                c0356j.f4374a0 = c0351e.f4271Q;
                c0356j.f4376b0 = c0351e.f4268N;
                c0356j.f4378c0 = c0351e.f4269O;
                c0356j.f4380d0 = c0351e.f4272R;
                c0356j.f4382e0 = c0351e.f4273S;
                c0356j.f4391k0 = c0351e.f4279Y;
                c0356j.f4360N = c0351e.f4316x;
                c0356j.f4362P = c0351e.f4318z;
                c0356j.f4359M = c0351e.f4315w;
                c0356j.f4361O = c0351e.f4317y;
                c0356j.f4364R = c0351e.f4256A;
                c0356j.f4363Q = c0351e.f4257B;
                c0356j.f4365S = c0351e.f4258C;
                c0356j.f4398o0 = c0351e.f4280Z;
                c0356j.f4356J = c0351e.getMarginEnd();
                c0356j.f4357K = c0351e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0355i.f4342b;
                lVar.f4418a = visibility;
                lVar.f4420c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0355i.f4345e;
                mVar.f4423a = rotation;
                mVar.f4424b = childAt.getRotationX();
                mVar.f4425c = childAt.getRotationY();
                mVar.f4426d = childAt.getScaleX();
                mVar.f4427e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4428f = pivotX;
                    mVar.f4429g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4430j = childAt.getTranslationY();
                mVar.f4431k = childAt.getTranslationZ();
                if (mVar.f4432l) {
                    mVar.f4433m = childAt.getElevation();
                }
                if (childAt instanceof C0347a) {
                    C0347a c0347a = (C0347a) childAt;
                    c0356j.f4396n0 = c0347a.getAllowsGoneWidget();
                    c0356j.i0 = c0347a.getReferencedIds();
                    c0356j.f4384f0 = c0347a.getType();
                    c0356j.f4386g0 = c0347a.getMargin();
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
                    C0355i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f4344d.f4373a = true;
                    }
                    this.f4439c.put(Integer.valueOf(d2.f4341a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
