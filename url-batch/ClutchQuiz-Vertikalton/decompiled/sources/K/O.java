package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class O implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0018t f361a;

    public O(InterfaceC0018t interfaceC0018t) {
        this.f361a = interfaceC0018t;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0006g c0006g = new C0006g(new A0.h(contentInfo));
        C0006g a2 = ((Q.s) this.f361a).a(view, c0006g);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0006g) {
            return contentInfo;
        }
        ContentInfo r2 = a2.f396a.r();
        Objects.requireNonNull(r2);
        return AbstractC0002c.g(r2);
    }
}
