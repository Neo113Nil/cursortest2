package E1;

import org.json.JSONObject;

/* renamed from: E1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g {

    /* renamed from: a, reason: collision with root package name */
    public final String f616a;

    public C0031g(String str) {
        this.f616a = new JSONObject(str).optString("countryCode");
    }
}
