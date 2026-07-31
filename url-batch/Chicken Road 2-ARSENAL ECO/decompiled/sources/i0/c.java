package i0;

import androidx.window.sidecar.SidecarDisplayFeature;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public static final c f4395f = new c(1);

    @Override // x5.InterfaceC0743l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        boolean z5 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
