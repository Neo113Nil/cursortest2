package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CrashUploadHandler.java */
/* loaded from: classes15.dex */
public abstract class c {
    private static ConcurrentLinkedQueue<c> a = new ConcurrentLinkedQueue<>();

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!a.isEmpty()) {
            a.poll();
        }
        a = null;
    }

    /* compiled from: CrashUploadHandler.java */
    public static class a {
        private JSONObject a;
        private JSONObject b;
        private CrashType c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.a = jSONObject;
            }
            this.b = jSONObject.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
        }

        @Nullable
        public final String a() {
            return this.a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i = AnonymousClass1.a[this.c.ordinal()];
            if (i == 1) {
                return this.a.optString("data", null);
            }
            if (i == 2) {
                return this.a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.a.optString("data", null);
        }
    }

    /* compiled from: CrashUploadHandler.java */
    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CrashType.values().length];
            a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
