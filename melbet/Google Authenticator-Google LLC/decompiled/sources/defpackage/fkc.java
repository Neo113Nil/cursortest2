package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fkc extends ImageButton {
    public int g;

    public fkc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = getVisibility();
    }

    public final void k(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.g = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        k(i, true);
    }

    public fkc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fkc(Context context) {
        this(context, null);
    }
}
