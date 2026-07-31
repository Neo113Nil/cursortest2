package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;
import u0.C0682l;

/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4554b;

    public e(f fVar, View view) {
        this.f4554b = fVar;
        this.f4553a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i7) {
        this.f4553a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                C0682l c0682l = e.this.f4554b.f4556b;
                if ((i7 & 4) == 0) {
                    ((B0.c) c0682l.f5989f).q("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((B0.c) c0682l.f5989f).q("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
