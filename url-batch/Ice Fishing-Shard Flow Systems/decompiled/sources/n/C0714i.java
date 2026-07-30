package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.icefishing.icefish.ice.fishing.s294s.R;
import m.C0677b;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714i extends C0743x implements InterfaceC0718k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0716j f6785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0714i(C0716j c0716j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f6785l = c0716j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        P0.f.M(this, getContentDescription());
        setOnTouchListener(new C0677b(this, this));
    }

    @Override // n.InterfaceC0718k
    public final boolean b() {
        return false;
    }

    @Override // n.InterfaceC0718k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6785l.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i5, int i7, int i8) {
        boolean frame = super.setFrame(i2, i5, i7, i8);
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
