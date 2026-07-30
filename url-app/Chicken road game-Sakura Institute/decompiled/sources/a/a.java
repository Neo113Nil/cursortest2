package a;

import a0.b1;
import a0.q0;
import a0.r0;
import a2.j0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import b3.w;
import c7.q;
import com.android.installreferrer.R;
import com.chicken.road.whale.App;
import d0.b0;
import d0.b3;
import d0.c1;
import d6.z;
import e6.x;
import f1.f;
import g0.d;
import g0.k1;
import g0.m1;
import g0.p;
import g0.p1;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l.u1;
import m.g1;
import m.i0;
import o7.v0;
import p0.b;
import p0.i;
import p0.l;
import p0.m;
import p1.f0;
import q6.c;
import r1.a1;
import r1.z0;
import r6.k;
import r6.t;
import r6.y;
import s.g0;
import s0.n;
import s0.o;
import s1.f1;
import s1.l2;
import t.h;
import t3.d0;
import t3.e0;
import v1.g;
import z0.l0;
import z0.r;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f0a;

    public static final long A(long j8, float f9) {
        return (Float.isNaN(f9) || f9 >= 1.0f) ? j8 : u.b(j8, u.d(j8) * f9);
    }

    public static final d0 B(c cVar) {
        e0 e0Var = new e0();
        cVar.f(e0Var);
        boolean z8 = e0Var.f8782b;
        boolean z9 = e0Var.f8783c;
        int i7 = e0Var.f8784d;
        boolean z10 = e0Var.f8785e;
        c1 c1Var = e0Var.f8781a;
        return new d0(z8, z9, i7, false, z10, c1Var.f1876a, c1Var.f1877b);
    }

    public static String D(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z8) {
                sb.append("/");
            }
            sb.append(str);
            z8 = false;
        }
        return sb.toString();
    }

    public static final Object E(Object[] objArr, l lVar, q6.a aVar, p pVar, int i7, int i8) {
        Object[] objArr2;
        Object obj;
        Object b9;
        if ((i8 & 2) != 0) {
            lVar = m.f7013a;
        }
        l lVar2 = lVar;
        int i9 = pVar.P;
        g.b(36);
        String num = Integer.toString(i9, 36);
        k.e(num, "toString(this, checkRadix(radix))");
        k.d(lVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        i iVar = (i) pVar.k(p0.k.f7012a);
        Object G = pVar.G();
        Object obj2 = g0.l.f3784a;
        if (G == obj2) {
            Object e9 = (iVar == null || (b9 = iVar.b(num)) == null) ? null : lVar2.e(b9);
            if (e9 == null) {
                e9 = aVar.a();
            }
            objArr2 = objArr;
            Object bVar = new b(lVar2, iVar, num, e9, objArr2);
            pVar.a0(bVar);
            G = bVar;
        } else {
            objArr2 = objArr;
        }
        b bVar2 = (b) G;
        Object obj3 = Arrays.equals(objArr2, bVar2.f6990j) ? bVar2.f6989i : null;
        if (obj3 == null) {
            obj3 = aVar.a();
        }
        boolean h3 = pVar.h(bVar2) | pVar.h(lVar2) | pVar.h(iVar) | pVar.f(num) | pVar.h(obj3) | pVar.h(objArr2);
        Object G2 = pVar.G();
        if (h3 || G2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object aVar2 = new p0.a(bVar2, lVar2, iVar, num, obj, objArr3);
            pVar.a0(aVar2);
            G2 = aVar2;
        } else {
            obj = obj3;
        }
        d.g((q6.a) G2, pVar);
        return obj;
    }

    public static final g1 F(p pVar) {
        int i7 = 0;
        Object[] objArr = new Object[0];
        androidx.room.c cVar = g1.f6158i;
        boolean d8 = pVar.d(0);
        Object G = pVar.G();
        if (d8 || G == g0.l.f3784a) {
            G = new i0(i7, 2);
            pVar.a0(G);
        }
        return (g1) E(objArr, cVar, (q6.a) G, pVar, 0, 4);
    }

    public static final Object G(r1.l lVar, y0.d dVar, j6.c cVar) {
        t.a aVar;
        Object f02;
        if (((n) lVar).f8104f.f8116r) {
            a1 s5 = r1.f.s(lVar);
            if (((n) lVar).f8104f.f8116r) {
                t.a aVar2 = (t.a) r1.f.j(lVar, t.g.f8725u);
                if (aVar2 == null) {
                    aVar2 = new h(lVar);
                }
                aVar = aVar2;
            } else {
                aVar = null;
            }
            if (aVar != null && (f02 = aVar.f0(s5, new b1(dVar, 10, s5), cVar)) == i6.a.f4956f) {
                return f02;
            }
        }
        return z.f2639a;
    }

    public static void H(Window window, boolean z8) {
        if (Build.VERSION.SDK_INT >= 30) {
            w.a(window, z8);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z8 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            e3.a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i7 >= 30) {
            e3.a.a(editorInfo, charSequence);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        int length = charSequence.length();
        if (i10 < 0 || i8 > length) {
            J(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            J(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            J(editorInfo, charSequence, i10, i8);
            return;
        }
        int i12 = i8 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i8, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i15))) {
            i15++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i8 + min) - 1))) {
            min--;
        }
        int i16 = min2 + i13;
        J(editorInfo, i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i8, min + i8)) : charSequence.subSequence(i15, i16 + min + i15), min2, i16);
    }

    public static void J(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }

    public static ArrayList K(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i7 = 0; i7 < split.length; i7++) {
            if (!split[i7].isEmpty()) {
                arrayList.add(split[i7]);
            }
        }
        return arrayList;
    }

    public static final void L(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void M(String str) {
        throw new IllegalStateException(str);
    }

    public static final void N(String str) {
        throw new IllegalStateException(str);
    }

    public static final ExtractedText O(g2.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f4065a.f373f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j8 = wVar.f4066b;
        extractedText.selectionStart = j0.e(j8);
        extractedText.selectionEnd = j0.d(j8);
        extractedText.flags = !z6.h.x(wVar.f4065a.f373f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static o P(o oVar, g1 g1Var) {
        return s0.a.a(oVar, new e(g1Var));
    }

    public static final w0 Q(r6.d dVar, androidx.lifecycle.c1 c1Var, e4.a aVar, u1 u1Var, p pVar) {
        b6.c cVar;
        pVar.R(1673618944);
        k.f(u1Var, "extras");
        if (aVar != null) {
            androidx.lifecycle.b1 e9 = c1Var.e();
            k.f(e9, "store");
            cVar = new b6.c(e9, aVar, u1Var);
        } else {
            boolean z8 = c1Var instanceof j;
            if (z8) {
                androidx.lifecycle.b1 e10 = c1Var.e();
                y0 c4 = ((j) c1Var).c();
                k.f(e10, "store");
                k.f(c4, "factory");
                cVar = new b6.c(e10, c4, u1Var);
            } else {
                y0 c6 = z8 ? ((j) c1Var).c() : s3.b.f8522a;
                u1 d8 = z8 ? ((j) c1Var).d() : q3.a.f7511b;
                k.f(c6, "factory");
                k.f(d8, "extras");
                cVar = new b6.c(c1Var.e(), c6, d8);
            }
        }
        w0 o2 = cVar.o(dVar);
        pVar.p(false);
        return o2;
    }

    public static final void a(int i7, p pVar) {
        pVar.S(-1172317919);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f640c;
            o a3 = androidx.compose.foundation.a.a(fillElement, l0.d(4278914586L), l0.f10006a);
            f0 e9 = q.n.e(s0.b.f8078f, false);
            int i8 = pVar.P;
            k1 m8 = pVar.m();
            o c4 = s0.a.c(pVar, a3);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            d.Q(pVar, e9, r1.i.f7784e);
            d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar);
            }
            d.Q(pVar, c4, r1.i.f7782c);
            t6.a.d(g.m(R.drawable.splash_background, pVar), fillElement, null, p1.i.f7045a, 0.0f, pVar, 25008);
            e1.b m9 = g.m(R.drawable.splash_logo, pVar);
            s0.g gVar = s0.b.f8082j;
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f637a;
            t6.a.d(m9, androidx.compose.foundation.layout.c.b(aVar.a(gVar), 0.72f), null, p1.i.f7046b, 0.0f, pVar, 24624);
            b3.a(androidx.compose.foundation.layout.b.h(aVar.a(s0.b.f8085m), 0.0f, 0.0f, 0.0f, 72, 7), u.f10053c, 0.0f, 0L, 0, pVar, 48);
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new q(i7, 4);
        }
    }

    public static final long b(float f9, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public static final void c(a0.o oVar, s0.c cVar, o0.a aVar, p pVar, int i7) {
        int i8;
        pVar.S(476043083);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? pVar.f(oVar) : pVar.h(oVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(cVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(aVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            boolean z8 = ((i8 & 14) == 4 || ((i8 & 8) != 0 && pVar.f(oVar))) | ((i8 & 112) == 32);
            Object G = pVar.G();
            if (z8 || G == g0.l.f3784a) {
                G = new a0.n(cVar, oVar);
                pVar.a0(G);
            }
            p2.l.a((a0.n) G, null, new p2.z(1, false, false), aVar, pVar, ((i8 << 3) & 7168) | 384, 2);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(oVar, cVar, aVar, i7, 0);
        }
    }

    public static final void d(o0.a aVar, p pVar, int i7) {
        p pVar2;
        pVar.S(674185128);
        if ((i7 & 3) == 2 && pVar.x()) {
            pVar.L();
            pVar2 = pVar;
        } else {
            m1 m1Var = p0.k.f7012a;
            i iVar = (i) pVar.k(m1Var);
            Object[] objArr = {iVar};
            int i8 = 1;
            s.e0 e0Var = new s.e0(iVar, i8);
            androidx.room.c cVar = m.f7013a;
            androidx.room.c cVar2 = new androidx.room.c(s.f0.f8003g, 28, e0Var);
            boolean h3 = pVar.h(iVar);
            Object G = pVar.G();
            if (h3 || G == g0.l.f3784a) {
                G = new z0(i8, iVar);
                pVar.a0(G);
            }
            pVar2 = pVar;
            Object obj = (g0) E(objArr, cVar2, (q6.a) G, pVar2, 0, 4);
            d.a(m1Var.a(obj), o0.f.b(1863926504, new b0(obj, 15, aVar), pVar2), pVar2, 56);
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new d0.g(aVar, i7, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        if (r20 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00bd, code lost:
    
        if (r20 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00cd, code lost:
    
        if (((r19 == r13 && !r20) || (r19 == r3 && r20)) == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(a0.o oVar, boolean z8, l2.h hVar, boolean z9, long j8, o oVar2, p pVar, int i7) {
        int i8;
        int i9;
        long j9;
        boolean z10;
        long j10;
        a0.o oVar3 = oVar;
        pVar.S(-843755800);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? pVar.f(oVar3) : pVar.h(oVar3) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.g(z8) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(hVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.g(z9) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.f(oVar2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && pVar.x()) {
            pVar.L();
            j10 = j8;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                i9 = i8 & (-57345);
                j9 = 9205357640488583168L;
            } else {
                pVar.L();
                i9 = i8 & (-57345);
                j9 = j8;
            }
            pVar.q();
            l2.h hVar2 = l2.h.f5874g;
            l2.h hVar3 = l2.h.f5873f;
            if (z8) {
                float f9 = a0.g0.f70a;
                if (hVar == hVar3) {
                }
                if (hVar == hVar2) {
                }
                z10 = false;
            } else {
                float f10 = a0.g0.f70a;
            }
            s0.d dVar = z10 ? s0.a.f8076b : s0.a.f8075a;
            int i10 = i9 & 14;
            boolean g9 = ((i9 & 112) == 32) | (i10 == 4 || ((i9 & 8) != 0 && pVar.h(oVar3))) | pVar.g(z10);
            Object G = pVar.G();
            if (g9 || G == g0.l.f3784a) {
                G = new a0.f(oVar3, z8, z10);
                pVar.a0(G);
            }
            o a3 = y1.k.a(oVar2, false, (c) G);
            long j11 = j9;
            oVar3 = oVar;
            c(oVar3, dVar, o0.f.b(280174801, new a0.d((l2) pVar.k(f1.f8228q), j11, z10, a3, oVar), pVar), pVar, i10 | 384);
            j10 = j11;
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.e(oVar3, z8, hVar, z9, j10, oVar2, i7);
        }
    }

    public static final void f(o oVar, q6.a aVar, boolean z8, p pVar, int i7) {
        int i8;
        pVar.S(2111672474);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (((i8 | (pVar.h(aVar) ? 32 : 16) | (pVar.g(z8) ? 256 : 128)) & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            q.c.a(pVar, s0.a.a(androidx.compose.foundation.layout.c.i(oVar, a0.g0.f70a, a0.g0.f71b), new a0.j(aVar, z8)));
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.g(oVar, aVar, z8, i7);
        }
    }

    public static final void g(o oVar, o0.a aVar, p pVar, int i7) {
        pVar.S(-2105228848);
        if ((((pVar.f(oVar) ? 4 : 2) | i7) & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            int i8 = pVar.P;
            k1 m8 = pVar.m();
            o c4 = s0.a.c(pVar, oVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            d.Q(pVar, q0.f127a, r1.i.f7784e);
            d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar);
            }
            d.Q(pVar, c4, r1.i.f7782c);
            aVar.d(pVar, 6);
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new r0(oVar, aVar, i7);
        }
    }

    public static final void h(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            throw new IndexOutOfBoundsException("Index " + i7 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void i(List list, int i7, int i8) {
        int size = list.size();
        if (i7 > i8) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i8 + ").");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(a0.m.g(i7, "fromIndex (", ") is less than 0."));
        }
        if (i8 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is more than than the list size (" + size + ')');
    }

    public static final e4.a j(p pVar) {
        pVar.Q(-1164854172);
        Context applicationContext = ((Context) pVar.k(AndroidCompositionLocals_androidKt.f739b)).getApplicationContext();
        k.d(applicationContext, "null cannot be cast to non-null type com.chicken.road.whale.App");
        e4.b bVar = ((App) applicationContext).f1764f;
        if (bVar == null) {
            k.j("container");
            throw null;
        }
        e4.a aVar = bVar.f2748b;
        pVar.p(false);
        return aVar;
    }

    public static f8.e k() {
        f8.e eVar = f8.e.f3593l;
        k.c(eVar);
        f8.e eVar2 = eVar.f3595f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            f8.e.f3590i.await(f8.e.f3591j, TimeUnit.MILLISECONDS);
            f8.e eVar3 = f8.e.f3593l;
            k.c(eVar3);
            if (eVar3.f3595f != null || System.nanoTime() - nanoTime < f8.e.f3592k) {
                return null;
            }
            return f8.e.f3593l;
        }
        long nanoTime2 = eVar2.f3596g - System.nanoTime();
        if (nanoTime2 > 0) {
            f8.e.f3590i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        f8.e eVar4 = f8.e.f3593l;
        k.c(eVar4);
        eVar4.f3595f = eVar2.f3595f;
        eVar2.f3595f = null;
        return eVar2;
    }

    public static final void l(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void n(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
    }

    public static final void o(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(r6.i.b(i7, i8, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z0.h q(w0.c cVar, float f9) {
        int ceil = ((int) Math.ceil(f9)) * 2;
        z0.h hVar = a8.d.f544f;
        z0.d dVar = a8.d.f545g;
        b1.c cVar2 = a8.d.f546h;
        if (hVar != null && dVar != null) {
            Bitmap bitmap = hVar.f9996a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        hVar = l0.f(ceil, ceil, 1);
        a8.d.f544f = hVar;
        dVar = l0.a(hVar);
        a8.d.f545g = dVar;
        z0.h hVar2 = hVar;
        z0.d dVar2 = dVar;
        if (cVar2 == null) {
            cVar2 = new b1.c();
            a8.d.f546h = cVar2;
        }
        b1.c cVar3 = cVar2;
        b1.a aVar = cVar3.f1233f;
        m2.k layoutDirection = cVar.f9477f.getLayoutDirection();
        Bitmap bitmap2 = hVar2.f9996a;
        long a3 = v0.d.a(bitmap2.getWidth(), bitmap2.getHeight());
        m2.b bVar = aVar.f1225a;
        m2.k kVar = aVar.f1226b;
        r rVar = aVar.f1227c;
        long j8 = aVar.f1228d;
        aVar.f1225a = cVar;
        aVar.f1226b = layoutDirection;
        aVar.f1227c = dVar2;
        aVar.f1228d = a3;
        dVar2.o();
        b1.e.t(cVar3, u.f10052b, 0L, cVar3.d(), 58);
        b1.e.t(cVar3, l0.d(4278190080L), 0L, v0.d.a(f9, f9), 120);
        b1.e.p(cVar3, l0.d(4278190080L), f9, u3.r.a(f9, f9), 120);
        dVar2.n();
        aVar.f1225a = bVar;
        aVar.f1226b = kVar;
        aVar.f1227c = rVar;
        aVar.f1228d = j8;
        return hVar2;
    }

    public static Map s(x xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator l8 = xVar.l();
        while (l8.hasNext()) {
            String g9 = xVar.g(l8.next());
            Object obj = linkedHashMap.get(g9);
            if (obj == null && !linkedHashMap.containsKey(g9)) {
                obj = new t();
            }
            t tVar = (t) obj;
            tVar.f7966f++;
            linkedHashMap.put(g9, tVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            k.d(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            if ((entry instanceof s6.a) && !(entry instanceof s6.d)) {
                y.f(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((t) entry.getValue()).f7966f));
        }
        return y.c(linkedHashMap);
    }

    public static final String t(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s7.j u(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = e6.u.f2826f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        s7.f c4 = s7.f.f8559b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        s7.w z8 = t6.a.z(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = t7.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = t7.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new s7.j(z8, c4, list2, new z0(4, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new s7.j(z8, c4, list2, new z0(4, list));
    }

    public static final x6.b w(SerialDescriptor serialDescriptor) {
        k.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof m7.b) {
            return null;
        }
        if (serialDescriptor instanceof v0) {
            return w(((v0) serialDescriptor).f6953a);
        }
        return null;
    }

    public static final int x(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        }
        return i8;
    }

    public static void z(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public abstract Object C(Intent intent, int i7);

    public abstract boolean p(q1.h hVar);

    public abstract Intent r(Context context, Object obj);

    public abstract Object v(q1.h hVar);

    public b6.c y(Context context, Object obj) {
        return null;
    }
}
