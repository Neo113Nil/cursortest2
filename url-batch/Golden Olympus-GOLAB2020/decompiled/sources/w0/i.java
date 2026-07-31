package w0;

import android.content.Context;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import v0.InterfaceC3462b;
import v0.InterfaceC3464d;

/* loaded from: classes.dex */
public class i implements InterfaceC3462b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46603a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46604b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3464d f46605c;

    public i(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", b9.a.f15292f);
        this.f46603a = context;
        this.f46604b = str;
    }

    @Override // v0.InterfaceC3462b
    public String a(String str, String str2) {
        if (this.f46605c == null) {
            this.f46605c = b();
        }
        if (this.f46605c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f46605c = new h(this.f46603a, this.f46604b).b();
        }
        return this.f46605c.a(m.b(this.f46603a, this.f46604b, "agc_plugin_", str), str2);
    }

    public InterfaceC3464d b() {
        String b4 = m.b(this.f46603a, this.f46604b, "agc_plugin_", "crypto_component");
        if (b4 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(AbstractC3483a.b(b4), cc.f15721N));
            return new g(new e(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e4) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e4.getMessage());
            return null;
        }
    }
}
