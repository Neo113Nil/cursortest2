package q1;

import java.util.Iterator;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.c f3821a;

    public i(r1.c cVar) {
        this.f3821a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r1.b(this.f3821a);
    }
}
