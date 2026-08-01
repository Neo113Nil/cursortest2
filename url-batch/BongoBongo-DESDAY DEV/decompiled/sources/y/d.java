package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import x.AbstractC0315a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0317a f4299a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4301c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4302e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4303f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4304g;

    /* renamed from: h, reason: collision with root package name */
    public int f4305h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4306j;

    /* renamed from: k, reason: collision with root package name */
    public View f4307k;

    /* renamed from: l, reason: collision with root package name */
    public View f4308l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4309m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4310n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4311o;

    public d() {
        super(-2, -2);
        this.f4300b = false;
        this.f4301c = 0;
        this.d = 0;
        this.f4302e = -1;
        this.f4303f = -1;
        this.f4304g = 0;
        this.f4305h = 0;
        this.f4311o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4309m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4310n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0317a abstractC0317a;
        this.f4300b = false;
        this.f4301c = 0;
        this.d = 0;
        this.f4302e = -1;
        this.f4303f = -1;
        this.f4304g = 0;
        this.f4305h = 0;
        this.f4311o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0315a.f4279b);
        this.f4301c = obtainStyledAttributes.getInteger(0, 0);
        this.f4303f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4302e = obtainStyledAttributes.getInteger(6, -1);
        this.f4304g = obtainStyledAttributes.getInt(5, 0);
        this.f4305h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4300b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1473t;
            if (TextUtils.isEmpty(string)) {
                abstractC0317a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1473t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1475v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1474u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0317a = (AbstractC0317a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4299a = abstractC0317a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0317a abstractC0317a2 = this.f4299a;
        if (abstractC0317a2 != null) {
            abstractC0317a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4300b = false;
        this.f4301c = 0;
        this.d = 0;
        this.f4302e = -1;
        this.f4303f = -1;
        this.f4304g = 0;
        this.f4305h = 0;
        this.f4311o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4300b = false;
        this.f4301c = 0;
        this.d = 0;
        this.f4302e = -1;
        this.f4303f = -1;
        this.f4304g = 0;
        this.f4305h = 0;
        this.f4311o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4300b = false;
        this.f4301c = 0;
        this.d = 0;
        this.f4302e = -1;
        this.f4303f = -1;
        this.f4304g = 0;
        this.f4305h = 0;
        this.f4311o = new Rect();
    }
}
