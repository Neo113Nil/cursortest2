package b2;

import android.os.Build;
import android.text.StaticLayout;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements z {
    @Override // b2.z
    public StaticLayout a(a0 a0Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(a0Var.f1243a, 0, a0Var.f1244b, a0Var.f1245c, a0Var.f1246d);
        obtain.setTextDirection(a0Var.f1247e);
        obtain.setAlignment(a0Var.f1248f);
        obtain.setMaxLines(a0Var.f1249g);
        obtain.setEllipsize(a0Var.f1250h);
        obtain.setEllipsizedWidth(a0Var.f1251i);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(a0Var.f1253k);
        obtain.setBreakStrategy(a0Var.f1254l);
        obtain.setHyphenationFrequency(a0Var.f1257o);
        obtain.setIndents(null, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            v.a(obtain, a0Var.f1252j);
        }
        if (i7 >= 28) {
            w.a(obtain, true);
        }
        if (i7 >= 33) {
            x.b(obtain, a0Var.f1255m, a0Var.f1256n);
        }
        return obtain.build();
    }
}
