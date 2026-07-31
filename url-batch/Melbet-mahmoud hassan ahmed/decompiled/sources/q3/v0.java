package q3;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final h.a<b<?>, o3.b> f20324a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a<b<?>, String> f20325b;

    /* renamed from: c, reason: collision with root package name */
    private final j4.i<Map<b<?>, String>> f20326c;

    /* renamed from: d, reason: collision with root package name */
    private int f20327d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20328e;

    public final Set<b<?>> a() {
        return this.f20324a.keySet();
    }

    public final void b(b<?> bVar, o3.b bVar2, String str) {
        this.f20324a.put(bVar, bVar2);
        this.f20325b.put(bVar, str);
        this.f20327d--;
        if (!bVar2.j()) {
            this.f20328e = true;
        }
        if (this.f20327d == 0) {
            if (!this.f20328e) {
                this.f20326c.c(this.f20325b);
            } else {
                this.f20326c.b(new p3.c(this.f20324a));
            }
        }
    }
}
