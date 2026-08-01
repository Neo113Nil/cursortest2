package n4;

import android.os.Bundle;
import c2.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import s.s0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln4/w;", "Ln4/h0;", "Ln4/u;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@g0("navigation")
/* loaded from: classes.dex */
public class w extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final i0 f7128c;

    public w(i0 i0Var) {
        i0Var.getClass();
        this.f7128c = i0Var;
    }

    @Override // n4.h0
    public final void d(List list, a0 a0Var) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            s sVar = hVar.f7063e;
            sVar.getClass();
            u uVar = (u) sVar;
            w1 w1Var = uVar.f7115e;
            wd.b0 b0Var = new wd.b0();
            b0Var.f10141d = hVar.f7069v.a();
            e3.o oVar = uVar.f7125t;
            int i3 = oVar.f3827a;
            String str = (String) oVar.f3831e;
            if (i3 == 0 && str == null) {
                w1Var.getClass();
                String valueOf = String.valueOf(w1Var.f1694a);
                valueOf.getClass();
                if (((u) oVar.f3828b).f7115e.f1694a == 0) {
                    valueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            s q3 = str != null ? oVar.q(str, false) : (s) ((s0) oVar.f3829c).c(i3);
            if (q3 == null) {
                if (((String) oVar.f3830d) == null) {
                    String str2 = (String) oVar.f3831e;
                    if (str2 == null) {
                        str2 = String.valueOf(oVar.f3827a);
                    }
                    oVar.f3830d = str2;
                }
                String str3 = (String) oVar.f3830d;
                str3.getClass();
                a1.e(n0.l.g("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            w1 w1Var2 = q3.f7115e;
            if (str != null) {
                if (!str.equals((String) w1Var2.f1698e)) {
                    r c10 = w1Var2.c(str);
                    Bundle bundle = c10 != null ? c10.f7109e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        k0.f5575d.getClass();
                        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        h10.putAll(bundle);
                        Bundle bundle2 = (Bundle) b0Var.f10141d;
                        if (bundle2 != null) {
                            h10.putAll(bundle2);
                        }
                        b0Var.f10141d = h10;
                    }
                }
                if (q3.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList z10 = k7.e.z(q3.c(), new a1.d(11, b0Var));
                    if (!z10.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + q3 + ". Missing required arguments [" + z10 + ']').toString());
                    }
                }
            }
            this.f7128c.b(q3.f7114d).d(kotlin.collections.x.c(b().b(q3, q3.b((Bundle) b0Var.f10141d))), a0Var);
        }
    }

    @Override // n4.h0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public u a() {
        return new u(this);
    }
}
