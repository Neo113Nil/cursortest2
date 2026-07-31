package m2;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import r0.i;
import t1.x0;

/* loaded from: classes.dex */
public final class y implements r0.i {

    /* renamed from: h, reason: collision with root package name */
    public static final i.a<y> f19089h = new i.a() { // from class: m2.x
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            y d7;
            d7 = y.d(bundle);
            return d7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final x0 f19090f;

    /* renamed from: g, reason: collision with root package name */
    public final m4.q<Integer> f19091g;

    public y(x0 x0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= x0Var.f22259f)) {
            throw new IndexOutOfBoundsException();
        }
        this.f19090f = x0Var;
        this.f19091g = m4.q.t(list);
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y d(Bundle bundle) {
        return new y(x0.f22258k.a((Bundle) o2.a.e(bundle.getBundle(c(0)))), o4.d.c((int[]) o2.a.e(bundle.getIntArray(c(1)))));
    }

    public int b() {
        return this.f19090f.f22261h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f19090f.equals(yVar.f19090f) && this.f19091g.equals(yVar.f19091g);
    }

    public int hashCode() {
        return this.f19090f.hashCode() + (this.f19091g.hashCode() * 31);
    }
}
