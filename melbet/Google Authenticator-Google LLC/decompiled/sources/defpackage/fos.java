package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fos {
    public fog b;
    public boolean a = false;
    public RectF c = new RectF();
    public final Path d = new Path();

    public abstract void a(View view);

    public final void b() {
        if (this.c.left > this.c.right || this.c.top > this.c.bottom || this.b == null) {
            return;
        }
        foh.a.c(this.b, null, 1.0f, this.c, null, this.d);
    }

    public abstract boolean c();
}
