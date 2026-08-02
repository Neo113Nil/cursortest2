package androidx.fragment.app;

import android.os.Handler;
import io.flutter.embedding.android.FlutterFragmentActivity;

/* loaded from: classes.dex */
public abstract class Q extends N {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterFragmentActivity f4772a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterFragmentActivity f4773b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4774c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f4775d;

    public Q(FlutterFragmentActivity flutterFragmentActivity) {
        Handler handler = new Handler();
        this.f4772a = flutterFragmentActivity;
        this.f4773b = flutterFragmentActivity;
        this.f4774c = handler;
        this.f4775d = new g0();
    }
}
