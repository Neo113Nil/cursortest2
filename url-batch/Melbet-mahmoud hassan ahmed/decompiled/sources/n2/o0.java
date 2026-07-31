package n2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 implements l {

    /* renamed from: a, reason: collision with root package name */
    private final l f19492a;

    /* renamed from: b, reason: collision with root package name */
    private long f19493b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f19494c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f19495d = Collections.emptyMap();

    public o0(l lVar) {
        this.f19492a = (l) o2.a.e(lVar);
    }

    @Override // n2.l
    public long b(p pVar) {
        this.f19494c = pVar.f19496a;
        this.f19495d = Collections.emptyMap();
        long b7 = this.f19492a.b(pVar);
        this.f19494c = (Uri) o2.a.e(k());
        this.f19495d = g();
        return b7;
    }

    @Override // n2.l
    public void close() {
        this.f19492a.close();
    }

    @Override // n2.l
    public void d(p0 p0Var) {
        o2.a.e(p0Var);
        this.f19492a.d(p0Var);
    }

    @Override // n2.l
    public Map<String, List<String>> g() {
        return this.f19492a.g();
    }

    @Override // n2.l
    public Uri k() {
        return this.f19492a.k();
    }

    public long q() {
        return this.f19493b;
    }

    public Uri r() {
        return this.f19494c;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        int read = this.f19492a.read(bArr, i7, i8);
        if (read != -1) {
            this.f19493b += read;
        }
        return read;
    }

    public Map<String, List<String>> s() {
        return this.f19495d;
    }

    public void t() {
        this.f19493b = 0L;
    }
}
