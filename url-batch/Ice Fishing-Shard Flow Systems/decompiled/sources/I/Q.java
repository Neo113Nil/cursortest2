package I;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Q {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0110f b(View view, C0110f c0110f) {
        ContentInfo d7 = c0110f.f1182a.d();
        Objects.requireNonNull(d7);
        ContentInfo performReceiveContent = view.performReceiveContent(d7);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d7 ? c0110f : new C0110f(new B.f(performReceiveContent));
    }
}
