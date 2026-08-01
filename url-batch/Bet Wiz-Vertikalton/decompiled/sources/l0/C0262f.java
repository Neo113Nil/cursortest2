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
public final class C0262f extends AbstractC0263g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3107c;
    public Y d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3108e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0259c f3109f = new C0259c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0260d f3106b = new C0260d();

    public C0262f(Context context) {
        this.f3107c = context;
    }

    @Override // l0.AbstractC0263g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0260d c0260d = this.f3106b;
        c0260d.f3102a.draw(canvas);
        if (c0260d.f3103b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getAlpha() : this.f3106b.f3102a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3106b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3110a;
        return drawable != null ? D.a.c(drawable) : this.f3106b.f3102a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3110a != null) {
            return new C0261e(this.f3110a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3106b.f3102a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3106b.f3102a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getOpacity() : this.f3106b.f3102a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0260d c0260d;
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0260d = this.f3106b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0257a.f3098e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0272p c0272p = new C0272p();
                        ThreadLocal threadLocal = r.f38a;
                        c0272p.f3110a = B.k.a(resources, resourceId, theme);
                        new C0271o(c0272p.f3110a.getConstantState());
                        c0272p.f3157f = false;
                        c0272p.setCallback(this.f3109f);
                        C0272p c0272p2 = c0260d.f3102a;
                        if (c0272p2 != null) {
                            c0272p2.setCallback(null);
                        }
                        c0260d.f3102a = c0272p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0257a.f3099f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3107c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0260d.f3102a.f3154b.f3144b.f3142o.getOrDefault(string, null));
                        if (c0260d.f3104c == null) {
                            c0260d.f3104c = new ArrayList();
                            c0260d.d = new o.b();
                        }
                        c0260d.f3104c.add(loadAnimator);
                        c0260d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0260d.f3103b == null) {
            c0260d.f3103b = new AnimatorSet();
        }
        c0260d.f3103b.playTogether(c0260d.f3104c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3106b.f3102a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3110a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3106b.f3103b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.isStateful() : this.f3106b.f3102a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3106b.f3102a.setBounds(rect);
        }
    }

    @Override // l0.AbstractC0263g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.setLevel(i) : this.f3106b.f3102a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.setState(iArr) : this.f3106b.f3102a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3106b.f3102a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3106b.f3102a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3106b.f3102a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            x1.l.d0(drawable, i);
        } else {
            this.f3106b.f3102a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3106b.f3102a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3106b.f3102a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3106b.f3102a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0260d c0260d = this.f3106b;
        if (c0260d.f3103b.isStarted()) {
            return;
        }
        c0260d.f3103b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3106b.f3103b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
