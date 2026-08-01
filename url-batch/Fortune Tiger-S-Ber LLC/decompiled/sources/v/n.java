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
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3563d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3564e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f3565f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3567b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3564e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3565f = sparseIntArray2;
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

    public static int[] c(a aVar, String str) {
        int i4;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            Object obj = null;
            try {
                i4 = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f269r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f269r.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i4 = ((Integer) obj).intValue();
                }
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        return i6 != split.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z3) {
        int i4;
        int i5;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? q.c : q.f3568a);
        l lVar = iVar.f3501b;
        m mVar = iVar.f3503e;
        k kVar = iVar.c;
        j jVar = iVar.f3502d;
        int[] iArr = f3563d;
        String[] strArr = r.a.f3138a;
        SparseIntArray sparseIntArray = f3564e;
        if (z3) {
            h hVar = new h();
            hVar.f3491a = new int[10];
            hVar.f3492b = new int[10];
            hVar.c = 0;
            hVar.f3493d = new int[10];
            hVar.f3494e = new float[10];
            hVar.f3495f = 0;
            hVar.g = new int[5];
            hVar.h = new String[5];
            hVar.f3496i = 0;
            hVar.f3497j = new int[4];
            hVar.f3498k = new boolean[4];
            hVar.f3499l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i6 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i6 < indexCount; indexCount = i5) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i7 = i6;
                switch (f3565f.get(index)) {
                    case 2:
                        i5 = indexCount;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        continue;
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
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i5 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i5 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i5 = indexCount;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        i5 = indexCount;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        i5 = indexCount;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i5 = indexCount;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        i5 = indexCount;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        i5 = indexCount;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        i5 = indexCount;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        i5 = indexCount;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        i5 = indexCount;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        i5 = indexCount;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3510d));
                        break;
                    case 18:
                        i5 = indexCount;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3512e));
                        break;
                    case 19:
                        i5 = indexCount;
                        hVar.a(19, obtainStyledAttributes.getFloat(index, jVar.f3514f));
                        break;
                    case 20:
                        i5 = indexCount;
                        hVar.a(20, obtainStyledAttributes.getFloat(index, jVar.f3538w));
                        break;
                    case 21:
                        i5 = indexCount;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.c));
                        break;
                    case 22:
                        i5 = indexCount;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f3549a)]);
                        break;
                    case 23:
                        i5 = indexCount;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f3507b));
                        break;
                    case 24:
                        i5 = indexCount;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        i5 = indexCount;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        i5 = indexCount;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        i5 = indexCount;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        i5 = indexCount;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        i5 = indexCount;
                        hVar.a(37, obtainStyledAttributes.getFloat(index, jVar.f3539x));
                        break;
                    case 38:
                        i5 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f3500a);
                        iVar.f3500a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i5 = indexCount;
                        hVar.a(39, obtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case 40:
                        i5 = indexCount;
                        hVar.a(40, obtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 41:
                        i5 = indexCount;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        i5 = indexCount;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 43:
                        i5 = indexCount;
                        hVar.a(43, obtainStyledAttributes.getFloat(index, lVar.c));
                        break;
                    case 44:
                        i5 = indexCount;
                        hVar.c(44, true);
                        hVar.a(44, obtainStyledAttributes.getDimension(index, mVar.f3562m));
                        break;
                    case 45:
                        i5 = indexCount;
                        hVar.a(45, obtainStyledAttributes.getFloat(index, mVar.f3554b));
                        break;
                    case 46:
                        i5 = indexCount;
                        hVar.a(46, obtainStyledAttributes.getFloat(index, mVar.c));
                        break;
                    case 47:
                        i5 = indexCount;
                        hVar.a(47, obtainStyledAttributes.getFloat(index, mVar.f3555d));
                        break;
                    case 48:
                        i5 = indexCount;
                        hVar.a(48, obtainStyledAttributes.getFloat(index, mVar.f3556e));
                        break;
                    case 49:
                        i5 = indexCount;
                        hVar.a(49, obtainStyledAttributes.getDimension(index, mVar.f3557f));
                        break;
                    case 50:
                        i5 = indexCount;
                        hVar.a(50, obtainStyledAttributes.getDimension(index, mVar.g));
                        break;
                    case 51:
                        i5 = indexCount;
                        hVar.a(51, obtainStyledAttributes.getDimension(index, mVar.f3558i));
                        break;
                    case 52:
                        i5 = indexCount;
                        hVar.a(52, obtainStyledAttributes.getDimension(index, mVar.f3559j));
                        break;
                    case 53:
                        i5 = indexCount;
                        hVar.a(53, obtainStyledAttributes.getDimension(index, mVar.f3560k));
                        break;
                    case 54:
                        i5 = indexCount;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        i5 = indexCount;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        i5 = indexCount;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        i5 = indexCount;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.a0));
                        break;
                    case 58:
                        i5 = indexCount;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3508b0));
                        break;
                    case 59:
                        i5 = indexCount;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3509c0));
                        break;
                    case 60:
                        i5 = indexCount;
                        hVar.a(60, obtainStyledAttributes.getFloat(index, mVar.f3553a));
                        break;
                    case 62:
                        i5 = indexCount;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        i5 = indexCount;
                        hVar.a(63, obtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case 64:
                        i5 = indexCount;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f3543a));
                        break;
                    case 65:
                        i5 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            hVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i5 = indexCount;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i5 = indexCount;
                        hVar.a(67, obtainStyledAttributes.getFloat(index, kVar.f3546e));
                        break;
                    case 68:
                        i5 = indexCount;
                        hVar.a(68, obtainStyledAttributes.getFloat(index, lVar.f3551d));
                        break;
                    case 69:
                        i5 = indexCount;
                        hVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i5 = indexCount;
                        hVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i5 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i5 = indexCount;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f0));
                        break;
                    case 73:
                        i5 = indexCount;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3515g0));
                        break;
                    case 74:
                        i5 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i5 = indexCount;
                        hVar.c(75, obtainStyledAttributes.getBoolean(index, jVar.f3528n0));
                        break;
                    case 76:
                        i5 = indexCount;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.c));
                        break;
                    case 77:
                        i5 = indexCount;
                        hVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i5 = indexCount;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f3550b));
                        break;
                    case 79:
                        i5 = indexCount;
                        hVar.a(79, obtainStyledAttributes.getFloat(index, kVar.f3545d));
                        break;
                    case 80:
                        i5 = indexCount;
                        hVar.c(80, obtainStyledAttributes.getBoolean(index, jVar.f3524l0));
                        break;
                    case 81:
                        i5 = indexCount;
                        hVar.c(81, obtainStyledAttributes.getBoolean(index, jVar.f3526m0));
                        break;
                    case 82:
                        i5 = indexCount;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f3544b));
                        break;
                    case 83:
                        i5 = indexCount;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.h));
                        break;
                    case 84:
                        i5 = indexCount;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.g));
                        break;
                    case 85:
                        i5 = indexCount;
                        hVar.a(85, obtainStyledAttributes.getFloat(index, kVar.f3547f));
                        break;
                    case 86:
                        i5 = indexCount;
                        int i8 = obtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.f3548i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.f3548i != -1) {
                                hVar.b(88, -2);
                                break;
                            }
                        } else if (i8 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            hVar.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.f3548i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                                break;
                            } else {
                                hVar.b(88, -1);
                                break;
                            }
                        } else {
                            hVar.b(88, obtainStyledAttributes.getInteger(index, kVar.f3548i));
                            break;
                        }
                        break;
                    case 87:
                        i5 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i5 = indexCount;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        i5 = indexCount;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        i5 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i5 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i5 = indexCount;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f3530o0));
                        break;
                    case 98:
                        i5 = indexCount;
                        int i9 = u.a.f3397v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.f3500a = obtainStyledAttributes.getResourceId(index, iVar.f3500a);
                            break;
                        }
                    case 99:
                        i5 = indexCount;
                        hVar.c(99, obtainStyledAttributes.getBoolean(index, jVar.g));
                        break;
                }
                i6 = i7 + 1;
            }
        } else {
            int i10 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i10 < indexCount2; indexCount2 = i4) {
                int index2 = obtainStyledAttributes.getIndex(i10);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i4 = indexCount2;
                        jVar.f3531p = f(obtainStyledAttributes, index2, jVar.f3531p);
                        continue;
                    case 2:
                        i4 = indexCount2;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                    case 3:
                        i4 = indexCount2;
                        jVar.f3529o = f(obtainStyledAttributes, index2, jVar.f3529o);
                        continue;
                    case 4:
                        i4 = indexCount2;
                        jVar.f3527n = f(obtainStyledAttributes, index2, jVar.f3527n);
                        continue;
                    case 5:
                        i4 = indexCount2;
                        jVar.f3540y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i4 = indexCount2;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                    case 7:
                        i4 = indexCount2;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        continue;
                    case 8:
                        i4 = indexCount2;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                    case 9:
                        i4 = indexCount2;
                        jVar.f3537v = f(obtainStyledAttributes, index2, jVar.f3537v);
                        continue;
                    case 10:
                        i4 = indexCount2;
                        jVar.f3536u = f(obtainStyledAttributes, index2, jVar.f3536u);
                        continue;
                    case 11:
                        i4 = indexCount2;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                    case 12:
                        i4 = indexCount2;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                    case 13:
                        i4 = indexCount2;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                    case 14:
                        i4 = indexCount2;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                    case 15:
                        i4 = indexCount2;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        continue;
                    case 16:
                        i4 = indexCount2;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                    case 17:
                        i4 = indexCount2;
                        jVar.f3510d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f3510d);
                        continue;
                    case 18:
                        i4 = indexCount2;
                        jVar.f3512e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f3512e);
                        continue;
                    case 19:
                        i4 = indexCount2;
                        jVar.f3514f = obtainStyledAttributes.getFloat(index2, jVar.f3514f);
                        continue;
                    case 20:
                        i4 = indexCount2;
                        jVar.f3538w = obtainStyledAttributes.getFloat(index2, jVar.f3538w);
                        continue;
                    case 21:
                        i4 = indexCount2;
                        jVar.c = obtainStyledAttributes.getLayoutDimension(index2, jVar.c);
                        continue;
                    case 22:
                        i4 = indexCount2;
                        int i11 = obtainStyledAttributes.getInt(index2, lVar.f3549a);
                        lVar.f3549a = i11;
                        lVar.f3549a = iArr[i11];
                        continue;
                    case 23:
                        i4 = indexCount2;
                        jVar.f3507b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f3507b);
                        continue;
                    case 24:
                        i4 = indexCount2;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                    case 25:
                        i4 = indexCount2;
                        jVar.h = f(obtainStyledAttributes, index2, jVar.h);
                        continue;
                    case 26:
                        i4 = indexCount2;
                        jVar.f3517i = f(obtainStyledAttributes, index2, jVar.f3517i);
                        continue;
                    case 27:
                        i4 = indexCount2;
                        jVar.E = obtainStyledAttributes.getInt(index2, jVar.E);
                        continue;
                    case 28:
                        i4 = indexCount2;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                    case 29:
                        i4 = indexCount2;
                        jVar.f3519j = f(obtainStyledAttributes, index2, jVar.f3519j);
                        continue;
                    case 30:
                        i4 = indexCount2;
                        jVar.f3521k = f(obtainStyledAttributes, index2, jVar.f3521k);
                        continue;
                    case 31:
                        i4 = indexCount2;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        continue;
                    case 32:
                        i4 = indexCount2;
                        jVar.f3534s = f(obtainStyledAttributes, index2, jVar.f3534s);
                        continue;
                    case 33:
                        i4 = indexCount2;
                        jVar.f3535t = f(obtainStyledAttributes, index2, jVar.f3535t);
                        continue;
                    case 34:
                        i4 = indexCount2;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                    case 35:
                        i4 = indexCount2;
                        jVar.f3525m = f(obtainStyledAttributes, index2, jVar.f3525m);
                        continue;
                    case 36:
                        i4 = indexCount2;
                        jVar.f3523l = f(obtainStyledAttributes, index2, jVar.f3523l);
                        continue;
                    case 37:
                        i4 = indexCount2;
                        jVar.f3539x = obtainStyledAttributes.getFloat(index2, jVar.f3539x);
                        continue;
                    case 38:
                        i4 = indexCount2;
                        iVar.f3500a = obtainStyledAttributes.getResourceId(index2, iVar.f3500a);
                        continue;
                    case 39:
                        i4 = indexCount2;
                        jVar.U = obtainStyledAttributes.getFloat(index2, jVar.U);
                        continue;
                    case 40:
                        i4 = indexCount2;
                        jVar.T = obtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                    case 41:
                        i4 = indexCount2;
                        jVar.V = obtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                    case 42:
                        i4 = indexCount2;
                        jVar.W = obtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                    case 43:
                        i4 = indexCount2;
                        lVar.c = obtainStyledAttributes.getFloat(index2, lVar.c);
                        continue;
                    case 44:
                        i4 = indexCount2;
                        mVar.f3561l = true;
                        mVar.f3562m = obtainStyledAttributes.getDimension(index2, mVar.f3562m);
                        continue;
                    case 45:
                        i4 = indexCount2;
                        mVar.f3554b = obtainStyledAttributes.getFloat(index2, mVar.f3554b);
                        continue;
                    case 46:
                        i4 = indexCount2;
                        mVar.c = obtainStyledAttributes.getFloat(index2, mVar.c);
                        continue;
                    case 47:
                        i4 = indexCount2;
                        mVar.f3555d = obtainStyledAttributes.getFloat(index2, mVar.f3555d);
                        continue;
                    case 48:
                        i4 = indexCount2;
                        mVar.f3556e = obtainStyledAttributes.getFloat(index2, mVar.f3556e);
                        continue;
                    case 49:
                        i4 = indexCount2;
                        mVar.f3557f = obtainStyledAttributes.getDimension(index2, mVar.f3557f);
                        continue;
                    case 50:
                        i4 = indexCount2;
                        mVar.g = obtainStyledAttributes.getDimension(index2, mVar.g);
                        continue;
                    case 51:
                        i4 = indexCount2;
                        mVar.f3558i = obtainStyledAttributes.getDimension(index2, mVar.f3558i);
                        continue;
                    case 52:
                        i4 = indexCount2;
                        mVar.f3559j = obtainStyledAttributes.getDimension(index2, mVar.f3559j);
                        continue;
                    case 53:
                        i4 = indexCount2;
                        mVar.f3560k = obtainStyledAttributes.getDimension(index2, mVar.f3560k);
                        continue;
                    case 54:
                        i4 = indexCount2;
                        jVar.X = obtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                    case 55:
                        i4 = indexCount2;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        continue;
                    case 56:
                        i4 = indexCount2;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                    case 57:
                        i4 = indexCount2;
                        jVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.a0);
                        continue;
                    case 58:
                        i4 = indexCount2;
                        jVar.f3508b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3508b0);
                        continue;
                    case 59:
                        i4 = indexCount2;
                        jVar.f3509c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3509c0);
                        continue;
                    case 60:
                        i4 = indexCount2;
                        mVar.f3553a = obtainStyledAttributes.getFloat(index2, mVar.f3553a);
                        continue;
                    case 61:
                        i4 = indexCount2;
                        jVar.f3541z = f(obtainStyledAttributes, index2, jVar.f3541z);
                        continue;
                    case 62:
                        i4 = indexCount2;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        continue;
                    case 63:
                        i4 = indexCount2;
                        jVar.B = obtainStyledAttributes.getFloat(index2, jVar.B);
                        continue;
                    case 64:
                        i4 = indexCount2;
                        kVar.f3543a = f(obtainStyledAttributes, index2, kVar.f3543a);
                        continue;
                    case 65:
                        i4 = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            break;
                        }
                    case 66:
                        i4 = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                    case 67:
                        i4 = indexCount2;
                        kVar.f3546e = obtainStyledAttributes.getFloat(index2, kVar.f3546e);
                        break;
                    case 68:
                        i4 = indexCount2;
                        lVar.f3551d = obtainStyledAttributes.getFloat(index2, lVar.f3551d);
                        break;
                    case 69:
                        i4 = indexCount2;
                        jVar.f3511d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i4 = indexCount2;
                        jVar.f3513e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i4 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount2;
                        jVar.f0 = obtainStyledAttributes.getInt(index2, jVar.f0);
                        break;
                    case 73:
                        i4 = indexCount2;
                        jVar.f3515g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f3515g0);
                        break;
                    case 74:
                        i4 = indexCount2;
                        jVar.f3520j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i4 = indexCount2;
                        jVar.f3528n0 = obtainStyledAttributes.getBoolean(index2, jVar.f3528n0);
                        break;
                    case 76:
                        i4 = indexCount2;
                        kVar.c = obtainStyledAttributes.getInt(index2, kVar.c);
                        break;
                    case 77:
                        i4 = indexCount2;
                        jVar.f3522k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i4 = indexCount2;
                        lVar.f3550b = obtainStyledAttributes.getInt(index2, lVar.f3550b);
                        break;
                    case 79:
                        i4 = indexCount2;
                        kVar.f3545d = obtainStyledAttributes.getFloat(index2, kVar.f3545d);
                        break;
                    case 80:
                        i4 = indexCount2;
                        jVar.f3524l0 = obtainStyledAttributes.getBoolean(index2, jVar.f3524l0);
                        break;
                    case 81:
                        i4 = indexCount2;
                        jVar.f3526m0 = obtainStyledAttributes.getBoolean(index2, jVar.f3526m0);
                        break;
                    case 82:
                        i4 = indexCount2;
                        kVar.f3544b = obtainStyledAttributes.getInteger(index2, kVar.f3544b);
                        break;
                    case 83:
                        i4 = indexCount2;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        break;
                    case 84:
                        i4 = indexCount2;
                        kVar.g = obtainStyledAttributes.getInteger(index2, kVar.g);
                        break;
                    case 85:
                        i4 = indexCount2;
                        kVar.f3547f = obtainStyledAttributes.getFloat(index2, kVar.f3547f);
                        break;
                    case 86:
                        i4 = indexCount2;
                        int i12 = obtainStyledAttributes.peekValue(index2).type;
                        if (i12 == 1) {
                            kVar.f3548i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i12 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f3548i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.f3548i);
                            break;
                        }
                        break;
                    case 87:
                        i4 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i4 = indexCount2;
                        jVar.f3532q = f(obtainStyledAttributes, index2, jVar.f3532q);
                        break;
                    case 92:
                        i4 = indexCount2;
                        jVar.f3533r = f(obtainStyledAttributes, index2, jVar.f3533r);
                        break;
                    case 93:
                        i4 = indexCount2;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        break;
                    case 94:
                        i4 = indexCount2;
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        break;
                    case 95:
                        i4 = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i4 = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i4 = indexCount2;
                        jVar.f3530o0 = obtainStyledAttributes.getInt(index2, jVar.f3530o0);
                        break;
                }
                i10++;
            }
            if (jVar.f3520j0 != null) {
                jVar.f3518i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i4, int i5) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i6 = typedArray.peekValue(i4).type;
        boolean z3 = true;
        int i7 = 0;
        if (i6 == 3) {
            String string = typedArray.getString(i4);
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
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f3540y = trim2;
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
                            if (i5 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i5 == 0) {
                                jVar.f3507b = 0;
                                jVar.U = parseFloat;
                                return;
                            } else {
                                jVar.c = 0;
                                jVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i5 == 0) {
                                hVar.b(23, 0);
                                hVar.a(39, parseFloat);
                                return;
                            } else {
                                hVar.b(21, 0);
                                hVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i5 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.R = max;
                                eVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.S = max;
                                eVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i5 == 0) {
                                jVar2.f3507b = 0;
                                jVar2.f3511d0 = max;
                                jVar2.X = 2;
                                return;
                            } else {
                                jVar2.c = 0;
                                jVar2.f3513e0 = max;
                                jVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i5 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                                return;
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i6 != 5) {
            dimensionPixelSize = typedArray.getInt(i4, 0);
            if (dimensionPixelSize == -4) {
                i7 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z3 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i5 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i7;
                    eVar4.W = z3;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i7;
                    eVar4.X = z3;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i5 == 0) {
                    jVar3.f3507b = i7;
                    jVar3.f3524l0 = z3;
                    return;
                } else {
                    jVar3.c = i7;
                    jVar3.f3526m0 = z3;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i5 == 0) {
                    hVar3.b(23, i7);
                    hVar3.c(80, z3);
                    return;
                } else {
                    hVar3.b(21, i7);
                    hVar3.c(81, z3);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i4, 0);
        z3 = false;
        i7 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i4 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i4 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
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
                            if (i4 == 1) {
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
        HashSet hashSet;
        int i4;
        int i5;
        String str;
        HashMap hashMap;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
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
                if (nVar.f3567b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.f3501b;
                            j jVar = iVar.f3502d;
                            m mVar = iVar.f3503e;
                            if (childAt instanceof a) {
                                jVar.f3516h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f0);
                                aVar.setMargin(jVar.f3515g0);
                                aVar.setAllowsGoneWidget(jVar.f3528n0);
                                int[] iArr = jVar.f3518i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f3520j0;
                                    if (str3 != null) {
                                        int[] c = c(aVar, str3);
                                        jVar.f3518i0 = c;
                                        aVar.setReferencedIds(c);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f3504f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (bVar.f3434a) {
                                    i5 = i6;
                                    str = str4;
                                } else {
                                    i5 = i6;
                                    str = "set" + str4;
                                }
                                try {
                                    int a4 = q.e.a(bVar.f3435b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (a4) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f3436d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i6 = i5;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i6 = i5;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i6 = i5;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f3437e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f3438f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f3436d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e8) {
                                    e = e8;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e9) {
                                    e = e9;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i6 = i5;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i4 = i6;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f3550b == 0) {
                                childAt.setVisibility(lVar.f3549a);
                            }
                            childAt.setAlpha(lVar.c);
                            childAt.setRotation(mVar.f3553a);
                            childAt.setRotationX(mVar.f3554b);
                            childAt.setRotationY(mVar.c);
                            childAt.setScaleX(mVar.f3555d);
                            childAt.setScaleY(mVar.f3556e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f3557f)) {
                                    childAt.setPivotX(mVar.f3557f);
                                }
                                if (!Float.isNaN(mVar.g)) {
                                    childAt.setPivotY(mVar.g);
                                }
                            }
                            childAt.setTranslationX(mVar.f3558i);
                            childAt.setTranslationY(mVar.f3559j);
                            childAt.setTranslationZ(mVar.f3560k);
                            if (mVar.f3561l) {
                                childAt.setElevation(mVar.f3562m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i4 = i6;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i6 = i4 + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i4 = i6;
            i6 = i4 + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f3502d;
                if (jVar2.f3516h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f3439f = new int[32];
                    aVar2.f3443l = new HashMap();
                    aVar2.h = context;
                    s.a aVar3 = new s.a();
                    aVar3.f3209s0 = 0;
                    aVar3.f3210t0 = true;
                    aVar3.f3211u0 = 0;
                    aVar3.f3212v0 = false;
                    aVar2.f3433o = aVar3;
                    aVar2.f3440i = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.f3518i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f3520j0;
                        if (str5 != null) {
                            int[] c4 = c(aVar2, str5);
                            jVar2.f3518i0 = c4;
                            aVar2.setReferencedIds(c4);
                        }
                    }
                    aVar2.setType(jVar2.f0);
                    aVar2.setMargin(jVar2.f3515g0);
                    e g = ConstraintLayout.g();
                    aVar2.i();
                    iVar2.a(g);
                    constraintLayout.addView(aVar2, g);
                }
                if (jVar2.f3506a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e g4 = ConstraintLayout.g();
                    iVar2.a(g4);
                    constraintLayout.addView(guideline, g4);
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i4;
        HashMap hashMap;
        int i5;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.c;
        hashMap2.clear();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f3567b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap2.get(Integer.valueOf(id));
            if (iVar == null) {
                i4 = childCount;
                hashMap = hashMap2;
                i5 = i6;
            } else {
                l lVar = iVar.f3501b;
                j jVar = iVar.f3502d;
                m mVar = iVar.f3503e;
                i4 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i5 = i6;
                HashMap hashMap4 = nVar.f3566a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    } catch (NoSuchMethodException e5) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e5);
                    } catch (InvocationTargetException e6) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e6);
                    }
                    hashMap4 = hashMap5;
                }
                iVar.f3504f = hashMap3;
                iVar.f3500a = id;
                jVar.h = eVar.f3451e;
                jVar.f3517i = eVar.f3453f;
                jVar.f3519j = eVar.g;
                jVar.f3521k = eVar.h;
                jVar.f3523l = eVar.f3456i;
                jVar.f3525m = eVar.f3458j;
                jVar.f3527n = eVar.f3460k;
                jVar.f3529o = eVar.f3462l;
                jVar.f3531p = eVar.f3464m;
                jVar.f3532q = eVar.f3466n;
                jVar.f3533r = eVar.f3468o;
                jVar.f3534s = eVar.f3474s;
                jVar.f3535t = eVar.f3475t;
                jVar.f3536u = eVar.f3476u;
                jVar.f3537v = eVar.f3477v;
                jVar.f3538w = eVar.E;
                jVar.f3539x = eVar.F;
                jVar.f3540y = eVar.G;
                jVar.f3541z = eVar.f3470p;
                jVar.A = eVar.f3472q;
                jVar.B = eVar.f3473r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f3514f = eVar.c;
                jVar.f3510d = eVar.f3445a;
                jVar.f3512e = eVar.f3446b;
                jVar.f3507b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.f3524l0 = eVar.W;
                jVar.f3526m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.a0 = eVar.Q;
                jVar.f3508b0 = eVar.N;
                jVar.f3509c0 = eVar.O;
                jVar.f3511d0 = eVar.R;
                jVar.f3513e0 = eVar.S;
                jVar.f3522k0 = eVar.Y;
                jVar.N = eVar.f3479x;
                jVar.P = eVar.f3481z;
                jVar.M = eVar.f3478w;
                jVar.O = eVar.f3480y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f3530o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                lVar.f3549a = childAt.getVisibility();
                lVar.c = childAt.getAlpha();
                mVar.f3553a = childAt.getRotation();
                mVar.f3554b = childAt.getRotationX();
                mVar.c = childAt.getRotationY();
                mVar.f3555d = childAt.getScaleX();
                mVar.f3556e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f3557f = pivotX;
                    mVar.g = pivotY;
                }
                mVar.f3558i = childAt.getTranslationX();
                mVar.f3559j = childAt.getTranslationY();
                mVar.f3560k = childAt.getTranslationZ();
                if (mVar.f3561l) {
                    mVar.f3562m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f3528n0 = aVar.getAllowsGoneWidget();
                    jVar.f3518i0 = aVar.getReferencedIds();
                    jVar.f0 = aVar.getType();
                    jVar.f3515g0 = aVar.getMargin();
                }
            }
            i6 = i5 + 1;
            nVar = this;
            childCount = i4;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i d4 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d4.f3502d.f3506a = true;
                    }
                    this.c.put(Integer.valueOf(d4.f3500a), d4);
                }
            }
        } catch (IOException e4) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e4);
        } catch (XmlPullParserException e5) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e5);
        }
    }
}
