package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bbr implements bbu {
    private final String a;
    private final AssetManager b;
    private Object c;

    public bbr(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.bbu
    public final void d() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        try {
            Object b = b(this.b, this.a);
            this.c = b;
            bbtVar.b(b);
        } catch (IOException e) {
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
