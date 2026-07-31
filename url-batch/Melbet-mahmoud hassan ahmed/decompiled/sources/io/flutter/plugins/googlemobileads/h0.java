package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import java.util.Locale;

/* loaded from: classes.dex */
final class h0 extends io.flutter.plugin.platform.e {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17504b;

    class a implements io.flutter.plugin.platform.d {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f17505f;

        a(Context context) {
            this.f17505f = context;
        }

        @Override // io.flutter.plugin.platform.d
        public void d() {
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void e() {
            io.flutter.plugin.platform.c.d(this);
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void f(View view) {
            io.flutter.plugin.platform.c.a(this, view);
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void g() {
            io.flutter.plugin.platform.c.b(this);
        }

        @Override // io.flutter.plugin.platform.d
        public View getView() {
            return new View(this.f17505f);
        }

        @Override // io.flutter.plugin.platform.d
        public /* synthetic */ void h() {
            io.flutter.plugin.platform.c.c(this);
        }
    }

    public h0(io.flutter.plugins.googlemobileads.a aVar) {
        super(m5.q.f19259a);
        this.f17504b = aVar;
    }

    private static io.flutter.plugin.platform.d c(Context context, int i7) {
        z4.b.b(h0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", Integer.valueOf(i7)));
        return new a(context);
    }

    @Override // io.flutter.plugin.platform.e
    public io.flutter.plugin.platform.d a(Context context, int i7, Object obj) {
        Integer num = (Integer) obj;
        e b7 = this.f17504b.b(num.intValue());
        return (b7 == null || b7.c() == null) ? c(context, num.intValue()) : b7.c();
    }
}
