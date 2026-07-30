package O;

import android.view.ContentInfo;
import android.view.View;
import g1.C4524d;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0344f b(View view, C0344f c0344f) {
        ContentInfo y6 = c0344f.f2260a.y();
        Objects.requireNonNull(y6);
        ContentInfo p6 = N0.a.p(y6);
        ContentInfo performReceiveContent = view.performReceiveContent(p6);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == p6 ? c0344f : new C0344f(new C4524d(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0359v interfaceC0359v) {
        if (interfaceC0359v == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new U(interfaceC0359v));
        }
    }
}
