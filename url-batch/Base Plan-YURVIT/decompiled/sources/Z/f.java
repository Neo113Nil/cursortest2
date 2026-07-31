package Z;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class f extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final f f1054f = new f(1);

    @Override // O0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        P0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
