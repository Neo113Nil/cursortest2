package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jko implements Comparable {
    public final int a;
    public final jmr b;

    public jko(int i, jmr jmrVar) {
        this.a = i;
        this.b = jmrVar;
    }

    public static final void b(Object obj, Object obj2) {
        ((jkj) obj).w((jkp) obj2);
    }

    public final jms a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((jko) obj).a;
    }
}
