package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.InterfaceC0481v;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import z2.C1433q;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5514a;

    /* renamed from: b, reason: collision with root package name */
    public final C1433q f5515b = new C1433q();

    /* renamed from: c, reason: collision with root package name */
    public v f5516c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f5517d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f5518e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5520g;

    public D(Runnable runnable) {
        this.f5514a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f5517d = i2 >= 34 ? A.f5507a.a(new w(this, 0), new w(this, 1), new x(this, 0), new x(this, 1)) : y.f5593a.a(new x(this, 2));
        }
    }

    public final void a(InterfaceC0481v owner, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        C0483x e4 = owner.e();
        if (e4.f5496d == EnumC0475o.f5480d) {
            return;
        }
        B cancellable = new B(this, e4, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f5587b.add(cancellable);
        e();
        onBackPressedCallback.f5588c = new X.e(0, this, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        v vVar;
        v vVar2 = this.f5516c;
        if (vVar2 == null) {
            C1433q c1433q = this.f5515b;
            ListIterator listIterator = c1433q.listIterator(c1433q.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).f5586a) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f5516c = null;
        if (vVar2 != null) {
            vVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        v vVar;
        v vVar2 = this.f5516c;
        if (vVar2 == null) {
            C1433q c1433q = this.f5515b;
            ListIterator listIterator = c1433q.listIterator(c1433q.e());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).f5586a) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f5516c = null;
        if (vVar2 != null) {
            vVar2.b();
        } else {
            this.f5514a.run();
        }
    }

    public final void d(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5518e;
        OnBackInvokedCallback onBackInvokedCallback = this.f5517d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        y yVar = y.f5593a;
        if (z4 && !this.f5519f) {
            yVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f5519f = true;
        } else {
            if (z4 || !this.f5519f) {
                return;
            }
            yVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5519f = false;
        }
    }

    public final void e() {
        boolean z4 = this.f5520g;
        boolean z5 = false;
        C1433q c1433q = this.f5515b;
        if (c1433q == null || !c1433q.isEmpty()) {
            Iterator it = c1433q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((v) it.next()).f5586a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f5520g = z5;
        if (z5 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z5);
    }
}
