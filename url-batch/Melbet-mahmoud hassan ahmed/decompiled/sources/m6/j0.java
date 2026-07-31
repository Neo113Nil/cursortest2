package m6;

import java.util.Objects;
import y5.g;

/* loaded from: classes.dex */
public final class j0 extends y5.a implements e2<String> {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19293g = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final long f19294f;

    public static final class a implements g.c<j0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public j0(long j7) {
        super(f19293g);
        this.f19294f = j7;
    }

    public final long P() {
        return this.f19294f;
    }

    @Override // m6.e2
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void w(y5.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // m6.e2
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String h(y5.g gVar) {
        String P;
        k0 k0Var = (k0) gVar.get(k0.f19297g);
        String str = "coroutine";
        if (k0Var != null && (P = k0Var.P()) != null) {
            str = P;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int F = l6.n.F(name, " @", 0, false, 6, null);
        if (F < 0) {
            F = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + F + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, F);
        kotlin.jvm.internal.i.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(P());
        v5.q qVar = v5.q.f22838a;
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.c(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f19294f == ((j0) obj).f19294f;
    }

    public int hashCode() {
        return i0.a(this.f19294f);
    }

    public String toString() {
        return "CoroutineId(" + this.f19294f + ')';
    }
}
