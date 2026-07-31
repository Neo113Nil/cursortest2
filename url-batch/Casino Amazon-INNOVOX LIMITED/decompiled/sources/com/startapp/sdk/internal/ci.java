package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.io.ByteArrayOutputStream;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    public final pa f205a;
    public final String b;
    public final JSONArray c = new JSONArray();
    public final String d;
    public final String e;
    public final boolean f;

    public ci(pa paVar, String str, String str2, String str3, boolean z) {
        this.f205a = paVar;
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.c.length() == 0) {
            return;
        }
        if (!this.f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String b = b(vASTErrorCodes);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                z7 z7Var = (z7) this.f205a.a();
                y7 y7Var = new y7(z7Var, this.b);
                byte[] bytes = b.getBytes();
                WeakHashMap weakHashMap = zh.f528a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                y7Var.c = new b8(byteArrayOutputStream.toByteArray(), "application/json", "gzip");
                try {
                    z7Var.b(y7Var);
                } catch (Throwable th) {
                    if (z7Var.b(4)) {
                        n8.a(th);
                    }
                }
            } catch (Throwable th2) {
                n8.a(th2);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.c);
        String str = this.d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.e;
        jSONObject.put("partnerName", str2 != null ? str2 : "");
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
