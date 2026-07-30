package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
final class f implements retrofit2.c {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;

    @Nullable
    private final Scheduler scheduler;

    f(Type type, @Nullable Scheduler scheduler, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isAsync = z7;
        this.isResult = z8;
        this.isBody = z9;
        this.isFlowable = z10;
        this.isSingle = z11;
        this.isMaybe = z12;
        this.isCompletable = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // retrofit2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object adapt(retrofit2.b bVar) {
        Observable aVar;
        Scheduler scheduler;
        Observable bVar2 = this.isAsync ? new b(bVar) : new c(bVar);
        if (!this.isResult) {
            if (this.isBody) {
                aVar = new a(bVar2);
            }
            scheduler = this.scheduler;
            if (scheduler != null) {
                bVar2 = bVar2.subscribeOn(scheduler);
            }
            return !this.isFlowable ? bVar2.toFlowable(BackpressureStrategy.LATEST) : this.isSingle ? bVar2.singleOrError() : this.isMaybe ? bVar2.singleElement() : this.isCompletable ? bVar2.ignoreElements() : RxJavaPlugins.onAssembly(bVar2);
        }
        aVar = new e(bVar2);
        bVar2 = aVar;
        scheduler = this.scheduler;
        if (scheduler != null) {
        }
        if (!this.isFlowable) {
        }
    }

    @Override // retrofit2.c
    public Type responseType() {
        return this.responseType;
    }
}
