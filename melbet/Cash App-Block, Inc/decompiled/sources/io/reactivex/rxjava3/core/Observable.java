package io.reactivex.rxjava3.core;

import com.fidesmo.sec.delivery.ServiceDeliveryClient$$ExternalSyntheticLambda8;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZip;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import java.util.Objects;
import kotlin.text.MatchResult;
import retrofit2.adapter.rxjava3.CallEnqueueObservable;

/* loaded from: classes4.dex */
public abstract class Observable<T> implements ObservableSource {
    public static ObservableZip combineLatest(ObservableSubscribeOn observableSubscribeOn, ObservableJust observableJust, BiFunction biFunction) {
        ObservableSource[] observableSourceArr = {observableSubscribeOn, observableJust};
        MatchResult.Destructured destructured = new MatchResult.Destructured(biFunction);
        int i = Flowable.BUFFER_SIZE;
        Functions.verifyPositive(i, "bufferSize");
        return new ObservableZip(observableSourceArr, destructured, i << 1, 1);
    }

    public static CallEnqueueObservable error(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new CallEnqueueObservable(new Functions.JustValue(th), 2);
    }

    public static ObservableJust just(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new ObservableJust(obj);
    }

    public final Observable compose(ObservableTransformer observableTransformer) {
        ObservableSource lambda$retryCall$24;
        Objects.requireNonNull(observableTransformer, "composer is null");
        ServiceDeliveryClient$$ExternalSyntheticLambda8 serviceDeliveryClient$$ExternalSyntheticLambda8 = (ServiceDeliveryClient$$ExternalSyntheticLambda8) observableTransformer;
        lambda$retryCall$24 = serviceDeliveryClient$$ExternalSyntheticLambda8.f$0.lambda$retryCall$24(serviceDeliveryClient$$ExternalSyntheticLambda8.f$1, serviceDeliveryClient$$ExternalSyntheticLambda8.f$2, this);
        Objects.requireNonNull(lambda$retryCall$24, "source is null");
        return lambda$retryCall$24 instanceof Observable ? (Observable) lambda$retryCall$24 : new CallEnqueueObservable(lambda$retryCall$24, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable flatMap(Function function) {
        int i = Flowable.BUFFER_SIZE;
        Objects.requireNonNull(function, "mapper is null");
        Functions.verifyPositive(Integer.MAX_VALUE, "maxConcurrency");
        Functions.verifyPositive(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableFlatMap(this, function, i);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? ObservableEmpty.INSTANCE : new SingleFlatMapObservable(obj, function, 1);
    }

    public final ObservableMap map(Function function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableMap(this, function, 0);
    }

    public final void subscribe(Observer observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            subscribeActual(observer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Longs.throwIfFatal(th);
            UnsignedBytes.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void subscribeActual(Observer observer);
}
