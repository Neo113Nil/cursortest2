package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0026w f414a;

    public U(InterfaceC0026w interfaceC0026w) {
        this.f414a = interfaceC0026w;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0010f c0010f = new C0010f(new B0.d(contentInfo));
        C0010f a2 = ((Q.s) this.f414a).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0010f) {
            return contentInfo;
        }
        ContentInfo s2 = a2.f440a.s();
        Objects.requireNonNull(s2);
        return E0.e.g(s2);
    }
}
