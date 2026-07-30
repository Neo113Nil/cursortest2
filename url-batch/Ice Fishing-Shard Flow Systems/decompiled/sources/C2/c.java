package C2;

import com.onesignal.core.internal.http.impl.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface c {
    Object delete(String str, e eVar, V5.b bVar);

    Object get(String str, e eVar, V5.b bVar);

    Object patch(String str, JSONObject jSONObject, e eVar, V5.b bVar);

    Object post(String str, JSONObject jSONObject, e eVar, V5.b bVar);

    Object put(String str, JSONObject jSONObject, e eVar, V5.b bVar);
}
