package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ey1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4806a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f4807b;

    /* renamed from: e, reason: collision with root package name */
    private String f4810e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f4808c = ((Integer) sw.c().b(m10.N6)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f4809d = ((Integer) sw.c().b(m10.O6)).intValue();

    public ey1(Context context) {
        this.f4806a = context;
        this.f4807b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", w3.c.a(this.f4806a).d(this.f4807b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f4807b.packageName);
        y2.t.q();
        jSONObject.put("adMobAppId", a3.g2.d0(this.f4806a));
        if (this.f4810e.isEmpty()) {
            try {
                drawable = w3.c.a(this.f4806a).e(this.f4807b.packageName).f20161b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f4808c, this.f4809d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f4808c, this.f4809d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f4810e = encodeToString;
        }
        if (!this.f4810e.isEmpty()) {
            jSONObject.put("icon", this.f4810e);
            jSONObject.put("iconWidthPx", this.f4808c);
            jSONObject.put("iconHeightPx", this.f4809d);
        }
        return jSONObject;
    }
}
