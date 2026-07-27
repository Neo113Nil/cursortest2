package m;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8006b;

    /* renamed from: c, reason: collision with root package name */
    public long f8007c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f8008d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f8009e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f8010f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f8011g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f8012h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f8013i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f8014j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f8015k;

    public E(Context context, int i2) {
        this.f8005a = context;
        this.f8006b = i2;
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
        return !((Build.VERSION.SDK_INT >= 31 ? C0841n.f8146a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.f8005a;
        EdgeEffect a4 = i2 >= 31 ? C0841n.f8146a.a(context, null) : new N(context);
        a4.setColor(this.f8006b);
        if (!M0.j.a(this.f8007c, 0L)) {
            long j4 = this.f8007c;
            a4.setSize((int) (j4 >> 32), (int) (j4 & 4294967295L));
        }
        return a4;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f8009e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a4 = a();
        this.f8009e = a4;
        return a4;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f8010f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a4 = a();
        this.f8010f = a4;
        return a4;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f8011g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a4 = a();
        this.f8011g = a4;
        return a4;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f8008d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a4 = a();
        this.f8008d = a4;
        return a4;
    }
}
