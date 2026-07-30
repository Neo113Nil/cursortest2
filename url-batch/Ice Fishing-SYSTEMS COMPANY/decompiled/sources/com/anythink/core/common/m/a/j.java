package com.anythink.core.common.m.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public i f14629a;

    /* renamed from: b, reason: collision with root package name */
    public int f14630b;

    /* renamed from: c, reason: collision with root package name */
    public String f14631c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f14632d;

    /* renamed from: e, reason: collision with root package name */
    public k f14633e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, List<String>> f14634f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i f14635a;

        /* renamed from: b, reason: collision with root package name */
        private int f14636b;

        /* renamed from: c, reason: collision with root package name */
        private String f14637c;

        /* renamed from: d, reason: collision with root package name */
        private Throwable f14638d;

        /* renamed from: e, reason: collision with root package name */
        private k f14639e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, List<String>> f14640f;

        public final a a(i iVar) {
            this.f14635a = iVar;
            return this;
        }

        public final a a(int i) {
            this.f14636b = i;
            return this;
        }

        public final a a(String str) {
            this.f14637c = str;
            return this;
        }

        public final a a(Throwable th) {
            this.f14638d = th;
            return this;
        }

        public final a a(k kVar) {
            this.f14639e = kVar;
            return this;
        }

        public final a a(Map<String, List<String>> map) {
            this.f14640f = map;
            return this;
        }

        public final j a() {
            j jVar = new j((byte) 0);
            jVar.f14629a = this.f14635a;
            jVar.f14630b = this.f14636b;
            jVar.f14631c = this.f14637c;
            jVar.f14632d = this.f14638d;
            jVar.f14633e = this.f14639e;
            jVar.f14634f = this.f14640f;
            return jVar;
        }
    }

    public /* synthetic */ j(byte b9) {
        this();
    }

    private boolean a() {
        int i = this.f14630b;
        return i == 200 || i == 201 || i == 204;
    }

    public final String toString() {
        return "NetBridgeResponse{request=" + this.f14629a + ", code=" + this.f14630b + ", errorMsg='" + this.f14631c + "', exception=" + this.f14632d + ", responseBody=" + this.f14633e + ", responseHeader=" + this.f14634f + '}';
    }

    private j() {
    }
}
