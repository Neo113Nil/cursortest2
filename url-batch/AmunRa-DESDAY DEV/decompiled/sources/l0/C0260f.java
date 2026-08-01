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
public final class C0260f extends AbstractC0261g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3198c;
    public Y d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3199e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0257c f3200f = new C0257c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0258d f3197b = new C0258d();

    public C0260f(Context context) {
        this.f3198c = context;
    }

    @Override // l0.AbstractC0261g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0258d c0258d = this.f3197b;
        c0258d.f3193a.draw(canvas);
        if (c0258d.f3194b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getAlpha() : this.f3197b.f3193a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3197b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3201a;
        return drawable != null ? D.a.c(drawable) : this.f3197b.f3193a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3201a != null) {
            return new C0259e(this.f3201a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3197b.f3193a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3197b.f3193a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getOpacity() : this.f3197b.f3193a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0258d c0258d;
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0258d = this.f3197b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0255a.f3189e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0270p c0270p = new C0270p();
                        ThreadLocal threadLocal = r.f38a;
                        c0270p.f3201a = B.k.a(resources, resourceId, theme);
                        new C0269o(c0270p.f3201a.getConstantState());
                        c0270p.f3248f = false;
                        c0270p.setCallback(this.f3200f);
                        C0270p c0270p2 = c0258d.f3193a;
                        if (c0270p2 != null) {
                            c0270p2.setCallback(null);
                        }
                        c0258d.f3193a = c0270p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0255a.f3190f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3198c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0258d.f3193a.f3245b.f3235b.f3233o.getOrDefault(string, null));
                        if (c0258d.f3195c == null) {
                            c0258d.f3195c = new ArrayList();
                            c0258d.d = new o.b();
                        }
                        c0258d.f3195c.add(loadAnimator);
                        c0258d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0258d.f3194b == null) {
            c0258d.f3194b = new AnimatorSet();
        }
        c0258d.f3194b.playTogether(c0258d.f3195c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3197b.f3193a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3201a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3197b.f3194b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.isStateful() : this.f3197b.f3193a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3197b.f3193a.setBounds(rect);
        }
    }

    @Override // l0.AbstractC0261g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.setLevel(i) : this.f3197b.f3193a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.setState(iArr) : this.f3197b.f3193a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3197b.f3193a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3197b.f3193a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3197b.f3193a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            s1.d.i0(drawable, i);
        } else {
            this.f3197b.f3193a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3197b.f3193a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3197b.f3193a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3197b.f3193a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0258d c0258d = this.f3197b;
        if (c0258d.f3194b.isStarted()) {
            return;
        }
        c0258d.f3194b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3197b.f3194b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
