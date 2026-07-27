package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.chickyneer.roadway.R;
import k.ViewOnTouchListenerC1201a;
import u1.AbstractC1477a;
import y.AbstractC1550a;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236h extends C1244p implements InterfaceC1238j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1237i f10867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236h(C1237i c1237i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f10867c = c1237i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1477a.z(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC1201a(this, this));
    }

    @Override // l.InterfaceC1238j
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC1238j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f10867c.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i6, int i7) {
        boolean frame = super.setFrame(i2, i3, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC1550a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
