package b0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f711a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f712b;
    public final int c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f711a = colorStateList;
        this.f712b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
