package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0559e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0560f f5696b;

    public ViewOnSystemUiVisibilityChangeListenerC0559e(C0560f c0560f, View view) {
        this.f5696b = c0560f;
        this.f5695a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f5695a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                P0.e eVar = ViewOnSystemUiVisibilityChangeListenerC0559e.this.f5696b.f5698b;
                if ((i2 & 4) == 0) {
                    ((s4.q) eVar.f2194e).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((s4.q) eVar.f2194e).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
