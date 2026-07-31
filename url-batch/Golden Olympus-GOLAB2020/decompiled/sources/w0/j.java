package w0;

import android.util.Log;
import com.ironsource.b9;
import com.ironsource.ge;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.InterfaceC3463c;

/* loaded from: classes.dex */
public class j implements InterfaceC3463c {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f46606a;

    j(InputStream inputStream, String str) {
        this.f46606a = a(inputStream);
        b(str);
    }

    private JSONObject a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(b.g(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private void b(String str) {
        try {
            JSONObject d4 = d(str);
            if (d4 == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal(ge.f16461h0)) == 0) {
                this.f46606a.getJSONObject("client").put("app_id", d4.getString("app_id"));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> keys = d4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!b9.h.f15462V.equals(next)) {
                        c(next, d4.get(next), this.f46606a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    private void c(String str, Object obj, JSONObject jSONObject) {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    private JSONObject d(String str) {
        JSONArray jSONArray = this.f46606a.getJSONArray("appInfos");
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            if (jSONObject.getString(b9.h.f15462V).equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // v0.InterfaceC3463c
    public String getString(String str, String str2) {
        if (!str.endsWith("/")) {
            String[] split = str.split("/");
            try {
                JSONObject jSONObject = this.f46606a;
                for (int i4 = 1; i4 < split.length; i4++) {
                    if (i4 == split.length - 1) {
                        str = jSONObject.get(split[i4]).toString();
                        return str;
                    }
                    jSONObject = jSONObject.getJSONObject(split[i4]);
                }
            } catch (JSONException unused) {
                Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
            }
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f46606a.toString().hashCode() + '}';
    }
}
