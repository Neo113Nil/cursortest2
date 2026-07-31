package b3;

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
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1221d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1222e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f1223f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1224a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1225b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1226c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1222e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1223f = sparseIntArray2;
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
        int i;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Object obj = null;
            try {
                i = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f582p;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f582p.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i;
            i8++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z3) {
        int i;
        int i8;
        j jVar = new j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? s.f1230c : s.f1228a);
        m mVar = jVar.f1149b;
        n nVar = jVar.f1152e;
        l lVar = jVar.f1150c;
        k kVar = jVar.f1151d;
        int[] iArr = f1221d;
        String[] strArr = x2.a.f8614a;
        SparseIntArray sparseIntArray = f1222e;
        if (z3) {
            i iVar = new i();
            iVar.f1137a = new int[10];
            iVar.f1138b = new int[10];
            iVar.f1139c = 0;
            iVar.f1140d = new int[10];
            iVar.f1141e = new float[10];
            iVar.f1142f = 0;
            iVar.f1143g = new int[5];
            iVar.f1144h = new String[5];
            iVar.i = 0;
            iVar.f1145j = new int[4];
            iVar.f1146k = new boolean[4];
            iVar.f1147l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i9 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i9 < indexCount; indexCount = i8) {
                int index = obtainStyledAttributes.getIndex(i9);
                int i10 = i9;
                switch (f1223f.get(index)) {
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        i8 = indexCount;
                        iVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        continue;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    case v0.f8304b /* 9 */:
                    case v0.f8306d /* 10 */:
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
                        i8 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i8 = indexCount;
                        iVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i8 = indexCount;
                        iVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.C));
                        break;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i8 = indexCount;
                        iVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.D));
                        break;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        i8 = indexCount;
                        iVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.J));
                        break;
                    case 11:
                        i8 = indexCount;
                        iVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case 12:
                        i8 = indexCount;
                        iVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.Q));
                        break;
                    case 13:
                        i8 = indexCount;
                        iVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 14:
                        i8 = indexCount;
                        iVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        break;
                    case v0.f8308f /* 15 */:
                        i8 = indexCount;
                        iVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.R));
                        break;
                    case 16:
                        i8 = indexCount;
                        iVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.N));
                        break;
                    case 17:
                        i8 = indexCount;
                        iVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1161d));
                        break;
                    case 18:
                        i8 = indexCount;
                        iVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1163e));
                        break;
                    case 19:
                        i8 = indexCount;
                        iVar.a(19, obtainStyledAttributes.getFloat(index, kVar.f1165f));
                        break;
                    case 20:
                        i8 = indexCount;
                        iVar.a(20, obtainStyledAttributes.getFloat(index, kVar.f1191w));
                        break;
                    case 21:
                        i8 = indexCount;
                        iVar.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f1159c));
                        break;
                    case 22:
                        i8 = indexCount;
                        iVar.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f1204a)]);
                        break;
                    case 23:
                        i8 = indexCount;
                        iVar.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f1157b));
                        break;
                    case 24:
                        i8 = indexCount;
                        iVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        break;
                    case 27:
                        i8 = indexCount;
                        iVar.b(27, obtainStyledAttributes.getInt(index, kVar.E));
                        break;
                    case 28:
                        i8 = indexCount;
                        iVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        break;
                    case 31:
                        i8 = indexCount;
                        iVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.K));
                        break;
                    case 34:
                        i8 = indexCount;
                        iVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        break;
                    case 37:
                        i8 = indexCount;
                        iVar.a(37, obtainStyledAttributes.getFloat(index, kVar.f1192x));
                        break;
                    case 38:
                        i8 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jVar.f1148a);
                        jVar.f1148a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case 39:
                        i8 = indexCount;
                        iVar.a(39, obtainStyledAttributes.getFloat(index, kVar.U));
                        break;
                    case 40:
                        i8 = indexCount;
                        iVar.a(40, obtainStyledAttributes.getFloat(index, kVar.T));
                        break;
                    case 41:
                        i8 = indexCount;
                        iVar.b(41, obtainStyledAttributes.getInt(index, kVar.V));
                        break;
                    case 42:
                        i8 = indexCount;
                        iVar.b(42, obtainStyledAttributes.getInt(index, kVar.W));
                        break;
                    case 43:
                        i8 = indexCount;
                        iVar.a(43, obtainStyledAttributes.getFloat(index, mVar.f1206c));
                        break;
                    case 44:
                        i8 = indexCount;
                        iVar.c(44, true);
                        iVar.a(44, obtainStyledAttributes.getDimension(index, nVar.f1220m));
                        break;
                    case 45:
                        i8 = indexCount;
                        iVar.a(45, obtainStyledAttributes.getFloat(index, nVar.f1210b));
                        break;
                    case 46:
                        i8 = indexCount;
                        iVar.a(46, obtainStyledAttributes.getFloat(index, nVar.f1211c));
                        break;
                    case 47:
                        i8 = indexCount;
                        iVar.a(47, obtainStyledAttributes.getFloat(index, nVar.f1212d));
                        break;
                    case 48:
                        i8 = indexCount;
                        iVar.a(48, obtainStyledAttributes.getFloat(index, nVar.f1213e));
                        break;
                    case 49:
                        i8 = indexCount;
                        iVar.a(49, obtainStyledAttributes.getDimension(index, nVar.f1214f));
                        break;
                    case 50:
                        i8 = indexCount;
                        iVar.a(50, obtainStyledAttributes.getDimension(index, nVar.f1215g));
                        break;
                    case 51:
                        i8 = indexCount;
                        iVar.a(51, obtainStyledAttributes.getDimension(index, nVar.i));
                        break;
                    case 52:
                        i8 = indexCount;
                        iVar.a(52, obtainStyledAttributes.getDimension(index, nVar.f1217j));
                        break;
                    case 53:
                        i8 = indexCount;
                        iVar.a(53, obtainStyledAttributes.getDimension(index, nVar.f1218k));
                        break;
                    case 54:
                        i8 = indexCount;
                        iVar.b(54, obtainStyledAttributes.getInt(index, kVar.X));
                        break;
                    case 55:
                        i8 = indexCount;
                        iVar.b(55, obtainStyledAttributes.getInt(index, kVar.Y));
                        break;
                    case 56:
                        i8 = indexCount;
                        iVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.Z));
                        break;
                    case 57:
                        i8 = indexCount;
                        iVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f1156a0));
                        break;
                    case 58:
                        i8 = indexCount;
                        iVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f1158b0));
                        break;
                    case 59:
                        i8 = indexCount;
                        iVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f1160c0));
                        break;
                    case 60:
                        i8 = indexCount;
                        iVar.a(60, obtainStyledAttributes.getFloat(index, nVar.f1209a));
                        break;
                    case 62:
                        i8 = indexCount;
                        iVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.A));
                        break;
                    case 63:
                        i8 = indexCount;
                        iVar.a(63, obtainStyledAttributes.getFloat(index, kVar.B));
                        break;
                    case 64:
                        i8 = indexCount;
                        iVar.b(64, f(obtainStyledAttributes, index, lVar.f1196a));
                        break;
                    case 65:
                        i8 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            iVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i8 = indexCount;
                        iVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i8 = indexCount;
                        iVar.a(67, obtainStyledAttributes.getFloat(index, lVar.f1200e));
                        break;
                    case 68:
                        i8 = indexCount;
                        iVar.a(68, obtainStyledAttributes.getFloat(index, mVar.f1207d));
                        break;
                    case 69:
                        i8 = indexCount;
                        iVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i8 = indexCount;
                        iVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i8 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i8 = indexCount;
                        iVar.b(72, obtainStyledAttributes.getInt(index, kVar.f1166f0));
                        break;
                    case 73:
                        i8 = indexCount;
                        iVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f1168g0));
                        break;
                    case 74:
                        i8 = indexCount;
                        iVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i8 = indexCount;
                        iVar.c(75, obtainStyledAttributes.getBoolean(index, kVar.f1181n0));
                        break;
                    case 76:
                        i8 = indexCount;
                        iVar.b(76, obtainStyledAttributes.getInt(index, lVar.f1198c));
                        break;
                    case 77:
                        i8 = indexCount;
                        iVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i8 = indexCount;
                        iVar.b(78, obtainStyledAttributes.getInt(index, mVar.f1205b));
                        break;
                    case 79:
                        i8 = indexCount;
                        iVar.a(79, obtainStyledAttributes.getFloat(index, lVar.f1199d));
                        break;
                    case 80:
                        i8 = indexCount;
                        iVar.c(80, obtainStyledAttributes.getBoolean(index, kVar.f1177l0));
                        break;
                    case 81:
                        i8 = indexCount;
                        iVar.c(81, obtainStyledAttributes.getBoolean(index, kVar.f1179m0));
                        break;
                    case 82:
                        i8 = indexCount;
                        iVar.b(82, obtainStyledAttributes.getInteger(index, lVar.f1197b));
                        break;
                    case 83:
                        i8 = indexCount;
                        iVar.b(83, f(obtainStyledAttributes, index, nVar.f1216h));
                        break;
                    case 84:
                        i8 = indexCount;
                        iVar.b(84, obtainStyledAttributes.getInteger(index, lVar.f1202g));
                        break;
                    case 85:
                        i8 = indexCount;
                        iVar.a(85, obtainStyledAttributes.getFloat(index, lVar.f1201f));
                        break;
                    case 86:
                        i8 = indexCount;
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.i != -1) {
                                iVar.b(88, -2);
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.f1203h = string;
                            iVar.d(string, 90);
                            if (lVar.f1203h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                                break;
                            } else {
                                iVar.b(88, -1);
                                break;
                            }
                        } else {
                            iVar.b(88, obtainStyledAttributes.getInteger(index, lVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i8 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i8 = indexCount;
                        iVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.L));
                        break;
                    case 94:
                        i8 = indexCount;
                        iVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.S));
                        break;
                    case 95:
                        i8 = indexCount;
                        g(iVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i8 = indexCount;
                        g(iVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i8 = indexCount;
                        iVar.b(97, obtainStyledAttributes.getInt(index, kVar.f1183o0));
                        break;
                    case 98:
                        i8 = indexCount;
                        int i12 = a3.a.f225t;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            jVar.f1148a = obtainStyledAttributes.getResourceId(index, jVar.f1148a);
                            break;
                        }
                    case 99:
                        i8 = indexCount;
                        iVar.c(99, obtainStyledAttributes.getBoolean(index, kVar.f1167g));
                        break;
                }
                i9 = i10 + 1;
            }
        } else {
            int i13 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i13 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i13);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        kVar.f1184p = f(obtainStyledAttributes, index2, kVar.f1184p);
                        continue;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        i = indexCount2;
                        kVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        continue;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        i = indexCount2;
                        kVar.f1182o = f(obtainStyledAttributes, index2, kVar.f1182o);
                        continue;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        i = indexCount2;
                        kVar.f1180n = f(obtainStyledAttributes, index2, kVar.f1180n);
                        continue;
                    case 5:
                        i = indexCount2;
                        kVar.f1193y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        kVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        continue;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        kVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.D);
                        continue;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        i = indexCount2;
                        kVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        continue;
                    case v0.f8304b /* 9 */:
                        i = indexCount2;
                        kVar.f1190v = f(obtainStyledAttributes, index2, kVar.f1190v);
                        continue;
                    case v0.f8306d /* 10 */:
                        i = indexCount2;
                        kVar.f1189u = f(obtainStyledAttributes, index2, kVar.f1189u);
                        continue;
                    case 11:
                        i = indexCount2;
                        kVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        kVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        kVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        kVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        continue;
                    case v0.f8308f /* 15 */:
                        i = indexCount2;
                        kVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        kVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        kVar.f1161d = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1161d);
                        continue;
                    case 18:
                        i = indexCount2;
                        kVar.f1163e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1163e);
                        continue;
                    case 19:
                        i = indexCount2;
                        kVar.f1165f = obtainStyledAttributes.getFloat(index2, kVar.f1165f);
                        continue;
                    case 20:
                        i = indexCount2;
                        kVar.f1191w = obtainStyledAttributes.getFloat(index2, kVar.f1191w);
                        continue;
                    case 21:
                        i = indexCount2;
                        kVar.f1159c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f1159c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i14 = obtainStyledAttributes.getInt(index2, mVar.f1204a);
                        mVar.f1204a = i14;
                        mVar.f1204a = iArr[i14];
                        continue;
                    case 23:
                        i = indexCount2;
                        kVar.f1157b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f1157b);
                        continue;
                    case 24:
                        i = indexCount2;
                        kVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        kVar.f1169h = f(obtainStyledAttributes, index2, kVar.f1169h);
                        continue;
                    case 26:
                        i = indexCount2;
                        kVar.i = f(obtainStyledAttributes, index2, kVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        kVar.E = obtainStyledAttributes.getInt(index2, kVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        kVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        kVar.f1172j = f(obtainStyledAttributes, index2, kVar.f1172j);
                        continue;
                    case 30:
                        i = indexCount2;
                        kVar.f1174k = f(obtainStyledAttributes, index2, kVar.f1174k);
                        continue;
                    case 31:
                        i = indexCount2;
                        kVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        kVar.f1187s = f(obtainStyledAttributes, index2, kVar.f1187s);
                        continue;
                    case 33:
                        i = indexCount2;
                        kVar.f1188t = f(obtainStyledAttributes, index2, kVar.f1188t);
                        continue;
                    case 34:
                        i = indexCount2;
                        kVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        kVar.f1178m = f(obtainStyledAttributes, index2, kVar.f1178m);
                        continue;
                    case 36:
                        i = indexCount2;
                        kVar.f1176l = f(obtainStyledAttributes, index2, kVar.f1176l);
                        continue;
                    case 37:
                        i = indexCount2;
                        kVar.f1192x = obtainStyledAttributes.getFloat(index2, kVar.f1192x);
                        continue;
                    case 38:
                        i = indexCount2;
                        jVar.f1148a = obtainStyledAttributes.getResourceId(index2, jVar.f1148a);
                        continue;
                    case 39:
                        i = indexCount2;
                        kVar.U = obtainStyledAttributes.getFloat(index2, kVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        kVar.T = obtainStyledAttributes.getFloat(index2, kVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        kVar.V = obtainStyledAttributes.getInt(index2, kVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        kVar.W = obtainStyledAttributes.getInt(index2, kVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        mVar.f1206c = obtainStyledAttributes.getFloat(index2, mVar.f1206c);
                        continue;
                    case 44:
                        i = indexCount2;
                        nVar.f1219l = true;
                        nVar.f1220m = obtainStyledAttributes.getDimension(index2, nVar.f1220m);
                        continue;
                    case 45:
                        i = indexCount2;
                        nVar.f1210b = obtainStyledAttributes.getFloat(index2, nVar.f1210b);
                        continue;
                    case 46:
                        i = indexCount2;
                        nVar.f1211c = obtainStyledAttributes.getFloat(index2, nVar.f1211c);
                        continue;
                    case 47:
                        i = indexCount2;
                        nVar.f1212d = obtainStyledAttributes.getFloat(index2, nVar.f1212d);
                        continue;
                    case 48:
                        i = indexCount2;
                        nVar.f1213e = obtainStyledAttributes.getFloat(index2, nVar.f1213e);
                        continue;
                    case 49:
                        i = indexCount2;
                        nVar.f1214f = obtainStyledAttributes.getDimension(index2, nVar.f1214f);
                        continue;
                    case 50:
                        i = indexCount2;
                        nVar.f1215g = obtainStyledAttributes.getDimension(index2, nVar.f1215g);
                        continue;
                    case 51:
                        i = indexCount2;
                        nVar.i = obtainStyledAttributes.getDimension(index2, nVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        nVar.f1217j = obtainStyledAttributes.getDimension(index2, nVar.f1217j);
                        continue;
                    case 53:
                        i = indexCount2;
                        nVar.f1218k = obtainStyledAttributes.getDimension(index2, nVar.f1218k);
                        continue;
                    case 54:
                        i = indexCount2;
                        kVar.X = obtainStyledAttributes.getInt(index2, kVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        kVar.Y = obtainStyledAttributes.getInt(index2, kVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        kVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        kVar.f1156a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1156a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        kVar.f1158b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1158b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        kVar.f1160c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1160c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        nVar.f1209a = obtainStyledAttributes.getFloat(index2, nVar.f1209a);
                        continue;
                    case 61:
                        i = indexCount2;
                        kVar.f1194z = f(obtainStyledAttributes, index2, kVar.f1194z);
                        continue;
                    case 62:
                        i = indexCount2;
                        kVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        kVar.B = obtainStyledAttributes.getFloat(index2, kVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        lVar.f1196a = f(obtainStyledAttributes, index2, lVar.f1196a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        lVar.f1200e = obtainStyledAttributes.getFloat(index2, lVar.f1200e);
                        break;
                    case 68:
                        i = indexCount2;
                        mVar.f1207d = obtainStyledAttributes.getFloat(index2, mVar.f1207d);
                        break;
                    case 69:
                        i = indexCount2;
                        kVar.f1162d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        kVar.f1164e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        kVar.f1166f0 = obtainStyledAttributes.getInt(index2, kVar.f1166f0);
                        break;
                    case 73:
                        i = indexCount2;
                        kVar.f1168g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1168g0);
                        break;
                    case 74:
                        i = indexCount2;
                        kVar.f1173j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        kVar.f1181n0 = obtainStyledAttributes.getBoolean(index2, kVar.f1181n0);
                        break;
                    case 76:
                        i = indexCount2;
                        lVar.f1198c = obtainStyledAttributes.getInt(index2, lVar.f1198c);
                        break;
                    case 77:
                        i = indexCount2;
                        kVar.f1175k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        mVar.f1205b = obtainStyledAttributes.getInt(index2, mVar.f1205b);
                        break;
                    case 79:
                        i = indexCount2;
                        lVar.f1199d = obtainStyledAttributes.getFloat(index2, lVar.f1199d);
                        break;
                    case 80:
                        i = indexCount2;
                        kVar.f1177l0 = obtainStyledAttributes.getBoolean(index2, kVar.f1177l0);
                        break;
                    case 81:
                        i = indexCount2;
                        kVar.f1179m0 = obtainStyledAttributes.getBoolean(index2, kVar.f1179m0);
                        break;
                    case 82:
                        i = indexCount2;
                        lVar.f1197b = obtainStyledAttributes.getInteger(index2, lVar.f1197b);
                        break;
                    case 83:
                        i = indexCount2;
                        nVar.f1216h = f(obtainStyledAttributes, index2, nVar.f1216h);
                        break;
                    case 84:
                        i = indexCount2;
                        lVar.f1202g = obtainStyledAttributes.getInteger(index2, lVar.f1202g);
                        break;
                    case 85:
                        i = indexCount2;
                        lVar.f1201f = obtainStyledAttributes.getFloat(index2, lVar.f1201f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i15 = obtainStyledAttributes.peekValue(index2).type;
                        if (i15 == 1) {
                            lVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i15 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            lVar.f1203h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, lVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        kVar.f1185q = f(obtainStyledAttributes, index2, kVar.f1185q);
                        break;
                    case 92:
                        i = indexCount2;
                        kVar.f1186r = f(obtainStyledAttributes, index2, kVar.f1186r);
                        break;
                    case 93:
                        i = indexCount2;
                        kVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        kVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(kVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(kVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        kVar.f1183o0 = obtainStyledAttributes.getInt(index2, kVar.f1183o0);
                        break;
                }
                i13++;
            }
            if (kVar.f1173j0 != null) {
                kVar.f1171i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i, int i8) {
        int resourceId = typedArray.getResourceId(i, i8);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i8) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i9 = typedArray.peekValue(i).type;
        boolean z3 = true;
        int i10 = 0;
        if (i9 == 3) {
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
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof k) {
                        ((k) obj).f1193y = trim2;
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
                            if (i8 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i8 == 0) {
                                kVar.f1157b = 0;
                                kVar.U = parseFloat;
                                return;
                            } else {
                                kVar.f1159c = 0;
                                kVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof i) {
                            i iVar = (i) obj;
                            if (i8 == 0) {
                                iVar.b(23, 0);
                                iVar.a(39, parseFloat);
                                return;
                            } else {
                                iVar.b(21, 0);
                                iVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i8 == 0) {
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
                        if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i8 == 0) {
                                kVar2.f1157b = 0;
                                kVar2.f1162d0 = max;
                                kVar2.X = 2;
                                return;
                            } else {
                                kVar2.f1159c = 0;
                                kVar2.f1164e0 = max;
                                kVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof i) {
                            i iVar2 = (i) obj;
                            if (i8 == 0) {
                                iVar2.b(23, 0);
                                iVar2.b(54, 2);
                                return;
                            } else {
                                iVar2.b(21, 0);
                                iVar2.b(55, 2);
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
        if (i9 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i10 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z3 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i8 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i10;
                    eVar4.W = z3;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i10;
                    eVar4.X = z3;
                    return;
                }
            }
            if (obj instanceof k) {
                k kVar3 = (k) obj;
                if (i8 == 0) {
                    kVar3.f1157b = i10;
                    kVar3.f1177l0 = z3;
                    return;
                } else {
                    kVar3.f1159c = i10;
                    kVar3.f1179m0 = z3;
                    return;
                }
            }
            if (obj instanceof i) {
                i iVar3 = (i) obj;
                if (i8 == 0) {
                    iVar3.b(23, i10);
                    iVar3.c(80, z3);
                    return;
                } else {
                    iVar3.b(21, i10);
                    iVar3.c(81, z3);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z3 = false;
        i10 = dimensionPixelSize;
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
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i8;
        String str;
        HashMap hashMap;
        String str2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f1226c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
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
                if (oVar.f1225b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        j jVar = (j) hashMap2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            m mVar = jVar.f1149b;
                            k kVar = jVar.f1151d;
                            n nVar = jVar.f1152e;
                            if (childAt instanceof a) {
                                kVar.f1170h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(kVar.f1166f0);
                                aVar.setMargin(kVar.f1168g0);
                                aVar.setAllowsGoneWidget(kVar.f1181n0);
                                int[] iArr = kVar.f1171i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f1173j0;
                                    if (str3 != null) {
                                        int[] c8 = c(aVar, str3);
                                        kVar.f1171i0 = c8;
                                        aVar.setReferencedIds(c8);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap hashMap3 = jVar.f1153f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (bVar.f1066a) {
                                    i8 = i9;
                                    str = str4;
                                } else {
                                    i8 = i9;
                                    str = "set" + str4;
                                }
                                try {
                                    int a8 = w2.e.a(bVar.f1067b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (a8) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f1068c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f1069d));
                                            break;
                                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f1072g));
                                            break;
                                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f1072g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i8;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i9 = i8;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i8;
                                                hashMap3 = hashMap;
                                            }
                                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f1070e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f1071f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f1069d));
                                            hashMap = hashMap3;
                                            break;
                                        case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f1068c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i9 = i8;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i9;
                            childAt.setLayoutParams(eVar);
                            if (mVar.f1205b == 0) {
                                childAt.setVisibility(mVar.f1204a);
                            }
                            childAt.setAlpha(mVar.f1206c);
                            childAt.setRotation(nVar.f1209a);
                            childAt.setRotationX(nVar.f1210b);
                            childAt.setRotationY(nVar.f1211c);
                            childAt.setScaleX(nVar.f1212d);
                            childAt.setScaleY(nVar.f1213e);
                            if (nVar.f1216h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f1216h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f1214f)) {
                                    childAt.setPivotX(nVar.f1214f);
                                }
                                if (!Float.isNaN(nVar.f1215g)) {
                                    childAt.setPivotY(nVar.f1215g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f1217j);
                            childAt.setTranslationZ(nVar.f1218k);
                            if (nVar.f1219l) {
                                childAt.setElevation(nVar.f1220m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i9;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i9 = i + 1;
                    oVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i9;
            i9 = i + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) hashMap2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f1151d;
                if (kVar2.f1170h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f1073d = new int[32];
                    aVar2.f1078j = new HashMap();
                    aVar2.f1075f = context;
                    y2.a aVar3 = new y2.a();
                    aVar3.f8719s0 = 0;
                    aVar3.f8720t0 = true;
                    aVar3.f8721u0 = 0;
                    aVar3.f8722v0 = false;
                    aVar2.f1065m = aVar3;
                    aVar2.f1076g = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f1171i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f1173j0;
                        if (str5 != null) {
                            int[] c9 = c(aVar2, str5);
                            kVar2.f1171i0 = c9;
                            aVar2.setReferencedIds(c9);
                        }
                    }
                    aVar2.setType(kVar2.f1166f0);
                    aVar2.setMargin(kVar2.f1168g0);
                    e g3 = ConstraintLayout.g();
                    aVar2.i();
                    jVar2.a(g3);
                    constraintLayout.addView(aVar2, g3);
                }
                if (kVar2.f1155a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e g7 = ConstraintLayout.g();
                    jVar2.a(g7);
                    constraintLayout.addView(qVar, g7);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i8;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f1226c;
        hashMap2.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f1225b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) hashMap2.get(Integer.valueOf(id));
            if (jVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i8 = i9;
            } else {
                m mVar = jVar.f1149b;
                k kVar = jVar.f1151d;
                n nVar = jVar.f1152e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i8 = i9;
                HashMap hashMap4 = oVar.f1224a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e8) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e8);
                    } catch (NoSuchMethodException e9) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e9);
                    } catch (InvocationTargetException e10) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
                    }
                    hashMap4 = hashMap5;
                }
                jVar.f1153f = hashMap3;
                jVar.f1148a = id;
                kVar.f1169h = eVar.f1088e;
                kVar.i = eVar.f1090f;
                kVar.f1172j = eVar.f1092g;
                kVar.f1174k = eVar.f1094h;
                kVar.f1176l = eVar.i;
                kVar.f1178m = eVar.f1097j;
                kVar.f1180n = eVar.f1099k;
                kVar.f1182o = eVar.f1101l;
                kVar.f1184p = eVar.f1103m;
                kVar.f1185q = eVar.f1105n;
                kVar.f1186r = eVar.f1107o;
                kVar.f1187s = eVar.f1113s;
                kVar.f1188t = eVar.f1114t;
                kVar.f1189u = eVar.f1115u;
                kVar.f1190v = eVar.f1116v;
                kVar.f1191w = eVar.E;
                kVar.f1192x = eVar.F;
                kVar.f1193y = eVar.G;
                kVar.f1194z = eVar.f1109p;
                kVar.A = eVar.f1111q;
                kVar.B = eVar.f1112r;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.E = eVar.V;
                kVar.f1165f = eVar.f1084c;
                kVar.f1161d = eVar.f1080a;
                kVar.f1163e = eVar.f1082b;
                kVar.f1157b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f1159c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.L = eVar.D;
                kVar.T = eVar.I;
                kVar.U = eVar.H;
                kVar.W = eVar.K;
                kVar.V = eVar.J;
                kVar.f1177l0 = eVar.W;
                kVar.f1179m0 = eVar.X;
                kVar.X = eVar.L;
                kVar.Y = eVar.M;
                kVar.Z = eVar.P;
                kVar.f1156a0 = eVar.Q;
                kVar.f1158b0 = eVar.N;
                kVar.f1160c0 = eVar.O;
                kVar.f1162d0 = eVar.R;
                kVar.f1164e0 = eVar.S;
                kVar.f1175k0 = eVar.Y;
                kVar.N = eVar.f1118x;
                kVar.P = eVar.f1120z;
                kVar.M = eVar.f1117w;
                kVar.O = eVar.f1119y;
                kVar.R = eVar.A;
                kVar.Q = eVar.B;
                kVar.S = eVar.C;
                kVar.f1183o0 = eVar.Z;
                kVar.J = eVar.getMarginEnd();
                kVar.K = eVar.getMarginStart();
                mVar.f1204a = childAt.getVisibility();
                mVar.f1206c = childAt.getAlpha();
                nVar.f1209a = childAt.getRotation();
                nVar.f1210b = childAt.getRotationX();
                nVar.f1211c = childAt.getRotationY();
                nVar.f1212d = childAt.getScaleX();
                nVar.f1213e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f1214f = pivotX;
                    nVar.f1215g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f1217j = childAt.getTranslationY();
                nVar.f1218k = childAt.getTranslationZ();
                if (nVar.f1219l) {
                    nVar.f1220m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f1181n0 = aVar.getAllowsGoneWidget();
                    kVar.f1171i0 = aVar.getReferencedIds();
                    kVar.f1166f0 = aVar.getType();
                    kVar.f1168g0 = aVar.getMargin();
                }
            }
            i9 = i8 + 1;
            oVar = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    j d8 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d8.f1151d.f1155a = true;
                    }
                    this.f1226c.put(Integer.valueOf(d8.f1148a), d8);
                }
            }
        } catch (IOException e8) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e8);
        } catch (XmlPullParserException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e9);
        }
    }
}
