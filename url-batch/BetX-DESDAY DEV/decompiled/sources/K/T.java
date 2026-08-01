package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0010f b(View view, C0010f c0010f) {
        ContentInfo s2 = c0010f.f440a.s();
        Objects.requireNonNull(s2);
        ContentInfo g2 = E0.e.g(s2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0010f : new C0010f(new B0.d(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0026w interfaceC0026w) {
        if (interfaceC0026w == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new U(interfaceC0026w));
        }
    }
}
