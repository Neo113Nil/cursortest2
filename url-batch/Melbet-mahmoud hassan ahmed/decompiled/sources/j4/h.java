package j4;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h<TResult> {
    public h<TResult> a(@RecentlyNonNull Executor executor, @RecentlyNonNull c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public h<TResult> b(@RecentlyNonNull d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> c(@RecentlyNonNull Executor executor, @RecentlyNonNull d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract h<TResult> d(@RecentlyNonNull Executor executor, @RecentlyNonNull e eVar);

    public abstract h<TResult> e(@RecentlyNonNull Executor executor, @RecentlyNonNull f<? super TResult> fVar);

    public <TContinuationResult> h<TContinuationResult> f(@RecentlyNonNull Executor executor, @RecentlyNonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> g(@RecentlyNonNull a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> h(@RecentlyNonNull Executor executor, @RecentlyNonNull a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    public abstract Exception i();

    @RecentlyNonNull
    public abstract TResult j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();
}
