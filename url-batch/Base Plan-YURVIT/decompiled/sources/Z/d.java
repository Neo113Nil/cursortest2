package Z;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class d extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final d f1052f = new d(1);

    @Override // O0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        P0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
