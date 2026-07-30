package cn.hutool.core.annotation;

import java.util.Comparator;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface i2 extends Comparable {
    public static final Comparator<i2> DEFAULT_HIERARCHICAL_COMPARATOR;

    public interface a {
        public static final a NEAREST_AND_OLDEST_PRIORITY = new d();
        public static final a NEAREST_AND_NEWEST_PRIORITY = new c();
        public static final a FARTHEST_AND_OLDEST_PRIORITY = new b();
        public static final a FARTHEST_AND_NEWEST_PRIORITY = new C0007a();

        /* renamed from: cn.hutool.core.annotation.i2$a$a, reason: collision with other inner class name */
        public static class C0007a implements a {
            @Override // cn.hutool.core.annotation.i2.a
            public <T extends i2> T choose(T t7, T t8) {
                return t8.getVerticalDistance() >= t7.getVerticalDistance() ? t8 : t7;
            }
        }

        public static class b implements a {
            @Override // cn.hutool.core.annotation.i2.a
            public <T extends i2> T choose(T t7, T t8) {
                return t8.getVerticalDistance() > t7.getVerticalDistance() ? t8 : t7;
            }
        }

        public static class c implements a {
            @Override // cn.hutool.core.annotation.i2.a
            public <T extends i2> T choose(T t7, T t8) {
                return t8.getVerticalDistance() <= t7.getVerticalDistance() ? t8 : t7;
            }
        }

        public static class d implements a {
            @Override // cn.hutool.core.annotation.i2.a
            public <T extends i2> T choose(T t7, T t8) {
                return t8.getVerticalDistance() < t7.getVerticalDistance() ? t8 : t7;
            }
        }

        <T extends i2> T choose(T t7, T t8);
    }

    static {
        Comparator comparing;
        Comparator<i2> thenComparing;
        comparing = Comparator.comparing(new Function() { // from class: cn.hutool.core.annotation.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((i2) obj).getVerticalDistance());
            }
        });
        thenComparing = comparing.thenComparing(new Function() { // from class: cn.hutool.core.annotation.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((i2) obj).getHorizontalDistance());
            }
        });
        DEFAULT_HIERARCHICAL_COMPARATOR = thenComparing;
    }

    int compareTo(i2 i2Var);

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ int compareTo(Object obj);

    int getHorizontalDistance();

    Object getRoot();

    int getVerticalDistance();
}
