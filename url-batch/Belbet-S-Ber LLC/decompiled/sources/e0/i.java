package e0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1332a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1334c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1332a = colorStateList;
        this.f1333b = configuration;
        this.f1334c = theme == null ? 0 : theme.hashCode();
    }
}
