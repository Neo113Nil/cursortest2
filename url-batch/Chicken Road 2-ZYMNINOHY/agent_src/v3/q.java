package v3;

import java.util.Iterator;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f15723a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1339l f15724b;

    public q(j jVar, InterfaceC1339l interfaceC1339l) {
        this.f15723a = jVar;
        this.f15724b = interfaceC1339l;
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new p(this);
    }
}
