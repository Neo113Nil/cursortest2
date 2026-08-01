package k0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo n3 = fVar.f2731a.n();
        Objects.requireNonNull(n3);
        ContentInfo performReceiveContent = view.performReceiveContent(n3);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == n3 ? fVar : new f(new a2.e(performReceiveContent));
    }
}
