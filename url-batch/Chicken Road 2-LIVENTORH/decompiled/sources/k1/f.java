package k1;

import a.y;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: h, reason: collision with root package name */
    public final Context f2172h;
    public j1.k i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2173j = null;

    /* renamed from: k, reason: collision with root package name */
    public final c f2174k = new c(this);

    /* renamed from: g, reason: collision with root package name */
    public final d f2171g = new d();

    public f(Context context, int i) {
        this.f2172h = context;
    }

    @Override // k1.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f2171g;
        dVar.f2167a.draw(canvas);
        if (dVar.f2168b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getAlpha() : this.f2171g.f2167a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2171g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getColorFilter() : this.f2171g.f2167a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2175f != null) {
            return new e(this.f2175f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2171g.f2167a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2171g.f2167a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getOpacity() : this.f2171g.f2167a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f2171g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = e0.b.f(resources, theme, attributeSet, a.f2163e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = e0.m.f1158a;
                        pVar.f2175f = resources.getDrawable(resourceId, theme);
                        new o(pVar.f2175f.getConstantState());
                        pVar.f2226k = false;
                        pVar.setCallback(this.f2174k);
                        p pVar2 = dVar.f2167a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f2167a = pVar;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f2164f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2172h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f2167a.f2223g.f2212b.f2210o.get(string));
                        if (dVar.f2169c == null) {
                            dVar.f2169c = new ArrayList();
                            dVar.d = new q.f(0);
                        }
                        dVar.f2169c.add(loadAnimator);
                        dVar.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f2168b == null) {
            dVar.f2168b = new AnimatorSet();
        }
        dVar.f2168b.playTogether(dVar.f2169c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.isAutoMirrored() : this.f2171g.f2167a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2175f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2171g.f2168b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.isStateful() : this.f2171g.f2167a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2171g.f2167a.setBounds(rect);
        }
    }

    @Override // k1.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.setLevel(i) : this.f2171g.f2167a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.setState(iArr) : this.f2171g.f2167a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2171g.f2167a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f2171g.f2167a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2171g.f2167a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            y.T(drawable, i);
        } else {
            this.f2171g.f2167a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2171g.f2167a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2171g.f2167a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f2171g.f2167a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f2171g;
        if (dVar.f2168b.isStarted()) {
            return;
        }
        dVar.f2168b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2171g.f2168b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
