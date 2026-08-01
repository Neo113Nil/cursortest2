package n0;

import C.r;
import L.C0003b0;
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

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269f extends AbstractC0270g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3327c;
    public C0003b0 d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3328e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0266c f3329f = new C0266c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0267d f3326b = new C0267d();

    public C0269f(Context context) {
        this.f3327c = context;
    }

    @Override // n0.AbstractC0270g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return E.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0267d c0267d = this.f3326b;
        c0267d.f3322a.draw(canvas);
        if (c0267d.f3323b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getAlpha() : this.f3326b.f3322a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3326b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3330a;
        return drawable != null ? E.a.c(drawable) : this.f3326b.f3322a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3330a != null) {
            return new C0268e(this.f3330a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3326b.f3322a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3326b.f3322a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getOpacity() : this.f3326b.f3322a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0267d c0267d;
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0267d = this.f3326b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = C.b.f(resources, theme, attributeSet, AbstractC0264a.f3318e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0279p c0279p = new C0279p();
                        ThreadLocal threadLocal = r.f99a;
                        c0279p.f3330a = C.k.a(resources, resourceId, theme);
                        new C0278o(c0279p.f3330a.getConstantState());
                        c0279p.f3381f = false;
                        c0279p.setCallback(this.f3329f);
                        C0279p c0279p2 = c0267d.f3322a;
                        if (c0279p2 != null) {
                            c0279p2.setCallback(null);
                        }
                        c0267d.f3322a = c0279p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0264a.f3319f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3327c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0267d.f3322a.f3378b.f3367b.f3365o.getOrDefault(string, null));
                        if (c0267d.f3324c == null) {
                            c0267d.f3324c = new ArrayList();
                            c0267d.d = new p.b();
                        }
                        c0267d.f3324c.add(loadAnimator);
                        c0267d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0267d.f3323b == null) {
            c0267d.f3323b = new AnimatorSet();
        }
        c0267d.f3323b.playTogether(c0267d.f3324c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3326b.f3322a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3330a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3326b.f3323b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.isStateful() : this.f3326b.f3322a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3326b.f3322a.setBounds(rect);
        }
    }

    @Override // n0.AbstractC0270g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.setLevel(i) : this.f3326b.f3322a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.setState(iArr) : this.f3326b.f3322a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3326b.f3322a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3326b.f3322a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3326b.f3322a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            A1.m.i0(drawable, i);
        } else {
            this.f3326b.f3322a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.h(drawable, colorStateList);
        } else {
            this.f3326b.f3322a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.i(drawable, mode);
        } else {
            this.f3326b.f3322a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3326b.f3322a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0267d c0267d = this.f3326b;
        if (c0267d.f3323b.isStarted()) {
            return;
        }
        c0267d.f3323b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3326b.f3323b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
