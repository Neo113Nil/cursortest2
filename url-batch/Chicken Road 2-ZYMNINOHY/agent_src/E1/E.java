package E1;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f487a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f488b;

    public E(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f487a = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    arrayList.add(new D(optJSONObject));
                }
            }
        }
        this.f488b = arrayList;
    }
}
