package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class z60 implements d32 {

    /* renamed from: a, reason: collision with root package name */
    private final vu f35479a = new vu();

    /* renamed from: b, reason: collision with root package name */
    private final g32 f35480b = new g32();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f35481c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f35482d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35483e;

    final class a extends h32 {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.hy
        public final void h() {
            z60.this.a(this);
        }
    }

    private static final class b implements c32 {

        /* renamed from: b, reason: collision with root package name */
        private final long f35485b;

        /* renamed from: c, reason: collision with root package name */
        private final sj0<uu> f35486c;

        public b(long j4, sj0<uu> sj0Var) {
            this.f35485b = j4;
            this.f35486c = sj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.c32
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.c32
        public final List<uu> b(long j4) {
            return j4 >= this.f35485b ? this.f35486c : sj0.h();
        }

        @Override // com.yandex.mobile.ads.impl.c32
        public final long a(int i4) {
            if (i4 == 0) {
                return this.f35485b;
            }
            throw new IllegalArgumentException();
        }

        @Override // com.yandex.mobile.ads.impl.c32
        public final int a(long j4) {
            return this.f35485b > j4 ? 0 : -1;
        }
    }

    public z60() {
        for (int i4 = 0; i4 < 2; i4++) {
            this.f35481c.addFirst(new a());
        }
        this.f35482d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final g32 b() {
        if (this.f35483e) {
            throw new IllegalStateException();
        }
        if (this.f35482d != 0) {
            return null;
        }
        this.f35482d = 1;
        return this.f35480b;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void flush() {
        if (this.f35483e) {
            throw new IllegalStateException();
        }
        this.f35480b.b();
        this.f35482d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void release() {
        this.f35483e = true;
    }

    @Override // com.yandex.mobile.ads.impl.d32
    public final void a(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final h32 a() {
        if (!this.f35483e) {
            if (this.f35482d != 2 || this.f35481c.isEmpty()) {
                return null;
            }
            h32 h32Var = (h32) this.f35481c.removeFirst();
            if (this.f35480b.f()) {
                h32Var.b(4);
            } else {
                g32 g32Var = this.f35480b;
                long j4 = g32Var.f26358f;
                vu vuVar = this.f35479a;
                ByteBuffer byteBuffer = g32Var.f26356d;
                byteBuffer.getClass();
                byte[] array = byteBuffer.array();
                vuVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                obtain.recycle();
                ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                parcelableArrayList.getClass();
                h32Var.a(this.f35480b.f26358f, new b(j4, C2282ul.a(uu.f33247t, parcelableArrayList)), 0L);
            }
            this.f35480b.b();
            this.f35482d = 0;
            return h32Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void a(g32 g32Var) {
        if (!this.f35483e) {
            if (this.f35482d == 1) {
                if (this.f35480b == g32Var) {
                    this.f35482d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h32 h32Var) {
        if (this.f35481c.size() < 2) {
            if (!this.f35481c.contains(h32Var)) {
                h32Var.b();
                this.f35481c.addFirst(h32Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
