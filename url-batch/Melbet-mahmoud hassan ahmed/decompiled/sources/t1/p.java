package t1;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class p implements n2.l {

    /* renamed from: a, reason: collision with root package name */
    private final n2.l f22145a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22146b;

    /* renamed from: c, reason: collision with root package name */
    private final a f22147c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f22148d;

    /* renamed from: e, reason: collision with root package name */
    private int f22149e;

    public interface a {
        void b(o2.a0 a0Var);
    }

    public p(n2.l lVar, int i7, a aVar) {
        o2.a.a(i7 > 0);
        this.f22145a = lVar;
        this.f22146b = i7;
        this.f22147c = aVar;
        this.f22148d = new byte[1];
        this.f22149e = i7;
    }

    private boolean q() {
        if (this.f22145a.read(this.f22148d, 0, 1) == -1) {
            return false;
        }
        int i7 = (this.f22148d[0] & 255) << 4;
        if (i7 == 0) {
            return true;
        }
        byte[] bArr = new byte[i7];
        int i8 = i7;
        int i9 = 0;
        while (i8 > 0) {
            int read = this.f22145a.read(bArr, i9, i8);
            if (read == -1) {
                return false;
            }
            i9 += read;
            i8 -= read;
        }
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        if (i7 > 0) {
            this.f22147c.b(new o2.a0(bArr, i7));
        }
        return true;
    }

    @Override // n2.l
    public long b(n2.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // n2.l
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // n2.l
    public void d(n2.p0 p0Var) {
        o2.a.e(p0Var);
        this.f22145a.d(p0Var);
    }

    @Override // n2.l
    public Map<String, List<String>> g() {
        return this.f22145a.g();
    }

    @Override // n2.l
    public Uri k() {
        return this.f22145a.k();
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (this.f22149e == 0) {
            if (!q()) {
                return -1;
            }
            this.f22149e = this.f22146b;
        }
        int read = this.f22145a.read(bArr, i7, Math.min(this.f22149e, i8));
        if (read != -1) {
            this.f22149e -= read;
        }
        return read;
    }
}
