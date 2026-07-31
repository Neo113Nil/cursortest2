package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements v1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7609d;

    public static final int a(int i, long j7) {
        int i8 = v1.f7798b;
        return ((int) (j7 >> (i * 15))) & 32767;
    }

    public int b() {
        switch (this.f7609d) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    @Override // v1.f
    public Object d(v1.g gVar) {
        return gVar.f7456a.b();
    }
}
