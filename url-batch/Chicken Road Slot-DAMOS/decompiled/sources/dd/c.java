package dd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final fd.b _fallbackPushSub;
    private final List<fd.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends fd.e> list, fd.b bVar) {
        list.getClass();
        bVar.getClass();
        this.collection = list;
        this._fallbackPushSub = bVar;
    }

    public final fd.a getByEmail(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.a(((fd.a) obj).getEmail(), str)) {
                break;
            }
        }
        return (fd.a) obj;
    }

    public final fd.d getBySMS(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.a(((fd.d) obj).getNumber(), str)) {
                break;
            }
        }
        return (fd.d) obj;
    }

    public final List<fd.e> getCollection() {
        return this.collection;
    }

    public final List<fd.a> getEmails() {
        List<fd.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof fd.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final fd.b getPush() {
        List<fd.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof fd.b) {
                arrayList.add(obj);
            }
        }
        fd.b bVar = (fd.b) CollectionsKt.firstOrNull(arrayList);
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<fd.d> getSmss() {
        List<fd.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof fd.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
