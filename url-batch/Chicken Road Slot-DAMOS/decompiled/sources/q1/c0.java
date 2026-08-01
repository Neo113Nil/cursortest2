package q1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f7816a;

    public abstract void a(m1.d dVar);

    public Function1 b() {
        return this.f7816a;
    }

    public final void c() {
        Function1 b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(a3.e eVar) {
        this.f7816a = eVar;
    }
}
