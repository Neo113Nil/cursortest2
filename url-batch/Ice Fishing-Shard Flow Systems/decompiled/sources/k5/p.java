package k5;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class p implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f6099a;

    /* renamed from: b, reason: collision with root package name */
    public int f6100b;

    /* renamed from: c, reason: collision with root package name */
    public m f6101c;

    /* renamed from: d, reason: collision with root package name */
    public g f6102d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b7 = this.f6102d.b();
        int d7 = this.f6101c.d(obj, obj2, this.f6102d);
        this.f6102d.f6072c[b7] = d7;
        this.f6099a = C0603c.b(d7) + this.f6100b + d7 + this.f6099a;
    }
}
