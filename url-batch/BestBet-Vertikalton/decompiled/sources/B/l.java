package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f43a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f44b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f43a = colorStateList;
        this.f44b = configuration;
        this.f45c = theme == null ? 0 : theme.hashCode();
    }
}
