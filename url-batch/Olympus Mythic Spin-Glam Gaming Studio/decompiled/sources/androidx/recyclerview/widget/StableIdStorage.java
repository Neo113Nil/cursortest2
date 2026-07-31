package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

/* loaded from: classes11.dex */
interface StableIdStorage {

    public static class NoStableIdStorage implements StableIdStorage {

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1, reason: invalid class name */
        class AnonymousClass1 implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1, reason: invalid class name */
        class AnonymousClass1 implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        }
    }

    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    public static class IsolatedStableIdStorage implements StableIdStorage {
        long mNextStableId;

        long obtainId() {
            long j = this.mNextStableId;
            this.mNextStableId = 1 + j;
            return j;
        }

        class WrapperStableIdLookup implements StableIdLookup {
            private final LongSparseArray mLocalToGlobalLookup;
            final /* synthetic */ IsolatedStableIdStorage this$0;

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                Long l = (Long) this.mLocalToGlobalLookup.get(j);
                if (l == null) {
                    l = Long.valueOf(this.this$0.obtainId());
                    this.mLocalToGlobalLookup.put(j, l);
                }
                return l.longValue();
            }
        }
    }
}
