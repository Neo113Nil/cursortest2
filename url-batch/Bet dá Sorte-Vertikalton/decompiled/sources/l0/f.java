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

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3086c;
    public Y d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3087e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f3088f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f3085b = new d();

    public f(Context context) {
        this.f3086c = context;
    }

    @Override // l0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f3085b;
        dVar.f3081a.draw(canvas);
        if (dVar.f3082b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.getAlpha() : this.f3085b.f3081a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3085b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3089a;
        return drawable != null ? D.a.c(drawable) : this.f3085b.f3081a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3089a != null) {
            return new e(this.f3089a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3085b.f3081a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3085b.f3081a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.getOpacity() : this.f3085b.f3081a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f3085b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0251a.f3077e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = r.f66a;
                        pVar.f3089a = B.k.a(resources, resourceId, theme);
                        new o(pVar.f3089a.getConstantState());
                        pVar.f3136f = false;
                        pVar.setCallback(this.f3088f);
                        p pVar2 = dVar.f3081a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f3081a = pVar;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0251a.f3078f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3086c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f3081a.f3133b.f3123b.f3121o.getOrDefault(string, null));
                        if (dVar.f3083c == null) {
                            dVar.f3083c = new ArrayList();
                            dVar.d = new o.b();
                        }
                        dVar.f3083c.add(loadAnimator);
                        dVar.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f3082b == null) {
            dVar.f3082b = new AnimatorSet();
        }
        dVar.f3082b.playTogether(dVar.f3083c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3085b.f3081a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3089a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3085b.f3082b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.isStateful() : this.f3085b.f3081a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3085b.f3081a.setBounds(rect);
        }
    }

    @Override // l0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.setLevel(i) : this.f3085b.f3081a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3089a;
        return drawable != null ? drawable.setState(iArr) : this.f3085b.f3081a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3085b.f3081a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3085b.f3081a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3085b.f3081a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            u1.d.g0(drawable, i);
        } else {
            this.f3085b.f3081a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3085b.f3081a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3085b.f3081a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3085b.f3081a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f3085b;
        if (dVar.f3082b.isStarted()) {
            return;
        }
        dVar.f3082b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3089a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3085b.f3082b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
