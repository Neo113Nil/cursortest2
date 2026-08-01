package k0;

import B.r;
import K.C0007d0;
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

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221f extends AbstractC0222g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3148c;

    /* renamed from: d, reason: collision with root package name */
    public C0007d0 f3149d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3150e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0218c f3151f = new C0218c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0219d f3147b = new C0219d();

    public C0221f(Context context) {
        this.f3148c = context;
    }

    @Override // k0.AbstractC0222g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0219d c0219d = this.f3147b;
        c0219d.f3142a.draw(canvas);
        if (c0219d.f3143b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getAlpha() : this.f3147b.f3142a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3147b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3152a;
        return drawable != null ? D.a.c(drawable) : this.f3147b.f3142a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3152a != null) {
            return new C0220e(this.f3152a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3147b.f3142a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3147b.f3142a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getOpacity() : this.f3147b.f3142a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0219d c0219d;
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0219d = this.f3147b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0216a.f3138e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0231p c0231p = new C0231p();
                        ThreadLocal threadLocal = r.f49a;
                        c0231p.f3152a = B.k.a(resources, resourceId, theme);
                        new C0230o(c0231p.f3152a.getConstantState());
                        c0231p.f3204f = false;
                        c0231p.setCallback(this.f3151f);
                        C0231p c0231p2 = c0219d.f3142a;
                        if (c0231p2 != null) {
                            c0231p2.setCallback(null);
                        }
                        c0219d.f3142a = c0231p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0216a.f3139f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3148c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0219d.f3142a.f3200b.f3189b.f3187o.getOrDefault(string, null));
                        if (c0219d.f3144c == null) {
                            c0219d.f3144c = new ArrayList();
                            c0219d.f3145d = new o.b();
                        }
                        c0219d.f3144c.add(loadAnimator);
                        c0219d.f3145d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0219d.f3143b == null) {
            c0219d.f3143b = new AnimatorSet();
        }
        c0219d.f3143b.playTogether(c0219d.f3144c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3147b.f3142a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3152a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3147b.f3143b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.isStateful() : this.f3147b.f3142a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3147b.f3142a.setBounds(rect);
        }
    }

    @Override // k0.AbstractC0222g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.setLevel(i) : this.f3147b.f3142a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.setState(iArr) : this.f3147b.f3142a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3147b.f3142a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3147b.f3142a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3147b.f3142a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            q1.d.X(drawable, i);
        } else {
            this.f3147b.f3142a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3147b.f3142a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3147b.f3142a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3147b.f3142a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0219d c0219d = this.f3147b;
        if (c0219d.f3143b.isStarted()) {
            return;
        }
        c0219d.f3143b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3147b.f3143b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
