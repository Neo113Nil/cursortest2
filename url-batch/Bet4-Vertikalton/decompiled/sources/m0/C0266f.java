package m0;

import B.r;
import K.C0003b0;
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

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266f extends AbstractC0267g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3136c;
    public C0003b0 d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3137e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0263c f3138f = new C0263c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0264d f3135b = new C0264d();

    public C0266f(Context context) {
        this.f3136c = context;
    }

    @Override // m0.AbstractC0267g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0264d c0264d = this.f3135b;
        c0264d.f3131a.draw(canvas);
        if (c0264d.f3132b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getAlpha() : this.f3135b.f3131a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3135b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3139a;
        return drawable != null ? D.a.c(drawable) : this.f3135b.f3131a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3139a != null) {
            return new C0265e(this.f3139a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3135b.f3131a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3135b.f3131a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getOpacity() : this.f3135b.f3131a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0264d c0264d;
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0264d = this.f3135b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0261a.f3127e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0276p c0276p = new C0276p();
                        ThreadLocal threadLocal = r.f44a;
                        c0276p.f3139a = B.k.a(resources, resourceId, theme);
                        new C0275o(c0276p.f3139a.getConstantState());
                        c0276p.f3186f = false;
                        c0276p.setCallback(this.f3138f);
                        C0276p c0276p2 = c0264d.f3131a;
                        if (c0276p2 != null) {
                            c0276p2.setCallback(null);
                        }
                        c0264d.f3131a = c0276p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0261a.f3128f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3136c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0264d.f3131a.f3183b.f3173b.f3171o.getOrDefault(string, null));
                        if (c0264d.f3133c == null) {
                            c0264d.f3133c = new ArrayList();
                            c0264d.d = new o.b();
                        }
                        c0264d.f3133c.add(loadAnimator);
                        c0264d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0264d.f3132b == null) {
            c0264d.f3132b = new AnimatorSet();
        }
        c0264d.f3132b.playTogether(c0264d.f3133c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3135b.f3131a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3139a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3135b.f3132b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.isStateful() : this.f3135b.f3131a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3135b.f3131a.setBounds(rect);
        }
    }

    @Override // m0.AbstractC0267g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.setLevel(i) : this.f3135b.f3131a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.setState(iArr) : this.f3135b.f3131a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3135b.f3131a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3135b.f3131a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3135b.f3131a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            w1.l.Y(drawable, i);
        } else {
            this.f3135b.f3131a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3135b.f3131a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3135b.f3131a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3135b.f3131a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0264d c0264d = this.f3135b;
        if (c0264d.f3132b.isStarted()) {
            return;
        }
        c0264d.f3132b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3135b.f3132b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
