package I0;

import J0.d;
import K0.c;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f772a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static d f773b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f774c = new Object();

    public static d a(Context context) {
        synchronized (f774c) {
            try {
                d dVar = f773b;
                if (dVar != null) {
                    return dVar;
                }
                String a4 = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                ArrayList arrayList = null;
                if (TextUtils.isEmpty(a4)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a4).getJSONObject("grs_server");
                    JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            arrayList.add(jSONArray.get(i4).toString());
                        }
                    }
                    d dVar2 = new d();
                    f773b = dVar2;
                    dVar2.d(arrayList);
                    f773b.c(jSONObject.getString("grs_query_endpoint_2.0"));
                    f773b.b(jSONObject.getInt("grs_query_timeout"));
                } catch (JSONException e4) {
                    Logger.w(f772a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
                }
                return f773b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
