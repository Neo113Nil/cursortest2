package x;

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
import w.AbstractC0317a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0319a f4184a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4186c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4187e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4188f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4189g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4190j;

    /* renamed from: k, reason: collision with root package name */
    public View f4191k;

    /* renamed from: l, reason: collision with root package name */
    public View f4192l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4193m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4194n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4195o;

    public C0322d() {
        super(-2, -2);
        this.f4185b = false;
        this.f4186c = 0;
        this.d = 0;
        this.f4187e = -1;
        this.f4188f = -1;
        this.f4189g = 0;
        this.h = 0;
        this.f4195o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4193m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4194n;
    }

    public C0322d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0319a abstractC0319a;
        this.f4185b = false;
        this.f4186c = 0;
        this.d = 0;
        this.f4187e = -1;
        this.f4188f = -1;
        this.f4189g = 0;
        this.h = 0;
        this.f4195o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317a.f4180b);
        this.f4186c = obtainStyledAttributes.getInteger(0, 0);
        this.f4188f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4187e = obtainStyledAttributes.getInteger(6, -1);
        this.f4189g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4185b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1343t;
            if (TextUtils.isEmpty(string)) {
                abstractC0319a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1343t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1345v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1344u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0319a = (AbstractC0319a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4184a = abstractC0319a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0319a abstractC0319a2 = this.f4184a;
        if (abstractC0319a2 != null) {
            abstractC0319a2.c(this);
        }
    }

    public C0322d(C0322d c0322d) {
        super((ViewGroup.MarginLayoutParams) c0322d);
        this.f4185b = false;
        this.f4186c = 0;
        this.d = 0;
        this.f4187e = -1;
        this.f4188f = -1;
        this.f4189g = 0;
        this.h = 0;
        this.f4195o = new Rect();
    }

    public C0322d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4185b = false;
        this.f4186c = 0;
        this.d = 0;
        this.f4187e = -1;
        this.f4188f = -1;
        this.f4189g = 0;
        this.h = 0;
        this.f4195o = new Rect();
    }

    public C0322d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4185b = false;
        this.f4186c = 0;
        this.d = 0;
        this.f4187e = -1;
        this.f4188f = -1;
        this.f4189g = 0;
        this.h = 0;
        this.f4195o = new Rect();
    }
}
