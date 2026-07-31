package O0;

import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private String f1089a;

    /* renamed from: b, reason: collision with root package name */
    private String f1090b;

    /* renamed from: c, reason: collision with root package name */
    private String f1091c;

    /* renamed from: d, reason: collision with root package name */
    private String f1092d;

    /* renamed from: e, reason: collision with root package name */
    private long f1093e;

    public A(String str, String str2, String str3, String str4, long j4) {
        this.f1089a = str;
        this.f1090b = str2;
        this.f1091c = str3;
        this.f1092d = str4;
        this.f1093e = j4;
    }

    public void a() {
        j0.h("StreamEventHandler", "Begin to handle stream events...");
        C0406f c0406f = new C0406f();
        c0406f.e(this.f1091c);
        c0406f.i(this.f1090b);
        c0406f.b(this.f1092d);
        c0406f.g(String.valueOf(this.f1093e));
        if ("oper".equals(this.f1090b) && r0.i(this.f1089a, "oper")) {
            V b4 = p0.c().b(this.f1089a, this.f1093e);
            String a4 = b4.a();
            Boolean valueOf = Boolean.valueOf(b4.f());
            c0406f.k(a4);
            c0406f.j(String.valueOf(valueOf));
        }
        String replace = UUID.randomUUID().toString().replace("-", "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0406f);
        new I(this.f1089a, this.f1090b, Y.m(), arrayList, replace).b();
    }
}
