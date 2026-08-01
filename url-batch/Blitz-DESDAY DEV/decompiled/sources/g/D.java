package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0182d0;
import l.C0203o;
import l.C0207q;

/* loaded from: classes.dex */
public class D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2241b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2242c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2243e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2244f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2245g = {"android.widget.", "android.view.", "android.webkit."};
    public static final q.k h = new q.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2246a = new Object[2];

    public C0203o a(Context context, AttributeSet attributeSet) {
        return new C0203o(context, attributeSet);
    }

    public C0207q b(Context context, AttributeSet attributeSet) {
        return new C0207q(context, attributeSet, com.winfour.neondrop.R.attr.buttonStyle);
    }

    public l.r c(Context context, AttributeSet attributeSet) {
        return new l.r(context, attributeSet, com.winfour.neondrop.R.attr.checkboxStyle);
    }

    public l.D d(Context context, AttributeSet attributeSet) {
        return new l.D(context, attributeSet);
    }

    public C0182d0 e(Context context, AttributeSet attributeSet) {
        return new C0182d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        q.k kVar = h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2241b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2246a);
    }
}
