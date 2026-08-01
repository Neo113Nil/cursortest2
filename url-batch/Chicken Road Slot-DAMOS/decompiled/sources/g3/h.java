package g3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f4252a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f4253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4254c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f4252a = colorStateList;
        this.f4253b = configuration;
        this.f4254c = theme == null ? 0 : theme.hashCode();
    }
}
