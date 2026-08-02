package u0;

import E.AbstractC0005f;
import W.H;
import W.J;
import a.AbstractC0124a;
import android.os.Looper;
import android.os.SystemClock;
import io.appmetrica.analytics.impl.Zo;
import java.io.IOException;
import java.util.concurrent.Executors;
import v0.ExecutorC1449a;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final g1.e f15481d = new g1.e(0, -9223372036854775807L, false);

    /* renamed from: e, reason: collision with root package name */
    public static final g1.e f15482e = new g1.e(2, -9223372036854775807L, false);

    /* renamed from: f, reason: collision with root package name */
    public static final g1.e f15483f = new g1.e(3, -9223372036854775807L, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC1449a f15484a;

    /* renamed from: b, reason: collision with root package name */
    public j f15485b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f15486c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(String str) {
        this(new ExecutorC1449a(Executors.newSingleThreadExecutor(new H(r3)), new Zo(13)));
        String n = AbstractC0005f.n("ExoPlayer:Loader:", str);
        String str2 = J.f3263a;
    }

    @Override // u0.o
    public final void a() {
        IOException iOException = this.f15486c;
        if (iOException != null) {
            throw iOException;
        }
        j jVar = this.f15485b;
        if (jVar != null) {
            int i4 = jVar.f15471a;
            IOException iOException2 = jVar.f15475e;
            if (iOException2 != null && jVar.f15476f > i4) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        j jVar = this.f15485b;
        jVar.getClass();
        jVar.a(false);
    }

    public final boolean c() {
        return this.f15486c != null;
    }

    public final boolean d() {
        return this.f15485b != null;
    }

    public final void e(l lVar) {
        j jVar = this.f15485b;
        if (jVar != null) {
            jVar.a(true);
        }
        ExecutorC1449a executorC1449a = this.f15484a;
        if (lVar != null) {
            executorC1449a.execute(new B.b(20, lVar));
        }
        executorC1449a.f15530b.accept(executorC1449a.f15529a);
    }

    public final void f(k kVar, i iVar, int i4) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f15486c = null;
        j jVar = new j(this, myLooper, kVar, iVar, i4, SystemClock.elapsedRealtime());
        AbstractC0124a.t(this.f15485b == null);
        this.f15485b = jVar;
        jVar.b();
    }

    public n(ExecutorC1449a executorC1449a) {
        this.f15484a = executorC1449a;
    }
}
