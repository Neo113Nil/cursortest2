package t;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f5905a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f5906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5907c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5909e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f5910f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f5911g;

    public j(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b7 = i7 == 0 ? null : IconCompat.b(i7);
        Bundle bundle = new Bundle();
        this.f5908d = true;
        this.f5906b = b7;
        if (b7 != null && b7.d() == 2) {
            this.f5909e = b7.c();
        }
        this.f5910f = p.b(charSequence);
        this.f5911g = pendingIntent;
        this.f5905a = bundle;
        this.f5907c = true;
        this.f5908d = true;
    }
}
