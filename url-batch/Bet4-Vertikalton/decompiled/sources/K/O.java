package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0008f b(View view, C0008f c0008f) {
        ContentInfo r2 = c0008f.f449a.r();
        Objects.requireNonNull(r2);
        ContentInfo g2 = G0.e.g(r2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0008f : new C0008f(new C.g(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0020s interfaceC0020s) {
        if (interfaceC0020s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0020s));
        }
    }
}
