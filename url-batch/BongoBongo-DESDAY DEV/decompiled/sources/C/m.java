package C;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f88a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f89b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f88a = colorStateList;
        this.f89b = configuration;
        this.f90c = theme == null ? 0 : theme.hashCode();
    }
}
