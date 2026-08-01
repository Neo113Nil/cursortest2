package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import n.C0248D;
import n.C0267c0;
import n.C0292p;
import n.C0296r;
import n.C0298s;

/* loaded from: classes.dex */
public class D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2725b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2726c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2727d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2728f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2729g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final q.k f2730h = new q.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2731a = new Object[2];

    public C0292p a(Context context, AttributeSet attributeSet) {
        return new C0292p(context, attributeSet);
    }

    public C0296r b(Context context, AttributeSet attributeSet) {
        return new C0296r(context, attributeSet, com.winpower.neonfit.R.attr.buttonStyle);
    }

    public C0298s c(Context context, AttributeSet attributeSet) {
        return new C0298s(context, attributeSet, com.winpower.neonfit.R.attr.checkboxStyle);
    }

    public C0248D d(Context context, AttributeSet attributeSet) {
        return new C0248D(context, attributeSet);
    }

    public C0267c0 e(Context context, AttributeSet attributeSet) {
        return new C0267c0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        q.k kVar = f2730h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2725b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2731a);
    }
}
