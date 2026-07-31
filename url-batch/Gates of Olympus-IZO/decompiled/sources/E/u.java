package E;

import B0.C0007d;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0229n;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h1.C0438i;
import j.C0498p;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u0.C0959F;
import u0.C0997t;
import u0.C1008y0;
import u0.C1010z0;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f698e;

    public /* synthetic */ u(int i3, Object obj) {
        this.f697d = i3;
        this.f698e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W.c cVar;
        int i3;
        C0498p c0498p;
        int i4;
        int[] iArr;
        C0498p c0498p2;
        W.c cVar2;
        int[] iArr2;
        switch (this.f697d) {
            case 0:
                v.setRippleState$lambda$2((v) this.f698e);
                return;
            case 1:
                W.c cVar3 = (W.c) this.f698e;
                if (cVar3.f()) {
                    C0997t c0997t = cVar3.f3373d;
                    c0997t.s(true);
                    cVar3.k(c0997t.getSemanticsOwner().a(), cVar3.f3386r);
                    cVar3.i(c0997t.getSemanticsOwner().a(), cVar3.f3386r);
                    C0498p d3 = cVar3.d();
                    int[] iArr3 = d3.f5185b;
                    long[] jArr = d3.f5184a;
                    int length = jArr.length - 2;
                    C0498p c0498p3 = cVar3.f3385q;
                    long j3 = 128;
                    long j4 = 255;
                    int i5 = 8;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j5 = jArr[i6];
                            W.c cVar4 = cVar3;
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j5 & j4) < j3) {
                                        int i9 = iArr3[(i6 << 3) + i8];
                                        C1008y0 c1008y0 = (C1008y0) c0498p3.f(i9);
                                        C1010z0 c1010z0 = (C1010z0) d3.f(i9);
                                        z0.n nVar = c1010z0 != null ? c1010z0.f8507a : null;
                                        if (nVar == null) {
                                            AbstractC0381e.O("no value for specified key");
                                            throw null;
                                        }
                                        z0.i iVar = nVar.f8991d;
                                        int i10 = nVar.f8994g;
                                        LinkedHashMap linkedHashMap = iVar.f8982d;
                                        if (c1008y0 == null) {
                                            Iterator it = iVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                z0.t tVar = z0.q.f9028t;
                                                if (Z1.i.a(key, tVar)) {
                                                    Object obj = linkedHashMap.get(tVar);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    cVar4.j(String.valueOf(list != null ? (C0007d) M1.l.n0(list) : null), i10);
                                                }
                                            }
                                            c0498p2 = d3;
                                            cVar2 = cVar4;
                                        } else {
                                            cVar2 = cVar4;
                                            Iterator it2 = iVar.iterator();
                                            while (it2.hasNext()) {
                                                C0498p c0498p4 = d3;
                                                z0.t tVar2 = (z0.t) ((Map.Entry) it2.next()).getKey();
                                                int[] iArr4 = iArr3;
                                                z0.t tVar3 = z0.q.f9028t;
                                                if (Z1.i.a(tVar2, tVar3)) {
                                                    Object obj2 = c1008y0.f8501a.f8982d.get(tVar3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    C0007d c0007d = list2 != null ? (C0007d) M1.l.n0(list2) : null;
                                                    Object obj3 = linkedHashMap.get(tVar3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C0007d c0007d2 = list3 != null ? (C0007d) M1.l.n0(list3) : null;
                                                    if (!Z1.i.a(c0007d, c0007d2)) {
                                                        cVar2.j(String.valueOf(c0007d2), i10);
                                                    }
                                                }
                                                iArr3 = iArr4;
                                                d3 = c0498p4;
                                            }
                                            c0498p2 = d3;
                                        }
                                        iArr2 = iArr3;
                                    } else {
                                        c0498p2 = d3;
                                        cVar2 = cVar4;
                                        iArr2 = iArr3;
                                    }
                                    j5 >>= 8;
                                    i8++;
                                    d3 = c0498p2;
                                    j3 = 128;
                                    j4 = 255;
                                    int[] iArr5 = iArr2;
                                    cVar4 = cVar2;
                                    i5 = 8;
                                    iArr3 = iArr5;
                                }
                                c0498p = d3;
                                i4 = 1;
                                int[] iArr6 = iArr3;
                                int i11 = i5;
                                cVar = cVar4;
                                iArr = iArr6;
                                if (i7 != i11) {
                                }
                            } else {
                                c0498p = d3;
                                cVar = cVar4;
                                i4 = 1;
                                iArr = iArr3;
                            }
                            if (i6 != length) {
                                i6 += i4;
                                cVar3 = cVar;
                                iArr3 = iArr;
                                d3 = c0498p;
                                i5 = 8;
                                j3 = 128;
                                j4 = 255;
                            }
                        }
                    } else {
                        cVar = cVar3;
                    }
                    c0498p3.a();
                    C0498p d4 = cVar.d();
                    int[] iArr7 = d4.f5185b;
                    Object[] objArr = d4.f5186c;
                    long[] jArr2 = d4.f5184a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j6 = jArr2[i12];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j6 & 255) < 128) {
                                        int i15 = (i12 << 3) + i14;
                                        c0498p3.i(iArr7[i15], new C1008y0(((C1010z0) objArr[i15]).f8507a, cVar.d()));
                                    }
                                    j6 >>= 8;
                                }
                                i3 = 1;
                                if (i13 != 8) {
                                }
                            } else {
                                i3 = 1;
                            }
                            if (i12 != length2) {
                                i12 += i3;
                            }
                        }
                    }
                    cVar.f3386r = new C1008y0(c0997t.getSemanticsOwner().a(), cVar.d());
                    cVar.f3387s = false;
                    return;
                }
                return;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                androidx.lifecycle.C c3 = (androidx.lifecycle.C) this.f698e;
                Z1.i.f(c3, "this$0");
                int i16 = c3.f3939e;
                C0238x c0238x = c3.f3943i;
                if (i16 == 0) {
                    c3.f3940f = true;
                    c0238x.d(EnumC0229n.ON_PAUSE);
                }
                if (c3.f3938d == 0 && c3.f3940f) {
                    c0238x.d(EnumC0229n.ON_STOP);
                    c3.f3941g = true;
                    return;
                }
                return;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                b.j jVar = (b.j) this.f698e;
                Z1.i.f(jVar, "this$0");
                Runnable runnable = jVar.f4158e;
                if (runnable != null) {
                    runnable.run();
                    jVar.f4158e = null;
                    return;
                }
                return;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                b.o oVar = (b.o) this.f698e;
                Z1.i.f(oVar, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!Z1.i.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!Z1.i.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 5:
                P0.q.a((P0.q) this.f698e);
                return;
            case 6:
                j1.q qVar = (j1.q) this.f698e;
                synchronized (qVar.f5277d) {
                    try {
                        if (qVar.f5281h == null) {
                            return;
                        }
                        try {
                            Y0.b b2 = qVar.b();
                            int i17 = b2.f3413e;
                            if (i17 == 2) {
                                synchronized (qVar.f5277d) {
                                }
                            }
                            if (i17 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i17 + ")");
                            }
                            try {
                                int i18 = X0.d.f3391a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                F0.a aVar = qVar.f5276c;
                                Context context = qVar.f5274a;
                                aVar.getClass();
                                Typeface s3 = V0.f.f3354a.s(context, new Y0.b[]{b2});
                                MappedByteBuffer J3 = M1.B.J(qVar.f5274a, b2.f3409a);
                                if (J3 == null || s3 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    A2.k kVar = new A2.k(s3, AbstractC0382a.v(J3));
                                    Trace.endSection();
                                    synchronized (qVar.f5277d) {
                                        try {
                                            AbstractC0416e abstractC0416e = qVar.f5281h;
                                            if (abstractC0416e != null) {
                                                abstractC0416e.y(kVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                    int i19 = X0.d.f3391a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (qVar.f5277d) {
                                try {
                                    AbstractC0416e abstractC0416e2 = qVar.f5281h;
                                    if (abstractC0416e2 != null) {
                                        abstractC0416e2.x(th2);
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0997t c0997t2 = (C0997t) this.f698e;
                c0997t2.f8466u0 = false;
                MotionEvent motionEvent = c0997t2.f8456o0;
                Z1.i.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                c0997t2.F(motionEvent);
                return;
            case 8:
                ((Y1.a) this.f698e).b();
                return;
            default:
                C0959F c0959f = (C0959F) this.f698e;
                Trace.beginSection("measureAndLayout");
                try {
                    c0959f.f8136d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c0959f.f();
                        Trace.endSection();
                        c0959f.f8132J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
