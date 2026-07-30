package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class c53 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static n20 b(View view, n20 n20Var) {
        ContentInfo c = n20Var.a.c();
        Objects.requireNonNull(c);
        ContentInfo performReceiveContent = view.performReceiveContent(c);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == c ? n20Var : new n20(new j20(performReceiveContent));
    }
}
