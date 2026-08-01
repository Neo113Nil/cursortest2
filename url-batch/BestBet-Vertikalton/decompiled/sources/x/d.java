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
import w.AbstractC0390a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0392a f4525a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4526b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4527c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4528e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4529f;

    /* renamed from: g, reason: collision with root package name */
    public int f4530g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4531j;

    /* renamed from: k, reason: collision with root package name */
    public View f4532k;

    /* renamed from: l, reason: collision with root package name */
    public View f4533l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4534m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4535n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4536o;

    public d() {
        super(-2, -2);
        this.f4526b = false;
        this.f4527c = 0;
        this.d = 0;
        this.f4528e = -1;
        this.f4529f = -1;
        this.f4530g = 0;
        this.h = 0;
        this.f4536o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4534m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4535n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0392a abstractC0392a;
        this.f4526b = false;
        this.f4527c = 0;
        this.d = 0;
        this.f4528e = -1;
        this.f4529f = -1;
        this.f4530g = 0;
        this.h = 0;
        this.f4536o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0390a.f4469b);
        this.f4527c = obtainStyledAttributes.getInteger(0, 0);
        this.f4529f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4528e = obtainStyledAttributes.getInteger(6, -1);
        this.f4530g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4526b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1789t;
            if (TextUtils.isEmpty(string)) {
                abstractC0392a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1789t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1791v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1790u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0392a = (AbstractC0392a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4525a = abstractC0392a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0392a abstractC0392a2 = this.f4525a;
        if (abstractC0392a2 != null) {
            abstractC0392a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4526b = false;
        this.f4527c = 0;
        this.d = 0;
        this.f4528e = -1;
        this.f4529f = -1;
        this.f4530g = 0;
        this.h = 0;
        this.f4536o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4526b = false;
        this.f4527c = 0;
        this.d = 0;
        this.f4528e = -1;
        this.f4529f = -1;
        this.f4530g = 0;
        this.h = 0;
        this.f4536o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4526b = false;
        this.f4527c = 0;
        this.d = 0;
        this.f4528e = -1;
        this.f4529f = -1;
        this.f4530g = 0;
        this.h = 0;
        this.f4536o = new Rect();
    }
}
