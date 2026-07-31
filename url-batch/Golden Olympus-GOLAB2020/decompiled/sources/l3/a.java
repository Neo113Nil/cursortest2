package l3;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements h, j {

    /* renamed from: b, reason: collision with root package name */
    private final String f41335b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f41336c;

    public a(String contentType, byte[] bytes) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f41335b = contentType;
        this.f41336c = bytes;
    }

    @Override // l3.h
    public void a(OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.write(getBytes());
    }

    @Override // l3.j
    public byte[] getBytes() {
        return this.f41336c;
    }

    @Override // l3.h, l3.j
    public String getContentType() {
        return this.f41335b;
    }

    @Override // l3.h
    public long m() {
        return getBytes().length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
