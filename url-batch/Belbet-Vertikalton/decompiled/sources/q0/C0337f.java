package q0;

import D.q;
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

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337f extends AbstractC0338g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3943c;

    /* renamed from: d, reason: collision with root package name */
    public I0.i f3944d = null;
    public ArrayList e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0334c f3945f = new C0334c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0335d f3942b = new C0335d();

    public C0337f(Context context) {
        this.f3943c = context;
    }

    @Override // q0.AbstractC0338g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return F.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0335d c0335d = this.f3942b;
        c0335d.f3937a.draw(canvas);
        if (c0335d.f3938b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getAlpha() : this.f3942b.f3937a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3942b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3946a;
        return drawable != null ? F.a.c(drawable) : this.f3942b.f3937a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3946a != null) {
            return new C0336e(this.f3946a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3942b.f3937a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3942b.f3937a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getOpacity() : this.f3942b.f3937a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0335d c0335d;
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0335d = this.f3942b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = D.b.f(resources, theme, attributeSet, AbstractC0332a.e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0347p c0347p = new C0347p();
                        ThreadLocal threadLocal = q.f192a;
                        c0347p.f3946a = D.j.a(resources, resourceId, theme);
                        new C0346o(c0347p.f3946a.getConstantState());
                        c0347p.f3992f = false;
                        c0347p.setCallback(this.f3945f);
                        C0347p c0347p2 = c0335d.f3937a;
                        if (c0347p2 != null) {
                            c0347p2.setCallback(null);
                        }
                        c0335d.f3937a = c0347p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0332a.f3934f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3943c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0335d.f3937a.f3989b.f3980b.f3978o.getOrDefault(string, null));
                        if (c0335d.f3939c == null) {
                            c0335d.f3939c = new ArrayList();
                            c0335d.f3940d = new q.b();
                        }
                        c0335d.f3939c.add(loadAnimator);
                        c0335d.f3940d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0335d.f3938b == null) {
            c0335d.f3938b = new AnimatorSet();
        }
        c0335d.f3938b.playTogether(c0335d.f3939c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3942b.f3937a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3946a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3942b.f3938b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.isStateful() : this.f3942b.f3937a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3942b.f3937a.setBounds(rect);
        }
    }

    @Override // q0.AbstractC0338g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.setLevel(i) : this.f3942b.f3937a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.setState(iArr) : this.f3942b.f3937a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3942b.f3937a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3942b.f3937a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3942b.f3937a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            H1.l.d0(drawable, i);
        } else {
            this.f3942b.f3937a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.h(drawable, colorStateList);
        } else {
            this.f3942b.f3937a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.i(drawable, mode);
        } else {
            this.f3942b.f3937a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3942b.f3937a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0335d c0335d = this.f3942b;
        if (c0335d.f3938b.isStarted()) {
            return;
        }
        c0335d.f3938b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3942b.f3938b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
