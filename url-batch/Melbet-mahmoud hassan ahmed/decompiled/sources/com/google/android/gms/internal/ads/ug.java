package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ug extends og {

    /* renamed from: b, reason: collision with root package name */
    public final rg f12779b = new rg();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f12780c;

    /* renamed from: d, reason: collision with root package name */
    public long f12781d;

    public ug(int i7) {
    }

    private final ByteBuffer j(int i7) {
        ByteBuffer byteBuffer = this.f12780c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i7);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.og
    public final void b() {
        super.b();
        ByteBuffer byteBuffer = this.f12780c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void h(int i7) {
        ByteBuffer byteBuffer = this.f12780c;
        if (byteBuffer == null) {
            this.f12780c = j(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f12780c.position();
        int i8 = i7 + position;
        if (capacity >= i8) {
            return;
        }
        ByteBuffer j7 = j(i8);
        if (position > 0) {
            this.f12780c.position(0);
            this.f12780c.limit(position);
            j7.put(this.f12780c);
        }
        this.f12780c = j7;
    }

    public final boolean i() {
        return d(1073741824);
    }
}
