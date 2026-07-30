package h;

import a.AbstractC0069a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import g.ViewOnTouchListenerC0129a;
import q.AbstractC0218a;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155h extends C0164q implements InterfaceC0157j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0156i f2191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155h(C0156i c0156i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f2191g = c0156i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0069a.F(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0129a(this, this));
    }

    @Override // h.InterfaceC0157j
    public final boolean a() {
        return false;
    }

    @Override // h.InterfaceC0157j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2191g.g();
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
            AbstractC0218a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
