package W1;

import android.util.Base64OutputStream;
import h2.C0481b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3397b;

    public /* synthetic */ c(d dVar, int i2) {
        this.f3396a = i2;
        this.f3397b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f3396a) {
            case 0:
                d dVar = this.f3397b;
                synchronized (dVar) {
                    try {
                        i iVar = (i) dVar.f3398a.get();
                        ArrayList c2 = iVar.c();
                        iVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < c2.size(); i2++) {
                            a aVar = (a) c2.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f3392a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f3393b));
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
                d dVar2 = this.f3397b;
                synchronized (dVar2) {
                    ((i) dVar2.f3398a.get()).h(System.currentTimeMillis(), ((C0481b) dVar2.f3400c.get()).a());
                }
                return null;
        }
    }
}
