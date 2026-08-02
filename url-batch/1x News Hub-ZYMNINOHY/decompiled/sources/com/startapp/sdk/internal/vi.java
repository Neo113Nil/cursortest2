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
    public final ib f4625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4626b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONArray f4627c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    public final String f4628d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4629e;
    public final boolean f;

    public vi(ib ibVar, String str, String str2, String str3, boolean z) {
        this.f4625a = ibVar;
        this.f4626b = str;
        this.f4628d = str2;
        this.f4629e = str3;
        this.f = z;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f4627c.length() == 0) {
            return;
        }
        if (!this.f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String b3 = b(vASTErrorCodes);
                if (TextUtils.isEmpty(b3)) {
                    return;
                }
                n8 n8Var = new n8((o8) this.f4625a.a(), this.f4626b);
                byte[] bytes = b3.getBytes();
                WeakHashMap weakHashMap = si.f4438a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                n8Var.f4194c = new q8(byteArrayOutputStream.toByteArray(), "application/json", "gzip");
                n8Var.b();
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f4627c);
        String str = this.f4628d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.f4629e;
        jSONObject.put("partnerName", str2 != null ? str2 : "");
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
