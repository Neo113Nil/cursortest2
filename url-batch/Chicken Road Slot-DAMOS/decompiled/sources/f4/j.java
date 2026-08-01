package f4;

import android.util.Log;
import d.d0;
import e3.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4089a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final c6.e f4090b = new c6.e(5);

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4092d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f4093e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4094f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final u8.d f4095h;

    public j() {
        new ArrayList();
        this.f4092d = null;
        new d0(2, this);
        this.f4093e = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f4094f = new ArrayList();
        new u8.d(this);
        new CopyOnWriteArrayList();
        final int i3 = 0;
        new n3.a(this) { // from class: f4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f4088b;

            {
                this.f4088b = this;
            }

            @Override // n3.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f4088b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f4088b.c(false);
                            break;
                        }
                        break;
                    case 2:
                        boolean z10 = ((e3.b) obj).f3791a;
                        this.f4088b.d(false);
                        break;
                    default:
                        boolean z11 = ((u) obj).f3852a;
                        this.f4088b.g(false);
                        break;
                }
            }
        };
        final int i10 = 1;
        new n3.a(this) { // from class: f4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f4088b;

            {
                this.f4088b = this;
            }

            @Override // n3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f4088b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f4088b.c(false);
                            break;
                        }
                        break;
                    case 2:
                        boolean z10 = ((e3.b) obj).f3791a;
                        this.f4088b.d(false);
                        break;
                    default:
                        boolean z11 = ((u) obj).f3852a;
                        this.f4088b.g(false);
                        break;
                }
            }
        };
        final int i11 = 2;
        new n3.a(this) { // from class: f4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f4088b;

            {
                this.f4088b = this;
            }

            @Override // n3.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f4088b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f4088b.c(false);
                            break;
                        }
                        break;
                    case 2:
                        boolean z10 = ((e3.b) obj).f3791a;
                        this.f4088b.d(false);
                        break;
                    default:
                        boolean z11 = ((u) obj).f3852a;
                        this.f4088b.g(false);
                        break;
                }
            }
        };
        final int i12 = 3;
        new n3.a(this) { // from class: f4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f4088b;

            {
                this.f4088b = this;
            }

            @Override // n3.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f4088b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f4088b.c(false);
                            break;
                        }
                        break;
                    case 2:
                        boolean z10 = ((e3.b) obj).f3791a;
                        this.f4088b.d(false);
                        break;
                    default:
                        boolean z11 = ((u) obj).f3852a;
                        this.f4088b.g(false);
                        break;
                }
            }
        };
        this.g = -1;
        this.f4095h = new u8.d(25);
        new ArrayDeque();
        new b7.k(7, this);
    }

    public static boolean j(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean k(f fVar) {
        return fVar == null || fVar.f4080r;
    }

    public final void a(boolean z10) {
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && z10) {
                fVar.f4079i.a(true);
            }
        }
    }

    public final boolean b() {
        if (this.g < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && k(fVar) && fVar.f4079i.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z10 = true;
            }
        }
        if (this.f4091c != null) {
            for (int i3 = 0; i3 < this.f4091c.size(); i3++) {
                f fVar2 = (f) this.f4091c.get(i3);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f4091c = arrayList;
        return z10;
    }

    public final void c(boolean z10) {
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && z10) {
                fVar.f4079i.c(true);
            }
        }
    }

    public final void d(boolean z10) {
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && z10) {
                fVar.f4079i.d(true);
            }
        }
    }

    public final boolean e() {
        if (this.g < 1) {
            return false;
        }
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && fVar.f4079i.e()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.g < 1) {
            return;
        }
        for (f fVar : this.f4090b.i()) {
            if (fVar != null) {
                fVar.f4079i.f();
            }
        }
    }

    public final void g(boolean z10) {
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && z10) {
                fVar.f4079i.g(true);
            }
        }
    }

    public final boolean h() {
        boolean z10 = false;
        if (this.g < 1) {
            return false;
        }
        for (f fVar : this.f4090b.i()) {
            if (fVar != null && k(fVar) && fVar.f4079i.h()) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        sb2.append("null");
        sb2.append("}}");
        return sb2.toString();
    }
}
