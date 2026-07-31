package O0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;

/* loaded from: classes.dex */
public class C {

    /* renamed from: b, reason: collision with root package name */
    private static C f1096b;

    /* renamed from: a, reason: collision with root package name */
    private Context f1097a;

    private static class a extends AbstractC0414n {

        /* renamed from: a, reason: collision with root package name */
        String f1098a;

        /* renamed from: b, reason: collision with root package name */
        String f1099b;

        public a(String str, String str2) {
            this.f1098a = str;
            this.f1099b = str2;
        }

        @Override // O0.AbstractC0414n
        public String c() {
            return r0.d(this.f1098a, this.f1099b);
        }

        @Override // O0.AbstractC0414n
        public String d(String str) {
            return Q0.b.b(str);
        }

        @Override // O0.AbstractC0414n
        public String f() {
            return r0.g(this.f1098a, this.f1099b);
        }

        @Override // O0.AbstractC0414n
        public String g() {
            return r0.j(this.f1098a, this.f1099b);
        }

        @Override // O0.AbstractC0414n
        public int h() {
            return (r0.k(this.f1098a, this.f1099b) ? 4 : 0) | (r0.e(this.f1098a, this.f1099b) ? 2 : 0) | (r0.h(this.f1098a, this.f1099b) ? 1 : 0);
        }
    }

    public static C a() {
        C c4;
        synchronized (C.class) {
            try {
                if (f1096b == null) {
                    f1096b = new C();
                }
                c4 = f1096b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4;
    }

    public String b(String str, String str2) {
        return AbstractC0425z.a(this.f1097a, str, str2);
    }

    public String c(boolean z4) {
        if (!z4) {
            return "";
        }
        String i4 = Y.i();
        if (TextUtils.isEmpty(i4)) {
            i4 = AbstractC0413m.b(this.f1097a, "global_v2", CommonUrlParts.UUID, "");
            if (TextUtils.isEmpty(i4)) {
                i4 = UUID.randomUUID().toString().replace("-", "");
                AbstractC0413m.g(this.f1097a, "global_v2", CommonUrlParts.UUID, i4);
            }
            Y.p(i4);
        }
        return i4;
    }

    public void d(Context context) {
        if (this.f1097a == null) {
            this.f1097a = context;
        }
    }

    public String e(String str, String str2) {
        return AbstractC0425z.b(this.f1097a, str, str2);
    }

    public B f(String str, String str2) {
        return new a(str, str2).b(this.f1097a);
    }

    public String g(String str, String str2) {
        return r.f(str, str2);
    }

    public Pair h(String str, String str2) {
        if (!r0.f(str, str2)) {
            return new Pair("", "");
        }
        String F4 = d0.e().d().F();
        String H3 = d0.e().d().H();
        if (!TextUtils.isEmpty(F4) && !TextUtils.isEmpty(H3)) {
            return new Pair(F4, H3);
        }
        Pair l4 = m0.l(this.f1097a);
        d0.e().d().w((String) l4.first);
        d0.e().d().y((String) l4.second);
        return l4;
    }

    public String i(String str, String str2) {
        return r.e(str, str2);
    }
}
