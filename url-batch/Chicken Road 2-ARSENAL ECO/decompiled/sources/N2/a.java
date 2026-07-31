package N2;

import M2.b;
import Q2.c;
import android.content.Context;
import android.os.Bundle;
import com.onesignal.common.f;
import g2.InterfaceC0391a;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0002a Companion = new C0002a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final InterfaceC0391a _time;
    private final T2.b _workManager;

    /* renamed from: N2.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        public /* synthetic */ C0002a(e eVar) {
            this();
        }

        private C0002a() {
        }
    }

    public a(T2.b _workManager, InterfaceC0391a _time) {
        i.e(_workManager, "_workManager");
        i.e(_time, "_time");
        this._workManager = _workManager;
        this._time = _time;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    i.b(jSONObject);
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
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
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // M2.b
    public M2.a processBundleFromReceiver(Context context, Bundle bundle) {
        i.e(context, "context");
        i.e(bundle, "bundle");
        M2.a aVar = new M2.a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject bundleAsJSONObject = f.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z5 = bundle.getBoolean("is_restoring", false);
        Q2.f fVar = Q2.f.INSTANCE;
        String string = bundle.getString("pri", "0");
        i.d(string, "getString(...)");
        boolean isHighPriority = fVar.isHighPriority(Integer.parseInt(string));
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(bundleAsJSONObject);
        int i7 = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        T2.b bVar = this._workManager;
        i.b(oSNotificationIdFromJson);
        aVar.setWorkManagerProcessing(bVar.beginEnqueueingWork(context, oSNotificationIdFromJson, i7, bundleAsJSONObject, currentTimeMillis, z5, isHighPriority));
        return aVar;
    }
}
