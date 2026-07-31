package com.bykv.vk.openvk.preload.geckox.a.a;

/* compiled from: CacheConfig.java */
/* loaded from: classes13.dex */
public final class a {
    final int a;
    final c b;
    private final b c;

    /* synthetic */ a(C0098a c0098a, byte b) {
        this(c0098a);
    }

    private a(C0098a c0098a) {
        this.a = c0098a.a;
        this.c = c0098a.b;
        this.b = c0098a.c;
    }

    public final b a() {
        return this.c;
    }

    /* compiled from: CacheConfig.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0098a {
        private int a;
        private b b = b.a;
        private c c;

        public final C0098a a() {
            this.a = 20;
            return this;
        }

        public final C0098a a(b bVar) {
            if (bVar == null) {
                bVar = b.a;
            }
            this.b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }
    }
}
