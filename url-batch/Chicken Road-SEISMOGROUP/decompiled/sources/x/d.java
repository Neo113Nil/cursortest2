package x;

import androidx.window.sidecar.SidecarDisplayFeature;
import d0.l;

/* loaded from: classes.dex */
public final class d extends e0.i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1308c = new d(1);

    @Override // d0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        e0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
