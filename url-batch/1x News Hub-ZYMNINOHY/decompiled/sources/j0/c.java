package j0;

import androidx.window.sidecar.SidecarDisplayFeature;
import l2.l;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final c f9496e = new c(1);

    @Override // l2.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
