package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwe implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bwe(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.c != 0) {
            dialogInterface.dismiss();
            hoq.Z(new bwa(this.a), (ar) ((bwb) this.b).a);
        } else {
            dialogInterface.dismiss();
            hoq.Z(new bwf(this.a), (ar) ((bwg) this.b).a);
        }
    }
}
