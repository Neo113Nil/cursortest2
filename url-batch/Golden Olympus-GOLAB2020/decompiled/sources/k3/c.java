package k3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f41024a = new c();

    private c() {
    }

    public final List a(JSONArray array) {
        Intrinsics.checkNotNullParameter(array, "array");
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = array.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject = array.getJSONObject(i4);
            String string = jSONObject.getString("event");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"event\")");
            String string2 = jSONObject.getString("reason");
            Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"reason\")");
            createListBuilder.add(new b(string, string2, jSONObject.getInt("count")));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final JSONArray b(Collection records) {
        Intrinsics.checkNotNullParameter(records, "records");
        JSONArray jSONArray = new JSONArray();
        Iterator it = records.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", bVar.c());
            jSONObject.put("reason", bVar.d());
            jSONObject.put("count", bVar.b());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
