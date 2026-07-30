package m5;

import android.content.Context;
import android.os.Bundle;
import com.anythink.basead.exoplayer.k.o;
import com.onesignal.common.f;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import l5.C4693a;
import l5.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.c;
import s5.InterfaceC5000b;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4782a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0256a Companion = new C0256a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final G4.a _time;
    private final InterfaceC5000b _workManager;

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    public static final class C0256a {
        public /* synthetic */ C0256a(e eVar) {
            this();
        }

        private C0256a() {
        }
    }

    public C4782a(InterfaceC5000b _workManager, G4.a _time) {
        h.e(_workManager, "_workManager");
        h.e(_time, "_time");
        this._workManager = _workManager;
        this._time = _time;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                    h.b(jSONObject);
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put(o.f8603c, string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", DEFAULT_ACTION);
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // l5.b
    public C4693a processBundleFromReceiver(Context context, Bundle bundle) {
        h.e(context, "context");
        h.e(bundle, "bundle");
        C4693a c4693a = new C4693a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return c4693a;
        }
        c4693a.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject bundleAsJSONObject = f.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z8 = bundle.getBoolean("is_restoring", false);
        p5.f fVar = p5.f.INSTANCE;
        String string = bundle.getString("pri", "0");
        h.d(string, "getString(...)");
        boolean isHighPriority = fVar.isHighPriority(Integer.parseInt(string));
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(bundleAsJSONObject);
        int i = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        InterfaceC5000b interfaceC5000b = this._workManager;
        h.b(oSNotificationIdFromJson);
        c4693a.setWorkManagerProcessing(interfaceC5000b.beginEnqueueingWork(context, oSNotificationIdFromJson, i, bundleAsJSONObject, currentTimeMillis, z8, isHighPriority));
        return c4693a;
    }
}
