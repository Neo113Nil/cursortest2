package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class N {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0005f b(View view, C0005f c0005f) {
        ContentInfo o2 = c0005f.f390a.o();
        Objects.requireNonNull(o2);
        ContentInfo g2 = F0.e.g(o2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0005f : new C0005f(new C.g(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0017s interfaceC0017s) {
        if (interfaceC0017s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new O(interfaceC0017s));
        }
    }
}
