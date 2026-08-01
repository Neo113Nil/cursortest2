package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends z implements m {
    public final /* synthetic */ l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.i = lVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        h.a.l0(this, getContentDescription());
        setOnTouchListener(new k.b(this, this));
    }

    @Override // l.m
    public final boolean a() {
        return false;
    }

    @Override // l.m
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.i.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i, i4, i5, i6);
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
