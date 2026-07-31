package l3;

import com.ironsource.jn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f41347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41348b;

    /* renamed from: c, reason: collision with root package name */
    private final h f41349c;

    public g(String method, String url, h hVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f41347a = method;
        this.f41348b = url;
        this.f41349c = hVar;
    }

    public final h a() {
        return this.f41349c;
    }

    public final String b() {
        return this.f41347a;
    }

    public final String c() {
        return this.f41348b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String url, h hVar) {
        this(hVar == null ? jn.f16864a : jn.f16865b, url, hVar);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
