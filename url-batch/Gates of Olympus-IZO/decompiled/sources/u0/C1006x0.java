package u0;

import java.util.ArrayList;

/* renamed from: u0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006x0 implements t0.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f8495d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8496e;

    /* renamed from: f, reason: collision with root package name */
    public Float f8497f = null;

    /* renamed from: g, reason: collision with root package name */
    public Float f8498g = null;

    /* renamed from: h, reason: collision with root package name */
    public z0.g f8499h = null;

    /* renamed from: i, reason: collision with root package name */
    public z0.g f8500i = null;

    public C1006x0(int i3, ArrayList arrayList) {
        this.f8495d = i3;
        this.f8496e = arrayList;
    }

    @Override // t0.h0
    public final boolean H() {
        return this.f8496e.contains(this);
    }
}
