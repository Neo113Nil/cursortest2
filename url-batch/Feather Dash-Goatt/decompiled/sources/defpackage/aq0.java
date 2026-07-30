package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class aq0 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public aq0(String str, PendingIntent pendingIntent) {
        IconCompat a = IconCompat.a(2130968595);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = a;
        if (a != null) {
            int i = a.a;
            if ((i == -1 ? ((Icon) a.b).getType() : i) == 2) {
                this.e = a.b();
            }
        }
        this.f = gq0.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
