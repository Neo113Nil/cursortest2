package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3741a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3742b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3743c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3744d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3745e;

    public C0222m(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f3741a = container;
        this.f3742b = new ArrayList();
        this.f3743c = new ArrayList();
    }

    public static final C0222m e(ViewGroup container, Q fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        c2.e factory = fragmentManager.H();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0222m) {
            return (C0222m) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        C0222m c0222m = new C0222m(container);
        Intrinsics.checkNotNullExpressionValue(c0222m, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, c0222m);
        return c0222m;
    }

    public final void a(d0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.f3720b) {
            throw null;
        }
    }

    public final void b(ArrayList operations, boolean z7) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        if (it.hasNext()) {
            ((d0) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = operations.listIterator(operations.size());
        if (listIterator.hasPrevious()) {
            ((d0) listIterator.previous()).getClass();
            throw null;
        }
        if (Q.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((d0) CollectionsKt.t(operations)).getClass();
        if (operations.size() > 0) {
            ((d0) operations.get(0)).getClass();
            throw null;
        }
        if (operations.size() > 0) {
            d0 operation = (d0) operations.get(0);
            arrayList.add(new C0216g(operation, z7));
            Intrinsics.checkNotNullParameter(operation, "operation");
            new C0221l(operation);
            operation.getClass();
            if (!z7) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            if (!((C0221l) obj).p()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            ((C0221l) obj2).getClass();
        }
        int size3 = arrayList4.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = arrayList4.get(i7);
            i7++;
            ((C0221l) obj3).getClass();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (arrayList.size() > 0) {
            ((C0216g) arrayList.get(0)).getClass();
            throw null;
        }
        arrayList6.isEmpty();
        int size4 = arrayList.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList.get(i8);
            i8++;
            C0216g c0216g = (C0216g) obj4;
            Context context = this.f3741a.getContext();
            c0216g.getClass();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            P0.s I7 = c0216g.I(context);
            if (I7 != null) {
                if (((AnimatorSet) I7.f2252e) != null) {
                    throw null;
                }
                arrayList5.add(c0216g);
            }
        }
        if (arrayList5.size() <= 0) {
            return;
        }
        ((C0216g) arrayList5.get(0)).getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010f A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x0017, B:14:0x0020, B:16:0x0031, B:18:0x003f, B:20:0x005e, B:23:0x0134, B:26:0x0071, B:28:0x0083, B:30:0x008f, B:31:0x00a5, B:32:0x00a8, B:33:0x00a9, B:37:0x00ba, B:39:0x00ca, B:40:0x00d1, B:42:0x00e4, B:44:0x00e8, B:46:0x00f4, B:48:0x0103, B:51:0x010b, B:53:0x010f, B:55:0x0119, B:57:0x0125, B:59:0x012d, B:61:0x0138, B:62:0x0141), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x0017, B:14:0x0020, B:16:0x0031, B:18:0x003f, B:20:0x005e, B:23:0x0134, B:26:0x0071, B:28:0x0083, B:30:0x008f, B:31:0x00a5, B:32:0x00a8, B:33:0x00a9, B:37:0x00ba, B:39:0x00ca, B:40:0x00d1, B:42:0x00e4, B:44:0x00e8, B:46:0x00f4, B:48:0x0103, B:51:0x010b, B:53:0x010f, B:55:0x0119, B:57:0x0125, B:59:0x012d, B:61:0x0138, B:62:0x0141), top: B:11:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        if (this.f3745e) {
            return;
        }
        int i2 = 0;
        if (!this.f3741a.isAttachedToWindow()) {
            d();
            this.f3744d = false;
            return;
        }
        synchronized (this.f3742b) {
            try {
                if (this.f3742b.isEmpty()) {
                    ArrayList A7 = CollectionsKt.A(this.f3743c);
                    this.f3743c.clear();
                    int size = A7.size();
                    while (i2 < size) {
                        Object obj = A7.get(i2);
                        i2++;
                        d0 d0Var = (d0) obj;
                        if (Q.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + d0Var + " with no incoming pendingOperations");
                        }
                        ViewGroup container = this.f3741a;
                        d0Var.getClass();
                        Intrinsics.checkNotNullParameter(container, "container");
                        d0Var.a(container);
                        this.f3743c.add(d0Var);
                    }
                } else {
                    ArrayList A8 = CollectionsKt.A(this.f3743c);
                    this.f3743c.clear();
                    if (A8.size() > 0) {
                        d0 d0Var2 = (d0) A8.get(0);
                        if (Q.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + d0Var2);
                        }
                        d0Var2.getClass();
                        throw null;
                    }
                    g();
                    ArrayList A9 = CollectionsKt.A(this.f3742b);
                    if (A9.isEmpty()) {
                        return;
                    }
                    this.f3742b.clear();
                    this.f3743c.addAll(A9);
                    if (Q.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(A9, this.f3744d);
                    kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
                    boolean z7 = true;
                    b7.f6150d = true;
                    if (A9.size() > 0) {
                        ((d0) A9.get(0)).getClass();
                        throw null;
                    }
                    if (b7.f6150d) {
                        ArrayList arrayList = new ArrayList();
                        int size2 = A9.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = A9.get(i5);
                            i5++;
                            ((d0) obj2).getClass();
                            kotlin.collections.w.h(null, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            b7.f6150d = z7;
                            if (z7) {
                                f(A9);
                                int size3 = A9.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    a((d0) A9.get(i7));
                                }
                            }
                            this.f3744d = false;
                            if (Q.J(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        }
                    }
                    z7 = false;
                    b7.f6150d = z7;
                    if (z7) {
                    }
                    this.f3744d = false;
                    if (Q.J(2)) {
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (Q.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f3741a.isAttachedToWindow();
        synchronized (this.f3742b) {
            try {
                g();
                f(this.f3742b);
                ArrayList A7 = CollectionsKt.A(this.f3743c);
                int size = A7.size();
                int i2 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = A7.get(i5);
                    i5++;
                    d0 d0Var = (d0) obj;
                    if (Q.J(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f3741a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + d0Var);
                    }
                    d0Var.a(this.f3741a);
                }
                ArrayList A8 = CollectionsKt.A(this.f3742b);
                int size2 = A8.size();
                while (i2 < size2) {
                    Object obj2 = A8.get(i2);
                    i2++;
                    d0 d0Var2 = (d0) obj2;
                    if (Q.J(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f3741a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + d0Var2);
                    }
                    d0Var2.a(this.f3741a);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d0 d0Var = (d0) list.get(i2);
            d0Var.getClass();
            if (!d0Var.f3719a) {
                d0Var.f3719a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).getClass();
            kotlin.collections.w.h(null, arrayList);
        }
        List z7 = CollectionsKt.z(CollectionsKt.C(arrayList));
        int size2 = z7.size();
        for (int i5 = 0; i5 < size2; i5++) {
            c0 c0Var = (c0) z7.get(i5);
            c0Var.getClass();
            ViewGroup container = this.f3741a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!c0Var.f3717a) {
                c0Var.c(container);
            }
            c0Var.f3717a = true;
        }
    }

    public final void g() {
        ArrayList arrayList = this.f3742b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((d0) obj).getClass();
        }
    }
}
