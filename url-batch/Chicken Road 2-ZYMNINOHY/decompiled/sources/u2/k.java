package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final g f15511a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f15512b;

    static {
        g gVar = new g();
        f15511a = gVar;
        f15512b = new k[]{gVar, new k() { // from class: u2.h
            @Override // u2.e
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new k() { // from class: u2.i
            @Override // u2.e
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new k() { // from class: u2.j
            @Override // u2.e
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f15512b.clone();
    }
}
