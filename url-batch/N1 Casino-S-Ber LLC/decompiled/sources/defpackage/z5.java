package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class z5 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final u20 h = new u20(0);
    public final Object[] a = new Object[2];

    public d3 a(Context context, AttributeSet attributeSet) {
        return new d3(context, attributeSet);
    }

    public e3 b(Context context, AttributeSet attributeSet) {
        return new e3(context, attributeSet, com.derinko.gbini.n1casino.R.attr.buttonStyle);
    }

    public g3 c(Context context, AttributeSet attributeSet) {
        return new g3(context, attributeSet, com.derinko.gbini.n1casino.R.attr.checkboxStyle);
    }

    public r4 d(Context context, AttributeSet attributeSet) {
        return new r4(context, attributeSet);
    }

    public r5 e(Context context, AttributeSet attributeSet) {
        return new r5(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        u20 u20Var = h;
        Constructor constructor = (Constructor) u20Var.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            u20Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
