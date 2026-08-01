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
import w.AbstractC0355a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0361a f4590a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4593d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4594e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4595f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4596g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4597j;

    /* renamed from: k, reason: collision with root package name */
    public View f4598k;

    /* renamed from: l, reason: collision with root package name */
    public View f4599l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4600m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4601n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4602o;

    public C0364d() {
        super(-2, -2);
        this.f4591b = false;
        this.f4592c = 0;
        this.f4593d = 0;
        this.f4594e = -1;
        this.f4595f = -1;
        this.f4596g = 0;
        this.h = 0;
        this.f4602o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4600m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4601n;
    }

    public C0364d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0361a abstractC0361a;
        this.f4591b = false;
        this.f4592c = 0;
        this.f4593d = 0;
        this.f4594e = -1;
        this.f4595f = -1;
        this.f4596g = 0;
        this.h = 0;
        this.f4602o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0355a.f4526b);
        this.f4592c = obtainStyledAttributes.getInteger(0, 0);
        this.f4595f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4593d = obtainStyledAttributes.getInteger(2, 0);
        this.f4594e = obtainStyledAttributes.getInteger(6, -1);
        this.f4596g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4591b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1125t;
            if (TextUtils.isEmpty(string)) {
                abstractC0361a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1125t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1127v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1126u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0361a = (AbstractC0361a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4590a = abstractC0361a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0361a abstractC0361a2 = this.f4590a;
        if (abstractC0361a2 != null) {
            abstractC0361a2.c(this);
        }
    }

    public C0364d(C0364d c0364d) {
        super((ViewGroup.MarginLayoutParams) c0364d);
        this.f4591b = false;
        this.f4592c = 0;
        this.f4593d = 0;
        this.f4594e = -1;
        this.f4595f = -1;
        this.f4596g = 0;
        this.h = 0;
        this.f4602o = new Rect();
    }

    public C0364d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4591b = false;
        this.f4592c = 0;
        this.f4593d = 0;
        this.f4594e = -1;
        this.f4595f = -1;
        this.f4596g = 0;
        this.h = 0;
        this.f4602o = new Rect();
    }

    public C0364d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4591b = false;
        this.f4592c = 0;
        this.f4593d = 0;
        this.f4594e = -1;
        this.f4595f = -1;
        this.f4596g = 0;
        this.h = 0;
        this.f4602o = new Rect();
    }
}
