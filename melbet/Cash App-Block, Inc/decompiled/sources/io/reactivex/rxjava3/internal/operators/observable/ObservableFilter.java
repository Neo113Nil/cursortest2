package io.reactivex.rxjava3.internal.operators.observable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.fidesmo.sec.delivery.ServiceDeliveryClient$$ExternalSyntheticLambda8;
import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.DisposableLambdaObserver;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.SerializedSubject;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class ObservableFilter extends AbstractObservableWithUpstream {
    public final /* synthetic */ int $r8$classId;
    public final Object predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableFilter(Observable observable, Object obj, int i) {
        super(observable);
        this.$r8$classId = i;
        this.predicate = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = this.$r8$classId;
        ObservableSource observableSource = this.source;
        Object obj = this.predicate;
        switch (i) {
            case 0:
                ((Observable) observableSource).subscribe(new ObservableMap.MapObserver(observer, (Predicate) obj, 1));
                break;
            case 1:
                ((Observable) observableSource).subscribe(new DisposableLambdaObserver(observer, (PreviewView$1$$ExternalSyntheticLambda2) obj, 0));
                break;
            case 2:
                SerializedSubject serializedSubject = new SerializedSubject(new PublishSubject());
                try {
                    Object mo39apply = ((ServiceDeliveryClient$$ExternalSyntheticLambda8) obj).mo39apply(serializedSubject);
                    Objects.requireNonNull(mo39apply, "The handler returned a null ObservableSource");
                    ObservableSource observableSource2 = (ObservableSource) mo39apply;
                    ObservableRetryWhen$RepeatWhenObserver observableRetryWhen$RepeatWhenObserver = new ObservableRetryWhen$RepeatWhenObserver(observer, serializedSubject, observableSource);
                    observer.onSubscribe(observableRetryWhen$RepeatWhenObserver);
                    ((Observable) observableSource2).subscribe(observableRetryWhen$RepeatWhenObserver.inner);
                    observableRetryWhen$RepeatWhenObserver.subscribeNext();
                    break;
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    EmptyDisposable.error(th, observer);
                }
            default:
                try {
                    Object obj2 = ((Functions.ArrayListCapacityCallable) obj).get();
                    Throwable th2 = ExceptionHelper.TERMINATED;
                    ((Observable) observableSource).subscribe(new DisposableLambdaObserver(observer, (Collection) obj2, 2));
                    break;
                } catch (Throwable th3) {
                    Longs.throwIfFatal(th3);
                    EmptyDisposable.error(th3, observer);
                    return;
                }
        }
    }
}
