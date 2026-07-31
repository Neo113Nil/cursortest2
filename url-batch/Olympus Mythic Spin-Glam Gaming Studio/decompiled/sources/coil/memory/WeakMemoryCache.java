package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: WeakMemoryCache.kt */
/* loaded from: classes10.dex */
public interface WeakMemoryCache {
    MemoryCache.Value get(MemoryCache.Key key);

    void set(MemoryCache.Key key, Bitmap bitmap, Map map, int i);

    void trimMemory(int i);
}
