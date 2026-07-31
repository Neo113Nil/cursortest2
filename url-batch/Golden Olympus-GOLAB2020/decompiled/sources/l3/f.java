package l3;

import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final h f41345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41346b;

    public f(String name, String str, String str2, h body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f41345a = body;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        e.f(sb, name);
        if (str != null) {
            sb.append("; filename=");
            e.f(sb, str);
        }
        sb.append("\r\n");
        if (str2 != null) {
            sb.append("Content-Type: ");
            sb.append(str2);
            sb.append("\r\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f41346b = sb2;
    }

    public final h a() {
        return this.f41345a;
    }

    public final long b() {
        int g4;
        byte[] bArr;
        byte[] bArr2;
        if (this.f41345a.m() < 0) {
            return -1L;
        }
        g4 = e.g(this.f41346b);
        bArr = e.f41343a;
        long length = g4 + bArr.length + this.f41345a.m();
        bArr2 = e.f41343a;
        return length + bArr2.length;
    }

    public final void c(OutputStream stream) {
        byte[] bArr;
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(stream, "stream");
        e.h(stream, this.f41346b);
        bArr = e.f41343a;
        stream.write(bArr);
        this.f41345a.a(stream);
        bArr2 = e.f41343a;
        stream.write(bArr2);
    }

    public /* synthetic */ f(String str, String str2, String str3, h hVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, hVar);
    }
}
