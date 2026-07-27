package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f10213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10214b;

    public e(f fVar, View view) {
        this.f10214b = fVar;
        this.f10213a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f10213a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                f fVar = e.this.f10214b;
                if (i3 == 0) {
                    B0.e eVar = fVar.f10216b;
                    eVar.getClass();
                    ((H2.o) eVar.f146b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                B0.e eVar2 = fVar.f10216b;
                eVar2.getClass();
                ((H2.o) eVar2.f146b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
