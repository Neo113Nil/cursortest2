package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.w30;
import com.yandex.mobile.ads.impl.xx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class gw0 {

    /* renamed from: a, reason: collision with root package name */
    private final ei1 f26316a;

    /* renamed from: e, reason: collision with root package name */
    private final d f26320e;

    /* renamed from: f, reason: collision with root package name */
    private final ew0.a f26321f;

    /* renamed from: g, reason: collision with root package name */
    private final w30.a f26322g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<c, b> f26323h;

    /* renamed from: i, reason: collision with root package name */
    private final HashSet f26324i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26326k;

    /* renamed from: l, reason: collision with root package name */
    private s62 f26327l;

    /* renamed from: j, reason: collision with root package name */
    private xx1 f26325j = new xx1.a();

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<xv0, c> f26318c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f26319d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f26317b = new ArrayList();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final dw0 f26332a;

        /* renamed from: b, reason: collision with root package name */
        public final dw0.c f26333b;

        /* renamed from: c, reason: collision with root package name */
        public final a f26334c;

        public b(rt0 rt0Var, dw0.c cVar, a aVar) {
            this.f26332a = rt0Var;
            this.f26333b = cVar;
            this.f26334c = aVar;
        }
    }

    static final class c implements fw0 {

        /* renamed from: a, reason: collision with root package name */
        public final rt0 f26335a;

        /* renamed from: d, reason: collision with root package name */
        public int f26338d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f26339e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f26337c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f26336b = new Object();

        public c(dw0 dw0Var, boolean z4) {
            this.f26335a = new rt0(dw0Var, z4);
        }

        @Override // com.yandex.mobile.ads.impl.fw0
        public final Object a() {
            return this.f26336b;
        }

        @Override // com.yandex.mobile.ads.impl.fw0
        public final x42 b() {
            return this.f26335a.f();
        }
    }

    public interface d {
    }

    public gw0(d dVar, InterfaceC2296vc interfaceC2296vc, Handler handler, ei1 ei1Var) {
        this.f26316a = ei1Var;
        this.f26320e = dVar;
        ew0.a aVar = new ew0.a();
        this.f26321f = aVar;
        w30.a aVar2 = new w30.a();
        this.f26322g = aVar2;
        this.f26323h = new HashMap<>();
        this.f26324i = new HashSet();
        aVar.a(handler, interfaceC2296vc);
        aVar2.a(handler, interfaceC2296vc);
    }

    public final x42 d() {
        if (this.f26317b.size() < 0) {
            throw new IllegalArgumentException();
        }
        this.f26325j = null;
        return a();
    }

    public final void e() {
        for (b bVar : this.f26323h.values()) {
            try {
                bVar.f26332a.a(bVar.f26333b);
            } catch (RuntimeException e4) {
                ms0.a("MediaSourceList", "Failed to release child source.", e4);
            }
            bVar.f26332a.a((ew0) bVar.f26334c);
            bVar.f26332a.a((w30) bVar.f26334c);
        }
        this.f26323h.clear();
        this.f26324i.clear();
        this.f26326k = false;
    }

    private final class a implements ew0, w30 {

        /* renamed from: a, reason: collision with root package name */
        private final c f26328a;

        /* renamed from: b, reason: collision with root package name */
        private ew0.a f26329b;

        /* renamed from: c, reason: collision with root package name */
        private w30.a f26330c;

        public a(c cVar) {
            this.f26329b = gw0.this.f26321f;
            this.f26330c = gw0.this.f26322g;
            this.f26328a = cVar;
        }

        private boolean e(int i4, dw0.b bVar) {
            dw0.b bVar2 = null;
            if (bVar != null) {
                c cVar = this.f26328a;
                int i5 = 0;
                while (true) {
                    if (i5 >= cVar.f26337c.size()) {
                        break;
                    }
                    if (((dw0.b) cVar.f26337c.get(i5)).f35795d == bVar.f35795d) {
                        bVar2 = new dw0.b(bVar.a(AbstractC1862d.a(cVar.f26336b, bVar.f35792a)));
                        break;
                    }
                    i5++;
                }
                if (bVar2 == null) {
                    return false;
                }
            }
            int i6 = i4 + this.f26328a.f26338d;
            ew0.a aVar = this.f26329b;
            if (aVar.f25468a != i6 || !u82.a(aVar.f25469b, bVar2)) {
                this.f26329b = gw0.this.f26321f.a(i6, bVar2);
            }
            w30.a aVar2 = this.f26330c;
            if (aVar2.f33904a == i6 && u82.a(aVar2.f33905b, bVar2)) {
                return true;
            }
            this.f26330c = gw0.this.f26322g.a(i6, bVar2);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f26329b.a(tv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void b(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f26330c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void c(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f26330c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void d(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f26330c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar) {
            if (e(i4, bVar)) {
                this.f26330c.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void b(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f26329b.b(mr0Var, tv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void c(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f26329b.c(mr0Var, tv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar, int i5) {
            if (e(i4, bVar)) {
                this.f26330c.a(i5);
            }
        }

        @Override // com.yandex.mobile.ads.impl.w30
        public final void a(int i4, dw0.b bVar, Exception exc) {
            if (e(i4, bVar)) {
                this.f26330c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var) {
            if (e(i4, bVar)) {
                this.f26329b.a(mr0Var, tv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ew0
        public final void a(int i4, dw0.b bVar, mr0 mr0Var, tv0 tv0Var, IOException iOException, boolean z4) {
            if (e(i4, bVar)) {
                this.f26329b.a(mr0Var, tv0Var, iOException, z4);
            }
        }
    }

    public final x42 a(int i4, List<c> list, xx1 xx1Var) {
        if (!list.isEmpty()) {
            this.f26325j = xx1Var;
            for (int i5 = i4; i5 < list.size() + i4; i5++) {
                c cVar = list.get(i5 - i4);
                if (i5 > 0) {
                    c cVar2 = (c) this.f26317b.get(i5 - 1);
                    cVar.f26338d = cVar2.f26335a.f().b() + cVar2.f26338d;
                    cVar.f26339e = false;
                    cVar.f26337c.clear();
                } else {
                    cVar.f26338d = 0;
                    cVar.f26339e = false;
                    cVar.f26337c.clear();
                }
                int b4 = cVar.f26335a.f().b();
                for (int i6 = i5; i6 < this.f26317b.size(); i6++) {
                    ((c) this.f26317b.get(i6)).f26338d += b4;
                }
                this.f26317b.add(i5, cVar);
                this.f26319d.put(cVar.f26336b, cVar);
                if (this.f26326k) {
                    a(cVar);
                    if (this.f26318c.isEmpty()) {
                        this.f26324i.add(cVar);
                    } else {
                        b bVar = this.f26323h.get(cVar);
                        if (bVar != null) {
                            bVar.f26332a.b(bVar.f26333b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final int b() {
        return this.f26317b.size();
    }

    public final boolean c() {
        return this.f26326k;
    }

    public final qt0 a(dw0.b bVar, InterfaceC2250tc interfaceC2250tc, long j4) {
        Object d4 = AbstractC1862d.d(bVar.f35792a);
        dw0.b bVar2 = new dw0.b(bVar.a(AbstractC1862d.c(bVar.f35792a)));
        c cVar = (c) this.f26319d.get(d4);
        cVar.getClass();
        this.f26324i.add(cVar);
        b bVar3 = this.f26323h.get(cVar);
        if (bVar3 != null) {
            bVar3.f26332a.c(bVar3.f26333b);
        }
        cVar.f26337c.add(bVar2);
        qt0 a4 = cVar.f26335a.a(bVar2, interfaceC2250tc, j4);
        this.f26318c.put(a4, cVar);
        Iterator it = this.f26324i.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2.f26337c.isEmpty()) {
                b bVar4 = this.f26323h.get(cVar2);
                if (bVar4 != null) {
                    bVar4.f26332a.b(bVar4.f26333b);
                }
                it.remove();
            }
        }
        return a4;
    }

    public final x42 a() {
        if (this.f26317b.isEmpty()) {
            return x42.f34401b;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f26317b.size(); i5++) {
            c cVar = (c) this.f26317b.get(i5);
            cVar.f26338d = i4;
            i4 += cVar.f26335a.f().b();
        }
        return new aj1(this.f26317b, this.f26325j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(dw0 dw0Var, x42 x42Var) {
        ((j60) this.f26320e).h();
    }

    public final void a(s62 s62Var) {
        if (!this.f26326k) {
            this.f26327l = s62Var;
            for (int i4 = 0; i4 < this.f26317b.size(); i4++) {
                c cVar = (c) this.f26317b.get(i4);
                a(cVar);
                this.f26324i.add(cVar);
            }
            this.f26326k = true;
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        rt0 rt0Var = cVar.f26335a;
        dw0.c cVar2 = new dw0.c() { // from class: com.yandex.mobile.ads.impl.T3
            @Override // com.yandex.mobile.ads.impl.dw0.c
            public final void a(dw0 dw0Var, x42 x42Var) {
                gw0.this.a(dw0Var, x42Var);
            }
        };
        a aVar = new a(cVar);
        this.f26323h.put(cVar, new b(rt0Var, cVar2, aVar));
        rt0Var.a(u82.b((Handler.Callback) null), (ew0) aVar);
        rt0Var.a(u82.b((Handler.Callback) null), (w30) aVar);
        rt0Var.a(cVar2, this.f26327l, this.f26316a);
    }

    public final void a(xv0 xv0Var) {
        c remove = this.f26318c.remove(xv0Var);
        remove.getClass();
        remove.f26335a.a(xv0Var);
        remove.f26337c.remove(((qt0) xv0Var).f30884b);
        if (!this.f26318c.isEmpty()) {
            Iterator it = this.f26324i.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f26337c.isEmpty()) {
                    b bVar = this.f26323h.get(cVar);
                    if (bVar != null) {
                        bVar.f26332a.b(bVar.f26333b);
                    }
                    it.remove();
                }
            }
        }
        if (remove.f26339e && remove.f26337c.isEmpty()) {
            b remove2 = this.f26323h.remove(remove);
            remove2.getClass();
            remove2.f26332a.a(remove2.f26333b);
            remove2.f26332a.a((ew0) remove2.f26334c);
            remove2.f26332a.a((w30) remove2.f26334c);
            this.f26324i.remove(remove);
        }
    }

    public final x42 a(int i4, int i5, xx1 xx1Var) {
        if (i4 >= 0 && i4 <= i5 && i5 <= this.f26317b.size()) {
            this.f26325j = xx1Var;
            a(i4, i5);
            return a();
        }
        throw new IllegalArgumentException();
    }

    private void a(int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            c cVar = (c) this.f26317b.remove(i6);
            this.f26319d.remove(cVar.f26336b);
            int i7 = -cVar.f26335a.f().b();
            for (int i8 = i6; i8 < this.f26317b.size(); i8++) {
                ((c) this.f26317b.get(i8)).f26338d += i7;
            }
            cVar.f26339e = true;
            if (this.f26326k && cVar.f26337c.isEmpty()) {
                b remove = this.f26323h.remove(cVar);
                remove.getClass();
                remove.f26332a.a(remove.f26333b);
                remove.f26332a.a((ew0) remove.f26334c);
                remove.f26332a.a((w30) remove.f26334c);
                this.f26324i.remove(cVar);
            }
        }
    }

    public final x42 a(List<c> list, xx1 xx1Var) {
        a(0, this.f26317b.size());
        return a(this.f26317b.size(), list, xx1Var);
    }

    public final x42 a(xx1 xx1Var) {
        int size = this.f26317b.size();
        if (xx1Var.b() != size) {
            xx1Var = xx1Var.d().b(size);
        }
        this.f26325j = xx1Var;
        return a();
    }
}
