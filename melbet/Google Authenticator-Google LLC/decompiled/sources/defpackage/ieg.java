package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ieg {
    private static final hkh a = hkh.l("com/google/frameworks/client/data/android/cronet/ExperimentalOptionMerger");
    private final iel b;

    public ieg(iel ielVar) {
        this.b = ielVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: JSONException -> 0x0066, TryCatch #0 {JSONException -> 0x0066, blocks: (B:26:0x001f, B:29:0x0026, B:7:0x0031, B:9:0x0037, B:10:0x003f, B:12:0x004c, B:13:0x004f, B:15:0x0055, B:16:0x0058, B:18:0x005e, B:19:0x0061, B:6:0x002c), top: B:25:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: JSONException -> 0x0066, TryCatch #0 {JSONException -> 0x0066, blocks: (B:26:0x001f, B:29:0x0026, B:7:0x0031, B:9:0x0037, B:10:0x003f, B:12:0x004c, B:13:0x004f, B:15:0x0055, B:16:0x0058, B:18:0x005e, B:19:0x0061, B:6:0x002c), top: B:25:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: JSONException -> 0x0066, TryCatch #0 {JSONException -> 0x0066, blocks: (B:26:0x001f, B:29:0x0026, B:7:0x0031, B:9:0x0037, B:10:0x003f, B:12:0x004c, B:13:0x004f, B:15:0x0055, B:16:0x0058, B:18:0x005e, B:19:0x0061, B:6:0x002c), top: B:25:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: JSONException -> 0x0066, TryCatch #0 {JSONException -> 0x0066, blocks: (B:26:0x001f, B:29:0x0026, B:7:0x0031, B:9:0x0037, B:10:0x003f, B:12:0x004c, B:13:0x004f, B:15:0x0055, B:16:0x0058, B:18:0x005e, B:19:0x0061, B:6:0x002c), top: B:25:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        iel ielVar = this.b;
        boolean k = ielVar.k();
        boolean m = ielVar.m();
        boolean n = ielVar.n();
        if (!ielVar.k()) {
            return str;
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    jSONObject = new JSONObject(str);
                    if (!jSONObject.has("QUIC")) {
                        jSONObject.put("QUIC", new JSONObject());
                    }
                    jSONObject2 = jSONObject.getJSONObject("QUIC");
                    jSONObject2.getClass();
                    if (!jSONObject2.has("migrate_sessions_on_network_change_v2")) {
                        jSONObject2.put("migrate_sessions_on_network_change_v2", k);
                    }
                    if (!jSONObject2.has("migrate_sessions_early_v2")) {
                        jSONObject2.put("migrate_sessions_early_v2", m);
                    }
                    if (!jSONObject2.has("retry_on_alternate_network_before_handshake")) {
                        jSONObject2.put("retry_on_alternate_network_before_handshake", n);
                    }
                    return jSONObject.toString();
                }
            } catch (JSONException e) {
                ((hkf) a.g().i("com/google/frameworks/client/data/android/cronet/ExperimentalOptionMerger", "mergeOptions", 52, "ExperimentalOptionMerger.kt")).r(e);
                return str;
            }
        }
        jSONObject = new JSONObject();
        if (!jSONObject.has("QUIC")) {
        }
        jSONObject2 = jSONObject.getJSONObject("QUIC");
        jSONObject2.getClass();
        if (!jSONObject2.has("migrate_sessions_on_network_change_v2")) {
        }
        if (!jSONObject2.has("migrate_sessions_early_v2")) {
        }
        if (!jSONObject2.has("retry_on_alternate_network_before_handshake")) {
        }
        return jSONObject.toString();
    }
}
