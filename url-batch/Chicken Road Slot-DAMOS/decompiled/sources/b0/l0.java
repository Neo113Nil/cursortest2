package b0;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import n0.m2;
import n0.v1;
import n0.z1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f864e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f865i;

    public /* synthetic */ l0(int i3, Object obj, Object obj2) {
        this.f863d = i3;
        this.f865i = obj;
        this.f864e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0470, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r2, k5.c.j(null, r3, r4)) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x043e, code lost:
    
        if (r2 < 8) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04a1  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        androidx.lifecycle.w g;
        Pair pair;
        Object b0Var;
        Object invoke;
        Object obj2;
        Typeface i3;
        Typeface typeface;
        int i10;
        String str;
        int i11 = 6;
        int i12 = 7;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        ld.a aVar = null;
        switch (this.f863d) {
            case 0:
                m0 m0Var = (m0) this.f865i;
                a2.o0 o0Var = (a2.o0) this.f864e;
                a2.n0 n0Var = (a2.n0) obj;
                boolean z10 = m0Var.E;
                float f3 = m0Var.C;
                if (z10) {
                    a2.n0.p(n0Var, o0Var, n0Var.y(f3), n0Var.y(m0Var.D));
                } else {
                    n0Var.h(o0Var, n0Var.y(f3), n0Var.y(m0Var.D), 0.0f);
                }
                return Unit.f5554a;
            case 1:
                o0 o0Var2 = (o0) this.f865i;
                a2.o0 o0Var3 = (a2.o0) this.f864e;
                a2.n0 n0Var2 = (a2.n0) obj;
                boolean z11 = o0Var2.G;
                float f10 = o0Var2.C;
                if (z11) {
                    a2.n0.p(n0Var2, o0Var3, n0Var2.y(f10), n0Var2.y(o0Var2.D));
                } else {
                    n0Var2.h(o0Var3, n0Var2.y(f10), n0Var2.y(o0Var2.D), 0.0f);
                }
                return Unit.f5554a;
            case 2:
                e1 e1Var = (e1) this.f865i;
                View view = (View) this.f864e;
                e1Var.a(view);
                return new d1(0, e1Var, view);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                f.b bVar = (f.b) this.f865i;
                e.f fVar = (e.f) this.f864e;
                bVar.a(fVar);
                return new d1(1, bVar, fVar);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                f.b bVar2 = (f.b) this.f865i;
                e.h hVar = (e.h) this.f864e;
                bVar2.a(hVar);
                return new d1(2, bVar2, hVar);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                h9.c cVar = (h9.c) this.f865i;
                h9.a aVar2 = (h9.a) this.f864e;
                i5.a aVar3 = (i5.a) obj;
                aVar3.getClass();
                u8.d dVar = cVar.f4494b;
                i5.c K = aVar3.K("INSERT OR ABORT INTO `high_scores` (`id`,`date`,`score`) VALUES (nullif(?, 0),?,?)");
                try {
                    K.getClass();
                    K.f(1, aVar2.f4489a);
                    K.q(aVar2.f4490b);
                    K.f(3, aVar2.f4491c);
                    K.E();
                    cf.c.m(K, null);
                    return Unit.f5554a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cf.c.m(K, th);
                        throw th2;
                    }
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((he.d) this.f865i).f4534i.removeCallbacks((a6.f) this.f864e);
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                i9.e eVar = (i9.e) this.f865i;
                n0.z0 z0Var = (n0.z0) this.f864e;
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                webView.setLayerType(2, null);
                CookieManager.getInstance().setAcceptCookie(true);
                z0Var.setValue(webView);
                webView.setScrollBarStyle(0);
                webView.setWebViewClient(eVar);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://policy.roboramprush.com");
                return webView;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((n0.y0) this.f865i).f6856i.add(new n0.v0(obj, (ie.o) this.f864e));
                return Unit.f5554a;
            case 9:
                Set set = (Set) this.f865i;
                n0.y0 y0Var = (n0.y0) this.f864e;
                if (set.contains(obj)) {
                    s.h0 h0Var = y0Var.f6855e;
                    s.i0 i0Var = y0Var.f6857r;
                    Object g2 = h0Var.g(obj);
                    if (g2 != null) {
                        if (g2 instanceof s.i0) {
                            s.i0 i0Var2 = (s.i0) g2;
                            Object[] objArr = i0Var2.f8320b;
                            long[] jArr = i0Var2.f8319a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j = jArr[i16];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((255 & j) < 128) {
                                                i0Var.a((ie.o) objArr[(i16 << 3) + i18]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i17 != 8) {
                                        }
                                    }
                                    if (i16 != length) {
                                        i16++;
                                    }
                                }
                            }
                        } else {
                            i0Var.a((ie.o) g2);
                        }
                    }
                }
                return Unit.f5554a;
            case 10:
                n0.q qVar = (n0.q) this.f865i;
                s.i0 i0Var3 = (s.i0) this.f864e;
                qVar.y(obj);
                if (i0Var3 != null) {
                    i0Var3.a(obj);
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                z1 z1Var = (z1) this.f865i;
                Throwable th3 = (Throwable) this.f864e;
                Throwable th4 = (Throwable) obj;
                synchronized (z1Var.f6877c) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                hd.b.a(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    z1Var.f6879e = th3;
                    je.l0 l0Var = z1Var.f6893u;
                    v1 v1Var = v1.f6824d;
                    l0Var.getClass();
                    l0Var.k(null, v1Var);
                }
                return Unit.f5554a;
            case 12:
                n4.s sVar = (n4.s) this.f865i;
                q4.h hVar2 = ((n4.x) this.f864e).f7130b;
                n4.b0 b0Var2 = (n4.b0) obj;
                b0Var2.getClass();
                n4.z zVar = b0Var2.f7031a;
                zVar.g = 0;
                zVar.f7141h = 0;
                if (sVar instanceof n4.u) {
                    int i19 = n4.s.f7113s;
                    Iterator it = a.a.B(sVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            n4.s sVar2 = (n4.s) it.next();
                            n4.s i20 = hVar2.i();
                            if (Intrinsics.a(sVar2, i20 != null ? i20.f7116i : null)) {
                            }
                        } else {
                            int i21 = n4.u.f7124u;
                            n4.u uVar = hVar2.f7996c;
                            if (uVar == null) {
                                kotlin.collections.i0.l("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                            Sequence c10 = de.k.c(uVar, new m2.u(17));
                            c10.getClass();
                            Iterator it2 = c10.iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Sequence is empty.");
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            b0Var2.a(((n4.s) next).f7115e.f1694a);
                            b0Var2.f7035e = false;
                            b0Var2.f7036f = true;
                        }
                    }
                }
                return Unit.f5554a;
            case 13:
                androidx.lifecycle.u uVar2 = (androidx.lifecycle.u) this.f865i;
                n9.c cVar2 = (n9.c) this.f864e;
                ((n0.b0) obj).getClass();
                h5.a aVar4 = new h5.a(1, cVar2);
                uVar2.g().a(aVar4);
                return new d1(i14, uVar2, aVar4);
            case 14:
                return new d1(5, (m2) this.f865i, (o4.i) this.f864e);
            case 15:
                n4.x xVar = (n4.x) this.f865i;
                androidx.lifecycle.u uVar3 = (androidx.lifecycle.u) this.f864e;
                xVar.getClass();
                uVar3.getClass();
                q4.h hVar3 = xVar.f7130b;
                h5.a aVar5 = hVar3.f8009r;
                if (!uVar3.equals(hVar3.f8005n)) {
                    androidx.lifecycle.u uVar4 = hVar3.f8005n;
                    if (uVar4 != null && (g = uVar4.g()) != null) {
                        g.f(aVar5);
                    }
                    hVar3.f8005n = uVar3;
                    uVar3.g().a(aVar5);
                }
                return new o4.x();
            case 16:
                p2.j jVar = (p2.j) this.f865i;
                p2.a0 a0Var = (p2.a0) this.f864e;
                Function1 function1 = (Function1) obj;
                p2.n nVar = jVar.f7630d;
                c4.o oVar = jVar.f7627a;
                a1.d dVar2 = jVar.f7632f;
                nVar.getClass();
                p2.i iVar = a0Var.f7603a;
                if (iVar instanceof p2.l) {
                    List list = ((p2.l) iVar).f7635i;
                    p2.s sVar3 = a0Var.f7604b;
                    int i22 = a0Var.f7605c;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        Object obj3 = list.get(i23);
                        if (Intrinsics.a(((p2.x) obj3).f7651a, sVar3) && i22 == 0) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i24 = 0; i24 < size2; i24++) {
                            Object obj4 = list.get(i24);
                            ((p2.x) obj4).getClass();
                            if (i22 == 0) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        int compareTo = sVar3.compareTo(p2.s.f7642e);
                        int i25 = sVar3.f7648d;
                        if (compareTo < 0) {
                            int size3 = list.size();
                            p2.s sVar4 = null;
                            p2.s sVar5 = null;
                            int i26 = 0;
                            while (true) {
                                if (i26 < size3) {
                                    p2.s sVar6 = ((p2.x) list.get(i26)).f7651a;
                                    int i27 = sVar6.f7648d;
                                    if (Intrinsics.b(i27, i25) < 0) {
                                        if (sVar4 == null || Intrinsics.b(i27, sVar4.f7648d) > 0) {
                                            sVar4 = sVar6;
                                        }
                                    } else if (Intrinsics.b(i27, i25) <= 0) {
                                        sVar4 = sVar6;
                                        sVar5 = sVar4;
                                    } else if (sVar5 == null || Intrinsics.b(i27, sVar5.f7648d) < 0) {
                                        sVar5 = sVar6;
                                    }
                                    i26++;
                                }
                            }
                            if (sVar4 == null) {
                                sVar4 = sVar5;
                            }
                            arrayList = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i28 = 0; i28 < size4; i28++) {
                                Object obj5 = list.get(i28);
                                if (Intrinsics.a(((p2.x) obj5).f7651a, sVar4)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            p2.s sVar7 = p2.s.f7643i;
                            if (sVar3.compareTo(sVar7) > 0) {
                                int size5 = list.size();
                                p2.s sVar8 = null;
                                p2.s sVar9 = null;
                                int i29 = 0;
                                while (true) {
                                    if (i29 < size5) {
                                        p2.s sVar10 = ((p2.x) list.get(i29)).f7651a;
                                        int i30 = sVar10.f7648d;
                                        if (Intrinsics.b(i30, i25) < 0) {
                                            if (sVar8 == null || Intrinsics.b(i30, sVar8.f7648d) > 0) {
                                                sVar8 = sVar10;
                                            }
                                        } else if (Intrinsics.b(i30, i25) <= 0) {
                                            sVar8 = sVar10;
                                            sVar9 = sVar8;
                                        } else if (sVar9 == null || Intrinsics.b(i30, sVar9.f7648d) < 0) {
                                            sVar9 = sVar10;
                                        }
                                        i29++;
                                    }
                                }
                                if (sVar9 != null) {
                                    sVar8 = sVar9;
                                }
                                ArrayList arrayList3 = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i31 = 0; i31 < size6; i31++) {
                                    Object obj6 = list.get(i31);
                                    if (Intrinsics.a(((p2.x) obj6).f7651a, sVar8)) {
                                        arrayList3.add(obj6);
                                    }
                                }
                                arrayList = arrayList3;
                            } else {
                                int size7 = list.size();
                                p2.s sVar11 = null;
                                p2.s sVar12 = null;
                                int i32 = 0;
                                while (true) {
                                    if (i32 < size7) {
                                        p2.s sVar13 = ((p2.x) list.get(i32)).f7651a;
                                        if (Intrinsics.b(sVar13.f7648d, sVar7.f7648d) <= 0) {
                                            int i33 = sVar13.f7648d;
                                            if (Intrinsics.b(i33, i25) < 0) {
                                                if (sVar11 == null || Intrinsics.b(i33, sVar11.f7648d) > 0) {
                                                    sVar11 = sVar13;
                                                }
                                            } else if (Intrinsics.b(i33, i25) <= 0) {
                                                sVar11 = sVar13;
                                                sVar12 = sVar11;
                                            } else if (sVar12 == null || Intrinsics.b(i33, sVar12.f7648d) < 0) {
                                                sVar12 = sVar13;
                                            }
                                        }
                                        i32++;
                                    }
                                }
                                if (sVar12 != null) {
                                    sVar11 = sVar12;
                                }
                                arrayList = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i34 = 0; i34 < size8; i34++) {
                                    Object obj7 = list.get(i34);
                                    if (Intrinsics.a(((p2.x) obj7).f7651a, sVar11)) {
                                        arrayList.add(obj7);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    p2.s sVar14 = p2.s.f7643i;
                                    int size9 = list.size();
                                    int i35 = 0;
                                    p2.s sVar15 = null;
                                    p2.s sVar16 = null;
                                    while (true) {
                                        if (i35 < size9) {
                                            p2.s sVar17 = ((p2.x) list.get(i35)).f7651a;
                                            if (sVar14 == null || Intrinsics.b(sVar17.f7648d, sVar14.f7648d) >= 0) {
                                                int i36 = sVar17.f7648d;
                                                if (Intrinsics.b(i36, i25) < 0) {
                                                    if (sVar15 == null || Intrinsics.b(i36, sVar15.f7648d) > 0) {
                                                        sVar15 = sVar17;
                                                    }
                                                } else if (Intrinsics.b(i36, i25) <= 0) {
                                                    sVar15 = sVar17;
                                                    sVar16 = sVar15;
                                                } else if (sVar16 == null || Intrinsics.b(i36, sVar16.f7648d) < 0) {
                                                    sVar16 = sVar17;
                                                }
                                            }
                                            i35++;
                                        }
                                    }
                                    if (sVar16 != null) {
                                        sVar15 = sVar16;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i37 = 0; i37 < size10; i37++) {
                                        Object obj8 = list.get(i37);
                                        if (Intrinsics.a(((p2.x) obj8).f7651a, sVar15)) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    p.e eVar2 = nVar.f7637a;
                    if (arrayList.size() > 0) {
                        p2.x xVar2 = (p2.x) arrayList.get(0);
                        xVar2.getClass();
                        synchronized (((s7.c0) eVar2.f7590r)) {
                            try {
                                oVar.getClass();
                                p2.e eVar3 = new p2.e(xVar2);
                                p2.d dVar3 = (p2.d) ((s.r) eVar2.f7588e).c(eVar3);
                                if (dVar3 == null) {
                                    dVar3 = (p2.d) ((s.h0) eVar2.f7589i).g(eVar3);
                                }
                                if (dVar3 != null) {
                                    obj2 = dVar3.f7623a;
                                } else {
                                    try {
                                        invoke = oVar.g(xVar2);
                                    } catch (Exception unused) {
                                        invoke = dVar2.invoke(a0Var);
                                    }
                                    eVar2.getClass();
                                    oVar.getClass();
                                    p2.e eVar4 = new p2.e(xVar2);
                                    synchronized (((s7.c0) eVar2.f7590r)) {
                                        try {
                                            if (invoke == null) {
                                                ((s.h0) eVar2.f7589i).m(eVar4, new p2.d(null));
                                            } else {
                                                ((s.r) eVar2.f7588e).d(eVar4, new p2.d(invoke));
                                            }
                                        } catch (Throwable th6) {
                                            throw th6;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = dVar2.invoke(a0Var);
                        }
                        pair = new Pair(null, i7.a.h0(a0Var.f7606d, obj2, xVar2, a0Var.f7604b, a0Var.f7605c));
                    } else {
                        pair = new Pair(null, dVar2.invoke(a0Var));
                    }
                    List list2 = (List) pair.f5552d;
                    Object obj9 = pair.f5553e;
                    if (list2 == null) {
                        b0Var = new p2.c0(obj9, true);
                    } else {
                        p2.c cVar3 = new p2.c(list2, obj9, a0Var, nVar.f7637a, function1, oVar);
                        le.d dVar4 = nVar.f7638b;
                        ge.y yVar = ge.y.f4417d;
                        ge.a0.s(dVar4, null, new b5.d0(cVar3, null, 4), 1);
                        b0Var = new p2.b0(cVar3);
                    }
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    k5.c cVar4 = (k5.c) jVar.f7631e.f5643e;
                    p2.i iVar2 = a0Var.f7603a;
                    int i38 = a0Var.f7605c;
                    p2.s sVar18 = a0Var.f7604b;
                    if (iVar2 == null || (iVar2 instanceof p2.f)) {
                        switch (cVar4.f5405d) {
                            case RequestError.STOP_TRACKING /* 11 */:
                                i3 = k5.c.i(null, sVar18, i38);
                                break;
                            default:
                                i3 = k5.c.j(null, sVar18, i38);
                                break;
                        }
                        typeface = i3;
                    } else if (iVar2 instanceof p2.u) {
                        p2.u uVar5 = (p2.u) iVar2;
                        switch (cVar4.f5405d) {
                            case RequestError.STOP_TRACKING /* 11 */:
                                uVar5.getClass();
                                typeface = k5.c.i("sans-serif", sVar18, i38);
                                break;
                            default:
                                uVar5.getClass();
                                int i39 = sVar18.f7648d / 100;
                                if (i39 >= 0 && i39 < 2) {
                                    str = "sans-serif-thin";
                                } else if (2 > i39 || i39 >= 4) {
                                    if (i39 != 4) {
                                        if (i39 == 5) {
                                            str = "sans-serif-medium";
                                        } else {
                                            if (6 <= i39) {
                                                i10 = 8;
                                                break;
                                            } else {
                                                i10 = 8;
                                            }
                                            if (i10 <= i39 && i39 < 11) {
                                                str = "sans-serif-black";
                                            }
                                        }
                                    }
                                    str = "sans-serif";
                                } else {
                                    str = "sans-serif-light";
                                }
                                if (str.length() != 0) {
                                    typeface = k5.c.j(str, sVar18, i38);
                                    if (!Intrinsics.a(typeface, Typeface.create(Typeface.DEFAULT, cf.c.u(sVar18, i38)))) {
                                        break;
                                    }
                                }
                                typeface = null;
                                if (typeface == null) {
                                    typeface = k5.c.j("sans-serif", sVar18, i38);
                                    break;
                                }
                                break;
                        }
                    } else {
                        b0Var = null;
                        if (b0Var == null) {
                            kotlin.collections.i0.l("Could not load font");
                            return null;
                        }
                    }
                    b0Var = new p2.c0(typeface, true);
                    if (b0Var == null) {
                    }
                }
                return b0Var;
            case 17:
                c6.l lVar = (c6.l) this.f865i;
                p2.a0 a0Var2 = (p2.a0) this.f864e;
                p2.d0 d0Var = (p2.d0) obj;
                synchronized (((s7.c0) lVar.f1829e)) {
                    try {
                        boolean a9 = d0Var.a();
                        s.r rVar = (s.r) lVar.f1830i;
                        if (a9) {
                        }
                    } finally {
                    }
                }
                return Unit.f5554a;
            case 18:
                ge.x xVar3 = (ge.x) this.f865i;
                v.z0 z0Var2 = (v.z0) this.f864e;
                ge.y yVar2 = ge.y.f4417d;
                ge.a0.s(xVar3, null, new i0.h(z0Var2, null), 1);
                return new v.y0();
            case 19:
                v.h0 h0Var2 = (v.h0) this.f865i;
                h0Var2.D(new b1.b0(new l0(22, Thread.currentThread(), (ge.x) this.f864e)));
                return new b3.a(i15, h0Var2);
            case 20:
                v.z0 z0Var3 = (v.z0) this.f865i;
                v.z0 z0Var4 = (v.z0) this.f864e;
                z0Var3.j.add(z0Var4);
                return new d1(i11, z0Var3, z0Var4);
            case 21:
                return new d1(i12, (v.z0) this.f865i, (v.t0) this.f864e);
            case 22:
                Object obj10 = this.f865i;
                ge.x xVar4 = (ge.x) this.f864e;
                Function0 function0 = (Function0) obj;
                if (obj10 == Thread.currentThread()) {
                    function0.invoke();
                } else {
                    ge.a0.s(xVar4, null, new i9.b(function0, aVar, i13), 3);
                }
                return Unit.f5554a;
            case 23:
                ((z.f) this.f865i).b((z.g) this.f864e);
                return Unit.f5554a;
            default:
                ((z.f) this.f865i).b((z.e) this.f864e);
                return Unit.f5554a;
        }
    }
}
