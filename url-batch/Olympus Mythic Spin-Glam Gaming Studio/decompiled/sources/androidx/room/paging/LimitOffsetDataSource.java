package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

@RestrictTo
/* loaded from: classes12.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: androidx.room.paging.LimitOffsetDataSource$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 extends InvalidationTracker.Observer {
        final /* synthetic */ LimitOffsetDataSource this$0;

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set set) {
            this.this$0.invalidate();
        }
    }
}
