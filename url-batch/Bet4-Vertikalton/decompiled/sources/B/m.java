package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f33a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f34b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f33a = colorStateList;
        this.f34b = configuration;
        this.f35c = theme == null ? 0 : theme.hashCode();
    }
}
