package h3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3142a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f3143b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3144c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3142a = colorStateList;
        this.f3143b = configuration;
        this.f3144c = theme == null ? 0 : theme.hashCode();
    }
}
