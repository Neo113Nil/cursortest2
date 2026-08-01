package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;
import l.C0183C;
import l.C0202b0;
import l.C0227o;
import l.C0231q;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0115D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2358b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2359c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2360e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2361f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2362g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2363a = new Object[2];

    public C0227o a(Context context, AttributeSet attributeSet) {
        return new C0227o(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C0231q c(Context context, AttributeSet attributeSet) {
        return new C0231q(context, attributeSet, com.glasspulse.glasspulse.R.attr.checkboxStyle);
    }

    public C0183C d(Context context, AttributeSet attributeSet) {
        return new C0183C(context, attributeSet);
    }

    public C0202b0 e(Context context, AttributeSet attributeSet) {
        return new C0202b0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2358b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2363a);
    }
}
