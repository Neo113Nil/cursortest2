package t1;

import androidx.lifecycle.J;
import androidx.lifecycle.T;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203a extends T {

    /* renamed from: b, reason: collision with root package name */
    public final String f10642b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f10643c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f10644d;

    public C1203a(J j4) {
        Object obj;
        LinkedHashMap linkedHashMap = j4.f5434a;
        Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (j4.f5436c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            j4.f5437d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            j4.b(uuid, this.f10642b);
        }
        this.f10643c = uuid;
    }

    @Override // androidx.lifecycle.T
    public final void c() {
        WeakReference weakReference = this.f10644d;
        if (weakReference == null) {
            Intrinsics.g("saveableStateHolderRef");
            throw null;
        }
        P.c cVar = (P.c) weakReference.get();
        if (cVar != null) {
            cVar.a(this.f10643c);
        }
        WeakReference weakReference2 = this.f10644d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            Intrinsics.g("saveableStateHolderRef");
            throw null;
        }
    }
}
