package C2;

import com.onesignal.core.internal.http.impl.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ Object delete$default(c cVar, String str, e eVar, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i2 & 2) != 0) {
            eVar = null;
        }
        return cVar.delete(str, eVar, bVar);
    }

    public static /* synthetic */ Object get$default(c cVar, String str, e eVar, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i2 & 2) != 0) {
            eVar = null;
        }
        return cVar.get(str, eVar, bVar);
    }

    public static /* synthetic */ Object patch$default(c cVar, String str, JSONObject jSONObject, e eVar, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i2 & 4) != 0) {
            eVar = null;
        }
        return cVar.patch(str, jSONObject, eVar, bVar);
    }

    public static /* synthetic */ Object post$default(c cVar, String str, JSONObject jSONObject, e eVar, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i2 & 4) != 0) {
            eVar = null;
        }
        return cVar.post(str, jSONObject, eVar, bVar);
    }

    public static /* synthetic */ Object put$default(c cVar, String str, JSONObject jSONObject, e eVar, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i2 & 4) != 0) {
            eVar = null;
        }
        return cVar.put(str, jSONObject, eVar, bVar);
    }
}
