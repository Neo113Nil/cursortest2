package r1;

import androidx.lifecycle.M;
import androidx.lifecycle.V;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849a extends V {

    /* renamed from: b, reason: collision with root package name */
    public final String f7211b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f7212c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f7213d;

    public C0849a(M m3) {
        Object obj;
        LinkedHashMap linkedHashMap = m3.f3978a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (m3.f3980c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            m3.f3981d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            m3.b(uuid, this.f7211b);
        }
        this.f7212c = uuid;
    }

    @Override // androidx.lifecycle.V
    public final void d() {
        WeakReference weakReference = this.f7213d;
        if (weakReference == null) {
            Z1.i.j("saveableStateHolderRef");
            throw null;
        }
        R.c cVar = (R.c) weakReference.get();
        if (cVar != null) {
            cVar.b(this.f7212c);
        }
        WeakReference weakReference2 = this.f7213d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            Z1.i.j("saveableStateHolderRef");
            throw null;
        }
    }
}
