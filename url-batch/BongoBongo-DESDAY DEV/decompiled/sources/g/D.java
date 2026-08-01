package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import m.C0186D;
import m.C0208d0;
import m.C0229o;
import m.C0233q;
import m.C0235r;

/* loaded from: classes.dex */
public class D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2254b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2255c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2256e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2257f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2258g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final p.k f2259h = new p.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2260a = new Object[2];

    public C0229o a(Context context, AttributeSet attributeSet) {
        return new C0229o(context, attributeSet);
    }

    public C0233q b(Context context, AttributeSet attributeSet) {
        return new C0233q(context, attributeSet, com.winfour.winrandom.R.attr.buttonStyle);
    }

    public C0235r c(Context context, AttributeSet attributeSet) {
        return new C0235r(context, attributeSet, com.winfour.winrandom.R.attr.checkboxStyle);
    }

    public C0186D d(Context context, AttributeSet attributeSet) {
        return new C0186D(context, attributeSet);
    }

    public C0208d0 e(Context context, AttributeSet attributeSet) {
        return new C0208d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        p.k kVar = f2259h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2254b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2260a);
    }
}
