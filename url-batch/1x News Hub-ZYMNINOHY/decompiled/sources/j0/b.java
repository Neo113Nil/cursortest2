package j0;

import androidx.window.sidecar.SidecarDisplayFeature;
import l2.l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final b f9495e = new b(1);

    @Override // l2.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
