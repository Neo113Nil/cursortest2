package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f699b;

    public d(e eVar, View view) {
        this.f699b = eVar;
        this.f698a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f698a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                e eVar = d.this.f699b;
                if (i3 == 0) {
                    A.a aVar = eVar.f701b;
                    aVar.getClass();
                    ((A.e) aVar.f3c).h("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                A.a aVar2 = eVar.f701b;
                aVar2.getClass();
                ((A.e) aVar2.f3c).h("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
