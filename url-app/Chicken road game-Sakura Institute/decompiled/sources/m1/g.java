package m1;

import A.AbstractC0017m;
import A.V;
import B1.C0097d;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.InterfaceC0470j;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.M;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import v1.C1248e;
import v1.InterfaceC1249f;

/* loaded from: classes.dex */
public class g implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0481v, Z, InterfaceC0470j, InterfaceC1249f {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f8261v = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final int f8262d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f8263e = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public final k f8264i = new k(0);

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8265j = true;

    /* renamed from: k, reason: collision with root package name */
    public C0097d f8266k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0475o f8267l;

    /* renamed from: m, reason: collision with root package name */
    public C0483x f8268m;

    /* renamed from: n, reason: collision with root package name */
    public V f8269n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f8270o;

    /* renamed from: p, reason: collision with root package name */
    public final f f8271p;

    /* renamed from: q, reason: collision with root package name */
    public final e f8272q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8273r;

    /* renamed from: s, reason: collision with root package name */
    public int f8274s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8275t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8276u;

    public g() {
        new RunnableC0858c(this, 1);
        this.f8267l = EnumC0475o.f5484k;
        new A();
        new AtomicInteger();
        this.f8270o = new ArrayList();
        this.f8271p = new f(this);
        this.f8268m = new C0483x(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f8269n = new V(this);
        ArrayList arrayList = this.f8270o;
        f fVar = this.f8271p;
        if (!arrayList.contains(fVar)) {
            if (this.f8262d >= 0) {
                g gVar = fVar.f8260a;
                gVar.f8269n.e();
                M.e(gVar);
                gVar.f8269n.f(null);
            } else {
                arrayList.add(fVar);
            }
        }
        new RunnableC0858c(this, 0);
        new d(this);
        this.f8272q = new e(this);
        this.f8273r = true;
        this.f8274s = -1;
        new f(this);
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final t0 a() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // v1.InterfaceC1249f
    public final C1248e c() {
        return (C1248e) this.f8269n.f63d;
    }

    @Override // androidx.lifecycle.Z
    public final Y d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0481v
    public final C0483x e() {
        return this.f8268m;
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final androidx.lifecycle.V f() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final k g() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View h() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f8275t) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f8276u) {
            return;
        }
        this.f8276u = true;
        this.f8275t = true;
        if (this.f8274s >= 0) {
            k g4 = g();
            int i2 = this.f8274s;
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0017m.g(i2, "Bad id: "));
            }
            synchronized (g4.f8281c) {
            }
            this.f8274s = -1;
            return;
        }
        C0856a c0856a = new C0856a(g());
        m mVar = new m();
        mVar.f8288a = 3;
        mVar.f8289b = this;
        mVar.f8290c = false;
        c0856a.f8248a.add(mVar);
        mVar.f8291d = 0;
        mVar.f8292e = 0;
        mVar.f8293f = 0;
        mVar.f8294g = 0;
        c0856a.a(true);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f8263e);
        sb.append(")");
        return sb.toString();
    }
}
