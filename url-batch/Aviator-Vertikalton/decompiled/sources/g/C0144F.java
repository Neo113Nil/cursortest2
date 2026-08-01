package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0235F;
import l.C0257e0;
import l.C0278p;
import l.C0282r;
import l.C0284s;

/* renamed from: g.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0144F {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2488b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2489c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2490d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2491e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2492f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2493g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2494a = new Object[2];

    public C0278p a(Context context, AttributeSet attributeSet) {
        return new C0278p(context, attributeSet);
    }

    public C0282r b(Context context, AttributeSet attributeSet) {
        return new C0282r(context, attributeSet, com.fortuneink.neonpad.R.attr.buttonStyle);
    }

    public C0284s c(Context context, AttributeSet attributeSet) {
        return new C0284s(context, attributeSet, com.fortuneink.neonpad.R.attr.checkboxStyle);
    }

    public C0235F d(Context context, AttributeSet attributeSet) {
        return new C0235F(context, attributeSet);
    }

    public C0257e0 e(Context context, AttributeSet attributeSet) {
        return new C0257e0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2488b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2494a);
    }
}
