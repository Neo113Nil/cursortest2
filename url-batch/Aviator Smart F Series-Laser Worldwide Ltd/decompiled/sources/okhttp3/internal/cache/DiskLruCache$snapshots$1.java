package okhttp3.internal.cache;

import g6.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;
import okhttp3.internal.cache.DiskLruCache;
import y5.w;

/* loaded from: classes5.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, d {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        s.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                DiskLruCache.Snapshot snapshot$okhttp = next == null ? null : next.snapshot$okhttp();
                if (snapshot$okhttp != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            w wVar = w.INSTANCE;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        try {
            this.this$0.remove(snapshot.key());
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.removeSnapshot = null;
            throw th;
        }
        this.removeSnapshot = null;
    }

    @Override // java.util.Iterator
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.nextSnapshot;
        this.removeSnapshot = snapshot;
        this.nextSnapshot = null;
        s.checkNotNull(snapshot);
        return snapshot;
    }
}
