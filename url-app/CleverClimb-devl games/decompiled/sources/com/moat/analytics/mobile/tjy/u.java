package com.moat.analytics.mobile.tjy;

import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7300a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7301b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f7302c = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    public u(String str) {
        a(str);
    }

    private boolean a(JSONObject jSONObject) {
        try {
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

    public void a(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("sa");
            boolean equals = string.equals("8ace5ca5da6b9adb3c0f055aad4a98c2aedf4bd7");
            if ((string.equals(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON) || equals) && !a(jSONObject)) {
                this.f7300a = true;
                this.f7301b = equals;
            }
            if (!jSONObject.has("in") || (i = jSONObject.getInt("in")) < 100 || i > 1000) {
                return;
            }
            this.f7302c = i;
        } catch (Exception unused) {
            this.f7300a = false;
            this.f7301b = false;
            this.f7302c = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        }
    }

    public boolean a() {
        return this.f7301b;
    }

    public boolean b() {
        return this.f7300a;
    }

    public int c() {
        return this.f7302c;
    }
}
