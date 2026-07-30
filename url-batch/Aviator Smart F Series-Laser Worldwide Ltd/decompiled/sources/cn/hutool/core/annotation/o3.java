package cn.hutool.core.annotation;

import cn.hutool.core.annotation.i2;

/* loaded from: classes.dex */
public interface o3 {
    public static final o3 NEAREST_AND_OLDEST_PRIORITY = new d();
    public static final o3 NEAREST_AND_NEWEST_PRIORITY = new c();
    public static final o3 FARTHEST_AND_OLDEST_PRIORITY = new b();
    public static final o3 FARTHEST_AND_NEWEST_PRIORITY = new a();

    public static class a implements o3 {
        @Override // cn.hutool.core.annotation.o3
        public <T extends r2> T choose(T t7, T t8) {
            return (T) i2.a.FARTHEST_AND_NEWEST_PRIORITY.choose(t7, t8);
        }
    }

    public static class b implements o3 {
        @Override // cn.hutool.core.annotation.o3
        public <T extends r2> T choose(T t7, T t8) {
            return (T) i2.a.FARTHEST_AND_OLDEST_PRIORITY.choose(t7, t8);
        }
    }

    public static class c implements o3 {
        @Override // cn.hutool.core.annotation.o3
        public <T extends r2> T choose(T t7, T t8) {
            return (T) i2.a.NEAREST_AND_NEWEST_PRIORITY.choose(t7, t8);
        }
    }

    public static class d implements o3 {
        @Override // cn.hutool.core.annotation.o3
        public <T extends r2> T choose(T t7, T t8) {
            return (T) i2.a.NEAREST_AND_OLDEST_PRIORITY.choose(t7, t8);
        }
    }

    <T extends r2> T choose(T t7, T t8);
}
