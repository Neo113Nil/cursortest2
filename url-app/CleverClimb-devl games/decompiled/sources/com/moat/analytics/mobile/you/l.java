package com.moat.analytics.mobile.you;

import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.moat.analytics.mobile.you.w;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7503a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7504b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7505c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f7506d = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    private int e = 10;

    l(String str) {
        a(str);
    }

    private void a(String str) {
        int i;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("sa");
            boolean equals = string.equals("9d24c90729bf464dce5d8fd1ace14a60656dbb2d");
            boolean equals2 = string.equals("8f1d08a2d6496191a5ebae8f0590f513e2619489");
            if ((string.equals(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON) || equals || equals2) && !a(jSONObject) && !b(jSONObject)) {
                this.f7503a = true;
                this.f7504b = equals;
                this.f7505c = equals2;
                if (this.f7505c) {
                    this.f7504b = true;
                }
            }
            if (jSONObject.has("in") && (i = jSONObject.getInt("in")) >= 100 && i <= 1000) {
                this.f7506d = i;
            }
            if (jSONObject.has("es")) {
                this.e = jSONObject.getInt("es");
            }
            if (c(jSONObject)) {
                ((k) MoatAnalytics.getInstance()).f7501c = true;
            }
        } catch (Exception e) {
            this.f7503a = false;
            this.f7504b = false;
            this.f7506d = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            m.a(e);
        }
    }

    private boolean a(JSONObject jSONObject) {
        try {
            if (16 > Build.VERSION.SDK_INT) {
                return true;
            }
            if (jSONObject.has("ob")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ob");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getInt(i) == Build.VERSION.SDK_INT) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("ap")) {
                String b2 = s.d().b();
                JSONArray jSONArray = jSONObject.getJSONArray("ap");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
        return false;
    }

    private boolean c(JSONObject jSONObject) {
        try {
            if (jSONObject.has("al")) {
                String b2 = s.d().b();
                JSONArray jSONArray = jSONObject.getJSONArray("al");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
        return false;
    }

    boolean a() {
        return this.f7504b;
    }

    boolean b() {
        return this.f7505c;
    }

    int c() {
        return this.f7506d;
    }

    int d() {
        return this.e;
    }

    w.d e() {
        return this.f7503a ? w.d.ON : w.d.OFF;
    }
}
