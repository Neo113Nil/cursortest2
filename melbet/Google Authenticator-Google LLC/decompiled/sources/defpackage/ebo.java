package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebo {
    public int a;
    public Drawable b;
    public int c;
    public String d;
    public int e;
    public View.OnClickListener f;
    public ebn g;
    public final gzp h;
    public final gzp i;
    public byte j;

    public ebo() {
        gyf gyfVar = gyf.a;
        this.h = gyfVar;
        this.i = gyfVar;
    }

    public final void a(int i) {
        this.a = i;
        this.j = (byte) (this.j | 1);
    }

    public final void b(int i) {
        this.e = i;
        this.j = (byte) (this.j | 4);
    }
}
