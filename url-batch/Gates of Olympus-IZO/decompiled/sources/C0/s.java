package C0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class s implements y {
    @Override // C0.y
    public StaticLayout a(z zVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(zVar.f463a, zVar.f464b, zVar.f465c, zVar.f466d, zVar.f467e);
        obtain.setTextDirection(zVar.f468f);
        obtain.setAlignment(zVar.f469g);
        obtain.setMaxLines(zVar.f470h);
        obtain.setEllipsize(zVar.f471i);
        obtain.setEllipsizedWidth(zVar.f472j);
        obtain.setLineSpacing(zVar.f474l, zVar.f473k);
        obtain.setIncludePad(zVar.f476n);
        obtain.setBreakStrategy(zVar.p);
        obtain.setHyphenationFrequency(zVar.f480s);
        obtain.setIndents(zVar.f481t, zVar.f482u);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            t.a(obtain, zVar.f475m);
        }
        if (i3 >= 28) {
            v.a(obtain, zVar.f477o);
        }
        if (i3 >= 33) {
            w.b(obtain, zVar.f478q, zVar.f479r);
        }
        return obtain.build();
    }
}
