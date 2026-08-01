package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends x implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f2557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2557i = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a3.a(this, getContentDescription());
        setOnTouchListener(new j.b(this, this));
    }

    @Override // k.l
    public final boolean a() {
        return false;
    }

    @Override // k.l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2557i.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
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
