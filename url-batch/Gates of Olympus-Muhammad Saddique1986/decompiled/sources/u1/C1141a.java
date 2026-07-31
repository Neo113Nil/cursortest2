package u1;

import androidx.lifecycle.M;
import androidx.lifecycle.V;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141a extends V {

    /* renamed from: b, reason: collision with root package name */
    public final String f9580b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f9581c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f9582d;

    public C1141a(M m3) {
        Object obj;
        LinkedHashMap linkedHashMap = m3.f5179a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (m3.f5181c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            m3.f5182d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            m3.b(uuid, this.f9580b);
        }
        this.f9581c = uuid;
    }

    @Override // androidx.lifecycle.V
    public final void d() {
        WeakReference weakReference = this.f9582d;
        if (weakReference == null) {
            f2.j.j("saveableStateHolderRef");
            throw null;
        }
        R.c cVar = (R.c) weakReference.get();
        if (cVar != null) {
            cVar.a(this.f9581c);
        }
        WeakReference weakReference2 = this.f9582d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            f2.j.j("saveableStateHolderRef");
            throw null;
        }
    }
}
