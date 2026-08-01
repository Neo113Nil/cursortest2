package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0208E;
import l.C0229d0;
import l.C0252p;
import l.C0256r;
import l.C0258s;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0112D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2245b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2246c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2247e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2248f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2249g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2250a = new Object[2];

    public C0252p a(Context context, AttributeSet attributeSet) {
        return new C0252p(context, attributeSet);
    }

    public C0256r b(Context context, AttributeSet attributeSet) {
        return new C0256r(context, attributeSet, com.shotwins.games.R.attr.buttonStyle);
    }

    public C0258s c(Context context, AttributeSet attributeSet) {
        return new C0258s(context, attributeSet, com.shotwins.games.R.attr.checkboxStyle);
    }

    public C0208E d(Context context, AttributeSet attributeSet) {
        return new C0208E(context, attributeSet);
    }

    public C0229d0 e(Context context, AttributeSet attributeSet) {
        return new C0229d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        o.k kVar = h;
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2245b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2250a);
    }
}
