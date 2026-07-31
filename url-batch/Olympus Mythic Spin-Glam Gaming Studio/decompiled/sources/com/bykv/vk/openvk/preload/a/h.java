package com.bykv.vk.openvk.preload.a;

/* compiled from: Pipe.java */
/* loaded from: classes4.dex */
public final class h {
    Class<? extends d> a;
    private com.bykv.vk.openvk.preload.a.b.a b;
    private Object[] c;

    /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }

    private h(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.b;
    }

    final Object[] b() {
        return this.c;
    }

    /* compiled from: Pipe.java */
    public static final class a {
        private Class<? extends d> a;
        private com.bykv.vk.openvk.preload.a.b.a b;
        private Object[] c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final a a(Class<? extends d> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("interceptor class == null");
            }
            this.a = cls;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.c = objArr;
            return this;
        }

        public final h b() {
            return new h(this, (byte) 0);
        }
    }
}
