package R2;

import com.onesignal.common.modeling.h;
import com.onesignal.inAppMessages.internal.d;
import com.onesignal.user.internal.properties.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static final C0002a Companion = new C0002a(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final b _propertiesModelStore;
    private final I2.a _time;

    /* renamed from: R2.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        public /* synthetic */ C0002a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0002a() {
        }
    }

    public a(I2.a _time, b _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._time = _time;
        this._propertiesModelStore = _propertiesModelStore;
    }

    private final String taggedHTMLString(String str) {
        h tags = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getTags();
        Intrinsics.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String jSONObject = new JSONObject(tags).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String format = String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{jSONObject}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }

    public final d hydrateIAMMessageContent(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            d dVar = new d(jsonObject);
            if (dVar.getContentHtml() == null) {
                com.onesignal.debug.internal.logging.b.info$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = dVar.getContentHtml();
            Intrinsics.b(contentHtml);
            dVar.setContentHtml(taggedHTMLString(contentHtml));
            return dVar;
        } catch (JSONException e7) {
            com.onesignal.debug.internal.logging.b.error("Error attempting to hydrate InAppMessageContent: " + jsonObject, e7);
            return null;
        }
    }

    public final List<com.onesignal.inAppMessages.internal.a> hydrateIAMMessages(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i2);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            com.onesignal.inAppMessages.internal.a aVar = new com.onesignal.inAppMessages.internal.a(jSONObject, this._time);
            if (aVar.getMessageId() != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
