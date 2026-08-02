package c;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c2.C0204b;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2611a;

    /* renamed from: b, reason: collision with root package name */
    public final C0204b f2612b = new C0204b();

    /* renamed from: c, reason: collision with root package name */
    public P.h f2613c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f2614d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f2615e;
    public boolean f;

    public t(Runnable runnable) {
        this.f2611a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f2614d = i3 >= 34 ? s.f2610a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : q.f2605a.a(new p(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    public final void a() {
        P.h hVar;
        P.h hVar2 = this.f2613c;
        if (hVar2 == null) {
            C0204b c0204b = this.f2612b;
            c0204b.getClass();
            ListIterator listIterator = c0204b.listIterator(c0204b.f2633c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hVar = 0;
                    break;
                } else {
                    hVar = listIterator.previous();
                    if (((P.h) hVar).f1236a) {
                        break;
                    }
                }
            }
            hVar2 = hVar;
        }
        this.f2613c = null;
        if (hVar2 != null) {
            boolean j3 = P.k.j(3);
            P.k kVar = hVar2.f1237b;
            if (j3) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kVar);
            }
            P.a aVar = kVar.f1241d;
            if (aVar == null) {
                kVar.f1241d = null;
                return;
            }
            aVar.f1212c = false;
            aVar.a(false);
            kVar.i();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void b() {
        P.h hVar;
        P.h hVar2 = this.f2613c;
        if (hVar2 == null) {
            C0204b c0204b = this.f2612b;
            c0204b.getClass();
            ListIterator listIterator = c0204b.listIterator(c0204b.f2633c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hVar = 0;
                    break;
                } else {
                    hVar = listIterator.previous();
                    if (((P.h) hVar).f1236a) {
                        break;
                    }
                }
            }
            hVar2 = hVar;
        }
        this.f2613c = null;
        if (hVar2 == null) {
            this.f2611a.run();
            return;
        }
        boolean j3 = P.k.j(3);
        P.k kVar = hVar2.f1237b;
        if (j3) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kVar);
        }
        kVar.i();
        throw null;
    }
}
