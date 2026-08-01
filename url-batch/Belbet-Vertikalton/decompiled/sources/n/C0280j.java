package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.winpower.neonfit.R;
import m.C0218b;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280j extends C0312z implements InterfaceC0284l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0282k f3649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280j(C0282k c0282k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f3649d = c0282k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        j1.a(this, getContentDescription());
        setOnTouchListener(new C0218b(this, this));
    }

    @Override // n.InterfaceC0284l
    public final boolean b() {
        return false;
    }

    @Override // n.InterfaceC0284l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3649d.l();
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
            F.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
