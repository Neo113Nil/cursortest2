package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.VideoConfig;
import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class oi {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f369a;
    public final pi b;
    public final int c;
    public final long d;

    public oi(VideoConfig videoConfig, JSONArray jSONArray, pi piVar) {
        this.f369a = jSONArray;
        this.b = piVar;
        this.c = Math.min(Math.max(1, videoConfig.s()), 100);
        this.d = Math.min(Math.max(3600000L, zh.e(videoConfig.r())), 2592000000L);
    }

    public final void a() {
        String jSONArray;
        synchronized (this.f369a) {
            this.f369a.put(System.currentTimeMillis());
            while (true) {
                int length = this.f369a.length();
                int i = this.c;
                JSONArray jSONArray2 = this.f369a;
                if (length > i) {
                    jSONArray2.remove(0);
                } else {
                    jSONArray = jSONArray2.toString();
                }
            }
        }
        this.b.a(jSONArray);
    }
}
