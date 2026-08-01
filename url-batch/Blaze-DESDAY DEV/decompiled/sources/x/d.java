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
import w.AbstractC0313a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0315a f4105a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4107c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4108e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4109f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4110g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4111j;

    /* renamed from: k, reason: collision with root package name */
    public View f4112k;

    /* renamed from: l, reason: collision with root package name */
    public View f4113l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4114m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4115n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4116o;

    public d() {
        super(-2, -2);
        this.f4106b = false;
        this.f4107c = 0;
        this.d = 0;
        this.f4108e = -1;
        this.f4109f = -1;
        this.f4110g = 0;
        this.h = 0;
        this.f4116o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4114m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4115n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0315a abstractC0315a;
        this.f4106b = false;
        this.f4107c = 0;
        this.d = 0;
        this.f4108e = -1;
        this.f4109f = -1;
        this.f4110g = 0;
        this.h = 0;
        this.f4116o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0313a.f4086b);
        this.f4107c = obtainStyledAttributes.getInteger(0, 0);
        this.f4109f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4108e = obtainStyledAttributes.getInteger(6, -1);
        this.f4110g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4106b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1416t;
            if (TextUtils.isEmpty(string)) {
                abstractC0315a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1416t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1418v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1417u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0315a = (AbstractC0315a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4105a = abstractC0315a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0315a abstractC0315a2 = this.f4105a;
        if (abstractC0315a2 != null) {
            abstractC0315a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4106b = false;
        this.f4107c = 0;
        this.d = 0;
        this.f4108e = -1;
        this.f4109f = -1;
        this.f4110g = 0;
        this.h = 0;
        this.f4116o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4106b = false;
        this.f4107c = 0;
        this.d = 0;
        this.f4108e = -1;
        this.f4109f = -1;
        this.f4110g = 0;
        this.h = 0;
        this.f4116o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4106b = false;
        this.f4107c = 0;
        this.d = 0;
        this.f4108e = -1;
        this.f4109f = -1;
        this.f4110g = 0;
        this.h = 0;
        this.f4116o = new Rect();
    }
}
