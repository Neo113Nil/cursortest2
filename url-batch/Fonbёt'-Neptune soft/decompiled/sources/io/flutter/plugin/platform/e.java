package io.flutter.plugin.platform;

import I.C0079n;
import P.O;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2628b;

    public e(f fVar, View view) {
        this.f2628b = fVar;
        this.f2627a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f2627a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                f fVar = e.this.f2628b;
                if (i3 == 0) {
                    O o2 = fVar.f2630b;
                    o2.getClass();
                    ((C0079n) o2.f875f).f("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    O o3 = fVar.f2630b;
                    o3.getClass();
                    ((C0079n) o3.f875f).f("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
