package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jax {
    public static String a(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new IllegalArgumentException(a.Y(i, "Unknown state "));
        }
    }

    public static Object b(lit litVar, Class cls) {
        try {
            return litVar.a();
        } catch (Exception e) {
            if (aah$$ExternalSyntheticApiModelOutline2.m$4(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (aah$$ExternalSyntheticApiModelOutline2.m37m((Object) e)) {
                throw c(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static CronetException c(Exception exc) {
        if (aah$$ExternalSyntheticApiModelOutline2.m37m((Object) exc)) {
            return aah$$ExternalSyntheticApiModelOutline2.m$1(exc) ? new lid(aah$$ExternalSyntheticApiModelOutline2.m28m((Object) exc)) : aah$$ExternalSyntheticApiModelOutline2.m$2(exc) ? new lic(aah$$ExternalSyntheticApiModelOutline2.m27m((Object) exc), false) : aah$$ExternalSyntheticApiModelOutline2.m$3(exc) ? new lhx(aah$$ExternalSyntheticApiModelOutline2.m((Object) exc)) : new lib(aah$$ExternalSyntheticApiModelOutline2.m26m((Object) exc));
        }
        throw new IllegalArgumentException("Not an Android Cronet exception", exc);
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "BYTES" : "STRING" : "FLOAT" : "INT" : "BOOL";
    }

    public static UploadDataProvider e(byte[] bArr, int i, int i2) {
        return new lhm(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static JSONObject f(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(a.Z(str, "Failed adding a default object for key [", "]"), e);
        }
    }

    public static bst g(Context context) {
        boolean z = false;
        try {
            Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, ljb.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        return lht.a(context, true, ljb.a(context).getBoolean("android.net.http.EnableTelemetry", !z));
    }
}
