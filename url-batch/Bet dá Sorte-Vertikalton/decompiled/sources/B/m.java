package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f55a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f56b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f55a = colorStateList;
        this.f56b = configuration;
        this.f57c = theme == null ? 0 : theme.hashCode();
    }
}
