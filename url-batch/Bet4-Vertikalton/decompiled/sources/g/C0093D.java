package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0180C;
import l.C0201c0;
import l.C0224o;
import l.C0226p;
import l.C0228q;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0093D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2139b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2140c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2141e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2142f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2143g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2144a = new Object[2];

    public C0224o a(Context context, AttributeSet attributeSet) {
        return new C0224o(context, attributeSet);
    }

    public C0226p b(Context context, AttributeSet attributeSet) {
        return new C0226p(context, attributeSet, com.playbag.tripgear.R.attr.buttonStyle);
    }

    public C0228q c(Context context, AttributeSet attributeSet) {
        return new C0228q(context, attributeSet, com.playbag.tripgear.R.attr.checkboxStyle);
    }

    public C0180C d(Context context, AttributeSet attributeSet) {
        return new C0180C(context, attributeSet);
    }

    public C0201c0 e(Context context, AttributeSet attributeSet) {
        return new C0201c0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2139b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2144a);
    }
}
