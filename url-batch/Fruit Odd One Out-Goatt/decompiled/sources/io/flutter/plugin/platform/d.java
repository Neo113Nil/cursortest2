package io.flutter.plugin.platform;

import android.view.View;
import e0.h0;
import java.util.Arrays;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f493b;

    public d(e eVar, View view) {
        this.f493b = eVar;
        this.f492a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f492a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                c0.a aVar = d.this.f493b.f495b;
                if (i3 == 0) {
                    ((h0) aVar.f66c).d("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((h0) aVar.f66c).d("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
