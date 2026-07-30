package e7;

import c7.w1;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends h7.q {

    /* renamed from: e, reason: collision with root package name */
    public final e f2882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2883f;

    public m(long j8, m mVar, e eVar, int i7) {
        super(j8, mVar, i7);
        this.f2882e = eVar;
        this.f2883f = new AtomicReferenceArray(g.f2858b * 2);
    }

    @Override // h7.q
    public final int f() {
        return g.f2858b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        r6.k.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // h7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, h6.i iVar) {
        int i8 = g.f2858b;
        boolean z8 = i7 >= i8;
        if (z8) {
            i7 -= i8;
        }
        this.f2883f.get(i7 * 2);
        while (true) {
            Object k8 = k(i7);
            boolean z9 = k8 instanceof w1;
            e eVar = this.f2882e;
            if (z9 || (k8 instanceof v)) {
                if (j(k8, i7, z8 ? g.f2866j : g.f2867k)) {
                    m(i7, null);
                    l(i7, !z8);
                    if (z8) {
                        r6.k.c(eVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k8 == g.f2866j || k8 == g.f2867k) {
                    break;
                }
                if (k8 != g.f2863g && k8 != g.f2862f) {
                    if (k8 == g.f2865i || k8 == g.f2860d || k8 == g.f2868l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k8).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i7, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f2883f;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    public final Object k(int i7) {
        return this.f2883f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z8) {
        if (z8) {
            e eVar = this.f2882e;
            r6.k.c(eVar);
            eVar.I((this.f4704c * g.f2858b) + i7);
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f2883f.set(i7 * 2, obj);
    }

    public final void n(int i7, Object obj) {
        this.f2883f.set((i7 * 2) + 1, obj);
    }
}
