package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class mc0 implements xm0 {
    public static void d(StringBuilder sb, Object obj, tr trVar) {
        if (trVar != null) {
            sb.append((CharSequence) trVar.h(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final Object e(v50 v50Var, String str, eg egVar) {
        Object d = v50Var.d(str, new rg(3), egVar);
        return d == bh.COROUTINE_SUSPENDED ? d : sk0.a;
    }

    public static final lc0 f(Object obj) {
        if (obj != d50.b) {
            obj.getClass();
            return (lc0) obj;
        }
        s9.u("Does not contain segment");
        return null;
    }

    public static Typeface h(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, gk0.g(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public abstract boolean g();

    public abstract void i(int i);

    public abstract void j(Typeface typeface, boolean z);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    @Override // defpackage.xm0
    public void b() {
    }

    @Override // defpackage.xm0
    public void c() {
    }
}
