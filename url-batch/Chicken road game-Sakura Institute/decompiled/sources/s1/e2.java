package s1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e2 implements r1.h1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f8204f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8205g;

    /* renamed from: h, reason: collision with root package name */
    public Float f8206h = null;

    /* renamed from: i, reason: collision with root package name */
    public Float f8207i = null;

    /* renamed from: j, reason: collision with root package name */
    public y1.g f8208j = null;

    /* renamed from: k, reason: collision with root package name */
    public y1.g f8209k = null;

    public e2(int i7, ArrayList arrayList) {
        this.f8204f = i7;
        this.f8205g = arrayList;
    }

    @Override // r1.h1
    public final boolean z() {
        return this.f8205g.contains(this);
    }
}
