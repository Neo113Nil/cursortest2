package k5;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends Reader {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5369f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5370g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f5371h;

    /* renamed from: j, reason: collision with root package name */
    public int f5373j = this.f5371h;

    /* renamed from: i, reason: collision with root package name */
    public int f5372i;

    /* renamed from: k, reason: collision with root package name */
    public int f5374k = this.f5372i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5375l = false;

    public b() {
        this.f5369f = null;
        this.f5369f = new ArrayList();
    }

    public final long b(long j8) {
        long j9 = 0;
        while (this.f5372i < this.f5369f.size() && j9 < j8) {
            String k8 = k();
            long j10 = j8 - j9;
            long length = k8 == null ? 0 : k8.length() - this.f5371h;
            if (j10 < length) {
                this.f5371h = (int) (this.f5371h + j10);
                j9 += j10;
            } else {
                j9 += length;
                this.f5371h = 0;
                this.f5372i++;
            }
        }
        return j9;
    }

    public final void c() {
        if (this.f5370g) {
            throw new IOException("Stream already closed");
        }
        if (!this.f5375l) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
        this.f5370g = true;
    }

    public final String k() {
        int i7 = this.f5372i;
        ArrayList arrayList = this.f5369f;
        if (i7 < arrayList.size()) {
            return (String) arrayList.get(this.f5372i);
        }
        return null;
    }

    @Override // java.io.Reader
    public final void mark(int i7) {
        c();
        this.f5373j = this.f5371h;
        this.f5374k = this.f5372i;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) {
        c();
        int remaining = charBuffer.remaining();
        String k8 = k();
        int i7 = 0;
        while (remaining > 0 && k8 != null) {
            int min = Math.min(k8.length() - this.f5371h, remaining);
            String str = (String) this.f5369f.get(this.f5372i);
            int i8 = this.f5371h;
            charBuffer.put(str, i8, i8 + min);
            remaining -= min;
            i7 += min;
            b(min);
            k8 = k();
        }
        if (i7 > 0 || k8 != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        c();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f5371h = this.f5373j;
        this.f5372i = this.f5374k;
    }

    @Override // java.io.Reader
    public final long skip(long j8) {
        c();
        return b(j8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f5369f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            sb.append((String) obj);
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public final int read() {
        c();
        String k8 = k();
        if (k8 == null) {
            return -1;
        }
        char charAt = k8.charAt(this.f5371h);
        b(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i7, int i8) {
        c();
        String k8 = k();
        int i9 = 0;
        while (k8 != null && i9 < i8) {
            String k9 = k();
            int min = Math.min(k9 == null ? 0 : k9.length() - this.f5371h, i8 - i9);
            int i10 = this.f5371h;
            k8.getChars(i10, i10 + min, cArr, i7 + i9);
            i9 += min;
            b(min);
            k8 = k();
        }
        if (i9 > 0 || k8 != null) {
            return i9;
        }
        return -1;
    }
}
