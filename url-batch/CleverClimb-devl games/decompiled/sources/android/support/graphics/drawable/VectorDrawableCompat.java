package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class VectorDrawableCompat extends android.support.graphics.drawable.g {

    /* renamed from: a, reason: collision with root package name */
    static final PorterDuff.Mode f1515a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private f f1516c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f1517d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private Drawable.ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

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
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    VectorDrawableCompat() {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f1516c = new f();
    }

    VectorDrawableCompat(f fVar) {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f1516c = fVar;
        this.f1517d = a(this.f1517d, fVar.f1532c, fVar.f1533d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f1543b != null) {
            this.f1543b.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f1516c = new f(this.f1516c);
            this.f = true;
        }
        return this;
    }

    Object a(String str) {
        return this.f1516c.f1531b.h.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1543b != null && Build.VERSION.SDK_INT >= 24) {
            return new g(this.f1543b.getConstantState());
        }
        this.f1516c.f1530a = getChangingConfigurations();
        return this.f1516c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1543b != null) {
            this.f1543b.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() <= 0 || this.k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e == null ? this.f1517d : this.e;
        canvas.getMatrix(this.j);
        this.j.getValues(this.i);
        float abs = Math.abs(this.i[0]);
        float abs2 = Math.abs(this.i[4]);
        float abs3 = Math.abs(this.i[1]);
        float abs4 = Math.abs(this.i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.k.width() * abs));
        int min2 = Math.min(2048, (int) (this.k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.k.left, this.k.top);
        if (a()) {
            canvas.translate(this.k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.k.offsetTo(0, 0);
        this.f1516c.b(min, min2);
        if (!this.g) {
            this.f1516c.a(min, min2);
        } else if (!this.f1516c.b()) {
            this.f1516c.a(min, min2);
            this.f1516c.c();
        }
        this.f1516c.a(canvas, colorFilter, this.k);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f1543b != null) {
            return DrawableCompat.getAlpha(this.f1543b);
        }
        return this.f1516c.f1531b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f1543b != null) {
            this.f1543b.setAlpha(i);
        } else if (this.f1516c.f1531b.getRootAlpha() != i) {
            this.f1516c.f1531b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1543b != null) {
            this.f1543b.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.f1543b != null) {
            DrawableCompat.setTint(this.f1543b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f1543b != null) {
            DrawableCompat.setTintList(this.f1543b, colorStateList);
            return;
        }
        f fVar = this.f1516c;
        if (fVar.f1532c != colorStateList) {
            fVar.f1532c = colorStateList;
            this.f1517d = a(this.f1517d, colorStateList, fVar.f1533d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f1543b != null) {
            DrawableCompat.setTintMode(this.f1543b, mode);
            return;
        }
        f fVar = this.f1516c;
        if (fVar.f1533d != mode) {
            fVar.f1533d = mode;
            this.f1517d = a(this.f1517d, fVar.f1532c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f1543b != null) {
            return this.f1543b.isStateful();
        }
        return super.isStateful() || !(this.f1516c == null || this.f1516c.f1532c == null || !this.f1516c.f1532c.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f1543b != null) {
            return this.f1543b.setState(iArr);
        }
        f fVar = this.f1516c;
        if (fVar.f1532c == null || fVar.f1533d == null) {
            return false;
        }
        this.f1517d = a(this.f1517d, fVar.f1532c, fVar.f1533d);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f1543b != null) {
            return this.f1543b.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1543b != null) {
            return this.f1543b.getIntrinsicWidth();
        }
        return (int) this.f1516c.f1531b.f1527b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1543b != null) {
            return this.f1543b.getIntrinsicHeight();
        }
        return (int) this.f1516c.f1531b.f1528c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f1543b == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(this.f1543b);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f1543b != null) {
            return DrawableCompat.isAutoMirrored(this.f1543b);
        }
        return this.f1516c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f1543b != null) {
            DrawableCompat.setAutoMirrored(this.f1543b, z);
        } else {
            this.f1516c.e = z;
        }
    }

    public static VectorDrawableCompat a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1543b = ResourcesCompat.getDrawable(resources, i, theme);
            vectorDrawableCompat.h = new g(vectorDrawableCompat.f1543b.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
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
            return a(resources, xml, asAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static VectorDrawableCompat a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int a(int i, float f2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f1543b != null) {
            this.f1543b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f1543b != null) {
            DrawableCompat.inflate(this.f1543b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.f1516c;
        fVar.f1531b = new e();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.f1535a);
        a(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
        fVar.f1530a = getChangingConfigurations();
        fVar.k = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.f1517d = a(this.f1517d, fVar.f1532c, fVar.f1533d);
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        f fVar = this.f1516c;
        e eVar = fVar.f1531b;
        fVar.f1533d = a(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f1532c = colorStateList;
        }
        fVar.e = TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, fVar.e);
        eVar.f1529d = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f1529d);
        eVar.e = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, eVar.e);
        if (eVar.f1529d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (eVar.e <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        eVar.f1527b = typedArray.getDimension(3, eVar.f1527b);
        eVar.f1528c = typedArray.getDimension(2, eVar.f1528c);
        if (eVar.f1527b <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (eVar.f1528c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        eVar.setAlpha(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            eVar.g = string;
            eVar.h.put(string, eVar);
        }
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar = this.f1516c;
        e eVar = fVar.f1531b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(eVar.f1526a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1522a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    fVar.f1530a = bVar.o | fVar.f1530a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1522a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.h.put(aVar.getPathName(), aVar);
                    }
                    fVar.f1530a = aVar.o | fVar.f1530a;
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    cVar2.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1522a.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.h.put(cVar2.getGroupName(), cVar2);
                    }
                    fVar.f1530a = cVar2.f1524c | fVar.f1530a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    void a(boolean z) {
        this.g = z;
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f1543b != null) {
            this.f1543b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f1543b != null) {
            return this.f1543b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1516c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f1543b != null) {
            this.f1543b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f1543b != null) {
            this.f1543b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1543b != null) {
            return this.f1543b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.f1543b != null) {
            this.f1543b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1534a;

        public g(Drawable.ConstantState constantState) {
            this.f1534a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1543b = (VectorDrawable) this.f1534a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1543b = (VectorDrawable) this.f1534a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1543b = (VectorDrawable) this.f1534a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1534a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1534a.getChangingConfigurations();
        }
    }

    private static class f extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1530a;

        /* renamed from: b, reason: collision with root package name */
        e f1531b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f1532c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f1533d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public f(f fVar) {
            this.f1532c = null;
            this.f1533d = VectorDrawableCompat.f1515a;
            if (fVar != null) {
                this.f1530a = fVar.f1530a;
                this.f1531b = new e(fVar.f1531b);
                if (fVar.f1531b.n != null) {
                    this.f1531b.n = new Paint(fVar.f1531b.n);
                }
                if (fVar.f1531b.m != null) {
                    this.f1531b.m = new Paint(fVar.f1531b.m);
                }
                this.f1532c = fVar.f1532c;
                this.f1533d = fVar.f1533d;
                this.e = fVar.e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return this.f1531b.getRootAlpha() < 255;
        }

        public Paint a(ColorFilter colorFilter) {
            if (!a() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1531b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(int i, int i2) {
            this.f.eraseColor(0);
            this.f1531b.a(new Canvas(this.f), i, i2, (ColorFilter) null);
        }

        public void b(int i, int i2) {
            if (this.f == null || !c(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean c(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.f1532c && this.h == this.f1533d && this.j == this.e && this.i == this.f1531b.getRootAlpha();
        }

        public void c() {
            this.g = this.f1532c;
            this.h = this.f1533d;
            this.i = this.f1531b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public f() {
            this.f1532c = null;
            this.f1533d = VectorDrawableCompat.f1515a;
            this.f1531b = new e();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1530a;
        }
    }

    private static class e {
        private static final Matrix k = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final c f1526a;

        /* renamed from: b, reason: collision with root package name */
        float f1527b;

        /* renamed from: c, reason: collision with root package name */
        float f1528c;

        /* renamed from: d, reason: collision with root package name */
        float f1529d;
        float e;
        int f;
        String g;
        final ArrayMap<String, Object> h;
        private final Path i;
        private final Path j;
        private final Matrix l;
        private Paint m;
        private Paint n;
        private PathMeasure o;
        private int p;

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public e() {
            this.l = new Matrix();
            this.f1527b = 0.0f;
            this.f1528c = 0.0f;
            this.f1529d = 0.0f;
            this.e = 0.0f;
            this.f = 255;
            this.g = null;
            this.h = new ArrayMap<>();
            this.f1526a = new c();
            this.i = new Path();
            this.j = new Path();
        }

        public void setRootAlpha(int i) {
            this.f = i;
        }

        public int getRootAlpha() {
            return this.f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public e(e eVar) {
            this.l = new Matrix();
            this.f1527b = 0.0f;
            this.f1528c = 0.0f;
            this.f1529d = 0.0f;
            this.e = 0.0f;
            this.f = 255;
            this.g = null;
            this.h = new ArrayMap<>();
            this.f1526a = new c(eVar.f1526a, this.h);
            this.i = new Path(eVar.i);
            this.j = new Path(eVar.j);
            this.f1527b = eVar.f1527b;
            this.f1528c = eVar.f1528c;
            this.f1529d = eVar.f1529d;
            this.e = eVar.e;
            this.p = eVar.p;
            this.f = eVar.f;
            this.g = eVar.g;
            if (eVar.g != null) {
                this.h.put(eVar.g, this);
            }
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f1525d.set(matrix);
            cVar.f1525d.preConcat(cVar.k);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f1522a.size(); i3++) {
                Object obj = cVar.f1522a.get(i3);
                if (!(obj instanceof c)) {
                    if (obj instanceof d) {
                        a(cVar, (d) obj, canvas, i, i2, colorFilter);
                    }
                } else {
                    a((c) obj, cVar.f1525d, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.f1526a, k, canvas, i, i2, colorFilter);
        }

        private void a(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f1529d;
            float f2 = i2 / this.e;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f1525d;
            this.l.set(matrix);
            this.l.postScale(f, f2);
            float a2 = a(matrix);
            if (a2 == 0.0f) {
                return;
            }
            dVar.a(this.i);
            Path path = this.i;
            this.j.reset();
            if (dVar.a()) {
                this.j.addPath(path, this.l);
                canvas.clipPath(this.j);
                return;
            }
            b bVar = (b) dVar;
            if (bVar.g != 0.0f || bVar.h != 1.0f) {
                float f3 = (bVar.g + bVar.i) % 1.0f;
                float f4 = (bVar.h + bVar.i) % 1.0f;
                if (this.o == null) {
                    this.o = new PathMeasure();
                }
                this.o.setPath(this.i, false);
                float length = this.o.getLength();
                float f5 = f3 * length;
                float f6 = f4 * length;
                path.reset();
                if (f5 > f6) {
                    this.o.getSegment(f5, length, path, true);
                    this.o.getSegment(0.0f, f6, path, true);
                } else {
                    this.o.getSegment(f5, f6, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.j.addPath(path, this.l);
            if (bVar.f1520c != 0) {
                if (this.n == null) {
                    this.n = new Paint();
                    this.n.setStyle(Paint.Style.FILL);
                    this.n.setAntiAlias(true);
                }
                Paint paint = this.n;
                paint.setColor(VectorDrawableCompat.a(bVar.f1520c, bVar.f));
                paint.setColorFilter(colorFilter);
                this.j.setFillType(bVar.e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.j, paint);
            }
            if (bVar.f1518a != 0) {
                if (this.m == null) {
                    this.m = new Paint();
                    this.m.setStyle(Paint.Style.STROKE);
                    this.m.setAntiAlias(true);
                }
                Paint paint2 = this.m;
                if (bVar.k != null) {
                    paint2.setStrokeJoin(bVar.k);
                }
                if (bVar.j != null) {
                    paint2.setStrokeCap(bVar.j);
                }
                paint2.setStrokeMiter(bVar.l);
                paint2.setColor(VectorDrawableCompat.a(bVar.f1518a, bVar.f1521d));
                paint2.setColorFilter(colorFilter);
                paint2.setStrokeWidth(bVar.f1519b * min * a2);
                canvas.drawPath(this.j, paint2);
            }
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<Object> f1522a;

        /* renamed from: b, reason: collision with root package name */
        float f1523b;

        /* renamed from: c, reason: collision with root package name */
        int f1524c;

        /* renamed from: d, reason: collision with root package name */
        private final Matrix f1525d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private float j;
        private final Matrix k;
        private int[] l;
        private String m;

        public c(c cVar, ArrayMap<String, Object> arrayMap) {
            d aVar;
            this.f1525d = new Matrix();
            this.f1522a = new ArrayList<>();
            this.f1523b = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 1.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = new Matrix();
            this.m = null;
            this.f1523b = cVar.f1523b;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.j = cVar.j;
            this.l = cVar.l;
            this.m = cVar.m;
            this.f1524c = cVar.f1524c;
            if (this.m != null) {
                arrayMap.put(this.m, this);
            }
            this.k.set(cVar.k);
            ArrayList<Object> arrayList = cVar.f1522a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof c) {
                    this.f1522a.add(new c((c) obj, arrayMap));
                } else {
                    if (obj instanceof b) {
                        aVar = new b((b) obj);
                    } else if (obj instanceof a) {
                        aVar = new a((a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1522a.add(aVar);
                    if (aVar.n != null) {
                        arrayMap.put(aVar.n, aVar);
                    }
                }
            }
        }

        public c() {
            this.f1525d = new Matrix();
            this.f1522a = new ArrayList<>();
            this.f1523b = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 1.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = new Matrix();
            this.m = null;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.k;
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.f1536b);
            a(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f1523b = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "rotation", 5, this.f1523b);
            this.e = typedArray.getFloat(1, this.e);
            this.f = typedArray.getFloat(2, this.f);
            this.g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.g);
            this.h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.h);
            this.i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.i);
            this.j = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            a();
        }

        private void a() {
            this.k.reset();
            this.k.postTranslate(-this.e, -this.f);
            this.k.postScale(this.g, this.h);
            this.k.postRotate(this.f1523b, 0.0f, 0.0f);
            this.k.postTranslate(this.i + this.e, this.j + this.f);
        }

        public float getRotation() {
            return this.f1523b;
        }

        public void setRotation(float f) {
            if (f != this.f1523b) {
                this.f1523b = f;
                a();
            }
        }

        public float getPivotX() {
            return this.e;
        }

        public void setPivotX(float f) {
            if (f != this.e) {
                this.e = f;
                a();
            }
        }

        public float getPivotY() {
            return this.f;
        }

        public void setPivotY(float f) {
            if (f != this.f) {
                this.f = f;
                a();
            }
        }

        public float getScaleX() {
            return this.g;
        }

        public void setScaleX(float f) {
            if (f != this.g) {
                this.g = f;
                a();
            }
        }

        public float getScaleY() {
            return this.h;
        }

        public void setScaleY(float f) {
            if (f != this.h) {
                this.h = f;
                a();
            }
        }

        public float getTranslateX() {
            return this.i;
        }

        public void setTranslateX(float f) {
            if (f != this.i) {
                this.i = f;
                a();
            }
        }

        public float getTranslateY() {
            return this.j;
        }

        public void setTranslateY(float f) {
            if (f != this.j) {
                this.j = f;
                a();
            }
        }
    }

    private static class d {
        protected PathParser.PathDataNode[] m;
        String n;
        int o;

        public boolean a() {
            return false;
        }

        public d() {
            this.m = null;
        }

        public d(d dVar) {
            this.m = null;
            this.n = dVar.n;
            this.o = dVar.o;
            this.m = PathParser.deepCopyNodes(dVar.m);
        }

        public void a(Path path) {
            path.reset();
            if (this.m != null) {
                PathParser.PathDataNode.nodesToPath(this.m, path);
            }
        }

        public String getPathName() {
            return this.n;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.m;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.m, pathDataNodeArr)) {
                this.m = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.m, pathDataNodeArr);
            }
        }
    }

    private static class a extends d {
        @Override // android.support.graphics.drawable.VectorDrawableCompat.d
        public boolean a() {
            return true;
        }

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.f1538d);
                a(obtainAttributes);
                obtainAttributes.recycle();
            }
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = PathParser.createNodesFromPathData(string2);
            }
        }
    }

    private static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        int f1518a;

        /* renamed from: b, reason: collision with root package name */
        float f1519b;

        /* renamed from: c, reason: collision with root package name */
        int f1520c;

        /* renamed from: d, reason: collision with root package name */
        float f1521d;
        int e;
        float f;
        float g;
        float h;
        float i;
        Paint.Cap j;
        Paint.Join k;
        float l;
        private int[] p;

        public b() {
            this.f1518a = 0;
            this.f1519b = 0.0f;
            this.f1520c = 0;
            this.f1521d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f1518a = 0;
            this.f1519b = 0.0f;
            this.f1520c = 0;
            this.f1521d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
            this.p = bVar.p;
            this.f1518a = bVar.f1518a;
            this.f1519b = bVar.f1519b;
            this.f1521d = bVar.f1521d;
            this.f1520c = bVar.f1520c;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private Paint.Join a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.f1537c);
            a(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.p = null;
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.m = PathParser.createNodesFromPathData(string2);
                }
                this.f1520c = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "fillColor", 1, this.f1520c);
                this.f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f);
                this.j = a(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.j);
                this.k = a(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.k);
                this.l = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.l);
                this.f1518a = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "strokeColor", 3, this.f1518a);
                this.f1521d = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1521d);
                this.f1519b = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f1519b);
                this.h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.h);
                this.i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.i);
                this.g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.g);
                this.e = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.e);
            }
        }

        int getStrokeColor() {
            return this.f1518a;
        }

        void setStrokeColor(int i) {
            this.f1518a = i;
        }

        float getStrokeWidth() {
            return this.f1519b;
        }

        void setStrokeWidth(float f) {
            this.f1519b = f;
        }

        float getStrokeAlpha() {
            return this.f1521d;
        }

        void setStrokeAlpha(float f) {
            this.f1521d = f;
        }

        int getFillColor() {
            return this.f1520c;
        }

        void setFillColor(int i) {
            this.f1520c = i;
        }

        float getFillAlpha() {
            return this.f;
        }

        void setFillAlpha(float f) {
            this.f = f;
        }

        float getTrimPathStart() {
            return this.g;
        }

        void setTrimPathStart(float f) {
            this.g = f;
        }

        float getTrimPathEnd() {
            return this.h;
        }

        void setTrimPathEnd(float f) {
            this.h = f;
        }

        float getTrimPathOffset() {
            return this.i;
        }

        void setTrimPathOffset(float f) {
            this.i = f;
        }
    }
}
