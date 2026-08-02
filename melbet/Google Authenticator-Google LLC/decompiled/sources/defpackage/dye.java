package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dye extends FrameLayout {
    public MaterialButton a;
    public edb b;
    public hel c;
    public final FrameLayout.LayoutParams d;
    public int e;

    public dye(Context context) {
        super(context);
        this.e = 1;
        int i = hel.d;
        hel helVar = his.a;
        helVar.getClass();
        this.c = helVar;
        this.d = new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        edb edbVar = this.b;
        if (edbVar != null) {
            edbVar.b(size);
        }
        super.onMeasure(i, i2);
    }
}
