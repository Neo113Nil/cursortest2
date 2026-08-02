package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hh extends AppCompatImageView implements hl {
    final /* synthetic */ hk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(hk hkVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = hkVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new hg(this, this));
    }

    @Override // defpackage.hl
    public final boolean c() {
        return false;
    }

    @Override // defpackage.hl
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.o();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i5 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - max, paddingTop - max, i5 + max, paddingTop + max);
        }
        return frame;
    }
}
