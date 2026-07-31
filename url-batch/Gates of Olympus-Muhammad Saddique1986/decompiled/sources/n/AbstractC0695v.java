package n;

import B.C0000a;
import F.C0087c;
import F.C0105l;
import F.v1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0170q0;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.Q0;
import a0.C0239d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0281j;
import androidx.lifecycle.InterfaceC0292v;
import b0.AbstractC0347p;
import b0.C0338g;
import b0.C0348q;
import b0.C0352v;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import g0.AbstractC0437b;
import g0.C0436a;
import h0.AbstractC0454G;
import h0.AbstractC0459b;
import h0.C0453F;
import h0.C0456I;
import h0.C0457J;
import h0.C0461d;
import h0.C0462e;
import i0.AbstractC0516b;
import i0.C0515a;
import j.C0542p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import l2.InterfaceC0602c;
import m.C0637w;
import n2.AbstractC0730j;
import org.xmlpull.v1.XmlPullParserException;
import p.C0775m;
import q1.C0811a;
import q2.AbstractC0837y;
import q2.C0829p;
import r.AbstractC0856c;
import r.InterfaceC0849K;
import r.InterfaceC0862i;
import r0.AbstractC0898U;
import r1.AbstractC0931b;
import s.AbstractC0954w;
import s.C0933b;
import s.C0951t;
import s.C0953v;
import t.C0971A;
import t1.C1022b;
import t1.C1028h;
import t2.C1030A;
import u0.AbstractC1101g0;
import u1.C1141a;
import y0.C1231a;
import z.C1256t;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0695v {
    public static final void a(U.q qVar, C0951t c0951t, InterfaceC0849K interfaceC0849K, boolean z3, InterfaceC0862i interfaceC0862i, U.c cVar, C0775m c0775m, boolean z4, InterfaceC0424c interfaceC0424c, C0167p c0167p, int i3) {
        int i4;
        boolean z5;
        C0951t c0951t2;
        U.c cVar2;
        C0775m c0775m2;
        int i5;
        boolean z6;
        C0951t c0951t3;
        boolean z7;
        U.c cVar3;
        C0775m c0775m3;
        boolean z8;
        c0167p.S(-740714857);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(interfaceC0849K) ? 256 : 128;
        }
        int i6 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i6 |= c0167p.f(interfaceC0862i) ? 16384 : 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i3) == 0) {
            i7 = 720896 | i6;
        }
        int i8 = 12582912 | i7;
        if ((100663296 & i3) == 0) {
            i8 |= c0167p.h(interfaceC0424c) ? 67108864 : 33554432;
        }
        int i9 = i8;
        if ((38347923 & i9) == 38347922 && c0167p.x()) {
            c0167p.L();
            c0951t3 = c0951t;
            z7 = z3;
            cVar3 = cVar;
            c0775m3 = c0775m;
            z8 = z4;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                Object obj = C0159l.f2829a;
                float f3 = AbstractC0954w.f8341a;
                Object[] objArr = new Object[0];
                C1256t c1256t = C0951t.f8316w;
                boolean d3 = c0167p.d(0) | c0167p.d(0);
                Object G3 = c0167p.G();
                if (d3 || G3 == obj) {
                    G3 = new C0953v(0, 0);
                    c0167p.a0(G3);
                }
                z5 = false;
                C0951t c0951t4 = (C0951t) O2.d.c0(objArr, c1256t, (InterfaceC0422a) G3, c0167p, 0, 4);
                U.g gVar = U.b.f4473p;
                float f4 = l.O.f6467a;
                O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
                boolean c2 = c0167p.c(bVar.a());
                Object G4 = c0167p.G();
                if (c2 || G4 == obj) {
                    G4 = new C0637w(new B.Y(bVar));
                    c0167p.a0(G4);
                }
                C0637w c0637w = (C0637w) G4;
                boolean f5 = c0167p.f(c0637w);
                Object G5 = c0167p.G();
                if (f5 || G5 == obj) {
                    G5 = new C0775m(c0637w);
                    c0167p.a0(G5);
                }
                c0951t2 = c0951t4;
                cVar2 = gVar;
                c0775m2 = (C0775m) G5;
                i5 = i9 & (-3670129);
                z6 = true;
            } else {
                c0167p.L();
                i5 = i9 & (-3670129);
                c0951t2 = c0951t;
                z5 = z3;
                cVar2 = cVar;
                c0775m2 = c0775m;
                z6 = z4;
            }
            c0167p.q();
            T.c(qVar, c0951t2, interfaceC0849K, z5, c0775m2, z6, 0, cVar2, interfaceC0862i, null, null, interfaceC0424c, c0167p, (i5 & 14) | 24576 | (i5 & 896) | (i5 & 7168) | ((i5 >> 3) & 3670016) | ((i5 << 9) & 234881024) | ((i5 << 15) & 1879048192), (i5 >> 18) & 896);
            c0951t3 = c0951t2;
            z7 = z5;
            cVar3 = cVar2;
            c0775m3 = c0775m2;
            z8 = z6;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0933b(qVar, c0951t3, interfaceC0849K, z7, interfaceC0862i, cVar3, c0775m3, z8, interfaceC0424c, i3);
        }
    }

    public static final void b(InterfaceC0602c interfaceC0602c, U.q qVar, C0971A c0971a, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(2002163445);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(interfaceC0602c) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(c0971a) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            t0.a(Q.f.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(c0971a, qVar, interfaceC0426e, C0143d.N(interfaceC0602c, c0167p)), c0167p), c0167p, 6);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0105l(interfaceC0602c, qVar, c0971a, interfaceC0426e, i3, 4);
        }
    }

    public static final void c(C1028h c1028h, R.i iVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1579360880);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(c1028h) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(iVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            C0143d.b(new C0170q0[]{AbstractC0931b.f8201a.a(c1028h), p1.e.f7832a.a(c1028h), AndroidCompositionLocals_androidKt.f4941e.a(c1028h)}, Q.f.b(-52928304, new C0087c(iVar, 13, aVar), c0167p), c0167p, 56);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(c1028h, iVar, aVar, i3, 8);
        }
    }

    public static final void d(R.i iVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(1211832233);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(iVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.R(1729797275);
            androidx.lifecycle.b0 a3 = AbstractC0931b.a(c0167p);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.V s3 = r.s(f2.v.a(C1141a.class), a3, null, a3 instanceof InterfaceC0281j ? ((InterfaceC0281j) a3).a() : C0811a.f7847b, c0167p);
            c0167p.p(false);
            C1141a c1141a = (C1141a) s3;
            c1141a.f9582d = new WeakReference(iVar);
            iVar.e(c1141a.f9581c, aVar, c0167p, ((i4 << 6) & 896) | (i4 & 112));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 10, iVar, aVar);
        }
    }

    public static final boolean e(String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (f2.j.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0012, code lost:
    
        if (r5 == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int f(int i3, int i4, int i5, boolean z3) {
        if (i4 >= i5) {
            if (z3) {
                return 0;
            }
        } else if (z3) {
            if (z3) {
                if (!z3) {
                }
            } else if (!z3) {
            }
        } else if (z3 ? i5 - i4 <= i3 : i4 > i3) {
            if (!z3) {
                return 0;
            }
        }
        return i5 - i4;
    }

    public static final void g(long j3, p.P p3) {
        if (p3 == p.P.f7567d) {
            if (O0.a.g(j3) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (O0.a.h(j3) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static boolean h(s2.g gVar) {
        return gVar.k(null, false);
    }

    public static final InterfaceC0142c0 i(C1030A c1030a, C0167p c0167p) {
        InterfaceC0292v interfaceC0292v = (InterfaceC0292v) c0167p.k(p1.e.f7832a);
        EnumC0286o enumC0286o = EnumC0286o.f5229g;
        V1.j jVar = V1.j.f4558d;
        Object value = c1030a.getValue();
        C0294x e3 = interfaceC0292v.e();
        Object[] objArr = {c1030a, e3, enumC0286o, jVar};
        boolean h3 = c0167p.h(e3) | c0167p.f(enumC0286o) | c0167p.h(jVar) | c0167p.h(c1030a);
        Object G3 = c0167p.G();
        Object obj = C0159l.f2829a;
        if (h3 || G3 == obj) {
            Object cVar = new p1.c(e3, enumC0286o, jVar, c1030a, null);
            c0167p.a0(cVar);
            G3 = cVar;
        }
        InterfaceC0426e interfaceC0426e = (InterfaceC0426e) G3;
        Object G4 = c0167p.G();
        if (G4 == obj) {
            G4 = C0143d.K(value, I.W.f2783i);
            c0167p.a0(G4);
        }
        InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G4;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h4 = c0167p.h(interfaceC0426e);
        Object G5 = c0167p.G();
        if (h4 || G5 == obj) {
            G5 = new Q0(interfaceC0426e, interfaceC0142c0, null);
            c0167p.a0(G5);
        }
        InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) G5;
        V1.i h5 = c0167p.f2866b.h();
        boolean z3 = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z3 |= c0167p.f(obj2);
        }
        Object G6 = c0167p.G();
        if (z3 || G6 == obj) {
            c0167p.a0(new I.T(h5, interfaceC0426e2));
        }
        return interfaceC0142c0;
    }

    public static t1.u j(t1.x xVar) {
        Iterator it = m2.h.T(xVar, C1022b.f8864n).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (t1.u) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC0437b k(int i3, C0167p c0167p) {
        TypedValue typedValue;
        long j3;
        int i4;
        C0462e c0462e;
        int eventType;
        int i5;
        y0.c cVar;
        y0.b bVar;
        XmlResourceParser xmlResourceParser;
        C0462e c0462e2;
        Resources resources;
        char c2;
        int i6;
        TypedArray obtainStyledAttributes;
        int i7;
        TypedArray obtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        TypedArray obtainStyledAttributes3;
        ColorStateList colorStateList;
        int i11 = 1;
        Context context = (Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b);
        c0167p.k(AndroidCompositionLocals_androidKt.f4937a);
        Resources resources2 = context.getResources();
        y0.d dVar = (y0.d) c0167p.k(AndroidCompositionLocals_androidKt.f4940d);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f10383a.f(i3);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources2.getValue(i3, typedValue, true);
                C0542p c0542p = dVar.f10383a;
                int d3 = c0542p.d(i3);
                Object[] objArr = c0542p.f6304c;
                Object obj = objArr[d3];
                c0542p.f6303b[d3] = i3;
                objArr[d3] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC0730j.E(charSequence, ".xml")) {
            c0167p.Q(-802884675);
            boolean f3 = c0167p.f(context.getTheme()) | c0167p.f(charSequence) | c0167p.d(i3);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                try {
                    Drawable drawable = resources2.getDrawable(i3, null);
                    f2.j.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    G3 = new C0338g(((BitmapDrawable) drawable).getBitmap());
                    c0167p.a0(G3);
                } catch (Exception e3) {
                    throw new C1.c("Error attempting to load resource: " + ((Object) charSequence), e3);
                }
            }
            C0436a c0436a = new C0436a((C0338g) G3);
            c0167p.p(false);
            return c0436a;
        }
        c0167p.Q(-803040357);
        Resources.Theme theme = context.getTheme();
        int i12 = typedValue.changingConfigurations;
        y0.c cVar2 = (y0.c) c0167p.k(AndroidCompositionLocals_androidKt.f4939c);
        y0.b bVar2 = new y0.b(theme, i3);
        WeakReference weakReference = (WeakReference) cVar2.f10382a.get(bVar2);
        C1231a c1231a = weakReference != null ? (C1231a) weakReference.get() : null;
        if (c1231a == null) {
            XmlResourceParser xml = resources2.getXml(i3);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!f2.j.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            C0515a c0515a = new C0515a(xml);
            int[] iArr = AbstractC0516b.f6240a;
            TypedArray obtainAttributes = theme == null ? resources2.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            c0515a.c(obtainAttributes.getChangingConfigurations());
            boolean z3 = !W0.b.a(xml, "autoMirrored") ? false : obtainAttributes.getBoolean(5, false);
            c0515a.c(obtainAttributes.getChangingConfigurations());
            float b3 = c0515a.b(obtainAttributes, "viewportWidth", 7, 0.0f);
            float b4 = c0515a.b(obtainAttributes, "viewportHeight", 8, 0.0f);
            if (b3 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b4 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, 0.0f);
            c0515a.c(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, 0.0f);
            c0515a.c(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j3 = C0352v.f5439g;
                } else {
                    if (W0.b.a(xml, "tint")) {
                        TypedValue typedValue3 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue3);
                        int i13 = typedValue3.type;
                        if (i13 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i13 < 28 || i13 > 31) {
                            Resources resources3 = obtainAttributes.getResources();
                            int resourceId = obtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = W0.c.f4594a;
                            try {
                                colorStateList = W0.c.a(resources3, resources3.getXml(resourceId), theme);
                            } catch (Exception e4) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        c0515a.c(obtainAttributes.getChangingConfigurations());
                        j3 = colorStateList == null ? b0.M.c(colorStateList.getDefaultColor()) : C0352v.f5439g;
                    }
                    colorStateList = null;
                    c0515a.c(obtainAttributes.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j3 = C0352v.f5439g;
            }
            long j4 = j3;
            int i14 = obtainAttributes.getInt(6, -1);
            c0515a.c(obtainAttributes.getChangingConfigurations());
            if (i14 != -1) {
                if (i14 == 3) {
                    i4 = 3;
                } else if (i14 != 5) {
                    if (i14 != 9) {
                        switch (i14) {
                            case 14:
                                i4 = 13;
                                break;
                            case AbstractC0856c.f8041g /* 15 */:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f4 = dimension / resources2.getDisplayMetrics().density;
                float f5 = dimension2 / resources2.getDisplayMetrics().density;
                obtainAttributes.recycle();
                c0462e = new C0462e(null, f4, f5, b3, b4, j4, i4, z3, 1);
                int i15 = 0;
                for (int i16 = 3; xml.getEventType() != i11 && (xml.getDepth() >= i11 || xml.getEventType() != i16); i16 = 3) {
                    XmlResourceParser xmlResourceParser2 = c0515a.f6237a;
                    eventType = xmlResourceParser2.getEventType();
                    if (eventType == 2) {
                        if (eventType != i16) {
                            resources = resources2;
                            i5 = i12;
                            cVar = cVar2;
                            bVar = bVar2;
                            xmlResourceParser = xml;
                        } else if ("group".equals(xmlResourceParser2.getName())) {
                            i11 = 1;
                            int i17 = i15 + 1;
                            int i18 = 0;
                            while (i18 < i17) {
                                if (c0462e.f5948k) {
                                    z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                ArrayList arrayList = c0462e.f5946i;
                                C0461d c0461d = (C0461d) arrayList.remove(arrayList.size() - i11);
                                ((C0461d) arrayList.get(arrayList.size() - 1)).f5937j.add(new C0453F(c0461d.f5928a, c0461d.f5929b, c0461d.f5930c, c0461d.f5931d, c0461d.f5932e, c0461d.f5933f, c0461d.f5934g, c0461d.f5935h, c0461d.f5936i, c0461d.f5937j));
                                i18++;
                                i11 = 1;
                                i17 = i17;
                                bVar2 = bVar2;
                                cVar2 = cVar2;
                                i12 = i12;
                                xml = xml;
                                c0462e = c0462e;
                                resources2 = resources2;
                            }
                            i5 = i12;
                            cVar = cVar2;
                            bVar = bVar2;
                            xmlResourceParser = xml;
                            resources = resources2;
                            c0462e2 = c0462e;
                            i15 = 0;
                            c2 = '\t';
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0462e = c0462e2;
                            bVar2 = bVar;
                            cVar2 = cVar;
                            i12 = i5;
                            xml = xmlResourceParser;
                        } else {
                            i5 = i12;
                            cVar = cVar2;
                            bVar = bVar2;
                            xmlResourceParser = xml;
                            resources = resources2;
                        }
                        c0462e2 = c0462e;
                    } else {
                        Resources resources4 = resources2;
                        i5 = i12;
                        cVar = cVar2;
                        bVar = bVar2;
                        xmlResourceParser = xml;
                        C0462e c0462e3 = c0462e;
                        String name = xmlResourceParser2.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            List list = S1.u.f4320d;
                            B.Y y3 = c0515a.f6239c;
                            if (hashCode == -1649314686) {
                                c0462e2 = c0462e3;
                                resources = resources4;
                                c2 = '\t';
                                if (name.equals("clip-path")) {
                                    int[] iArr2 = AbstractC0516b.f6243d;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                    }
                                    c0515a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string = obtainStyledAttributes.getString(i6);
                                    c0515a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    String string2 = obtainStyledAttributes.getString(1);
                                    c0515a.c(obtainStyledAttributes.getChangingConfigurations());
                                    if (string2 == null) {
                                        int i19 = AbstractC0454G.f5881a;
                                    } else {
                                        list = B.Y.l(y3, string2);
                                    }
                                    List list2 = list;
                                    obtainStyledAttributes.recycle();
                                    if (c0462e2.f5948k) {
                                        z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    c0462e2.f5946i.add(new C0461d(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                    i11 = 1;
                                    i15++;
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    c0462e = c0462e2;
                                    bVar2 = bVar;
                                    cVar2 = cVar;
                                    i12 = i5;
                                    xml = xmlResourceParser;
                                }
                            } else if (hashCode == 3433509) {
                                c0462e2 = c0462e3;
                                resources = resources4;
                                if (name.equals("path")) {
                                    int[] iArr3 = AbstractC0516b.f6242c;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i7 = 0;
                                    } else {
                                        i7 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (!W0.b.a(xmlResourceParser2, "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string3 = obtainStyledAttributes2.getString(i7);
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    String string4 = obtainStyledAttributes2.getString(2);
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (string4 == null) {
                                        int i20 = AbstractC0454G.f5881a;
                                    } else {
                                        list = B.Y.l(y3, string4);
                                    }
                                    List list3 = list;
                                    K2.m a3 = c0515a.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b5 = c0515a.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i21 = !W0.b.a(c0515a.f6237a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i21 != 0) {
                                        if (i21 != 1) {
                                            i8 = 2;
                                            if (i21 == 2) {
                                                i9 = 2;
                                            }
                                        } else {
                                            i8 = 2;
                                            i9 = 1;
                                        }
                                        if (W0.b.a(c0515a.f6237a, "strokeLineJoin")) {
                                            i10 = -1;
                                            c2 = '\t';
                                        } else {
                                            c2 = '\t';
                                            i10 = obtainStyledAttributes2.getInt(9, -1);
                                        }
                                        c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        int i22 = i10 == 0 ? i10 != 1 ? i8 : 1 : 0;
                                        float b6 = c0515a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                        K2.m a4 = c0515a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b7 = c0515a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b8 = c0515a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b9 = c0515a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b10 = c0515a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b11 = c0515a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        int i23 = W0.b.a(c0515a.f6237a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                        c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        int i24 = a3.f3330b;
                                        Shader shader = (Shader) a3.f3331c;
                                        AbstractC0347p c0348q = (shader == null && i24 == 0) ? null : shader == null ? new C0348q(shader) : new b0.T(b0.M.c(i24));
                                        int i25 = a4.f3330b;
                                        Shader shader2 = (Shader) a4.f3331c;
                                        AbstractC0347p c0348q2 = (shader2 == null && i25 == 0) ? null : shader2 != null ? new C0348q(shader2) : new b0.T(b0.M.c(i25));
                                        int i26 = i23 != 0 ? 0 : 1;
                                        if (!c0462e2.f5948k) {
                                            z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        ArrayList arrayList2 = c0462e2.f5946i;
                                        ((C0461d) arrayList2.get(arrayList2.size() - 1)).f5937j.add(new C0457J(str2, list3, i26, c0348q, b5, c0348q2, b7, b8, i9, i22, b6, b11, b9, b10));
                                    } else {
                                        i8 = 2;
                                    }
                                    i9 = 0;
                                    if (W0.b.a(c0515a.f6237a, "strokeLineJoin")) {
                                    }
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i10 == 0) {
                                    }
                                    float b62 = c0515a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                    K2.m a42 = c0515a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b72 = c0515a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b82 = c0515a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b92 = c0515a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b102 = c0515a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b112 = c0515a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (W0.b.a(c0515a.f6237a, "fillType")) {
                                    }
                                    c0515a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    int i242 = a3.f3330b;
                                    Shader shader3 = (Shader) a3.f3331c;
                                    if (shader3 == null) {
                                        int i252 = a42.f3330b;
                                        Shader shader22 = (Shader) a42.f3331c;
                                        if (shader22 == null) {
                                            if (i23 != 0) {
                                            }
                                            if (!c0462e2.f5948k) {
                                            }
                                        }
                                        if (i23 != 0) {
                                        }
                                        if (!c0462e2.f5948k) {
                                        }
                                    }
                                    int i2522 = a42.f3330b;
                                    Shader shader222 = (Shader) a42.f3331c;
                                    if (shader222 == null) {
                                    }
                                    if (i23 != 0) {
                                    }
                                    if (!c0462e2.f5948k) {
                                    }
                                }
                            } else if (hashCode == 98629247 && name.equals("group")) {
                                int[] iArr4 = AbstractC0516b.f6241b;
                                if (theme == null) {
                                    resources = resources4;
                                    obtainStyledAttributes3 = resources.obtainAttributes(asAttributeSet, iArr4);
                                } else {
                                    resources = resources4;
                                    obtainStyledAttributes3 = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                }
                                c0515a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b12 = c0515a.b(obtainStyledAttributes3, "rotation", 5, 0.0f);
                                float f6 = obtainStyledAttributes3.getFloat(1, 0.0f);
                                c0515a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float f7 = obtainStyledAttributes3.getFloat(2, 0.0f);
                                c0515a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b13 = c0515a.b(obtainStyledAttributes3, "scaleX", 3, 1.0f);
                                float b14 = c0515a.b(obtainStyledAttributes3, "scaleY", 4, 1.0f);
                                float b15 = c0515a.b(obtainStyledAttributes3, "translateX", 6, 0.0f);
                                float b16 = c0515a.b(obtainStyledAttributes3, "translateY", 7, 0.0f);
                                String string5 = obtainStyledAttributes3.getString(0);
                                c0515a.c(obtainStyledAttributes3.getChangingConfigurations());
                                String str3 = string5 == null ? "" : string5;
                                obtainStyledAttributes3.recycle();
                                int i27 = AbstractC0454G.f5881a;
                                c0462e2 = c0462e3;
                                if (c0462e2.f5948k) {
                                    z0.o("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c0462e2.f5946i.add(new C0461d(str3, b12, f6, f7, b13, b14, b15, b16, list, 512));
                            }
                            i11 = 1;
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0462e = c0462e2;
                            bVar2 = bVar;
                            cVar2 = cVar;
                            i12 = i5;
                            xml = xmlResourceParser;
                        }
                        c0462e2 = c0462e3;
                        resources = resources4;
                    }
                    i11 = 1;
                    c2 = '\t';
                    xmlResourceParser.next();
                    resources2 = resources;
                    c0462e = c0462e2;
                    bVar2 = bVar;
                    cVar2 = cVar;
                    i12 = i5;
                    xml = xmlResourceParser;
                }
                y0.c cVar3 = cVar2;
                y0.b bVar3 = bVar2;
                c1231a = new C1231a(c0462e.b(), i12);
                cVar3.f10382a.put(bVar3, new WeakReference(c1231a));
            }
            i4 = 5;
            float f42 = dimension / resources2.getDisplayMetrics().density;
            float f52 = dimension2 / resources2.getDisplayMetrics().density;
            obtainAttributes.recycle();
            c0462e = new C0462e(null, f42, f52, b3, b4, j4, i4, z3, 1);
            int i152 = 0;
            while (xml.getEventType() != i11) {
                XmlResourceParser xmlResourceParser22 = c0515a.f6237a;
                eventType = xmlResourceParser22.getEventType();
                if (eventType == 2) {
                }
                i11 = 1;
                c2 = '\t';
                xmlResourceParser.next();
                resources2 = resources;
                c0462e = c0462e2;
                bVar2 = bVar;
                cVar2 = cVar;
                i12 = i5;
                xml = xmlResourceParser;
            }
            y0.c cVar32 = cVar2;
            y0.b bVar32 = bVar2;
            c1231a = new C1231a(c0462e.b(), i12);
            cVar32.f10382a.put(bVar32, new WeakReference(c1231a));
        }
        C0456I c3 = AbstractC0459b.c(c1231a.f10378a, c0167p);
        c0167p.p(false);
        return c3;
    }

    public static final Object l(v2.q qVar, v2.q qVar2, InterfaceC0426e interfaceC0426e) {
        Object c0829p;
        Object W2;
        try {
            f2.x.d(2, interfaceC0426e);
            c0829p = interfaceC0426e.h(qVar2, qVar);
        } catch (Throwable th) {
            c0829p = new C0829p(th, false);
        }
        W1.a aVar = W1.a.f4608d;
        if (c0829p == aVar || (W2 = qVar.W(c0829p)) == AbstractC0837y.f7944e) {
            return aVar;
        }
        if (W2 instanceof C0829p) {
            throw ((C0829p) W2).f7917a;
        }
        return AbstractC0837y.x(W2);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [e2.a, f2.k] */
    public static final void m(A0.p pVar, int i3, z0.i iVar) {
        K.d dVar = new K.d(new A0.p[16]);
        List g3 = pVar.g(false, false, false);
        while (true) {
            dVar.d(dVar.f3216f, g3);
            while (dVar.m()) {
                A0.p pVar2 = (A0.p) dVar.o(dVar.f3216f - 1);
                t0.b0 c2 = pVar2.c();
                if (!(c2 != null ? c2.R0() : false)) {
                    A0.v vVar = A0.s.f178m;
                    A0.i iVar2 = pVar2.f142d;
                    LinkedHashMap linkedHashMap = iVar2.f129d;
                    if (!linkedHashMap.containsKey(vVar) && !linkedHashMap.containsKey(A0.s.f174i)) {
                        t0.b0 c3 = pVar2.c();
                        if (c3 == null) {
                            z0.p("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        C0239d e3 = AbstractC0898U.e(c3);
                        int round = Math.round(e3.f4724a);
                        int round2 = Math.round(e3.f4725b);
                        int round3 = Math.round(e3.f4726c);
                        int round4 = Math.round(e3.f4727d);
                        O0.i iVar3 = new O0.i(round, round2, round3, round4);
                        if (round < round3 && round2 < round4) {
                            Object obj = iVar2.f129d.get(A0.h.f107e);
                            if (obj == null) {
                                obj = null;
                            }
                            InterfaceC0426e interfaceC0426e = (InterfaceC0426e) obj;
                            Object obj2 = linkedHashMap.get(A0.s.f181p);
                            A0.g gVar = (A0.g) (obj2 != null ? obj2 : null);
                            if (interfaceC0426e == null || gVar == null || ((Number) gVar.f100b.b()).floatValue() <= 0.0f) {
                                g3 = pVar2.g(false, false, false);
                            } else {
                                int i4 = i3 + 1;
                                iVar.n(new z0.k(pVar2, i4, iVar3, c3));
                                m(pVar2, i4, iVar);
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
