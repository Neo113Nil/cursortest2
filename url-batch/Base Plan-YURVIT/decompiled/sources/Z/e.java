package Z;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class e extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1053f = new e(1);

    @Override // O0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        P0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
