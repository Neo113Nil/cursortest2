package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4913ua;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import org.json.JSONArray;

/* compiled from: CrashCallbackWrapper.java */
/* loaded from: classes6.dex */
public final class b implements ICrashCallback, IOOMCallback {
    private IOOMCallback a;
    private ICrashCallback b;
    private String c;

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
    }

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j, JSONArray jSONArray) {
        if (this.a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), POBCTAOverlayData.KEY_CTA_HEADER, C4913ua.b), this.c)) {
                this.a.onCrash(crashType, th, thread, j);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), POBCTAOverlayData.KEY_CTA_HEADER, C4913ua.b), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d a;
        if (this.b == null || (a = d.a(this.c)) == null || !a.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }
}
