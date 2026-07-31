package okhttp3;

import f2.AbstractC2420c;
import i2.InterfaceC2471a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.cache.DiskLruCache;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class Cache$urls$1 implements Iterator<String>, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f42161b;

    /* renamed from: c, reason: collision with root package name */
    private String f42162c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42163d;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f42162c;
        Intrinsics.checkNotNull(str);
        this.f42162c = null;
        this.f42163d = true;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f42162c != null) {
            return true;
        }
        this.f42163d = false;
        while (this.f42161b.hasNext()) {
            try {
                Closeable closeable = (Closeable) this.f42161b.next();
                try {
                    continue;
                    this.f42162c = p.d(((DiskLruCache.Snapshot) closeable).n(0)).I();
                    AbstractC2420c.a(closeable, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f42163d) {
            throw new IllegalStateException("remove() before next()");
        }
        this.f42161b.remove();
    }
}
