package defpackage;

import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class exp implements xq {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ exp(View view, int i, int i2, int i3, int i4, int i5) {
        this.f = i5;
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.xq
    public final zz a(View view, zz zzVar) {
        if (this.f == 0) {
            vb f = zzVar.f(519);
            this.a.setPadding(this.b + f.b, this.c + f.c, this.d + f.d, this.e + f.e);
            return zzVar;
        }
        vb f2 = zzVar.f(519);
        int i = f2.b;
        int i2 = f2.c;
        int i3 = f2.d;
        ((Toolbar) this.a).setPadding(this.b + i, this.c + i2, this.d + i3, this.e);
        zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm(zzVar) : Build.VERSION.SDK_INT >= 35 ? new zl(zzVar) : Build.VERSION.SDK_INT >= 34 ? new zk(zzVar) : Build.VERSION.SDK_INT >= 31 ? new zj(zzVar) : Build.VERSION.SDK_INT >= 30 ? new zi(zzVar) : Build.VERSION.SDK_INT >= 29 ? new zh(zzVar) : new zg(zzVar);
        zmVar.g(519, vb.d(i, 0, i3, f2.e));
        return zmVar.a();
    }
}
