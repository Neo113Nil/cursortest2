package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bsx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bsx(ar arVar, int i) {
        this.b = i;
        this.a = arVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            bsz bszVar = (bsz) ((bua) obj).a;
            bszVar.k.n(bszVar.e.c);
        } else {
            ar arVar = (ar) obj;
            Dialog dialog = arVar.e;
            if (dialog != null) {
                arVar.onCancel(dialog);
            }
        }
    }

    public /* synthetic */ bsx(bua buaVar, int i) {
        this.b = i;
        this.a = buaVar;
    }
}
