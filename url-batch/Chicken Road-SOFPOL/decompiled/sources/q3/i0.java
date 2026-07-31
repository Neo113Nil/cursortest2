package q3;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo j7 = gVar.f6101a.j();
        Objects.requireNonNull(j7);
        ContentInfo performReceiveContent = view.performReceiveContent(j7);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == j7 ? gVar : new g(new b1.b(performReceiveContent));
    }
}
