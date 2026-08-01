package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0206C;
import l.C0223a0;
import l.C0250o;
import l.C0254q;
import l.C0256r;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0115D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2596b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2597c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2598e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2599f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2600g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2601a = new Object[2];

    public C0250o a(Context context, AttributeSet attributeSet) {
        return new C0250o(context, attributeSet);
    }

    public C0254q b(Context context, AttributeSet attributeSet) {
        return new C0254q(context, attributeSet, com.fortunequest.neontrack.R.attr.buttonStyle);
    }

    public C0256r c(Context context, AttributeSet attributeSet) {
        return new C0256r(context, attributeSet, com.fortunequest.neontrack.R.attr.checkboxStyle);
    }

    public C0206C d(Context context, AttributeSet attributeSet) {
        return new C0206C(context, attributeSet);
    }

    public C0223a0 e(Context context, AttributeSet attributeSet) {
        return new C0223a0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2596b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2601a);
    }
}
