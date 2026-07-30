package androidx.collection;

import f6.l;
import f6.p;
import f6.r;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, p sizeOf, l create, r onEntryRemoved) {
        s.checkNotNullParameter(sizeOf, "sizeOf");
        s.checkNotNullParameter(create, "create");
        s.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, p sizeOf, l create, r onEntryRemoved, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            sizeOf = new p() { // from class: androidx.collection.LruCacheKt$lruCache$1
                @Override // f6.p
                public final Integer invoke(Object obj2, Object obj3) {
                    s.checkNotNullParameter(obj2, "<anonymous parameter 0>");
                    s.checkNotNullParameter(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i9 & 4) != 0) {
            create = new l() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // f6.l
                public final Object invoke(Object it) {
                    s.checkNotNullParameter(it, "it");
                    return null;
                }
            };
        }
        if ((i9 & 8) != 0) {
            onEntryRemoved = new r() { // from class: androidx.collection.LruCacheKt$lruCache$3
                public final void invoke(boolean z7, Object obj2, Object obj3, Object obj4) {
                    s.checkNotNullParameter(obj2, "<anonymous parameter 1>");
                    s.checkNotNullParameter(obj3, "<anonymous parameter 2>");
                }

                @Override // f6.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return w.INSTANCE;
                }
            };
        }
        s.checkNotNullParameter(sizeOf, "sizeOf");
        s.checkNotNullParameter(create, "create");
        s.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }
}
