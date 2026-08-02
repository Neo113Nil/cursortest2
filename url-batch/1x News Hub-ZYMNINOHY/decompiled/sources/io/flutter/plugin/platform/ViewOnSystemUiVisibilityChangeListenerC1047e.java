package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1047e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9250b;

    public ViewOnSystemUiVisibilityChangeListenerC1047e(f fVar, View view) {
        this.f9250b = fVar;
        this.f9249a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i3) {
        this.f9249a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3 & 4;
                f fVar = ViewOnSystemUiVisibilityChangeListenerC1047e.this.f9250b;
                if (i4 == 0) {
                    V0.e eVar = fVar.f9252b;
                    eVar.getClass();
                    ((P1.o) eVar.f1599b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                V0.e eVar2 = fVar.f9252b;
                eVar2.getClass();
                ((P1.o) eVar2.f1599b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
