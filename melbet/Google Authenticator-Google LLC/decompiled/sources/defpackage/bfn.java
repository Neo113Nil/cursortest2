package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bfn implements bbu {
    private final Resources.Theme a;
    private final Resources b;
    private final bfo c;
    private final int d;
    private Object e;

    public bfn(Resources.Theme theme, Resources resources, bfo bfoVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = bfoVar;
        this.d = i;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.bbu
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        try {
            Object c = this.c.c(this.a, this.b, this.d);
            this.e = c;
            bbtVar.b(c);
        } catch (Resources.NotFoundException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }
}
