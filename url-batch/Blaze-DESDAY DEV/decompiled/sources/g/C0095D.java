package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0184D;
import l.C0204c0;
import l.C0227o;
import l.C0231q;
import l.C0233r;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0095D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2179b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2180c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2181e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2182f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2183g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2184a = new Object[2];

    public C0227o a(Context context, AttributeSet attributeSet) {
        return new C0227o(context, attributeSet);
    }

    public C0231q b(Context context, AttributeSet attributeSet) {
        return new C0231q(context, attributeSet, com.winworm.neongrid.R.attr.buttonStyle);
    }

    public C0233r c(Context context, AttributeSet attributeSet) {
        return new C0233r(context, attributeSet, com.winworm.neongrid.R.attr.checkboxStyle);
    }

    public C0184D d(Context context, AttributeSet attributeSet) {
        return new C0184D(context, attributeSet);
    }

    public C0204c0 e(Context context, AttributeSet attributeSet) {
        return new C0204c0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2179b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2184a);
    }
}
