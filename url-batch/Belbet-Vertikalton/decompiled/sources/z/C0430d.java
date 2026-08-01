package z;

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
import y.AbstractC0421a;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0427a f4768a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4770c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4771d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4772f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4773g;

    /* renamed from: h, reason: collision with root package name */
    public int f4774h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f4775k;

    /* renamed from: l, reason: collision with root package name */
    public View f4776l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4777m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4778n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4779o;

    public C0430d() {
        super(-2, -2);
        this.f4769b = false;
        this.f4770c = 0;
        this.f4771d = 0;
        this.e = -1;
        this.f4772f = -1;
        this.f4773g = 0;
        this.f4774h = 0;
        this.f4779o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4777m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4778n;
    }

    public C0430d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0427a abstractC0427a;
        this.f4769b = false;
        this.f4770c = 0;
        this.f4771d = 0;
        this.e = -1;
        this.f4772f = -1;
        this.f4773g = 0;
        this.f4774h = 0;
        this.f4779o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0421a.f4712b);
        this.f4770c = obtainStyledAttributes.getInteger(0, 0);
        this.f4772f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4771d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.f4773g = obtainStyledAttributes.getInt(5, 0);
        this.f4774h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4769b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1835t;
            if (TextUtils.isEmpty(string)) {
                abstractC0427a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1835t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1837v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1836u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0427a = (AbstractC0427a) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.f4768a = abstractC0427a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0427a abstractC0427a2 = this.f4768a;
        if (abstractC0427a2 != null) {
            abstractC0427a2.g(this);
        }
    }

    public C0430d(C0430d c0430d) {
        super((ViewGroup.MarginLayoutParams) c0430d);
        this.f4769b = false;
        this.f4770c = 0;
        this.f4771d = 0;
        this.e = -1;
        this.f4772f = -1;
        this.f4773g = 0;
        this.f4774h = 0;
        this.f4779o = new Rect();
    }

    public C0430d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4769b = false;
        this.f4770c = 0;
        this.f4771d = 0;
        this.e = -1;
        this.f4772f = -1;
        this.f4773g = 0;
        this.f4774h = 0;
        this.f4779o = new Rect();
    }

    public C0430d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4769b = false;
        this.f4770c = 0;
        this.f4771d = 0;
        this.e = -1;
        this.f4772f = -1;
        this.f4773g = 0;
        this.f4774h = 0;
        this.f4779o = new Rect();
    }
}
