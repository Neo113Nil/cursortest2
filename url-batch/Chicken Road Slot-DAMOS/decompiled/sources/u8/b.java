package u8;

import android.util.Base64OutputStream;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9685e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f9684d = i3;
        this.f9685e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f9684d) {
            case 0:
                c cVar = (c) this.f9685e;
                synchronized (cVar) {
                    try {
                        g gVar = (g) cVar.f9686a.get();
                        ArrayList a9 = gVar.a();
                        synchronized (gVar) {
                            gVar.f9699a.a(new q4.f(gVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < a9.size(); i3++) {
                            a aVar = (a) a9.get(i3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f9682a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f9683b));
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
            case 1:
                c cVar2 = (c) this.f9685e;
                synchronized (cVar2) {
                    g gVar2 = (g) cVar2.f9686a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a10 = ((d9.b) cVar2.f9688c.get()).a();
                    synchronized (gVar2) {
                        String b10 = g.b(currentTimeMillis);
                        a10.getClass();
                        gVar2.f9699a.a(new a1.g(gVar2, b10, a10, new b4.c(a10)));
                    }
                }
                return null;
            default:
                WorkDatabase workDatabase = ((d6.f) this.f9685e).f3635a;
                Long j = workDatabase.x().j("next_alarm_manager_id");
                int longValue = j != null ? (int) j.longValue() : 0;
                workDatabase.x().l(new c6.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
        }
    }
}
