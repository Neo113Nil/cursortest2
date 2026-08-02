package s;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3416a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f3417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3418c;

    public C0300k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3416a = colorStateList;
        this.f3417b = configuration;
        this.f3418c = theme == null ? 0 : theme.hashCode();
    }
}
