package M;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0021q f706a;

    public M(InterfaceC0021q interfaceC0021q) {
        this.f706a = interfaceC0021q;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0010f c0010f = new C0010f(new C1.d(contentInfo));
        C0010f a2 = ((S.r) this.f706a).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0010f) {
            return contentInfo;
        }
        ContentInfo o2 = a2.f743a.o();
        Objects.requireNonNull(o2);
        return K0.e.g(o2);
    }
}
