package N;

import D3.M;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0248o;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0247n;
import androidx.lifecycle.InterfaceC0241h;
import androidx.lifecycle.InterfaceC0253u;
import androidx.lifecycle.L;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0253u, Y, InterfaceC0241h, T.h {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f1646u = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final int f1647f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final String f1648g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public final F3.g f1649h = new F3.g(1);

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1650i = true;

    /* renamed from: j, reason: collision with root package name */
    public B0.c f1651j;

    /* renamed from: k, reason: collision with root package name */
    public final EnumC0247n f1652k;

    /* renamed from: l, reason: collision with root package name */
    public C0255w f1653l;

    /* renamed from: m, reason: collision with root package name */
    public T.g f1654m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1655n;

    /* renamed from: o, reason: collision with root package name */
    public final M f1656o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1657p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1658q;

    /* renamed from: r, reason: collision with root package name */
    public int f1659r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1660s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1661t;

    public f() {
        new c(this, 1);
        this.f1652k = EnumC0247n.f3515j;
        new A();
        new AtomicInteger();
        this.f1655n = new ArrayList();
        this.f1656o = new M(9, this);
        this.f1653l = new C0255w(this);
        this.f1654m = new T.g(this);
        ArrayList arrayList = this.f1655n;
        M m4 = this.f1656o;
        if (!arrayList.contains(m4)) {
            if (this.f1647f >= 0) {
                f fVar = (f) m4.f401g;
                fVar.f1654m.a();
                L.d(fVar);
                fVar.f1654m.b(null);
            } else {
                arrayList.add(m4);
            }
        }
        new c(this, 0);
        new d(this);
        this.f1657p = new e(this);
        this.f1658q = true;
        this.f1659r = -1;
        new J1.c(10, this);
    }

    public final F3.g a() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View b() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.InterfaceC0241h
    public final O.b getDefaultViewModelCreationExtras() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.InterfaceC0253u
    public final AbstractC0248o getLifecycle() {
        return this.f1653l;
    }

    @Override // T.h
    public final T.f getSavedStateRegistry() {
        return this.f1654m.f2217b;
    }

    @Override // androidx.lifecycle.Y
    public final X getViewModelStore() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f1660s) {
            return;
        }
        if (F3.g.o(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1661t) {
            return;
        }
        this.f1661t = true;
        this.f1660s = true;
        if (this.f1659r >= 0) {
            F3.g a7 = a();
            int i7 = this.f1659r;
            if (i7 < 0) {
                throw new IllegalArgumentException(W4.o.c("Bad id: ", i7));
            }
            synchronized (((ArrayList) a7.f734h)) {
            }
            this.f1659r = -1;
            return;
        }
        a aVar = new a(a());
        l lVar = new l();
        lVar.f1667a = 3;
        lVar.f1668b = this;
        aVar.f1635a.add(lVar);
        lVar.f1669c = 0;
        lVar.f1670d = 0;
        lVar.f1671e = 0;
        lVar.f1672f = 0;
        aVar.a(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1648g);
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
