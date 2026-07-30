package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.internal.ads.C4236yh;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.consent_sdk.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4369p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35893n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4236yh f35894u;

    public /* synthetic */ RunnableC4369p(C4236yh c4236yh, int i) {
        this.f35893n = i;
        this.f35894u = c4236yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35893n) {
            case 0:
                C4236yh c4236yh = this.f35894u;
                c4236yh.getClass();
                ((B) c4236yh.f35380w).execute(new RunnableC4369p(c4236yh, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                C4236yh c4236yh2 = this.f35894u;
                Application application = (Application) c4236yh2.f35377n;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String str = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", str);
                    JSONObject jSONObject2 = new JSONObject();
                    C4333g c4333g = (C4333g) c4236yh2.f35376A;
                    for (String str2 : c4333g.a().keySet()) {
                        jSONObject2.put(str2, c4333g.a().get(str2));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((C4349k) c4236yh2.f35383z).f35865h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
