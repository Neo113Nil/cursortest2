package x;

import androidx.window.sidecar.SidecarDisplayFeature;
import d0.l;

/* loaded from: classes.dex */
public final class b extends e0.i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1306c = new b(1);

    @Override // d0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        e0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
