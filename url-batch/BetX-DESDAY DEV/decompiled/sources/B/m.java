package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f38a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f39b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f38a = colorStateList;
        this.f39b = configuration;
        this.f40c = theme == null ? 0 : theme.hashCode();
    }
}
