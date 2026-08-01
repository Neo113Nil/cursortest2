package M;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class M {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0005f b(View view, C0005f c0005f) {
        ContentInfo r2 = c0005f.f544a.r();
        Objects.requireNonNull(r2);
        ContentInfo g2 = I0.e.g(r2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0005f : new C0005f(new E.g(performReceiveContent));
    }

    public static void c(View view, String[] strArr, r rVar) {
        if (rVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new N(rVar));
        }
    }
}
