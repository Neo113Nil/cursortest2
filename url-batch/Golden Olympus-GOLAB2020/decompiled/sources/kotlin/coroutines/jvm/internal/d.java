package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient kotlin.coroutines.d intercepted;

    public d(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
        super(dVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final kotlin.coroutines.d intercepted() {
        kotlin.coroutines.d dVar = this.intercepted;
        if (dVar == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().get(kotlin.coroutines.e.f41111K2);
            if (eVar == null || (dVar = eVar.b(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.e.f41111K2);
            Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.e) element).a(dVar);
        }
        this.intercepted = c.f41117b;
    }

    public d(kotlin.coroutines.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
