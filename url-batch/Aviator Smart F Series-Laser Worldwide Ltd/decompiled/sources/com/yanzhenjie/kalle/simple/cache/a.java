package com.yanzhenjie.kalle.simple.cache;

/* loaded from: classes4.dex */
public interface a {
    public static final a DEFAULT = new C0347a();

    /* renamed from: com.yanzhenjie.kalle.simple.cache.a$a, reason: collision with other inner class name */
    static class C0347a implements a {
        C0347a() {
        }

        @Override // com.yanzhenjie.kalle.simple.cache.a
        public boolean clear() {
            return true;
        }

        @Override // com.yanzhenjie.kalle.simple.cache.a
        public Cache get(String str) {
            return null;
        }

        @Override // com.yanzhenjie.kalle.simple.cache.a
        public boolean remove(String str) {
            return true;
        }

        @Override // com.yanzhenjie.kalle.simple.cache.a
        public boolean replace(String str, Cache cache) {
            return true;
        }
    }

    boolean clear();

    Cache get(String str);

    boolean remove(String str);

    boolean replace(String str, Cache cache);
}
