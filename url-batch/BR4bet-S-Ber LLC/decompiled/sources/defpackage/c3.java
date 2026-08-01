package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c3 extends db0 implements Animatable {
    public final Context h;
    public w0 i = null;
    public ArrayList j = null;
    public final z2 k = new z2(this);
    public final a3 g = new a3();

    public c3(Context context) {
        this.h = context;
    }

    @Override // defpackage.db0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        a3 a3Var = this.g;
        a3Var.a.draw(canvas);
        if (a3Var.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.g.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getColorFilter() : this.g.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new b3(this.f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.g.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.g.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getOpacity() : this.g.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        a3 a3Var;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            a3Var = this.g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray x = b9.x(resources, theme, attributeSet, xf.e);
                    int resourceId = x.getResourceId(0, 0);
                    if (resourceId != 0) {
                        mb0 mb0Var = new mb0();
                        ThreadLocal threadLocal = k30.a;
                        mb0Var.f = resources.getDrawable(resourceId, theme);
                        new lb0(mb0Var.f.getConstantState());
                        mb0Var.k = false;
                        mb0Var.setCallback(this.k);
                        mb0 mb0Var2 = a3Var.a;
                        if (mb0Var2 != null) {
                            mb0Var2.setCallback(null);
                        }
                        a3Var.a = mb0Var;
                    }
                    x.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, xf.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            g9.s("Context can't be null when inflating animators");
                            return;
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(a3Var.a.g.b.o.get(string));
                        if (a3Var.c == null) {
                            a3Var.c = new ArrayList();
                            a3Var.d = new x6(0);
                        }
                        a3Var.c.add(loadAnimator);
                        a3Var.d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (a3Var.b == null) {
            a3Var.b = new AnimatorSet();
        }
        a3Var.b.playTogether(a3Var.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.g.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isStateful() : this.g.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.g.a.setBounds(rect);
        }
    }

    @Override // defpackage.db0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setLevel(i) : this.g.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setState(iArr) : this.g.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.g.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.g.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.g.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.g.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.g.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.g.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        a3 a3Var = this.g;
        if (a3Var.b.isStarted()) {
            return;
        }
        a3Var.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.g.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
