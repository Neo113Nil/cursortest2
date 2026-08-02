package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k.C0251a;
import l.C0254a;
import l.C0255b;
import l.C0256c;
import l.C0257d;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1776a;

    /* renamed from: b, reason: collision with root package name */
    public C0254a f1777b;

    /* renamed from: c, reason: collision with root package name */
    public g f1778c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1779d;

    /* renamed from: e, reason: collision with root package name */
    public int f1780e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1781f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1782g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1783h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.p f1784i;

    public n(l lVar) {
        new AtomicReference();
        this.f1776a = true;
        this.f1777b = new C0254a();
        g gVar = g.f1768f;
        this.f1778c = gVar;
        this.f1783h = new ArrayList();
        this.f1779d = new WeakReference(lVar);
        this.f1784i = new b1.p(gVar);
    }

    public final g a(io.flutter.embedding.engine.renderer.b bVar) {
        HashMap hashMap = this.f1777b.f3112i;
        C0256c c0256c = hashMap.containsKey(bVar) ? ((C0256c) hashMap.get(bVar)).f3119h : null;
        g gVar = c0256c != null ? c0256c.f3117f.f1774a : null;
        ArrayList arrayList = this.f1783h;
        g gVar2 = arrayList.isEmpty() ? null : (g) arrayList.get(arrayList.size() - 1);
        g gVar3 = this.f1778c;
        Q0.h.e(gVar3, "state1");
        if (gVar == null || gVar.compareTo(gVar3) >= 0) {
            gVar = gVar3;
        }
        return (gVar2 == null || gVar2.compareTo(gVar) >= 0) ? gVar : gVar2;
    }

    public final void b(String str) {
        C0251a c0251a;
        if (this.f1776a) {
            if (C0251a.f3103k != null) {
                c0251a = C0251a.f3103k;
            } else {
                synchronized (C0251a.class) {
                    try {
                        if (C0251a.f3103k == null) {
                            C0251a.f3103k = new C0251a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0251a = C0251a.f3103k;
            }
            ((C0251a) c0251a.f3104j).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void c(f fVar) {
        Q0.h.e(fVar, "event");
        b("handleLifecycleEvent");
        g a2 = fVar.a();
        g gVar = this.f1778c;
        if (gVar == a2) {
            return;
        }
        g gVar2 = g.f1768f;
        g gVar3 = g.f1767e;
        if (gVar == gVar2 && a2 == gVar3) {
            throw new IllegalStateException(("no event down from " + this.f1778c + " in component " + this.f1779d.get()).toString());
        }
        this.f1778c = a2;
        if (this.f1781f || this.f1780e != 0) {
            this.f1782g = true;
            return;
        }
        this.f1781f = true;
        d();
        this.f1781f = false;
        if (this.f1778c == gVar3) {
            this.f1777b = new C0254a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r8.f1782g = false;
        r0 = r8.f1778c;
        r1 = r8.f1784i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r0 = c1.l.f2019a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        l lVar = (l) this.f1779d.get();
        if (lVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0254a c0254a = this.f1777b;
            if (c0254a.f3111h != 0) {
                C0256c c0256c = c0254a.f3108e;
                Q0.h.b(c0256c);
                g gVar = c0256c.f3117f.f1774a;
                C0256c c0256c2 = this.f1777b.f3109f;
                Q0.h.b(c0256c2);
                g gVar2 = c0256c2.f3117f.f1774a;
                if (gVar == gVar2 && this.f1778c == gVar2) {
                    break;
                }
                this.f1782g = false;
                g gVar3 = this.f1778c;
                C0256c c0256c3 = this.f1777b.f3108e;
                Q0.h.b(c0256c3);
                if (gVar3.compareTo(c0256c3.f3117f.f1774a) < 0) {
                    C0254a c0254a2 = this.f1777b;
                    C0255b c0255b = new C0255b(c0254a2.f3109f, c0254a2.f3108e, 1);
                    c0254a2.f3110g.put(c0255b, Boolean.FALSE);
                    while (c0255b.hasNext() && !this.f1782g) {
                        Map.Entry entry = (Map.Entry) c0255b.next();
                        Q0.h.d(entry, "next()");
                        k kVar = (k) entry.getKey();
                        m mVar = (m) entry.getValue();
                        while (mVar.f1774a.compareTo(this.f1778c) > 0 && !this.f1782g && this.f1777b.f3112i.containsKey(kVar)) {
                            d dVar = f.Companion;
                            g gVar4 = mVar.f1774a;
                            dVar.getClass();
                            Q0.h.e(gVar4, "state");
                            int ordinal = gVar4.ordinal();
                            f fVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : f.ON_PAUSE : f.ON_STOP : f.ON_DESTROY;
                            if (fVar == null) {
                                throw new IllegalStateException("no event down from " + mVar.f1774a);
                            }
                            this.f1783h.add(fVar.a());
                            mVar.a(lVar, fVar);
                            this.f1783h.remove(r5.size() - 1);
                        }
                    }
                }
                C0256c c0256c4 = this.f1777b.f3109f;
                if (!this.f1782g && c0256c4 != null && this.f1778c.compareTo(c0256c4.f3117f.f1774a) > 0) {
                    C0254a c0254a3 = this.f1777b;
                    c0254a3.getClass();
                    C0257d c0257d = new C0257d(c0254a3);
                    c0254a3.f3110g.put(c0257d, Boolean.FALSE);
                    while (c0257d.hasNext() && !this.f1782g) {
                        Map.Entry entry2 = (Map.Entry) c0257d.next();
                        k kVar2 = (k) entry2.getKey();
                        m mVar2 = (m) entry2.getValue();
                        while (mVar2.f1774a.compareTo(this.f1778c) < 0 && !this.f1782g && this.f1777b.f3112i.containsKey(kVar2)) {
                            this.f1783h.add(mVar2.f1774a);
                            d dVar2 = f.Companion;
                            g gVar5 = mVar2.f1774a;
                            dVar2.getClass();
                            f a2 = d.a(gVar5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + mVar2.f1774a);
                            }
                            mVar2.a(lVar, a2);
                            this.f1783h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
