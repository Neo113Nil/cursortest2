package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqo extends Drawable.ConstantState {
    int a;
    aqn b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public aqo(aqo aqoVar) {
        this.c = null;
        this.d = aqq.a;
        if (aqoVar != null) {
            this.a = aqoVar.a;
            this.b = new aqn(aqoVar.b);
            Paint paint = aqoVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = aqoVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = aqoVar.c;
            this.d = aqoVar.d;
            this.e = aqoVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        aqn aqnVar = this.b;
        aqnVar.a(aqnVar.d, aqn.a, canvas, i, i2);
    }

    public final boolean b() {
        aqn aqnVar = this.b;
        if (aqnVar.k == null) {
            aqnVar.k = Boolean.valueOf(aqnVar.d.p());
        }
        return aqnVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new aqq(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new aqq(this);
    }

    public aqo() {
        this.c = null;
        this.d = aqq.a;
        this.b = new aqn();
    }
}
