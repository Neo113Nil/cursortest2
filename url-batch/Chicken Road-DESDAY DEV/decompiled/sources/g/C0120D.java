package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0191D;
import l.C0213d0;
import l.C0234o;
import l.C0238q;
import l.C0240r;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0120D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2317b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2318c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2319e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2320f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2321g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2322a = new Object[2];

    public C0234o a(Context context, AttributeSet attributeSet) {
        return new C0234o(context, attributeSet);
    }

    public C0238q b(Context context, AttributeSet attributeSet) {
        return new C0238q(context, attributeSet, com.playgen.securelock.R.attr.buttonStyle);
    }

    public C0240r c(Context context, AttributeSet attributeSet) {
        return new C0240r(context, attributeSet, com.playgen.securelock.R.attr.checkboxStyle);
    }

    public C0191D d(Context context, AttributeSet attributeSet) {
        return new C0191D(context, attributeSet);
    }

    public C0213d0 e(Context context, AttributeSet attributeSet) {
        return new C0213d0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2317b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2322a);
    }
}
