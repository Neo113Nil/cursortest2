package m;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6272b;

    /* renamed from: c, reason: collision with root package name */
    public long f6273c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f6274d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f6275e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f6276f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f6277g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f6278h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f6279i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f6280j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f6281k;

    public w(Context context, int i7) {
        this.f6271a = context;
        this.f6272b = i7;
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
        return !((Build.VERSION.SDK_INT >= 31 ? g.f6157a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f6271a;
        EdgeEffect a3 = i7 >= 31 ? g.f6157a.a(context, null) : new d0(context);
        a3.setColor(this.f6272b);
        if (!m2.j.a(this.f6273c, 0L)) {
            long j8 = this.f6273c;
            a3.setSize((int) (j8 >> 32), (int) (j8 & 4294967295L));
        }
        return a3;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f6275e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f6275e = a3;
        return a3;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f6276f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f6276f = a3;
        return a3;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f6277g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f6277g = a3;
        return a3;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f6274d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f6274d = a3;
        return a3;
    }
}
