package D0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class w implements C {
    @Override // D0.C
    public StaticLayout a(D d3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(d3.f798a, d3.f799b, d3.f800c, d3.f801d, d3.f802e);
        obtain.setTextDirection(d3.f803f);
        obtain.setAlignment(d3.f804g);
        obtain.setMaxLines(d3.f805h);
        obtain.setEllipsize(d3.f806i);
        obtain.setEllipsizedWidth(d3.f807j);
        obtain.setLineSpacing(d3.f809l, d3.f808k);
        obtain.setIncludePad(d3.f811n);
        obtain.setBreakStrategy(d3.f813p);
        obtain.setHyphenationFrequency(d3.f816s);
        obtain.setIndents(d3.f817t, d3.f818u);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            x.a(obtain, d3.f810m);
        }
        if (i3 >= 28) {
            z.a(obtain, d3.f812o);
        }
        if (i3 >= 33) {
            A.b(obtain, d3.f814q, d3.f815r);
        }
        return obtain.build();
    }
}
