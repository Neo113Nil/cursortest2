package C;

import A0.C0036g;
import B1.C0097d;
import a2.C0413b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0474n;
import c2.C0538b;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.RequestError;
import e2.C0563e;
import e2.EnumC0568j;
import j2.C0712b;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import s0.C1118D;
import s0.C1166s;
import s0.J0;
import s0.K0;
import w2.C1294c;
import z2.C1403G;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1127e;

    public /* synthetic */ t(int i2, Object obj) {
        this.f1126d = i2;
        this.f1127e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, y2.j] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        i.q qVar;
        int i4;
        i.q qVar2;
        int i5;
        U1.k kVar;
        int i6 = 20;
        y0.n nVar = null;
        switch (this.f1126d) {
            case 0:
                u.setRippleState$lambda$2((u) this.f1127e);
                return;
            case 1:
                G0.B b4 = (G0.B) this.f1127e;
                b4.f3021n = null;
                M2.E e4 = new M2.E();
                M2.E e5 = new M2.E();
                I.d dVar = b4.f3020m;
                int i7 = dVar.f3332i;
                if (i7 > 0) {
                    Object[] objArr = dVar.f3330d;
                    int i8 = 0;
                    do {
                        G0.A a4 = (G0.A) objArr[i8];
                        int ordinal = a4.ordinal();
                        if (ordinal == 0) {
                            Boolean bool = Boolean.TRUE;
                            e4.f3580d = bool;
                            e5.f3580d = bool;
                        } else if (ordinal == 1) {
                            Boolean bool2 = Boolean.FALSE;
                            e4.f3580d = bool2;
                            e5.f3580d = bool2;
                        } else if ((ordinal == 2 || ordinal == 3) && !Intrinsics.a(e4.f3580d, Boolean.FALSE)) {
                            e5.f3580d = Boolean.valueOf(a4 == G0.A.f3005i);
                        }
                        i8++;
                    } while (i8 < i7);
                }
                dVar.g();
                boolean a5 = Intrinsics.a(e4.f3580d, Boolean.TRUE);
                C0097d c0097d = b4.f3009b;
                if (a5) {
                    ((InputMethodManager) c0097d.f988i.getValue()).restartInput((View) c0097d.f987e);
                }
                Boolean bool3 = (Boolean) e5.f3580d;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((C1294c) ((C1294c) c0097d.f989j).f11388d).p();
                    } else {
                        ((C1294c) ((C1294c) c0097d.f989j).f11388d).g();
                    }
                }
                if (Intrinsics.a(e4.f3580d, Boolean.FALSE)) {
                    ((InputMethodManager) c0097d.f988i.getValue()).restartInput((View) c0097d.f987e);
                    return;
                }
                return;
            case 2:
                U.c cVar = (U.c) this.f1127e;
                if (cVar.g()) {
                    C1166s c1166s = cVar.f4065d;
                    c1166s.r(true);
                    cVar.k(c1166s.getSemanticsOwner().a(), cVar.f4079u);
                    cVar.i(c1166s.getSemanticsOwner().a(), cVar.f4079u);
                    i.q e6 = cVar.e();
                    int[] iArr = e6.f6941b;
                    long[] jArr = e6.f6940a;
                    int length = jArr.length - 2;
                    i.q qVar3 = cVar.f4078t;
                    long j4 = 255;
                    int i9 = 8;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j5 = jArr[i10];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j5 & j4) < 128) {
                                        int i13 = iArr[(i10 << 3) + i12];
                                        J0 j02 = (J0) qVar3.f(i13);
                                        K0 k02 = (K0) e6.f(i13);
                                        y0.n nVar2 = k02 != null ? k02.f10067a : nVar;
                                        if (nVar2 == null) {
                                            AbstractC0864b.E("no value for specified key");
                                            throw null;
                                        }
                                        y0.i iVar = nVar2.f11587d;
                                        int i14 = nVar2.f11590g;
                                        LinkedHashMap linkedHashMap = iVar.f11576d;
                                        if (j02 == null) {
                                            Iterator it = iVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                Iterator it2 = it;
                                                y0.t tVar = y0.q.f11632u;
                                                if (Intrinsics.a(key, tVar)) {
                                                    Object obj = linkedHashMap.get(tVar);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    cVar.j(i14, String.valueOf(list != null ? (C0036g) C1403G.r(list) : null));
                                                }
                                                it = it2;
                                            }
                                        } else {
                                            Iterator it3 = iVar.iterator();
                                            while (it3.hasNext()) {
                                                Iterator it4 = it3;
                                                y0.t tVar2 = (y0.t) ((Map.Entry) it3.next()).getKey();
                                                i.q qVar4 = e6;
                                                y0.t tVar3 = y0.q.f11632u;
                                                if (Intrinsics.a(tVar2, tVar3)) {
                                                    Object obj2 = j02.f10063a.f11576d.get(tVar3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    C0036g c0036g = list2 != null ? (C0036g) C1403G.r(list2) : null;
                                                    Object obj3 = linkedHashMap.get(tVar3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C0036g c0036g2 = list3 != null ? (C0036g) C1403G.r(list3) : null;
                                                    if (!Intrinsics.a(c0036g, c0036g2)) {
                                                        cVar.j(i14, String.valueOf(c0036g2));
                                                    }
                                                }
                                                e6 = qVar4;
                                                it3 = it4;
                                            }
                                        }
                                        qVar2 = e6;
                                        i5 = 8;
                                    } else {
                                        qVar2 = e6;
                                        i5 = i9;
                                    }
                                    j5 >>= i5;
                                    i12++;
                                    i9 = i5;
                                    e6 = qVar2;
                                    nVar = null;
                                    j4 = 255;
                                }
                                qVar = e6;
                                i4 = 1;
                                if (i11 != i9) {
                                }
                            } else {
                                qVar = e6;
                                i4 = 1;
                            }
                            if (i10 != length) {
                                i10 += i4;
                                e6 = qVar;
                                nVar = null;
                                i9 = 8;
                                j4 = 255;
                            }
                        }
                    }
                    qVar3.a();
                    i.q e7 = cVar.e();
                    int[] iArr2 = e7.f6941b;
                    Object[] objArr2 = e7.f6942c;
                    long[] jArr2 = e7.f6940a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j6 = jArr2[i15];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j6 & 255) < 128) {
                                        int i18 = (i15 << 3) + i17;
                                        qVar3.i(iArr2[i18], new J0(((K0) objArr2[i18]).f10067a, cVar.e()));
                                    }
                                    j6 >>= 8;
                                }
                                i2 = 1;
                                if (i16 != 8) {
                                }
                            } else {
                                i2 = 1;
                            }
                            if (i15 != length2) {
                                i15 += i2;
                            }
                        }
                    }
                    cVar.f4079u = new J0(c1166s.getSemanticsOwner().a(), cVar.e());
                    cVar.f4080v = false;
                    return;
                }
                return;
            case 3:
                View view = (View) this.f1127e;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 4:
                androidx.lifecycle.E this$0 = (androidx.lifecycle.E) this.f1127e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i19 = this$0.f5422e;
                C0483x c0483x = this$0.f5426l;
                if (i19 == 0) {
                    this$0.f5423i = true;
                    c0483x.d(EnumC0474n.ON_PAUSE);
                }
                if (this$0.f5421d == 0 && this$0.f5423i) {
                    c0483x.d(EnumC0474n.ON_STOP);
                    this$0.f5424j = true;
                    return;
                }
                return;
            case 5:
                b.k this$02 = (b.k) this.f1127e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Runnable runnable = this$02.f5543e;
                if (runnable != null) {
                    runnable.run();
                    this$02.f5543e = null;
                    return;
                }
                return;
            case 6:
                P0.y.a((P0.y) this.f1127e);
                return;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AFLogger.AFInAppEventType((Function1) this.f1127e);
                return;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                final e2.n nVar3 = (e2.n) this.f1127e;
                EnumC0568j enumC0568j = nVar3.f6219h;
                M1.a.F(enumC0568j == EnumC0568j.f6191d, "Not in disconnected state: %s", enumC0568j);
                nVar3.f6219h = EnumC0568j.f6192e;
                final long j7 = nVar3.f6208A + 1;
                nVar3.f6208A = j7;
                U1.e eVar = new U1.e();
                C0097d c0097d2 = nVar3.f6235x;
                c0097d2.d("Trying to fetch auth token", null, new Object[0]);
                C0563e c0563e = new C0563e(eVar, 0);
                Z1.q qVar5 = nVar3.f6232u;
                ((C0538b) qVar5.f4596b).b(new y.t((C0712b) qVar5.f4597c, i6, c0563e));
                U1.e eVar2 = new U1.e();
                c0097d2.d("Trying to fetch app check token", null, new Object[0]);
                C0563e c0563e2 = new C0563e(eVar2, 1);
                Z1.q qVar6 = nVar3.f6233v;
                ((C0538b) qVar6.f4596b).b(new y.t((C0712b) qVar6.f4597c, i6, c0563e2));
                U1.k kVar2 = eVar.f4107a;
                U1.k kVar3 = eVar2.f4107a;
                List<U1.d> asList = Arrays.asList(kVar2, kVar3);
                if (asList == null || asList.isEmpty()) {
                    kVar = new U1.k();
                    kVar.h(null);
                } else {
                    Iterator it5 = asList.iterator();
                    while (it5.hasNext()) {
                        if (((U1.d) it5.next()) == null) {
                            throw new NullPointerException("null tasks are not accepted");
                        }
                    }
                    kVar = new U1.k();
                    U1.g gVar = new U1.g(asList.size(), kVar);
                    for (U1.d dVar2 : asList) {
                        U1.i iVar2 = U1.f.f4109b;
                        dVar2.b(iVar2, gVar);
                        dVar2.a(iVar2, gVar);
                        U1.k kVar4 = (U1.k) dVar2;
                        kVar4.f4124b.h(new U1.h(iVar2, gVar));
                        kVar4.j();
                    }
                }
                C0413b c0413b = new C0413b(nVar3, j7, kVar2, kVar3);
                C0712b c0712b = nVar3.f6234w;
                kVar.b(c0712b, c0413b);
                kVar.a(c0712b, new U1.b() { // from class: e2.c
                    @Override // U1.b
                    public final void a(Exception exc) {
                        n nVar4 = n.this;
                        long j8 = nVar4.f6208A;
                        long j9 = j7;
                        C0097d c0097d3 = nVar4.f6235x;
                        if (j9 != j8) {
                            c0097d3.d("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
                            return;
                        }
                        nVar4.f6219h = EnumC0568j.f6191d;
                        c0097d3.d("Error fetching token: " + exc, null, new Object[0]);
                        nVar4.m();
                    }
                });
                return;
            case AbstractC1024c.f9242c /* 9 */:
                C0563e c0563e3 = (C0563e) this.f1127e;
                switch (c0563e3.f6180a) {
                    case 0:
                        c0563e3.f6181b.f4107a.h(null);
                        return;
                    default:
                        c0563e3.f6181b.f4107a.h(null);
                        return;
                }
            case 10:
                k1.n nVar4 = (k1.n) this.f1127e;
                synchronized (nVar4.f7400d) {
                    try {
                        if (nVar4.f7404h == null) {
                            return;
                        }
                        try {
                            Y0.c c4 = nVar4.c();
                            int i20 = c4.f4397e;
                            if (i20 == 2) {
                                synchronized (nVar4.f7400d) {
                                }
                            }
                            if (i20 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i20 + ")");
                            }
                            try {
                                int i21 = X0.g.f4358a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                E1.i iVar3 = nVar4.f7399c;
                                Context context = nVar4.f7397a;
                                iVar3.getClass();
                                Typeface m4 = V0.f.f4148a.m(context, new Y0.c[]{c4});
                                MappedByteBuffer E3 = j0.c.E(nVar4.f7397a, c4.f4393a);
                                if (E3 == null || m4 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    Y0.b bVar = new Y0.b(m4, j0.c.I(E3));
                                    Trace.endSection();
                                    synchronized (nVar4.f7400d) {
                                        try {
                                            M1.a aVar = nVar4.f7404h;
                                            if (aVar != null) {
                                                aVar.L(bVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    nVar4.b();
                                    return;
                                } finally {
                                    int i22 = X0.g.f4358a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (nVar4.f7400d) {
                                try {
                                    M1.a aVar2 = nVar4.f7404h;
                                    if (aVar2 != null) {
                                        aVar2.K(th2);
                                    }
                                    nVar4.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case RequestError.STOP_TRACKING /* 11 */:
                Iterator it6 = ((ArrayList) ((m1.k) this.f1127e).f8283e).iterator();
                if (it6.hasNext()) {
                    it6.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 12:
                C1166s c1166s2 = (C1166s) this.f1127e;
                c1166s2.f10382y0 = false;
                MotionEvent motionEvent = c1166s2.f10371s0;
                Intrinsics.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                c1166s2.E(motionEvent);
                return;
            default:
                C1118D c1118d = (C1118D) this.f1127e;
                Trace.beginSection("measureAndLayout");
                try {
                    c1118d.f10011d.r(true);
                    Unit unit = Unit.f7487a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c1118d.f();
                        Trace.endSection();
                        c1118d.f10007J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }

    public /* synthetic */ t(e2.n nVar, boolean z4, boolean z5) {
        this.f1126d = 8;
        this.f1127e = nVar;
    }
}
