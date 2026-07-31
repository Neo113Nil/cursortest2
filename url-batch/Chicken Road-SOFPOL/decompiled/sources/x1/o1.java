package x1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o1 implements w1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f8519d;

    /* renamed from: e, reason: collision with root package name */
    public final List f8520e;

    /* renamed from: f, reason: collision with root package name */
    public Float f8521f = null;

    /* renamed from: g, reason: collision with root package name */
    public Float f8522g = null;

    /* renamed from: h, reason: collision with root package name */
    public d2.h f8523h = null;
    public d2.h i = null;

    public o1(int i, ArrayList arrayList) {
        this.f8519d = i;
        this.f8520e = arrayList;
    }

    @Override // w1.l1
    public final boolean v() {
        return this.f8520e.contains(this);
    }
}
