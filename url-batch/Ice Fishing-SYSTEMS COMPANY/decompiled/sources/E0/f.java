package E0;

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

    /* renamed from: v, reason: collision with root package name */
    public final Context f746v;

    /* renamed from: w, reason: collision with root package name */
    public D0.k f747w = null;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f748x = null;

    /* renamed from: y, reason: collision with root package name */
    public final c f749y = new c(this);

    /* renamed from: u, reason: collision with root package name */
    public final d f745u = new d();

    public f(Context context) {
        this.f746v = context;
    }

    @Override // E0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return H.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f745u;
        dVar.f739a.draw(canvas);
        if (dVar.f740b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getAlpha() : this.f745u.f739a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f745u.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f750n;
        return drawable != null ? H.a.c(drawable) : this.f745u.f739a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f750n == null) {
            return null;
        }
        return new e(0, this.f750n.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f745u.f739a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f745u.f739a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getOpacity() : this.f745u.f739a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f745u;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f6 = F.b.f(resources, theme, attributeSet, a.f735e);
                    int resourceId = f6.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = F.o.f927a;
                        pVar.f750n = F.j.a(resources, resourceId, theme);
                        new o(pVar.f750n.getConstantState());
                        pVar.f808y = false;
                        pVar.setCallback(this.f749y);
                        p pVar2 = dVar.f739a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f739a = pVar;
                    }
                    f6.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f736f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f746v;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f739a.f804u.f790b.f788o.getOrDefault(string, null));
                        if (dVar.f741c == null) {
                            dVar.f741c = new ArrayList();
                            dVar.f742d = new s.b();
                        }
                        dVar.f741c.add(loadAnimator);
                        dVar.f742d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f740b == null) {
            dVar.f740b = new AnimatorSet();
        }
        dVar.f740b.playTogether(dVar.f741c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.isAutoMirrored() : this.f745u.f739a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f750n;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f745u.f740b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.isStateful() : this.f745u.f739a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f745u.f739a.setBounds(rect);
        }
    }

    @Override // E0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.setLevel(i) : this.f745u.f739a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.setState(iArr) : this.f745u.f739a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f745u.f739a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f745u.f739a.setAutoMirrored(z8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f745u.f739a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            com.bumptech.glide.g.S(drawable, i);
        } else {
            this.f745u.f739a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
        } else {
            this.f745u.f739a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.i(drawable, mode);
        } else {
            this.f745u.f739a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return drawable.setVisible(z8, z9);
        }
        this.f745u.f739a.setVisible(z8, z9);
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f745u;
        if (dVar.f740b.isStarted()) {
            return;
        }
        dVar.f740b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f745u.f740b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
