package B;

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
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f43a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48f;

    /* renamed from: g, reason: collision with root package name */
    public final int f49g;

    /* renamed from: h, reason: collision with root package name */
    public int f50h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f51j;

    /* renamed from: k, reason: collision with root package name */
    public View f52k;

    /* renamed from: l, reason: collision with root package name */
    public View f53l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f54m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f56o;

    public e() {
        super(-2, -2);
        this.f44b = false;
        this.f45c = 0;
        this.f46d = 0;
        this.f47e = -1;
        this.f48f = -1;
        this.f49g = 0;
        this.f50h = 0;
        this.f56o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f54m;
        }
        if (i != 1) {
            return false;
        }
        return this.f55n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f44b = false;
        this.f45c = 0;
        this.f46d = 0;
        this.f47e = -1;
        this.f48f = -1;
        this.f49g = 0;
        this.f50h = 0;
        this.f56o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f5b);
        this.f45c = obtainStyledAttributes.getInteger(0, 0);
        this.f48f = obtainStyledAttributes.getResourceId(1, -1);
        this.f46d = obtainStyledAttributes.getInteger(2, 0);
        this.f47e = obtainStyledAttributes.getInteger(6, -1);
        this.f49g = obtainStyledAttributes.getInt(5, 0);
        this.f50h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f44b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4774M;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(com.anythink.core.common.d.j.f12535z)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4774M;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4776O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4775N);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e6) {
                    throw new RuntimeException(AbstractC5051n.f("Could not inflate Behavior subclass ", string), e6);
                }
            }
            this.f43a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f43a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f44b = false;
        this.f45c = 0;
        this.f46d = 0;
        this.f47e = -1;
        this.f48f = -1;
        this.f49g = 0;
        this.f50h = 0;
        this.f56o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f44b = false;
        this.f45c = 0;
        this.f46d = 0;
        this.f47e = -1;
        this.f48f = -1;
        this.f49g = 0;
        this.f50h = 0;
        this.f56o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f44b = false;
        this.f45c = 0;
        this.f46d = 0;
        this.f47e = -1;
        this.f48f = -1;
        this.f49g = 0;
        this.f50h = 0;
        this.f56o = new Rect();
    }
}
