package m7;

import java.util.ArrayList;
import java.util.Iterator;
import l7.C4707a;
import n7.C4817c;

/* renamed from: m7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4796j {

    /* renamed from: b, reason: collision with root package name */
    public final U6.d f39604b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4791e f39605c;

    /* renamed from: d, reason: collision with root package name */
    public final C4707a f39606d;

    /* renamed from: e, reason: collision with root package name */
    public final D5.a f39607e;

    /* renamed from: f, reason: collision with root package name */
    public final C4817c f39608f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4795i f39609g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f39603a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile U6.c f39610h = null;

    public C4796j(U6.d dVar, EnumC4791e enumC4791e, C4707a c4707a, D5.a aVar, C4817c c4817c, ArrayList arrayList) {
        this.f39604b = dVar;
        this.f39605c = enumC4791e;
        this.f39606d = c4707a;
        this.f39607e = aVar;
        this.f39608f = c4817c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC4795i) it.next());
        }
        this.f39609g = arrayList2.isEmpty() ? C4790d.f39587n : arrayList2.size() == 1 ? (InterfaceC4795i) arrayList2.get(0) : new C4789c(new ArrayList(arrayList2));
    }
}
