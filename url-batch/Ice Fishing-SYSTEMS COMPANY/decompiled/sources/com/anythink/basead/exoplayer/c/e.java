package com.anythink.basead.exoplayer.c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends com.anythink.basead.exoplayer.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6895a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6896b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6897c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final b f6898d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f6899e;

    /* renamed from: f, reason: collision with root package name */
    public long f6900f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6901g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int i) {
        this.f6901g = i;
    }

    public static e e() {
        return new e(0);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f6899e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f6899e;
        if (byteBuffer == null) {
            this.f6899e = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f6899e.position();
        int i4 = i + position;
        if (capacity >= i4) {
            return;
        }
        ByteBuffer e6 = e(i4);
        if (position > 0) {
            this.f6899e.position(0);
            this.f6899e.limit(position);
            e6.put(this.f6899e);
        }
        this.f6899e = e6;
    }

    public final boolean f() {
        return this.f6899e == null && this.f6901g == 0;
    }

    public final boolean g() {
        return c(1073741824);
    }

    public final void h() {
        this.f6899e.flip();
    }

    private ByteBuffer e(int i) {
        int i4 = this.f6901g;
        if (i4 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f6899e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
