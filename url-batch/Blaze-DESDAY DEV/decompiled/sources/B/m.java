package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f47a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f48b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f47a = colorStateList;
        this.f48b = configuration;
        this.f49c = theme == null ? 0 : theme.hashCode();
    }
}
