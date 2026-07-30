package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xs1 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public xs1(String str, PendingIntent pendingIntent) {
        IconCompat b = IconCompat.b(2131230846);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = b;
        if (b.d() == 2) {
            this.e = b.c();
        }
        this.f = bt1.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
