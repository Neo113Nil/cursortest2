package p4;

import android.os.Looper;
import androidx.lifecycle.i0;
import androidx.lifecycle.r0;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import d7.n0;
import d7.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f5739b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final String f5740c;

    /* renamed from: d, reason: collision with root package name */
    public q3.k f5741d;

    public a(i0 i0Var) {
        Object obj;
        i0Var.getClass();
        g2.n nVar = i0Var.f832b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) nVar.f2979b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) nVar.f2982e;
        try {
            w wVar = (w) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (wVar == null || (obj = ((n0) wVar).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) nVar.f2981d).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.f5739b;
            q6.i.e(str2, "key");
            if (str != null) {
                ArrayList arrayList = k4.a.f4178a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + str.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = k4.a.f4178a;
            Object obj3 = i0Var.f831a.get(str2);
            z zVar = obj3 instanceof z ? (z) obj3 : null;
            if (zVar != null) {
                zVar.getClass();
                ((m.a) m.a.y().f4872a).getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    throw new IllegalStateException("Cannot invoke setValue on a background thread");
                }
                zVar.f886e++;
                zVar.f884c = str;
                if (zVar.f887f) {
                    zVar.f888g = true;
                } else {
                    zVar.f887f = true;
                    do {
                        zVar.f888g = false;
                        n.f fVar = zVar.f883b;
                        fVar.getClass();
                        n.d dVar = new n.d(fVar);
                        fVar.f5243f.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext()) {
                            zVar.a((y) ((Map.Entry) dVar.next()).getValue());
                            if (zVar.f888g) {
                                break;
                            }
                        }
                    } while (zVar.f888g);
                    zVar.f887f = false;
                }
            }
            nVar.f(str, str2);
        }
        this.f5740c = str;
    }

    @Override // androidx.lifecycle.r0
    public final void b() {
        q3.k kVar = this.f5741d;
        if (kVar == null) {
            q6.i.j("saveableStateHolderRef");
            throw null;
        }
        v0.c cVar = (v0.c) ((WeakReference) kVar.f6119e).get();
        if (cVar != null) {
            cVar.a(this.f5740c);
        }
        q3.k kVar2 = this.f5741d;
        if (kVar2 != null) {
            ((WeakReference) kVar2.f6119e).clear();
        } else {
            q6.i.j("saveableStateHolderRef");
            throw null;
        }
    }
}
