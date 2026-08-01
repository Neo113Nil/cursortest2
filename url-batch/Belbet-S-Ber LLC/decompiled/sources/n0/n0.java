package n0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class n0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo r4 = fVar.f2774a.r();
        Objects.requireNonNull(r4);
        ContentInfo performReceiveContent = view.performReceiveContent(r4);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == r4 ? fVar : new f(new a0.a(performReceiveContent));
    }
}
