package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ek extends hk {
    public final /* synthetic */ rm a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ z1 c;
    public final /* synthetic */ x1 d;
    public final /* synthetic */ Fragment e;

    public ek(Fragment fragment, rm rmVar, AtomicReference atomicReference, z1 z1Var, x1 x1Var) {
        this.e = fragment;
        this.a = rmVar;
        this.b = atomicReference;
        this.c = z1Var;
        this.d = x1Var;
    }

    @Override // defpackage.hk
    public final void a() {
        Fragment fragment = this.e;
        final String generateActivityResultKey = fragment.generateActivityResultKey();
        final i2 apply = this.a.apply();
        LinkedHashMap linkedHashMap = apply.c;
        generateActivityResultKey.getClass();
        final z1 z1Var = this.c;
        z1Var.getClass();
        final x1 x1Var = this.d;
        x1Var.getClass();
        iq lifecycle = fragment.getLifecycle();
        if (((a) lifecycle).c.compareTo(hq.i) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(fragment);
            hq hqVar = ((a) lifecycle).c;
            sb.append(" is attempting to register while current state is ");
            sb.append(hqVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        apply.d(generateActivityResultKey);
        f2 f2Var = (f2) linkedHashMap.get(generateActivityResultKey);
        if (f2Var == null) {
            f2Var = new f2(lifecycle);
        }
        lq lqVar = new lq() { // from class: c2
            @Override // defpackage.lq
            public final void b(nq nqVar, gq gqVar) {
                i2 i2Var = i2.this;
                LinkedHashMap linkedHashMap2 = i2Var.e;
                gq gqVar2 = gq.ON_START;
                String str = generateActivityResultKey;
                if (gqVar2 != gqVar) {
                    if (gq.ON_STOP == gqVar) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (gq.ON_DESTROY == gqVar) {
                            i2Var.e(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = i2Var.g;
                LinkedHashMap linkedHashMap3 = i2Var.f;
                z1 z1Var2 = z1Var;
                x1 x1Var2 = x1Var;
                linkedHashMap2.put(str, new e2(z1Var2, x1Var2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    x1Var2.a(obj);
                }
                w1 w1Var = (w1) j8.t(bundle, str);
                if (w1Var != null) {
                    bundle.remove(str);
                    x1Var2.a(z1Var2.c(w1Var.g, w1Var.f));
                }
            }
        };
        f2Var.a.a(lqVar);
        f2Var.b.add(lqVar);
        linkedHashMap.put(generateActivityResultKey, f2Var);
        this.b.set(new g2());
    }
}
