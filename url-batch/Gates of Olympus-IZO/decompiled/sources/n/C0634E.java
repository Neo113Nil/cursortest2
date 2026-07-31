package n;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634E {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5990a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5991b;

    /* renamed from: c, reason: collision with root package name */
    public long f5992c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f5993d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f5994e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f5995f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f5996g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f5997h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f5998i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f5999j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f6000k;

    public C0634E(Context context, int i3) {
        this.f5990a = context;
        this.f5991b = i3;
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
        return !((Build.VERSION.SDK_INT >= 31 ? C0659n.f6128a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.f5990a;
        EdgeEffect a3 = i3 >= 31 ? C0659n.f6128a.a(context, null) : new C0643N(context);
        a3.setColor(this.f5991b);
        if (!M0.i.a(this.f5992c, 0L)) {
            long j3 = this.f5992c;
            a3.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
        return a3;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f5994e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f5994e = a3;
        return a3;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f5995f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f5995f = a3;
        return a3;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f5996g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f5996g = a3;
        return a3;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f5993d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a3 = a();
        this.f5993d = a3;
        return a3;
    }
}
