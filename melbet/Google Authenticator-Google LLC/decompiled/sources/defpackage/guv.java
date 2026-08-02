package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class guv implements DialogInterface.OnClickListener {
    public final /* synthetic */ gva a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ DialogInterface.OnClickListener d;

    public /* synthetic */ guv(gva gvaVar, int i, String str, DialogInterface.OnClickListener onClickListener) {
        this.a = gvaVar;
        this.b = i;
        this.c = str;
        this.d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        gtt f = this.a.f(this.c, this.b);
        try {
            this.d.onClick(dialogInterface, i);
            ixf.j(f, null);
        } finally {
        }
    }
}
