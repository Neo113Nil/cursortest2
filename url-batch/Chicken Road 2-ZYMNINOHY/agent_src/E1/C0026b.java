package E1;

import org.json.JSONObject;

/* renamed from: E1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026b {

    /* renamed from: a, reason: collision with root package name */
    public final String f572a;

    public C0026b(String str) {
        this.f572a = new JSONObject(str).optString("externalTransactionToken");
    }
}
