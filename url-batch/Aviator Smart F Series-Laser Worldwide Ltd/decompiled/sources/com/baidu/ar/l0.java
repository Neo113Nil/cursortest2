package com.baidu.ar;

import java.util.HashMap;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public String f2683a = "animation_operation";

    /* renamed from: b, reason: collision with root package name */
    public a f2684b = new a();

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public String f2687c;

        /* renamed from: a, reason: collision with root package name */
        public String f2685a = "avatar";

        /* renamed from: b, reason: collision with root package name */
        public int f2686b = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f2688d = "play";

        /* renamed from: e, reason: collision with root package name */
        public int f2689e = 1;

        public int a() {
            return this.f2689e;
        }

        public String b() {
            return this.f2687c;
        }

        public String c() {
            return this.f2685a;
        }

        public String d() {
            return this.f2688d;
        }

        public int e() {
            return this.f2686b;
        }

        public void a(int i8) {
            this.f2689e = i8;
        }

        public void b(int i8) {
            this.f2686b = i8;
        }

        public void a(String str) {
            this.f2687c = str;
        }

        public void b(String str) {
            this.f2688d = str;
        }
    }

    public l0 a(int i8) {
        this.f2684b.a(i8);
        return this;
    }

    public l0 b(int i8) {
        this.f2684b.b(i8);
        return this;
    }

    public l0 a(String str) {
        this.f2684b.a(str);
        return this;
    }

    public l0 b(String str) {
        this.f2684b.b(str);
        return this;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", this.f2683a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("node", this.f2684b.c());
        hashMap2.put("repeat_count", Integer.valueOf(this.f2684b.e()));
        hashMap2.put("chip", this.f2684b.b());
        hashMap2.put("operation", this.f2684b.d());
        hashMap2.put("anim_or_emotion", Integer.valueOf(this.f2684b.a()));
        hashMap.put("event_data", hashMap2);
        return hashMap;
    }
}
