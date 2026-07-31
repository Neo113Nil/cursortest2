package l3;

import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    private final String f41337b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41338c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41339d;

    /* renamed from: e, reason: collision with root package name */
    private final long f41340e;

    public c(String boundary, List parts) {
        long j4;
        byte[] bArr;
        int g4;
        byte[] bArr2;
        byte[] bArr3;
        int g5;
        byte[] bArr4;
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f41337b = boundary;
        this.f41338c = parts;
        this.f41339d = "multipart/form-data; boundary=" + boundary;
        List list = parts;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).a().m() < 0) {
                    j4 = -1;
                    break;
                }
            }
        }
        List<f> list2 = this.f41338c;
        bArr = e.f41344b;
        long length = bArr.length;
        g4 = e.g(this.f41337b);
        long j5 = length + g4;
        bArr2 = e.f41343a;
        long length2 = j5 + bArr2.length;
        for (f fVar : list2) {
            bArr3 = e.f41344b;
            long length3 = length2 + bArr3.length;
            g5 = e.g(this.f41337b);
            long j6 = length3 + g5;
            bArr4 = e.f41343a;
            length2 = j6 + bArr4.length + fVar.b();
        }
        j4 = length2;
        this.f41340e = j4;
    }

    @Override // l3.h
    public void a(OutputStream stream) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Intrinsics.checkNotNullParameter(stream, "stream");
        for (f fVar : this.f41338c) {
            bArr3 = e.f41344b;
            stream.write(bArr3);
            e.h(stream, this.f41337b);
            bArr4 = e.f41343a;
            stream.write(bArr4);
            fVar.c(stream);
        }
        bArr = e.f41344b;
        stream.write(bArr);
        e.h(stream, this.f41337b);
        bArr2 = e.f41344b;
        stream.write(bArr2);
    }

    @Override // l3.h, l3.j
    public String getContentType() {
        return this.f41339d;
    }

    @Override // l3.h
    public long m() {
        return this.f41340e;
    }
}
