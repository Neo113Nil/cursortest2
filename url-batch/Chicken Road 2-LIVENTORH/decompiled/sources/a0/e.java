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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f83a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88g;

    /* renamed from: h, reason: collision with root package name */
    public int f89h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f90j;

    /* renamed from: k, reason: collision with root package name */
    public View f91k;

    /* renamed from: l, reason: collision with root package name */
    public View f92l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f95o;

    public e() {
        super(-2, -2);
        this.f84b = false;
        this.f85c = 0;
        this.d = 0;
        this.f86e = -1;
        this.f87f = -1;
        this.f88g = 0;
        this.f89h = 0;
        this.f95o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f93m;
        }
        if (i != 1) {
            return false;
        }
        return this.f94n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f84b = false;
        this.f85c = 0;
        this.d = 0;
        this.f86e = -1;
        this.f87f = -1;
        this.f88g = 0;
        this.f89h = 0;
        this.f95o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.a.f3847b);
        this.f85c = obtainStyledAttributes.getInteger(0, 0);
        this.f87f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f86e = obtainStyledAttributes.getInteger(6, -1);
        this.f88g = obtainStyledAttributes.getInt(5, 0);
        this.f89h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f84b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f257y;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f257y;
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
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f258z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e4);
                }
            }
            this.f83a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f83a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f84b = false;
        this.f85c = 0;
        this.d = 0;
        this.f86e = -1;
        this.f87f = -1;
        this.f88g = 0;
        this.f89h = 0;
        this.f95o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f84b = false;
        this.f85c = 0;
        this.d = 0;
        this.f86e = -1;
        this.f87f = -1;
        this.f88g = 0;
        this.f89h = 0;
        this.f95o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f84b = false;
        this.f85c = 0;
        this.d = 0;
        this.f86e = -1;
        this.f87f = -1;
        this.f88g = 0;
        this.f89h = 0;
        this.f95o = new Rect();
    }
}
