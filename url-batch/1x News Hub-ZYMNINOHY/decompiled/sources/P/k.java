package P;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1238a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f1239b = new V0.e(22);

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1240c;

    /* renamed from: d, reason: collision with root package name */
    public a f1241d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f1242e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1243g;

    /* renamed from: h, reason: collision with root package name */
    public final K0.j f1244h;

    public k() {
        new ArrayList();
        this.f1241d = null;
        new h(this);
        this.f1242e = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f = new ArrayList();
        new K0.j(this);
        new CopyOnWriteArrayList();
        final int i3 = 0;
        new D.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1235b;

            {
                this.f1235b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        k kVar = this.f1235b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1235b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1235b;
                        kVar3.getClass();
                        boolean z = ((t.b) obj).f10333a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1235b;
                        kVar4.getClass();
                        boolean z2 = ((t.h) obj).f10355a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i4 = 1;
        new D.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1235b;

            {
                this.f1235b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k kVar = this.f1235b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1235b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1235b;
                        kVar3.getClass();
                        boolean z = ((t.b) obj).f10333a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1235b;
                        kVar4.getClass();
                        boolean z2 = ((t.h) obj).f10355a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i5 = 2;
        new D.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1235b;

            {
                this.f1235b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k kVar = this.f1235b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1235b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1235b;
                        kVar3.getClass();
                        boolean z = ((t.b) obj).f10333a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1235b;
                        kVar4.getClass();
                        boolean z2 = ((t.h) obj).f10355a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        final int i6 = 3;
        new D.a(this) { // from class: P.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1235b;

            {
                this.f1235b = this;
            }

            @Override // D.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k kVar = this.f1235b;
                        kVar.getClass();
                        kVar.a(false);
                        break;
                    case 1:
                        k kVar2 = this.f1235b;
                        kVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            kVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        k kVar3 = this.f1235b;
                        kVar3.getClass();
                        boolean z = ((t.b) obj).f10333a;
                        kVar3.d(false);
                        break;
                    default:
                        k kVar4 = this.f1235b;
                        kVar4.getClass();
                        boolean z2 = ((t.h) obj).f10355a;
                        kVar4.g(false);
                        break;
                }
            }
        };
        this.f1243g = -1;
        this.f1244h = new K0.j(17);
        new ArrayDeque();
        new B.b(6, this);
    }

    public static boolean j(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean k(f fVar) {
        return fVar == null || fVar.f1224d;
    }

    public final void a(boolean z) {
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && z) {
                fVar.f1223c.a(true);
            }
        }
    }

    public final boolean b() {
        if (this.f1243g < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && k(fVar) && fVar.f1223c.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z = true;
            }
        }
        if (this.f1240c != null) {
            for (int i3 = 0; i3 < this.f1240c.size(); i3++) {
                f fVar2 = (f) this.f1240c.get(i3);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f1240c = arrayList;
        return z;
    }

    public final void c(boolean z) {
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && z) {
                fVar.f1223c.c(true);
            }
        }
    }

    public final void d(boolean z) {
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && z) {
                fVar.f1223c.d(true);
            }
        }
    }

    public final boolean e() {
        if (this.f1243g >= 1) {
            for (f fVar : this.f1239b.B()) {
                if (fVar != null && fVar.f1223c.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        if (this.f1243g < 1) {
            return;
        }
        for (f fVar : this.f1239b.B()) {
            if (fVar != null) {
                fVar.f1223c.f();
            }
        }
    }

    public final void g(boolean z) {
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && z) {
                fVar.f1223c.g(true);
            }
        }
    }

    public final boolean h() {
        boolean z = false;
        if (this.f1243g < 1) {
            return false;
        }
        for (f fVar : this.f1239b.B()) {
            if (fVar != null && k(fVar) && fVar.f1223c.h()) {
                z = true;
            }
        }
        return z;
    }

    public final void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append("null");
        sb.append("}}");
        return sb.toString();
    }
}
