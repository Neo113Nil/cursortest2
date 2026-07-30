package t6;

import a0.b1;
import a2.d0;
import a2.j0;
import a2.k0;
import a2.u;
import a2.v;
import a2.w;
import a2.x;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import b2.c0;
import b2.e0;
import com.android.installreferrer.R;
import com.chicken.road.whale.store.Meal;
import d0.h2;
import d0.k3;
import d0.q0;
import d0.s3;
import d2.d;
import f1.f;
import f2.q;
import g0.d1;
import g0.g1;
import g0.g2;
import g0.k1;
import g0.m1;
import g0.m2;
import g0.p1;
import g0.t0;
import g0.y;
import g4.z;
import h2.c;
import h6.g;
import h6.h;
import h6.i;
import h6.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.encoding.Decoder;
import l2.e;
import l2.l;
import l2.m;
import l2.n;
import l2.o;
import l2.p;
import m.f0;
import p1.i0;
import p1.s0;
import q.h0;
import r1.z0;
import r6.k;
import s1.f1;
import s1.q1;
import t3.b0;
import t3.g0;
import t5.s;
import t7.b;
import u3.r;
import z0.l0;
import z0.o0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f8927a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8928b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Method f8929c;

    public static HashMap A(o5.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(aVar.millis()));
        return hashMap;
    }

    public static g B(g gVar, h hVar) {
        k.f(hVar, "key");
        if (k.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final float C(Layout layout, int i7, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        c0 c0Var = e0.f1279a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment == null ? -1 : d.f2568a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float D(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        c0 c0Var = e0.f1279a;
        if (layout.getEllipsisCount(i7) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i7) != -1 || layout.getWidth() >= layout.getLineRight(i7)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment != null ? d.f2568a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final int E(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static List F(Object obj) {
        List singletonList = Collections.singletonList(obj);
        k.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static i G(g gVar, h hVar) {
        k.f(hVar, "key");
        return k.a(gVar.getKey(), hVar) ? j.f4661f : gVar;
    }

    public static long H(String str, int i7) {
        int w4 = w(str, 0, i7, false);
        Matcher matcher = s7.i.f8592m.matcher(str);
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (w4 < i7) {
            int w5 = w(str, w4 + 1, i7, true);
            matcher.region(w4, w5);
            if (i9 == -1 && matcher.usePattern(s7.i.f8592m).matches()) {
                String group = matcher.group(1);
                k.e(group, "matcher.group(1)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                k.e(group2, "matcher.group(2)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                k.e(group3, "matcher.group(3)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(s7.i.f8591l).matches()) {
                String group4 = matcher.group(1);
                k.e(group4, "matcher.group(1)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = s7.i.f8590k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        k.e(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        k.e(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        k.e(pattern2, "MONTH_PATTERN.pattern()");
                        i11 = z6.h.E(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i8 == -1 && matcher.usePattern(s7.i.f8589j).matches()) {
                    String group6 = matcher.group(1);
                    k.e(group6, "matcher.group(1)");
                    i8 = Integer.parseInt(group6);
                }
            }
            w4 = w(str, w5 + 1, i7, false);
        }
        if (70 <= i8 && i8 < 100) {
            i8 += 1900;
        }
        if (i8 >= 0 && i8 < 70) {
            i8 += 2000;
        }
        if (i8 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i10 || i10 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f8936e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i8);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i10);
        gregorianCalendar.set(11, i9);
        gregorianCalendar.set(12, i12);
        gregorianCalendar.set(13, i13);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static i I(g gVar, i iVar) {
        k.f(iVar, "context");
        return iVar == j.f4661f ? gVar : (i) iVar.D(gVar, h6.b.f4656i);
    }

    public static final k0 J(k0 k0Var, m2.k kVar) {
        q qVar;
        l2.a aVar;
        m mVar;
        long j8;
        d0 d0Var = k0Var.f412a;
        m mVar2 = a2.e0.f370d;
        m mVar3 = d0Var.f347a;
        long j9 = d0Var.f354h;
        if (mVar3.equals(l.f5882a)) {
            mVar3 = a2.e0.f370d;
        }
        m mVar4 = mVar3;
        long j10 = d0Var.f348b;
        if (r4.a.L(j10)) {
            j10 = a2.e0.f367a;
        }
        f2.k kVar2 = d0Var.f349c;
        if (kVar2 == null) {
            kVar2 = f2.k.f3278h;
        }
        f2.k kVar3 = kVar2;
        f2.i iVar = d0Var.f350d;
        f2.i iVar2 = new f2.i(iVar != null ? iVar.f3275a : 0);
        f2.j jVar = d0Var.f351e;
        f2.j jVar2 = new f2.j(jVar != null ? jVar.f3276a : 1);
        q qVar2 = d0Var.f352f;
        if (qVar2 == null) {
            qVar2 = q.f3283a;
        }
        String str = d0Var.f353g;
        if (str == null) {
            str = "";
        }
        if (r4.a.L(j9)) {
            j9 = a2.e0.f368b;
        }
        long j11 = j9;
        l2.a aVar2 = d0Var.f355i;
        l2.a aVar3 = new l2.a(aVar2 != null ? aVar2.f5860a : 0.0f);
        n nVar = d0Var.f356j;
        if (nVar == null) {
            nVar = n.f5883c;
        }
        n nVar2 = nVar;
        h2.b bVar = d0Var.f357k;
        if (bVar == null) {
            h2.b bVar2 = h2.b.f4643h;
            b1.b bVar3 = c.f4646a;
            bVar3.getClass();
            LocaleList localeList = LocaleList.getDefault();
            synchronized (((m4.f) bVar3.f1232i)) {
                qVar = qVar2;
                try {
                    h2.b bVar4 = (h2.b) bVar3.f1231h;
                    if (bVar4 == null || localeList != ((LocaleList) bVar3.f1230g)) {
                        int size = localeList.size();
                        aVar = aVar3;
                        ArrayList arrayList = new ArrayList(size);
                        mVar = mVar4;
                        int i7 = 0;
                        while (i7 < size) {
                            arrayList.add(new h2.a(localeList.get(i7)));
                            i7++;
                            size = size;
                            j10 = j10;
                        }
                        j8 = j10;
                        h2.b bVar5 = new h2.b(arrayList);
                        bVar3.f1230g = localeList;
                        bVar3.f1231h = bVar5;
                        bVar = bVar5;
                    } else {
                        mVar = mVar4;
                        j8 = j10;
                        bVar = bVar4;
                        aVar = aVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            qVar = qVar2;
            aVar = aVar3;
            mVar = mVar4;
            j8 = j10;
        }
        long j12 = d0Var.f358l;
        if (j12 == 16) {
            j12 = a2.e0.f369c;
        }
        l2.j jVar3 = d0Var.f359m;
        if (jVar3 == null) {
            jVar3 = l2.j.f5877b;
        }
        o0 o0Var = d0Var.f360n;
        if (o0Var == null) {
            o0Var = o0.f10030d;
        }
        x xVar = d0Var.f361o;
        b1.f fVar = d0Var.f362p;
        if (fVar == null) {
            fVar = b1.h.f1238a;
        }
        o0 o0Var2 = o0Var;
        d0 d0Var2 = new d0(mVar, j8, kVar3, iVar2, jVar2, qVar, str, j11, aVar, nVar2, bVar, j12, jVar3, o0Var2, xVar, fVar);
        u uVar = k0Var.f413b;
        int i8 = v.f460b;
        int i9 = uVar.f450a;
        long j13 = uVar.f452c;
        int i10 = 5;
        if (i9 == Integer.MIN_VALUE) {
            i9 = 5;
        }
        int i11 = uVar.f451b;
        if (i11 == 3) {
            int ordinal = kVar.ordinal();
            if (ordinal == 0) {
                i10 = 4;
            } else if (ordinal != 1) {
                throw new b4.c();
            }
        } else if (i11 == Integer.MIN_VALUE) {
            int ordinal2 = kVar.ordinal();
            if (ordinal2 == 0) {
                i10 = 1;
            } else {
                if (ordinal2 != 1) {
                    throw new b4.c();
                }
                i10 = 2;
            }
        } else {
            i10 = i11;
        }
        if (r4.a.L(j13)) {
            j13 = v.f459a;
        }
        long j14 = j13;
        o oVar = uVar.f453d;
        if (oVar == null) {
            oVar = o.f5886c;
        }
        w wVar = uVar.f454e;
        l2.g gVar = uVar.f455f;
        int i12 = uVar.f456g;
        if (i12 == 0) {
            i12 = e.f5865b;
        }
        int i13 = i12;
        int i14 = uVar.f457h;
        int i15 = i14 == Integer.MIN_VALUE ? 1 : i14;
        p pVar = uVar.f458i;
        if (pVar == null) {
            pVar = p.f5889c;
        }
        return new k0(d0Var2, new u(i9, i10, j14, oVar, wVar, gVar, i13, i15, pVar), k0Var.f414c);
    }

    public static Object K(Object obj, androidx.room.c cVar, HashMap hashMap) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (map.containsKey(".sv")) {
            Object obj2 = map.get(".sv");
            Object obj3 = null;
            obj3 = null;
            obj3 = null;
            obj3 = null;
            obj3 = null;
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if ("timestamp".equals(str) && hashMap.containsKey(str)) {
                    obj3 = hashMap.get(str);
                }
            } else if (obj2 instanceof Map) {
                Map map2 = (Map) obj2;
                if (map2.containsKey("increment")) {
                    Object obj4 = map2.get("increment");
                    if (obj4 instanceof Number) {
                        Number number = (Number) obj4;
                        l.v vVar = (l.v) cVar.f1069g;
                        l5.f fVar = (l5.f) cVar.f1070h;
                        ArrayList arrayList = new ArrayList();
                        o5.e eVar = (o5.e) vVar.f5681b;
                        l5.f fVar2 = l5.f.f6023i;
                        s sVar = null;
                        l5.f fVar3 = fVar;
                        do {
                            t5.c z8 = fVar3.z();
                            fVar3 = fVar3.C();
                            fVar2 = fVar2.m(z8);
                            l5.f B = l5.f.B(fVar2, fVar);
                            eVar = z8 != null ? eVar.w(z8) : o5.e.f6845i;
                            l5.m mVar = (l5.m) eVar.f6846f;
                            if (mVar != null) {
                                sVar = mVar.c(B);
                            }
                            if (fVar3.isEmpty()) {
                                break;
                            }
                        } while (sVar == null);
                        s a3 = ((l5.x) vVar.f5682c).a(fVar, sVar, arrayList, true);
                        obj3 = number;
                        if (a3.i()) {
                            obj3 = number;
                            if (a3.getValue() instanceof Number) {
                                Number number2 = (Number) a3.getValue();
                                if (!(number instanceof Double) && !(number instanceof Float) && !(number2 instanceof Double) && !(number2 instanceof Float)) {
                                    long longValue = number.longValue();
                                    long longValue2 = number2.longValue();
                                    long j8 = longValue + longValue2;
                                    if (((longValue ^ j8) & (longValue2 ^ j8)) >= 0) {
                                        obj3 = Long.valueOf(j8);
                                    }
                                }
                                obj3 = Double.valueOf(number2.doubleValue() + number.doubleValue());
                            }
                        }
                    }
                }
            }
            if (obj3 != null) {
                return obj3;
            }
        }
        return obj;
    }

    public static l5.b L(l5.b bVar, l.v vVar, l5.f fVar, HashMap hashMap) {
        l5.b bVar2 = l5.b.f6006g;
        Iterator it = bVar.f6007f.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bVar2 = bVar2.a((l5.f) entry.getKey(), M((s) entry.getValue(), new androidx.room.c(vVar, 21, fVar.g((l5.f) entry.getKey())), hashMap));
        }
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r3 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s M(s sVar, androidx.room.c cVar, HashMap hashMap) {
        Object value = sVar.c().getValue();
        Object K = K(value, cVar.u(t5.c.e(".priority")), hashMap);
        boolean z8 = false;
        if (sVar.i()) {
            Object K2 = K(sVar.getValue(), cVar, hashMap);
            if (K2.equals(sVar.getValue())) {
                if (K == value) {
                    z8 = true;
                } else if (K != null && value != null) {
                    z8 = K.equals(value);
                }
            }
            return a8.m.d(K2, j1.c.j0(K));
        }
        if (!sVar.isEmpty()) {
            t5.f fVar = (t5.f) sVar;
            l1.x xVar = new l1.x(4, false);
            xVar.f5847g = fVar;
            fVar.g(new l5.l(cVar, hashMap, xVar), false);
            return !((s) xVar.f5847g).c().equals(K) ? ((s) xVar.f5847g).n(j1.c.j0(K)) : (s) xVar.f5847g;
        }
        return sVar;
    }

    public static final float N(long j8, float f9, m2.b bVar) {
        float c4;
        long b9 = m2.m.b(j8);
        if (m2.n.a(b9, 4294967296L)) {
            if (bVar.m() <= 1.05d) {
                return bVar.X(j8);
            }
            c4 = m2.m.c(j8) / m2.m.c(bVar.g0(f9));
        } else {
            if (!m2.n.a(b9, 8589934592L)) {
                return Float.NaN;
            }
            c4 = m2.m.c(j8);
        }
        return c4 * f9;
    }

    public static int O(float f9) {
        if (Float.isNaN(f9)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f9);
    }

    public static long P(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }

    public static final void Q(Spannable spannable, long j8, int i7, int i8) {
        if (j8 != 16) {
            spannable.setSpan(new ForegroundColorSpan(l0.w(j8)), i7, i8, 33);
        }
    }

    public static final void R(Spannable spannable, long j8, m2.b bVar, int i7, int i8) {
        long b9 = m2.m.b(j8);
        if (m2.n.a(b9, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(O(bVar.X(j8)), false), i7, i8, 33);
        } else if (m2.n.a(b9, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(m2.m.c(j8)), i7, i8, 33);
        }
    }

    public static final long S(long j8, long j9) {
        int c4;
        int e9 = j0.e(j8);
        int d8 = j0.d(j8);
        if (j0.e(j9) >= j0.d(j8) || j0.e(j8) >= j0.d(j9)) {
            if (d8 > j0.e(j9)) {
                e9 -= j0.c(j9);
                c4 = j0.c(j9);
                d8 -= c4;
            }
        } else if (j0.e(j9) > j0.e(j8) || j0.d(j8) > j0.d(j9)) {
            if (j0.e(j8) > j0.e(j9) || j0.d(j9) > j0.d(j8)) {
                int e10 = j0.e(j9);
                if (e9 >= j0.d(j9) || e10 > e9) {
                    d8 = j0.e(j9);
                } else {
                    e9 = j0.e(j9);
                    c4 = j0.c(j9);
                }
            } else {
                c4 = j0.c(j9);
            }
            d8 -= c4;
        } else {
            e9 = j0.e(j9);
            d8 = e9;
        }
        return r4.a.h(e9, d8);
    }

    public static final y0.d T(p1.p pVar) {
        y0.d e9 = s0.e(pVar);
        long e10 = pVar.e(r.a(e9.f9780a, e9.f9781b));
        long e11 = pVar.e(r.a(e9.f9782c, e9.f9783d));
        return new y0.d(y0.c.d(e10), y0.c.e(e10), y0.c.d(e11), y0.c.e(e11));
    }

    public static final void a(int i7, g0.p pVar) {
        g0.p pVar2;
        pVar.S(2100781441);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
            pVar2 = pVar;
        } else {
            int i8 = 0;
            Context context = (Context) pVar.k(AndroidCompositionLocals_androidKt.f739b);
            Object[] copyOf = Arrays.copyOf(new g0[0], 0);
            s1.l0 l0Var = new s1.l0(6, context);
            androidx.room.c cVar = p0.m.f7013a;
            androidx.room.c cVar2 = new androidx.room.c(u3.s.f9015g, 28, l0Var);
            boolean h3 = pVar.h(context);
            Object G = pVar.G();
            if (h3 || G == g0.l.f3784a) {
                G = new z0(8, context);
                pVar.a0(G);
            }
            s3.a(null, null, ((q0) pVar.k(d0.s0.f2378a)).f2313n, 0L, 0.0f, 0.0f, o0.f.b(-1759586724, new g4.e(i8, (b0) a.a.E(copyOf, cVar2, (q6.a) G, pVar, 0, 4)), pVar), pVar, 12582912, 123);
            pVar2 = pVar;
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new c7.q(i7, 3);
        }
    }

    public static m2.c b() {
        return new m2.c(1.0f, 1.0f);
    }

    public static final void c(u3.p pVar, g0.p pVar2, int i7) {
        pVar2.S(294589392);
        int i8 = i7 | (pVar2.f(pVar) ? 4 : 2);
        if ((i8 & 3) == 2 && pVar2.x()) {
            pVar2.L();
        } else {
            p0.g W = a8.d.W(pVar2);
            g0.z0 v5 = g0.d.v(pVar.b().f8815e, pVar2);
            List list = (List) v5.getValue();
            boolean booleanValue = ((Boolean) pVar2.k(q1.f8357a)).booleanValue();
            boolean f9 = pVar2.f(list);
            Object G = pVar2.G();
            Object obj = g0.l.f3784a;
            Object obj2 = G;
            if (f9 || G == obj) {
                q0.q qVar = new q0.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    t3.h hVar = (t3.h) obj3;
                    if (booleanValue || hVar.f8798m.f1046d.compareTo(androidx.lifecycle.o.f1010i) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                qVar.addAll(arrayList);
                pVar2.a0(qVar);
                obj2 = qVar;
            }
            q0.q qVar2 = (q0.q) obj2;
            h(qVar2, (List) v5.getValue(), pVar2, 0);
            g0.z0 v8 = g0.d.v(pVar.b().f8816f, pVar2);
            Object G2 = pVar2.G();
            if (G2 == obj) {
                G2 = new q0.q();
                pVar2.a0(G2);
            }
            q0.q qVar3 = (q0.q) G2;
            pVar2.Q(1361037007);
            ListIterator listIterator = qVar2.listIterator();
            while (true) {
                f6.a aVar = (f6.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                t3.h hVar2 = (t3.h) aVar.next();
                t3.v vVar = hVar2.f8792g;
                k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                u3.o oVar = (u3.o) vVar;
                boolean h3 = ((i8 & 14) == 4) | pVar2.h(hVar2);
                Object G3 = pVar2.G();
                if (h3 || G3 == obj) {
                    G3 = new b1(pVar, 11, hVar2);
                    pVar2.a0(G3);
                }
                a8.m.a((q6.a) G3, oVar.f9013o, o0.f.b(1129586364, new u3.k(hVar2, pVar, W, qVar3, oVar), pVar2), pVar2, 384);
            }
            pVar2.p(false);
            Set set = (Set) v8.getValue();
            boolean f10 = pVar2.f(v8) | ((i8 & 14) == 4);
            Object G4 = pVar2.G();
            if (f10 || G4 == obj) {
                G4 = new u3.l(v8, pVar, qVar3, null);
                pVar2.a0(G4);
            }
            g0.d.f(set, qVar3, (q6.e) G4, pVar2);
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 18, pVar);
        }
    }

    public static final void d(e1.b bVar, s0.o oVar, s0.c cVar, i0 i0Var, float f9, g0.p pVar, int i7) {
        float f10;
        pVar.S(1142754848);
        int i8 = (pVar.h(bVar) ? 4 : 2) | i7;
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(oVar) ? 256 : 128;
        }
        if (((i8 | 1772544) & 599187) == 599186 && pVar.x()) {
            pVar.L();
            f10 = f9;
        } else {
            cVar = s0.b.f8082j;
            pVar.Q(1040398089);
            pVar.p(false);
            s0.o d8 = androidx.compose.ui.draw.a.d(v0.d.e(oVar.j(s0.l.f8103a)), bVar, i0Var, 1.0f, null, 2);
            int i9 = pVar.P;
            s0.o c4 = s0.a.c(pVar, d8);
            k1 m8 = pVar.m();
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, m.e0.f6139a, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            g0.d.Q(pVar, c4, r1.i.f7782c);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !k.a(pVar.G(), Integer.valueOf(i9))) {
                a0.m.q(i9, pVar, i9, hVar);
            }
            pVar.p(true);
            f10 = 1.0f;
        }
        s0.c cVar2 = cVar;
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new f0(bVar, oVar, cVar2, i0Var, f10, i7);
        }
    }

    public static final void e(Object obj, int i7, s.v vVar, o0.a aVar, g0.p pVar, int i8) {
        int i9;
        pVar.S(-2079116560);
        if ((i8 & 6) == 0) {
            i9 = (pVar.h(obj) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= pVar.d(i7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= pVar.h(vVar) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= pVar.h(aVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            boolean f9 = pVar.f(obj) | pVar.f(vVar);
            Object G = pVar.G();
            Object obj2 = g0.l.f3784a;
            if (f9 || G == obj2) {
                G = new s.u(obj, vVar);
                pVar.a0(G);
            }
            s.u uVar = (s.u) G;
            d1 d1Var = uVar.f8063c;
            g1 g1Var = uVar.f8065e;
            g1 g1Var2 = uVar.f8066f;
            d1Var.f(i7);
            m1 m1Var = p1.l0.f7058a;
            s.u uVar2 = (s.u) pVar.k(m1Var);
            q0.g c4 = q0.r.c();
            q6.c f10 = c4 != null ? c4.f() : null;
            q0.g d8 = q0.r.d(c4);
            try {
                if (uVar2 != ((s.u) g1Var2.getValue())) {
                    g1Var2.setValue(uVar2);
                    if (uVar.f8064d.e() > 0) {
                        s.u uVar3 = (s.u) g1Var.getValue();
                        if (uVar3 != null) {
                            uVar3.b();
                        }
                        if (uVar2 != null) {
                            uVar2.a();
                        } else {
                            uVar2 = null;
                        }
                        g1Var.setValue(uVar2);
                    }
                }
                q0.r.f(c4, d8, f10);
                boolean f11 = pVar.f(uVar);
                Object G2 = pVar.G();
                if (f11 || G2 == obj2) {
                    G2 = new c1.a(29, uVar);
                    pVar.a0(G2);
                }
                g0.d.d(uVar, (q6.c) G2, pVar);
                g0.d.a(m1Var.a(uVar), aVar, pVar, ((i9 >> 6) & 112) | 8);
            } catch (Throwable th) {
                q0.r.f(c4, d8, f10);
                throw th;
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new s.q(obj, i7, vVar, aVar, i8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x023e, code lost:
    
        if (r38.g(false) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025d, code lost:
    
        if (r38.g(true) == false) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0260  */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(int i7, int i8, g0.p pVar, o.k kVar, q.h hVar, h0 h0Var, q6.c cVar, r.s sVar, s0.e eVar, s0.o oVar, boolean z8) {
        int i9;
        boolean z9;
        boolean z10;
        boolean f9;
        Object jVar;
        int i10;
        int i11;
        ?? r32;
        boolean z11;
        boolean z12;
        Object G;
        pVar.S(620764179);
        if ((i7 & 6) == 0) {
            i9 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= pVar.f(sVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= pVar.f(h0Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= pVar.g(false) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= pVar.g(true) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= pVar.f(kVar) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= pVar.g(z8) ? 1048576 : 524288;
        }
        int i12 = i9 | 12582912;
        if ((i7 & 100663296) == 0) {
            i12 |= pVar.f(eVar) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i12 |= pVar.f(hVar) ? 536870912 : 268435456;
        }
        int i13 = i8 | 54;
        if ((i8 & 384) == 0) {
            i13 |= pVar.h(cVar) ? 256 : 128;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            int i15 = (i12 >> 3) & 14;
            int i16 = ((i14 >> 3) & 112) | i15;
            g0.z0 M = g0.d.M(cVar, pVar);
            boolean z13 = (((i16 & 14) ^ 6) > 4 && pVar.f(sVar)) || (i16 & 6) == 4;
            Object G2 = pVar.G();
            t0 t0Var = g0.l.f3784a;
            if (z13 || G2 == t0Var) {
                r.b bVar = new r.b();
                bVar.f7593a = g0.d.I(Integer.MAX_VALUE);
                bVar.f7594b = g0.d.I(Integer.MAX_VALUE);
                t0 t0Var2 = t0.f3901i;
                c0.o oVar2 = new c0.o(M, 1);
                b1.b bVar2 = g2.f3733a;
                G2 = new h2(new g0.e0(new m.h(new g0.e0(oVar2, t0Var2), sVar, bVar, 2), t0Var2), m2.class, "value", "getValue()Ljava/lang/Object;", 0, 2);
                pVar.a0(G2);
            }
            x6.c cVar2 = (x6.c) G2;
            int i17 = i15 | ((i12 >> 9) & 112);
            boolean z14 = ((((i17 & 112) ^ 48) > 32 && pVar.g(true)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) > 4 && pVar.f(sVar)) || (i17 & 6) == 4);
            Object G3 = pVar.G();
            if (z14 || G3 == t0Var) {
                G3 = new r.c(sVar);
                pVar.a0(G3);
            }
            r.c cVar3 = (r.c) G3;
            Object G4 = pVar.G();
            if (G4 == t0Var) {
                y yVar = new y(g0.d.y(pVar));
                pVar.a0(yVar);
                G4 = yVar;
            }
            h7.c cVar4 = ((y) G4).f3972f;
            z0.c0 c0Var = (z0.c0) pVar.k(f1.f8216e);
            boolean z15 = !((Boolean) pVar.k(f1.f8231t)).booleanValue();
            int i18 = i12 & 7168;
            int i19 = i12 >> 6;
            int i20 = i14 << 21;
            int i21 = (i12 & 65520) | (i19 & 458752) | (i19 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i12 & 1879048192);
            int i22 = i12;
            boolean z16 = ((((i21 & 112) ^ 48) > 32 && pVar.f(sVar)) || (i21 & 48) == 32) | ((((i21 & 896) ^ 384) > 256 && pVar.f(h0Var)) || (i21 & 384) == 256);
            if (((i21 & 7168) ^ 3072) <= 2048) {
            }
            if ((i21 & 3072) != 2048) {
                z9 = false;
                boolean z17 = z16 | z9;
                if (((i21 & 57344) ^ 24576) <= 16384) {
                }
                if ((i21 & 24576) != 16384) {
                    z10 = false;
                    f9 = z17 | z10 | ((((i21 & 3670016) ^ 1572864) <= 1048576 && pVar.f(eVar)) || (i21 & 1572864) == 1048576) | (((i21 & 29360128) ^ 12582912) <= 8388608 && pVar.f(null)) | (((i21 & 234881024) ^ 100663296) <= 67108864 && pVar.f(null)) | ((((i21 & 1879048192) ^ 805306368) <= 536870912 && pVar.f(hVar)) || (i21 & 805306368) == 536870912) | pVar.f(c0Var) | pVar.g(z15);
                    Object G5 = pVar.G();
                    if (!f9 || G5 == t0Var) {
                        i10 = 32;
                        i11 = 2048;
                        r32 = 0;
                        z11 = true;
                        jVar = new r.j(sVar, h0Var, cVar2, hVar, z15, cVar4, c0Var, eVar);
                        pVar.a0(jVar);
                    } else {
                        jVar = G5;
                        i10 = 32;
                        i11 = 2048;
                        r32 = 0;
                        z11 = true;
                    }
                    q6.e eVar2 = (q6.e) jVar;
                    s0.o j8 = oVar.j(sVar.f7684k).j(sVar.f7685l);
                    o.j0 j0Var = o.j0.f6657f;
                    s0.o a3 = androidx.compose.foundation.lazy.layout.c.a(j8, cVar2, cVar3, j0Var, z8);
                    int i23 = i15 | ((i22 >> 18) & 112);
                    z12 = ((((i23 & 112) ^ 48) > i10 || !pVar.d(r32)) ? r32 : z11) | (((((i23 & 14) ^ 6) > 4 || !pVar.f(sVar)) && (i23 & 6) != 4) ? r32 : z11);
                    G = pVar.G();
                    if (!z12 || G == t0Var) {
                        G = new r.d(sVar);
                        pVar.a0(G);
                    }
                    r.d dVar = (r.d) G;
                    l1.i iVar = sVar.f7687n;
                    m2.k kVar2 = (m2.k) pVar.k(f1.f8223l);
                    int i24 = 512 | i18 | (i22 & 3670016);
                    if (z8) {
                        pVar.Q(-1890632411);
                        boolean f10 = pVar.f(dVar) | pVar.f(iVar) | (((((i24 & 7168) ^ 3072) <= i11 || !pVar.g(false)) && (i24 & 3072) != i11) ? false : z11) | pVar.f(kVar2) | pVar.f(j0Var);
                        Object G6 = pVar.G();
                        if (f10 || G6 == t0Var) {
                            G6 = new s.k(dVar, iVar, kVar2, j0Var);
                            pVar.a0(G6);
                        }
                        a3 = a3.j((s.k) G6);
                        pVar.p(false);
                    } else {
                        pVar.Q(-1890658823);
                        pVar.p(r32);
                    }
                    r4.a.f(cVar2, a8.d.X(a3.j(sVar.f7686m.f659i), sVar, j0Var, z8, kVar, sVar.f7679f, pVar), sVar.f7688o, eVar2, pVar, 0);
                }
                z10 = true;
                f9 = z17 | z10 | ((((i21 & 3670016) ^ 1572864) <= 1048576 && pVar.f(eVar)) || (i21 & 1572864) == 1048576) | (((i21 & 29360128) ^ 12582912) <= 8388608 && pVar.f(null)) | (((i21 & 234881024) ^ 100663296) <= 67108864 && pVar.f(null)) | ((((i21 & 1879048192) ^ 805306368) <= 536870912 && pVar.f(hVar)) || (i21 & 805306368) == 536870912) | pVar.f(c0Var) | pVar.g(z15);
                Object G52 = pVar.G();
                if (f9) {
                }
                i10 = 32;
                i11 = 2048;
                r32 = 0;
                z11 = true;
                jVar = new r.j(sVar, h0Var, cVar2, hVar, z15, cVar4, c0Var, eVar);
                pVar.a0(jVar);
                q6.e eVar22 = (q6.e) jVar;
                s0.o j82 = oVar.j(sVar.f7684k).j(sVar.f7685l);
                o.j0 j0Var2 = o.j0.f6657f;
                s0.o a32 = androidx.compose.foundation.lazy.layout.c.a(j82, cVar2, cVar3, j0Var2, z8);
                int i232 = i15 | ((i22 >> 18) & 112);
                if (((i232 & 14) ^ 6) > 4) {
                }
                z12 = ((((i232 & 112) ^ 48) > i10 || !pVar.d(r32)) ? r32 : z11) | (((((i232 & 14) ^ 6) > 4 || !pVar.f(sVar)) && (i232 & 6) != 4) ? r32 : z11);
                G = pVar.G();
                if (!z12) {
                }
                G = new r.d(sVar);
                pVar.a0(G);
                r.d dVar2 = (r.d) G;
                l1.i iVar2 = sVar.f7687n;
                m2.k kVar22 = (m2.k) pVar.k(f1.f8223l);
                int i242 = 512 | i18 | (i22 & 3670016);
                if (z8) {
                }
                r4.a.f(cVar2, a8.d.X(a32.j(sVar.f7686m.f659i), sVar, j0Var2, z8, kVar, sVar.f7679f, pVar), sVar.f7688o, eVar22, pVar, 0);
            }
            z9 = true;
            boolean z172 = z16 | z9;
            if (((i21 & 57344) ^ 24576) <= 16384) {
            }
            if ((i21 & 24576) != 16384) {
            }
            z10 = true;
            f9 = z172 | z10 | ((((i21 & 3670016) ^ 1572864) <= 1048576 && pVar.f(eVar)) || (i21 & 1572864) == 1048576) | (((i21 & 29360128) ^ 12582912) <= 8388608 && pVar.f(null)) | (((i21 & 234881024) ^ 100663296) <= 67108864 && pVar.f(null)) | ((((i21 & 1879048192) ^ 805306368) <= 536870912 && pVar.f(hVar)) || (i21 & 805306368) == 536870912) | pVar.f(c0Var) | pVar.g(z15);
            Object G522 = pVar.G();
            if (f9) {
            }
            i10 = 32;
            i11 = 2048;
            r32 = 0;
            z11 = true;
            jVar = new r.j(sVar, h0Var, cVar2, hVar, z15, cVar4, c0Var, eVar);
            pVar.a0(jVar);
            q6.e eVar222 = (q6.e) jVar;
            s0.o j822 = oVar.j(sVar.f7684k).j(sVar.f7685l);
            o.j0 j0Var22 = o.j0.f6657f;
            s0.o a322 = androidx.compose.foundation.lazy.layout.c.a(j822, cVar2, cVar3, j0Var22, z8);
            int i2322 = i15 | ((i22 >> 18) & 112);
            if (((i2322 & 14) ^ 6) > 4) {
            }
            z12 = ((((i2322 & 112) ^ 48) > i10 || !pVar.d(r32)) ? r32 : z11) | (((((i2322 & 14) ^ 6) > 4 || !pVar.f(sVar)) && (i2322 & 6) != 4) ? r32 : z11);
            G = pVar.G();
            if (!z12) {
            }
            G = new r.d(sVar);
            pVar.a0(G);
            r.d dVar22 = (r.d) G;
            l1.i iVar22 = sVar.f7687n;
            m2.k kVar222 = (m2.k) pVar.k(f1.f8223l);
            int i2422 = 512 | i18 | (i22 & 3670016);
            if (z8) {
            }
            r4.a.f(cVar2, a8.d.X(a322.j(sVar.f7686m.f659i), sVar, j0Var22, z8, kVar, sVar.f7679f, pVar), sVar.f7688o, eVar222, pVar, 0);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new r.a(oVar, sVar, h0Var, kVar, z8, eVar, hVar, cVar, i7, i8);
        }
    }

    public static final void g(int i7, g0.p pVar) {
        final g0.z0 z0Var;
        pVar.S(-496539487);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
        } else {
            e4.a j8 = a.a.j(pVar);
            pVar.R(1729797275);
            c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 Q = a.a.Q(r6.w.a(g4.f1.class), a3, j8, a3 instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) a3).d() : q3.a.f7511b, pVar);
            pVar.p(false);
            final g4.f1 f1Var = (g4.f1) Q;
            g0.z0 P = j1.c.P(f1Var.f4290c, pVar);
            pVar.Q(133394406);
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (G == obj) {
                G = g0.d.J(null, t0.f3903k);
                pVar.a0(G);
            }
            g0.z0 z0Var2 = (g0.z0) G;
            pVar.p(false);
            k3.a(null, z.f4450b, null, null, null, 0, 0L, 0L, null, o0.f.b(25603440, new g4.d(P, 4, z0Var2), pVar), pVar, 805306416, 509);
            d6.j jVar = (d6.j) z0Var2.getValue();
            if (jVar != null) {
                final int intValue = ((Number) jVar.f2618f).intValue();
                final String str = (String) jVar.f2619g;
                List list = ((g4.b1) P.getValue()).f4255a;
                pVar.Q(267175678);
                boolean h3 = pVar.h(f1Var) | pVar.d(intValue) | pVar.f(str);
                Object G2 = pVar.G();
                if (h3 || G2 == obj) {
                    z0Var = z0Var2;
                    G2 = new q6.c() { // from class: g4.x0
                        @Override // q6.c
                        public final Object f(Object obj2) {
                            Meal meal = (Meal) obj2;
                            r6.k.f(meal, "it");
                            long id = meal.getId();
                            String str2 = str;
                            r6.k.f(str2, "slot");
                            f1 f1Var2 = f1.this;
                            c7.a0.p(androidx.lifecycle.q0.j(f1Var2), null, null, new c1(f1Var2, intValue, str2, id, null), 3);
                            z0Var.setValue(null);
                            return d6.z.f2639a;
                        }
                    };
                    pVar.a0(G2);
                } else {
                    z0Var = z0Var2;
                }
                q6.c cVar = (q6.c) G2;
                pVar.p(false);
                pVar.Q(267177910);
                boolean h8 = pVar.h(f1Var) | pVar.d(intValue) | pVar.f(str);
                Object G3 = pVar.G();
                if (h8 || G3 == obj) {
                    G3 = new q6.a() { // from class: g4.y0
                        @Override // q6.a
                        public final Object a() {
                            String str2 = str;
                            r6.k.f(str2, "slot");
                            f1 f1Var2 = f1.this;
                            c7.a0.p(androidx.lifecycle.q0.j(f1Var2), null, null, new d1(f1Var2, intValue, str2, null), 3);
                            z0Var.setValue(null);
                            return d6.z.f2639a;
                        }
                    };
                    pVar.a0(G3);
                }
                q6.a aVar = (q6.a) G3;
                pVar.p(false);
                pVar.Q(267179937);
                Object G4 = pVar.G();
                if (G4 == obj) {
                    G4 = new g4.b0(z0Var, 6);
                    pVar.a0(G4);
                }
                pVar.p(false);
                a8.d.f(list, cVar, aVar, (q6.a) G4, pVar, 3072);
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new c7.q(i7, 8);
        }
    }

    public static final void h(List list, Collection collection, g0.p pVar, int i7) {
        pVar.S(1537894851);
        if ((((pVar.h(list) ? 4 : 2) | i7 | (pVar.h(collection) ? 32 : 16)) & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            boolean booleanValue = ((Boolean) pVar.k(q1.f8357a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                t3.h hVar = (t3.h) it.next();
                androidx.lifecycle.x xVar = hVar.f8798m;
                boolean g9 = pVar.g(booleanValue) | pVar.h(list) | pVar.h(hVar);
                Object G = pVar.G();
                if (g9 || G == g0.l.f3784a) {
                    G = new u3.n(list, hVar, booleanValue);
                    pVar.a0(G);
                }
                g0.d.d(xVar, (q6.c) G, pVar);
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d0.b0(i7, 18, list, collection);
        }
    }

    public static final void i(boolean z8, q6.e eVar, g0.p pVar, int i7) {
        pVar.S(-642000585);
        if ((((pVar.g(z8) ? 4 : 2) | i7 | (pVar.f(eVar) ? 32 : 16)) & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            g0.z0 M = g0.d.M(eVar, pVar);
            pVar.R(-723524056);
            pVar.R(-3687241);
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (G == obj) {
                Object yVar = new y(g0.d.y(pVar));
                pVar.a0(yVar);
                G = yVar;
            }
            int i8 = 0;
            pVar.p(false);
            h7.c cVar = ((y) G).f3972f;
            pVar.p(false);
            pVar.R(-1071578902);
            Object G2 = pVar.G();
            Object obj2 = G2;
            if (G2 == obj) {
                q6.e eVar2 = (q6.e) M.getValue();
                c.e eVar3 = new c.e(z8);
                eVar3.f1424d = cVar;
                eVar3.f1425e = eVar2;
                pVar.a0(eVar3);
                obj2 = eVar3;
            }
            c.e eVar4 = (c.e) obj2;
            pVar.p(false);
            Object obj3 = (q6.e) M.getValue();
            pVar.R(-1071578713);
            boolean f9 = pVar.f(obj3) | pVar.f(cVar);
            Object G3 = pVar.G();
            if (f9 || G3 == obj) {
                eVar4.f1425e = (q6.e) M.getValue();
                eVar4.f1424d = cVar;
                pVar.a0(d6.z.f2639a);
            }
            pVar.p(false);
            Boolean valueOf = Boolean.valueOf(z8);
            pVar.R(-1071578541);
            boolean f10 = pVar.f(eVar4) | pVar.g(z8);
            Object G4 = pVar.G();
            Object obj4 = null;
            if (f10 || G4 == obj) {
                G4 = new c.f(eVar4, z8, null);
                pVar.a0(G4);
            }
            pVar.p(false);
            g0.d.e(pVar, valueOf, (q6.e) G4);
            g0.z zVar = c.c.f1421a;
            pVar.R(-2068013981);
            b.k0 k0Var = (b.k0) pVar.k(c.c.f1421a);
            pVar.R(1680121597);
            if (k0Var == null) {
                View view = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
                k.f(view, "<this>");
                k0Var = (b.k0) y6.h.n(y6.h.p(y6.h.o(view, b.l0.f1180i), b.l0.f1181j));
            }
            pVar.p(false);
            if (k0Var == null) {
                Context context = (Context) pVar.k(AndroidCompositionLocals_androidKt.f739b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof b.k0) {
                        obj4 = context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                k0Var = (b.k0) obj4;
            }
            pVar.p(false);
            if (k0Var == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object a3 = k0Var.a();
            Object obj5 = (androidx.lifecycle.v) pVar.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            pVar.R(-1071578150);
            boolean f11 = pVar.f(a3) | pVar.f(obj5) | pVar.f(eVar4);
            Object G5 = pVar.G();
            if (f11 || G5 == obj) {
                G5 = new c.h(a3, obj5, eVar4, i8);
                pVar.a0(G5);
            }
            pVar.p(false);
            g0.d.c(obj5, a3, (q6.c) G5, pVar);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new c.i(z8, eVar, i7);
        }
    }

    public static final long j(float f9, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public static final Object[] k(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        e6.k.Z(objArr, objArr2, 0, i7, 6);
        e6.k.X(objArr, objArr2, i7 + 2, i7, objArr.length);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] l(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[objArr.length - 2];
        e6.k.Z(objArr, objArr2, 0, i7, 6);
        e6.k.X(objArr, objArr2, i7, i7 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] m(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[objArr.length - 1];
        e6.k.Z(objArr, objArr2, 0, i7, 6);
        e6.k.X(objArr, objArr2, i7, i7 + 1, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int n(int i7, int i8, int i9, boolean z8) {
        if (i8 >= i9) {
            if (z8) {
                return 0;
            }
            return i9 - i8;
        }
        if (z8) {
            if (z8) {
                if (z8) {
                }
            } else if (z8) {
            }
        } else {
            if (z8 ? i9 - i8 <= i7 : i8 > i7) {
                if (z8) {
                    return i9 - i8;
                }
                return 0;
            }
            if (z8) {
                return i7 - i8;
            }
        }
        return i7;
    }

    public static final boolean o(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        k.f(bArr, "a");
        k.f(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final q7.k p(Decoder decoder) {
        k.f(decoder, "<this>");
        q7.k kVar = decoder instanceof q7.k ? (q7.k) decoder : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + r6.w.a(decoder.getClass()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(l1.c0 c0Var, j6.a aVar) {
        o.h0 h0Var;
        int i7;
        i6.a aVar2;
        int size;
        int i8;
        if (aVar instanceof o.h0) {
            h0Var = (o.h0) aVar;
            int i9 = h0Var.f6631h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                h0Var.f6631h = i9 - Integer.MIN_VALUE;
                Object obj = h0Var.f6630g;
                i7 = h0Var.f6631h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    ?? r72 = c0Var.f5784j.f5792w.f5812a;
                    int size2 = r72.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (((l1.v) r72.get(i10)).f5833d) {
                            h0Var.f6629f = c0Var;
                            h0Var.f6631h = 1;
                            obj = c0Var.b(l1.k.f5817h, h0Var);
                            aVar2 = i6.a.f4956f;
                            if (obj == aVar2) {
                            }
                            ?? r73 = ((l1.j) obj).f5812a;
                            size = r73.size();
                            i8 = 0;
                            while (i8 < size) {
                            }
                            return d6.z.f2639a;
                        }
                    }
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = h0Var.f6629f;
                d6.a.e(obj);
                ?? r732 = ((l1.j) obj).f5812a;
                size = r732.size();
                i8 = 0;
                while (i8 < size) {
                    if (((l1.v) r732.get(i8)).f5833d) {
                        h0Var.f6629f = c0Var;
                        h0Var.f6631h = 1;
                        obj = c0Var.b(l1.k.f5817h, h0Var);
                        aVar2 = i6.a.f4956f;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r7322 = ((l1.j) obj).f5812a;
                        size = r7322.size();
                        i8 = 0;
                        while (i8 < size) {
                        }
                    } else {
                        i8++;
                    }
                }
                return d6.z.f2639a;
            }
        }
        h0Var = new o.h0(aVar);
        Object obj2 = h0Var.f6630g;
        i7 = h0Var.f6631h;
        if (i7 != 0) {
        }
    }

    public static final Object r(l1.d0 d0Var, q6.e eVar, h6.d dVar) {
        Object A0 = d0Var.A0(new o.i0(dVar.getContext(), eVar, null), dVar);
        return A0 == i6.a.f4956f ? A0 : d6.z.f2639a;
    }

    public static f6.c s(f6.c cVar) {
        cVar.y();
        cVar.f3409h = true;
        return cVar.f3408g > 0 ? cVar : f6.c.f3406i;
    }

    public static final void t(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    public static final g0.z0 v(p.i iVar, g0.p pVar, int i7) {
        Object G = pVar.G();
        t0 t0Var = g0.l.f3784a;
        if (G == t0Var) {
            G = g0.d.J(Boolean.FALSE, t0.f3903k);
            pVar.a0(G);
        }
        g0.z0 z0Var = (g0.z0) G;
        boolean z8 = (((i7 & 14) ^ 6) > 4 && pVar.f(iVar)) || (i7 & 6) == 4;
        Object G2 = pVar.G();
        if (z8 || G2 == t0Var) {
            G2 = new a0.e0(iVar, z0Var, null, 21);
            pVar.a0(G2);
        }
        g0.d.e(pVar, iVar, (q6.e) G2);
        return z0Var;
    }

    public static int w(String str, int i7, int i8, boolean z8) {
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z8)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static boolean x(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i7 = b3.s.f1365a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = b3.r.f1361d;
        b3.r rVar = (b3.r) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (rVar == null) {
            rVar = new b3.r();
            rVar.f1362a = null;
            rVar.f1363b = null;
            rVar.f1364c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        WeakReference weakReference2 = rVar.f1364c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        rVar.f1364c = new WeakReference(keyEvent);
        if (rVar.f1363b == null) {
            rVar.f1363b = new SparseArray();
        }
        SparseArray sparseArray = rVar.f1363b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static t3.v y(t3.y yVar) {
        Iterator it = y6.h.o(yVar, t3.b.f8743n).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (t3.v) next;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static s7.w z(String str) {
        k.f(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return s7.w.f8703i;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return s7.w.f8702h;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return s7.w.f8701g;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return s7.w.f8704j;
            }
        } else if (str.equals("SSLv3")) {
            return s7.w.f8705k;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public abstract List u(List list, String str);
}
