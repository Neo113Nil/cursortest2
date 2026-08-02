package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjt implements Comparable {
    public final jxx a;
    final double b;

    public kjt(jxx jxxVar, double d) {
        this.a = jxxVar;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.b, ((kjt) obj).b);
    }
}
