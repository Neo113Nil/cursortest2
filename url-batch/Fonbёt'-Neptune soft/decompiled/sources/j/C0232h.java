package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.neptunesoft.languesbacdz.R;
import i.ViewOnTouchListenerC0203a;
import u.AbstractC0309a;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232h extends r implements InterfaceC0234j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0233i f2948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232h(C0233i c0233i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f2948g = c0233i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        i1.a.z(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0203a(this, this));
    }

    @Override // j.InterfaceC0234j
    public final boolean a() {
        return false;
    }

    @Override // j.InterfaceC0234j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2948g.j();
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
            AbstractC0309a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
