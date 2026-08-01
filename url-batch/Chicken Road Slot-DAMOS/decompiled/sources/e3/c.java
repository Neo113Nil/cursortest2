package e3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3792a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3796e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f3797f;
    public final PendingIntent g;

    public c(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b10 = i3 == 0 ? null : IconCompat.b(i3);
        Bundle bundle = new Bundle();
        this.f3795d = true;
        this.f3793b = b10;
        if (b10 != null && b10.d() == 2) {
            this.f3796e = b10.c();
        }
        this.f3797f = g.b(charSequence);
        this.g = pendingIntent;
        this.f3792a = bundle;
        this.f3794c = true;
        this.f3795d = true;
    }
}
