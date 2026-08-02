package D0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.util.List;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f261c;

    /* renamed from: d, reason: collision with root package name */
    public Object f262d;

    /* renamed from: e, reason: collision with root package name */
    public Object f263e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f264f;

    public O(InterfaceC0320f interfaceC0320f, Context context, C0058s c0058s) {
        Q0.h.e(interfaceC0320f, "binaryMessenger");
        this.f260b = interfaceC0320f;
        this.f261c = new C0044d(new B.m(2, new C0047g(interfaceC0320f)));
        this.f263e = context;
        this.f264f = c0058s;
    }

    public static void b(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public w0.k a() {
        if (((C0048h) this.f262d) == null) {
            this.f262d = new C0048h(this);
        }
        C0048h c0048h = (C0048h) this.f262d;
        Q0.h.b(c0048h);
        return c0048h;
    }

    public void c(Runnable runnable) {
        Context context = (Context) this.f263e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public String toString() {
        switch (this.f259a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f260b) + ", mProviderPackage: " + ((String) this.f261c) + ", mQuery: " + ((String) this.f262d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f263e;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public O(String str, String str2, String str3, List list) {
        this.f260b = str;
        this.f261c = str2;
        this.f262d = str3;
        list.getClass();
        this.f263e = list;
        this.f264f = str + "-" + str2 + "-" + str3;
    }
}
