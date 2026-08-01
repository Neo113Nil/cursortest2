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
public final class C0337d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0334a f4189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4191c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4194g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4195j;

    /* renamed from: k, reason: collision with root package name */
    public View f4196k;

    /* renamed from: l, reason: collision with root package name */
    public View f4197l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4198m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4199n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4200o;

    public C0337d() {
        super(-2, -2);
        this.f4190b = false;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = -1;
        this.f4193f = -1;
        this.f4194g = 0;
        this.h = 0;
        this.f4200o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4198m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4199n;
    }

    public C0337d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0334a abstractC0334a;
        this.f4190b = false;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = -1;
        this.f4193f = -1;
        this.f4194g = 0;
        this.h = 0;
        this.f4200o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0329a.f4054b);
        this.f4191c = obtainStyledAttributes.getInteger(0, 0);
        this.f4193f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4192e = obtainStyledAttributes.getInteger(6, -1);
        this.f4194g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4190b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1371t;
            if (TextUtils.isEmpty(string)) {
                abstractC0334a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1371t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1373v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1372u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0334a = (AbstractC0334a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4189a = abstractC0334a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0334a abstractC0334a2 = this.f4189a;
        if (abstractC0334a2 != null) {
            abstractC0334a2.c(this);
        }
    }

    public C0337d(C0337d c0337d) {
        super((ViewGroup.MarginLayoutParams) c0337d);
        this.f4190b = false;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = -1;
        this.f4193f = -1;
        this.f4194g = 0;
        this.h = 0;
        this.f4200o = new Rect();
    }

    public C0337d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4190b = false;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = -1;
        this.f4193f = -1;
        this.f4194g = 0;
        this.h = 0;
        this.f4200o = new Rect();
    }

    public C0337d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4190b = false;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = -1;
        this.f4193f = -1;
        this.f4194g = 0;
        this.h = 0;
        this.f4200o = new Rect();
    }
}
