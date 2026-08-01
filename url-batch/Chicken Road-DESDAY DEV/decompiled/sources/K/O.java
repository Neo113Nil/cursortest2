package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class O implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0017s f365a;

    public O(InterfaceC0017s interfaceC0017s) {
        this.f365a = interfaceC0017s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0005f c0005f = new C0005f(new C.g(contentInfo));
        C0005f a2 = ((Q.s) this.f365a).a(view, c0005f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0005f) {
            return contentInfo;
        }
        ContentInfo r2 = a2.f397a.r();
        Objects.requireNonNull(r2);
        return F0.e.g(r2);
    }
}
