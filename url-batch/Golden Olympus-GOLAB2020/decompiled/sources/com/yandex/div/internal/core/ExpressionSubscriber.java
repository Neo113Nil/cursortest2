package com.yandex.div.internal.core;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Releasable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface ExpressionSubscriber extends Releasable {
    default void addSubscription(@Nullable Disposable disposable) {
        if (disposable == null || disposable == Disposable.NULL) {
            return;
        }
        getSubscriptions().add(disposable);
    }

    default void closeAllSubscription() {
        Iterator<T> it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        getSubscriptions().clear();
    }

    @NotNull
    List<Disposable> getSubscriptions();

    @Override // com.yandex.div.core.view2.Releasable
    default void release() {
        closeAllSubscription();
    }
}
