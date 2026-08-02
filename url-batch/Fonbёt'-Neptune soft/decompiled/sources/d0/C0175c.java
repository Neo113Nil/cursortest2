package d0;

import P0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175c extends Q0.i implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final C0175c f2041f = new C0175c(1);

    @Override // P0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        Q0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
