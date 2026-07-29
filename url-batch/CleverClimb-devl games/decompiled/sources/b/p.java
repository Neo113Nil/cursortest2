package b;

/* compiled from: EventListener.java */
/* loaded from: classes.dex */
abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2117a = new p() { // from class: b.p.1
    };

    /* compiled from: EventListener.java */
    public interface a {
        p a(e eVar);
    }

    p() {
    }

    static a a(p pVar) {
        return new a() { // from class: b.p.2
            @Override // b.p.a
            public p a(e eVar) {
                return p.this;
            }
        };
    }
}
