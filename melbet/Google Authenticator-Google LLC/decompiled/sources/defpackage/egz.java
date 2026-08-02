package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egz extends egv {
    public static final gzf a = new egz();

    @Override // defpackage.egv
    public final void b(cpf cpfVar, efz efzVar) {
        if (!cpfVar.f() || "null".equals(cpfVar.d())) {
            return;
        }
        efzVar.c = cpfVar.d();
    }

    @Override // defpackage.egv
    public final void c(cpf cpfVar, efz efzVar) {
        if (!cpfVar.g() || "null".equals(cpfVar.e())) {
            return;
        }
        efzVar.b = cpfVar.e();
    }

    @Override // defpackage.egv
    public final void d(cpf cpfVar, efz efzVar) {
        DataHolder dataHolder = cpfVar.a;
        int i = cpfVar.b;
        int i2 = cpfVar.c;
        dataHolder.a("is_dasher", i);
        int i3 = dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher"));
        int i4 = 1;
        if (i3 == 1) {
            i4 = 3;
        } else if (i3 == 2) {
            i4 = 2;
        }
        efzVar.c(i4);
    }
}
