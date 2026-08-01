package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class q6 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final h30 h = new h30(0);
    public final Object[] a = new Object[2];

    public s3 a(Context context, AttributeSet attributeSet) {
        return new s3(context, attributeSet);
    }

    public u3 b(Context context, AttributeSet attributeSet) {
        return new u3(context, attributeSet, com.awerser.monnit.betplay.R.attr.buttonStyle);
    }

    public w3 c(Context context, AttributeSet attributeSet) {
        return new w3(context, attributeSet, com.awerser.monnit.betplay.R.attr.checkboxStyle);
    }

    public i5 d(Context context, AttributeSet attributeSet) {
        return new i5(context, attributeSet);
    }

    public i6 e(Context context, AttributeSet attributeSet) {
        return new i6(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        h30 h30Var = h;
        Constructor constructor = (Constructor) h30Var.get(str);
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
            h30Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
