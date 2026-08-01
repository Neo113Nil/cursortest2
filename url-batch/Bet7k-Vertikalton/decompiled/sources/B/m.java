package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f32a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f33b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f32a = colorStateList;
        this.f33b = configuration;
        this.f34c = theme == null ? 0 : theme.hashCode();
    }
}
