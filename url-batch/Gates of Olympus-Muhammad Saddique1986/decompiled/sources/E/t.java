package E;

import B.Y;
import C0.C0031g;
import I.S;
import a.AbstractC0235a;
import a1.C0243b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0285n;
import b.AbstractActivityC0319o;
import b.ViewTreeObserverOnDrawListenerC0314j;
import h2.AbstractC0508a;
import j.C0542p;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.z0;
import r.AbstractC0856c;
import u0.C1123s;
import u0.I0;
import u0.J0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f998e;

    public /* synthetic */ t(int i3, Object obj) {
        this.f997d = i3;
        this.f998e = obj;
    }

    private final void a() {
        m1.r rVar = (m1.r) this.f998e;
        synchronized (rVar.f6970g) {
            try {
                if (rVar.f6974k == null) {
                    return;
                }
                try {
                    C0243b c2 = rVar.c();
                    int i3 = c2.f4742e;
                    if (i3 == 2) {
                        synchronized (rVar.f6970g) {
                        }
                    }
                    if (i3 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                    }
                    try {
                        int i4 = Z0.d.f4712a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        A1.i iVar = rVar.f6969f;
                        Context context = rVar.f6967d;
                        iVar.getClass();
                        Typeface U3 = X0.f.f4628a.U(context, new C0243b[]{c2});
                        MappedByteBuffer E3 = AbstractC0235a.E(rVar.f6967d, c2.f4738a);
                        if (E3 == null || U3 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            G1.g gVar = new G1.g(U3, AbstractC0508a.O(E3));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (rVar.f6970g) {
                                try {
                                    O2.l lVar = rVar.f6974k;
                                    if (lVar != null) {
                                        lVar.p0(gVar);
                                    }
                                } finally {
                                }
                            }
                            rVar.a();
                        } finally {
                            int i5 = Z0.d.f4712a;
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (rVar.f6970g) {
                        try {
                            O2.l lVar2 = rVar.f6974k;
                            if (lVar2 != null) {
                                lVar2.o0(th2);
                            }
                            rVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [R1.f, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        long[] jArr;
        long[] jArr2;
        C0542p c0542p;
        int[] iArr;
        C0542p c0542p2;
        int[] iArr2;
        int i3;
        switch (this.f997d) {
            case 0:
                u.setRippleState$lambda$2((u) this.f998e);
                return;
            case 1:
                I0.C c2 = (I0.C) this.f998e;
                Boolean bool2 = null;
                c2.f3025n = null;
                K.d dVar = c2.f3024m;
                int i4 = dVar.f3216f;
                if (i4 > 0) {
                    Object[] objArr = dVar.f3214d;
                    bool = null;
                    int i5 = 0;
                    do {
                        I0.B b3 = (I0.B) objArr[i5];
                        int ordinal = b3.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if ((ordinal == 2 || ordinal == 3) && !f2.j.a(bool2, Boolean.FALSE)) {
                                    bool = Boolean.valueOf(b3 == I0.B.f3009f);
                                }
                                i5++;
                            } else {
                                bool2 = Boolean.FALSE;
                            }
                        } else {
                            bool2 = Boolean.TRUE;
                        }
                        bool = bool2;
                        i5++;
                    } while (i5 < i4);
                } else {
                    bool = null;
                }
                dVar.h();
                boolean a3 = f2.j.a(bool2, Boolean.TRUE);
                G1.m mVar = c2.f3013b;
                if (a3) {
                    ((InputMethodManager) mVar.f2117c.getValue()).restartInput((View) mVar.f2116b);
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ((Y) ((Y) mVar.f2118d).f334d).p();
                    } else {
                        ((Y) ((Y) mVar.f2118d).f334d).h();
                    }
                }
                if (f2.j.a(bool2, Boolean.FALSE)) {
                    ((InputMethodManager) mVar.f2117c.getValue()).restartInput((View) mVar.f2116b);
                    return;
                }
                return;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                W.c cVar = (W.c) this.f998e;
                if (cVar.g()) {
                    C1123s c1123s = cVar.f4567d;
                    c1123s.s(true);
                    cVar.k(c1123s.getSemanticsOwner().a(), cVar.f4581r);
                    cVar.i(c1123s.getSemanticsOwner().a(), cVar.f4581r);
                    C0542p f3 = cVar.f();
                    int[] iArr3 = f3.f6303b;
                    long[] jArr3 = f3.f6302a;
                    int length = jArr3.length - 2;
                    C0542p c0542p3 = cVar.f4580q;
                    int i6 = 8;
                    long j3 = -9187201950435737472L;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j4 = jArr3[i7];
                            if ((((~j4) << 7) & j4 & j3) != j3) {
                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j4 & 255) < 128) {
                                        int i10 = iArr3[(i7 << 3) + i9];
                                        I0 i02 = (I0) c0542p3.f(i10);
                                        J0 j02 = (J0) f3.f(i10);
                                        A0.p pVar = j02 != null ? j02.f9202a : null;
                                        if (pVar == null) {
                                            z0.p("no value for specified key");
                                            throw null;
                                        }
                                        A0.i iVar = pVar.f142d;
                                        int i11 = pVar.f145g;
                                        c0542p2 = f3;
                                        LinkedHashMap linkedHashMap = iVar.f129d;
                                        if (i02 == null) {
                                            Iterator it = iVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                int[] iArr4 = iArr3;
                                                A0.v vVar = A0.s.f186u;
                                                if (f2.j.a(key, vVar)) {
                                                    Object obj = linkedHashMap.get(vVar);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    cVar.j(String.valueOf(list != null ? (C0031g) S1.l.L0(list) : null), i11);
                                                }
                                                iArr3 = iArr4;
                                            }
                                            iArr2 = iArr3;
                                        } else {
                                            iArr2 = iArr3;
                                            Iterator it2 = iVar.iterator();
                                            while (it2.hasNext()) {
                                                A0.v vVar2 = (A0.v) ((Map.Entry) it2.next()).getKey();
                                                Iterator it3 = it2;
                                                A0.v vVar3 = A0.s.f186u;
                                                if (f2.j.a(vVar2, vVar3)) {
                                                    Object obj2 = i02.f9199a.f129d.get(vVar3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    C0031g c0031g = list2 != null ? (C0031g) S1.l.L0(list2) : null;
                                                    Object obj3 = linkedHashMap.get(vVar3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C0031g c0031g2 = list3 != null ? (C0031g) S1.l.L0(list3) : null;
                                                    if (!f2.j.a(c0031g, c0031g2)) {
                                                        cVar.j(String.valueOf(c0031g2), i11);
                                                    }
                                                }
                                                it2 = it3;
                                            }
                                        }
                                        i3 = 8;
                                    } else {
                                        c0542p2 = f3;
                                        iArr2 = iArr3;
                                        i3 = i6;
                                    }
                                    j4 >>= i3;
                                    i9++;
                                    i6 = i3;
                                    f3 = c0542p2;
                                    iArr3 = iArr2;
                                }
                                c0542p = f3;
                                iArr = iArr3;
                                if (i8 != i6) {
                                }
                            } else {
                                c0542p = f3;
                                iArr = iArr3;
                            }
                            if (i7 != length) {
                                i7++;
                                f3 = c0542p;
                                iArr3 = iArr;
                                i6 = 8;
                                j3 = -9187201950435737472L;
                            }
                        }
                    }
                    c0542p3.a();
                    C0542p f4 = cVar.f();
                    int[] iArr5 = f4.f6303b;
                    Object[] objArr2 = f4.f6304c;
                    long[] jArr4 = f4.f6302a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j5 = jArr4[i12];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((j5 & 255) < 128) {
                                        int i15 = (i12 << 3) + i14;
                                        jArr2 = jArr4;
                                        c0542p3.i(iArr5[i15], new I0(((J0) objArr2[i15]).f9202a, cVar.f()));
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    j5 >>= 8;
                                    i14++;
                                    jArr4 = jArr2;
                                }
                                jArr = jArr4;
                                if (i13 != 8) {
                                }
                            } else {
                                jArr = jArr4;
                            }
                            if (i12 != length2) {
                                i12++;
                                jArr4 = jArr;
                            }
                        }
                    }
                    cVar.f4581r = new I0(c1123s.getSemanticsOwner().a(), cVar.f());
                    cVar.f4582s = false;
                    return;
                }
                return;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                androidx.lifecycle.C c3 = (androidx.lifecycle.C) this.f998e;
                f2.j.f(c3, "this$0");
                int i16 = c3.f5140e;
                C0294x c0294x = c3.f5144i;
                if (i16 == 0) {
                    c3.f5141f = true;
                    c0294x.d(EnumC0285n.ON_PAUSE);
                }
                if (c3.f5139d == 0 && c3.f5141f) {
                    c0294x.d(EnumC0285n.ON_STOP);
                    c3.f5142g = true;
                    return;
                }
                return;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ViewTreeObserverOnDrawListenerC0314j viewTreeObserverOnDrawListenerC0314j = (ViewTreeObserverOnDrawListenerC0314j) this.f998e;
                f2.j.f(viewTreeObserverOnDrawListenerC0314j, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0314j.f5293e;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0314j.f5293e = null;
                    return;
                }
                return;
            case 5:
                AbstractActivityC0319o abstractActivityC0319o = (AbstractActivityC0319o) this.f998e;
                f2.j.f(abstractActivityC0319o, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!f2.j.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!f2.j.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 6:
                R0.x.a((R0.x) this.f998e);
                return;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                View view = (View) this.f998e;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                a();
                return;
            case AbstractC0856c.f8037c /* 9 */:
                C1123s c1123s2 = (C1123s) this.f998e;
                c1123s2.v0 = false;
                MotionEvent motionEvent = c1123s2.f9502p0;
                f2.j.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                c1123s2.F(motionEvent);
                return;
            case AbstractC0856c.f8039e /* 10 */:
                u0.E e5 = (u0.E) this.f998e;
                Trace.beginSection("measureAndLayout");
                try {
                    e5.f9151d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        e5.f();
                        Trace.endSection();
                        e5.f9147J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            default:
                w1.q qVar = (w1.q) this.f998e;
                synchronized (qVar.f9900l) {
                    qVar.f9895g = false;
                    S s3 = qVar.f9897i;
                    synchronized (s3) {
                        Arrays.fill((boolean[]) s3.f2754c, false);
                        s3.f2752a = true;
                    }
                    A1.k kVar = qVar.f9896h;
                    if (kVar != null) {
                        kVar.close();
                    }
                }
                return;
        }
    }
}
