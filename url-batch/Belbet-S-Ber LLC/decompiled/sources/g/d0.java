package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1486b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1487c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1488e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1489f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f1490g = {"android.widget.", "android.view.", "android.webkit."};
    public static final q.j h = new q.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1491a = new Object[2];

    public l.n a(Context context, AttributeSet attributeSet) {
        return new l.n(context, attributeSet);
    }

    public l.o b(Context context, AttributeSet attributeSet) {
        return new l.o(context, attributeSet, com.gdmhkmf.belbet.R.attr.buttonStyle);
    }

    public l.p c(Context context, AttributeSet attributeSet) {
        return new l.p(context, attributeSet, com.gdmhkmf.belbet.R.attr.checkboxStyle);
    }

    public l.a0 d(Context context, AttributeSet attributeSet) {
        return new l.a0(context, attributeSet);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        q.j jVar = h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1486b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1491a);
    }
}
