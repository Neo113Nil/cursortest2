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
import w.AbstractC0375a;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0378b f3995a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3997c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3999f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4000g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4001j;

    /* renamed from: k, reason: collision with root package name */
    public View f4002k;

    /* renamed from: l, reason: collision with root package name */
    public View f4003l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4004m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4005n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4006o;

    public C0381e() {
        super(-2, -2);
        this.f3996b = false;
        this.f3997c = 0;
        this.d = 0;
        this.f3998e = -1;
        this.f3999f = -1;
        this.f4000g = 0;
        this.h = 0;
        this.f4006o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4004m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4005n;
    }

    public C0381e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0378b abstractC0378b;
        this.f3996b = false;
        this.f3997c = 0;
        this.d = 0;
        this.f3998e = -1;
        this.f3999f = -1;
        this.f4000g = 0;
        this.h = 0;
        this.f4006o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0375a.f3991b);
        this.f3997c = obtainStyledAttributes.getInteger(0, 0);
        this.f3999f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f3998e = obtainStyledAttributes.getInteger(6, -1);
        this.f4000g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3996b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1408t;
            if (TextUtils.isEmpty(string)) {
                abstractC0378b = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1408t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1410v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1409u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0378b = (AbstractC0378b) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f3995a = abstractC0378b;
        }
        obtainStyledAttributes.recycle();
        AbstractC0378b abstractC0378b2 = this.f3995a;
        if (abstractC0378b2 != null) {
            abstractC0378b2.c(this);
        }
    }

    public C0381e(C0381e c0381e) {
        super((ViewGroup.MarginLayoutParams) c0381e);
        this.f3996b = false;
        this.f3997c = 0;
        this.d = 0;
        this.f3998e = -1;
        this.f3999f = -1;
        this.f4000g = 0;
        this.h = 0;
        this.f4006o = new Rect();
    }

    public C0381e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3996b = false;
        this.f3997c = 0;
        this.d = 0;
        this.f3998e = -1;
        this.f3999f = -1;
        this.f4000g = 0;
        this.h = 0;
        this.f4006o = new Rect();
    }

    public C0381e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3996b = false;
        this.f3997c = 0;
        this.d = 0;
        this.f3998e = -1;
        this.f3999f = -1;
        this.f4000g = 0;
        this.h = 0;
        this.f4006o = new Rect();
    }
}
