package J2;

import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: e, reason: collision with root package name */
    public static j f1186e;

    /* renamed from: a, reason: collision with root package name */
    public float f1187a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final a2.i f1188b;

    /* renamed from: c, reason: collision with root package name */
    public I2.b f1189c;

    /* renamed from: d, reason: collision with root package name */
    public c f1190d;

    public j(a2.i iVar, a2.i iVar2) {
        this.f1188b = iVar2;
    }

    public static j b() {
        if (f1186e == null) {
            f1186e = new j(new a2.i(11), new a2.i(10));
        }
        return f1186e;
    }

    @Override // J2.d
    public final void a(boolean z) {
        if (z) {
            O2.b.f2033g.getClass();
            O2.b.b();
            return;
        }
        O2.b.f2033g.getClass();
        Handler handler = O2.b.f2035i;
        if (handler != null) {
            handler.removeCallbacks(O2.b.f2037k);
            O2.b.f2035i = null;
        }
    }
}
