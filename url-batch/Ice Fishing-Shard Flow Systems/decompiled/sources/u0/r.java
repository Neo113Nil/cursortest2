package u0;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import v0.AbstractC0964h;
import v0.AbstractC0968l;
import v0.C0958b;
import v0.F;
import v0.G;
import v0.J;

/* loaded from: classes.dex */
public abstract class r {
    public static J a(WebSettings webSettings) {
        return new J(4, (WebSettingsBoundaryInterface) V6.b.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) G.f8176a.f8180b).convertSettings(webSettings)));
    }

    public static void b(WebSettings webSettings, int i2) {
        C0958b c0958b = F.f8142G;
        if (c0958b.a()) {
            AbstractC0968l.d(webSettings, i2);
        } else {
            if (!c0958b.b()) {
                throw F.a();
            }
            ((WebSettingsBoundaryInterface) a(webSettings).f8180b).setForceDark(i2);
        }
    }

    public static void c(WebSettings webSettings, boolean z7) {
        C0958b c0958b = F.f8152b;
        if (c0958b.a()) {
            AbstractC0964h.e(webSettings, z7);
        } else {
            if (!c0958b.b()) {
                throw F.a();
            }
            ((WebSettingsBoundaryInterface) a(webSettings).f8180b).setSafeBrowsingEnabled(z7);
        }
    }
}
