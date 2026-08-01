package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.appsflyer.R;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends r implements k {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f6097r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f6097r = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        k7.e.R(this, getContentDescription());
        setOnTouchListener(new l.a(this, this));
    }

    @Override // m.k
    public final boolean a() {
        return false;
    }

    @Override // m.k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6097r.j();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i3, i10, i11, i12);
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
