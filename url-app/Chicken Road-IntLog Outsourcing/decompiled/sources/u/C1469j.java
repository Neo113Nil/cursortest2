package u;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469j {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11992a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f11993b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11994c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11995d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11996e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f11997f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f11998g;

    public C1469j(int i2, String str, PendingIntent pendingIntent) {
        IconCompat b6 = i2 == 0 ? null : IconCompat.b(i2);
        Bundle bundle = new Bundle();
        this.f11995d = true;
        this.f11993b = b6;
        if (b6 != null && b6.d() == 2) {
            this.f11996e = b6.c();
        }
        this.f11997f = p.b(str);
        this.f11998g = pendingIntent;
        this.f11992a = bundle;
        this.f11994c = true;
        this.f11995d = true;
    }
}
