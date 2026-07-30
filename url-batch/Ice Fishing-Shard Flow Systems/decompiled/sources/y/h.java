package y;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8463a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f8464b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8465c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8467e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f8468f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f8469g;

    public h(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b7 = i2 == 0 ? null : IconCompat.b(i2);
        Bundle bundle = new Bundle();
        this.f8466d = true;
        this.f8464b = b7;
        if (b7 != null && b7.d() == 2) {
            this.f8467e = b7.c();
        }
        this.f8468f = l.b(charSequence);
        this.f8469g = pendingIntent;
        this.f8463a = bundle;
        this.f8465c = true;
        this.f8466d = true;
    }
}
