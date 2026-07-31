package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class m {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12201a;

        a(ByteBuffer byteBuffer) {
            this.f12201a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() {
            return this.f12201a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i4) {
            ByteBuffer byteBuffer = this.f12201a;
            byteBuffer.position(byteBuffer.position() + i4);
        }

        @Override // androidx.emoji2.text.m.c
        public long c() {
            return m.c(this.f12201a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f12201a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f12201a.getShort());
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f12202a;

        /* renamed from: b, reason: collision with root package name */
        private final long f12203b;

        b(long j4, long j5) {
            this.f12202a = j4;
            this.f12203b = j5;
        }

        long a() {
            return this.f12202a;
        }
    }

    private interface c {
        int a();

        void b(int i4);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j4;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i4 = 0;
        while (true) {
            if (i4 >= readUnsignedShort) {
                j4 = -1;
                break;
            }
            int a4 = cVar.a();
            cVar.b(4);
            j4 = cVar.c();
            cVar.b(4);
            if (1835365473 == a4) {
                break;
            }
            i4++;
        }
        if (j4 != -1) {
            cVar.b((int) (j4 - cVar.getPosition()));
            cVar.b(12);
            long c4 = cVar.c();
            for (int i5 = 0; i5 < c4; i5++) {
                int a5 = cVar.a();
                long c5 = cVar.c();
                long c6 = cVar.c();
                if (1164798569 == a5 || 1701669481 == a5) {
                    return new b(c5 + j4, c6);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static T.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return T.b.h(duplicate);
    }

    static long c(int i4) {
        return i4 & 4294967295L;
    }

    static int d(short s4) {
        return s4 & 65535;
    }
}
