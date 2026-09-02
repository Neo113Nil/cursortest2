package y;

import androidx.window.sidecar.SidecarDisplayFeature;
import d0.l;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118e extends e0.i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0118e f1312c = new C0118e(1);

    @Override // d0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        e0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
