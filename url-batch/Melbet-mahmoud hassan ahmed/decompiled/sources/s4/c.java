package s4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f21620a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21621b;

    /* renamed from: c, reason: collision with root package name */
    public String f21622c;

    /* renamed from: d, reason: collision with root package name */
    public String f21623d;

    /* renamed from: e, reason: collision with root package name */
    public String f21624e;

    /* renamed from: f, reason: collision with root package name */
    public int f21625f;

    /* renamed from: g, reason: collision with root package name */
    public String f21626g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21627h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21628i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21629j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21630k;

    /* renamed from: l, reason: collision with root package name */
    public int f21631l;

    /* renamed from: m, reason: collision with root package name */
    public int f21632m;

    /* renamed from: n, reason: collision with root package name */
    public String f21633n;

    /* renamed from: o, reason: collision with root package name */
    public String f21634o;

    public c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f21620a = sharedPreferences;
        this.f21621b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f21622c = this.f21620a.getString("androidNotificationChannelId", null);
        this.f21623d = this.f21620a.getString("androidNotificationChannelName", null);
        this.f21624e = this.f21620a.getString("androidNotificationChannelDescription", null);
        this.f21625f = this.f21620a.getInt("notificationColor", -1);
        this.f21626g = this.f21620a.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f21627h = this.f21620a.getBoolean("androidShowNotificationBadge", false);
        this.f21628i = this.f21620a.getBoolean("androidNotificationClickStartsActivity", true);
        this.f21629j = this.f21620a.getBoolean("androidNotificationOngoing", false);
        this.f21630k = this.f21620a.getBoolean("androidStopForegroundOnPause", true);
        this.f21631l = this.f21620a.getInt("artDownscaleWidth", -1);
        this.f21632m = this.f21620a.getInt("artDownscaleHeight", -1);
        this.f21633n = this.f21620a.getString("activityClassName", null);
        this.f21634o = this.f21620a.getString("androidBrowsableRootExtras", null);
    }

    public Bundle a() {
        if (this.f21634o == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f21634o);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    try {
                        try {
                            try {
                                bundle.putInt(next, jSONObject.getInt(next));
                            } catch (Exception unused) {
                                bundle.putString(next, jSONObject.getString(next));
                            }
                        } catch (Exception unused2) {
                            bundle.putBoolean(next, jSONObject.getBoolean(next));
                        }
                    } catch (Exception unused3) {
                        System.out.println("Unsupported extras value for key " + next);
                    }
                } catch (Exception unused4) {
                    bundle.putDouble(next, jSONObject.getDouble(next));
                }
            }
            return bundle;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void b() {
        this.f21620a.edit().putBoolean("androidResumeOnClick", this.f21621b).putString("androidNotificationChannelId", this.f21622c).putString("androidNotificationChannelName", this.f21623d).putString("androidNotificationChannelDescription", this.f21624e).putInt("notificationColor", this.f21625f).putString("androidNotificationIcon", this.f21626g).putBoolean("androidShowNotificationBadge", this.f21627h).putBoolean("androidNotificationClickStartsActivity", this.f21628i).putBoolean("androidNotificationOngoing", this.f21629j).putBoolean("androidStopForegroundOnPause", this.f21630k).putInt("artDownscaleWidth", this.f21631l).putInt("artDownscaleHeight", this.f21632m).putString("activityClassName", this.f21633n).putString("androidBrowsableRootExtras", this.f21634o).apply();
    }

    public void c(Map<?, ?> map) {
        this.f21634o = map != null ? new JSONObject(map).toString() : null;
    }
}
