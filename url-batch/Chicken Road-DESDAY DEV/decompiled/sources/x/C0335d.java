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
import w.AbstractC0330a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0332a f4154a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4155b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4156c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4157e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4158f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4159g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4160j;

    /* renamed from: k, reason: collision with root package name */
    public View f4161k;

    /* renamed from: l, reason: collision with root package name */
    public View f4162l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4163m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4164n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4165o;

    public C0335d() {
        super(-2, -2);
        this.f4155b = false;
        this.f4156c = 0;
        this.d = 0;
        this.f4157e = -1;
        this.f4158f = -1;
        this.f4159g = 0;
        this.h = 0;
        this.f4165o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4163m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4164n;
    }

    public C0335d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0332a abstractC0332a;
        this.f4155b = false;
        this.f4156c = 0;
        this.d = 0;
        this.f4157e = -1;
        this.f4158f = -1;
        this.f4159g = 0;
        this.h = 0;
        this.f4165o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0330a.f4126b);
        this.f4156c = obtainStyledAttributes.getInteger(0, 0);
        this.f4158f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4157e = obtainStyledAttributes.getInteger(6, -1);
        this.f4159g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4155b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1326t;
            if (TextUtils.isEmpty(string)) {
                abstractC0332a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1326t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1328v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1327u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0332a = (AbstractC0332a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4154a = abstractC0332a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0332a abstractC0332a2 = this.f4154a;
        if (abstractC0332a2 != null) {
            abstractC0332a2.c(this);
        }
    }

    public C0335d(C0335d c0335d) {
        super((ViewGroup.MarginLayoutParams) c0335d);
        this.f4155b = false;
        this.f4156c = 0;
        this.d = 0;
        this.f4157e = -1;
        this.f4158f = -1;
        this.f4159g = 0;
        this.h = 0;
        this.f4165o = new Rect();
    }

    public C0335d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4155b = false;
        this.f4156c = 0;
        this.d = 0;
        this.f4157e = -1;
        this.f4158f = -1;
        this.f4159g = 0;
        this.h = 0;
        this.f4165o = new Rect();
    }

    public C0335d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4155b = false;
        this.f4156c = 0;
        this.d = 0;
        this.f4157e = -1;
        this.f4158f = -1;
        this.f4159g = 0;
        this.h = 0;
        this.f4165o = new Rect();
    }
}
