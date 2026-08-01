package g1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {
    public static final d h = new d();

    /* renamed from: a, reason: collision with root package name */
    public final a0.a f1634a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.a f1635b;

    /* renamed from: e, reason: collision with root package name */
    public List f1637e;

    /* renamed from: g, reason: collision with root package name */
    public int f1639g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f1638f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final d f1636c = h;

    public e(a0.a aVar, a0.a aVar2) {
        this.f1634a = aVar;
        this.f1635b = aVar2;
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o1.c cVar = ((i0) it.next()).f1690a;
        }
    }
}
