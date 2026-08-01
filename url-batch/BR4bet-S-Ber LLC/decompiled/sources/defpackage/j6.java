package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class j6 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final w50 h = new w50(0);
    public final Object[] a = new Object[2];

    public n3 a(Context context, AttributeSet attributeSet) {
        return new n3(context, attributeSet);
    }

    public o3 b(Context context, AttributeSet attributeSet) {
        return new o3(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.buttonStyle);
    }

    public q3 c(Context context, AttributeSet attributeSet) {
        return new q3(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.checkboxStyle);
    }

    public b5 d(Context context, AttributeSet attributeSet) {
        return new b5(context, attributeSet);
    }

    public b6 e(Context context, AttributeSet attributeSet) {
        return new b6(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        w50 w50Var = h;
        Constructor constructor = (Constructor) w50Var.get(str);
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
            w50Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
