package S;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import n.C0268a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC0291b;
import s.AbstractC0298i;
import s.AbstractC0302m;
import u.AbstractC0309a;

/* loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public final Context f1004g;

    /* renamed from: h, reason: collision with root package name */
    public final b f1005h = new b(this);

    /* renamed from: f, reason: collision with root package name */
    public final c f1003f = new c();

    public e(Context context) {
        this.f1004g = context;
    }

    @Override // S.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return AbstractC0309a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f1003f;
        cVar.f998a.draw(canvas);
        if (cVar.f999b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getAlpha() : this.f1003f.f998a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1003f.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1008e;
        return drawable != null ? AbstractC0309a.c(drawable) : this.f1003f.f998a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1008e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f1008e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1003f.f998a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1003f.f998a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getOpacity() : this.f1003f.f998a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x018a, code lost:
    
        if (r8.f999b != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018c, code lost:
    
        r8.f999b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0193, code lost:
    
        r8.f999b.playTogether(r8.f1000c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x019a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser;
        XmlResourceParser animation;
        Animator a2;
        q qVar;
        int next;
        q qVar2;
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c cVar = this.f1003f;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray h2 = AbstractC0291b.h(resources, theme, attributeSet, a.f989e);
                    int resourceId = h2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = q.f1063n;
                        if (Build.VERSION.SDK_INT >= 24) {
                            qVar = new q();
                            ThreadLocal threadLocal = AbstractC0302m.f3421a;
                            qVar.f1008e = AbstractC0298i.a(resources, resourceId, theme);
                            new p(qVar.f1008e.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                qVar = new q();
                                qVar.inflate(resources, xml, asAttributeSet, theme);
                            } catch (IOException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                qVar = null;
                                qVar.f1068j = false;
                                qVar.setCallback(this.f1005h);
                                qVar2 = cVar.f998a;
                                if (qVar2 != null) {
                                }
                                cVar.f998a = qVar;
                                h2.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                qVar = null;
                                qVar.f1068j = false;
                                qVar.setCallback(this.f1005h);
                                qVar2 = cVar.f998a;
                                if (qVar2 != null) {
                                }
                                cVar.f998a = qVar;
                                h2.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        qVar.f1068j = false;
                        qVar.setCallback(this.f1005h);
                        qVar2 = cVar.f998a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        cVar.f998a = qVar;
                    }
                    h2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f990f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1004g;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    xmlResourceParser = context;
                                }
                                try {
                                    a2 = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e5) {
                                    e = e5;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e6) {
                                e = e6;
                            } catch (XmlPullParserException e7) {
                                e = e7;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = null;
                            }
                        }
                        a2.setTarget(cVar.f998a.f1064f.f1051b.f1049o.getOrDefault(string, null));
                        if (cVar.f1000c == null) {
                            cVar.f1000c = new ArrayList();
                            cVar.f1001d = new C0268a();
                        }
                        cVar.f1000c.add(a2);
                        cVar.f1001d.put(a2, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.isAutoMirrored() : this.f1003f.f998a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1008e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1003f.f999b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.isStateful() : this.f1003f.f998a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1003f.f998a.setBounds(rect);
        }
    }

    @Override // S.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.setLevel(i2) : this.f1003f.f998a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.setState(iArr) : this.f1003f.f998a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f1003f.f998a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f1003f.f998a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1003f.f998a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            w0.j.b(drawable, i2);
        } else {
            this.f1003f.f998a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.h(drawable, colorStateList);
        } else {
            this.f1003f.f998a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.i(drawable, mode);
        } else {
            this.f1003f.f998a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f1003f.f998a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f1003f;
        if (cVar.f999b.isStarted()) {
            return;
        }
        cVar.f999b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1003f.f999b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
