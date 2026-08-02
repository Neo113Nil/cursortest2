package d0;

import P0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177e extends Q0.i implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final C0177e f2043f = new C0177e(1);

    @Override // P0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        Q0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
