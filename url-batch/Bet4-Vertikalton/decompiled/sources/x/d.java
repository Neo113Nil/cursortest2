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
import w.AbstractC0309a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0313a f4193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4195c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4196e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4197f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4198g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4199j;

    /* renamed from: k, reason: collision with root package name */
    public View f4200k;

    /* renamed from: l, reason: collision with root package name */
    public View f4201l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4202m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4203n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4204o;

    public d() {
        super(-2, -2);
        this.f4194b = false;
        this.f4195c = 0;
        this.d = 0;
        this.f4196e = -1;
        this.f4197f = -1;
        this.f4198g = 0;
        this.h = 0;
        this.f4204o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4202m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4203n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0313a abstractC0313a;
        this.f4194b = false;
        this.f4195c = 0;
        this.d = 0;
        this.f4196e = -1;
        this.f4197f = -1;
        this.f4198g = 0;
        this.h = 0;
        this.f4204o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0309a.f4161b);
        this.f4195c = obtainStyledAttributes.getInteger(0, 0);
        this.f4197f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4196e = obtainStyledAttributes.getInteger(6, -1);
        this.f4198g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4194b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1385t;
            if (TextUtils.isEmpty(string)) {
                abstractC0313a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1385t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1387v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1386u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0313a = (AbstractC0313a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4193a = abstractC0313a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0313a abstractC0313a2 = this.f4193a;
        if (abstractC0313a2 != null) {
            abstractC0313a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4194b = false;
        this.f4195c = 0;
        this.d = 0;
        this.f4196e = -1;
        this.f4197f = -1;
        this.f4198g = 0;
        this.h = 0;
        this.f4204o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4194b = false;
        this.f4195c = 0;
        this.d = 0;
        this.f4196e = -1;
        this.f4197f = -1;
        this.f4198g = 0;
        this.h = 0;
        this.f4204o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4194b = false;
        this.f4195c = 0;
        this.d = 0;
        this.f4196e = -1;
        this.f4197f = -1;
        this.f4198g = 0;
        this.h = 0;
        this.f4204o = new Rect();
    }
}
