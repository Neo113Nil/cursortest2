package u3;

import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f8986b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f8987c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f8988d;

    public a(n0 n0Var) {
        Object obj;
        LinkedHashMap linkedHashMap = n0Var.f1002a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (n0Var.f1004c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            n0Var.f1005d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            n0Var.b(uuid, this.f8986b);
        }
        this.f8987c = uuid;
    }

    @Override // androidx.lifecycle.w0
    public final void d() {
        WeakReference weakReference = this.f8988d;
        if (weakReference == null) {
            r6.k.j("saveableStateHolderRef");
            throw null;
        }
        p0.c cVar = (p0.c) weakReference.get();
        if (cVar != null) {
            cVar.c(this.f8987c);
        }
        WeakReference weakReference2 = this.f8988d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            r6.k.j("saveableStateHolderRef");
            throw null;
        }
    }
}
