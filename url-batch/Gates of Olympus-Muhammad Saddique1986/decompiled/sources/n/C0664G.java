package n;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664G {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7036b;

    /* renamed from: c, reason: collision with root package name */
    public long f7037c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f7038d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f7039e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f7040f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f7041g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f7042h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f7043i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f7044j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f7045k;

    public C0664G(Context context, int i3) {
        this.f7035a = context;
        this.f7036b = i3;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C0688n.f7172a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.f7035a;
        EdgeEffect a3 = i3 >= 31 ? C0688n.f7172a.a(context, null) : new C0673P(context);
        a3.setColor(this.f7036b);
        if (!O0.j.a(this.f7037c, 0L)) {
            long j3 = this.f7037c;
            a3.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
        return a3;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f7039e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f7039e = a3;
        return a3;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f7040f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f7040f = a3;
        return a3;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f7041g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f7041g = a3;
        return a3;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f7038d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f7038d = a3;
        return a3;
    }
}
