package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gq0 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public hq0 l;
    public Bundle n;
    public String q;
    public final boolean r;
    public final Notification s;
    public final ArrayList t;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public gq0(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
        this.r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        i8 i8Var = new i8(this);
        gq0 gq0Var = (gq0) i8Var.g;
        hq0 hq0Var = gq0Var.l;
        if (hq0Var != null) {
            hq0Var.a(i8Var);
        }
        Notification build = ((Notification.Builder) i8Var.e).build();
        if (hq0Var != null) {
            gq0Var.l.getClass();
        }
        if (hq0Var != null && (bundle = build.extras) != null) {
            if (hq0Var.d) {
                bundle.putCharSequence("android.summaryText", hq0Var.c);
            }
            CharSequence charSequence = hq0Var.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", hq0Var.b());
        }
        return build;
    }

    public final void c(boolean z) {
        Notification notification = this.s;
        if (z) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(hq0 hq0Var) {
        if (this.l != hq0Var) {
            this.l = hq0Var;
            if (hq0Var.a != this) {
                hq0Var.a = this;
                d(hq0Var);
            }
        }
    }
}
