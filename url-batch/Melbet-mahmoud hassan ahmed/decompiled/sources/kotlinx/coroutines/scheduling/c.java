package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import m6.f1;
import m6.r0;

/* loaded from: classes.dex */
public class c extends f1 {

    /* renamed from: h, reason: collision with root package name */
    private final int f18413h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18414i;

    /* renamed from: j, reason: collision with root package name */
    private final long f18415j;

    /* renamed from: k, reason: collision with root package name */
    private final String f18416k;

    /* renamed from: l, reason: collision with root package name */
    private a f18417l;

    public c(int i7, int i8, long j7, String str) {
        this.f18413h = i7;
        this.f18414i = i8;
        this.f18415j = j7;
        this.f18416k = str;
        this.f18417l = R();
    }

    public c(int i7, int i8, String str) {
        this(i7, i8, l.f18434e, str);
    }

    public /* synthetic */ c(int i7, int i8, String str, int i9, kotlin.jvm.internal.e eVar) {
        this((i9 & 1) != 0 ? l.f18432c : i7, (i9 & 2) != 0 ? l.f18433d : i8, (i9 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a R() {
        return new a(this.f18413h, this.f18414i, this.f18415j, this.f18416k);
    }

    @Override // m6.f0
    public void P(y5.g gVar, Runnable runnable) {
        try {
            a.u(this.f18417l, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            r0.f19326l.P(gVar, runnable);
        }
    }

    public final void S(Runnable runnable, j jVar, boolean z6) {
        try {
            this.f18417l.q(runnable, jVar, z6);
        } catch (RejectedExecutionException unused) {
            r0.f19326l.g0(this.f18417l.h(runnable, jVar));
        }
    }
}
