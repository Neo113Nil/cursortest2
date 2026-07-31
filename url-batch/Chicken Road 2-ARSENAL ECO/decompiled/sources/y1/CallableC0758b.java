package y1;

import android.util.Base64OutputStream;
import androidx.work.impl.WorkDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import u0.C0674d;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0758b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6228b;

    public /* synthetic */ CallableC0758b(int i7, Object obj) {
        this.f6227a = i7;
        this.f6228b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f6227a) {
            case 0:
                C0759c c0759c = (C0759c) this.f6228b;
                synchronized (c0759c) {
                    try {
                        h hVar = (h) c0759c.f6229a.get();
                        ArrayList c7 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i7 = 0; i7 < c7.size(); i7++) {
                            C0757a c0757a = (C0757a) c7.get(i7);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c0757a.f6225a);
                            jSONObject.put("dates", new JSONArray((Collection) c0757a.f6226b));
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
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                C0759c c0759c2 = (C0759c) this.f6228b;
                synchronized (c0759c2) {
                    ((h) c0759c2.f6229a.get()).h(System.currentTimeMillis(), ((J1.b) c0759c2.f6231c.get()).a());
                }
                return null;
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((V5.g) this.f6228b).f2734g;
                Long e4 = workDatabase.l().e("next_alarm_manager_id");
                int longValue = e4 != null ? (int) e4.longValue() : 0;
                workDatabase.l().f(new C0674d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
        }
    }
}
