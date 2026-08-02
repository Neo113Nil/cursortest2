package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ui {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public uj i;
    public Bundle k;
    public String l;
    public final Notification m;

    @Deprecated
    public final ArrayList n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean j = false;

    public ui(Context context) {
        Notification notification = new Notification();
        this.m = notification;
        this.a = context;
        this.l = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.n = new ArrayList();
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle a() {
        Bundle bundle = this.k;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.k = bundle2;
        return bundle2;
    }

    public final void c(int i) {
        this.m.icon = i;
    }

    public final void d(uj ujVar) {
        if (this.i != ujVar) {
            this.i = ujVar;
            if (ujVar == null || ujVar.b == this) {
                return;
            }
            ujVar.b = this;
            ui uiVar = ujVar.b;
            if (uiVar != null) {
                uiVar.d(ujVar);
            }
        }
    }
}
