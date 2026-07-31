package c4;

import android.os.Handler;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 extends WebView {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f1964f;

    /* renamed from: g, reason: collision with root package name */
    private final l0 f1965g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1966h;

    public g0(j0 j0Var, Handler handler, l0 l0Var) {
        super(j0Var);
        this.f1966h = false;
        this.f1964f = handler;
        this.f1965g = l0Var;
    }

    static /* synthetic */ boolean d(g0 g0Var, boolean z6) {
        g0Var.f1966h = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void b(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        final String sb2 = sb.toString();
        this.f1964f.post(new Runnable(this, sb2) { // from class: c4.f0

            /* renamed from: f, reason: collision with root package name */
            private final g0 f1957f;

            /* renamed from: g, reason: collision with root package name */
            private final String f1958g;

            {
                this.f1957f = this;
                this.f1958g = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k1.a(this.f1957f, this.f1958g);
            }
        });
    }
}
