package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class N implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0021q f574a;

    public N(InterfaceC0021q interfaceC0021q) {
        this.f574a = interfaceC0021q;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0010f c0010f = new C0010f(new A0.c(contentInfo));
        C0010f a2 = ((Q.r) this.f574a).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0010f) {
            return contentInfo;
        }
        ContentInfo m2 = a2.f610a.m();
        Objects.requireNonNull(m2);
        return C0.a.g(m2);
    }
}
