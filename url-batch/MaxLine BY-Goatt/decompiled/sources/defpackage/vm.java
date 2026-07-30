package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vm extends n53 {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final UUID c;
    public WeakReference d;

    public vm(pd2 pd2Var) {
        Object obj;
        pd2Var.getClass();
        fy fyVar = pd2Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) fyVar.n;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) fyVar.q;
        try {
            vo2 vo2Var = (vo2) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (vo2Var == null || (obj = vo2Var.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) fyVar.p).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            String str = this.b;
            str.getClass();
            if (uuid != null) {
                ArrayList arrayList = rd2.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(uuid)) {
                        }
                    }
                }
                b71.p(uuid.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = rd2.a;
            Object obj3 = pd2Var.a.get(str);
            cn1 cn1Var = obj3 instanceof cn1 ? (cn1) obj3 : null;
            if (cn1Var != null) {
                cn1Var.d(uuid);
            }
            fyVar.n(uuid, str);
        }
        this.c = uuid;
    }

    @Override // defpackage.n53
    public final void d() {
        WeakReference weakReference = this.d;
        if (weakReference == null) {
            Intrinsics.f("saveableStateHolderRef");
            throw null;
        }
        jd2 jd2Var = (jd2) weakReference.get();
        if (jd2Var != null) {
            jd2Var.f(this.c);
        }
        WeakReference weakReference2 = this.d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            Intrinsics.f("saveableStateHolderRef");
            throw null;
        }
    }
}
