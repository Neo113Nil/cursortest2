package io.flutter.plugin.platform;

import B0.C0008i;
import N.P;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2461b;

    public d(e eVar, View view) {
        this.f2461b = eVar;
        this.f2460a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f2460a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                P p2 = d.this.f2461b.f2463b;
                if ((i2 & 4) == 0) {
                    ((C0008i) p2.f698f).B("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((C0008i) p2.f698f).B("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
