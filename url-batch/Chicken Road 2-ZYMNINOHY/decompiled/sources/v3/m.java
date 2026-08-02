package v3;

import java.util.Iterator;
import p3.InterfaceC1349a;
import w3.C1505b;
import w3.C1506c;

/* loaded from: classes.dex */
public final class m implements Iterable, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1506c f15716a;

    public m(C1506c c1506c) {
        this.f15716a = c1506c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1505b(this.f15716a);
    }
}
