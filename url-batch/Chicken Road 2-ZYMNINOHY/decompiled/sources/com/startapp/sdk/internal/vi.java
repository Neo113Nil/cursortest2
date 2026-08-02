package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.io.ByteArrayOutputStream;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vi {

    /* renamed from: a, reason: collision with root package name */
    public final ib f7768a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7769b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONArray f7770c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    public final String f7771d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7772e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7773f;

    public vi(ib ibVar, String str, String str2, String str3, boolean z) {
        this.f7768a = ibVar;
        this.f7769b = str;
        this.f7771d = str2;
        this.f7772e = str3;
        this.f7773f = z;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f7770c.length() == 0) {
            return;
        }
        if (!this.f7773f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String b4 = b(vASTErrorCodes);
                if (TextUtils.isEmpty(b4)) {
                    return;
                }
                n8 n8Var = new n8((o8) this.f7768a.a(), this.f7769b);
                byte[] bytes = b4.getBytes();
                WeakHashMap weakHashMap = si.f7575a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                n8Var.f7327c = new q8(byteArrayOutputStream.toByteArray(), "application/json", "gzip");
                n8Var.b();
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f7770c);
        String str = this.f7771d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.f7772e;
        jSONObject.put("partnerName", str2 != null ? str2 : "");
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
