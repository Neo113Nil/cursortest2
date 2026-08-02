package Y1;

import android.content.Context;
import android.view.View;

/* renamed from: Y1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124v extends io.flutter.plugin.platform.h {

    /* renamed from: a, reason: collision with root package name */
    public final C0107d f1893a;

    public C0124v(C0107d c0107d) {
        super(P1.t.INSTANCE);
        this.f1893a = c0107d;
    }

    @Override // io.flutter.plugin.platform.h
    public final io.flutter.plugin.platform.g create(Context context, int i3, Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object e3 = this.f1893a.e(r3.intValue());
        if (e3 instanceof io.flutter.plugin.platform.g) {
            return (io.flutter.plugin.platform.g) e3;
        }
        if (e3 instanceof View) {
            return new C0123u((View) e3);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + e3);
    }
}
