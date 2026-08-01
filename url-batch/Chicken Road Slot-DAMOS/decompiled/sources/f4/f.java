package f4;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c6.s;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f implements ComponentCallbacks, View.OnCreateContextMenuListener, u, a1, androidx.lifecycle.k, f5.e {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f4076y = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final int f4077d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f4078e = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public final j f4079i = new j();

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4080r = true;

    /* renamed from: s, reason: collision with root package name */
    public a1.n f4081s;

    /* renamed from: t, reason: collision with root package name */
    public final p f4082t;

    /* renamed from: u, reason: collision with root package name */
    public w f4083u;

    /* renamed from: v, reason: collision with root package name */
    public s f4084v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f4085w;

    /* renamed from: x, reason: collision with root package name */
    public final d9.c f4086x;

    public f() {
        new b7.k(6, this);
        this.f4082t = p.f711s;
        new b0();
        new AtomicInteger();
        this.f4085w = new ArrayList();
        this.f4086x = new d9.c(21, this);
        this.f4083u = new w(this, true);
        this.f4084v = new s(new h5.b(this, new a1.b(10, this)));
        ArrayList arrayList = this.f4085w;
        d9.c cVar = this.f4086x;
        if (arrayList.contains(cVar)) {
            return;
        }
        if (this.f4077d < 0) {
            arrayList.add(cVar);
            return;
        }
        f fVar = (f) cVar.f3701e;
        fVar.f4084v.f();
        o0.c(fVar);
        fVar.f4084v.g(null);
    }

    @Override // f5.e
    public final c6.l b() {
        return (c6.l) this.f4084v.f1869e;
    }

    public final int c() {
        p pVar = p.f707d;
        return this.f4082t.ordinal();
    }

    @Override // androidx.lifecycle.k
    public final w0 d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.k
    public final k4.b e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.a1
    public final z0 f() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.f4083u;
    }

    public final j h() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View i() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f4078e);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
