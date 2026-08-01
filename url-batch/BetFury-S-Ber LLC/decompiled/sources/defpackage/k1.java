package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k1 extends f5 implements m1 {
    public final /* synthetic */ l1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.i = l1Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        zi0.a(this, getContentDescription());
        setOnTouchListener(new f1(this, this));
    }

    @Override // defpackage.m1
    public final boolean a() {
        return false;
    }

    @Override // defpackage.m1
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.i.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
