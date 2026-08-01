package l0;

import B.r;
import K.Z;
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
    public final Context f3103c;
    public Z d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3104e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f3105f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f3102b = new d();

    public f(Context context) {
        this.f3103c = context;
    }

    @Override // l0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            D.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            return D.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f3102b;
        dVar.f3098a.draw(canvas);
        if (dVar.f3099b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.getAlpha() : this.f3102b.f3098a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3102b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3106a;
        return drawable != null ? D.a.c(drawable) : this.f3102b.f3098a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3106a != null) {
            return new e(this.f3106a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3102b.f3098a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3102b.f3098a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.getOpacity() : this.f3102b.f3098a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f3102b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0275a.f3094e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = r.f43a;
                        pVar.f3106a = B.k.a(resources, resourceId, theme);
                        new o(pVar.f3106a.getConstantState());
                        pVar.f3153f = false;
                        pVar.setCallback(this.f3105f);
                        p pVar2 = dVar.f3098a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f3098a = pVar;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0275a.f3095f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3103c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f3098a.f3150b.f3140b.f3138o.getOrDefault(string, null));
                        if (dVar.f3100c == null) {
                            dVar.f3100c = new ArrayList();
                            dVar.d = new o.b();
                        }
                        dVar.f3100c.add(loadAnimator);
                        dVar.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f3099b == null) {
            dVar.f3099b = new AnimatorSet();
        }
        dVar.f3099b.playTogether(dVar.f3100c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3102b.f3098a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3106a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3102b.f3099b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.isStateful() : this.f3102b.f3098a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3102b.f3098a.setBounds(rect);
        }
    }

    @Override // l0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.setLevel(i) : this.f3102b.f3098a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3106a;
        return drawable != null ? drawable.setState(iArr) : this.f3102b.f3098a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3102b.f3098a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3102b.f3098a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3102b.f3098a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            q1.d.r0(drawable, i);
        } else {
            this.f3102b.f3098a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
        } else {
            this.f3102b.f3098a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            D.a.i(drawable, mode);
        } else {
            this.f3102b.f3098a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3102b.f3098a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f3102b;
        if (dVar.f3099b.isStarted()) {
            return;
        }
        dVar.f3099b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3106a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3102b.f3099b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
