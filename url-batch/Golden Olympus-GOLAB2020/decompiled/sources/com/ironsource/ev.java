package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ev {

    /* renamed from: b, reason: collision with root package name */
    private NetworkSettings f16172b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f16171a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f16173c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16174d = true;

    ev() {
    }

    public static ev a() {
        return new ev();
    }

    public JSONObject b() {
        return this.f16173c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.f16172b;
    }

    public ArrayList<String> d() {
        return this.f16171a;
    }

    public boolean e() {
        return this.f16174d;
    }

    public void a(NetworkSettings networkSettings) {
        this.f16172b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16171a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f16173c = jSONObject;
    }

    public void a(boolean z4) {
        this.f16174d = z4;
    }
}
