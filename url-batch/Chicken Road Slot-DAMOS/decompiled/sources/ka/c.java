package ka;

import com.onesignal.core.internal.http.impl.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c {
    Object delete(String str, d dVar, ld.a aVar);

    Object get(String str, d dVar, ld.a aVar);

    Object patch(String str, JSONObject jSONObject, d dVar, ld.a aVar);

    Object post(String str, JSONObject jSONObject, d dVar, ld.a aVar);

    Object put(String str, JSONObject jSONObject, d dVar, ld.a aVar);
}
