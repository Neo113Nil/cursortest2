package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fj2 implements ij2<hj2<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f5123a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5124b;

    fj2(dc3 dc3Var, Context context) {
        this.f5123a = dc3Var;
        this.f5124b = context;
    }

    public static Bundle b(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i7);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i8 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i8 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i9 = i8 - 1;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        return this.f5123a.E(new Callable() { // from class: com.google.android.gms.internal.ads.ej2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fj2.this.c();
            }
        });
    }

    final /* synthetic */ hj2 c() {
        String str = (String) sw.c().b(m10.A4);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle b7 = b(this.f5124b, new JSONArray(str));
            return new hj2() { // from class: com.google.android.gms.internal.ads.dj2
                @Override // com.google.android.gms.internal.ads.hj2
                public final void c(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", b7);
                }
            };
        } catch (JSONException e7) {
            io0.c("JSON parsing error", e7);
            return null;
        }
    }
}
