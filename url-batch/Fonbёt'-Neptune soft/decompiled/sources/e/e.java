package e;

import S.q;
import a.AbstractC0132a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import f.AbstractC0187a;
import j.S;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public final class e extends f implements u.d {

    /* renamed from: r, reason: collision with root package name */
    public b f2156r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2157s;

    /* renamed from: t, reason: collision with root package name */
    public b f2158t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0132a f2159u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f2160w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2161x;

    public e(b bVar, Resources resources) {
        this.f2167i = 255;
        this.f2169k = -1;
        this.v = -1;
        this.f2160w = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0276, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray h2 = AbstractC0291b.h(resources2, theme, attributeSet, AbstractC0187a.f2176a);
        int i2 = 1;
        eVar.setVisible(h2.getBoolean(1, true), true);
        b bVar = eVar.f2158t;
        bVar.f2129d |= h2.getChangingConfigurations();
        int i3 = 2;
        bVar.f2134i = h2.getBoolean(2, bVar.f2134i);
        int i4 = 3;
        bVar.f2137l = h2.getBoolean(3, bVar.f2137l);
        bVar.f2149y = h2.getInt(4, bVar.f2149y);
        bVar.f2150z = h2.getInt(5, bVar.f2150z);
        boolean z2 = false;
        eVar.setDither(h2.getBoolean(0, bVar.f2147w));
        b bVar2 = eVar.f2163e;
        if (resources2 != null) {
            bVar2.f2127b = resources2;
            int i5 = resources.getDisplayMetrics().densityDpi;
            if (i5 == 0) {
                i5 = 160;
            }
            int i6 = bVar2.f2128c;
            bVar2.f2128c = i5;
            if (i6 != i5) {
                bVar2.f2138m = false;
                bVar2.f2135j = false;
            }
        } else {
            bVar2.getClass();
        }
        h2.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i4)) {
                break;
            }
            if (next3 == i3 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray h3 = AbstractC0291b.h(resources2, theme, attributeSet, AbstractC0187a.f2177b);
                    int resourceId = h3.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                    int resourceId2 = h3.getResourceId(i2, -1);
                    Drawable f2 = resourceId2 > 0 ? S.d().f(context2, resourceId2) : null;
                    h3.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i9 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, z2)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i7);
                    if (f2 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            f2 = new q();
                            f2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            f2 = Drawable.createFromXmlInner(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f2158t;
                    int a2 = bVar3.a(f2);
                    bVar3.f2124H[a2] = trimStateSet;
                    bVar3.J.d(a2, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray h4 = AbstractC0291b.h(resources2, theme, attributeSet, AbstractC0187a.f2178c);
                    int resourceId3 = h4.getResourceId(2, -1);
                    int resourceId4 = h4.getResourceId(1, -1);
                    int resourceId5 = h4.getResourceId(z2 ? 1 : 0, -1);
                    Drawable f3 = resourceId5 > 0 ? S.d().f(context2, resourceId5) : null;
                    boolean z3 = h4.getBoolean(3, z2);
                    h4.recycle();
                    if (f3 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            f3 = new S.e(context2);
                            f3.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            f3 = Drawable.createFromXmlInner(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f3 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar4 = eVar.f2158t;
                    int a3 = bVar4.a(f3);
                    long j2 = resourceId3;
                    long j3 = resourceId4;
                    long j4 = (j2 << 32) | j3;
                    long j5 = z3 ? 8589934592L : 0L;
                    long j6 = a3;
                    bVar4.f2125I.a(j4, Long.valueOf(j6 | j5));
                    if (z3) {
                        bVar4.f2125I.a((j3 << 32) | j2, Long.valueOf(j6 | 4294967296L | j5));
                    }
                    context2 = context;
                    resources2 = resources;
                    xmlResourceParser2 = xmlResourceParser;
                    i2 = 1;
                    z2 = false;
                    i3 = 2;
                    i4 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                    xmlResourceParser2 = xmlResourceParser;
                }
                i2 = 1;
                i3 = 2;
                i4 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    @Override // e.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // e.f
    public final void d(b bVar) {
        this.f2163e = bVar;
        int i2 = this.f2169k;
        if (i2 >= 0) {
            Drawable d2 = bVar.d(i2);
            this.f2165g = d2;
            if (d2 != null) {
                b(d2);
            }
        }
        this.f2166h = null;
        this.f2156r = bVar;
        this.f2158t = bVar;
    }

    public final Drawable f() {
        if (!this.f2157s) {
            super.mutate();
            b bVar = this.f2156r;
            bVar.f2125I = bVar.f2125I.clone();
            bVar.J = bVar.J.clone();
            this.f2157s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // e.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0132a abstractC0132a = this.f2159u;
        if (abstractC0132a != null) {
            abstractC0132a.O();
            this.f2159u = null;
            c(this.v);
            this.v = -1;
            this.f2160w = -1;
        }
    }

    @Override // e.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f2161x) {
            f();
            b bVar = this.f2158t;
            bVar.f2125I = bVar.f2125I.clone();
            bVar.J = bVar.J.clone();
            this.f2161x = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (c(r3) != false) goto L51;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int intValue;
        AbstractC0132a c0185a;
        b bVar = this.f2158t;
        int e2 = bVar.e(iArr);
        if (e2 < 0) {
            e2 = bVar.e(StateSet.WILD_CARD);
        }
        int i2 = this.f2169k;
        if (e2 != i2) {
            AbstractC0132a abstractC0132a = this.f2159u;
            if (abstractC0132a != null) {
                if (e2 != this.v) {
                    if (e2 == this.f2160w && abstractC0132a.g()) {
                        abstractC0132a.C();
                        this.v = this.f2160w;
                        this.f2160w = e2;
                    } else {
                        i2 = this.v;
                        abstractC0132a.O();
                    }
                }
                r4 = true;
            }
            this.f2159u = null;
            this.f2160w = -1;
            this.v = -1;
            b bVar2 = this.f2158t;
            if (i2 < 0) {
                bVar2.getClass();
                intValue = 0;
            } else {
                intValue = ((Integer) bVar2.J.c(i2, 0)).intValue();
            }
            int intValue2 = e2 < 0 ? 0 : ((Integer) bVar2.J.c(e2, 0)).intValue();
            if (intValue2 != 0 && intValue != 0) {
                long j2 = intValue2 | (intValue << 32);
                int longValue = (int) ((Long) bVar2.f2125I.d(j2, -1L)).longValue();
                if (longValue >= 0) {
                    boolean z2 = (((Long) bVar2.f2125I.d(j2, -1L)).longValue() & 8589934592L) != 0;
                    c(longValue);
                    Object obj = this.f2165g;
                    if (obj instanceof AnimationDrawable) {
                        c0185a = new c((AnimationDrawable) obj, (((Long) bVar2.f2125I.d(j2, -1L)).longValue() & 4294967296L) != 0, z2);
                    } else if (obj instanceof S.e) {
                        c0185a = new C0185a((S.e) obj, 1);
                    } else if (obj instanceof Animatable) {
                        c0185a = new C0185a((Animatable) obj, 0);
                    }
                    c0185a.M();
                    this.f2159u = c0185a;
                    this.f2160w = i2;
                    this.v = e2;
                    r4 = true;
                }
            }
        }
        Drawable drawable = this.f2165g;
        return drawable != null ? r4 | drawable.setState(iArr) : r4;
    }

    @Override // e.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        AbstractC0132a abstractC0132a = this.f2159u;
        if (abstractC0132a != null && (visible || z3)) {
            if (z2) {
                abstractC0132a.M();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
