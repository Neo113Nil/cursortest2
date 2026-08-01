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
import y.AbstractC0313a;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0318a f4304a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4305b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4306c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4308f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4309g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4310j;

    /* renamed from: k, reason: collision with root package name */
    public View f4311k;

    /* renamed from: l, reason: collision with root package name */
    public View f4312l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4313m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4314n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4315o;

    public C0321d() {
        super(-2, -2);
        this.f4305b = false;
        this.f4306c = 0;
        this.d = 0;
        this.f4307e = -1;
        this.f4308f = -1;
        this.f4309g = 0;
        this.h = 0;
        this.f4315o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4313m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4314n;
    }

    public C0321d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0318a abstractC0318a;
        this.f4305b = false;
        this.f4306c = 0;
        this.d = 0;
        this.f4307e = -1;
        this.f4308f = -1;
        this.f4309g = 0;
        this.h = 0;
        this.f4315o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0313a.f4186b);
        this.f4306c = obtainStyledAttributes.getInteger(0, 0);
        this.f4308f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4307e = obtainStyledAttributes.getInteger(6, -1);
        this.f4309g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4305b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1473t;
            if (TextUtils.isEmpty(string)) {
                abstractC0318a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1473t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1475v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1474u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0318a = (AbstractC0318a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4304a = abstractC0318a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0318a abstractC0318a2 = this.f4304a;
        if (abstractC0318a2 != null) {
            abstractC0318a2.c(this);
        }
    }

    public C0321d(C0321d c0321d) {
        super((ViewGroup.MarginLayoutParams) c0321d);
        this.f4305b = false;
        this.f4306c = 0;
        this.d = 0;
        this.f4307e = -1;
        this.f4308f = -1;
        this.f4309g = 0;
        this.h = 0;
        this.f4315o = new Rect();
    }

    public C0321d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4305b = false;
        this.f4306c = 0;
        this.d = 0;
        this.f4307e = -1;
        this.f4308f = -1;
        this.f4309g = 0;
        this.h = 0;
        this.f4315o = new Rect();
    }

    public C0321d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4305b = false;
        this.f4306c = 0;
        this.d = 0;
        this.f4307e = -1;
        this.f4308f = -1;
        this.f4309g = 0;
        this.h = 0;
        this.f4315o = new Rect();
    }
}
