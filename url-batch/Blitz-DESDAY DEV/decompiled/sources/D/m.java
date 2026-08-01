package D;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f135a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f137c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f135a = colorStateList;
        this.f136b = configuration;
        this.f137c = theme == null ? 0 : theme.hashCode();
    }
}
