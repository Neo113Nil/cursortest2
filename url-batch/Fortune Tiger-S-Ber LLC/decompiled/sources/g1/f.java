package g1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends g implements Animatable {
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public f1.k f1771i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1772j = null;

    /* renamed from: k, reason: collision with root package name */
    public final c f1773k = new c(this);
    public final d g = new d();

    public f(Context context, int i4) {
        this.h = context;
    }

    @Override // g1.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.g;
        dVar.f1767a.draw(canvas);
        if (dVar.f1768b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getAlpha() : this.g.f1767a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getColorFilter() : this.g.f1767a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1774f != null) {
            return new e(this.f1774f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.g.f1767a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.g.f1767a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getOpacity() : this.g.f1767a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f4 = b0.b.f(resources, theme, attributeSet, a.f1763e);
                    int resourceId = f4.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = b0.m.f716a;
                        pVar.f1774f = resources.getDrawable(resourceId, theme);
                        new o(pVar.f1774f.getConstantState());
                        pVar.f1820k = false;
                        pVar.setCallback(this.f1773k);
                        p pVar2 = dVar.f1767a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f1767a = pVar;
                    }
                    f4.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f1764f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f1767a.g.f1808b.f1806o.get(string));
                        if (dVar.c == null) {
                            dVar.c = new ArrayList();
                            dVar.f1769d = new n.f(0);
                        }
                        dVar.c.add(loadAnimator);
                        dVar.f1769d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f1768b == null) {
            dVar.f1768b = new AnimatorSet();
        }
        dVar.f1768b.playTogether(dVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.f1767a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1774f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.g.f1768b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.isStateful() : this.g.f1767a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.g.f1767a.setBounds(rect);
        }
    }

    @Override // g1.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.setLevel(i4) : this.g.f1767a.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.setState(iArr) : this.g.f1767a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.g.f1767a.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.g.f1767a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.g.f1767a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            k3.m.T(drawable, i4);
        } else {
            this.g.f1767a.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.g.f1767a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.g.f1767a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.g.f1767a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.g;
        if (dVar.f1768b.isStarted()) {
            return;
        }
        dVar.f1768b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.g.f1768b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
