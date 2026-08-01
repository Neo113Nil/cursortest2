package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class N {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0006g b(View view, C0006g c0006g) {
        ContentInfo r2 = c0006g.f396a.r();
        Objects.requireNonNull(r2);
        ContentInfo g2 = AbstractC0002c.g(r2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0006g : new C0006g(new A0.h(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0018t interfaceC0018t) {
        if (interfaceC0018t == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new O(interfaceC0018t));
        }
    }
}
