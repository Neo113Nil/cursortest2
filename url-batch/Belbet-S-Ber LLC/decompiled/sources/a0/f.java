package a0;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c f81a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f82b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84e;

    /* renamed from: f, reason: collision with root package name */
    public final int f85f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f87j;

    /* renamed from: k, reason: collision with root package name */
    public View f88k;

    /* renamed from: l, reason: collision with root package name */
    public View f89l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f90m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f93p;

    public f() {
        super(-2, -2);
        this.f82b = false;
        this.f83c = 0;
        this.d = 0;
        this.f84e = -1;
        this.f85f = -1;
        this.f86g = 0;
        this.h = 0;
        this.f93p = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f90m;
        }
        if (i != 1) {
            return false;
        }
        return this.f91n;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar;
        this.f82b = false;
        this.f83c = 0;
        this.d = 0;
        this.f84e = -1;
        this.f85f = -1;
        this.f86g = 0;
        this.h = 0;
        this.f93p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.a.f4123b);
        this.f83c = obtainStyledAttributes.getInteger(0, 0);
        this.f85f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f84e = obtainStyledAttributes.getInteger(6, -1);
        this.f86g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f82b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f382y;
            if (TextUtils.isEmpty(string)) {
                cVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f382y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f383z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    cVar = (c) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e4);
                }
            }
            this.f81a = cVar;
        }
        obtainStyledAttributes.recycle();
        c cVar2 = this.f81a;
        if (cVar2 != null) {
            cVar2.c(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.f82b = false;
        this.f83c = 0;
        this.d = 0;
        this.f84e = -1;
        this.f85f = -1;
        this.f86g = 0;
        this.h = 0;
        this.f93p = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f82b = false;
        this.f83c = 0;
        this.d = 0;
        this.f84e = -1;
        this.f85f = -1;
        this.f86g = 0;
        this.h = 0;
        this.f93p = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f82b = false;
        this.f83c = 0;
        this.d = 0;
        this.f84e = -1;
        this.f85f = -1;
        this.f86g = 0;
        this.h = 0;
        this.f93p = new Rect();
    }
}
