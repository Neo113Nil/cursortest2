package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahu implements DialogInterface.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ahu(ar arVar, int i) {
        this.b = i;
        this.a = arVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            Object obj = this.a;
            ((ahv) obj).aj = i;
            ((aid) obj).an = -1;
            dialogInterface.dismiss();
            return;
        }
        if (i2 == 1) {
            ((ps) this.a).al.n(true);
            return;
        }
        if (i2 == 2) {
            ((boo) this.a).k = false;
            return;
        }
        if (i2 == 3) {
            ((bsz) ((bua) this.a).a).a(false);
            return;
        }
        Object obj2 = this.a;
        if (i2 != 4) {
            ((bya) obj2).b.E().finish();
            return;
        }
        bsz bszVar = (bsz) ((bua) obj2).a;
        bszVar.k.n(bszVar.e.c);
    }

    public /* synthetic */ ahu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
