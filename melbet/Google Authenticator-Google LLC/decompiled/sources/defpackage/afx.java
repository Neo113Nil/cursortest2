package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afx {
    public static final agn a = new afw(1);
    public static final agn b = new afw(0);
    public static final agn c = new afw(2);

    public static final afr a(ago agoVar) {
        Object a2 = agoVar.a(a);
        if (a2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ame ameVar = (ame) a2;
        Object a3 = agoVar.a(b);
        if (a3 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        agl aglVar = (agl) a3;
        Object a4 = agoVar.a(agj.a);
        if (a4 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        String str = (String) a4;
        Bundle bundle = (Bundle) agoVar.a(c);
        amd e = ameVar.aE().e();
        if (!(e instanceof afy)) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        afy afyVar = (afy) e;
        Map map = b(aglVar).a;
        afr afrVar = (afr) map.get(str);
        if (afrVar != null) {
            return afrVar;
        }
        afyVar.b();
        Bundle bundle2 = afyVar.a;
        Bundle bundle3 = null;
        if (bundle2 != null && bundle2.containsKey(str)) {
            Bundle bundle4 = bundle2.getBundle(str);
            if (bundle4 == null) {
                bundle4 = pk.h((kol[]) Arrays.copyOf(new kol[0], 0));
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                afyVar.a = null;
            }
            bundle3 = bundle4;
        }
        afr e2 = yk.e(bundle3, bundle);
        map.put(str, e2);
        return e2;
    }

    public static final afz b(agl aglVar) {
        afv afvVar = new afv();
        ago e = yl.e(aglVar);
        e.getClass();
        cfz cfzVar = new agj(aglVar.O(), afvVar, e).b;
        int i = ksx.a;
        return (afz) cfzVar.e(new ksj(afz.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(ame ameVar) {
        aek aekVar = ameVar.L().c;
        if (aekVar != aek.b && aekVar != aek.c) {
            throw new IllegalArgumentException(a.ac(aekVar, ameVar, "Failed to enable `SavedStateHandle` for `", "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."));
        }
        if (ameVar.aE().e() == null) {
            afy afyVar = new afy(ameVar.aE(), (agl) ameVar);
            ameVar.aE().b("androidx.lifecycle.internal.SavedStateHandlesProvider", afyVar);
            ameVar.L().a(new afs(afyVar, 0));
        }
    }
}
