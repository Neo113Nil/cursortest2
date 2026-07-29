package d.a.a;

import b.ad;
import com.google.gson.t;
import d.e;
import java.io.IOException;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes2.dex */
final class c<T> implements e<ad, T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f9542a;

    /* renamed from: b, reason: collision with root package name */
    private final t<T> f9543b;

    c(com.google.gson.e eVar, t<T> tVar) {
        this.f9542a = eVar;
        this.f9543b = tVar;
    }

    @Override // d.e
    public T a(ad adVar) throws IOException {
        try {
            return this.f9543b.b(this.f9542a.a(adVar.d()));
        } finally {
            adVar.close();
        }
    }
}
