package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0209E;
import l.C0230d0;
import l.C0253p;
import l.C0257r;
import l.C0259s;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0113D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2248b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2249c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2250e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2251f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2252g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2253a = new Object[2];

    public C0253p a(Context context, AttributeSet attributeSet) {
        return new C0253p(context, attributeSet);
    }

    public C0257r b(Context context, AttributeSet attributeSet) {
        return new C0257r(context, attributeSet, com.skydrop.fallring.R.attr.buttonStyle);
    }

    public C0259s c(Context context, AttributeSet attributeSet) {
        return new C0259s(context, attributeSet, com.skydrop.fallring.R.attr.checkboxStyle);
    }

    public C0209E d(Context context, AttributeSet attributeSet) {
        return new C0209E(context, attributeSet);
    }

    public C0230d0 e(Context context, AttributeSet attributeSet) {
        return new C0230d0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2248b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2253a);
    }
}
