package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tn {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = tr.a;
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

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void h(Object obj, TypedArray typedArray, int i, int i2) {
        int indexOf;
        int dimensionPixelSize;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null || (indexOf = string.indexOf(61)) <= 0 || indexOf >= string.length() - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof td) {
                        td tdVar = (td) obj;
                        if (i2 == 0) {
                            tdVar.width = 0;
                        } else {
                            tdVar.height = 0;
                        }
                        i(tdVar, trim2);
                        return;
                    }
                    if (obj instanceof tj) {
                        ((tj) obj).A = trim2;
                        return;
                    } else {
                        if (obj instanceof th) {
                            ((th) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof td) {
                            td tdVar2 = (td) obj;
                            if (i2 == 0) {
                                tdVar2.width = 0;
                                tdVar2.L = parseFloat;
                                return;
                            } else {
                                tdVar2.height = 0;
                                tdVar2.M = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof tj) {
                            tj tjVar = (tj) obj;
                            if (i2 == 0) {
                                tjVar.d = 0;
                                tjVar.W = parseFloat;
                                return;
                            } else {
                                tjVar.e = 0;
                                tjVar.V = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof th) {
                            th thVar = (th) obj;
                            if (i2 == 0) {
                                thVar.b(23, 0);
                                thVar.a(39, parseFloat);
                                return;
                            } else {
                                thVar.b(21, 0);
                                thVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof td) {
                            td tdVar3 = (td) obj;
                            if (i2 == 0) {
                                tdVar3.width = 0;
                                tdVar3.V = max;
                                tdVar3.P = 2;
                                return;
                            } else {
                                tdVar3.height = 0;
                                tdVar3.W = max;
                                tdVar3.Q = 2;
                                return;
                            }
                        }
                        if (obj instanceof tj) {
                            tj tjVar2 = (tj) obj;
                            if (i2 == 0) {
                                tjVar2.d = 0;
                                tjVar2.af = max;
                                tjVar2.Z = 2;
                                return;
                            } else {
                                tjVar2.e = 0;
                                tjVar2.ag = max;
                                tjVar2.aa = 2;
                                return;
                            }
                        }
                        if (obj instanceof th) {
                            th thVar2 = (th) obj;
                            if (i2 == 0) {
                                thVar2.b(23, 0);
                                thVar2.b(54, 2);
                                return;
                            } else {
                                thVar2.b(21, 0);
                                thVar2.b(55, 2);
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
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof td)) {
                td tdVar4 = (td) obj;
                if (i2 == 0) {
                    tdVar4.width = i4;
                    tdVar4.aa = z;
                    return;
                } else {
                    tdVar4.height = i4;
                    tdVar4.ab = z;
                    return;
                }
            }
            if (obj instanceof tj) {
                tj tjVar3 = (tj) obj;
                if (i2 == 0) {
                    tjVar3.d = i4;
                    tjVar3.an = z;
                    return;
                } else {
                    tjVar3.e = i4;
                    tjVar3.ao = z;
                    return;
                }
            }
            if (obj instanceof th) {
                th thVar3 = (th) obj;
                if (i2 == 0) {
                    thVar3.b(23, i4);
                    thVar3.d(80, z);
                    return;
                } else {
                    thVar3.b(21, i4);
                    thVar3.d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof td)) {
        }
    }

    static void i(td tdVar, String str) {
        int i;
        int i2 = -1;
        float f = Float.NaN;
        if (str != null) {
            int indexOf = str.indexOf(44);
            int length = str.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                r5 = indexOf + 1;
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(r5);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
                i2 = i;
            } else {
                String substring3 = str.substring(r5, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                i2 = i;
            }
            i2 = i;
        }
        tdVar.I = str;
        tdVar.J = f;
        tdVar.K = i2;
    }

    private static final int[] l(View view, String str) {
        int length;
        int i;
        Object d2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            try {
                i = tq.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                i = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (d2 = ((ConstraintLayout) view.getParent()).d(trim)) != null && (d2 instanceof Integer)) ? ((Integer) d2).intValue() : 0;
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private static final ti m(Context context, AttributeSet attributeSet, boolean z) {
        String str;
        String str2;
        int i;
        ti tiVar = new ti();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? tr.c : tr.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            th thVar = new th();
            tiVar.g = thVar;
            tk tkVar = tiVar.c;
            tkVar.b = false;
            tj tjVar = tiVar.d;
            tjVar.c = false;
            tl tlVar = tiVar.b;
            tlVar.a = false;
            tm tmVar = tiVar.e;
            tmVar.b = false;
            while (i2 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (d.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.K));
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
                        str2 = str3;
                        i = indexCount;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                        continue;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        thVar.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.E));
                        continue;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.F));
                        continue;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.L));
                        continue;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.R));
                        continue;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.S));
                        continue;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.O));
                        continue;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.Q));
                        continue;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.T));
                        continue;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.P));
                        continue;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.f));
                        continue;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.g));
                        continue;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(19, obtainStyledAttributes.getFloat(index, tjVar.h));
                        continue;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(20, obtainStyledAttributes.getFloat(index, tjVar.y));
                        continue;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(21, obtainStyledAttributes.getLayoutDimension(index, tjVar.e));
                        continue;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(22, a[obtainStyledAttributes.getInt(index, tlVar.b)]);
                        continue;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(23, obtainStyledAttributes.getLayoutDimension(index, tjVar.d));
                        continue;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.H));
                        continue;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(27, obtainStyledAttributes.getInt(index, tjVar.G));
                        continue;
                    case 28:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.I));
                        continue;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.M));
                        continue;
                    case 34:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.J));
                        continue;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(37, obtainStyledAttributes.getFloat(index, tjVar.z));
                        continue;
                    case 38:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, tiVar.a);
                        tiVar.a = resourceId;
                        thVar.b(38, resourceId);
                        continue;
                    case 39:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(39, obtainStyledAttributes.getFloat(index, tjVar.W));
                        continue;
                    case 40:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(40, obtainStyledAttributes.getFloat(index, tjVar.V));
                        continue;
                    case 41:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(41, obtainStyledAttributes.getInt(index, tjVar.X));
                        continue;
                    case 42:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(42, obtainStyledAttributes.getInt(index, tjVar.Y));
                        continue;
                    case 43:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(43, obtainStyledAttributes.getFloat(index, tlVar.d));
                        continue;
                    case 44:
                        str2 = str3;
                        i = indexCount;
                        thVar.d(44, true);
                        thVar.a(44, obtainStyledAttributes.getDimension(index, tmVar.o));
                        continue;
                    case 45:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(45, obtainStyledAttributes.getFloat(index, tmVar.d));
                        continue;
                    case 46:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(46, obtainStyledAttributes.getFloat(index, tmVar.e));
                        continue;
                    case 47:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(47, obtainStyledAttributes.getFloat(index, tmVar.f));
                        continue;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(48, obtainStyledAttributes.getFloat(index, tmVar.g));
                        continue;
                    case 49:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(49, obtainStyledAttributes.getDimension(index, tmVar.h));
                        continue;
                    case 50:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(50, obtainStyledAttributes.getDimension(index, tmVar.i));
                        continue;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(51, obtainStyledAttributes.getDimension(index, tmVar.k));
                        continue;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(52, obtainStyledAttributes.getDimension(index, tmVar.l));
                        continue;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(53, obtainStyledAttributes.getDimension(index, tmVar.m));
                        continue;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(54, obtainStyledAttributes.getInt(index, tjVar.Z));
                        continue;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(55, obtainStyledAttributes.getInt(index, tjVar.aa));
                        continue;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ab));
                        continue;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ac));
                        continue;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ad));
                        continue;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ae));
                        continue;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(60, obtainStyledAttributes.getFloat(index, tmVar.c));
                        continue;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.C));
                        continue;
                    case 63:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(63, obtainStyledAttributes.getFloat(index, tjVar.D));
                        continue;
                    case 64:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(64, a(obtainStyledAttributes, index, tkVar.c));
                        continue;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            thVar.c(65, rz.a[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        } else {
                            thVar.c(65, obtainStyledAttributes.getString(index));
                            continue;
                        }
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        continue;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(67, obtainStyledAttributes.getFloat(index, tkVar.j));
                        continue;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(68, obtainStyledAttributes.getFloat(index, tlVar.e));
                        continue;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(72, obtainStyledAttributes.getInt(index, tjVar.ah));
                        continue;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ai));
                        continue;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        thVar.c(74, obtainStyledAttributes.getString(index));
                        continue;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        thVar.d(75, obtainStyledAttributes.getBoolean(index, tjVar.ap));
                        continue;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(76, obtainStyledAttributes.getInt(index, tkVar.f));
                        continue;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        thVar.c(77, obtainStyledAttributes.getString(index));
                        continue;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(78, obtainStyledAttributes.getInt(index, tlVar.c));
                        continue;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(79, obtainStyledAttributes.getFloat(index, tkVar.h));
                        continue;
                    case 80:
                        str2 = str3;
                        i = indexCount;
                        thVar.d(80, obtainStyledAttributes.getBoolean(index, tjVar.an));
                        continue;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        thVar.d(81, obtainStyledAttributes.getBoolean(index, tjVar.ao));
                        continue;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(82, obtainStyledAttributes.getInteger(index, tkVar.d));
                        continue;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(83, a(obtainStyledAttributes, index, tmVar.j));
                        continue;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        thVar.b(84, obtainStyledAttributes.getInteger(index, tkVar.l));
                        continue;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        thVar.a(85, obtainStyledAttributes.getFloat(index, tkVar.k));
                        continue;
                    case 86:
                        i = indexCount;
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (peekValue.type != 1) {
                            if (peekValue.type != 3) {
                                thVar.b(88, obtainStyledAttributes.getInteger(index, tkVar.n));
                                break;
                            } else {
                                tkVar.m = obtainStyledAttributes.getString(index);
                                thVar.c(90, tkVar.m);
                                if (tkVar.m.indexOf("/") <= 0) {
                                    thVar.b(88, -1);
                                    break;
                                } else {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    tkVar.n = resourceId2;
                                    thVar.b(89, resourceId2);
                                    thVar.b(88, -2);
                                    break;
                                }
                            }
                        } else {
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                            tkVar.n = resourceId3;
                            thVar.b(89, resourceId3);
                            if (tkVar.n != -1) {
                                thVar.b(88, -2);
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 87:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + c.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        thVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        thVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, tjVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        h(thVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i = indexCount;
                        h(thVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        thVar.b(97, obtainStyledAttributes.getInt(index, tjVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            tiVar.a = obtainStyledAttributes.getResourceId(index, tiVar.a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        thVar.d(99, obtainStyledAttributes.getBoolean(index, tjVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            String str4 = "unused attribute 0x";
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    tiVar.c.b = true;
                    tiVar.d.c = true;
                    tiVar.b.a = true;
                    tiVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        tj tjVar2 = tiVar.d;
                        tjVar2.r = a(obtainStyledAttributes, index2, tjVar2.r);
                        break;
                    case 2:
                        str = str4;
                        tj tjVar3 = tiVar.d;
                        tjVar3.K = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar3.K);
                        break;
                    case 3:
                        str = str4;
                        tj tjVar4 = tiVar.d;
                        tjVar4.q = a(obtainStyledAttributes, index2, tjVar4.q);
                        break;
                    case 4:
                        str = str4;
                        tj tjVar5 = tiVar.d;
                        tjVar5.p = a(obtainStyledAttributes, index2, tjVar5.p);
                        break;
                    case 5:
                        str = str4;
                        tiVar.d.A = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        tj tjVar6 = tiVar.d;
                        tjVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index2, tjVar6.E);
                        break;
                    case 7:
                        str = str4;
                        tj tjVar7 = tiVar.d;
                        tjVar7.F = obtainStyledAttributes.getDimensionPixelOffset(index2, tjVar7.F);
                        break;
                    case 8:
                        str = str4;
                        tj tjVar8 = tiVar.d;
                        tjVar8.L = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar8.L);
                        break;
                    case 9:
                        str = str4;
                        tj tjVar9 = tiVar.d;
                        tjVar9.x = a(obtainStyledAttributes, index2, tjVar9.x);
                        break;
                    case 10:
                        str = str4;
                        tj tjVar10 = tiVar.d;
                        tjVar10.w = a(obtainStyledAttributes, index2, tjVar10.w);
                        break;
                    case 11:
                        str = str4;
                        tj tjVar11 = tiVar.d;
                        tjVar11.R = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar11.R);
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        str = str4;
                        tj tjVar12 = tiVar.d;
                        tjVar12.S = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar12.S);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        str = str4;
                        tj tjVar13 = tiVar.d;
                        tjVar13.O = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar13.O);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str = str4;
                        tj tjVar14 = tiVar.d;
                        tjVar14.Q = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        tj tjVar15 = tiVar.d;
                        tjVar15.T = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar15.T);
                        break;
                    case 16:
                        str = str4;
                        tj tjVar16 = tiVar.d;
                        tjVar16.P = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar16.P);
                        break;
                    case 17:
                        str = str4;
                        tj tjVar17 = tiVar.d;
                        tjVar17.f = obtainStyledAttributes.getDimensionPixelOffset(index2, tjVar17.f);
                        break;
                    case 18:
                        str = str4;
                        tj tjVar18 = tiVar.d;
                        tjVar18.g = obtainStyledAttributes.getDimensionPixelOffset(index2, tjVar18.g);
                        break;
                    case 19:
                        str = str4;
                        tj tjVar19 = tiVar.d;
                        tjVar19.h = obtainStyledAttributes.getFloat(index2, tjVar19.h);
                        break;
                    case 20:
                        str = str4;
                        tj tjVar20 = tiVar.d;
                        tjVar20.y = obtainStyledAttributes.getFloat(index2, tjVar20.y);
                        break;
                    case 21:
                        str = str4;
                        tj tjVar21 = tiVar.d;
                        tjVar21.e = obtainStyledAttributes.getLayoutDimension(index2, tjVar21.e);
                        break;
                    case 22:
                        str = str4;
                        tl tlVar2 = tiVar.b;
                        int i5 = obtainStyledAttributes.getInt(index2, tlVar2.b);
                        tlVar2.b = i5;
                        tlVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        tj tjVar22 = tiVar.d;
                        tjVar22.d = obtainStyledAttributes.getLayoutDimension(index2, tjVar22.d);
                        break;
                    case 24:
                        str = str4;
                        tj tjVar23 = tiVar.d;
                        tjVar23.H = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar23.H);
                        break;
                    case 25:
                        str = str4;
                        tj tjVar24 = tiVar.d;
                        tjVar24.j = a(obtainStyledAttributes, index2, tjVar24.j);
                        break;
                    case 26:
                        str = str4;
                        tj tjVar25 = tiVar.d;
                        tjVar25.k = a(obtainStyledAttributes, index2, tjVar25.k);
                        break;
                    case 27:
                        str = str4;
                        tj tjVar26 = tiVar.d;
                        tjVar26.G = obtainStyledAttributes.getInt(index2, tjVar26.G);
                        break;
                    case 28:
                        str = str4;
                        tj tjVar27 = tiVar.d;
                        tjVar27.I = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar27.I);
                        break;
                    case 29:
                        str = str4;
                        tj tjVar28 = tiVar.d;
                        tjVar28.l = a(obtainStyledAttributes, index2, tjVar28.l);
                        break;
                    case 30:
                        str = str4;
                        tj tjVar29 = tiVar.d;
                        tjVar29.m = a(obtainStyledAttributes, index2, tjVar29.m);
                        break;
                    case 31:
                        str = str4;
                        tj tjVar30 = tiVar.d;
                        tjVar30.M = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar30.M);
                        break;
                    case 32:
                        str = str4;
                        tj tjVar31 = tiVar.d;
                        tjVar31.u = a(obtainStyledAttributes, index2, tjVar31.u);
                        break;
                    case 33:
                        str = str4;
                        tj tjVar32 = tiVar.d;
                        tjVar32.v = a(obtainStyledAttributes, index2, tjVar32.v);
                        break;
                    case 34:
                        str = str4;
                        tj tjVar33 = tiVar.d;
                        tjVar33.J = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar33.J);
                        break;
                    case 35:
                        str = str4;
                        tj tjVar34 = tiVar.d;
                        tjVar34.o = a(obtainStyledAttributes, index2, tjVar34.o);
                        break;
                    case 36:
                        str = str4;
                        tj tjVar35 = tiVar.d;
                        tjVar35.n = a(obtainStyledAttributes, index2, tjVar35.n);
                        break;
                    case 37:
                        str = str4;
                        tj tjVar36 = tiVar.d;
                        tjVar36.z = obtainStyledAttributes.getFloat(index2, tjVar36.z);
                        break;
                    case 38:
                        str = str4;
                        tiVar.a = obtainStyledAttributes.getResourceId(index2, tiVar.a);
                        break;
                    case 39:
                        str = str4;
                        tj tjVar37 = tiVar.d;
                        tjVar37.W = obtainStyledAttributes.getFloat(index2, tjVar37.W);
                        break;
                    case 40:
                        str = str4;
                        tj tjVar38 = tiVar.d;
                        tjVar38.V = obtainStyledAttributes.getFloat(index2, tjVar38.V);
                        break;
                    case 41:
                        str = str4;
                        tj tjVar39 = tiVar.d;
                        tjVar39.X = obtainStyledAttributes.getInt(index2, tjVar39.X);
                        break;
                    case 42:
                        str = str4;
                        tj tjVar40 = tiVar.d;
                        tjVar40.Y = obtainStyledAttributes.getInt(index2, tjVar40.Y);
                        break;
                    case 43:
                        str = str4;
                        tl tlVar3 = tiVar.b;
                        tlVar3.d = obtainStyledAttributes.getFloat(index2, tlVar3.d);
                        break;
                    case 44:
                        str = str4;
                        tm tmVar2 = tiVar.e;
                        tmVar2.n = true;
                        tmVar2.o = obtainStyledAttributes.getDimension(index2, tmVar2.o);
                        break;
                    case 45:
                        str = str4;
                        tm tmVar3 = tiVar.e;
                        tmVar3.d = obtainStyledAttributes.getFloat(index2, tmVar3.d);
                        break;
                    case 46:
                        str = str4;
                        tm tmVar4 = tiVar.e;
                        tmVar4.e = obtainStyledAttributes.getFloat(index2, tmVar4.e);
                        break;
                    case 47:
                        str = str4;
                        tm tmVar5 = tiVar.e;
                        tmVar5.f = obtainStyledAttributes.getFloat(index2, tmVar5.f);
                        break;
                    case 48:
                        str = str4;
                        tm tmVar6 = tiVar.e;
                        tmVar6.g = obtainStyledAttributes.getFloat(index2, tmVar6.g);
                        break;
                    case 49:
                        str = str4;
                        tm tmVar7 = tiVar.e;
                        tmVar7.h = obtainStyledAttributes.getDimension(index2, tmVar7.h);
                        break;
                    case 50:
                        str = str4;
                        tm tmVar8 = tiVar.e;
                        tmVar8.i = obtainStyledAttributes.getDimension(index2, tmVar8.i);
                        break;
                    case 51:
                        str = str4;
                        tm tmVar9 = tiVar.e;
                        tmVar9.k = obtainStyledAttributes.getDimension(index2, tmVar9.k);
                        break;
                    case 52:
                        str = str4;
                        tm tmVar10 = tiVar.e;
                        tmVar10.l = obtainStyledAttributes.getDimension(index2, tmVar10.l);
                        break;
                    case 53:
                        str = str4;
                        tm tmVar11 = tiVar.e;
                        tmVar11.m = obtainStyledAttributes.getDimension(index2, tmVar11.m);
                        break;
                    case 54:
                        str = str4;
                        tj tjVar41 = tiVar.d;
                        tjVar41.Z = obtainStyledAttributes.getInt(index2, tjVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        tj tjVar42 = tiVar.d;
                        tjVar42.aa = obtainStyledAttributes.getInt(index2, tjVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        tj tjVar43 = tiVar.d;
                        tjVar43.ab = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        tj tjVar44 = tiVar.d;
                        tjVar44.ac = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        tj tjVar45 = tiVar.d;
                        tjVar45.ad = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        tj tjVar46 = tiVar.d;
                        tjVar46.ae = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        tm tmVar12 = tiVar.e;
                        tmVar12.c = obtainStyledAttributes.getFloat(index2, tmVar12.c);
                        break;
                    case 61:
                        str = str4;
                        tj tjVar47 = tiVar.d;
                        tjVar47.B = a(obtainStyledAttributes, index2, tjVar47.B);
                        break;
                    case 62:
                        str = str4;
                        tj tjVar48 = tiVar.d;
                        tjVar48.C = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar48.C);
                        break;
                    case 63:
                        str = str4;
                        tj tjVar49 = tiVar.d;
                        tjVar49.D = obtainStyledAttributes.getFloat(index2, tjVar49.D);
                        break;
                    case 64:
                        str = str4;
                        tk tkVar2 = tiVar.c;
                        tkVar2.c = a(obtainStyledAttributes, index2, tkVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            tiVar.c.e = rz.a[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            tiVar.c.e = obtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        str = str4;
                        tiVar.c.g = obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        tk tkVar3 = tiVar.c;
                        tkVar3.j = obtainStyledAttributes.getFloat(index2, tkVar3.j);
                        break;
                    case 68:
                        str = str4;
                        tl tlVar4 = tiVar.b;
                        tlVar4.e = obtainStyledAttributes.getFloat(index2, tlVar4.e);
                        break;
                    case 69:
                        str = str4;
                        tiVar.d.af = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        tiVar.d.ag = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        tj tjVar50 = tiVar.d;
                        tjVar50.ah = obtainStyledAttributes.getInt(index2, tjVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        tj tjVar51 = tiVar.d;
                        tjVar51.ai = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        tiVar.d.al = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        tj tjVar52 = tiVar.d;
                        tjVar52.ap = obtainStyledAttributes.getBoolean(index2, tjVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        tk tkVar4 = tiVar.c;
                        tkVar4.f = obtainStyledAttributes.getInt(index2, tkVar4.f);
                        break;
                    case 77:
                        str = str4;
                        tiVar.d.am = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        tl tlVar5 = tiVar.b;
                        tlVar5.c = obtainStyledAttributes.getInt(index2, tlVar5.c);
                        break;
                    case 79:
                        str = str4;
                        tk tkVar5 = tiVar.c;
                        tkVar5.h = obtainStyledAttributes.getFloat(index2, tkVar5.h);
                        break;
                    case 80:
                        str = str4;
                        tj tjVar53 = tiVar.d;
                        tjVar53.an = obtainStyledAttributes.getBoolean(index2, tjVar53.an);
                        break;
                    case 81:
                        str = str4;
                        tj tjVar54 = tiVar.d;
                        tjVar54.ao = obtainStyledAttributes.getBoolean(index2, tjVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        tk tkVar6 = tiVar.c;
                        tkVar6.d = obtainStyledAttributes.getInteger(index2, tkVar6.d);
                        break;
                    case 83:
                        str = str4;
                        tm tmVar13 = tiVar.e;
                        tmVar13.j = a(obtainStyledAttributes, index2, tmVar13.j);
                        break;
                    case 84:
                        str = str4;
                        tk tkVar7 = tiVar.c;
                        tkVar7.l = obtainStyledAttributes.getInteger(index2, tkVar7.l);
                        break;
                    case 85:
                        str = str4;
                        tk tkVar8 = tiVar.c;
                        tkVar8.k = obtainStyledAttributes.getFloat(index2, tkVar8.k);
                        break;
                    case 86:
                        str = str4;
                        TypedValue peekValue2 = obtainStyledAttributes.peekValue(index2);
                        if (peekValue2.type == 1) {
                            tiVar.c.n = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (peekValue2.type == 3) {
                            tk tkVar9 = tiVar.c;
                            tkVar9.m = obtainStyledAttributes.getString(index2);
                            if (tkVar9.m.indexOf("/") > 0) {
                                tkVar9.n = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, tiVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        tj tjVar55 = tiVar.d;
                        tjVar55.s = a(obtainStyledAttributes, index2, tjVar55.s);
                        str = str4;
                        break;
                    case 92:
                        tj tjVar56 = tiVar.d;
                        tjVar56.t = a(obtainStyledAttributes, index2, tjVar56.t);
                        str = str4;
                        break;
                    case 93:
                        tj tjVar57 = tiVar.d;
                        tjVar57.N = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar57.N);
                        str = str4;
                        break;
                    case 94:
                        tj tjVar58 = tiVar.d;
                        tjVar58.U = obtainStyledAttributes.getDimensionPixelSize(index2, tjVar58.U);
                        str = str4;
                        break;
                    case 95:
                        h(tiVar.d, obtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case 96:
                        h(tiVar.d, obtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        tj tjVar59 = tiVar.d;
                        tjVar59.aq = obtainStyledAttributes.getInt(index2, tjVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            tj tjVar60 = tiVar.d;
            if (tjVar60.al != null) {
                tjVar60.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return tiVar;
    }

    private static final String n(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top";
    }

    public final void b(ConstraintLayout constraintLayout) {
        j(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        tn tnVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = tnVar.b;
        hashMap3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            td tdVar = (td) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap3.containsKey(valueOf)) {
                hashMap3.put(valueOf, new ti());
            }
            ti tiVar = (ti) hashMap3.get(valueOf);
            if (tiVar == null) {
                i = childCount;
                hashMap = hashMap3;
            } else {
                HashMap hashMap4 = tnVar.e;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    ta taVar = (ta) hashMap4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new ta(taVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap5.put(str, new ta(taVar, cls.getMethod(a.ah(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        hashMap2 = hashMap3;
                    }
                    childCount = i3;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                tiVar.f = hashMap5;
                tiVar.a = id;
                int i4 = tdVar.e;
                tj tjVar = tiVar.d;
                tjVar.j = i4;
                tjVar.k = tdVar.f;
                tjVar.l = tdVar.g;
                tjVar.m = tdVar.h;
                tjVar.n = tdVar.i;
                tjVar.o = tdVar.j;
                tjVar.p = tdVar.k;
                tjVar.q = tdVar.l;
                tjVar.r = tdVar.m;
                tjVar.s = tdVar.n;
                tjVar.t = tdVar.o;
                tjVar.u = tdVar.s;
                tjVar.v = tdVar.t;
                tjVar.w = tdVar.u;
                tjVar.x = tdVar.v;
                tjVar.y = tdVar.G;
                tjVar.z = tdVar.H;
                tjVar.A = tdVar.I;
                tjVar.B = tdVar.p;
                tjVar.C = tdVar.q;
                tjVar.D = tdVar.r;
                tjVar.E = tdVar.X;
                tjVar.F = tdVar.Y;
                tjVar.G = tdVar.Z;
                tjVar.h = tdVar.c;
                tjVar.f = tdVar.a;
                tjVar.g = tdVar.b;
                tjVar.d = tdVar.width;
                tjVar.e = tdVar.height;
                tjVar.H = tdVar.leftMargin;
                tjVar.I = tdVar.rightMargin;
                tjVar.J = tdVar.topMargin;
                tjVar.K = tdVar.bottomMargin;
                tjVar.N = tdVar.D;
                tjVar.V = tdVar.M;
                tjVar.W = tdVar.L;
                tjVar.Y = tdVar.O;
                tjVar.X = tdVar.N;
                tjVar.an = tdVar.aa;
                tjVar.ao = tdVar.ab;
                tjVar.Z = tdVar.P;
                tjVar.aa = tdVar.Q;
                tjVar.ab = tdVar.T;
                tjVar.ac = tdVar.U;
                tjVar.ad = tdVar.R;
                tjVar.ae = tdVar.S;
                tjVar.af = tdVar.V;
                tjVar.ag = tdVar.W;
                tjVar.am = tdVar.ac;
                tjVar.P = tdVar.x;
                tjVar.R = tdVar.z;
                tjVar.O = tdVar.w;
                tjVar.Q = tdVar.y;
                tjVar.T = tdVar.A;
                tjVar.S = tdVar.B;
                tjVar.U = tdVar.C;
                tjVar.aq = tdVar.ad;
                tjVar.L = tdVar.getMarginEnd();
                tjVar.M = tdVar.getMarginStart();
                tl tlVar = tiVar.b;
                tlVar.b = childAt.getVisibility();
                tlVar.d = childAt.getAlpha();
                tm tmVar = tiVar.e;
                tmVar.c = childAt.getRotation();
                tmVar.d = childAt.getRotationX();
                tmVar.e = childAt.getRotationY();
                tmVar.f = childAt.getScaleX();
                tmVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    tmVar.h = pivotX;
                    tmVar.i = pivotY;
                }
                tmVar.k = childAt.getTranslationX();
                tmVar.l = childAt.getTranslationY();
                tmVar.m = childAt.getTranslationZ();
                if (tmVar.n) {
                    tmVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    tjVar.ap = barrier.b.b;
                    tjVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    tjVar.ah = barrier.a;
                    tjVar.ai = barrier.b.c;
                }
            }
            i2++;
            tnVar = this;
            childCount = i;
            hashMap3 = hashMap;
        }
    }

    public final void d(Context context, int i) {
        c((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void e(int i, int i2, int i3, int i4) {
        tj tjVar;
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new ti());
        }
        ti tiVar = (ti) hashMap.get(valueOf);
        if (tiVar == null) {
            return;
        }
        if (i2 != 3) {
            tjVar = tiVar.d;
            if (i4 == 4) {
                tjVar.q = i3;
                tjVar.p = -1;
            } else {
                tjVar.p = i3;
                tjVar.q = -1;
            }
        } else {
            tjVar = tiVar.d;
            if (i4 == 3) {
                tjVar.n = i3;
                tjVar.o = -1;
            } else {
                tjVar.o = i3;
                tjVar.n = -1;
            }
        }
        tjVar.r = -1;
        tjVar.s = -1;
        tjVar.t = -1;
    }

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ti m = m(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m.d.b = true;
                    }
                    this.b.put(Integer.valueOf(m.a), m);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.Y(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.Y(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c5, code lost:
    
        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + r22.getLineNumber());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00a9, code lost:
    
        if (r9.equals("CustomMethod") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r3.equals("constraintoverride") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r20.b.put(java.lang.Integer.valueOf(r5.a), r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r3.equals("constraint") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r3.equals("guideline") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r9.equals("CustomAttribute") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r5 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        r9 = r5.f;
        r10 = r21.obtainStyledAttributes(android.util.Xml.asAttributeSet(r22), defpackage.tr.d);
        r12 = r10.getIndexCount();
        r15 = 0;
        r17 = 0;
        r18 = false;
        r4 = null;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r15 >= r12) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        r13 = r10.getIndex(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r13 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        r4 = r10.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r4 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        if (r4.length() <= 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        r4 = java.lang.Character.toUpperCase(r4.charAt(0)) + r4.substring(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0190, code lost:
    
        r15 = r15 + 1;
        r7 = 2;
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r13 != 10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r4 = r10.getString(10);
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        if (r13 != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r16 = java.lang.Boolean.valueOf(r10.getBoolean(1, false));
        r17 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    
        if (r13 != r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
    
        r16 = java.lang.Integer.valueOf(r10.getColor(r8, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        if (r13 != r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
    
        r16 = java.lang.Integer.valueOf(r10.getColor(r7, 0));
        r17 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        if (r13 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r16 = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, r10.getDimension(7, 0.0f), r21.getResources().getDisplayMetrics()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        if (r13 != 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        r16 = java.lang.Float.valueOf(r10.getDimension(4, 0.0f));
        r17 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0153, code lost:
    
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r13 != 5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        r16 = java.lang.Float.valueOf(r10.getFloat(5, Float.NaN));
        r17 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        if (r13 != 6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0165, code lost:
    
        r16 = java.lang.Integer.valueOf(r10.getInteger(6, -1));
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0173, code lost:
    
        if (r13 != 9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0175, code lost:
    
        r16 = r10.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0179, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        if (r13 != 8) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
    
        r11 = r10.getResourceId(8, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0185, code lost:
    
        if (r11 != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0187, code lost:
    
        r11 = r10.getInt(8, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018b, code lost:
    
        r16 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0198, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
    
        if (r6 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        r9.put(r4, new defpackage.ta(r4, r17, r6, r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a8, code lost:
    
        r10.recycle();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            ti tiVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 2;
                    int i2 = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (tiVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    tj tjVar = tiVar.d;
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tr.e);
                                    tjVar.c = true;
                                    int indexCount = obtainStyledAttributes.getIndexCount();
                                    for (int i3 = 0; i3 < indexCount; i3++) {
                                        int index = obtainStyledAttributes.getIndex(i3);
                                        SparseIntArray sparseIntArray = tj.a;
                                        int i4 = sparseIntArray.get(index);
                                        switch (i4) {
                                            case 1:
                                                tjVar.r = a(obtainStyledAttributes, index, tjVar.r);
                                                break;
                                            case 2:
                                                tjVar.K = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.K);
                                                break;
                                            case 3:
                                                tjVar.q = a(obtainStyledAttributes, index, tjVar.q);
                                                break;
                                            case 4:
                                                tjVar.p = a(obtainStyledAttributes, index, tjVar.p);
                                                break;
                                            case 5:
                                                tjVar.A = obtainStyledAttributes.getString(index);
                                                break;
                                            case 6:
                                                tjVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.E);
                                                break;
                                            case 7:
                                                tjVar.F = obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.F);
                                                break;
                                            case 8:
                                                tjVar.L = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.L);
                                                break;
                                            case 9:
                                                tjVar.x = a(obtainStyledAttributes, index, tjVar.x);
                                                break;
                                            case 10:
                                                tjVar.w = a(obtainStyledAttributes, index, tjVar.w);
                                                break;
                                            case 11:
                                                tjVar.R = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.R);
                                                break;
                                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                                tjVar.S = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.S);
                                                break;
                                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                                tjVar.O = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.O);
                                                break;
                                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                                tjVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.Q);
                                                break;
                                            case 15:
                                                tjVar.T = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.T);
                                                break;
                                            case 16:
                                                tjVar.P = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.P);
                                                break;
                                            case 17:
                                                tjVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.f);
                                                break;
                                            case 18:
                                                tjVar.g = obtainStyledAttributes.getDimensionPixelOffset(index, tjVar.g);
                                                break;
                                            case 19:
                                                tjVar.h = obtainStyledAttributes.getFloat(index, tjVar.h);
                                                break;
                                            case 20:
                                                tjVar.y = obtainStyledAttributes.getFloat(index, tjVar.y);
                                                break;
                                            case 21:
                                                tjVar.e = obtainStyledAttributes.getLayoutDimension(index, tjVar.e);
                                                break;
                                            case 22:
                                                tjVar.d = obtainStyledAttributes.getLayoutDimension(index, tjVar.d);
                                                break;
                                            case 23:
                                                tjVar.H = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.H);
                                                break;
                                            case 24:
                                                tjVar.j = a(obtainStyledAttributes, index, tjVar.j);
                                                break;
                                            case 25:
                                                tjVar.k = a(obtainStyledAttributes, index, tjVar.k);
                                                break;
                                            case 26:
                                                tjVar.G = obtainStyledAttributes.getInt(index, tjVar.G);
                                                break;
                                            case 27:
                                                tjVar.I = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.I);
                                                break;
                                            case 28:
                                                tjVar.l = a(obtainStyledAttributes, index, tjVar.l);
                                                break;
                                            case 29:
                                                tjVar.m = a(obtainStyledAttributes, index, tjVar.m);
                                                break;
                                            case 30:
                                                tjVar.M = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.M);
                                                break;
                                            case 31:
                                                tjVar.u = a(obtainStyledAttributes, index, tjVar.u);
                                                break;
                                            case 32:
                                                tjVar.v = a(obtainStyledAttributes, index, tjVar.v);
                                                break;
                                            case 33:
                                                tjVar.J = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.J);
                                                break;
                                            case 34:
                                                tjVar.o = a(obtainStyledAttributes, index, tjVar.o);
                                                break;
                                            case 35:
                                                tjVar.n = a(obtainStyledAttributes, index, tjVar.n);
                                                break;
                                            case 36:
                                                tjVar.z = obtainStyledAttributes.getFloat(index, tjVar.z);
                                                break;
                                            case 37:
                                                tjVar.W = obtainStyledAttributes.getFloat(index, tjVar.W);
                                                break;
                                            case 38:
                                                tjVar.V = obtainStyledAttributes.getFloat(index, tjVar.V);
                                                break;
                                            case 39:
                                                tjVar.X = obtainStyledAttributes.getInt(index, tjVar.X);
                                                break;
                                            case 40:
                                                tjVar.Y = obtainStyledAttributes.getInt(index, tjVar.Y);
                                                break;
                                            case 41:
                                                h(tjVar, obtainStyledAttributes, index, 0);
                                                break;
                                            case 42:
                                                h(tjVar, obtainStyledAttributes, index, 1);
                                                break;
                                            default:
                                                switch (i4) {
                                                    case 61:
                                                        tjVar.B = a(obtainStyledAttributes, index, tjVar.B);
                                                        break;
                                                    case 62:
                                                        tjVar.C = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.C);
                                                        break;
                                                    case 63:
                                                        tjVar.D = obtainStyledAttributes.getFloat(index, tjVar.D);
                                                        break;
                                                    default:
                                                        switch (i4) {
                                                            case 69:
                                                                tjVar.af = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                break;
                                                            case 70:
                                                                tjVar.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                break;
                                                            case 71:
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case 72:
                                                                tjVar.ah = obtainStyledAttributes.getInt(index, tjVar.ah);
                                                                break;
                                                            case 73:
                                                                tjVar.ai = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ai);
                                                                break;
                                                            case 74:
                                                                tjVar.al = obtainStyledAttributes.getString(index);
                                                                break;
                                                            case 75:
                                                                tjVar.ap = obtainStyledAttributes.getBoolean(index, tjVar.ap);
                                                                break;
                                                            case 76:
                                                                tjVar.aq = obtainStyledAttributes.getInt(index, tjVar.aq);
                                                                break;
                                                            case 77:
                                                                tjVar.s = a(obtainStyledAttributes, index, tjVar.s);
                                                                break;
                                                            case 78:
                                                                tjVar.t = a(obtainStyledAttributes, index, tjVar.t);
                                                                break;
                                                            case 79:
                                                                tjVar.U = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.U);
                                                                break;
                                                            case 80:
                                                                tjVar.N = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.N);
                                                                break;
                                                            case 81:
                                                                tjVar.Z = obtainStyledAttributes.getInt(index, tjVar.Z);
                                                                break;
                                                            case 82:
                                                                tjVar.aa = obtainStyledAttributes.getInt(index, tjVar.aa);
                                                                break;
                                                            case 83:
                                                                tjVar.ac = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ac);
                                                                break;
                                                            case 84:
                                                                tjVar.ab = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ab);
                                                                break;
                                                            case 85:
                                                                tjVar.ae = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ae);
                                                                break;
                                                            case 86:
                                                                tjVar.ad = obtainStyledAttributes.getDimensionPixelSize(index, tjVar.ad);
                                                                break;
                                                            case 87:
                                                                tjVar.an = obtainStyledAttributes.getBoolean(index, tjVar.an);
                                                                break;
                                                            case 88:
                                                                tjVar.ao = obtainStyledAttributes.getBoolean(index, tjVar.ao);
                                                                break;
                                                            case 89:
                                                                tjVar.am = obtainStyledAttributes.getString(index);
                                                                break;
                                                            case 90:
                                                                tjVar.i = obtainStyledAttributes.getBoolean(index, tjVar.i);
                                                                break;
                                                            case 91:
                                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                    obtainStyledAttributes.recycle();
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (tiVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    tk tkVar = tiVar.c;
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tr.f);
                                    tkVar.b = true;
                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                    for (int i5 = 0; i5 < indexCount2; i5++) {
                                        int index2 = obtainStyledAttributes2.getIndex(i5);
                                        switch (tk.a.get(index2)) {
                                            case 1:
                                                tkVar.j = obtainStyledAttributes2.getFloat(index2, tkVar.j);
                                                break;
                                            case 2:
                                                tkVar.f = obtainStyledAttributes2.getInt(index2, tkVar.f);
                                                break;
                                            case 3:
                                                if (obtainStyledAttributes2.peekValue(index2).type == 3) {
                                                    tkVar.e = obtainStyledAttributes2.getString(index2);
                                                    break;
                                                } else {
                                                    tkVar.e = rz.a[obtainStyledAttributes2.getInteger(index2, 0)];
                                                    break;
                                                }
                                            case 4:
                                                tkVar.g = obtainStyledAttributes2.getInt(index2, 0);
                                                break;
                                            case 5:
                                                tkVar.c = a(obtainStyledAttributes2, index2, tkVar.c);
                                                break;
                                            case 6:
                                                tkVar.d = obtainStyledAttributes2.getInteger(index2, tkVar.d);
                                                break;
                                            case 7:
                                                tkVar.h = obtainStyledAttributes2.getFloat(index2, tkVar.h);
                                                break;
                                            case 8:
                                                tkVar.l = obtainStyledAttributes2.getInteger(index2, tkVar.l);
                                                break;
                                            case 9:
                                                tkVar.k = obtainStyledAttributes2.getFloat(index2, tkVar.k);
                                                break;
                                            case 10:
                                                TypedValue peekValue = obtainStyledAttributes2.peekValue(index2);
                                                if (peekValue.type != 1) {
                                                    if (peekValue.type == 3) {
                                                        tkVar.m = obtainStyledAttributes2.getString(index2);
                                                        if (tkVar.m.indexOf("/") > 0) {
                                                            tkVar.n = obtainStyledAttributes2.getResourceId(index2, -1);
                                                        }
                                                    } else {
                                                        obtainStyledAttributes2.getInteger(index2, tkVar.n);
                                                    }
                                                    break;
                                                } else {
                                                    tkVar.n = obtainStyledAttributes2.getResourceId(index2, -1);
                                                }
                                        }
                                    }
                                    obtainStyledAttributes2.recycle();
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    tiVar = m(context, Xml.asAttributeSet(xmlPullParser), true);
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (tiVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    tl tlVar = tiVar.b;
                                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tr.g);
                                    tlVar.a = true;
                                    int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                    for (int i6 = 0; i6 < indexCount3; i6++) {
                                        int index3 = obtainStyledAttributes3.getIndex(i6);
                                        if (index3 == 1) {
                                            tlVar.d = obtainStyledAttributes3.getFloat(1, tlVar.d);
                                        } else if (index3 == 0) {
                                            int i7 = obtainStyledAttributes3.getInt(0, tlVar.b);
                                            tlVar.b = i7;
                                            tlVar.b = a[i7];
                                        } else {
                                            if (index3 == 4) {
                                                tlVar.c = obtainStyledAttributes3.getInt(4, tlVar.c);
                                            } else if (index3 == 3) {
                                                tlVar.e = obtainStyledAttributes3.getFloat(3, tlVar.e);
                                            }
                                        }
                                    }
                                    obtainStyledAttributes3.recycle();
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (tiVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    tm tmVar = tiVar.e;
                                    TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tr.i);
                                    tmVar.b = true;
                                    int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                    for (int i8 = 0; i8 < indexCount4; i8++) {
                                        int index4 = obtainStyledAttributes4.getIndex(i8);
                                        switch (tm.a.get(index4)) {
                                            case 1:
                                                tmVar.c = obtainStyledAttributes4.getFloat(index4, tmVar.c);
                                                break;
                                            case 2:
                                                tmVar.d = obtainStyledAttributes4.getFloat(index4, tmVar.d);
                                                break;
                                            case 3:
                                                tmVar.e = obtainStyledAttributes4.getFloat(index4, tmVar.e);
                                                break;
                                            case 4:
                                                tmVar.f = obtainStyledAttributes4.getFloat(index4, tmVar.f);
                                                break;
                                            case 5:
                                                tmVar.g = obtainStyledAttributes4.getFloat(index4, tmVar.g);
                                                break;
                                            case 6:
                                                tmVar.h = obtainStyledAttributes4.getDimension(index4, tmVar.h);
                                                break;
                                            case 7:
                                                tmVar.i = obtainStyledAttributes4.getDimension(index4, tmVar.i);
                                                break;
                                            case 8:
                                                tmVar.k = obtainStyledAttributes4.getDimension(index4, tmVar.k);
                                                break;
                                            case 9:
                                                tmVar.l = obtainStyledAttributes4.getDimension(index4, tmVar.l);
                                                break;
                                            case 10:
                                                tmVar.m = obtainStyledAttributes4.getDimension(index4, tmVar.m);
                                                break;
                                            case 11:
                                                tmVar.n = true;
                                                tmVar.o = obtainStyledAttributes4.getDimension(index4, tmVar.o);
                                                break;
                                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                                tmVar.j = a(obtainStyledAttributes4, index4, tmVar.j);
                                                break;
                                        }
                                    }
                                    obtainStyledAttributes4.recycle();
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    tiVar = m(context, Xml.asAttributeSet(xmlPullParser), false);
                                    tj tjVar2 = tiVar.d;
                                    tjVar2.b = true;
                                    tjVar2.c = true;
                                    break;
                                }
                                break;
                            case 366511058:
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    tiVar = m(context, Xml.asAttributeSet(xmlPullParser), false);
                                    tiVar.d.aj = 1;
                                    break;
                                }
                                break;
                            case 1791837707:
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    tiVar = m(context, Xml.asAttributeSet(xmlPullParser), false);
                                    break;
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                break;
                            case -190376483:
                                break;
                            case 426575017:
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    return;
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void j(ConstraintLayout constraintLayout) {
        String str;
        HashSet hashSet;
        HashMap hashMap;
        int i;
        char c2;
        HashMap hashMap2;
        String str2;
        int i2;
        int i3;
        int i4;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = this.b;
        HashSet hashSet2 = new HashSet(hashMap3.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap3.containsKey(valueOf)) {
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(str)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap hashMap4 = this.b;
                    if (hashMap4.containsKey(valueOf)) {
                        hashSet2.remove(valueOf);
                        ti tiVar = (ti) hashMap4.get(valueOf);
                        if (tiVar != null) {
                            if (childAt instanceof Barrier) {
                                tj tjVar = tiVar.d;
                                tjVar.aj = 1;
                                c2 = 0;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = tjVar.ah;
                                barrier.b(tjVar.ai);
                                barrier.b.b = tjVar.ap;
                                int[] iArr = tjVar.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str3 = tjVar.al;
                                    if (str3 != null) {
                                        tjVar.ak = l(barrier, str3);
                                        barrier.j(tjVar.ak);
                                    }
                                }
                            } else {
                                c2 = 0;
                            }
                            td tdVar = (td) childAt.getLayoutParams();
                            tdVar.a();
                            tiVar.a(tdVar);
                            HashMap hashMap5 = tiVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap5.keySet()) {
                                ta taVar = (ta) hashMap5.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (taVar.a) {
                                    hashMap2 = hashMap3;
                                    str2 = str4;
                                } else {
                                    hashMap2 = hashMap3;
                                    str2 = "set".concat(String.valueOf(str4));
                                }
                                try {
                                    i3 = taVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        Class<?>[] clsArr = new Class[1];
                                        clsArr[c2] = Integer.TYPE;
                                        Method method = cls.getMethod(str2, clsArr);
                                        Integer valueOf2 = Integer.valueOf(taVar.c);
                                        Object[] objArr = new Object[1];
                                        objArr[c2] = valueOf2;
                                        method.invoke(childAt, objArr);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        Class<?>[] clsArr2 = new Class[1];
                                        clsArr2[c2] = Float.TYPE;
                                        Method method2 = cls.getMethod(str2, clsArr2);
                                        Float valueOf3 = Float.valueOf(taVar.d);
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c2] = valueOf3;
                                        method2.invoke(childAt, objArr2);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        Class<?>[] clsArr3 = new Class[1];
                                        clsArr3[c2] = Integer.TYPE;
                                        Method method3 = cls.getMethod(str2, clsArr3);
                                        Integer valueOf4 = Integer.valueOf(taVar.g);
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c2] = valueOf4;
                                        method3.invoke(childAt, objArr3);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Class<?>[] clsArr4 = new Class[1];
                                        clsArr4[c2] = Drawable.class;
                                        Method method4 = cls.getMethod(str2, clsArr4);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(taVar.g);
                                        Object[] objArr4 = new Object[1];
                                        objArr4[c2] = colorDrawable;
                                        method4.invoke(childAt, objArr4);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        Class<?>[] clsArr5 = new Class[1];
                                        clsArr5[c2] = CharSequence.class;
                                        Method method5 = cls.getMethod(str2, clsArr5);
                                        String str5 = taVar.e;
                                        Object[] objArr5 = new Object[1];
                                        objArr5[c2] = str5;
                                        method5.invoke(childAt, objArr5);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        Class<?>[] clsArr6 = new Class[1];
                                        clsArr6[c2] = Boolean.TYPE;
                                        Method method6 = cls.getMethod(str2, clsArr6);
                                        Boolean valueOf5 = Boolean.valueOf(taVar.f);
                                        Object[] objArr6 = new Object[1];
                                        objArr6[c2] = valueOf5;
                                        method6.invoke(childAt, objArr6);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        Class<?>[] clsArr7 = new Class[1];
                                        clsArr7[c2] = Float.TYPE;
                                        Method method7 = cls.getMethod(str2, clsArr7);
                                        Float valueOf6 = Float.valueOf(taVar.d);
                                        Object[] objArr7 = new Object[1];
                                        objArr7[c2] = valueOf6;
                                        method7.invoke(childAt, objArr7);
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            Class<?>[] clsArr8 = new Class[1];
                                            clsArr8[c2] = Integer.TYPE;
                                            Method method8 = cls.getMethod(str2, clsArr8);
                                            Integer valueOf7 = Integer.valueOf(taVar.c);
                                            Object[] objArr8 = new Object[1];
                                            objArr8[c2] = valueOf7;
                                            method8.invoke(childAt, objArr8);
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            hashMap3 = hashMap2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                            hashSet2 = hashSet3;
                                            hashMap3 = hashMap2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            hashMap3 = hashMap2;
                                            i5 = i2;
                                        }
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        i5 = i2;
                                    default:
                                        hashSet2 = hashSet3;
                                        hashMap3 = hashMap2;
                                        break;
                                }
                            }
                            hashSet = hashSet2;
                            hashMap = hashMap3;
                            i = i5;
                            childAt.setLayoutParams(tdVar);
                            tl tlVar = tiVar.b;
                            if (tlVar.c == 0) {
                                childAt.setVisibility(tlVar.b);
                            }
                            childAt.setAlpha(tlVar.d);
                            tm tmVar = tiVar.e;
                            childAt.setRotation(tmVar.c);
                            childAt.setRotationX(tmVar.d);
                            childAt.setRotationY(tmVar.e);
                            childAt.setScaleX(tmVar.f);
                            childAt.setScaleY(tmVar.g);
                            if (tmVar.j != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(tmVar.j);
                                if (findViewById != null) {
                                    int top = findViewById.getTop() + findViewById.getBottom();
                                    int left = findViewById.getLeft() + findViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(tmVar.h)) {
                                    childAt.setPivotX(tmVar.h);
                                }
                                if (!Float.isNaN(tmVar.i)) {
                                    childAt.setPivotY(tmVar.i);
                                }
                            }
                            childAt.setTranslationX(tmVar.k);
                            childAt.setTranslationY(tmVar.l);
                            childAt.setTranslationZ(tmVar.m);
                            if (tmVar.n) {
                                childAt.setElevation(tmVar.o);
                            }
                            i5 = i + 1;
                            hashSet2 = hashSet;
                            hashMap3 = hashMap;
                        }
                    }
                }
            }
            hashSet = hashSet2;
            hashMap = hashMap3;
            i = i5;
            i5 = i + 1;
            hashSet2 = hashSet;
            hashMap3 = hashMap;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ti tiVar2 = (ti) this.b.get(num);
            if (tiVar2 != null) {
                tj tjVar2 = tiVar2.d;
                if (tjVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = tjVar2.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str6 = tjVar2.al;
                        if (str6 != null) {
                            tjVar2.ak = l(barrier2, str6);
                            barrier2.j(tjVar2.ak);
                        }
                    }
                    barrier2.a = tjVar2.ah;
                    barrier2.b(tjVar2.ai);
                    td tdVar2 = new td();
                    barrier2.k();
                    tiVar2.a(tdVar2);
                    constraintLayout.addView(barrier2, tdVar2);
                }
                if (tjVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    td tdVar3 = new td();
                    tiVar2.a(tdVar3);
                    constraintLayout.addView(guideline, tdVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof tb) {
                ((tb) childAt2).g(constraintLayout);
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4) {
        tj tjVar;
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new ti());
        }
        ti tiVar = (ti) hashMap.get(valueOf);
        if (tiVar == null) {
            return;
        }
        if (i2 == 3) {
            if (i4 == 3) {
                tjVar = tiVar.d;
                tjVar.n = i3;
                tjVar.o = -1;
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                tjVar = tiVar.d;
                tjVar.o = i3;
                tjVar.n = -1;
            }
            tjVar.r = -1;
            tjVar.s = -1;
            tjVar.t = -1;
            tiVar.d.J = 0;
            return;
        }
        if (i2 == 4) {
            if (i4 == 4) {
                tj tjVar2 = tiVar.d;
                tjVar2.q = i3;
                tjVar2.p = -1;
                tjVar2.r = -1;
                tjVar2.s = -1;
                tjVar2.t = -1;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                tj tjVar3 = tiVar.d;
                tjVar3.p = i3;
                tjVar3.q = -1;
                tjVar3.r = -1;
                tjVar3.s = -1;
                tjVar3.t = -1;
            }
            tiVar.d.K = 0;
            return;
        }
        if (i2 == 5) {
            if (i4 == 5) {
                tj tjVar4 = tiVar.d;
                tjVar4.r = i3;
                tjVar4.q = -1;
                tjVar4.p = -1;
                tjVar4.n = -1;
                tjVar4.o = -1;
                return;
            }
            if (i4 == 3) {
                tj tjVar5 = tiVar.d;
                tjVar5.s = i3;
                tjVar5.q = -1;
                tjVar5.p = -1;
                tjVar5.n = -1;
                tjVar5.o = -1;
                return;
            }
            if (i4 != 4) {
                throw new IllegalArgumentException("right to " + n(i4) + " undefined");
            }
            tj tjVar6 = tiVar.d;
            tjVar6.t = i3;
            tjVar6.q = -1;
            tjVar6.p = -1;
            tjVar6.n = -1;
            tjVar6.o = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                tj tjVar7 = tiVar.d;
                tjVar7.x = i3;
                tjVar7.w = -1;
            } else {
                if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                tj tjVar8 = tiVar.d;
                tjVar8.w = i3;
                tjVar8.x = -1;
            }
            tiVar.d.L = 0;
            return;
        }
        if (i4 == 6) {
            tj tjVar9 = tiVar.d;
            tjVar9.v = i3;
            tjVar9.u = -1;
        } else {
            if (i4 != 7) {
                throw new IllegalArgumentException("right to " + n(i4) + " undefined");
            }
            tj tjVar10 = tiVar.d;
            tjVar10.u = i3;
            tjVar10.v = -1;
        }
        tiVar.d.M = 0;
    }
}
