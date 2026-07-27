package b4;

import a4.C0195a;
import c4.C0313c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295j {

    /* renamed from: b, reason: collision with root package name */
    public final J3.d f4852b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0290e f4853c;

    /* renamed from: d, reason: collision with root package name */
    public final C0195a f4854d;

    /* renamed from: e, reason: collision with root package name */
    public final D3.h f4855e;

    /* renamed from: f, reason: collision with root package name */
    public final C0313c f4856f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0294i f4857g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4851a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile J3.c f4858h = null;

    public C0295j(J3.d dVar, EnumC0290e enumC0290e, C0195a c0195a, D3.h hVar, C0313c c0313c, ArrayList arrayList) {
        this.f4852b = dVar;
        this.f4853c = enumC0290e;
        this.f4854d = c0195a;
        this.f4855e = hVar;
        this.f4856f = c0313c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC0294i) it.next());
        }
        this.f4857g = arrayList2.isEmpty() ? C0289d.f4835a : arrayList2.size() == 1 ? (InterfaceC0294i) arrayList2.get(0) : new C0288c(new ArrayList(arrayList2));
    }
}
