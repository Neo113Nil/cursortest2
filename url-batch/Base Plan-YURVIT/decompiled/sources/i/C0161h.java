package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.crane.slab.beam.R;
import h.ViewOnTouchListenerC0134a;
import s.AbstractC0226a;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161h extends C0170q implements InterfaceC0163j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0162i f2219g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161h(C0162i c0162i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f2219g = c0162i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        androidx.datastore.preferences.protobuf.k0.F(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0134a(this, this));
    }

    @Override // i.InterfaceC0163j
    public final boolean b() {
        return false;
    }

    @Override // i.InterfaceC0163j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2219g.j();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0226a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
