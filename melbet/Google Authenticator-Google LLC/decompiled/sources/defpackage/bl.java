package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bl extends bi {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final by e = new by();

    public bl(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.bi
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.bi
    public boolean b() {
        throw null;
    }

    public final void g(Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, null);
    }

    public void d() {
    }
}
