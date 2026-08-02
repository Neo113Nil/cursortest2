package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bwj extends View implements jrr {
    private gmt a;
    private boolean b;

    public bwj(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.jrr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final gmt b() {
        gmt gmtVar = this.a;
        if (gmtVar != null) {
            return gmtVar;
        }
        gmt gmtVar2 = new gmt(this);
        this.a = gmtVar2;
        return gmtVar2;
    }

    protected final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        btv btvVar = (btv) C();
        btvVar.f();
    }

    public bwj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public bwj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    bwj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
