package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgv implements bge {
    private final Context a;
    private final bge b;
    private final bge c;
    private final Class d;

    public bgv(Context context, bge bgeVar, bge bgeVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = bgeVar;
        this.c = bgeVar2;
        this.d = cls;
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && afn.i((Uri) obj);
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        Uri uri = (Uri) obj;
        return new bvw(new bls(uri), new bgu(this.a, this.b, this.c, uri, i, i2, bblVar, this.d));
    }
}
