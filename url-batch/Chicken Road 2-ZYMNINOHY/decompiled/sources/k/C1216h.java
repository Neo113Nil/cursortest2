package k;

import a.AbstractC0124a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.rockchicken.pump.up.road.R;
import j.ViewOnTouchListenerC1168a;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216h extends C1229p implements InterfaceC1220j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1218i f14011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1216h(C1218i c1218i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f14011c = c1218i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0124a.O(getContentDescription(), this);
        setOnTouchListener(new ViewOnTouchListenerC1168a(this, this));
    }

    @Override // k.InterfaceC1220j
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC1220j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f14011c.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
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
