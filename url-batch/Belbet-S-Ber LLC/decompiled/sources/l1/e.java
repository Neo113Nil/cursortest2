package l1;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends f implements Animatable {
    public final Context h;
    public g2.e i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2647j = null;

    /* renamed from: k, reason: collision with root package name */
    public final c f2648k = new c(this);

    /* renamed from: g, reason: collision with root package name */
    public final d f2646g = new d();

    public e(Context context, int i) {
        this.h = context;
    }

    @Override // l1.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f2646g;
        dVar.f2643a.draw(canvas);
        if (dVar.f2644b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getAlpha() : this.f2646g.f2643a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2646g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getColorFilter() : this.f2646g.f2643a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2649f != null) {
            return new g2.a(this.f2649f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2646g.f2643a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2646g.f2643a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getOpacity() : this.f2646g.f2643a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f2646g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f5 = e0.b.f(resources, theme, attributeSet, a.f2639e);
                    int resourceId = f5.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o oVar = new o();
                        ThreadLocal threadLocal = e0.m.f1339a;
                        oVar.f2649f = resources.getDrawable(resourceId, theme);
                        new n(oVar.f2649f.getConstantState());
                        oVar.f2695k = false;
                        oVar.setCallback(this.f2648k);
                        o oVar2 = dVar.f2643a;
                        if (oVar2 != null) {
                            oVar2.setCallback(null);
                        }
                        dVar.f2643a = oVar;
                    }
                    f5.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f2640f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f2643a.f2693g.f2683b.f2681o.get(string));
                        if (dVar.f2645c == null) {
                            dVar.f2645c = new ArrayList();
                            dVar.d = new q.f(0);
                        }
                        dVar.f2645c.add(loadAnimator);
                        dVar.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f2644b == null) {
            dVar.f2644b = new AnimatorSet();
        }
        dVar.f2644b.playTogether(dVar.f2645c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.isAutoMirrored() : this.f2646g.f2643a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2649f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2646g.f2644b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.isStateful() : this.f2646g.f2643a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2646g.f2643a.setBounds(rect);
        }
    }

    @Override // l1.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.setLevel(i) : this.f2646g.f2643a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.setState(iArr) : this.f2646g.f2643a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2646g.f2643a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f2646g.f2643a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2646g.f2643a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f2646g.f2643a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2646g.f2643a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2646g.f2643a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.setVisible(z4, z5);
        }
        this.f2646g.f2643a.setVisible(z4, z5);
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f2646g;
        if (dVar.f2644b.isStarted()) {
            return;
        }
        dVar.f2644b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2646g.f2644b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
