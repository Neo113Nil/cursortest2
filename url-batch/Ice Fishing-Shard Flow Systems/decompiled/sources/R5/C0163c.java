package R5;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: R5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163c extends AbstractC0162b implements V5.b {

    /* renamed from: d, reason: collision with root package name */
    public B6.q f2410d;

    /* renamed from: e, reason: collision with root package name */
    public Unit f2411e;

    /* renamed from: i, reason: collision with root package name */
    public V5.b f2412i;

    /* renamed from: l, reason: collision with root package name */
    public Object f2413l;

    @Override // V5.b
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f6146d;
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        this.f2412i = null;
        this.f2413l = obj;
    }
}
