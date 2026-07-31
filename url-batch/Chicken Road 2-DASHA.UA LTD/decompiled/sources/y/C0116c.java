package y;

import androidx.window.sidecar.SidecarDisplayFeature;
import d0.l;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116c extends e0.i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0116c f1310c = new C0116c(1);

    @Override // d0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        e0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
