package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aft implements amc {
    @Override // defpackage.amc
    public final void a(ame ameVar) {
        afu afuVar;
        if (!(ameVar instanceof agl)) {
            Objects.toString(ameVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(ameVar.toString()));
        }
        agl aglVar = (agl) ameVar;
        Set b = aglVar.O().b();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            agd a = aglVar.O().a(it.next());
            if (a != null && (afuVar = (afu) a.s("androidx.lifecycle.savedstate.vm.tag")) != null) {
                afuVar.a(ameVar.aE(), ameVar.L());
            }
        }
        if (b.isEmpty()) {
            return;
        }
        ameVar.aE().c(aft.class);
    }
}
