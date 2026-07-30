package defpackage;

import android.util.Base64OutputStream;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ dq e;

    public /* synthetic */ cq(dq dqVar, int i) {
        this.d = i;
        this.e = dqVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                dq dqVar = this.e;
                synchronized (dqVar) {
                    try {
                        d60 d60Var = (d60) dqVar.a.get();
                        ArrayList a = d60Var.a();
                        synchronized (d60Var) {
                            d60Var.a.a(new l(4, d60Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < a.size(); i++) {
                            mb mbVar = (mb) a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", mbVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) mbVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                dq dqVar2 = this.e;
                synchronized (dqVar2) {
                    d60 d60Var2 = (d60) dqVar2.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = ((sq) dqVar2.c.get()).a();
                    synchronized (d60Var2) {
                        String b = d60Var2.b(currentTimeMillis);
                        a2.getClass();
                        d60Var2.a.a(new j7(d60Var2, b, a2, new hy0(a2), 2));
                    }
                }
                return null;
        }
    }
}
