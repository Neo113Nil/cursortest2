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
public final class C0269f extends AbstractC0270g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3160c;
    public C0003b0 d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3161e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0266c f3162f = new C0266c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0267d f3159b = new C0267d();

    public C0269f(Context context) {
        this.f3160c = context;
    }

    @Override // m0.AbstractC0270g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0267d c0267d = this.f3159b;
        c0267d.f3155a.draw(canvas);
        if (c0267d.f3156b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getAlpha() : this.f3159b.f3155a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3159b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3163a;
        return drawable != null ? D.a.c(drawable) : this.f3159b.f3155a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3163a != null) {
            return new C0268e(this.f3163a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3159b.f3155a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3159b.f3155a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getOpacity() : this.f3159b.f3155a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0267d c0267d;
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0267d = this.f3159b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0264a.f3151e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0279p c0279p = new C0279p();
                        ThreadLocal threadLocal = r.f58a;
                        c0279p.f3163a = B.k.a(resources, resourceId, theme);
                        new C0278o(c0279p.f3163a.getConstantState());
                        c0279p.f3210f = false;
                        c0279p.setCallback(this.f3162f);
                        C0279p c0279p2 = c0267d.f3155a;
                        if (c0279p2 != null) {
                            c0279p2.setCallback(null);
                        }
                        c0267d.f3155a = c0279p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0264a.f3152f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3160c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0267d.f3155a.f3207b.f3197b.f3195o.getOrDefault(string, null));
                        if (c0267d.f3157c == null) {
                            c0267d.f3157c = new ArrayList();
                            c0267d.d = new o.b();
                        }
                        c0267d.f3157c.add(loadAnimator);
                        c0267d.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0267d.f3156b == null) {
            c0267d.f3156b = new AnimatorSet();
        }
        c0267d.f3156b.playTogether(c0267d.f3157c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3159b.f3155a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3163a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3159b.f3156b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.isStateful() : this.f3159b.f3155a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3159b.f3155a.setBounds(rect);
        }
    }

    @Override // m0.AbstractC0270g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.setLevel(i) : this.f3159b.f3155a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.setState(iArr) : this.f3159b.f3155a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3159b.f3155a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3159b.f3155a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3159b.f3155a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            z1.d.r0(drawable, i);
        } else {
            this.f3159b.f3155a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3159b.f3155a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3159b.f3155a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3159b.f3155a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0267d c0267d = this.f3159b;
        if (c0267d.f3156b.isStarted()) {
            return;
        }
        c0267d.f3156b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3159b.f3156b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
