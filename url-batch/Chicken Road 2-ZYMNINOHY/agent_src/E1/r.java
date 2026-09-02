package E1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f652a;

    public r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    arrayList.add(new C0041q(optJSONObject));
                }
            }
        }
        this.f652a = arrayList;
    }
}
