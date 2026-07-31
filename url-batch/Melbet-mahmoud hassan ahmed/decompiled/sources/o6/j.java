package o6;

import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.y;
import m6.q0;

/* loaded from: classes.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: i, reason: collision with root package name */
    public final Throwable f19925i;

    @Override // o6.s
    public y A(n.b bVar) {
        return m6.m.f19306a;
    }

    @Override // o6.q
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j<E> e() {
        return this;
    }

    @Override // o6.s
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j<E> z() {
        return this;
    }

    public final Throwable E() {
        Throwable th = this.f19925i;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable F() {
        Throwable th = this.f19925i;
        return th == null ? new l("Channel was closed") : th;
    }

    @Override // o6.q
    public void a(E e7) {
    }

    @Override // o6.q
    public y f(E e7, n.b bVar) {
        return m6.m.f19306a;
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return "Closed@" + q0.b(this) + '[' + this.f19925i + ']';
    }

    @Override // o6.s
    public void y() {
    }
}
