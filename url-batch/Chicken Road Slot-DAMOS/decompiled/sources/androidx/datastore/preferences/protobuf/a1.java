package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.r2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f508d;

    /* renamed from: e, reason: collision with root package name */
    public int f509e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f510i;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f511r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f512s;

    public /* synthetic */ a1(q2 q2Var) {
        this.f508d = 1;
        Objects.requireNonNull(q2Var);
        this.f512s = q2Var;
        this.f509e = -1;
    }

    public Iterator a() {
        if (this.f511r == null) {
            this.f511r = ((y0) this.f512s).f654e.entrySet().iterator();
        }
        return this.f511r;
    }

    public Iterator b() {
        if (this.f511r == null) {
            this.f511r = ((q2) this.f512s).f2695i.entrySet().iterator();
        }
        return this.f511r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f508d) {
            case 0:
                int i3 = this.f509e + 1;
                y0 y0Var = (y0) this.f512s;
                if (i3 >= y0Var.f653d.size()) {
                    return !y0Var.f654e.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i10 = this.f509e + 1;
                q2 q2Var = (q2) this.f512s;
                if (i10 >= q2Var.f2694e) {
                    return !q2Var.f2695i.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f508d) {
            case 0:
                this.f510i = true;
                int i3 = this.f509e + 1;
                this.f509e = i3;
                y0 y0Var = (y0) this.f512s;
                return i3 < y0Var.f653d.size() ? (Map.Entry) y0Var.f653d.get(this.f509e) : (Map.Entry) a().next();
            default:
                this.f510i = true;
                int i10 = this.f509e + 1;
                this.f509e = i10;
                q2 q2Var = (q2) this.f512s;
                return i10 < q2Var.f2694e ? (r2) q2Var.f2693d[i10] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i3 = this.f508d;
        AbstractMap abstractMap = this.f512s;
        switch (i3) {
            case 0:
                y0 y0Var = (y0) abstractMap;
                if (!this.f510i) {
                    kotlin.collections.i0.l("remove() was called before next()");
                    break;
                } else {
                    this.f510i = false;
                    int i10 = y0.f652t;
                    y0Var.b();
                    if (this.f509e >= y0Var.f653d.size()) {
                        a().remove();
                        break;
                    } else {
                        int i11 = this.f509e;
                        this.f509e = i11 - 1;
                        y0Var.h(i11);
                        break;
                    }
                }
            default:
                if (!this.f510i) {
                    kotlin.collections.i0.l("remove() was called before next()");
                    break;
                } else {
                    this.f510i = false;
                    q2 q2Var = (q2) abstractMap;
                    q2Var.f();
                    int i12 = this.f509e;
                    if (i12 >= q2Var.f2694e) {
                        b().remove();
                        break;
                    } else {
                        this.f509e = i12 - 1;
                        q2Var.d(i12);
                        break;
                    }
                }
        }
    }

    public a1(y0 y0Var) {
        this.f508d = 0;
        this.f512s = y0Var;
        this.f509e = -1;
    }
}
