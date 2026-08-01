package c7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements b, c {

    /* renamed from: b, reason: collision with root package name */
    public static l f1939b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f1940c = new m(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f1941a;

    public static synchronized l b() {
        l lVar;
        synchronized (l.class) {
            try {
                if (f1939b == null) {
                    f1939b = new l();
                }
                lVar = f1939b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // c7.b
    public void a() {
        ((a7.k) this.f1941a).onConnected(null);
    }

    @Override // c7.c
    public void onConnectionFailed(z6.b bVar) {
        ((a7.l) this.f1941a).onConnectionFailed(bVar);
    }

    @Override // c7.b
    public void onConnectionSuspended(int i3) {
        ((a7.k) this.f1941a).onConnectionSuspended(i3);
    }
}
