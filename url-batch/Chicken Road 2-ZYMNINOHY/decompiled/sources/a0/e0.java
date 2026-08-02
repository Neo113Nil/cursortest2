package a0;

import java.util.ArrayList;
import q0.AbstractC1359a;
import q0.C1381x;

/* loaded from: classes.dex */
public final class e0 implements W {

    /* renamed from: a, reason: collision with root package name */
    public final C1381x f4101a;

    /* renamed from: d, reason: collision with root package name */
    public int f4104d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4105e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4103c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f4102b = new Object();

    public e0(AbstractC1359a abstractC1359a, boolean z) {
        this.f4101a = new C1381x(abstractC1359a, z);
    }

    @Override // a0.W
    public final Object a() {
        return this.f4102b;
    }

    @Override // a0.W
    public final T.T b() {
        return this.f4101a.o;
    }
}
