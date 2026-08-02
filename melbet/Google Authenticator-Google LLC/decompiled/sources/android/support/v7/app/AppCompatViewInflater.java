package android.support.v7.app;

import android.R;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import defpackage.hr;
import defpackage.ht;
import defpackage.hu;
import defpackage.id;
import defpackage.qy;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppCompatViewInflater {
    public final Object[] f = new Object[2];
    private static final Class[] g = {Context.class, AttributeSet.class};
    public static final int[] a = {R.attr.onClick};
    public static final int[] b = {R.attr.accessibilityHeading};
    public static final int[] c = {R.attr.accessibilityPaneTitle};
    public static final int[] d = {R.attr.screenReaderFocusable};
    public static final String[] e = {"android.widget.", "android.view.", "android.webkit."};
    private static final qy h = new qy(0);

    public hr a(Context context, AttributeSet attributeSet) {
        return new hr(context, attributeSet);
    }

    public ht b(Context context, AttributeSet attributeSet) {
        return new ht(context, attributeSet);
    }

    public hu c(Context context, AttributeSet attributeSet) {
        return new hu(context, attributeSet);
    }

    public id d(Context context, AttributeSet attributeSet) {
        return new id(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        qy qyVar = h;
        Constructor constructor = (Constructor) qyVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(g);
            qyVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f);
    }
}
