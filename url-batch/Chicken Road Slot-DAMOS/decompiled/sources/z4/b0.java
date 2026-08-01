package z4;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f10725a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10726b;

    /* renamed from: c, reason: collision with root package name */
    public final hd.q f10727c;

    public b0(u uVar) {
        uVar.getClass();
        this.f10725a = uVar;
        this.f10726b = new AtomicBoolean(false);
        this.f10727c = hd.h.b(new a0(0, this));
    }

    public final k5.k a() {
        u uVar = this.f10725a;
        uVar.a();
        if (this.f10726b.compareAndSet(false, true)) {
            return (k5.k) this.f10727c.getValue();
        }
        String b10 = b();
        uVar.getClass();
        uVar.a();
        uVar.b();
        return uVar.k().G().h(b10);
    }

    public abstract String b();

    public final void c(k5.k kVar) {
        kVar.getClass();
        if (kVar == ((k5.k) this.f10727c.getValue())) {
            this.f10726b.set(false);
        }
    }
}
