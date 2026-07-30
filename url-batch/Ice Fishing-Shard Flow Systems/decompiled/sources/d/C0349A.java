package d;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0222m;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.H;
import androidx.fragment.app.Q;
import androidx.fragment.app.Z;
import androidx.fragment.app.c0;
import androidx.fragment.app.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C0633l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4559a;

    /* renamed from: b, reason: collision with root package name */
    public final C0633l f4560b = new C0633l();

    /* renamed from: c, reason: collision with root package name */
    public H f4561c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4562d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4563e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4564f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4565g;

    public C0349A(Runnable runnable) {
        OnBackInvokedCallback a7;
        this.f4559a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (i2 >= 34) {
                a7 = w.f4608a.a(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1));
            } else {
                a7 = u.f4603a.a(new s(this, 2));
            }
            this.f4562d = a7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        H h7;
        H h8 = this.f4561c;
        if (h8 == null) {
            C0633l c0633l = this.f4560b;
            ListIterator listIterator = c0633l.listIterator(c0633l.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    h7 = 0;
                    break;
                } else {
                    h7 = listIterator.previous();
                    if (((H) h7).f3584a) {
                        break;
                    }
                }
            }
            h8 = h7;
        }
        this.f4561c = null;
        if (h8 != null) {
            h8.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void b() {
        H h7;
        H h8 = this.f4561c;
        if (h8 == null) {
            C0633l c0633l = this.f4560b;
            ListIterator listIterator = c0633l.listIterator(c0633l.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                    h7 = listIterator.previous();
                    if (((H) h7).f3584a) {
                        break;
                    }
                } else {
                    h7 = 0;
                    break;
                }
            }
            h8 = h7;
        }
        this.f4561c = null;
        if (h8 == null) {
            this.f4559a.run();
            return;
        }
        Q q4 = h8.f3587d;
        if (Q.J(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + q4);
        }
        H h9 = q4.f3621i;
        ArrayList arrayList = q4.f3624m;
        q4.A(true);
        if (q4.f3620h == null) {
            if (h9.f3584a) {
                if (Q.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                q4.Q();
                return;
            } else {
                if (Q.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                q4.f3619g.b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Q.E(q4.f3620h));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = q4.f3620h.f3682a;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            ComponentCallbacksC0228t componentCallbacksC0228t = ((Z) obj2).f3674b;
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.f3811u = false;
            }
        }
        Iterator it2 = q4.f(new ArrayList(Collections.singletonList(q4.f3620h)), 0, 1).iterator();
        while (it2.hasNext()) {
            C0222m c0222m = (C0222m) it2.next();
            ArrayList operations = c0222m.f3743c;
            if (Q.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            c0222m.f(operations);
            c0222m.getClass();
            Intrinsics.checkNotNullParameter(operations, "operations");
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = operations.iterator();
            while (it3.hasNext()) {
                ((d0) it3.next()).getClass();
                kotlin.collections.w.h(null, arrayList3);
            }
            List z7 = CollectionsKt.z(CollectionsKt.C(arrayList3));
            int size3 = z7.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ((c0) z7.get(i7)).a(c0222m.f3741a);
            }
            int size4 = operations.size();
            for (int i8 = 0; i8 < size4; i8++) {
                c0222m.a((d0) operations.get(i8));
            }
            List z8 = CollectionsKt.z(operations);
            if (z8.size() > 0) {
                ((d0) z8.get(0)).getClass();
                throw null;
            }
        }
        q4.f3620h = null;
        q4.e0();
        if (Q.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + h9.f3584a + " for  FragmentManager " + q4);
        }
    }

    public final void c(boolean z7) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4563e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f4562d) == null) {
            return;
        }
        u uVar = u.f4603a;
        if (z7 && !this.f4564f) {
            uVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4564f = true;
        } else {
            if (z7 || !this.f4564f) {
                return;
            }
            uVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4564f = false;
        }
    }

    public final void d() {
        boolean z7 = this.f4565g;
        boolean z8 = false;
        C0633l c0633l = this.f4560b;
        if (c0633l == null || !c0633l.isEmpty()) {
            Iterator<E> it = c0633l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((H) it.next()).f3584a) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f4565g = z8;
        if (z8 == z7 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z8);
    }
}
