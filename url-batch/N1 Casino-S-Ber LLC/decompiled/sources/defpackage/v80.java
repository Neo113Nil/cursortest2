package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class v80 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static id b(View view, id idVar) {
        ContentInfo o = idVar.a.o();
        Objects.requireNonNull(o);
        ContentInfo performReceiveContent = view.performReceiveContent(o);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == o ? idVar : new id(new k0(performReceiveContent));
    }
}
