package d3;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f2226a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2228c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2230e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2231f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2232g;

    /* renamed from: h, reason: collision with root package name */
    public int f2233h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2234j;

    /* renamed from: k, reason: collision with root package name */
    public View f2235k;

    /* renamed from: l, reason: collision with root package name */
    public View f2236l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2237m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2238n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f2239o;

    public d() {
        super(-2, -2);
        this.f2227b = false;
        this.f2228c = 0;
        this.f2229d = 0;
        this.f2230e = -1;
        this.f2231f = -1;
        this.f2232g = 0;
        this.f2233h = 0;
        this.f2239o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f2237m;
        }
        if (i != 1) {
            return false;
        }
        return this.f2238n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f2227b = false;
        this.f2228c = 0;
        this.f2229d = 0;
        this.f2230e = -1;
        this.f2231f = -1;
        this.f2232g = 0;
        this.f2233h = 0;
        this.f2239o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3.a.f1611b);
        this.f2228c = obtainStyledAttributes.getInteger(0, 0);
        this.f2231f = obtainStyledAttributes.getResourceId(1, -1);
        this.f2229d = obtainStyledAttributes.getInteger(2, 0);
        this.f2230e = obtainStyledAttributes.getInteger(6, -1);
        this.f2232g = obtainStyledAttributes.getInt(5, 0);
        this.f2233h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f2227b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f585w;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f585w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f587y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f586x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e8) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e8);
                }
            }
            this.f2226a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f2226a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f2227b = false;
        this.f2228c = 0;
        this.f2229d = 0;
        this.f2230e = -1;
        this.f2231f = -1;
        this.f2232g = 0;
        this.f2233h = 0;
        this.f2239o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2227b = false;
        this.f2228c = 0;
        this.f2229d = 0;
        this.f2230e = -1;
        this.f2231f = -1;
        this.f2232g = 0;
        this.f2233h = 0;
        this.f2239o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2227b = false;
        this.f2228c = 0;
        this.f2229d = 0;
        this.f2230e = -1;
        this.f2231f = -1;
        this.f2232g = 0;
        this.f2233h = 0;
        this.f2239o = new Rect();
    }
}
