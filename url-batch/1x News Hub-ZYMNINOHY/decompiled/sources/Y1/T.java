package Y1;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f1788c;

    public /* synthetic */ T(V v, JsResult jsResult, int i3) {
        this.f1786a = i3;
        this.f1787b = v;
        this.f1788c = jsResult;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        N n3 = (N) obj;
        switch (this.f1786a) {
            case 0:
                V v = this.f1787b;
                if (!n3.f1772d) {
                    boolean equals = Boolean.TRUE.equals(n3.f1770b);
                    JsResult jsResult = this.f1788c;
                    if (!equals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    A0.d dVar = v.f1793b.f1861a;
                    Throwable th = n3.f1771c;
                    Objects.requireNonNull(th);
                    dVar.getClass();
                    A0.d.b(th);
                    break;
                }
            case 1:
                V v3 = this.f1787b;
                if (!n3.f1772d) {
                    this.f1788c.confirm();
                    break;
                } else {
                    A0.d dVar2 = v3.f1793b.f1861a;
                    Throwable th2 = n3.f1771c;
                    Objects.requireNonNull(th2);
                    dVar2.getClass();
                    A0.d.b(th2);
                    break;
                }
            default:
                V v4 = this.f1787b;
                if (!n3.f1772d) {
                    String str = (String) n3.f1770b;
                    JsPromptResult jsPromptResult = (JsPromptResult) this.f1788c;
                    if (str == null) {
                        jsPromptResult.cancel();
                        break;
                    } else {
                        jsPromptResult.confirm(str);
                        break;
                    }
                } else {
                    A0.d dVar3 = v4.f1793b.f1861a;
                    Throwable th3 = n3.f1771c;
                    Objects.requireNonNull(th3);
                    dVar3.getClass();
                    A0.d.b(th3);
                    break;
                }
        }
        return null;
    }
}
