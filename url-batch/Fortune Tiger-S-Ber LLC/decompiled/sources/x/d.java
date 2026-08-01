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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f3590a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3591b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3592d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3593e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3594f;
    public final int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3595i;

    /* renamed from: j, reason: collision with root package name */
    public int f3596j;

    /* renamed from: k, reason: collision with root package name */
    public View f3597k;

    /* renamed from: l, reason: collision with root package name */
    public View f3598l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3599m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3600n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3601o;

    public d() {
        super(-2, -2);
        this.f3591b = false;
        this.c = 0;
        this.f3592d = 0;
        this.f3593e = -1;
        this.f3594f = -1;
        this.g = 0;
        this.h = 0;
        this.f3601o = new Rect();
    }

    public final boolean a(int i4) {
        if (i4 == 0) {
            return this.f3599m;
        }
        if (i4 != 1) {
            return false;
        }
        return this.f3600n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f3591b = false;
        this.c = 0;
        this.f3592d = 0;
        this.f3593e = -1;
        this.f3594f = -1;
        this.g = 0;
        this.h = 0;
        this.f3601o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.a.f3581b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f3594f = obtainStyledAttributes.getResourceId(1, -1);
        this.f3592d = obtainStyledAttributes.getInteger(2, 0);
        this.f3593e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3591b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f273y;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f273y;
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
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f274z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e4);
                }
            }
            this.f3590a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f3590a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f3591b = false;
        this.c = 0;
        this.f3592d = 0;
        this.f3593e = -1;
        this.f3594f = -1;
        this.g = 0;
        this.h = 0;
        this.f3601o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3591b = false;
        this.c = 0;
        this.f3592d = 0;
        this.f3593e = -1;
        this.f3594f = -1;
        this.g = 0;
        this.h = 0;
        this.f3601o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3591b = false;
        this.c = 0;
        this.f3592d = 0;
        this.f3593e = -1;
        this.f3594f = -1;
        this.g = 0;
        this.h = 0;
        this.f3601o = new Rect();
    }
}
