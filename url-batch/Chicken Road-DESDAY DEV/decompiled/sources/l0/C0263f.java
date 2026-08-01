package l0;

import B.r;
import K.Y;
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

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263f extends AbstractC0264g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3054c;
    public Y d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3055e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0260c f3056f = new C0260c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0261d f3053b = new C0261d();

    public C0263f(Context context) {
        this.f3054c = context;
    }

    @Override // l0.AbstractC0264g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0261d c0261d = this.f3053b;
        c0261d.f3049a.draw(canvas);
        if (c0261d.f3050b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.getAlpha() : this.f3053b.f3049a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3053b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3057a;
        return drawable != null ? D.a.c(drawable) : this.f3053b.f3049a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3057a != null) {
            return new C0262e(this.f3057a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3053b.f3049a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3053b.f3049a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.getOpacity() : this.f3053b.f3049a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0261d c0261d;
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0261d = this.f3053b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0258a.f3045e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0273p c0273p = new C0273p();
                        ThreadLocal threadLocal = r.f40a;
                        c0273p.f3057a = B.k.a(resources, resourceId, theme);
                        new C0272o(c0273p.f3057a.getConstantState());
                        c0273p.f3104f = false;
                        c0273p.setCallback(this.f3056f);
                        C0273p c0273p2 = c0261d.f3049a;
                        if (c0273p2 != null) {
                            c0273p2.setCallback(null);
                        }
                        c0261d.f3049a = c0273p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0258a.f3046f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3054c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0261d.f3049a.f3101b.f3091b.f3089o.getOrDefault(string, null));
                        if (c0261d.f3051c == null) {
                            c0261d.f3051c = new ArrayList();
                            c0261d.d = new o.b();
                        }
                        c0261d.f3051c.add(loadAnimator);
                        c0261d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0261d.f3050b == null) {
            c0261d.f3050b = new AnimatorSet();
        }
        c0261d.f3050b.playTogether(c0261d.f3051c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3053b.f3049a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3057a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3053b.f3050b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.isStateful() : this.f3053b.f3049a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3053b.f3049a.setBounds(rect);
        }
    }

    @Override // l0.AbstractC0264g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.setLevel(i) : this.f3053b.f3049a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3057a;
        return drawable != null ? drawable.setState(iArr) : this.f3053b.f3049a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3053b.f3049a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3053b.f3049a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3053b.f3049a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            u1.d.p0(drawable, i);
        } else {
            this.f3053b.f3049a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3053b.f3049a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3053b.f3049a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3053b.f3049a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0261d c0261d = this.f3053b;
        if (c0261d.f3050b.isStarted()) {
            return;
        }
        c0261d.f3050b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3057a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3053b.f3050b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
