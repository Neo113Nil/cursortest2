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
import w.AbstractC0357a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0363a f4594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4600g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4601j;

    /* renamed from: k, reason: collision with root package name */
    public View f4602k;

    /* renamed from: l, reason: collision with root package name */
    public View f4603l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4604m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4605n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4606o;

    public C0366d() {
        super(-2, -2);
        this.f4595b = false;
        this.f4596c = 0;
        this.f4597d = 0;
        this.f4598e = -1;
        this.f4599f = -1;
        this.f4600g = 0;
        this.h = 0;
        this.f4606o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4604m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4605n;
    }

    public C0366d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0363a abstractC0363a;
        this.f4595b = false;
        this.f4596c = 0;
        this.f4597d = 0;
        this.f4598e = -1;
        this.f4599f = -1;
        this.f4600g = 0;
        this.h = 0;
        this.f4606o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0357a.f4530b);
        this.f4596c = obtainStyledAttributes.getInteger(0, 0);
        this.f4599f = obtainStyledAttributes.getResourceId(1, -1);
        this.f4597d = obtainStyledAttributes.getInteger(2, 0);
        this.f4598e = obtainStyledAttributes.getInteger(6, -1);
        this.f4600g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4595b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1126t;
            if (TextUtils.isEmpty(string)) {
                abstractC0363a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1126t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1128v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1127u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0363a = (AbstractC0363a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4594a = abstractC0363a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0363a abstractC0363a2 = this.f4594a;
        if (abstractC0363a2 != null) {
            abstractC0363a2.c(this);
        }
    }

    public C0366d(C0366d c0366d) {
        super((ViewGroup.MarginLayoutParams) c0366d);
        this.f4595b = false;
        this.f4596c = 0;
        this.f4597d = 0;
        this.f4598e = -1;
        this.f4599f = -1;
        this.f4600g = 0;
        this.h = 0;
        this.f4606o = new Rect();
    }

    public C0366d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4595b = false;
        this.f4596c = 0;
        this.f4597d = 0;
        this.f4598e = -1;
        this.f4599f = -1;
        this.f4600g = 0;
        this.h = 0;
        this.f4606o = new Rect();
    }

    public C0366d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4595b = false;
        this.f4596c = 0;
        this.f4597d = 0;
        this.f4598e = -1;
        this.f4599f = -1;
        this.f4600g = 0;
        this.h = 0;
        this.f4606o = new Rect();
    }
}
