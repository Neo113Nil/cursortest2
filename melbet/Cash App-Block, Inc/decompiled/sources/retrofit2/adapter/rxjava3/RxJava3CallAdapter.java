package retrofit2.adapter.rxjava3;

import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* loaded from: classes4.dex */
public final class RxJava3CallAdapter implements CallAdapter {
    public final boolean isBody;
    public final boolean isCompletable;
    public final boolean isFlowable;
    public final boolean isMaybe;
    public final boolean isResult;
    public final boolean isSingle;
    public final Type responseType;

    public RxJava3CallAdapter(Type type2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.responseType = type2;
        this.isResult = z;
        this.isBody = z2;
        this.isFlowable = z3;
        this.isSingle = z4;
        this.isMaybe = z5;
        this.isCompletable = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object adapt(Call call) {
        Observable bodyObservable;
        Observable callEnqueueObservable = new CallEnqueueObservable(call, 0);
        if (!this.isResult) {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callEnqueueObservable, 0);
            }
            return !this.isFlowable ? new FlowableFromObservable() : this.isSingle ? new ObservableSingleSingle(callEnqueueObservable, 0) : this.isMaybe ? new CoroutinesRoom.Companion(1) : this.isCompletable ? new CueEncoder(callEnqueueObservable, 1) : callEnqueueObservable;
        }
        bodyObservable = new BodyObservable(callEnqueueObservable, 1);
        callEnqueueObservable = bodyObservable;
        if (!this.isFlowable) {
        }
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.responseType;
    }
}
