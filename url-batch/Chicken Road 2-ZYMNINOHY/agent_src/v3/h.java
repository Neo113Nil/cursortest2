package v3;

import java.util.Iterator;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f15709a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1339l f15710b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1339l f15711c;

    public h(j jVar, InterfaceC1339l interfaceC1339l, InterfaceC1339l interfaceC1339l2) {
        this.f15709a = jVar;
        this.f15710b = interfaceC1339l;
        this.f15711c = interfaceC1339l2;
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new f(this);
    }
}
