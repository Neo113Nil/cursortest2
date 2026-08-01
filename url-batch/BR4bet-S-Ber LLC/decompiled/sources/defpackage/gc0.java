package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class gc0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ie b(View view, ie ieVar) {
        ContentInfo n = ieVar.a.n();
        Objects.requireNonNull(n);
        ContentInfo performReceiveContent = view.performReceiveContent(n);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == n ? ieVar : new ie(new rc0(performReceiveContent));
    }
}
