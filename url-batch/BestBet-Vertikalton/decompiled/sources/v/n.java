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
import q.AbstractC0309e;
import r.AbstractC0312a;
import s.C0316a;
import u.AbstractC0361a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4426e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4427f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4428a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4429b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4430c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4426e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4427f = sparseIntArray2;
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

    public static int[] c(C0387a c0387a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0387a.getContext();
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
            if (i == 0 && c0387a.isInEditMode() && (c0387a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0387a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1784m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1784m.get(trim);
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
    public static i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4434c : r.f4432a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4426e;
        l lVar = iVar.f4338b;
        String[] strArr = AbstractC0312a.f3824a;
        m mVar = iVar.f4340e;
        k kVar = iVar.f4339c;
        j jVar = iVar.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            h hVar = new h();
            hVar.f4328a = new int[10];
            hVar.f4329b = new int[10];
            hVar.f4330c = 0;
            hVar.d = new int[10];
            hVar.f4331e = new float[10];
            hVar.f4332f = 0;
            hVar.f4333g = new int[5];
            hVar.h = new String[5];
            hVar.i = 0;
            hVar.f4334j = new int[4];
            hVar.f4335k = new boolean[4];
            hVar.f4336l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4427f.get(index)) {
                    case 2:
                        str4 = str5;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4350I));
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
                        hVar.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4345C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4346D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4351J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4357P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4358Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4354M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4356O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4359R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4355N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4375e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        hVar.a(19, obtainStyledAttributes.getFloat(index, jVar.f4377f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        hVar.a(20, obtainStyledAttributes.getFloat(index, jVar.f4401w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f4372c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4412a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f4370b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.f4347E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4348G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4352K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4349H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        hVar.a(37, obtainStyledAttributes.getFloat(index, jVar.f4402x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f4337a);
                        iVar.f4337a = resourceId;
                        hVar.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        hVar.a(39, obtainStyledAttributes.getFloat(index, jVar.f4362U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        hVar.a(40, obtainStyledAttributes.getFloat(index, jVar.f4361T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.f4363V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.f4364W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        hVar.a(43, obtainStyledAttributes.getFloat(index, lVar.f4414c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        hVar.c(44, true);
                        hVar.a(44, obtainStyledAttributes.getDimension(index, mVar.f4425m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        hVar.a(45, obtainStyledAttributes.getFloat(index, mVar.f4417b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        hVar.a(46, obtainStyledAttributes.getFloat(index, mVar.f4418c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        hVar.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        hVar.a(48, obtainStyledAttributes.getFloat(index, mVar.f4419e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        hVar.a(49, obtainStyledAttributes.getDimension(index, mVar.f4420f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        hVar.a(50, obtainStyledAttributes.getDimension(index, mVar.f4421g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        hVar.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        hVar.a(52, obtainStyledAttributes.getDimension(index, mVar.f4422j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        hVar.a(53, obtainStyledAttributes.getDimension(index, mVar.f4423k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.f4365X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.f4366Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4367Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4369a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4371b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4373c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        hVar.a(60, obtainStyledAttributes.getFloat(index, mVar.f4416a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4343A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        hVar.a(63, obtainStyledAttributes.getFloat(index, jVar.f4344B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f4406a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            hVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        hVar.a(67, obtainStyledAttributes.getFloat(index, kVar.f4409e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        hVar.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        hVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        hVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f4378f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4380g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        hVar.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        hVar.c(75, obtainStyledAttributes.getBoolean(index, jVar.f4392n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f4408c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        hVar.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f4413b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        hVar.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        hVar.c(80, obtainStyledAttributes.getBoolean(index, jVar.f4388l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        hVar.c(81, obtainStyledAttributes.getBoolean(index, jVar.f4390m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f4407b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f4411g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        hVar.a(85, obtainStyledAttributes.getFloat(index, kVar.f4410f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            hVar.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4353L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4360S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(hVar, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0361a.f4167s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f4337a = obtainStyledAttributes.getResourceId(index, iVar.f4337a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        hVar.c(99, obtainStyledAttributes.getBoolean(index, jVar.f4379g));
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
                    jVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4394p = f(obtainStyledAttributes, index2, jVar.f4394p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4350I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4350I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4393o = f(obtainStyledAttributes, index2, jVar.f4393o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4391n = f(obtainStyledAttributes, index2, jVar.f4391n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4403y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4345C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4345C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4346D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4346D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4351J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4351J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4400v = f(obtainStyledAttributes, index2, jVar.f4400v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4399u = f(obtainStyledAttributes, index2, jVar.f4399u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4357P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4357P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4358Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4358Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4354M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4354M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4356O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4356O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4359R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4359R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4355N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4355N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4375e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4375e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4377f = obtainStyledAttributes.getFloat(index2, jVar.f4377f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4401w = obtainStyledAttributes.getFloat(index2, jVar.f4401w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4372c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4372c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4412a);
                        lVar.f4412a = i10;
                        lVar.f4412a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4370b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4370b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.h = f(obtainStyledAttributes, index2, jVar.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4347E = obtainStyledAttributes.getInt(index2, jVar.f4347E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4348G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4348G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4383j = f(obtainStyledAttributes, index2, jVar.f4383j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4385k = f(obtainStyledAttributes, index2, jVar.f4385k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4352K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4352K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4397s = f(obtainStyledAttributes, index2, jVar.f4397s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4398t = f(obtainStyledAttributes, index2, jVar.f4398t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4349H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4349H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4389m = f(obtainStyledAttributes, index2, jVar.f4389m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4387l = f(obtainStyledAttributes, index2, jVar.f4387l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4402x = obtainStyledAttributes.getFloat(index2, jVar.f4402x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        iVar.f4337a = obtainStyledAttributes.getResourceId(index2, iVar.f4337a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4362U = obtainStyledAttributes.getFloat(index2, jVar.f4362U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4361T = obtainStyledAttributes.getFloat(index2, jVar.f4361T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4363V = obtainStyledAttributes.getInt(index2, jVar.f4363V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4364W = obtainStyledAttributes.getInt(index2, jVar.f4364W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4414c = obtainStyledAttributes.getFloat(index2, lVar.f4414c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4424l = true;
                        mVar.f4425m = obtainStyledAttributes.getDimension(index2, mVar.f4425m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4417b = obtainStyledAttributes.getFloat(index2, mVar.f4417b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4418c = obtainStyledAttributes.getFloat(index2, mVar.f4418c);
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
                        mVar.f4419e = obtainStyledAttributes.getFloat(index2, mVar.f4419e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4420f = obtainStyledAttributes.getDimension(index2, mVar.f4420f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4421g = obtainStyledAttributes.getDimension(index2, mVar.f4421g);
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
                        mVar.f4422j = obtainStyledAttributes.getDimension(index2, mVar.f4422j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4423k = obtainStyledAttributes.getDimension(index2, mVar.f4423k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4365X = obtainStyledAttributes.getInt(index2, jVar.f4365X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4366Y = obtainStyledAttributes.getInt(index2, jVar.f4366Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4367Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4367Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4369a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4369a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4371b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4371b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4373c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4373c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4416a = obtainStyledAttributes.getFloat(index2, mVar.f4416a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4404z = f(obtainStyledAttributes, index2, jVar.f4404z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4343A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4343A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4344B = obtainStyledAttributes.getFloat(index2, jVar.f4344B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4406a = f(obtainStyledAttributes, index2, kVar.f4406a);
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
                        kVar.f4409e = obtainStyledAttributes.getFloat(index2, kVar.f4409e);
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
                        jVar.f4374d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        jVar.f4376e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        jVar.f4378f0 = obtainStyledAttributes.getInt(index2, jVar.f4378f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4380g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4380g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4384j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4392n0 = obtainStyledAttributes.getBoolean(index2, jVar.f4392n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4408c = obtainStyledAttributes.getInt(index2, kVar.f4408c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4386k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4413b = obtainStyledAttributes.getInt(index2, lVar.f4413b);
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
                        jVar.f4388l0 = obtainStyledAttributes.getBoolean(index2, jVar.f4388l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4390m0 = obtainStyledAttributes.getBoolean(index2, jVar.f4390m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4407b = obtainStyledAttributes.getInteger(index2, kVar.f4407b);
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
                        kVar.f4411g = obtainStyledAttributes.getInteger(index2, kVar.f4411g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4410f = obtainStyledAttributes.getFloat(index2, kVar.f4410f);
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
                        jVar.f4395q = f(obtainStyledAttributes, index2, jVar.f4395q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4396r = f(obtainStyledAttributes, index2, jVar.f4396r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4353L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4353L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4360S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4360S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        jVar.o0 = obtainStyledAttributes.getInt(index2, jVar.o0);
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
            if (jVar.f4384j0 != null) {
                jVar.f4382i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
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
                    if (obj instanceof j) {
                        ((j) obj).f4403y = trim2;
                        return;
                    } else {
                        if (obj instanceof h) {
                            ((h) obj).d(trim2, 5);
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
                                eVar2.f4261H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f4262I = parseFloat;
                            }
                        } else if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i2 == 0) {
                                jVar.f4370b = 0;
                                jVar.f4362U = parseFloat;
                            } else {
                                jVar.f4372c = 0;
                                jVar.f4361T = parseFloat;
                            }
                        } else if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i2 == 0) {
                                hVar.b(23, 0);
                                hVar.a(39, parseFloat);
                            } else {
                                hVar.b(21, 0);
                                hVar.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(RecyclerView.f1937A0, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f4271R = max;
                                eVar3.f4265L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f4272S = max;
                                eVar3.f4266M = 2;
                            }
                        } else if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i2 == 0) {
                                jVar2.f4370b = 0;
                                jVar2.f4374d0 = max;
                                jVar2.f4365X = 2;
                            } else {
                                jVar2.f4372c = 0;
                                jVar2.f4376e0 = max;
                                jVar2.f4366Y = 2;
                            }
                        } else if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i2 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
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
                    eVar4.f4276W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i4;
                    eVar4.f4277X = z2;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i2 == 0) {
                    jVar3.f4370b = i4;
                    jVar3.f4388l0 = z2;
                    return;
                } else {
                    jVar3.f4372c = i4;
                    jVar3.f4390m0 = z2;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i2 == 0) {
                    hVar3.b(23, i4);
                    hVar3.c(80, z2);
                    return;
                } else {
                    hVar3.b(21, i4);
                    hVar3.c(81, z2);
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
                        if (parseFloat > RecyclerView.f1937A0 && parseFloat2 > RecyclerView.f1937A0) {
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
        eVar.f4260G = str;
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
        HashMap hashMap2 = nVar.f4430c;
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
                if (nVar.f4429b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C0387a) {
                                j jVar = iVar.d;
                                jVar.f4381h0 = 1;
                                C0387a c0387a = (C0387a) childAt;
                                c0387a.setId(id);
                                c0387a.setType(jVar.f4378f0);
                                c0387a.setMargin(jVar.f4380g0);
                                c0387a.setAllowsGoneWidget(jVar.f4392n0);
                                int[] iArr = jVar.f4382i0;
                                if (iArr != null) {
                                    c0387a.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f4384j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0387a, str3);
                                        jVar.f4382i0 = c2;
                                        c0387a.setReferencedIds(c2);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f4341f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0388b c0388b = (C0388b) hashMap3.get(str4);
                                if (c0388b.f4242a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0309e.a(c0388b.f4243b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0388b.f4244c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0388b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0388b.f4247g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0388b.f4247g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0388b.f4245e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0388b.f4246f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0388b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0388b.f4244c));
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
                            l lVar = iVar.f4338b;
                            if (lVar.f4413b == 0) {
                                childAt.setVisibility(lVar.f4412a);
                            }
                            childAt.setAlpha(lVar.f4414c);
                            m mVar = iVar.f4340e;
                            childAt.setRotation(mVar.f4416a);
                            childAt.setRotationX(mVar.f4417b);
                            childAt.setRotationY(mVar.f4418c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4419e);
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
                                if (!Float.isNaN(mVar.f4420f)) {
                                    childAt.setPivotX(mVar.f4420f);
                                }
                                if (!Float.isNaN(mVar.f4421g)) {
                                    childAt.setPivotY(mVar.f4421g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4422j);
                            childAt.setTranslationZ(mVar.f4423k);
                            if (mVar.f4424l) {
                                childAt.setElevation(mVar.f4425m);
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
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.d;
                if (jVar2.f4381h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0387a c0387a2 = new C0387a(context);
                    c0387a2.f4248a = new int[32];
                    c0387a2.f4253g = new HashMap();
                    c0387a2.f4250c = context;
                    C0316a c0316a = new C0316a();
                    c0316a.s0 = 0;
                    c0316a.f3846t0 = true;
                    c0316a.f3847u0 = 0;
                    c0316a.f3848v0 = false;
                    c0387a2.f4241j = c0316a;
                    c0387a2.d = c0316a;
                    c0387a2.i();
                    c0387a2.setVisibility(8);
                    c0387a2.setId(num.intValue());
                    int[] iArr2 = jVar2.f4382i0;
                    if (iArr2 != null) {
                        c0387a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f4384j0;
                        if (str5 != null) {
                            int[] c3 = c(c0387a2, str5);
                            jVar2.f4382i0 = c3;
                            c0387a2.setReferencedIds(c3);
                        }
                    }
                    c0387a2.setType(jVar2.f4378f0);
                    c0387a2.setMargin(jVar2.f4380g0);
                    e g2 = ConstraintLayout.g();
                    c0387a2.i();
                    iVar2.a(g2);
                    constraintLayout.addView(c0387a2, g2);
                }
                if (jVar2.f4368a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g3 = ConstraintLayout.g();
                    iVar2.a(g3);
                    constraintLayout.addView(pVar, g3);
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
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4430c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4429b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id));
            if (iVar != null) {
                HashMap hashMap2 = nVar.f4428a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0388b c0388b = (C0388b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0388b(c0388b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0388b(c0388b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                iVar.f4341f = hashMap3;
                iVar.f4337a = id;
                int i2 = eVar.f4287e;
                j jVar = iVar.d;
                jVar.h = i2;
                jVar.i = eVar.f4289f;
                jVar.f4383j = eVar.f4291g;
                jVar.f4385k = eVar.h;
                jVar.f4387l = eVar.i;
                jVar.f4389m = eVar.f4295j;
                jVar.f4391n = eVar.f4297k;
                jVar.f4393o = eVar.f4299l;
                jVar.f4394p = eVar.f4301m;
                jVar.f4395q = eVar.f4303n;
                jVar.f4396r = eVar.f4305o;
                jVar.f4397s = eVar.f4310s;
                jVar.f4398t = eVar.f4311t;
                jVar.f4399u = eVar.f4312u;
                jVar.f4400v = eVar.f4313v;
                jVar.f4401w = eVar.f4259E;
                jVar.f4402x = eVar.F;
                jVar.f4403y = eVar.f4260G;
                jVar.f4404z = eVar.f4306p;
                jVar.f4343A = eVar.f4308q;
                jVar.f4344B = eVar.f4309r;
                jVar.f4345C = eVar.f4273T;
                jVar.f4346D = eVar.f4274U;
                jVar.f4347E = eVar.f4275V;
                jVar.f4377f = eVar.f4284c;
                jVar.d = eVar.f4280a;
                jVar.f4375e = eVar.f4282b;
                jVar.f4370b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f4372c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f4348G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f4349H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f4350I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.f4353L = eVar.f4258D;
                jVar.f4361T = eVar.f4262I;
                jVar.f4362U = eVar.f4261H;
                jVar.f4364W = eVar.f4264K;
                jVar.f4363V = eVar.f4263J;
                jVar.f4388l0 = eVar.f4276W;
                jVar.f4390m0 = eVar.f4277X;
                jVar.f4365X = eVar.f4265L;
                jVar.f4366Y = eVar.f4266M;
                jVar.f4367Z = eVar.f4269P;
                jVar.f4369a0 = eVar.f4270Q;
                jVar.f4371b0 = eVar.f4267N;
                jVar.f4373c0 = eVar.f4268O;
                jVar.f4374d0 = eVar.f4271R;
                jVar.f4376e0 = eVar.f4272S;
                jVar.f4386k0 = eVar.f4278Y;
                jVar.f4355N = eVar.f4315x;
                jVar.f4357P = eVar.f4317z;
                jVar.f4354M = eVar.f4314w;
                jVar.f4356O = eVar.f4316y;
                jVar.f4359R = eVar.f4255A;
                jVar.f4358Q = eVar.f4256B;
                jVar.f4360S = eVar.f4257C;
                jVar.o0 = eVar.f4279Z;
                jVar.f4351J = eVar.getMarginEnd();
                jVar.f4352K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f4338b;
                lVar.f4412a = visibility;
                lVar.f4414c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f4340e;
                mVar.f4416a = rotation;
                mVar.f4417b = childAt.getRotationX();
                mVar.f4418c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4419e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4420f = pivotX;
                    mVar.f4421g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4422j = childAt.getTranslationY();
                mVar.f4423k = childAt.getTranslationZ();
                if (mVar.f4424l) {
                    mVar.f4425m = childAt.getElevation();
                }
                if (childAt instanceof C0387a) {
                    C0387a c0387a = (C0387a) childAt;
                    jVar.f4392n0 = c0387a.getAllowsGoneWidget();
                    jVar.f4382i0 = c0387a.getReferencedIds();
                    jVar.f4378f0 = c0387a.getType();
                    jVar.f4380g0 = c0387a.getMargin();
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
                    i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4368a = true;
                    }
                    this.f4430c.put(Integer.valueOf(d2.f4337a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
