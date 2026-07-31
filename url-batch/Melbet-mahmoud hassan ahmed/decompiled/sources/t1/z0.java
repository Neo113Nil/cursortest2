package t1;

import android.os.Bundle;
import java.util.ArrayList;
import r0.i;

/* loaded from: classes.dex */
public final class z0 implements r0.i {

    /* renamed from: i, reason: collision with root package name */
    public static final z0 f22273i = new z0(new x0[0]);

    /* renamed from: j, reason: collision with root package name */
    public static final i.a<z0> f22274j = new i.a() { // from class: t1.y0
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            z0 e7;
            e7 = z0.e(bundle);
            return e7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f22275f;

    /* renamed from: g, reason: collision with root package name */
    private final m4.q<x0> f22276g;

    /* renamed from: h, reason: collision with root package name */
    private int f22277h;

    public z0(x0... x0VarArr) {
        this.f22276g = m4.q.u(x0VarArr);
        this.f22275f = x0VarArr.length;
        f();
    }

    private static String d(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return parcelableArrayList == null ? new z0(new x0[0]) : new z0((x0[]) o2.c.b(x0.f22258k, parcelableArrayList).toArray(new x0[0]));
    }

    private void f() {
        int i7 = 0;
        while (i7 < this.f22276g.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.f22276g.size(); i9++) {
                if (this.f22276g.get(i7).equals(this.f22276g.get(i9))) {
                    o2.r.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public x0 b(int i7) {
        return this.f22276g.get(i7);
    }

    public int c(x0 x0Var) {
        int indexOf = this.f22276g.indexOf(x0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f22275f == z0Var.f22275f && this.f22276g.equals(z0Var.f22276g);
    }

    public int hashCode() {
        if (this.f22277h == 0) {
            this.f22277h = this.f22276g.hashCode();
        }
        return this.f22277h;
    }
}
