package n1;

import U1.C0080a;
import android.os.Handler;
import m1.C1114b;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: e, reason: collision with root package name */
    public static j f10161e;

    /* renamed from: a, reason: collision with root package name */
    public float f10162a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final C0080a f10163b;

    /* renamed from: c, reason: collision with root package name */
    public C1114b f10164c;

    /* renamed from: d, reason: collision with root package name */
    public c f10165d;

    public j(m1.c cVar, C0080a c0080a) {
        this.f10163b = c0080a;
    }

    public static j b() {
        if (f10161e == null) {
            f10161e = new j(new m1.c(), new C0080a(29));
        }
        return f10161e;
    }

    @Override // n1.d
    public final void a(boolean z) {
        if (z) {
            s1.b.f10295g.getClass();
            s1.b.b();
            return;
        }
        s1.b.f10295g.getClass();
        Handler handler = s1.b.f10297i;
        if (handler != null) {
            handler.removeCallbacks(s1.b.f10299k);
            s1.b.f10297i = null;
        }
    }
}
