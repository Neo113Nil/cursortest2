package g2;

import E2.n;
import F.C0047j0;
import F.V0;
import I.AbstractC0114p0;
import I.C0089d;
import I.C0096g0;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import L1.z;
import M1.B;
import S.u;
import a.AbstractC0157a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.s;
import b0.AbstractC0259J;
import b0.C0265P;
import b0.C0275h;
import b0.C0284q;
import b0.C0288u;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import f2.InterfaceC0387b;
import g0.AbstractC0393b;
import g0.C0392a;
import h0.AbstractC0421b;
import h0.C0423d;
import h0.C0424e;
import h0.G;
import h2.AbstractC0442d;
import h2.AbstractC0447i;
import i0.AbstractC0463b;
import i0.C0462a;
import j.C0498p;
import j1.C0512c;
import j1.q;
import j1.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.C0544p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import n0.t;
import n0.v;
import o.H;
import o.I;
import o.J;
import org.xmlpull.v1.XmlPullParserException;
import q1.C0775D;
import q1.C0778b;
import q1.K;
import q1.w;
import r.C0792D;
import r0.F;
import r0.M;
import r1.C0855g;
import r1.C0857i;
import r1.p;
import t.x;
import t0.a0;
import u.C0921C;
import u.C0922D;
import u.C0940h;
import u.C0952u;
import w2.Q;
import w2.V;
import x0.C1051a;
import x0.C1052b;
import x0.C1053c;
import x0.C1054d;

/* loaded from: classes.dex */
public abstract class i implements Decoder, v2.a {
    public static final void B(U.l lVar, Y1.c cVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-932836462);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(cVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            AbstractC0381e.h(c0113p, androidx.compose.ui.draw.a.a(lVar, cVar));
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 6, lVar, cVar);
        }
    }

    public static final void C(Object obj, int i3, C0922D c0922d, Q.a aVar, C0113p c0113p, int i4) {
        int i5;
        c0113p.S(-2079116560);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.h(obj) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.d(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.h(c0922d) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0113p.h(aVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean f3 = c0113p.f(obj) | c0113p.f(c0922d);
            Object G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            if (f3 || G3 == obj2) {
                G3 = new C0921C(obj, c0922d);
                c0113p.a0(G3);
            }
            C0921C c0921c = (C0921C) G3;
            C0096g0 c0096g0 = c0921c.f8001c;
            C0102j0 c0102j0 = c0921c.f8003e;
            C0102j0 c0102j02 = c0921c.f8004f;
            c0096g0.h(i3);
            AbstractC0114p0 abstractC0114p0 = F.f7112a;
            C0921C c0921c2 = (C0921C) c0113p.k(abstractC0114p0);
            S.i c3 = u.c();
            Y1.c f4 = c3 != null ? c3.f() : null;
            S.i d3 = u.d(c3);
            try {
                if (c0921c2 != ((C0921C) c0102j02.getValue())) {
                    c0102j02.setValue(c0921c2);
                    if (c0921c.f8002d.g() > 0) {
                        C0921C c0921c3 = (C0921C) c0102j0.getValue();
                        if (c0921c3 != null) {
                            c0921c3.b();
                        }
                        if (c0921c2 != null) {
                            c0921c2.a();
                        } else {
                            c0921c2 = null;
                        }
                        c0102j0.setValue(c0921c2);
                    }
                }
                u.f(c3, d3, f4);
                boolean f5 = c0113p.f(c0921c);
                Object G4 = c0113p.G();
                if (f5 || G4 == obj2) {
                    G4 = new x(4, c0921c);
                    c0113p.a0(G4);
                }
                C0089d.c(c0921c, (Y1.c) G4, c0113p);
                C0089d.a(abstractC0114p0.a(c0921c), aVar, c0113p, ((i5 >> 6) & 112) | 8);
            } catch (Throwable th) {
                u.f(c3, d3, f4);
                throw th;
            }
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0952u(obj, i3, c0922d, aVar, i4);
        }
    }

    public static final int D(int i3, K.d dVar) {
        int i4 = dVar.f2642f - 1;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = ((i4 - i5) / 2) + i5;
            Object[] objArr = dVar.f2640d;
            int i7 = ((C0940h) objArr[i6]).f8066a;
            if (i7 != i3) {
                if (i7 < i3) {
                    i5 = i6 + 1;
                    if (i3 < ((C0940h) objArr[i5]).f8066a) {
                    }
                } else {
                    i4 = i6 - 1;
                }
            }
            return i6;
        }
        return i5;
    }

    public static final void E(String str, int i3) {
        if (str.charAt(i3) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i3)).toString());
    }

    public static final C0775D F(Context context) {
        Z1.i.f(context, "context");
        C0775D c0775d = new C0775D(context);
        K k3 = c0775d.f6848v;
        k3.a(new C0855g(k3));
        c0775d.f6848v.a(new C0857i());
        c0775d.f6848v.a(new p());
        return c0775d;
    }

    public static final void G(int i3, int i4, long j3, byte[] bArr) {
        int i5 = (i4 * 2) + i3;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = AbstractC0442d.f5069a[(int) (255 & j3)];
            bArr[i5 - 1] = (byte) i7;
            i5 -= 2;
            bArr[i5] = (byte) (i7 >> 8);
            j3 >>= 8;
        }
    }

    public static void H(StringBuilder sb, Object obj, Y1.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.j(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(t tVar, R1.a aVar) {
        H h3;
        int i3;
        int size;
        int i4;
        if (aVar instanceof H) {
            h3 = (H) aVar;
            int i5 = h3.f6438f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                h3.f6438f = i5 - Integer.MIN_VALUE;
                Object obj = h3.f6437e;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = h3.f6438f;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    ?? r8 = tVar.f6258h.f6266v.f6214a;
                    int size2 = r8.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (((n0.m) r8.get(i6)).f6226d) {
                            n0.h hVar = n0.h.f6218f;
                            h3.f6436d = tVar;
                            h3.f6438f = 1;
                            obj = tVar.b(hVar, h3);
                            if (obj == aVar2) {
                            }
                            ?? r82 = ((n0.g) obj).f6214a;
                            size = r82.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            return z.f2729a;
                        }
                    }
                    return z.f2729a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = h3.f6436d;
                I2.l.Q(obj);
                ?? r822 = ((n0.g) obj).f6214a;
                size = r822.size();
                i4 = 0;
                while (i4 < size) {
                    if (((n0.m) r822.get(i4)).f6226d) {
                        n0.h hVar2 = n0.h.f6218f;
                        h3.f6436d = tVar;
                        h3.f6438f = 1;
                        obj = tVar.b(hVar2, h3);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r8222 = ((n0.g) obj).f6214a;
                        size = r8222.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                    } else {
                        i4++;
                    }
                }
                return z.f2729a;
            }
        }
        h3 = new H(aVar);
        Object obj2 = h3.f6437e;
        Q1.a aVar22 = Q1.a.f3113d;
        i3 = h3.f6438f;
        if (i3 != 0) {
        }
    }

    public static final Object J(v vVar, Y1.e eVar, R1.i iVar) {
        Q1.a aVar;
        z zVar;
        I i3 = new I(iVar.getContext(), eVar, null);
        vVar.getClass();
        C0536h c0536h = new C0536h(1, B.G(iVar));
        c0536h.q();
        t tVar = new t(vVar, c0536h);
        synchronized (vVar.f6267w) {
            vVar.f6267w.b(tVar);
            P1.d G3 = B.G(B.w(tVar, tVar, i3));
            aVar = Q1.a.f3113d;
            P1.k kVar = new P1.k(G3, aVar);
            zVar = z.f2729a;
            kVar.resumeWith(zVar);
        }
        c0536h.s(new C0047j0(23, tVar));
        Object p = c0536h.p();
        return p == aVar ? p : zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r L(Context context) {
        ProviderInfo providerInfo;
        A2.k kVar;
        ApplicationInfo applicationInfo;
        F0.a c0512c = Build.VERSION.SDK_INT >= 28 ? new C0512c(26) : new F0.a(26);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0157a.p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] n3 = c0512c.n(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : n3) {
                    arrayList.add(signature.toByteArray());
                }
                kVar = new A2.k(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
            }
            if (kVar != null) {
                return null;
            }
            return new r(new q(context, kVar));
        }
        kVar = null;
        if (kVar != null) {
        }
    }

    public static final InterfaceC0387b O(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof u2.b) {
            ((u2.b) serialDescriptor).getClass();
            return null;
        }
        if (serialDescriptor instanceof V) {
            return O(((V) serialDescriptor).f8638a);
        }
        return null;
    }

    public static String P(Context context, int i3) {
        String valueOf;
        Z1.i.f(context, "context");
        if (i3 <= 16777215) {
            return String.valueOf(i3);
        }
        try {
            valueOf = context.getResources().getResourceName(i3);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i3);
        }
        Z1.i.e(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static InterfaceC0410f Q(w wVar) {
        Z1.i.f(wVar, "<this>");
        return h.c0(wVar, C0778b.f6884m);
    }

    public static final int R(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static C0411g S(Y1.e eVar) {
        C0411g c0411g = new C0411g();
        c0411g.f4850f = B.w(c0411g, c0411g, eVar);
        return c0411g;
    }

    public static final int T(t.q qVar, J j3) {
        return (int) (j3 == J.f6443d ? qVar.p & 4294967295L : qVar.p >> 32);
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
    public static final AbstractC0393b U(int i3, C0113p c0113p) {
        TypedValue typedValue;
        long j3;
        int i4;
        C0424e c0424e;
        int eventType;
        int i5;
        C1053c c1053c;
        C1052b c1052b;
        XmlResourceParser xmlResourceParser;
        C0424e c0424e2;
        Resources resources;
        char c3;
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
        Context context = (Context) c0113p.k(AndroidCompositionLocals_androidKt.f3738b);
        c0113p.k(AndroidCompositionLocals_androidKt.f3737a);
        Resources resources2 = context.getResources();
        C1054d c1054d = (C1054d) c0113p.k(AndroidCompositionLocals_androidKt.f3740d);
        synchronized (c1054d) {
            typedValue = (TypedValue) c1054d.f8722a.f(i3);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources2.getValue(i3, typedValue, true);
                C0498p c0498p = c1054d.f8722a;
                int d3 = c0498p.d(i3);
                Object[] objArr = c0498p.f5186c;
                Object obj = objArr[d3];
                c0498p.f5185b[d3] = i3;
                objArr[d3] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC0447i.n0(charSequence, ".xml")) {
            c0113p.Q(-802884675);
            boolean f3 = c0113p.f(context.getTheme()) | c0113p.f(charSequence) | c0113p.d(i3);
            Object G3 = c0113p.G();
            if (f3 || G3 == C0105l.f2272a) {
                try {
                    Drawable drawable = resources2.getDrawable(i3, null);
                    Z1.i.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    G3 = new C0275h(((BitmapDrawable) drawable).getBitmap());
                    c0113p.a0(G3);
                } catch (Exception e3) {
                    throw new L1.f("Error attempting to load resource: " + ((Object) charSequence), e3);
                }
            }
            C0392a c0392a = new C0392a((C0275h) G3);
            c0113p.p(false);
            return c0392a;
        }
        c0113p.Q(-803040357);
        Resources.Theme theme = context.getTheme();
        int i12 = typedValue.changingConfigurations;
        C1053c c1053c2 = (C1053c) c0113p.k(AndroidCompositionLocals_androidKt.f3739c);
        C1052b c1052b2 = new C1052b(theme, i3);
        WeakReference weakReference = (WeakReference) c1053c2.f8721a.get(c1052b2);
        C1051a c1051a = weakReference != null ? (C1051a) weakReference.get() : null;
        if (c1051a == null) {
            XmlResourceParser xml = resources2.getXml(i3);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Z1.i.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            C0462a c0462a = new C0462a(xml);
            int[] iArr = AbstractC0463b.f5100a;
            TypedArray obtainAttributes = theme == null ? resources2.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            c0462a.c(obtainAttributes.getChangingConfigurations());
            boolean z3 = !U0.b.a(xml, "autoMirrored") ? false : obtainAttributes.getBoolean(5, false);
            c0462a.c(obtainAttributes.getChangingConfigurations());
            float b2 = c0462a.b(obtainAttributes, "viewportWidth", 7, 0.0f);
            float b3 = c0462a.b(obtainAttributes, "viewportHeight", 8, 0.0f);
            if (b2 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b3 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, 0.0f);
            c0462a.c(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, 0.0f);
            c0462a.c(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j3 = C0288u.f4296f;
                } else {
                    if (U0.b.a(xml, "tint")) {
                        TypedValue typedValue3 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue3);
                        int i13 = typedValue3.type;
                        if (i13 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i13 < 28 || i13 > 31) {
                            Resources resources3 = obtainAttributes.getResources();
                            int resourceId = obtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = U0.c.f3326a;
                            try {
                                colorStateList = U0.c.a(resources3, resources3.getXml(resourceId), theme);
                            } catch (Exception e4) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        c0462a.c(obtainAttributes.getChangingConfigurations());
                        j3 = colorStateList == null ? AbstractC0259J.b(colorStateList.getDefaultColor()) : C0288u.f4296f;
                    }
                    colorStateList = null;
                    c0462a.c(obtainAttributes.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j3 = C0288u.f4296f;
            }
            long j4 = j3;
            int i14 = obtainAttributes.getInt(6, -1);
            c0462a.c(obtainAttributes.getChangingConfigurations());
            if (i14 != -1) {
                if (i14 == 3) {
                    i4 = 3;
                } else if (i14 != 5) {
                    if (i14 != 9) {
                        switch (i14) {
                            case 14:
                                i4 = 13;
                                break;
                            case AbstractC0382a.f4781e /* 15 */:
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
                c0424e = new C0424e(null, f4, f5, b2, b3, j4, i4, z3, 1);
                int i15 = 0;
                for (int i16 = 3; xml.getEventType() != i11 && (xml.getDepth() >= i11 || xml.getEventType() != i16); i16 = 3) {
                    XmlResourceParser xmlResourceParser2 = c0462a.f5097a;
                    eventType = xmlResourceParser2.getEventType();
                    if (eventType == 2) {
                        if (eventType != i16) {
                            resources = resources2;
                            i5 = i12;
                            c1053c = c1053c2;
                            c1052b = c1052b2;
                            xmlResourceParser = xml;
                        } else if ("group".equals(xmlResourceParser2.getName())) {
                            i11 = 1;
                            int i17 = i15 + 1;
                            int i18 = 0;
                            while (i18 < i17) {
                                if (c0424e.f4958k) {
                                    AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                ArrayList arrayList = c0424e.f4956i;
                                C0423d c0423d = (C0423d) arrayList.remove(arrayList.size() - i11);
                                ((C0423d) arrayList.get(arrayList.size() - 1)).f4947j.add(new h0.F(c0423d.f4938a, c0423d.f4939b, c0423d.f4940c, c0423d.f4941d, c0423d.f4942e, c0423d.f4943f, c0423d.f4944g, c0423d.f4945h, c0423d.f4946i, c0423d.f4947j));
                                i18++;
                                i11 = 1;
                                i17 = i17;
                                c1052b2 = c1052b2;
                                c1053c2 = c1053c2;
                                i12 = i12;
                                xml = xml;
                                c0424e = c0424e;
                                resources2 = resources2;
                            }
                            i5 = i12;
                            c1053c = c1053c2;
                            c1052b = c1052b2;
                            xmlResourceParser = xml;
                            resources = resources2;
                            c0424e2 = c0424e;
                            i15 = 0;
                            c3 = '\t';
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0424e = c0424e2;
                            c1052b2 = c1052b;
                            c1053c2 = c1053c;
                            i12 = i5;
                            xml = xmlResourceParser;
                        } else {
                            i5 = i12;
                            c1053c = c1053c2;
                            c1052b = c1052b2;
                            xmlResourceParser = xml;
                            resources = resources2;
                        }
                        c0424e2 = c0424e;
                    } else {
                        Resources resources4 = resources2;
                        i5 = i12;
                        c1053c = c1053c2;
                        c1052b = c1052b2;
                        xmlResourceParser = xml;
                        C0424e c0424e3 = c0424e;
                        String name = xmlResourceParser2.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            List list = M1.u.f2803d;
                            A2.g gVar = c0462a.f5099c;
                            if (hashCode == -1649314686) {
                                c0424e2 = c0424e3;
                                resources = resources4;
                                c3 = '\t';
                                if (name.equals("clip-path")) {
                                    int[] iArr2 = AbstractC0463b.f5103d;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                    }
                                    c0462a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string = obtainStyledAttributes.getString(i6);
                                    c0462a.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    String string2 = obtainStyledAttributes.getString(1);
                                    c0462a.c(obtainStyledAttributes.getChangingConfigurations());
                                    if (string2 == null) {
                                        int i19 = G.f4893a;
                                    } else {
                                        list = A2.g.p(gVar, string2);
                                    }
                                    List list2 = list;
                                    obtainStyledAttributes.recycle();
                                    if (c0424e2.f4958k) {
                                        AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    c0424e2.f4956i.add(new C0423d(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                    i11 = 1;
                                    i15++;
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    c0424e = c0424e2;
                                    c1052b2 = c1052b;
                                    c1053c2 = c1053c;
                                    i12 = i5;
                                    xml = xmlResourceParser;
                                }
                            } else if (hashCode == 3433509) {
                                c0424e2 = c0424e3;
                                resources = resources4;
                                if (name.equals("path")) {
                                    int[] iArr3 = AbstractC0463b.f5102c;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i7 = 0;
                                    } else {
                                        i7 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (!U0.b.a(xmlResourceParser2, "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string3 = obtainStyledAttributes2.getString(i7);
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    String string4 = obtainStyledAttributes2.getString(2);
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (string4 == null) {
                                        int i20 = G.f4893a;
                                    } else {
                                        list = A2.g.p(gVar, string4);
                                    }
                                    List list3 = list;
                                    n a3 = c0462a.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b4 = c0462a.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i21 = !U0.b.a(c0462a.f5097a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
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
                                        if (U0.b.a(c0462a.f5097a, "strokeLineJoin")) {
                                            i10 = -1;
                                            c3 = '\t';
                                        } else {
                                            c3 = '\t';
                                            i10 = obtainStyledAttributes2.getInt(9, -1);
                                        }
                                        c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        int i22 = i10 == 0 ? i10 != 1 ? i8 : 1 : 0;
                                        float b5 = c0462a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                        n a4 = c0462a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b6 = c0462a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b7 = c0462a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b8 = c0462a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b9 = c0462a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b10 = c0462a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        int i23 = U0.b.a(c0462a.f5097a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                        c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        int i24 = a3.f843b;
                                        Shader shader = (Shader) a3.f844c;
                                        AbstractC0259J c0284q = (shader == null && i24 == 0) ? null : shader == null ? new C0284q(shader) : new C0265P(AbstractC0259J.b(i24));
                                        int i25 = a4.f843b;
                                        Shader shader2 = (Shader) a4.f844c;
                                        AbstractC0259J c0284q2 = (shader2 == null && i25 == 0) ? null : shader2 != null ? new C0284q(shader2) : new C0265P(AbstractC0259J.b(i25));
                                        int i26 = i23 != 0 ? 0 : 1;
                                        if (!c0424e2.f4958k) {
                                            AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        ArrayList arrayList2 = c0424e2.f4956i;
                                        ((C0423d) arrayList2.get(arrayList2.size() - 1)).f4947j.add(new h0.J(str2, list3, i26, c0284q, b4, c0284q2, b6, b7, i9, i22, b5, b10, b8, b9));
                                    } else {
                                        i8 = 2;
                                    }
                                    i9 = 0;
                                    if (U0.b.a(c0462a.f5097a, "strokeLineJoin")) {
                                    }
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i10 == 0) {
                                    }
                                    float b52 = c0462a.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                    n a42 = c0462a.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b62 = c0462a.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b72 = c0462a.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b82 = c0462a.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b92 = c0462a.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b102 = c0462a.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (U0.b.a(c0462a.f5097a, "fillType")) {
                                    }
                                    c0462a.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    int i242 = a3.f843b;
                                    Shader shader3 = (Shader) a3.f844c;
                                    if (shader3 == null) {
                                        int i252 = a42.f843b;
                                        Shader shader22 = (Shader) a42.f844c;
                                        if (shader22 == null) {
                                            if (i23 != 0) {
                                            }
                                            if (!c0424e2.f4958k) {
                                            }
                                        }
                                        if (i23 != 0) {
                                        }
                                        if (!c0424e2.f4958k) {
                                        }
                                    }
                                    int i2522 = a42.f843b;
                                    Shader shader222 = (Shader) a42.f844c;
                                    if (shader222 == null) {
                                    }
                                    if (i23 != 0) {
                                    }
                                    if (!c0424e2.f4958k) {
                                    }
                                }
                            } else if (hashCode == 98629247 && name.equals("group")) {
                                int[] iArr4 = AbstractC0463b.f5101b;
                                if (theme == null) {
                                    resources = resources4;
                                    obtainStyledAttributes3 = resources.obtainAttributes(asAttributeSet, iArr4);
                                } else {
                                    resources = resources4;
                                    obtainStyledAttributes3 = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                }
                                c0462a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b11 = c0462a.b(obtainStyledAttributes3, "rotation", 5, 0.0f);
                                float f6 = obtainStyledAttributes3.getFloat(1, 0.0f);
                                c0462a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float f7 = obtainStyledAttributes3.getFloat(2, 0.0f);
                                c0462a.c(obtainStyledAttributes3.getChangingConfigurations());
                                float b12 = c0462a.b(obtainStyledAttributes3, "scaleX", 3, 1.0f);
                                float b13 = c0462a.b(obtainStyledAttributes3, "scaleY", 4, 1.0f);
                                float b14 = c0462a.b(obtainStyledAttributes3, "translateX", 6, 0.0f);
                                float b15 = c0462a.b(obtainStyledAttributes3, "translateY", 7, 0.0f);
                                String string5 = obtainStyledAttributes3.getString(0);
                                c0462a.c(obtainStyledAttributes3.getChangingConfigurations());
                                String str3 = string5 == null ? "" : string5;
                                obtainStyledAttributes3.recycle();
                                int i27 = G.f4893a;
                                c0424e2 = c0424e3;
                                if (c0424e2.f4958k) {
                                    AbstractC0381e.N("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c0424e2.f4956i.add(new C0423d(str3, b11, f6, f7, b12, b13, b14, b15, list, 512));
                            }
                            i11 = 1;
                            xmlResourceParser.next();
                            resources2 = resources;
                            c0424e = c0424e2;
                            c1052b2 = c1052b;
                            c1053c2 = c1053c;
                            i12 = i5;
                            xml = xmlResourceParser;
                        }
                        c0424e2 = c0424e3;
                        resources = resources4;
                    }
                    i11 = 1;
                    c3 = '\t';
                    xmlResourceParser.next();
                    resources2 = resources;
                    c0424e = c0424e2;
                    c1052b2 = c1052b;
                    c1053c2 = c1053c;
                    i12 = i5;
                    xml = xmlResourceParser;
                }
                C1053c c1053c3 = c1053c2;
                C1052b c1052b3 = c1052b2;
                c1051a = new C1051a(c0424e.b(), i12);
                c1053c3.f8721a.put(c1052b3, new WeakReference(c1051a));
            }
            i4 = 5;
            float f42 = dimension / resources2.getDisplayMetrics().density;
            float f52 = dimension2 / resources2.getDisplayMetrics().density;
            obtainAttributes.recycle();
            c0424e = new C0424e(null, f42, f52, b2, b3, j4, i4, z3, 1);
            int i152 = 0;
            while (xml.getEventType() != i11) {
                XmlResourceParser xmlResourceParser22 = c0462a.f5097a;
                eventType = xmlResourceParser22.getEventType();
                if (eventType == 2) {
                }
                i11 = 1;
                c3 = '\t';
                xmlResourceParser.next();
                resources2 = resources;
                c0424e = c0424e2;
                c1052b2 = c1052b;
                c1053c2 = c1053c;
                i12 = i5;
                xml = xmlResourceParser;
            }
            C1053c c1053c32 = c1053c2;
            C1052b c1052b32 = c1052b2;
            c1051a = new C1051a(c0424e.b(), i12);
            c1053c32.f8721a.put(c1052b32, new WeakReference(c1051a));
        }
        h0.I c4 = AbstractC0421b.c(c1051a.f8717a, c0113p);
        c0113p.p(false);
        return c4;
    }

    public static final Cursor V(s sVar, v1.d dVar) {
        Z1.i.f(sVar, "db");
        Z1.i.f(dVar, "sqLiteQuery");
        return sVar.query(dVar, (CancellationSignal) null);
    }

    public static final Object X(p2.r rVar, p2.r rVar2, Y1.e eVar) {
        Object c0544p;
        Object S2;
        try {
            Z1.w.d(2, eVar);
            c0544p = eVar.g(rVar2, rVar);
        } catch (Throwable th) {
            c0544p = new C0544p(th, false);
        }
        Q1.a aVar = Q1.a.f3113d;
        if (c0544p == aVar || (S2 = rVar.S(c0544p)) == AbstractC0552y.f5404e) {
            return aVar;
        }
        if (S2 instanceof C0544p) {
            throw ((C0544p) S2).f5378a;
        }
        return AbstractC0552y.w(S2);
    }

    public static final C0792D Y(V0.c cVar) {
        return new C0792D(cVar.f3349a, cVar.f3350b, cVar.f3351c, cVar.f3352d);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Y1.a, Z1.j] */
    public static final void Z(z0.n nVar, int i3, y0.k kVar) {
        K.d dVar = new K.d(new z0.n[16]);
        List g3 = nVar.g(false, false, false);
        while (true) {
            dVar.d(dVar.f2642f, g3);
            while (dVar.m()) {
                z0.n nVar2 = (z0.n) dVar.o(dVar.f2642f - 1);
                a0 c3 = nVar2.c();
                if (!(c3 != null ? c3.I0() : false)) {
                    z0.t tVar = z0.q.f9022m;
                    z0.i iVar = nVar2.f8991d;
                    LinkedHashMap linkedHashMap = iVar.f8982d;
                    if (!linkedHashMap.containsKey(tVar) && !linkedHashMap.containsKey(z0.q.f9018i)) {
                        a0 c4 = nVar2.c();
                        if (c4 == null) {
                            AbstractC0381e.O("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        a0.d e3 = M.e(c4);
                        int round = Math.round(e3.f3491a);
                        int round2 = Math.round(e3.f3492b);
                        int round3 = Math.round(e3.f3493c);
                        int round4 = Math.round(e3.f3494d);
                        M0.h hVar = new M0.h(round, round2, round3, round4);
                        if (round < round3 && round2 < round4) {
                            Object obj = iVar.f8982d.get(z0.h.f8961e);
                            if (obj == null) {
                                obj = null;
                            }
                            Y1.e eVar = (Y1.e) obj;
                            Object obj2 = linkedHashMap.get(z0.q.p);
                            z0.g gVar = (z0.g) (obj2 != null ? obj2 : null);
                            if (eVar == null || gVar == null || ((Number) gVar.f8955b.b()).floatValue() <= 0.0f) {
                                g3 = nVar2.g(false, false, false);
                            } else {
                                int i4 = i3 + 1;
                                kVar.j(new y0.m(nVar2, i4, hVar, c4));
                                Z(nVar2, i4, kVar);
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double A() {
        M();
        throw null;
    }

    public abstract boolean K(s0.h hVar);

    public void M() {
        throw new t2.c(Z1.u.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object N(s0.h hVar);

    public abstract void W();

    @Override // kotlinx.serialization.encoding.Decoder
    public v2.a a(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // v2.a
    public boolean b(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder c(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long d();

    @Override // v2.a
    public Object e(SerialDescriptor serialDescriptor, int i3, String str) {
        w2.a0 a0Var = w2.a0.f8646a;
        Z1.i.f(serialDescriptor, "descriptor");
        w2.a0.f8647b.getClass();
        if (m()) {
            return h(a0Var);
        }
        return null;
    }

    @Override // v2.a
    public byte f(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return q();
    }

    @Override // v2.a
    public char g(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object h(KSerializer kSerializer) {
        Z1.i.f(kSerializer, "deserializer");
        return kSerializer.deserialize(this);
    }

    @Override // v2.a
    public Object i(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj) {
        Z1.i.f(serialDescriptor, "descriptor");
        Z1.i.f(kSerializer, "deserializer");
        return h(kSerializer);
    }

    @Override // v2.a
    public float j(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean k() {
        M();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int l();

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean m() {
        return true;
    }

    @Override // v2.a
    public long n(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return d();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char p() {
        M();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte q();

    @Override // v2.a
    public Decoder r(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return c(q2.h(i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short t();

    @Override // kotlinx.serialization.encoding.Decoder
    public String u() {
        M();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float v() {
        M();
        throw null;
    }

    @Override // v2.a
    public int w(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return l();
    }

    @Override // v2.a
    public double x(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return A();
    }

    @Override // v2.a
    public short y(Q q2, int i3) {
        Z1.i.f(q2, "descriptor");
        return t();
    }

    @Override // v2.a
    public void z(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
    }
}
