package f2;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends Reader {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6656e = false;

    /* renamed from: i, reason: collision with root package name */
    public int f6657i;

    /* renamed from: k, reason: collision with root package name */
    public int f6659k = this.f6657i;

    /* renamed from: j, reason: collision with root package name */
    public int f6658j;

    /* renamed from: l, reason: collision with root package name */
    public int f6660l = this.f6658j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6661m = false;

    public b() {
        this.f6655d = null;
        this.f6655d = new ArrayList();
    }

    public final long a(long j4) {
        long j5 = 0;
        while (this.f6658j < this.f6655d.size() && j5 < j4) {
            String d4 = d();
            long j6 = j4 - j5;
            long length = d4 == null ? 0 : d4.length() - this.f6657i;
            if (j6 < length) {
                this.f6657i = (int) (this.f6657i + j6);
                j5 += j6;
            } else {
                j5 += length;
                this.f6657i = 0;
                this.f6658j++;
            }
        }
        return j5;
    }

    public final void b() {
        if (this.f6656e) {
            throw new IOException("Stream already closed");
        }
        if (!this.f6661m) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
        this.f6656e = true;
    }

    public final String d() {
        int i2 = this.f6658j;
        ArrayList arrayList = this.f6655d;
        if (i2 < arrayList.size()) {
            return (String) arrayList.get(this.f6658j);
        }
        return null;
    }

    @Override // java.io.Reader
    public final void mark(int i2) {
        b();
        this.f6659k = this.f6657i;
        this.f6660l = this.f6658j;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) {
        b();
        int remaining = charBuffer.remaining();
        String d4 = d();
        int i2 = 0;
        while (remaining > 0 && d4 != null) {
            int min = Math.min(d4.length() - this.f6657i, remaining);
            String str = (String) this.f6655d.get(this.f6658j);
            int i4 = this.f6657i;
            charBuffer.put(str, i4, i4 + min);
            remaining -= min;
            i2 += min;
            a(min);
            d4 = d();
        }
        if (i2 > 0 || d4 != null) {
            return i2;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        b();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f6657i = this.f6659k;
        this.f6658j = this.f6660l;
    }

    @Override // java.io.Reader
    public final long skip(long j4) {
        b();
        return a(j4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f6655d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public final int read() {
        b();
        String d4 = d();
        if (d4 == null) {
            return -1;
        }
        char charAt = d4.charAt(this.f6657i);
        a(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i2, int i4) {
        b();
        String d4 = d();
        int i5 = 0;
        while (d4 != null && i5 < i4) {
            String d5 = d();
            int min = Math.min(d5 == null ? 0 : d5.length() - this.f6657i, i4 - i5);
            int i6 = this.f6657i;
            d4.getChars(i6, i6 + min, cArr, i2 + i5);
            i5 += min;
            a(min);
            d4 = d();
        }
        if (i5 > 0 || d4 != null) {
            return i5;
        }
        return -1;
    }
}
