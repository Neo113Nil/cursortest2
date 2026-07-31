package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class i31<K0, V0> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<V> implements i32<List<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final int f27080b;

        a(int i4) {
            this.f27080b = cq.a(i4, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.i32
        public final Object get() {
            return new ArrayList(this.f27080b);
        }
    }

    public static abstract class b<K0, V0> extends i31<K0, V0> {
        b() {
            super();
        }

        public abstract <K extends K0, V extends V0> hr0<K, V> b();
    }

    public static abstract class c<K0> {
        c() {
        }

        public final b<K0, Object> a() {
            cq.a(2, "expectedValuesPerKey");
            return new j31(this);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    public static c<Comparable> a() {
        ec1 ec1Var = ec1.f25235b;
        ec1Var.getClass();
        return new h31(ec1Var);
    }

    private i31() {
    }
}
