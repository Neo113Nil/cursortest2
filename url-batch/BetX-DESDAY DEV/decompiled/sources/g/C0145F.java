package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0236E;
import l.C0257d0;
import l.C0278o;
import l.C0282q;
import l.C0284r;

/* renamed from: g.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145F {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2492b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2493c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2494d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2495e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2496f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2497g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2498a = new Object[2];

    public C0278o a(Context context, AttributeSet attributeSet) {
        return new C0278o(context, attributeSet);
    }

    public C0282q b(Context context, AttributeSet attributeSet) {
        return new C0282q(context, attributeSet, com.luckyarcade.spinthrow.R.attr.buttonStyle);
    }

    public C0284r c(Context context, AttributeSet attributeSet) {
        return new C0284r(context, attributeSet, com.luckyarcade.spinthrow.R.attr.checkboxStyle);
    }

    public C0236E d(Context context, AttributeSet attributeSet) {
        return new C0236E(context, attributeSet);
    }

    public C0257d0 e(Context context, AttributeSet attributeSet) {
        return new C0257d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        o.k kVar = h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2492b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2498a);
    }
}
