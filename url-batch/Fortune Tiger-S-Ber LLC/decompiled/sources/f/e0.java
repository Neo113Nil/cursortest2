package f;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1591b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1592d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1593e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1594f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final n.j h = new n.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1595a = new Object[2];

    public k.o a(Context context, AttributeSet attributeSet) {
        return new k.o(context, attributeSet);
    }

    public k.p b(Context context, AttributeSet attributeSet) {
        return new k.p(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.buttonStyle);
    }

    public k.q c(Context context, AttributeSet attributeSet) {
        return new k.q(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.checkboxStyle);
    }

    public k.b0 d(Context context, AttributeSet attributeSet) {
        return new k.b0(context, attributeSet);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        n.j jVar = h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1591b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1595a);
    }
}
