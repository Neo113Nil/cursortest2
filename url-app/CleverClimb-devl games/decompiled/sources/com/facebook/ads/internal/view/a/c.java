package com.facebook.ads.internal.view.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5501a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5503c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5504d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5505a;

        /* renamed from: b, reason: collision with root package name */
        private long f5506b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f5507c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f5508d = -1;
        private long e = -1;
        private long f = -1;
        private long g = -1;
        private long h = -1;

        public a(String str) {
            this.f5505a = str;
        }

        public a a(long j) {
            this.f5506b = j;
            return this;
        }

        public c a() {
            return new c(this.f5505a, this.f5506b, this.f5507c, this.f5508d, this.e, this.f, this.g, this.h);
        }

        public a b(long j) {
            this.f5507c = j;
            return this;
        }

        public a c(long j) {
            this.f5508d = j;
            return this;
        }

        public a d(long j) {
            this.e = j;
            return this;
        }

        public a e(long j) {
            this.f = j;
            return this;
        }

        public a f(long j) {
            this.g = j;
            return this;
        }

        public a g(long j) {
            this.h = j;
            return this;
        }
    }

    private c(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f5501a = str;
        this.f5502b = j;
        this.f5503c = j2;
        this.f5504d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("initial_url", this.f5501a);
        hashMap.put("handler_time_ms", String.valueOf(this.f5502b));
        hashMap.put("load_start_ms", String.valueOf(this.f5503c));
        hashMap.put("response_end_ms", String.valueOf(this.f5504d));
        hashMap.put("dom_content_loaded_ms", String.valueOf(this.e));
        hashMap.put("scroll_ready_ms", String.valueOf(this.f));
        hashMap.put("load_finish_ms", String.valueOf(this.g));
        hashMap.put("session_finish_ms", String.valueOf(this.h));
        return hashMap;
    }
}
