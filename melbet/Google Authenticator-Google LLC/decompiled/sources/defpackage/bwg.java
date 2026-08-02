package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwg {
    public final Object a;
    public final Object b;

    public bwg(bwd bwdVar, gva gvaVar) {
        gvaVar.getClass();
        this.a = bwdVar;
        this.b = gvaVar;
    }

    public final DialogInterface.OnClickListener a(int i) {
        return new guv((gva) this.b, 37, "StagedImportDialogClick", new bwe(i, this, 0));
    }

    public bwg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
