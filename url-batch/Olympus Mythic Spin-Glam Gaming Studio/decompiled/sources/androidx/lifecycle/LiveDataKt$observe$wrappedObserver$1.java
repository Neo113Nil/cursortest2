package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LiveData.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes13.dex */
public final class LiveDataKt$observe$wrappedObserver$1<T> implements Observer {
    final /* synthetic */ Function1 $onChanged;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.$onChanged.invoke(obj);
    }
}
