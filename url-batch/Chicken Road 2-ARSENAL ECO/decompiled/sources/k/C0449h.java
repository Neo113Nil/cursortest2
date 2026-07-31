package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.strategylink.Row.Five.R;
import j.ViewOnTouchListenerC0431a;
import u0.AbstractC0676f;
import x.AbstractC0723a;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449h extends C0458q implements InterfaceC0451j {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0450i f4996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449h(C0450i c0450i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f4996h = c0450i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0676f.t(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0431a(this, this));
    }

    @Override // k.InterfaceC0451j
    public final boolean b() {
        return false;
    }

    @Override // k.InterfaceC0451j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4996h.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i7, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0723a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
