package androidx.lifecycle;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s1.f2;
import s1.g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f953g;

    public /* synthetic */ c0(int i7, Object obj) {
        this.f952f = i7;
        this.f953g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [d6.g, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        Boolean bool2;
        z4.i iVar;
        char c4;
        long j8;
        long[] jArr;
        long[] jArr2;
        char c6;
        i.p pVar;
        int[] iArr;
        char c9;
        i.p pVar2;
        int i7;
        int[] iArr2;
        int i8;
        char c10;
        char c11 = 2;
        switch (this.f952f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) this.f953g;
                x xVar = f0Var.f969k;
                if (f0Var.f965g == 0) {
                    f0Var.f966h = true;
                    xVar.d(n.ON_PAUSE);
                }
                if (f0Var.f964f == 0 && f0Var.f966h) {
                    xVar.d(n.ON_STOP);
                    f0Var.f967i = true;
                    return;
                }
                return;
            case 1:
                b.k kVar = (b.k) this.f953g;
                r6.k.f(kVar, "this$0");
                Runnable runnable = kVar.f1172g;
                if (runnable != null) {
                    runnable.run();
                    kVar.f1172g = null;
                    return;
                }
                return;
            case 2:
                p2.s.c((p2.s) this.f953g);
                return;
            case 3:
                View view = (View) this.f953g;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 4:
                c0.n.setRippleState$lambda$2((c0.n) this.f953g);
                return;
            case 5:
                g2.z zVar = (g2.z) this.f953g;
                b1.b bVar = zVar.f4076b;
                zVar.f4088n = null;
                i0.d dVar = zVar.f4087m;
                int i9 = dVar.f4842h;
                if (i9 > 0) {
                    Object[] objArr = dVar.f4840f;
                    int i10 = 0;
                    Boolean bool3 = null;
                    bool2 = null;
                    do {
                        g2.y yVar = (g2.y) objArr[i10];
                        int ordinal = yVar.ordinal();
                        if (ordinal == 0) {
                            bool3 = Boolean.TRUE;
                        } else if (ordinal != 1) {
                            if ((ordinal == 2 || ordinal == 3) && !r6.k.a(bool3, Boolean.FALSE)) {
                                bool2 = Boolean.valueOf(yVar == g2.y.f4072h);
                            }
                            i10++;
                        } else {
                            bool3 = Boolean.FALSE;
                        }
                        bool2 = bool3;
                        i10++;
                    } while (i10 < i9);
                    bool = bool3;
                } else {
                    bool = null;
                    bool2 = null;
                }
                dVar.h();
                if (r6.k.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) bVar.f1231h.getValue()).restartInput((View) bVar.f1230g);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((b6.c) ((b6.c) bVar.f1232i).f1394g).A();
                    } else {
                        ((b6.c) ((b6.c) bVar.f1232i).f1394g).r();
                    }
                }
                if (r6.k.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) bVar.f1231h.getValue()).restartInput((View) bVar.f1230g);
                    return;
                }
                return;
            case 6:
                final j5.n nVar = (j5.n) this.f953g;
                ScheduledExecutorService scheduledExecutorService = nVar.f5098w;
                b1.b bVar2 = nVar.f5099x;
                j5.j jVar = nVar.f5083h;
                a.a.z(jVar == j5.j.f5060f, "Not in disconnected state: %s", jVar);
                nVar.f5083h = j5.j.f5061g;
                final long j9 = nVar.A + 1;
                nVar.A = j9;
                z4.c cVar = new z4.c();
                bVar2.d("Trying to fetch auth token", null, new Object[0]);
                b6.d dVar2 = nVar.f5096u;
                int i11 = 18;
                ((h5.b) dVar2.f1396b).b(new androidx.room.c((ScheduledExecutorService) dVar2.f1397c, i11, new j5.e(cVar, 0)));
                z4.i iVar2 = cVar.f10092a;
                z4.c cVar2 = new z4.c();
                bVar2.d("Trying to fetch app check token", null, new Object[0]);
                b6.d dVar3 = nVar.f5097v;
                ((h5.b) dVar3.f1396b).b(new androidx.room.c((ScheduledExecutorService) dVar3.f1397c, i11, new j5.e(cVar2, 1)));
                z4.i iVar3 = cVar2.f10092a;
                List<z4.i> asList = Arrays.asList(iVar2, iVar3);
                if (asList == null || asList.isEmpty()) {
                    iVar = new z4.i();
                    iVar.d(null);
                } else {
                    Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        if (((z4.i) it.next()) == null) {
                            throw new NullPointerException("null tasks are not accepted");
                        }
                    }
                    iVar = new z4.i();
                    z4.e eVar = new z4.e(asList.size(), iVar);
                    for (z4.i iVar4 : asList) {
                        z4.g gVar = z4.d.f10094b;
                        iVar4.getClass();
                        a0.s0 s0Var = iVar4.f10109b;
                        s0Var.i(new z4.f((Executor) gVar, (z4.b) eVar));
                        iVar4.f();
                        s0Var.i(new z4.f((Executor) gVar, (z4.a) eVar));
                        iVar4.f();
                        s0Var.i(new z4.f((Executor) gVar, eVar));
                        iVar4.f();
                    }
                }
                a0.s0 s0Var2 = iVar.f10109b;
                s0Var2.i(new z4.f(scheduledExecutorService, new f5.b(nVar, j9, iVar2, iVar3)));
                iVar.f();
                s0Var2.i(new z4.f(scheduledExecutorService, new z4.a() { // from class: j5.c
                    @Override // z4.a
                    public final void a(Exception exc) {
                        n nVar2 = n.this;
                        b1.b bVar3 = nVar2.f5099x;
                        if (j9 != nVar2.A) {
                            bVar3.d("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
                            return;
                        }
                        nVar2.f5083h = j.f5060f;
                        bVar3.d("Error fetching token: " + exc, null, new Object[0]);
                        nVar2.m();
                    }
                }));
                iVar.f();
                return;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                l3.s sVar = (l3.s) this.f953g;
                synchronized (sVar.f5928d) {
                    try {
                        if (sVar.f5932h == null) {
                            return;
                        }
                        try {
                            y2.b c12 = sVar.c();
                            int i12 = c12.f9895e;
                            if (i12 == 2) {
                                synchronized (sVar.f5928d) {
                                }
                            }
                            if (i12 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                            }
                            try {
                                int i13 = x2.g.f9671a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                j4.i iVar5 = sVar.f5927c;
                                Context context = sVar.f5925a;
                                iVar5.getClass();
                                Typeface e9 = v2.f.f9107a.e(context, new y2.b[]{c12});
                                MappedByteBuffer k8 = u3.r.k(sVar.f5925a, c12.f9891a);
                                if (k8 == null || e9 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    g3.k kVar2 = new g3.k(e9, r4.a.Q(k8));
                                    Trace.endSection();
                                    synchronized (sVar.f5928d) {
                                        try {
                                            a8.m mVar = sVar.f5932h;
                                            if (mVar != null) {
                                                mVar.G(kVar2);
                                            }
                                        } finally {
                                        }
                                    }
                                    sVar.b();
                                    return;
                                } finally {
                                    int i14 = x2.g.f9671a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (sVar.f5928d) {
                                try {
                                    a8.m mVar2 = sVar.f5932h;
                                    if (mVar2 != null) {
                                        mVar2.F(th2);
                                    }
                                    sVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                j5.e eVar2 = (j5.e) this.f953g;
                switch (eVar2.f5049a) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        eVar2.f5050b.f10092a.d(null);
                        return;
                    default:
                        eVar2.f5050b.f10092a.d(null);
                        return;
                }
            case q.c.f7259c /* 9 */:
                Iterator it2 = ((ArrayList) ((n3.k) this.f953g).f6539e).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case q.c.f7261e /* 10 */:
                s1.r rVar = (s1.r) this.f953g;
                rVar.f8400x0 = false;
                MotionEvent motionEvent = rVar.f8388r0;
                r6.k.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                rVar.E(motionEvent);
                return;
            case 11:
                s1.c0 c0Var = (s1.c0) this.f953g;
                Trace.beginSection("measureAndLayout");
                try {
                    c0Var.f8160d.q(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c0Var.f();
                        Trace.endSection();
                        c0Var.J = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            default:
                u0.c cVar3 = (u0.c) this.f953g;
                boolean e10 = cVar3.e();
                i.p pVar3 = cVar3.f8959s;
                s1.r rVar2 = cVar3.f8946f;
                if (e10) {
                    rVar2.q(true);
                    cVar3.i(rVar2.getSemanticsOwner().a(), cVar3.f8960t);
                    cVar3.g(rVar2.getSemanticsOwner().a(), cVar3.f8960t);
                    i.p d8 = cVar3.d();
                    int[] iArr3 = d8.f4771b;
                    long[] jArr3 = d8.f4770a;
                    int length = jArr3.length - 2;
                    char c13 = 7;
                    int i15 = 8;
                    if (length >= 0) {
                        int i16 = 0;
                        j8 = 255;
                        while (true) {
                            long j10 = jArr3[i16];
                            if ((((~j10) << c13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j10 & 255) < 128) {
                                        c10 = c13;
                                        int i19 = iArr3[(i16 << 3) + i18];
                                        c9 = c11;
                                        f2 f2Var = (f2) pVar3.f(i19);
                                        g2 g2Var = (g2) d8.f(i19);
                                        y1.m mVar3 = g2Var != null ? g2Var.f8236a : null;
                                        if (mVar3 == null) {
                                            a.a.N("no value for specified key");
                                            throw null;
                                        }
                                        i8 = i15;
                                        int i20 = mVar3.f9843g;
                                        y1.i iVar6 = mVar3.f9840d;
                                        pVar2 = d8;
                                        LinkedHashMap linkedHashMap = iVar6.f9832f;
                                        if (f2Var == null) {
                                            Iterator it3 = iVar6.iterator();
                                            while (it3.hasNext()) {
                                                Object key = ((Map.Entry) it3.next()).getKey();
                                                Iterator it4 = it3;
                                                y1.s sVar2 = y1.p.f9879u;
                                                if (r6.k.a(key, sVar2)) {
                                                    Object obj = linkedHashMap.get(sVar2);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    cVar3.h(String.valueOf(list != null ? (a2.g) e6.l.i0(list) : null), i20);
                                                }
                                                it3 = it4;
                                            }
                                        } else {
                                            Iterator it5 = iVar6.iterator();
                                            while (it5.hasNext()) {
                                                int i21 = i18;
                                                y1.s sVar3 = (y1.s) ((Map.Entry) it5.next()).getKey();
                                                int[] iArr4 = iArr3;
                                                y1.s sVar4 = y1.p.f9879u;
                                                if (r6.k.a(sVar3, sVar4)) {
                                                    Object obj2 = f2Var.f8232a.f9832f.get(sVar4);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    a2.g gVar2 = list2 != null ? (a2.g) e6.l.i0(list2) : null;
                                                    Object obj3 = linkedHashMap.get(sVar4);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    a2.g gVar3 = list3 != null ? (a2.g) e6.l.i0(list3) : null;
                                                    if (!r6.k.a(gVar2, gVar3)) {
                                                        cVar3.h(String.valueOf(gVar3), i20);
                                                    }
                                                }
                                                iArr3 = iArr4;
                                                i18 = i21;
                                            }
                                        }
                                        i7 = i18;
                                        iArr2 = iArr3;
                                    } else {
                                        c9 = c11;
                                        pVar2 = d8;
                                        i7 = i18;
                                        iArr2 = iArr3;
                                        i8 = i15;
                                        c10 = c13;
                                    }
                                    j10 >>= i8;
                                    i18 = i7 + 1;
                                    i15 = i8;
                                    c13 = c10;
                                    c11 = c9;
                                    d8 = pVar2;
                                    iArr3 = iArr2;
                                }
                                c6 = c11;
                                pVar = d8;
                                iArr = iArr3;
                                c4 = c13;
                                if (i17 != i15) {
                                }
                            } else {
                                c6 = c11;
                                pVar = d8;
                                iArr = iArr3;
                                c4 = c13;
                            }
                            if (i16 != length) {
                                i16++;
                                c13 = c4;
                                c11 = c6;
                                d8 = pVar;
                                iArr3 = iArr;
                                i15 = 8;
                            }
                        }
                    } else {
                        c4 = 7;
                        j8 = 255;
                    }
                    pVar3.a();
                    i.p d9 = cVar3.d();
                    int[] iArr5 = d9.f4771b;
                    Object[] objArr2 = d9.f4772c;
                    long[] jArr4 = d9.f4770a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i22 = 0;
                        while (true) {
                            long j11 = jArr4[i22];
                            if ((((~j11) << c4) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j11 & j8) < 128) {
                                        int i25 = (i22 << 3) + i24;
                                        jArr2 = jArr4;
                                        pVar3.i(iArr5[i25], new f2(((g2) objArr2[i25]).f8236a, cVar3.d()));
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    j11 >>= 8;
                                    i24++;
                                    jArr4 = jArr2;
                                }
                                jArr = jArr4;
                                if (i23 != 8) {
                                }
                            } else {
                                jArr = jArr4;
                            }
                            if (i22 != length2) {
                                i22++;
                                jArr4 = jArr;
                            }
                        }
                    }
                    cVar3.f8960t = new f2(rVar2.getSemanticsOwner().a(), cVar3.d());
                    cVar3.f8961u = false;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c0(j5.n nVar, boolean z8, boolean z9) {
        this.f952f = 6;
        this.f953g = nVar;
    }
}
