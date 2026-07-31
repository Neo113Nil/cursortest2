package okio;

import java.util.Arrays;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: h, reason: collision with root package name */
    public static final a f43303h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f43304a;

    /* renamed from: b, reason: collision with root package name */
    public int f43305b;

    /* renamed from: c, reason: collision with root package name */
    public int f43306c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43307d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43308e;

    /* renamed from: f, reason: collision with root package name */
    public w f43309f;

    /* renamed from: g, reason: collision with root package name */
    public w f43310g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w() {
        this.f43304a = new byte[8192];
        this.f43308e = true;
        this.f43307d = false;
    }

    public final void a() {
        int i4;
        w wVar = this.f43310g;
        if (wVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(wVar);
        if (wVar.f43308e) {
            int i5 = this.f43306c - this.f43305b;
            w wVar2 = this.f43310g;
            Intrinsics.checkNotNull(wVar2);
            int i6 = 8192 - wVar2.f43306c;
            w wVar3 = this.f43310g;
            Intrinsics.checkNotNull(wVar3);
            if (wVar3.f43307d) {
                i4 = 0;
            } else {
                w wVar4 = this.f43310g;
                Intrinsics.checkNotNull(wVar4);
                i4 = wVar4.f43305b;
            }
            if (i5 > i6 + i4) {
                return;
            }
            w wVar5 = this.f43310g;
            Intrinsics.checkNotNull(wVar5);
            g(wVar5, i5);
            b();
            x.b(this);
        }
    }

    public final w b() {
        w wVar = this.f43309f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.f43310g;
        Intrinsics.checkNotNull(wVar2);
        wVar2.f43309f = this.f43309f;
        w wVar3 = this.f43309f;
        Intrinsics.checkNotNull(wVar3);
        wVar3.f43310g = this.f43310g;
        this.f43309f = null;
        this.f43310g = null;
        return wVar;
    }

    public final w c(w segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f43310g = this;
        segment.f43309f = this.f43309f;
        w wVar = this.f43309f;
        Intrinsics.checkNotNull(wVar);
        wVar.f43310g = segment;
        this.f43309f = segment;
        return segment;
    }

    public final w d() {
        this.f43307d = true;
        return new w(this.f43304a, this.f43305b, this.f43306c, true, false);
    }

    public final w e(int i4) {
        w c4;
        if (i4 <= 0 || i4 > this.f43306c - this.f43305b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i4 >= 1024) {
            c4 = d();
        } else {
            c4 = x.c();
            byte[] bArr = this.f43304a;
            byte[] bArr2 = c4.f43304a;
            int i5 = this.f43305b;
            AbstractC3219i.i(bArr, bArr2, 0, i5, i5 + i4, 2, null);
        }
        c4.f43306c = c4.f43305b + i4;
        this.f43305b += i4;
        w wVar = this.f43310g;
        Intrinsics.checkNotNull(wVar);
        wVar.c(c4);
        return c4;
    }

    public final w f() {
        byte[] bArr = this.f43304a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return new w(copyOf, this.f43305b, this.f43306c, false, true);
    }

    public final void g(w sink, int i4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f43308e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = sink.f43306c;
        if (i5 + i4 > 8192) {
            if (sink.f43307d) {
                throw new IllegalArgumentException();
            }
            int i6 = sink.f43305b;
            if ((i5 + i4) - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f43304a;
            AbstractC3219i.i(bArr, bArr, 0, i6, i5, 2, null);
            sink.f43306c -= sink.f43305b;
            sink.f43305b = 0;
        }
        byte[] bArr2 = this.f43304a;
        byte[] bArr3 = sink.f43304a;
        int i7 = sink.f43306c;
        int i8 = this.f43305b;
        AbstractC3219i.f(bArr2, bArr3, i7, i8, i8 + i4);
        sink.f43306c += i4;
        this.f43305b += i4;
    }

    public w(byte[] data, int i4, int i5, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43304a = data;
        this.f43305b = i4;
        this.f43306c = i5;
        this.f43307d = z4;
        this.f43308e = z5;
    }
}
