package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.winfour.winrandom.R;
import l.C0158b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219j extends C0251z implements InterfaceC0223l {
    public final /* synthetic */ C0221k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219j(C0221k c0221k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c0221k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        k1.a(this, getContentDescription());
        setOnTouchListener(new C0158b(this, this));
    }

    @Override // m.InterfaceC0223l
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0223l
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
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
            E.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
