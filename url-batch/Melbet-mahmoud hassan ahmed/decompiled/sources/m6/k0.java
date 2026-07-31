package m6;

import y5.g;

/* loaded from: classes.dex */
public final class k0 extends y5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19297g = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final String f19298f;

    public static final class a implements g.c<k0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public final String P() {
        return this.f19298f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && kotlin.jvm.internal.i.a(this.f19298f, ((k0) obj).f19298f);
    }

    public int hashCode() {
        return this.f19298f.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f19298f + ')';
    }
}
