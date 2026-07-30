package O;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import g1.C4524d;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0359v f2235a;

    public U(InterfaceC0359v interfaceC0359v) {
        this.f2235a = interfaceC0359v;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0344f c0344f = new C0344f(new C4524d(contentInfo));
        C0344f a9 = ((U.r) this.f2235a).a(view, c0344f);
        if (a9 == null) {
            return null;
        }
        if (a9 == c0344f) {
            return contentInfo;
        }
        ContentInfo y6 = a9.f2260a.y();
        Objects.requireNonNull(y6);
        return N0.a.p(y6);
    }
}
