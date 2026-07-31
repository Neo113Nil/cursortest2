package c4;

import android.app.Application;
import java.io.IOException;
import v2.a;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f1934a;

    public b0(Application application) {
        this.f1934a = application;
    }

    public final a a() {
        try {
            a.C0146a b7 = v2.a.b(this.f1934a);
            return new a(b7.a(), b7.b());
        } catch (IOException | o3.g | o3.h e7) {
            d1.a("Failed to get ad id.", e7);
            return null;
        }
    }
}
