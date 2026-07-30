package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final String f13666a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, List<a>> f13667b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f13668c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f13669a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13670b;

        public a(String str, int i) {
            this.f13669a = str;
            this.f13670b = i;
        }

        public final String a() {
            return this.f13669a;
        }

        public final int b() {
            return this.f13670b;
        }
    }

    public am(String str) {
        this.f13666a = str;
    }

    private String c() {
        return this.f13666a;
    }

    public final Map<String, List<a>> a() {
        return this.f13667b;
    }

    public final Map<String, Integer> b() {
        return this.f13668c;
    }

    public final void a(Map<String, List<a>> map) {
        this.f13667b = map;
    }

    public final void b(Map<String, Integer> map) {
        this.f13668c = map;
    }
}
