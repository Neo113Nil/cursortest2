package g5;

import f5.C0387a;
import h5.InterfaceC0413d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public final O4.d f4309b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0400c f4310c;

    /* renamed from: d, reason: collision with root package name */
    public final C0387a f4311d;

    /* renamed from: e, reason: collision with root package name */
    public final Supplier f4312e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0413d f4313f;

    /* renamed from: g, reason: collision with root package name */
    public final j f4314g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4308a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile O4.c f4315h = null;

    public k(O4.d dVar, InterfaceC0400c interfaceC0400c, C0387a c0387a, Supplier supplier, InterfaceC0413d interfaceC0413d, List list) {
        this.f4309b = dVar;
        this.f4310c = interfaceC0400c;
        this.f4311d = c0387a;
        this.f4312e = supplier;
        this.f4313f = interfaceC0413d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((j) it.next());
        }
        this.f4314g = arrayList.isEmpty() ? e.f4292f : arrayList.size() == 1 ? (j) arrayList.get(0) : new d(new ArrayList(arrayList));
    }
}
