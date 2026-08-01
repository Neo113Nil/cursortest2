package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f646b;

    public e(f fVar, View view) {
        this.f646b = fVar;
        this.f645a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f645a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                f fVar = e.this.f646b;
                if (i3 == 0) {
                    B.a aVar = fVar.f648b;
                    aVar.getClass();
                    ((C.b) aVar.f3c).f("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                B.a aVar2 = fVar.f648b;
                aVar2.getClass();
                ((C.b) aVar2.f3c).f("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
