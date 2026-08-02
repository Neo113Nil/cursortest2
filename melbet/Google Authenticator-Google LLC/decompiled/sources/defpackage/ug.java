package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ug {
    public final Bundle a;
    public final boolean b;
    public boolean c;

    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    public final oy[] g;
    private IconCompat h;

    public ug(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.c = true;
        this.h = iconCompat;
        int i = iconCompat.b;
        if ((i == -1 ? ((Icon) iconCompat.c).getType() : i) == 2) {
            this.d = iconCompat.a();
        }
        this.e = ui.b(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = null;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.h;
        if (iconCompat != null || (i = this.d) == 0) {
            return iconCompat;
        }
        IconCompat c = IconCompat.c(i);
        this.h = c;
        return c;
    }
}
