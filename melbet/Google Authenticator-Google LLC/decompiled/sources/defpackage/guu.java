package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class guu implements View.OnClickListener {
    public final /* synthetic */ gva a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ View.OnClickListener d;

    public /* synthetic */ guu(gva gvaVar, int i, String str, View.OnClickListener onClickListener) {
        this.a = gvaVar;
        this.b = i;
        this.c = str;
        this.d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gtt f = this.a.f(this.c, this.b);
        try {
            this.d.onClick(view);
            ixf.j(f, null);
        } finally {
        }
    }
}
