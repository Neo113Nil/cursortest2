package X;

import E0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class c extends F0.j implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final c f1063f = new c(1);

    @Override // E0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        F0.i.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
