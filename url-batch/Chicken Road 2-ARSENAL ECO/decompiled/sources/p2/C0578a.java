package p2;

import com.onesignal.common.modeling.h;
import com.onesignal.inAppMessages.internal.d;
import com.onesignal.user.internal.properties.b;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578a {
    public static final C0086a Companion = new C0086a(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final b _propertiesModelStore;
    private final InterfaceC0391a _time;

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public static final class C0086a {
        public /* synthetic */ C0086a(e eVar) {
            this();
        }

        private C0086a() {
        }
    }

    public C0578a(InterfaceC0391a _time, b _propertiesModelStore) {
        i.e(_time, "_time");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        this._time = _time;
        this._propertiesModelStore = _propertiesModelStore;
    }

    private final String taggedHTMLString(String str) {
        h tags = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getTags();
        i.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String jSONObject = new JSONObject(tags).toString();
        i.d(jSONObject, "toString(...)");
        return str + String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{jSONObject}, 1));
    }

    public final d hydrateIAMMessageContent(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        try {
            d dVar = new d(jsonObject);
            if (dVar.getContentHtml() == null) {
                com.onesignal.debug.internal.logging.b.info$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = dVar.getContentHtml();
            i.b(contentHtml);
            dVar.setContentHtml(taggedHTMLString(contentHtml));
            return dVar;
        } catch (JSONException e4) {
            com.onesignal.debug.internal.logging.b.error("Error attempting to hydrate InAppMessageContent: " + jsonObject, e4);
            return null;
        }
    }

    public final List<com.onesignal.inAppMessages.internal.a> hydrateIAMMessages(JSONArray jsonArray) {
        i.e(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i7);
            i.d(jSONObject, "getJSONObject(...)");
            com.onesignal.inAppMessages.internal.a aVar = new com.onesignal.inAppMessages.internal.a(jSONObject, this._time);
            if (aVar.getMessageId() != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
