package B0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class v implements B {
    @Override // B0.B
    public StaticLayout a(C c4) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(c4.f876a, c4.f877b, c4.f878c, c4.f879d, c4.f880e);
        obtain.setTextDirection(c4.f881f);
        obtain.setAlignment(c4.f882g);
        obtain.setMaxLines(c4.f883h);
        obtain.setEllipsize(c4.f884i);
        obtain.setEllipsizedWidth(c4.f885j);
        obtain.setLineSpacing(c4.f887l, c4.f886k);
        obtain.setIncludePad(c4.f889n);
        obtain.setBreakStrategy(c4.f891p);
        obtain.setHyphenationFrequency(c4.f894s);
        obtain.setIndents(c4.f895t, c4.f896u);
        int i2 = Build.VERSION.SDK_INT;
        w.a(obtain, c4.f888m);
        if (i2 >= 28) {
            y.a(obtain, c4.f890o);
        }
        if (i2 >= 33) {
            z.b(obtain, c4.f892q, c4.f893r);
        }
        return obtain.build();
    }
}
