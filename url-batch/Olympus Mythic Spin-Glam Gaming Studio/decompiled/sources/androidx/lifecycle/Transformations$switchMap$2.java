package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transformations.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/lifecycle/Transformations$switchMap$2", "Landroidx/lifecycle/Observer;", "value", "", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Transformations$switchMap$2 implements Observer {
    final /* synthetic */ MediatorLiveData $result;
    final /* synthetic */ Function $switchMapFunction;
    private LiveData liveData;

    @Override // androidx.lifecycle.Observer
    public void onChanged(Object value) {
        LiveData liveData = (LiveData) this.$switchMapFunction.apply(value);
        LiveData liveData2 = this.liveData;
        if (liveData2 == liveData) {
            return;
        }
        if (liveData2 != null) {
            MediatorLiveData mediatorLiveData = this.$result;
            Intrinsics.checkNotNull(liveData2);
            mediatorLiveData.removeSource(liveData2);
        }
        this.liveData = liveData;
        if (liveData != null) {
            MediatorLiveData mediatorLiveData2 = this.$result;
            Intrinsics.checkNotNull(liveData);
            final MediatorLiveData mediatorLiveData3 = this.$result;
            mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: androidx.lifecycle.Transformations$switchMap$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onChanged$lambda$0;
                    onChanged$lambda$0 = Transformations$switchMap$2.onChanged$lambda$0(MediatorLiveData.this, obj);
                    return onChanged$lambda$0;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
