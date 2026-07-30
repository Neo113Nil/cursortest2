package D6;

import a.AbstractC0169a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0096d implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0097e f480e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f481i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f482l;

    public /* synthetic */ C0096d(C0097e c0097e, Object obj, Object obj2, int i2) {
        this.f479d = i2;
        this.f480e = c0097e;
        this.f481i = obj;
        this.f482l = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List c7;
        switch (this.f479d) {
            case 0:
                List<Certificate> list = (List) this.f481i;
                String str = (String) this.f482l;
                AbstractC0169a abstractC0169a = this.f480e.f485b;
                if (abstractC0169a != null && (c7 = abstractC0169a.c(str, list)) != null) {
                    list = c7;
                }
                ArrayList arrayList = new ArrayList(kotlin.collections.s.g(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                p pVar = (p) this.f481i;
                C0093a c0093a = (C0093a) this.f482l;
                AbstractC0169a abstractC0169a2 = this.f480e.f485b;
                Intrinsics.b(abstractC0169a2);
                return abstractC0169a2.c(c0093a.f463h.f565d, pVar.a());
        }
    }
}
