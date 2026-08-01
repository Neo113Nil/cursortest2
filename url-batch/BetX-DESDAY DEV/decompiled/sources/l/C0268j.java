package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.luckyarcade.spinthrow.R;
import k.C0191b;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268j extends C0232A implements InterfaceC0272l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0270k f3385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268j(C0270k c0270k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f3385d = c0270k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e1.a(this, getContentDescription());
        setOnTouchListener(new C0191b(this, this));
    }

    @Override // l.InterfaceC0272l
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC0272l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3385d.l();
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
            D.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
