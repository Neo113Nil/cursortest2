package t1;

import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private final w0.r f21967a;

    /* renamed from: b, reason: collision with root package name */
    private w0.l f21968b;

    /* renamed from: c, reason: collision with root package name */
    private w0.m f21969c;

    public c(w0.r rVar) {
        this.f21967a = rVar;
    }

    @Override // t1.f0
    public void a() {
        w0.l lVar = this.f21968b;
        if (lVar != null) {
            lVar.a();
            this.f21968b = null;
        }
        this.f21969c = null;
    }

    @Override // t1.f0
    public void b(long j7, long j8) {
        ((w0.l) o2.a.e(this.f21968b)).b(j7, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r6.p() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r6.p() != r11) goto L33;
     */
    @Override // t1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(n2.i iVar, Uri uri, Map<String, List<String>> map, long j7, long j8, w0.n nVar) {
        w0.f fVar = new w0.f(iVar, j7, j8);
        this.f21969c = fVar;
        if (this.f21968b != null) {
            return;
        }
        w0.l[] b7 = this.f21967a.b(uri, map);
        if (b7.length == 1) {
            this.f21968b = b7[0];
        } else {
            int length = b7.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                w0.l lVar = b7[i7];
                try {
                } catch (EOFException unused) {
                    if (this.f21968b == null) {
                    }
                } catch (Throwable th) {
                    o2.a.f(this.f21968b != null || fVar.p() == j7);
                    fVar.h();
                    throw th;
                }
                if (lVar.h(fVar)) {
                    this.f21968b = lVar;
                    o2.a.f(true);
                    fVar.h();
                    break;
                } else {
                    if (this.f21968b == null) {
                    }
                    boolean z6 = true;
                    o2.a.f(z6);
                    fVar.h();
                    i7++;
                }
            }
            if (this.f21968b == null) {
                throw new a1("None of the available extractors (" + o2.m0.M(b7) + ") could read the stream.", (Uri) o2.a.e(uri));
            }
        }
        this.f21968b.d(nVar);
    }

    @Override // t1.f0
    public int d(w0.a0 a0Var) {
        return ((w0.l) o2.a.e(this.f21968b)).e((w0.m) o2.a.e(this.f21969c), a0Var);
    }

    @Override // t1.f0
    public long e() {
        w0.m mVar = this.f21969c;
        if (mVar != null) {
            return mVar.p();
        }
        return -1L;
    }

    @Override // t1.f0
    public void f() {
        w0.l lVar = this.f21968b;
        if (lVar instanceof d1.f) {
            ((d1.f) lVar).k();
        }
    }
}
