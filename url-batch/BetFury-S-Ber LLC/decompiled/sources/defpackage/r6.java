package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class r6 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final zd0 h = new zd0(0);
    public final Object[] a = new Object[2];

    public v3 a(Context context, AttributeSet attributeSet) {
        return new v3(context, attributeSet);
    }

    public w3 b(Context context, AttributeSet attributeSet) {
        return new w3(context, attributeSet, com.trembin.nirefon.betfury.R.attr.buttonStyle);
    }

    public y3 c(Context context, AttributeSet attributeSet) {
        return new y3(context, attributeSet, com.trembin.nirefon.betfury.R.attr.checkboxStyle);
    }

    public j5 d(Context context, AttributeSet attributeSet) {
        return new j5(context, attributeSet);
    }

    public j6 e(Context context, AttributeSet attributeSet) {
        return new j6(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        zd0 zd0Var = h;
        Constructor constructor = (Constructor) zd0Var.get(str);
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
            zd0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
