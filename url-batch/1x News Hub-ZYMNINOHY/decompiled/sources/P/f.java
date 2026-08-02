package P;

import E1.AbstractC0033i;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0160b;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import b0.C0178i;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.m, G, InterfaceC0160b, V.f {
    public static final Object o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f1221a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final String f1222b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final k f1223c = new k();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1224d = true;

    /* renamed from: e, reason: collision with root package name */
    public B0.p f1225e;
    public final androidx.lifecycle.h f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.o f1226g;

    /* renamed from: h, reason: collision with root package name */
    public V.e f1227h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1228i;

    /* renamed from: j, reason: collision with root package name */
    public final C0178i f1229j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1230k;

    /* renamed from: l, reason: collision with root package name */
    public int f1231l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1232m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1233n;

    public f() {
        new c(this, 1);
        this.f = androidx.lifecycle.h.f2383e;
        new q();
        new AtomicInteger();
        this.f1228i = new ArrayList();
        this.f1229j = new C0178i(21, this);
        this.f1226g = new androidx.lifecycle.o(this);
        this.f1227h = new V.e(this);
        ArrayList arrayList = this.f1228i;
        C0178i c0178i = this.f1229j;
        if (!arrayList.contains(c0178i)) {
            if (this.f1221a >= 0) {
                f fVar = (f) c0178i.f2532b;
                fVar.f1227h.b();
                z.a(fVar);
                fVar.f1227h.c(null);
            } else {
                arrayList.add(c0178i);
            }
        }
        new c(this, 0);
        new d(this);
        this.f1230k = new e(this);
        this.f1231l = -1;
        new K0.j(15, this);
    }

    @Override // V.f
    public final O1.k b() {
        return (O1.k) this.f1227h.f1593c;
    }

    @Override // androidx.lifecycle.InterfaceC0160b
    public final Q.b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.G
    public final F d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.o e() {
        return this.f1226g;
    }

    public final k f() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View g() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f1232m) {
            return;
        }
        if (k.j(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1233n) {
            return;
        }
        this.f1233n = true;
        this.f1232m = true;
        if (this.f1231l >= 0) {
            k f = f();
            int i3 = this.f1231l;
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC0033i.h(i3, "Bad id: "));
            }
            synchronized (f.f1238a) {
            }
            this.f1231l = -1;
            return;
        }
        a aVar = new a(f());
        m mVar = new m();
        mVar.f1245a = 3;
        mVar.f1246b = this;
        aVar.f1210a.add(mVar);
        mVar.f1247c = 0;
        mVar.f1248d = 0;
        mVar.f1249e = 0;
        mVar.f = 0;
        aVar.a(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1222b);
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
