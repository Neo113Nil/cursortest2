package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.B5;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u001d\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u0012\u0010!\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010#J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/collection/LruCache;", "K", "", "V", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "", "(I)V", "createCount", "evictionCount", "hitCount", "lock", "Landroidx/collection/internal/Lock;", "map", "Landroidx/collection/internal/LruHashMap;", "missCount", "putCount", "size", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", n.g, "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "toString", "", "trimToSize", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final Lock lock;

    @NotNull
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    @Nullable
    protected V create(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void entryRemoved(boolean evicted, @NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    protected int sizeOf(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public LruCache(int i) {
        this.maxSize = i;
        if (!(i > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    public void resize(@IntRange int maxSize) {
        if (!(maxSize > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(maxSize);
    }

    @Nullable
    public final V get(@NotNull K key) {
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            V v2 = (V) this.map.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.put(key, create);
                    if (v != null) {
                        this.map.put(key, v);
                    } else {
                        this.size += safeSizeOf(key, create);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, create, v);
                return v;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                v = (V) this.map.put(key, value);
                if (v != null) {
                    this.size -= safeSizeOf(key, v);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, value);
        }
        trimToSize(this.maxSize);
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int maxSize) {
        boolean z;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        z = false;
                        if (!z) {
                            RuntimeHelpersKt.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                        }
                        if (this.size > maxSize || this.map.isEmpty()) {
                            break;
                        }
                        entry = (Map.Entry) CollectionsKt.firstOrNull(this.map.getEntries());
                        if (entry != null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.map.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    z = true;
                    if (!z) {
                    }
                    if (this.size > maxSize) {
                        break;
                        break;
                    } else {
                        entry = (Map.Entry) CollectionsKt.firstOrNull(this.map.getEntries());
                        if (entry != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                v = (V) this.map.remove(key);
                if (v != null) {
                    this.size -= safeSizeOf(key, v);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, null);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int safeSizeOf(Object key, Object value) {
        int sizeOf = sizeOf(key, value);
        if (!(sizeOf >= 0)) {
            RuntimeHelpersKt.throwIllegalStateException("Negative size: " + key + B5.U + value);
        }
        return sizeOf;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.getEntries().size());
            for (Map.Entry entry : this.map.getEntries()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
