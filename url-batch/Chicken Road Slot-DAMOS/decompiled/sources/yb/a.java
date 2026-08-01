package yb;

import android.content.Context;
import android.os.Bundle;
import bc.c;
import com.onesignal.common.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xb.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0077a Companion = new C0077a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final sa.a _time;
    private final ec.b _workManager;

    public a(ec.b bVar, sa.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this._workManager = bVar;
        this._time = aVar;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    jSONObject.getClass();
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    String string = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", DEFAULT_ACTION);
                if (!jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject2.put(PUSH_ADDITIONAL_DATA_KEY, jSONObject);
                }
                bundle.putString(c.PAYLOAD_OS_ROOT_CUSTOM, jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // xb.b
    public xb.a processBundleFromReceiver(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        xb.a aVar = new xb.a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject bundleAsJSONObject = f.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z10 = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        string.getClass();
        boolean z11 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(bundleAsJSONObject);
        int i3 = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        ec.b bVar = this._workManager;
        oSNotificationIdFromJson.getClass();
        aVar.setWorkManagerProcessing(bVar.beginEnqueueingWork(context, oSNotificationIdFromJson, i3, bundleAsJSONObject, currentTimeMillis, z10, z11));
        return aVar;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: yb.a$a, reason: collision with other inner class name */
    public static final class C0077a {
        public /* synthetic */ C0077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0077a() {
        }
    }
}
