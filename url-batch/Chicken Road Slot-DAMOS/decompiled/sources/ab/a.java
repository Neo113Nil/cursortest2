package ab;

import com.onesignal.common.modeling.h;
import com.onesignal.inAppMessages.internal.d;
import com.onesignal.user.internal.properties.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final C0000a Companion = new C0000a(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final b _propertiesModelStore;
    private final sa.a _time;

    public a(sa.a aVar, b bVar) {
        aVar.getClass();
        bVar.getClass();
        this._time = aVar;
        this._propertiesModelStore = bVar;
    }

    private final String taggedHTMLString(String str) {
        h tags = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getTags();
        tags.getClass();
        String jSONObject = new JSONObject(tags).toString();
        jSONObject.getClass();
        return str + String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{jSONObject}, 1));
    }

    public final d hydrateIAMMessageContent(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            d dVar = new d(jSONObject);
            if (dVar.getContentHtml() == null) {
                com.onesignal.debug.internal.logging.b.debug$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = dVar.getContentHtml();
            contentHtml.getClass();
            dVar.setContentHtml(taggedHTMLString(contentHtml));
            return dVar;
        } catch (JSONException e2) {
            com.onesignal.debug.internal.logging.b.error("Error attempting to hydrate InAppMessageContent: " + jSONObject, e2);
            return null;
        }
    }

    public final List<com.onesignal.inAppMessages.internal.a> hydrateIAMMessages(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            jSONObject.getClass();
            com.onesignal.inAppMessages.internal.a aVar = new com.onesignal.inAppMessages.internal.a(jSONObject, this._time);
            if (aVar.getMessageId() != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: ab.a$a, reason: collision with other inner class name */
    public static final class C0000a {
        public /* synthetic */ C0000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0000a() {
        }
    }
}
