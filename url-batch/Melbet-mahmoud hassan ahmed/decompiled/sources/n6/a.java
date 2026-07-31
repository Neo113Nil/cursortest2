package n6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import m6.s1;
import m6.w0;
import v5.q;
import y5.g;

/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f19637g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19638h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f19639i;

    /* renamed from: j, reason: collision with root package name */
    private final a f19640j;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ a(Handler handler, String str, int i7, e eVar) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    private a(Handler handler, String str, boolean z6) {
        super(null);
        this.f19637g = handler;
        this.f19638h = str;
        this.f19639i = z6;
        this._immediate = z6 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            q qVar = q.f22838a;
        }
        this.f19640j = aVar;
    }

    private final void T(g gVar, Runnable runnable) {
        s1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        w0.b().P(gVar, runnable);
    }

    @Override // m6.f0
    public void P(g gVar, Runnable runnable) {
        if (this.f19637g.post(runnable)) {
            return;
        }
        T(gVar, runnable);
    }

    @Override // m6.f0
    public boolean Q(g gVar) {
        return (this.f19639i && i.a(Looper.myLooper(), this.f19637g.getLooper())) ? false : true;
    }

    @Override // m6.y1
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public a R() {
        return this.f19640j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f19637g == this.f19637g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f19637g);
    }

    @Override // m6.y1, m6.f0
    public String toString() {
        String S = S();
        if (S != null) {
            return S;
        }
        String str = this.f19638h;
        if (str == null) {
            str = this.f19637g.toString();
        }
        return this.f19639i ? i.i(str, ".immediate") : str;
    }
}
