package io.flutter.plugin.platform;

import L.C0026b;
import L.Q;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2457b;

    public d(e eVar, View view) {
        this.f2457b = eVar;
        this.f2456a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f2456a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                e eVar = d.this.f2457b;
                if (i3 == 0) {
                    Q q2 = eVar.f2459b;
                    q2.getClass();
                    ((C0026b) q2.f515f).D("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                Q q3 = eVar.f2459b;
                q3.getClass();
                ((C0026b) q3.f515f).D("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
