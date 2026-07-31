package h4;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f implements ComponentCallbacks, View.OnCreateContextMenuListener, u, x0, androidx.lifecycle.k, x4.f {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f3177m = null;

    /* renamed from: d, reason: collision with root package name */
    public final int f3178d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f3179e = UUID.randomUUID().toString();

    /* renamed from: f, reason: collision with root package name */
    public final j f3180f = new j();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3181g = true;

    /* renamed from: h, reason: collision with root package name */
    public final p f3182h = p.f851h;
    public w i;

    /* renamed from: j, reason: collision with root package name */
    public x4.e f3183j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3184k;

    /* renamed from: l, reason: collision with root package name */
    public final b1.b f3185l;

    public f() {
        new z();
        new AtomicInteger();
        this.f3184k = new ArrayList();
        this.f3185l = new b1.b(12, this);
        this.i = new w(this, true);
        this.f3183j = new x4.e(new z4.a(this, new m0(18, this)), 1);
        ArrayList arrayList = this.f3184k;
        b1.b bVar = this.f3185l;
        if (arrayList.contains(bVar)) {
            return;
        }
        if (this.f3178d < 0) {
            arrayList.add(bVar);
            return;
        }
        f fVar = (f) bVar.f1050e;
        fVar.f3183j.c();
        l0.c(fVar);
    }

    @Override // x4.f
    public final x4.e b() {
        return (x4.e) this.f3183j.f8656b;
    }

    public final j c() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // androidx.lifecycle.k
    public final t0 d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.k
    public final l4.b e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.x0
    public final w0 f() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.i;
    }

    public final View h() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f3179e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
