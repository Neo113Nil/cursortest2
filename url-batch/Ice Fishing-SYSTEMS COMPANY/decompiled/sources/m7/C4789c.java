package m7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: m7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4789c implements InterfaceC4795i {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f39582n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f39583u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f39584v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f39585w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f39586x = new AtomicBoolean(false);

    public C4789c(ArrayList arrayList) {
        this.f39585w = arrayList;
        this.f39582n = new ArrayList(arrayList.size());
        this.f39584v = new ArrayList(arrayList.size());
        this.f39583u = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4795i interfaceC4795i = (InterfaceC4795i) it.next();
            if (interfaceC4795i.O()) {
                this.f39582n.add(interfaceC4795i);
            }
            if (interfaceC4795i instanceof C4789c) {
                C4789c c4789c = (C4789c) interfaceC4795i;
                if (!c4789c.f39583u.isEmpty()) {
                    this.f39583u.add(c4789c);
                }
            }
            if (interfaceC4795i.U()) {
                this.f39584v.add(interfaceC4795i);
            }
        }
    }

    @Override // m7.InterfaceC4795i
    public final U6.c M() {
        ArrayList arrayList = this.f39585w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4795i) it.next()).M());
        }
        return U6.c.d(arrayList2);
    }

    @Override // m7.InterfaceC4795i
    public final boolean O() {
        return !this.f39582n.isEmpty();
    }

    @Override // m7.InterfaceC4795i
    public final boolean U() {
        return !this.f39584v.isEmpty();
    }

    @Override // m7.InterfaceC4795i
    public final U6.c shutdown() {
        if (this.f39586x.getAndSet(true)) {
            return U6.c.f3310e;
        }
        ArrayList arrayList = this.f39585w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC4795i) it.next()).shutdown());
        }
        return U6.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f39582n + ", spanProcessorsEnding=" + this.f39583u + ", spanProcessorsEnd=" + this.f39584v + ", spanProcessorsAll=" + this.f39585w + '}';
    }
}
