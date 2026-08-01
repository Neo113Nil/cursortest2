package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class fm0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static zf b(View view, zf zfVar) {
        ContentInfo l = zfVar.a.l();
        Objects.requireNonNull(l);
        ContentInfo performReceiveContent = view.performReceiveContent(l);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == l ? zfVar : new zf(new o0(performReceiveContent));
    }
}
