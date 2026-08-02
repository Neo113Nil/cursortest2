package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.functions.Function;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes9.dex */
public final class SingleMap extends Single {
    public final /* synthetic */ int $r8$classId;
    public final Function mapper;
    public final Single source;

    public /* synthetic */ SingleMap(Single single, Function function, int i) {
        this.$r8$classId = i;
        this.mapper = function;
        this.source = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        int i = this.$r8$classId;
        Function function = this.mapper;
        Single single = this.source;
        switch (i) {
            case 0:
                single.subscribe(new RealWebSocket$connect$1(8, singleObserver, function));
                break;
            case 1:
                single.subscribe(new SingleFlatMap$SingleFlatMapCallback(singleObserver, function, 0));
                break;
            default:
                single.subscribe(new SingleFlatMap$SingleFlatMapCallback(singleObserver, function, 1));
                break;
        }
    }
}
