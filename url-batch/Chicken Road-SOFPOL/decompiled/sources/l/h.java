package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends x implements j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f4250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f4250g = iVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        m.a.Q(this, getContentDescription());
        setOnTouchListener(new k.a(this, this));
    }

    @Override // l.j
    public final boolean a() {
        return false;
    }

    @Override // l.j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4250g.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i, i8, i9, i10);
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
