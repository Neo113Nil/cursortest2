package v3;

import java.util.Iterator;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f15706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15707b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1339l f15708c;

    public g(j jVar, boolean z, InterfaceC1339l interfaceC1339l) {
        this.f15706a = jVar;
        this.f15707b = z;
        this.f15708c = interfaceC1339l;
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new f(this);
    }
}
