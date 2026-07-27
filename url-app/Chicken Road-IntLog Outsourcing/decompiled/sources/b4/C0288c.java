package b4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288c implements InterfaceC0294i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4830a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4831b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4832c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4833d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4834e = new AtomicBoolean(false);

    public C0288c(ArrayList arrayList) {
        this.f4833d = arrayList;
        this.f4830a = new ArrayList(arrayList.size());
        this.f4832c = new ArrayList(arrayList.size());
        this.f4831b = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0294i interfaceC0294i = (InterfaceC0294i) it.next();
            if (interfaceC0294i.h()) {
                this.f4830a.add(interfaceC0294i);
            }
            if (interfaceC0294i instanceof C0288c) {
                C0288c c0288c = (C0288c) interfaceC0294i;
                if (!c0288c.f4831b.isEmpty()) {
                    this.f4831b.add(c0288c);
                }
            }
            if (interfaceC0294i.v()) {
                this.f4832c.add(interfaceC0294i);
            }
        }
    }

    @Override // b4.InterfaceC0294i
    public final J3.c e() {
        ArrayList arrayList = this.f4833d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0294i) it.next()).e());
        }
        return J3.c.d(arrayList2);
    }

    @Override // b4.InterfaceC0294i
    public final boolean h() {
        return !this.f4830a.isEmpty();
    }

    @Override // b4.InterfaceC0294i
    public final J3.c shutdown() {
        if (this.f4834e.getAndSet(true)) {
            return J3.c.f1361e;
        }
        ArrayList arrayList = this.f4833d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC0294i) it.next()).shutdown());
        }
        return J3.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f4830a + ", spanProcessorsEnding=" + this.f4831b + ", spanProcessorsEnd=" + this.f4832c + ", spanProcessorsAll=" + this.f4833d + '}';
    }

    @Override // b4.InterfaceC0294i
    public final boolean v() {
        return !this.f4832c.isEmpty();
    }
}
