package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends g implements android.support.graphics.drawable.b {

    /* renamed from: a, reason: collision with root package name */
    final Drawable.Callback f1506a;

    /* renamed from: c, reason: collision with root package name */
    private a f1507c;

    /* renamed from: d, reason: collision with root package name */
    private Context f1508d;
    private ArgbEvaluator e;
    private Animator.AnimatorListener f;
    private ArrayList<Object> g;

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    private AnimatedVectorDrawableCompat(Context context, a aVar, Resources resources) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.f1506a = new Drawable.Callback() { // from class: android.support.graphics.drawable.AnimatedVectorDrawableCompat.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.f1508d = context;
        if (aVar != null) {
            this.f1507c = aVar;
        } else {
            this.f1507c = new a(context, aVar, this.f1506a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f1543b != null) {
            this.f1543b.mutate();
        }
        return this;
    }

    public static AnimatedVectorDrawableCompat a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1543b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.f1543b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f1543b != null) {
            return this.f1543b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1507c.f1510a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1543b != null) {
            this.f1543b.draw(canvas);
            return;
        }
        this.f1507c.f1511b.draw(canvas);
        if (this.f1507c.f1512c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f1543b != null) {
            this.f1543b.setBounds(rect);
        } else {
            this.f1507c.f1511b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f1543b != null) {
            return this.f1543b.setState(iArr);
        }
        return this.f1507c.f1511b.setState(iArr);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f1543b != null) {
            return this.f1543b.setLevel(i);
        }
        return this.f1507c.f1511b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f1543b != null) {
            return DrawableCompat.getAlpha(this.f1543b);
        }
        return this.f1507c.f1511b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f1543b != null) {
            this.f1543b.setAlpha(i);
        } else {
            this.f1507c.f1511b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1543b != null) {
            this.f1543b.setColorFilter(colorFilter);
        } else {
            this.f1507c.f1511b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.f1543b != null) {
            DrawableCompat.setTint(this.f1543b, i);
        } else {
            this.f1507c.f1511b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f1543b != null) {
            DrawableCompat.setTintList(this.f1543b, colorStateList);
        } else {
            this.f1507c.f1511b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f1543b != null) {
            DrawableCompat.setTintMode(this.f1543b, mode);
        } else {
            this.f1507c.f1511b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1543b != null) {
            return this.f1543b.setVisible(z, z2);
        }
        this.f1507c.f1511b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f1543b != null) {
            return this.f1543b.isStateful();
        }
        return this.f1507c.f1511b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f1543b != null) {
            return this.f1543b.getOpacity();
        }
        return this.f1507c.f1511b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1543b != null) {
            return this.f1543b.getIntrinsicWidth();
        }
        return this.f1507c.f1511b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1543b != null) {
            return this.f1543b.getIntrinsicHeight();
        }
        return this.f1507c.f1511b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f1543b != null) {
            return DrawableCompat.isAutoMirrored(this.f1543b);
        }
        return this.f1507c.f1511b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f1543b != null) {
            DrawableCompat.setAutoMirrored(this.f1543b, z);
        } else {
            this.f1507c.f1511b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f1543b != null) {
            DrawableCompat.inflate(this.f1543b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat a2 = VectorDrawableCompat.a(resources, resourceId, theme);
                        a2.a(false);
                        a2.setCallback(this.f1506a);
                        if (this.f1507c.f1511b != null) {
                            this.f1507c.f1511b.setCallback(null);
                        }
                        this.f1507c.f1511b = a2;
                    }
                    obtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, android.support.graphics.drawable.a.f);
                    String string = obtainAttributes2.getString(0);
                    int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f1508d != null) {
                            a(string, d.a(this.f1508d, resourceId2));
                        } else {
                            obtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f1507c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f1543b != null) {
            DrawableCompat.applyTheme(this.f1543b, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f1543b != null) {
            return DrawableCompat.canApplyTheme(this.f1543b);
        }
        return false;
    }

    private static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1514a;

        public b(Drawable.ConstantState constantState) {
            this.f1514a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1543b = this.f1514a.newDrawable();
            animatedVectorDrawableCompat.f1543b.setCallback(animatedVectorDrawableCompat.f1506a);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1543b = this.f1514a.newDrawable(resources);
            animatedVectorDrawableCompat.f1543b.setCallback(animatedVectorDrawableCompat.f1506a);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.f1543b = this.f1514a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f1543b.setCallback(animatedVectorDrawableCompat.f1506a);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1514a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1514a.getChangingConfigurations();
        }
    }

    private static class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1510a;

        /* renamed from: b, reason: collision with root package name */
        VectorDrawableCompat f1511b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f1512c;

        /* renamed from: d, reason: collision with root package name */
        ArrayMap<Animator, String> f1513d;
        private ArrayList<Animator> e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f1510a = aVar.f1510a;
                if (aVar.f1511b != null) {
                    Drawable.ConstantState constantState = aVar.f1511b.getConstantState();
                    if (resources != null) {
                        this.f1511b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f1511b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    this.f1511b = (VectorDrawableCompat) this.f1511b.mutate();
                    this.f1511b.setCallback(callback);
                    this.f1511b.setBounds(aVar.f1511b.getBounds());
                    this.f1511b.a(false);
                }
                if (aVar.e != null) {
                    int size = aVar.e.size();
                    this.e = new ArrayList<>(size);
                    this.f1513d = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.e.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f1513d.get(animator);
                        clone.setTarget(this.f1511b.a(str));
                        this.e.add(clone);
                        this.f1513d.put(clone, str);
                    }
                    a();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1510a;
        }

        public void a() {
            if (this.f1512c == null) {
                this.f1512c = new AnimatorSet();
            }
            this.f1512c.playTogether(this.e);
        }
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f1507c.f1511b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        if (this.f1507c.e == null) {
            this.f1507c.e = new ArrayList();
            this.f1507c.f1513d = new ArrayMap<>();
        }
        this.f1507c.e.add(animator);
        this.f1507c.f1513d.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f1543b != null) {
            return ((AnimatedVectorDrawable) this.f1543b).isRunning();
        }
        return this.f1507c.f1512c.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f1543b != null) {
            ((AnimatedVectorDrawable) this.f1543b).start();
        } else {
            if (this.f1507c.f1512c.isStarted()) {
                return;
            }
            this.f1507c.f1512c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f1543b != null) {
            ((AnimatedVectorDrawable) this.f1543b).stop();
        } else {
            this.f1507c.f1512c.end();
        }
    }
}
