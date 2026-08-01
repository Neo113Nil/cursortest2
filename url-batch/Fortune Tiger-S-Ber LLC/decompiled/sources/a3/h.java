package a3;

import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h implements Iterable, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b3.c f77f;

    public h(b3.c cVar) {
        this.f77f = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b3.b(this.f77f);
    }
}
