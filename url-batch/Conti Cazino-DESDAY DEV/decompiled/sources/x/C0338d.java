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
import w.AbstractC0329a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0335a f4174a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4176c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4177e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4178f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4179g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4180j;

    /* renamed from: k, reason: collision with root package name */
    public View f4181k;

    /* renamed from: l, reason: collision with root package name */
    public View f4182l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4183m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4184n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4185o;

    public C0338d() {
        super(-2, -2);
        this.f4175b = false;
        this.f4176c = 0;
        this.d = 0;
        this.f4177e = -1;
        this.f4178f = -1;
        this.f4179g = 0;
        this.h = 0;
        this.f4185o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4183m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4184n;
    }

    public C0338d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0335a abstractC0335a;
        this.f4175b = false;
        this.f4176c = 0;
        this.d = 0;
        this.f4177e = -1;
        this.f4178f = -1;
        this.f4179g = 0;
        this.h = 0;
        this.f4185o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0329a.f4109b);
        this.f4176c = obtainStyledAttributes.getInteger(0, 0);
        this.f4178f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4177e = obtainStyledAttributes.getInteger(6, -1);
        this.f4179g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4175b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1265t;
            if (TextUtils.isEmpty(string)) {
                abstractC0335a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1265t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1267v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1266u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0335a = (AbstractC0335a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4174a = abstractC0335a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0335a abstractC0335a2 = this.f4174a;
        if (abstractC0335a2 != null) {
            abstractC0335a2.c(this);
        }
    }

    public C0338d(C0338d c0338d) {
        super((ViewGroup.MarginLayoutParams) c0338d);
        this.f4175b = false;
        this.f4176c = 0;
        this.d = 0;
        this.f4177e = -1;
        this.f4178f = -1;
        this.f4179g = 0;
        this.h = 0;
        this.f4185o = new Rect();
    }

    public C0338d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4175b = false;
        this.f4176c = 0;
        this.d = 0;
        this.f4177e = -1;
        this.f4178f = -1;
        this.f4179g = 0;
        this.h = 0;
        this.f4185o = new Rect();
    }

    public C0338d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4175b = false;
        this.f4176c = 0;
        this.d = 0;
        this.f4177e = -1;
        this.f4178f = -1;
        this.f4179g = 0;
        this.h = 0;
        this.f4185o = new Rect();
    }
}
