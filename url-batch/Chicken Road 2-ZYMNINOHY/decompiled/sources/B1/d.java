package B1;

import androidx.window.sidecar.SidecarDisplayFeature;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public static final d f193e = new d(1);

    @Override // o3.InterfaceC1339l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
