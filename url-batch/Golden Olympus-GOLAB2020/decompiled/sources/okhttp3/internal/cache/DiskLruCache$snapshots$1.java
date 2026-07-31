package okhttp3.internal.cache;

import i2.InterfaceC2471a;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.cache.DiskLruCache;

@Metadata
/* loaded from: classes3.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f42680b;

    /* renamed from: c, reason: collision with root package name */
    private DiskLruCache.Snapshot f42681c;

    /* renamed from: d, reason: collision with root package name */
    private DiskLruCache.Snapshot f42682d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f42683e;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.f42681c;
        this.f42682d = snapshot;
        this.f42681c = null;
        Intrinsics.checkNotNull(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot r4;
        if (this.f42681c != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.f42683e;
        synchronized (diskLruCache) {
            if (diskLruCache.Q()) {
                return false;
            }
            while (this.f42680b.hasNext()) {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.f42680b.next();
                if (entry != null && (r4 = entry.r()) != null) {
                    this.f42681c = r4;
                    return true;
                }
            }
            Unit unit = Unit.f41027a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.f42682d;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.f42683e.e0(snapshot.o());
        } catch (IOException unused) {
        } finally {
            this.f42682d = null;
        }
    }
}
