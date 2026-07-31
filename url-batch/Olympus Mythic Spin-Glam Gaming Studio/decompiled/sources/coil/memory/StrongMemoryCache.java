package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
/* loaded from: classes9.dex */
public interface StrongMemoryCache {
    MemoryCache.Value get(MemoryCache.Key key);

    void set(MemoryCache.Key key, Bitmap bitmap, Map map);

    void trimMemory(int i);
}
