package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i30 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public i30(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
