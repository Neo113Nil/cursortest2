package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ListIterator;
import l5.C0504h;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final C0504h f3216b = new C0504h();

    /* renamed from: c, reason: collision with root package name */
    public N.h f3217c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3218d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3220f;

    public s(Runnable runnable) {
        OnBackInvokedCallback a7;
        this.f3215a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                a7 = r.f3214a.a(new n(this, 0), new n(this, 1), new o(this, 0), new o(this, 1));
            } else {
                a7 = p.f3209a.a(new o(this, 2));
            }
            this.f3218d = a7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void a() {
        N.h hVar;
        N.h hVar2 = this.f3217c;
        if (hVar2 == null) {
            C0504h c0504h = this.f3216b;
            ListIterator listIterator = c0504h.listIterator(c0504h.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hVar = 0;
                    break;
                } else {
                    hVar = listIterator.previous();
                    if (((N.h) hVar).f1664a) {
                        break;
                    }
                }
            }
            hVar2 = hVar;
        }
        this.f3217c = null;
        if (hVar2 == null) {
            this.f3215a.run();
            return;
        }
        F3.g gVar = hVar2.f1665b;
        if (F3.g.o(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + gVar);
        }
        gVar.n();
        throw null;
    }
}
