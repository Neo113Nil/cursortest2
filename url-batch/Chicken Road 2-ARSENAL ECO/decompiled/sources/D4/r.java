package D4;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class r implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f561a;

    /* renamed from: b, reason: collision with root package name */
    public int f562b;

    /* renamed from: c, reason: collision with root package name */
    public o f563c;

    /* renamed from: d, reason: collision with root package name */
    public i f564d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b7 = this.f564d.b();
        int d7 = this.f563c.d(obj, obj2, this.f564d);
        this.f564d.f533c[b7] = d7;
        this.f561a = d.b(d7) + this.f562b + d7 + this.f561a;
    }
}
