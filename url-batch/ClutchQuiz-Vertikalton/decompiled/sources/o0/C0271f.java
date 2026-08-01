package o0;

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

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271f extends AbstractC0272g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3253c;
    public Y d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3254e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0268c f3255f = new C0268c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0269d f3252b = new C0269d();

    public C0271f(Context context) {
        this.f3253c = context;
    }

    @Override // o0.AbstractC0272g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0269d c0269d = this.f3252b;
        c0269d.f3248a.draw(canvas);
        if (c0269d.f3249b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getAlpha() : this.f3252b.f3248a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3252b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3256a;
        return drawable != null ? D.a.c(drawable) : this.f3252b.f3248a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3256a != null) {
            return new C0270e(this.f3256a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3252b.f3248a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3252b.f3248a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getOpacity() : this.f3252b.f3248a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0269d c0269d;
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0269d = this.f3252b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0266a.f3244e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0281p c0281p = new C0281p();
                        ThreadLocal threadLocal = r.f69a;
                        c0281p.f3256a = B.k.a(resources, resourceId, theme);
                        new C0280o(c0281p.f3256a.getConstantState());
                        c0281p.f3303f = false;
                        c0281p.setCallback(this.f3255f);
                        C0281p c0281p2 = c0269d.f3248a;
                        if (c0281p2 != null) {
                            c0281p2.setCallback(null);
                        }
                        c0269d.f3248a = c0281p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0266a.f3245f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3253c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0269d.f3248a.f3300b.f3290b.f3288o.getOrDefault(string, null));
                        if (c0269d.f3250c == null) {
                            c0269d.f3250c = new ArrayList();
                            c0269d.d = new o.b();
                        }
                        c0269d.f3250c.add(loadAnimator);
                        c0269d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0269d.f3249b == null) {
            c0269d.f3249b = new AnimatorSet();
        }
        c0269d.f3249b.playTogether(c0269d.f3250c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3252b.f3248a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3256a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3252b.f3249b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.isStateful() : this.f3252b.f3248a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3252b.f3248a.setBounds(rect);
        }
    }

    @Override // o0.AbstractC0272g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.setLevel(i) : this.f3252b.f3248a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.setState(iArr) : this.f3252b.f3248a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3252b.f3248a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3252b.f3248a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3252b.f3248a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            A.c.H0(drawable, i);
        } else {
            this.f3252b.f3248a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3252b.f3248a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3252b.f3248a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3252b.f3248a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0269d c0269d = this.f3252b;
        if (c0269d.f3249b.isStarted()) {
            return;
        }
        c0269d.f3249b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3252b.f3249b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
