package n3;

import a0.s0;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.q0;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l.u1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, v, c1, androidx.lifecycle.j, x3.f {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f6517u = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final int f6518f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final String f6519g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public final k f6520h = new k(0);

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6521i = true;

    /* renamed from: j, reason: collision with root package name */
    public b1.b f6522j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.o f6523k;

    /* renamed from: l, reason: collision with root package name */
    public x f6524l;

    /* renamed from: m, reason: collision with root package name */
    public s0 f6525m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6526n;

    /* renamed from: o, reason: collision with root package name */
    public final f f6527o;

    /* renamed from: p, reason: collision with root package name */
    public final e f6528p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6529q;

    /* renamed from: r, reason: collision with root package name */
    public int f6530r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6531s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6532t;

    public g() {
        new c(this, 1);
        this.f6523k = androidx.lifecycle.o.f1011j;
        new a0();
        new AtomicInteger();
        this.f6526n = new ArrayList();
        this.f6527o = new f(this);
        this.f6524l = new x(this);
        this.f6525m = new s0(this);
        ArrayList arrayList = this.f6526n;
        f fVar = this.f6527o;
        if (!arrayList.contains(fVar)) {
            if (this.f6518f >= 0) {
                g gVar = fVar.f6516a;
                gVar.f6525m.f();
                q0.e(gVar);
                gVar.f6525m.g(null);
            } else {
                arrayList.add(fVar);
            }
        }
        new c(this, 0);
        new d(this);
        this.f6528p = new e(this);
        this.f6529q = true;
        this.f6530r = -1;
        new f(this);
    }

    @Override // x3.f
    public final x3.e b() {
        return (x3.e) this.f6525m.f138d;
    }

    @Override // androidx.lifecycle.j
    public final y0 c() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.j
    public final u1 d() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.c1
    public final b1 e() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.v
    public final x f() {
        return this.f6524l;
    }

    public final k g() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View h() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f6531s) {
            return;
        }
        if (k.m(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f6532t) {
            return;
        }
        this.f6532t = true;
        this.f6531s = true;
        if (this.f6530r >= 0) {
            k g9 = g();
            int i7 = this.f6530r;
            if (i7 < 0) {
                throw new IllegalArgumentException(a0.m.i("Bad id: ", i7));
            }
            synchronized (g9.f6537c) {
            }
            this.f6530r = -1;
            return;
        }
        a aVar = new a(g());
        m mVar = new m();
        mVar.f6544a = 3;
        mVar.f6545b = this;
        mVar.f6546c = false;
        aVar.f6504a.add(mVar);
        mVar.f6547d = 0;
        mVar.f6548e = 0;
        mVar.f6549f = 0;
        mVar.f6550g = 0;
        aVar.a(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6519g);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
