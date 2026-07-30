package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d3 extends AppCompatImageView implements f3 {
    public final /* synthetic */ e3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.p = e3Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        zj2.k(this, getContentDescription());
        setOnTouchListener(new z2(this, this));
    }

    @Override // defpackage.f3
    public final boolean b() {
        return false;
    }

    @Override // defpackage.f3
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.p.l();
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
