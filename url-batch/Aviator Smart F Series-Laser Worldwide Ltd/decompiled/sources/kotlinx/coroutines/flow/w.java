package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class w implements f {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f17051e;

    public w(Throwable th) {
        this.f17051e = th;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        throw this.f17051e;
    }
}
