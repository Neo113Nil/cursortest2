package ka;

import a2.r;
import com.onesignal.core.internal.http.impl.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ Object delete$default(c cVar, String str, d dVar, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: delete");
            return null;
        }
        if ((i3 & 2) != 0) {
            dVar = null;
        }
        return cVar.delete(str, dVar, aVar);
    }

    public static /* synthetic */ Object get$default(c cVar, String str, d dVar, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: get");
            return null;
        }
        if ((i3 & 2) != 0) {
            dVar = null;
        }
        return cVar.get(str, dVar, aVar);
    }

    public static /* synthetic */ Object patch$default(c cVar, String str, JSONObject jSONObject, d dVar, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: patch");
            return null;
        }
        if ((i3 & 4) != 0) {
            dVar = null;
        }
        return cVar.patch(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ Object post$default(c cVar, String str, JSONObject jSONObject, d dVar, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: post");
            return null;
        }
        if ((i3 & 4) != 0) {
            dVar = null;
        }
        return cVar.post(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ Object put$default(c cVar, String str, JSONObject jSONObject, d dVar, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: put");
            return null;
        }
        if ((i3 & 4) != 0) {
            dVar = null;
        }
        return cVar.put(str, jSONObject, dVar, aVar);
    }
}
