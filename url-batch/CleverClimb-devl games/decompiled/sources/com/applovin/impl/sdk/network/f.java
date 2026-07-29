package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.network.b;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f<T> extends b {

    public static class a<T> extends b.a<T> {
        public a(j jVar) {
            super(jVar);
            this.g = false;
            this.h = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.dB)).intValue();
            this.i = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.dA)).intValue();
            this.j = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.dG)).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.b.a
        public /* synthetic */ b.a a(Object obj) {
            return b((a<T>) obj);
        }

        @Override // com.applovin.impl.sdk.network.b.a
        public /* synthetic */ b.a a(Map map) {
            return b((Map<String, String>) map);
        }

        public a b(T t) {
            this.f = t;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f3335d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.e = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f<T> a() {
            return new f<>(this);
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f3333b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f3332a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            this.j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f3334c = str;
            return this;
        }
    }

    protected f(a aVar) {
        super(aVar);
    }

    public static a b(j jVar) {
        return new a(jVar);
    }
}
