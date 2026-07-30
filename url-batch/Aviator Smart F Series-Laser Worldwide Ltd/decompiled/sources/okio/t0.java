package okio;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class t0 {
    public static final a Companion = new a(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public t0 next;
    public boolean owner;
    public int pos;
    public t0 prev;
    public boolean shared;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public t0() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        t0 t0Var = this.prev;
        int i8 = 0;
        if (!(t0Var != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        if (t0Var.owner) {
            int i9 = this.limit - this.pos;
            t0 t0Var2 = this.prev;
            kotlin.jvm.internal.s.checkNotNull(t0Var2);
            int i10 = 8192 - t0Var2.limit;
            t0 t0Var3 = this.prev;
            kotlin.jvm.internal.s.checkNotNull(t0Var3);
            if (!t0Var3.shared) {
                t0 t0Var4 = this.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var4);
                i8 = t0Var4.pos;
            }
            if (i9 > i10 + i8) {
                return;
            }
            t0 t0Var5 = this.prev;
            kotlin.jvm.internal.s.checkNotNull(t0Var5);
            writeTo(t0Var5, i9);
            pop();
            u0.recycle(this);
        }
    }

    public final t0 pop() {
        t0 t0Var = this.next;
        if (t0Var == this) {
            t0Var = null;
        }
        t0 t0Var2 = this.prev;
        kotlin.jvm.internal.s.checkNotNull(t0Var2);
        t0Var2.next = this.next;
        t0 t0Var3 = this.next;
        kotlin.jvm.internal.s.checkNotNull(t0Var3);
        t0Var3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return t0Var;
    }

    public final t0 push(t0 segment) {
        kotlin.jvm.internal.s.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        t0 t0Var = this.next;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        t0Var.prev = segment;
        this.next = segment;
        return segment;
    }

    public final t0 sharedCopy() {
        this.shared = true;
        return new t0(this.data, this.pos, this.limit, true, false);
    }

    public final t0 split(int i8) {
        t0 take;
        if (!(i8 > 0 && i8 <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i8 >= 1024) {
            take = sharedCopy();
        } else {
            take = u0.take();
            byte[] bArr = this.data;
            byte[] bArr2 = take.data;
            int i9 = this.pos;
            kotlin.collections.k.copyInto$default(bArr, bArr2, 0, i9, i9 + i8, 2, (Object) null);
        }
        take.limit = take.pos + i8;
        this.pos += i8;
        t0 t0Var = this.prev;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        t0Var.push(take);
        return take;
    }

    public final t0 unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new t0(copyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(t0 sink, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i9 = sink.limit;
        if (i9 + i8 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.pos;
            if ((i9 + i8) - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            kotlin.collections.k.copyInto$default(bArr, bArr, 0, i10, i9, 2, (Object) null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i11 = sink.limit;
        int i12 = this.pos;
        kotlin.collections.k.copyInto(bArr2, bArr3, i11, i12, i12 + i8);
        sink.limit += i8;
        this.pos += i8;
    }

    public t0(byte[] data, int i8, int i9, boolean z7, boolean z8) {
        kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i8;
        this.limit = i9;
        this.shared = z7;
        this.owner = z8;
    }
}
