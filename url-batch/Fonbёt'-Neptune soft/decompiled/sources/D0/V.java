package D0;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements P0.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JsResult f285g;

    public /* synthetic */ V(X x2, JsResult jsResult, int i2) {
        this.f283e = i2;
        this.f284f = x2;
        this.f285g = jsResult;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        Q q2 = (Q) obj;
        switch (this.f283e) {
            case 0:
                X x2 = this.f284f;
                x2.getClass();
                if (!q2.f270d) {
                    boolean equals = Boolean.TRUE.equals(q2.f268b);
                    JsResult jsResult = this.f285g;
                    if (!equals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    O o2 = x2.f290b.f366a;
                    Throwable th = q2.f269c;
                    Objects.requireNonNull(th);
                    o2.getClass();
                    O.b(th);
                    break;
                }
            case 1:
                X x3 = this.f284f;
                x3.getClass();
                if (!q2.f270d) {
                    this.f285g.confirm();
                    break;
                } else {
                    O o3 = x3.f290b.f366a;
                    Throwable th2 = q2.f269c;
                    Objects.requireNonNull(th2);
                    o3.getClass();
                    O.b(th2);
                    break;
                }
            default:
                X x4 = this.f284f;
                x4.getClass();
                if (!q2.f270d) {
                    String str = (String) q2.f268b;
                    JsPromptResult jsPromptResult = (JsPromptResult) this.f285g;
                    if (str == null) {
                        jsPromptResult.cancel();
                        break;
                    } else {
                        jsPromptResult.confirm(str);
                        break;
                    }
                } else {
                    O o4 = x4.f290b.f366a;
                    Throwable th3 = q2.f269c;
                    Objects.requireNonNull(th3);
                    o4.getClass();
                    O.b(th3);
                    break;
                }
        }
        return null;
    }
}
