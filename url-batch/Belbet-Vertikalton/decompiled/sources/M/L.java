package M;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class L {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0010f b(View view, C0010f c0010f) {
        ContentInfo o2 = c0010f.f743a.o();
        Objects.requireNonNull(o2);
        ContentInfo g2 = K0.e.g(o2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0010f : new C0010f(new C1.d(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0021q interfaceC0021q) {
        if (interfaceC0021q == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new M(interfaceC0021q));
        }
    }
}
