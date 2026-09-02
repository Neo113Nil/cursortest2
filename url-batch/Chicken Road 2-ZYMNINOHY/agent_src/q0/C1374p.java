package q0;

import E1.C0035k;
import T.C0096n;
import T.C0097o;
import T.C0101t;
import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0105x;
import T.C0106y;
import T.C0107z;
import a.AbstractC0124a;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: q0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374p implements InterfaceC1352A {

    /* renamed from: a, reason: collision with root package name */
    public final C0035k f15052a;

    /* renamed from: b, reason: collision with root package name */
    public l2.e f15053b;

    /* renamed from: c, reason: collision with root package name */
    public a2.i f15054c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15055d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15056e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15057f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15058g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15059h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15060i;

    public C1374p(Context context) {
        this(new l2.e(context, 20), new y0.l());
    }

    public static InterfaceC1352A e(Class cls, Y.g gVar) {
        try {
            return (InterfaceC1352A) cls.getConstructor(Y.g.class).newInstance(gVar);
        } catch (Exception e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // q0.InterfaceC1352A
    public final AbstractC1359a a(C0107z c0107z) {
        C0107z c0107z2;
        List list;
        Uri uri;
        String str;
        long j4;
        c0107z.f2900b.getClass();
        String scheme = c0107z.f2900b.f2893a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c0107z.f2900b.f2894b, "application/x-image-uri")) {
            long j5 = c0107z.f2900b.f2897e;
            String str2 = W.J.f3263a;
            throw null;
        }
        C0104w c0104w = c0107z.f2900b;
        int F4 = W.J.F(c0104w.f2893a, c0104w.f2894b);
        if (c0107z.f2900b.f2897e != -9223372036854775807L) {
            y0.l lVar = (y0.l) this.f15052a.f625b;
            synchronized (lVar) {
                lVar.f16179d = 1;
            }
            y0.l lVar2 = (y0.l) this.f15052a.f625b;
            synchronized (lVar2) {
                lVar2.f16180e = 1;
            }
        }
        try {
            C0035k c0035k = this.f15052a;
            HashMap hashMap = (HashMap) c0035k.f627d;
            InterfaceC1352A interfaceC1352A = (InterfaceC1352A) hashMap.get(Integer.valueOf(F4));
            if (interfaceC1352A == null) {
                interfaceC1352A = (InterfaceC1352A) c0035k.b(F4).get();
                interfaceC1352A.b((a2.i) c0035k.f629f);
                interfaceC1352A.d(c0035k.f624a);
                interfaceC1352A.c();
                hashMap.put(Integer.valueOf(F4), interfaceC1352A);
            }
            C0102u a3 = c0107z.f2901c.a();
            C0103v c0103v = c0107z.f2901c;
            if (c0103v.f2888a == -9223372036854775807L) {
                a3.f2883a = this.f15055d;
            }
            if (c0103v.f2891d == -3.4028235E38f) {
                a3.f2886d = this.f15058g;
            }
            if (c0103v.f2892e == -3.4028235E38f) {
                a3.f2887e = this.f15059h;
            }
            if (c0103v.f2889b == -9223372036854775807L) {
                a3.f2884b = this.f15056e;
            }
            if (c0103v.f2890c == -9223372036854775807L) {
                a3.f2885c = this.f15057f;
            }
            C0103v c0103v2 = new C0103v(a3);
            if (c0103v2.equals(c0107z.f2901c)) {
                c0107z2 = c0107z;
            } else {
                new T.b0();
                List list2 = Collections.EMPTY_LIST;
                v2.I i4 = v2.a0.f15605e;
                C0105x c0105x = C0105x.f2898a;
                C0101t c0101t = c0107z.f2903e;
                T.r rVar = new T.r();
                rVar.f2881a = c0101t.f2882a;
                String str3 = c0107z.f2899a;
                T.C c4 = c0107z.f2902d;
                c0107z.f2901c.a();
                C0105x c0105x2 = c0107z.f2904f;
                C0104w c0104w2 = c0107z.f2900b;
                if (c0104w2 != null) {
                    String str4 = c0104w2.f2894b;
                    Uri uri2 = c0104w2.f2893a;
                    List list3 = c0104w2.f2895c;
                    i4 = c0104w2.f2896d;
                    new T.b0();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j4 = c0104w2.f2897e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j4 = -9223372036854775807L;
                }
                v2.I i5 = i4;
                C0102u a4 = c0103v2.a();
                C0104w c0104w3 = uri != null ? new C0104w(uri, str, null, list, i5, j4) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                C0101t c0101t2 = new C0101t(rVar);
                C0103v c0103v3 = new C0103v(a4);
                if (c4 == null) {
                    c4 = T.C.f2631B;
                }
                c0107z2 = new C0107z(str5, c0101t2, c0104w3, c0103v3, c4, c0105x2);
            }
            AbstractC1359a a5 = interfaceC1352A.a(c0107z2);
            v2.I i6 = c0107z2.f2900b.f2896d;
            if (!i6.isEmpty()) {
                AbstractC1359a[] abstractC1359aArr = new AbstractC1359a[i6.size() + 1];
                abstractC1359aArr[0] = a5;
                if (i6.size() > 0) {
                    if (!this.f15060i) {
                        this.f15053b.getClass();
                        C0106y c0106y = (C0106y) i6.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        v2.G g4 = v2.I.f15571b;
                        v2.a0 a0Var = v2.a0.f15605e;
                        List list4 = Collections.EMPTY_LIST;
                        v2.a0 a0Var2 = v2.a0.f15605e;
                        C0105x c0105x3 = C0105x.f2898a;
                        Uri uri3 = Uri.EMPTY;
                        c0106y.getClass();
                        throw null;
                    }
                    C0096n c0096n = new C0096n();
                    ((C0106y) i6.get(0)).getClass();
                    ArrayList arrayList = T.F.f2657a;
                    c0096n.f2831m = null;
                    ((C0106y) i6.get(0)).getClass();
                    c0096n.f2822d = null;
                    ((C0106y) i6.get(0)).getClass();
                    c0096n.f2823e = 0;
                    ((C0106y) i6.get(0)).getClass();
                    c0096n.f2824f = 0;
                    ((C0106y) i6.get(0)).getClass();
                    c0096n.f2820b = null;
                    ((C0106y) i6.get(0)).getClass();
                    c0096n.f2819a = null;
                    C0097o c0097o = new C0097o(c0096n);
                    if (this.f15054c.f(c0097o)) {
                        C0096n a6 = c0097o.a();
                        a6.f2831m = T.F.n("application/x-media3-cues");
                        a6.f2828j = c0097o.n;
                        a6.f2816K = this.f15054c.c(c0097o);
                        new C0097o(a6);
                    }
                    ((C0106y) i6.get(0)).getClass();
                    throw null;
                }
                a5 = new L(abstractC1359aArr);
            }
            C0101t c0101t3 = c0107z2.f2903e;
            if (c0101t3.f2882a != Long.MIN_VALUE) {
                C1363e c1363e = new C1363e(a5);
                AbstractC0124a.t(!c1363e.f14995d);
                long j6 = c0101t3.f2882a;
                AbstractC0124a.t(!c1363e.f14995d);
                c1363e.f14993b = j6;
                AbstractC0124a.t(!c1363e.f14995d);
                c1363e.f14994c = true;
                AbstractC0124a.t(!c1363e.f14995d);
                AbstractC0124a.t(!c1363e.f14995d);
                AbstractC0124a.t(!c1363e.f14995d);
                c1363e.f14995d = true;
                a5 = new C1366h(c1363e);
            }
            c0107z2.f2900b.getClass();
            c0107z2.f2900b.getClass();
            return a5;
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // q0.InterfaceC1352A
    public final void b(a2.i iVar) {
        this.f15054c = iVar;
        C0035k c0035k = this.f15052a;
        c0035k.f629f = iVar;
        y0.l lVar = (y0.l) c0035k.f625b;
        synchronized (lVar) {
            lVar.f16178c = iVar;
        }
        Iterator it = ((HashMap) c0035k.f627d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC1352A) it.next()).b(iVar);
        }
    }

    @Override // q0.InterfaceC1352A
    public final void c() {
        C0035k c0035k = this.f15052a;
        c0035k.getClass();
        synchronized (((y0.l) c0035k.f625b)) {
        }
    }

    @Override // q0.InterfaceC1352A
    public final void d(boolean z) {
        this.f15060i = z;
        C0035k c0035k = this.f15052a;
        c0035k.f624a = z;
        y0.l lVar = (y0.l) c0035k.f625b;
        synchronized (lVar) {
            lVar.f16177b = z;
        }
        Iterator it = ((HashMap) c0035k.f627d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC1352A) it.next()).d(z);
        }
    }

    public C1374p(l2.e eVar, y0.l lVar) {
        this.f15053b = eVar;
        a2.i iVar = new a2.i(28);
        this.f15054c = iVar;
        C0035k c0035k = new C0035k();
        c0035k.f625b = lVar;
        c0035k.f629f = iVar;
        c0035k.f626c = new HashMap();
        c0035k.f627d = new HashMap();
        c0035k.f624a = true;
        this.f15052a = c0035k;
        if (eVar != ((l2.e) c0035k.f628e)) {
            c0035k.f628e = eVar;
            ((HashMap) c0035k.f626c).clear();
            ((HashMap) c0035k.f627d).clear();
        }
        this.f15055d = -9223372036854775807L;
        this.f15056e = -9223372036854775807L;
        this.f15057f = -9223372036854775807L;
        this.f15058g = -3.4028235E38f;
        this.f15059h = -3.4028235E38f;
        this.f15060i = true;
    }
}
