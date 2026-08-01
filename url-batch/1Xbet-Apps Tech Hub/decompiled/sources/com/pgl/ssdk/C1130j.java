package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: FileChannelDataSource.java */
/* renamed from: com.pgl.ssdk.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1130j implements InterfaceC1133m {
    private final FileChannel a;
    private final long b;
    private final long c;

    public C1130j(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public InterfaceC1133m a(long j, long j2) {
        long a = a();
        a(j, j2, a);
        return (j == 0 && j2 == a) ? this : new C1130j(this.a, this.b + j, j2);
    }

    public ByteBuffer a(long j, int i) throws IOException {
        int read;
        if (i >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            a(j, i, a());
            if (i != 0) {
                if (i <= allocate.remaining()) {
                    long j2 = this.b + j;
                    int limit = allocate.limit();
                    try {
                        allocate.limit(allocate.position() + i);
                        while (i > 0) {
                            synchronized (this.a) {
                                this.a.position(j2);
                                read = this.a.read(allocate);
                            }
                            j2 += read;
                            i -= read;
                        }
                    } finally {
                        allocate.limit(limit);
                    }
                } else {
                    throw new BufferOverflowException();
                }
            }
            allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
    }

    private static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        }
        if (j4 > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
        }
    }
}
