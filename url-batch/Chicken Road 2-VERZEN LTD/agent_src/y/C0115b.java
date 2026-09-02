package y;

import androidx.window.sidecar.SidecarDisplayFeature;
import d0.l;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115b extends e0.i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0115b f1309c = new C0115b(1);

    @Override // d0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        e0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
