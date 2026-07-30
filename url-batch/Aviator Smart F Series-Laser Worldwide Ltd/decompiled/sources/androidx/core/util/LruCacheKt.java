package androidx.core.util;

import android.util.LruCache;
import f6.l;
import f6.p;
import f6.r;
import y5.w;

/* loaded from: classes.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, p pVar, l lVar, r rVar) {
        return new LruCacheKt$lruCache$4(i8, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, p pVar, l lVar, r rVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            pVar = new p() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                @Override // f6.p
                public final Integer invoke(Object obj2, Object obj3) {
                    return 1;
                }
            };
        }
        if ((i9 & 4) != 0) {
            lVar = new l() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // f6.l
                public final Object invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i9 & 8) != 0) {
            rVar = new r() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                public final void invoke(boolean z7, Object obj2, Object obj3, Object obj4) {
                }

                @Override // f6.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return w.INSTANCE;
                }
            };
        }
        return new LruCacheKt$lruCache$4(i8, pVar, lVar, rVar);
    }
}
