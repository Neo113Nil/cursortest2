package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0189E;
import l.C0210d0;
import l.C0233p;
import l.C0237r;
import l.C0239s;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0118D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2316b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2317c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2318e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2319f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2320g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2321a = new Object[2];

    public C0233p a(Context context, AttributeSet attributeSet) {
        return new C0233p(context, attributeSet);
    }

    public C0237r b(Context context, AttributeSet attributeSet) {
        return new C0237r(context, attributeSet, com.visualfortune.eyerest.R.attr.buttonStyle);
    }

    public C0239s c(Context context, AttributeSet attributeSet) {
        return new C0239s(context, attributeSet, com.visualfortune.eyerest.R.attr.checkboxStyle);
    }

    public C0189E d(Context context, AttributeSet attributeSet) {
        return new C0189E(context, attributeSet);
    }

    public C0210d0 e(Context context, AttributeSet attributeSet) {
        return new C0210d0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2316b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2321a);
    }
}
