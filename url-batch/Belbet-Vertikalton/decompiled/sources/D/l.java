package D;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f181a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f183c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f181a = colorStateList;
        this.f182b = configuration;
        this.f183c = theme == null ? 0 : theme.hashCode();
    }
}
