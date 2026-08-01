package M;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class N implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f509a;

    public N(r rVar) {
        this.f509a = rVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0005f c0005f = new C0005f(new E.g(contentInfo));
        C0005f a2 = ((S.s) this.f509a).a(view, c0005f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0005f) {
            return contentInfo;
        }
        ContentInfo r2 = a2.f544a.r();
        Objects.requireNonNull(r2);
        return I0.e.g(r2);
    }
}
