package u0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H0 implements t0.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f9192d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9193e;

    /* renamed from: f, reason: collision with root package name */
    public Float f9194f = null;

    /* renamed from: g, reason: collision with root package name */
    public Float f9195g = null;

    /* renamed from: h, reason: collision with root package name */
    public A0.g f9196h = null;

    /* renamed from: i, reason: collision with root package name */
    public A0.g f9197i = null;

    public H0(int i3, ArrayList arrayList) {
        this.f9192d = i3;
        this.f9193e = arrayList;
    }

    @Override // t0.i0
    public final boolean L() {
        return this.f9193e.contains(this);
    }
}
