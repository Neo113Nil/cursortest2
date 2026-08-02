package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fc.barca.football.R;
import k.ViewOnTouchListenerC1056a;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086h extends C1095q implements InterfaceC1088j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1087i f9810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086h(C1087i c1087i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f9810c = c1087i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        S0.a.C(getContentDescription(), this);
        setOnTouchListener(new ViewOnTouchListenerC1056a(this, this));
    }

    @Override // l.InterfaceC1088j
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC1088j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9810c.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
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
