package i0;

import androidx.window.sidecar.SidecarDisplayFeature;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4398f = new f(1);

    @Override // x5.InterfaceC0743l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
