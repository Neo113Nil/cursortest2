package L;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0020s f486a;

    public P(InterfaceC0020s interfaceC0020s) {
        this.f486a = interfaceC0020s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0008f c0008f = new C0008f(new D.g(contentInfo));
        C0008f a2 = ((R.s) this.f486a).a(view, c0008f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0008f) {
            return contentInfo;
        }
        ContentInfo r2 = a2.f516a.r();
        Objects.requireNonNull(r2);
        return H0.e.g(r2);
    }
}
