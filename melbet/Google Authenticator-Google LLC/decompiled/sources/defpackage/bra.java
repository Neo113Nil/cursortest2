package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bra extends LinearLayout implements jrr {
    private gmt a;
    private boolean b;

    public bra(Context context) {
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
        bqf bqfVar = (bqf) C();
        bqfVar.e();
    }

    public bra(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public bra(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    bra(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
