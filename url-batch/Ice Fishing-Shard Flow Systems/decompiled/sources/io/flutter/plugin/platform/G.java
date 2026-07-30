package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;
import h4.AbstractActivityC0488c;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: i, reason: collision with root package name */
    public static final D f5679i = new D();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f5680a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5681b;

    /* renamed from: c, reason: collision with root package name */
    public final C0555a f5682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5684e;

    /* renamed from: f, reason: collision with root package name */
    public final j f5685f;

    /* renamed from: g, reason: collision with root package name */
    public final o f5686g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f5687h;

    public G(AbstractActivityC0488c abstractActivityC0488c, C0555a c0555a, VirtualDisplay virtualDisplay, InterfaceC0561g interfaceC0561g, j jVar, o oVar, int i2) {
        this.f5681b = abstractActivityC0488c;
        this.f5682c = c0555a;
        this.f5685f = jVar;
        this.f5686g = oVar;
        this.f5684e = i2;
        this.f5687h = virtualDisplay;
        this.f5683d = abstractActivityC0488c.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(abstractActivityC0488c, this.f5687h.getDisplay(), interfaceC0561g, c0555a, i2, oVar);
        this.f5680a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f5680a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
