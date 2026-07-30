package z4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8727a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8728b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8729c;

    public j(boolean z7, boolean z8, Map headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f8727a = z7;
        this.f8728b = z8;
        this.f8729c = headers;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(j.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        j jVar = (j) obj;
        return V6.b.u(Boolean.valueOf(this.f8727a), Boolean.valueOf(jVar.f8727a)) && V6.b.u(Boolean.valueOf(this.f8728b), Boolean.valueOf(jVar.f8728b)) && V6.b.u(this.f8729c, jVar.f8729c);
    }

    public final int hashCode() {
        return V6.b.v(this.f8729c) + ((V6.b.v(Boolean.valueOf(this.f8728b)) + ((V6.b.v(Boolean.valueOf(this.f8727a)) + (j.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WebViewOptions(enableJavaScript=" + this.f8727a + ", enableDomStorage=" + this.f8728b + ", headers=" + this.f8729c + ")";
    }
}
