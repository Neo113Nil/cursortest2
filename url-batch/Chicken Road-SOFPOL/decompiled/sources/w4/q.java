package w4;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8011a;

    /* renamed from: b, reason: collision with root package name */
    public int f8012b;

    /* renamed from: c, reason: collision with root package name */
    public int f8013c;

    /* renamed from: d, reason: collision with root package name */
    public int f8014d;

    /* renamed from: e, reason: collision with root package name */
    public int f8015e;

    /* renamed from: f, reason: collision with root package name */
    public int f8016f;

    /* renamed from: g, reason: collision with root package name */
    public int f8017g;

    /* renamed from: h, reason: collision with root package name */
    public int f8018h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public List f8019j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8020k;

    public final void a(View view) {
        if (this.f8019j.size() <= 0) {
            this.f8014d = -1;
        } else {
            ((p0) this.f8019j.get(0)).getClass();
            throw null;
        }
    }

    public final View b(j0 j0Var) {
        List list = this.f8019j;
        if (list == null) {
            View d8 = j0Var.d(this.f8014d);
            this.f8014d += this.f8015e;
            return d8;
        }
        if (list.size() <= 0) {
            return null;
        }
        ((p0) this.f8019j.get(0)).getClass();
        throw null;
    }
}
