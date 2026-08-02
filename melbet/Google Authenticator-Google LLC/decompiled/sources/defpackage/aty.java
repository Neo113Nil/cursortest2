package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aty extends alk {
    private final Context c;

    public aty(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        if (this.b >= 10) {
            amjVar.j(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
