package d0;

import P0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174b extends Q0.i implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final C0174b f2040f = new C0174b(1);

    @Override // P0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        Q0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
