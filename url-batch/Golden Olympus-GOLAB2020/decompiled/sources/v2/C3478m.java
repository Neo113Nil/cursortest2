package v2;

import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3313G;
import t2.AbstractC3444o;

/* renamed from: v2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3478m extends AbstractC3313G {

    /* renamed from: d, reason: collision with root package name */
    public static final C3478m f46483d = new C3478m();

    private C3478m() {
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        C3468c.f46464j.V(runnable, AbstractC3477l.f46482h, false);
    }

    @Override // o2.AbstractC3313G
    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        C3468c.f46464j.V(runnable, AbstractC3477l.f46482h, true);
    }

    @Override // o2.AbstractC3313G
    public AbstractC3313G j(int i4) {
        AbstractC3444o.a(i4);
        return i4 >= AbstractC3477l.f46478d ? this : super.j(i4);
    }
}
