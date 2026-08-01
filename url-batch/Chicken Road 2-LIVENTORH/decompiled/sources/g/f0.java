package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1633b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1634c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1635e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1636f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f1637g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final q.j f1638h = new q.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1639a = new Object[2];

    public l.p a(Context context, AttributeSet attributeSet) {
        return new l.p(context, attributeSet);
    }

    public l.q b(Context context, AttributeSet attributeSet) {
        return new l.q(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.buttonStyle);
    }

    public l.r c(Context context, AttributeSet attributeSet) {
        return new l.r(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.checkboxStyle);
    }

    public l.d0 d(Context context, AttributeSet attributeSet) {
        return new l.d0(context, attributeSet);
    }

    public c1 e(Context context, AttributeSet attributeSet) {
        return new c1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        q.j jVar = f1638h;
        Constructor constructor = (Constructor) jVar.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1633b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1639a);
    }
}
