package io.reactivex.rxjava3.internal.operators.single;

import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.FormBody;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes9.dex */
public final class SingleFlatMap$SingleFlatMapCallback extends AtomicReference implements SingleObserver, Disposable {
    public final /* synthetic */ int $r8$classId;
    public final SingleObserver downstream;
    public final Function mapper;

    public /* synthetic */ SingleFlatMap$SingleFlatMapCallback(SingleObserver singleObserver, Function function, int i) {
        this.$r8$classId = i;
        this.downstream = singleObserver;
        this.mapper = function;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.$r8$classId) {
            case 0:
                DisposableHelper.dispose(this);
                break;
            default:
                DisposableHelper.dispose(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        int i = this.$r8$classId;
        SingleObserver singleObserver = this.downstream;
        switch (i) {
            case 0:
                singleObserver.onError(th);
                break;
            default:
                try {
                    Object mo39apply = this.mapper.mo39apply(th);
                    Objects.requireNonNull(mo39apply, "The nextFunction returned a null SingleSource.");
                    ((Single) ((SingleSource) mo39apply)).subscribe(new RealWebSocket$connect$1(7, this, singleObserver));
                    break;
                } catch (Throwable th2) {
                    Longs.throwIfFatal(th2);
                    singleObserver.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        int i = this.$r8$classId;
        SingleObserver singleObserver = this.downstream;
        switch (i) {
            case 0:
                if (DisposableHelper.setOnce(this, disposable)) {
                    singleObserver.onSubscribe(this);
                    break;
                }
                break;
            default:
                if (DisposableHelper.setOnce(this, disposable)) {
                    singleObserver.onSubscribe(this);
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        int i = this.$r8$classId;
        SingleObserver singleObserver = this.downstream;
        switch (i) {
            case 0:
                try {
                    Object mo39apply = this.mapper.mo39apply(obj);
                    Objects.requireNonNull(mo39apply, "The single returned by the mapper is null");
                    SingleSource singleSource = (SingleSource) mo39apply;
                    if (((Disposable) get()) != DisposableHelper.DISPOSED) {
                        ((Single) singleSource).subscribe(new FormBody.Builder(this, singleObserver));
                        break;
                    }
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    singleObserver.onError(th);
                    return;
                }
                break;
            default:
                singleObserver.onSuccess(obj);
                break;
        }
    }
}
