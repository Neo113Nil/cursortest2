package n0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class j0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo l4 = fVar.f2725a.l();
        Objects.requireNonNull(l4);
        ContentInfo performReceiveContent = view.performReceiveContent(l4);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == l4 ? fVar : new f(new a0.a(performReceiveContent));
    }
}
