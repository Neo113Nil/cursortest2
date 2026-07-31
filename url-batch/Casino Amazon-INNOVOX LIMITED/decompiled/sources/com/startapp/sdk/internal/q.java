package com.startapp.sdk.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f384a;
    public final pa b;

    public q(Context context, pa paVar, a5 a5Var) {
        this.f384a = context;
        this.b = paVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2) {
        boolean z;
        Object systemService;
        AdDebuggerMetadata c = MetaData.A().c();
        if (c != null && c.b()) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "adDebugInfo";
            n8Var.e = str;
            n8Var.g = str2;
            n8Var.a();
        }
        if (str == null && str2 == null) {
            Toast.makeText(this.f384a, "Ad debug info not available", 0).show();
            return;
        }
        StringBuilder sb = new StringBuilder("Ad debug info");
        String str3 = "\n";
        sb.append("\n");
        if (str != null) {
            sb.append("url: ").append(str);
        } else {
            str3 = "";
        }
        if (str2 != null) {
            sb.append(str3).append("d: ").append(str2);
        }
        try {
            systemService = this.f384a.getSystemService("clipboard");
        } catch (Throwable unused) {
        }
        try {
            if (systemService instanceof ClipboardManager) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ad debug info", sb));
                z = true;
                Toast.makeText(this.f384a, "Ad debug info".concat(!z ? " copied to clipboard" : " printed to logcat"), 0).show();
                return;
            }
            Toast.makeText(this.f384a, "Ad debug info".concat(!z ? " copied to clipboard" : " printed to logcat"), 0).show();
            return;
        } catch (Throwable unused2) {
            return;
        }
        z = false;
    }
}
