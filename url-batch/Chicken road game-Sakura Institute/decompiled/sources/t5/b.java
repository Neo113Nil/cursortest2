package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: j, reason: collision with root package name */
    public final int f8885j;

    public b(String str, int i7) {
        super(str);
        this.f8885j = i7;
    }

    @Override // t5.c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((c) obj);
    }

    @Override // t5.c
    public final int g() {
        return this.f8885j;
    }

    @Override // t5.c
    public final String toString() {
        return a0.m.m(new StringBuilder("IntegerChildName(\""), this.f8889f, "\")");
    }
}
