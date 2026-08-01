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
import w.AbstractC0327a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0328a f4146a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4147b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4148c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4150f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4151g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4152j;

    /* renamed from: k, reason: collision with root package name */
    public View f4153k;

    /* renamed from: l, reason: collision with root package name */
    public View f4154l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4155m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4156n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4157o;

    public C0331d() {
        super(-2, -2);
        this.f4147b = false;
        this.f4148c = 0;
        this.d = 0;
        this.f4149e = -1;
        this.f4150f = -1;
        this.f4151g = 0;
        this.h = 0;
        this.f4157o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4155m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4156n;
    }

    public C0331d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0328a abstractC0328a;
        this.f4147b = false;
        this.f4148c = 0;
        this.d = 0;
        this.f4149e = -1;
        this.f4150f = -1;
        this.f4151g = 0;
        this.h = 0;
        this.f4157o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0327a.f4117b);
        this.f4148c = obtainStyledAttributes.getInteger(0, 0);
        this.f4150f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4149e = obtainStyledAttributes.getInteger(6, -1);
        this.f4151g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4147b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1301t;
            if (TextUtils.isEmpty(string)) {
                abstractC0328a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1301t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1303v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1302u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0328a = (AbstractC0328a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4146a = abstractC0328a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0328a abstractC0328a2 = this.f4146a;
        if (abstractC0328a2 != null) {
            abstractC0328a2.c(this);
        }
    }

    public C0331d(C0331d c0331d) {
        super((ViewGroup.MarginLayoutParams) c0331d);
        this.f4147b = false;
        this.f4148c = 0;
        this.d = 0;
        this.f4149e = -1;
        this.f4150f = -1;
        this.f4151g = 0;
        this.h = 0;
        this.f4157o = new Rect();
    }

    public C0331d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4147b = false;
        this.f4148c = 0;
        this.d = 0;
        this.f4149e = -1;
        this.f4150f = -1;
        this.f4151g = 0;
        this.h = 0;
        this.f4157o = new Rect();
    }

    public C0331d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4147b = false;
        this.f4148c = 0;
        this.d = 0;
        this.f4149e = -1;
        this.f4150f = -1;
        this.f4151g = 0;
        this.h = 0;
        this.f4157o = new Rect();
    }
}
