package io.reactivex;

import io.reactivex.annotations.NonNull;
import p7.b;

/* loaded from: classes4.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    b apply(@NonNull Flowable<Upstream> flowable);
}
