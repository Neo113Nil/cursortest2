package t;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6738b;

    /* renamed from: c, reason: collision with root package name */
    public long f6739c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f6740d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f6741e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f6742f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f6743g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f6744h;
    public EdgeEffect i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f6745j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f6746k;

    public a0(Context context, int i) {
        this.f6737a = context;
        this.f6738b = i;
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
        return !((Build.VERSION.SDK_INT >= 31 ? m.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(u.j0 j0Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f6737a;
        EdgeEffect a8 = i >= 31 ? m.a(context) : new e0(context);
        a8.setColor(this.f6738b);
        if (!r2.k.a(this.f6739c, 0L)) {
            if (j0Var == u.j0.f7027d) {
                long j7 = this.f6739c;
                a8.setSize((int) (j7 >> 32), (int) (j7 & 4294967295L));
                return a8;
            }
            long j8 = this.f6739c;
            a8.setSize((int) (j8 & 4294967295L), (int) (j8 >> 32));
        }
        return a8;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f6741e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a8 = a(u.j0.f7027d);
        this.f6741e = a8;
        return a8;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f6742f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a8 = a(u.j0.f7028e);
        this.f6742f = a8;
        return a8;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f6743g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a8 = a(u.j0.f7028e);
        this.f6743g = a8;
        return a8;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f6740d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a8 = a(u.j0.f7027d);
        this.f6740d = a8;
        return a8;
    }
}
