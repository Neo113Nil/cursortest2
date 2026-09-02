package e0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1150a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1152c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1150a = colorStateList;
        this.f1151b = configuration;
        this.f1152c = theme == null ? 0 : theme.hashCode();
    }
}
