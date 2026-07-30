package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mo {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final Object[] e = new Object[0];
    public static final kx0 f = new kx0(new hx0());
    public static final k70 g = new k70(false);
    public static final db0 h = new db0();
    public static final byte[] i = {48, 49, 53, 0};
    public static final byte[] j = {48, 49, 48, 0};
    public static final byte[] k = {48, 48, 57, 0};
    public static final byte[] l = {48, 48, 53, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 49, 0};
    public static final byte[] o = {48, 48, 50, 0};
    public static final Object p = new Object();
    public static final tc1 q = new tc1(1);
    public static final vx r;
    public static final vx[] s;

    static {
        vx vxVar = new vx();
        r = vxVar;
        s = new vx[]{vxVar};
    }

    public static m20 A(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            E(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), w01.b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                E(xmlResourceParser);
            }
            List B = B(resources, resourceId);
            return new p20(new f20(string, string2, string3, B), string4 != null ? new f20(string, string2, string4, B) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), w01.c);
                    int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = obtainAttributes2.getInt(i3, 0);
                    int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                    obtainAttributes2.getString(i5);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        E(xmlResourceParser);
                    }
                    arrayList.add(new o20(i2, z, string6, i4, resourceId2));
                } else {
                    E(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n20((o20[]) arrayList.toArray(new o20[0]));
    }

    public static List B(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final h71 C(hl hlVar) {
        Object[] objArr = new Object[0];
        boolean d2 = hlVar.d(0);
        Object L = hlVar.L();
        if (d2 || L == bl.a) {
            L = new dd(18);
            hlVar.h0(L);
        }
        return (h71) y90.z(objArr, h71.j, (Function0) L, hlVar, 0);
    }

    public static final Object D(o10 o10Var, int i2, Function1 function1) {
        int i3;
        int i4;
        Object obj;
        zl0 zl0Var;
        je0 D0;
        int size;
        int i5;
        l7 l7Var;
        if (!o10Var.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var2 = o10Var.d.i;
        jd0 I = op.I(o10Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (I == null) {
                zl0Var = null;
                break;
            }
            if ((((zl0) I.J.g).h & 1024) != 0) {
                while (zl0Var2 != null) {
                    if ((zl0Var2.g & 1024) != 0) {
                        zl0Var = zl0Var2;
                        eo0 eo0Var = null;
                        while (zl0Var != null) {
                            if (zl0Var instanceof o10) {
                                break loop0;
                            }
                            if ((zl0Var.g & 1024) != 0 && (zl0Var instanceof zq)) {
                                int i6 = 0;
                                for (zl0 zl0Var3 = ((zq) zl0Var).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                    if ((zl0Var3.g & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            zl0Var = zl0Var3;
                                        } else {
                                            if (eo0Var == null) {
                                                eo0Var = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var != null) {
                                                eo0Var.b(zl0Var);
                                                zl0Var = null;
                                            }
                                            eo0Var.b(zl0Var3);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            zl0Var = op.o(eo0Var);
                        }
                    }
                    zl0Var2 = zl0Var2.i;
                }
            }
            I = I.s();
            zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
        o10 o10Var2 = (o10) zl0Var;
        if ((o10Var2 == null || !Intrinsics.a(o10Var2.D0(), o10Var.D0())) && (D0 = o10Var.D0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                dd0.j("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (D0.s.a.g().n <= 0 || D0.s.a.g().k.isEmpty() || !D0.r) {
                return function1.invoke(je0.v);
            }
            boolean A0 = D0.A0(i7);
            jf0 jf0Var = D0.s;
            int min = A0 ? Math.min(jf0Var.a.g().n - 1, ((sf0) CollectionsKt.s(jf0Var.a.g().k)).a) : Math.max(0, ((xu0) jf0Var.a.e.b).h());
            z11 z11Var = new z11();
            ee eeVar = D0.t;
            eeVar.getClass();
            fe0 fe0Var = new fe0(min, min);
            eeVar.a.b(fe0Var);
            z11Var.d = fe0Var;
            wf0 wf0Var = D0.s.a;
            if (wf0Var.g().k.isEmpty()) {
                i4 = 0;
            } else {
                rf0 g2 = wf0Var.g();
                int g3 = (int) (g2.o == et0.d ? g2.g() & 4294967295L : g2.g() >> 32);
                rf0 g4 = wf0Var.g();
                List list = g4.k;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size2; i9++) {
                        i8 += ((sf0) list.get(i9)).k;
                    }
                    size = (i8 / list.size()) + g4.q;
                }
                if (size != 0 && (i5 = g3 / size) >= 1) {
                    i4 = i5;
                }
            }
            int i10 = i4 * 2;
            int i11 = D0.s.a.g().n;
            if (i10 > i11) {
                i10 = i11;
            }
            while (obj == null && D0.z0((fe0) z11Var.d, i7) && i3 < i10) {
                fe0 fe0Var2 = (fe0) z11Var.d;
                int i12 = fe0Var2.a;
                int i13 = fe0Var2.b;
                if (D0.A0(i7)) {
                    i13++;
                } else {
                    i12--;
                }
                ee eeVar2 = D0.t;
                eeVar2.getClass();
                fe0 fe0Var3 = new fe0(i12, i13);
                eeVar2.a.b(fe0Var3);
                D0.t.a.j((fe0) z11Var.d);
                z11Var.d = fe0Var3;
                i3++;
                op.I(D0).k();
                obj = function1.invoke(new ie0(D0, z11Var, i7));
            }
            D0.t.a.j((fe0) z11Var.d);
            op.I(D0).k();
            return obj;
        }
        return null;
    }

    public static void E(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final Object[] F(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = e;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] G(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final long H(long j2, nu nuVar) {
        nu nuVar2 = nu.NANOSECONDS;
        TimeUnit timeUnit = nuVar.d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j2 || j2 > convert) {
            nu nuVar3 = nu.NANOSECONDS;
            return m(b11.d(TimeUnit.MILLISECONDS.convert(j2, timeUnit)));
        }
        long convert2 = timeUnit2.convert(j2, timeUnit) << 1;
        ju juVar = ku.d;
        int i2 = mu.a;
        return convert2;
    }

    public static String I(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + la0.X(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + la0.X(Float.intBitsToFloat(i2)) + ", " + la0.X(Float.intBitsToFloat(i3)) + ')';
    }

    public static am0 J(am0 am0Var, h71 h71Var) {
        et0 et0Var = et0.d;
        return am0Var.c(h(xl0.a, p60.c)).c(new i71(null, null, h71Var.d, et0Var, h71Var, true, true)).c(new x71(h71Var));
    }

    public static q7 a(float f2, int i2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new q7(p4.o, Float.valueOf(0.0f), new r7(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static ej b() {
        ej ejVar = new ej(true);
        ejVar.U(null);
        return ejVar;
    }

    public static final void c(final mu0 mu0Var, final String str, final am0 am0Var, kd kdVar, final ym ymVar, float f2, hl hlVar, final int i2) {
        int i3;
        final kd kdVar2;
        final float f3;
        hlVar.Y(1142754848);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? hlVar.f(mu0Var) : hlVar.h(mu0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.f(am0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= hlVar.f(ymVar) ? 16384 : 8192;
        }
        int i5 = i4 | 1769472;
        if (hlVar.O(i5 & 1, (599187 & i5) != 599186)) {
            kdVar2 = j50.k;
            am0 am0Var2 = xl0.a;
            j41 j41Var = bl.a;
            if (str != null) {
                hlVar.W(1899222916);
                boolean z = (i5 & 112) == 32;
                Object L = hlVar.L();
                if (z || L == j41Var) {
                    L = new l(5, str);
                    hlVar.h0(L);
                }
                am0Var2 = i81.a(am0Var2, false, (Function1) L);
                hlVar.p(false);
            } else {
                hlVar.W(1899381698);
                hlVar.p(false);
            }
            f3 = 1.0f;
            am0 R = p4.R(v(am0Var.c(am0Var2), 0.0f, null, 520191), mu0Var, ymVar, 1.0f);
            Object L2 = hlVar.L();
            if (L2 == j41Var) {
                L2 = ud.e;
                hlVar.h0(L2);
            }
            vk0 vk0Var = (vk0) L2;
            int hashCode = Long.hashCode(hlVar.T);
            am0 N = p4.N(hlVar, R);
            kw0 l2 = hlVar.l();
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, vk0Var, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            hlVar.p(true);
        } else {
            hlVar.R();
            kdVar2 = kdVar;
            f3 = f2;
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: c70
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mo.c(mu0.this, str, am0Var, kdVar2, ymVar, f3, (hl) obj, gb0.P(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface d(c31 c31Var, Context context) {
        Typeface c2;
        int i2 = e31.a;
        Typeface typeface = null;
        if (!context.isRestricted()) {
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            resources.getValue(com.feathherdashh.dashgame.R.font.brlnsdb, typedValue, true);
            CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(com.feathherdashh.dashgame.R.font.brlnsdb) + "\" (" + Integer.toHexString(com.feathherdashh.dashgame.R.font.brlnsdb) + ") is not a Font: " + typedValue);
            }
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                Typeface typeface2 = (Typeface) wj1.b.a(wj1.d(resources, charSequence2, typedValue.assetCookie));
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            m20 A = A(resources.getXml(com.feathherdashh.dashgame.R.font.brlnsdb), resources);
                            if (A == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                            } else {
                                c2 = wj1.b(context, A, resources, charSequence2, typedValue.assetCookie, null);
                            }
                        } else {
                            c2 = wj1.c(resources, charSequence2, typedValue.assetCookie);
                        }
                        typeface = c2;
                    } catch (IOException e2) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                    } catch (XmlPullParserException e3) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
                    }
                }
                if (typeface == null) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(com.feathherdashh.dashgame.R.font.brlnsdb) + " could not be retrieved.");
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        }
        typeface.getClass();
        return typeface;
    }

    public static final am0 e(am0 am0Var, float f2) {
        return f2 == 1.0f ? am0Var : v(am0Var, f2, null, 520187);
    }

    public static am0 f(am0 am0Var, mh0 mh0Var) {
        return am0Var.c(new uc(0L, mh0Var, m90.m, 1));
    }

    public static final am0 g(am0 am0Var, long j2, u91 u91Var) {
        return am0Var.c(new uc(j2, null, u91Var, 2));
    }

    public static final am0 h(am0 am0Var, u91 u91Var) {
        return v(am0Var, 0.0f, u91Var, 518143);
    }

    public static final int i(long j2, long j3) {
        boolean x = x(j2);
        if (x != x(j3)) {
            return x ? -1 : 1;
        }
        return (Math.min(s(j2), s(j3)) >= 0.0f && w(j2) != w(j3)) ? w(j2) ? -1 : 1 : (int) Math.signum(s(j2) - s(j3));
    }

    public static q7 j(q7 q7Var, float f2) {
        float f3 = ((r7) q7Var.g).a;
        return new q7(q7Var.d, Float.valueOf(f2), new r7(f3), q7Var.h, q7Var.i, q7Var.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(ul ulVar, m01 m01Var) {
        if (!((zl0) ulVar).d.r) {
            o80.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        kw0 kw0Var = (kw0) op.I(ulVar).F;
        kw0Var.getClass();
        return m90.I(kw0Var, m01Var);
    }

    public static final Object l(long j2, fn fnVar) {
        if (j2 <= 0) {
            return Unit.a;
        }
        tf tfVar = new tf(1, qa0.b(fnVar));
        tfVar.w();
        if (j2 < Long.MAX_VALUE) {
            r(tfVar.i).c(j2, tfVar);
        }
        Object u = tfVar.u();
        return u == tn.d ? u : Unit.a;
    }

    public static final long m(long j2) {
        long j3 = (j2 << 1) + 1;
        ju juVar = ku.d;
        int i2 = mu.a;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r2.e(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005b, B:20:0x006f, B:22:0x0077, B:32:0x0046, B:35:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [fg] */
    /* JADX WARN: Type inference failed for: r8v6, types: [fg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0089 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(d00 d00Var, jz0 jz0Var, boolean z, fn fnVar) {
        e00 e00Var;
        int i2;
        ve veVar;
        jz0 jz0Var2;
        ve veVar2;
        d00 d00Var2;
        try {
            if (fnVar instanceof e00) {
                e00Var = (e00) fnVar;
                int i3 = e00Var.m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e00Var.m = i3 - Integer.MIN_VALUE;
                    Object obj = e00Var.l;
                    tn tnVar = tn.d;
                    i2 = e00Var.m;
                    CancellationException cancellationException = null;
                    if (i2 != 0) {
                        ca0.v(obj);
                        if (d00Var instanceof ji1) {
                            throw ((ji1) d00Var).d;
                        }
                        we weVar = jz0Var.j;
                        weVar.getClass();
                        veVar = new ve(weVar);
                        jz0Var = jz0Var;
                        e00Var.h = d00Var;
                        e00Var.i = jz0Var;
                        e00Var.j = veVar;
                        e00Var.k = z;
                        e00Var.m = 1;
                        obj = veVar.b(e00Var);
                        if (obj != tnVar) {
                        }
                    } else if (i2 == 1) {
                        z = e00Var.k;
                        veVar2 = e00Var.j;
                        ?? r8 = e00Var.i;
                        d00Var2 = e00Var.h;
                        ca0.v(obj);
                        jz0Var2 = r8;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = e00Var.k;
                        veVar2 = e00Var.j;
                        ?? r82 = e00Var.i;
                        d00Var2 = e00Var.h;
                        ca0.v(obj);
                        jz0 jz0Var3 = r82;
                        d00 d00Var3 = d00Var2;
                        veVar = veVar2;
                        d00Var = d00Var3;
                        jz0Var = jz0Var3;
                        e00Var.h = d00Var;
                        e00Var.i = jz0Var;
                        e00Var.j = veVar;
                        e00Var.k = z;
                        e00Var.m = 1;
                        obj = veVar.b(e00Var);
                        if (obj != tnVar) {
                            return tnVar;
                        }
                        ve veVar3 = veVar;
                        d00Var2 = d00Var;
                        veVar2 = veVar3;
                        jz0Var2 = jz0Var;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                jz0Var2.a(null);
                            }
                            return Unit.a;
                        }
                        Object c2 = veVar2.c();
                        e00Var.h = d00Var2;
                        e00Var.i = jz0Var2;
                        e00Var.j = veVar2;
                        e00Var.k = z;
                        e00Var.m = 2;
                        jz0Var3 = jz0Var2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        e00Var = new e00(fnVar);
        Object obj2 = e00Var.l;
        tn tnVar2 = tn.d;
        i2 = e00Var.m;
        CancellationException cancellationException2 = null;
    }

    public static final boolean o(long j2, long j3) {
        return j2 == j3;
    }

    public static nf p(int i2) {
        d30 d30Var = d30.k;
        float M = la0.M((i2 >> 16) & 255);
        float M2 = la0.M((i2 >> 8) & 255);
        float M3 = la0.M(i2 & 255);
        double[][] dArr = la0.l;
        double d2 = M;
        double[] dArr2 = dArr[0];
        double d3 = M2;
        double d4 = M3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = la0.i;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = d30Var.g;
        float f10 = d30Var.e;
        float f11 = d30Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = d30Var.h;
        float pow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f12) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f16 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f17 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * d30Var.c) / f11, d30Var.j * f10)) * 100.0f;
        float pow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * d30Var.f) * d30Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, d30Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f23 = d30Var.i * pow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new nf(f21, pow5, pow4, f24, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static nf q(float f2, float f3, float f4) {
        float f5 = d30.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(f2 / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f5 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new nf(f4, f3, f2, f6, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static final xq r(CoroutineContext coroutineContext) {
        CoroutineContext.Element d2 = coroutineContext.d(d.f);
        xq xqVar = d2 instanceof xq ? (xq) d2 : null;
        return xqVar == null ? vp.a : xqVar;
    }

    public static final float s(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final mh t(z8 z8Var) {
        mh mhVar;
        CoroutineContext coroutineContext;
        synchronized (q) {
            mhVar = (mh) z8Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (mhVar == null) {
                try {
                    nq nqVar = ls.a;
                    coroutineContext = pj0.a.j;
                } catch (IllegalStateException unused) {
                    coroutineContext = g.d;
                } catch (zp0 unused2) {
                    coroutineContext = g.d;
                }
                mh mhVar2 = new mh(coroutineContext.i(ca0.c()));
                z8Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", mhVar2);
                mhVar = mhVar2;
            }
        }
        return mhVar;
    }

    public static final am0 u(am0 am0Var, float f2, float f3, long j2, u91 u91Var, boolean z, long j3, long j4) {
        return am0Var.c(new m50(f2, f3, j2, u91Var, z, j3, j4));
    }

    public static am0 v(am0 am0Var, float f2, u91 u91Var, int i2) {
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        long j2 = aj1.a;
        if ((i2 & 2048) != 0) {
            u91Var = m90.m;
        }
        long j3 = o50.a;
        return u(am0Var, f3, 0.0f, j2, u91Var, true, j3, j3);
    }

    public static final boolean w(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean x(long j2) {
        return (j2 & 1) != 0;
    }

    public static final am0 y(jf0 jf0Var, ee eeVar, et0 et0Var) {
        return new ge0(jf0Var, eeVar, et0Var);
    }

    public static final am0 z(wo0 wo0Var) {
        return new xo0(wo0Var);
    }
}
