package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.t;
import com.facebook.u;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEvent.java */
/* loaded from: classes.dex */
class b implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet<String> f5949c = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f5950a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5951b;

    /* renamed from: d, reason: collision with root package name */
    private String f5952d;

    public b(String str, String str2, Double d2, Bundle bundle, boolean z, UUID uuid) {
        try {
            a(str2);
            this.f5952d = str2;
            this.f5951b = z;
            this.f5950a = new JSONObject();
            this.f5950a.put("_eventName", str2);
            this.f5950a.put("_logTime", System.currentTimeMillis() / 1000);
            this.f5950a.put("_ui", str);
            if (uuid != null) {
                this.f5950a.put("_session_id", uuid);
            }
            if (d2 != null) {
                this.f5950a.put("_valueToSum", d2.doubleValue());
            }
            if (this.f5951b) {
                this.f5950a.put("_implicitlyLogged", "1");
            }
            if (bundle != null) {
                for (String str3 : bundle.keySet()) {
                    a(str3);
                    Object obj = bundle.get(str3);
                    if (!(obj instanceof String) && !(obj instanceof Number)) {
                        throw new com.facebook.j(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", obj, str3));
                    }
                    this.f5950a.put(str3, obj.toString());
                }
            }
            if (this.f5951b) {
                return;
            }
            t.a(u.APP_EVENTS, "AppEvents", "Created app event '%s'", this.f5950a.toString());
        } catch (com.facebook.j e) {
            t.a(u.APP_EVENTS, "AppEvents", "Invalid app event name or parameter:", e.toString());
            this.f5950a = null;
        } catch (JSONException e2) {
            t.a(u.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            this.f5950a = null;
        }
    }

    public String a() {
        return this.f5952d;
    }

    private b(String str, boolean z) throws JSONException {
        this.f5950a = new JSONObject(str);
        this.f5951b = z;
    }

    public boolean b() {
        return this.f5951b;
    }

    public JSONObject c() {
        return this.f5950a;
    }

    private void a(String str) throws com.facebook.j {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new com.facebook.j(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", str, 40));
        }
        synchronized (f5949c) {
            contains = f5949c.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f5949c) {
                f5949c.add(str);
            }
            return;
        }
        throw new com.facebook.j(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", str));
    }

    /* compiled from: AppEvent.java */
    static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f5953a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5954b;

        private a(String str, boolean z) {
            this.f5953a = str;
            this.f5954b = z;
        }

        private Object readResolve() throws JSONException {
            return new b(this.f5953a, this.f5954b);
        }
    }

    private Object writeReplace() {
        return new a(this.f5950a.toString(), this.f5951b);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", this.f5950a.optString("_eventName"), Boolean.valueOf(this.f5951b), this.f5950a.toString());
    }
}
