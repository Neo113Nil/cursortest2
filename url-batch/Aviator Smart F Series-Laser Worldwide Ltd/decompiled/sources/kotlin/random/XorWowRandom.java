package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v, reason: collision with root package name */
    private int f17042v;

    /* renamed from: w, reason: collision with root package name */
    private int f17043w;

    /* renamed from: x, reason: collision with root package name */
    private int f17044x;

    /* renamed from: y, reason: collision with root package name */
    private int f17045y;

    /* renamed from: z, reason: collision with root package name */
    private int f17046z;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public XorWowRandom(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f17044x = i8;
        this.f17045y = i9;
        this.f17046z = i10;
        this.f17043w = i11;
        this.f17042v = i12;
        this.addend = i13;
        if ((i8 | i9 | i10 | i11 | i12) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i14 = 0; i14 < 64; i14++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i8) {
        return d.takeUpperBits(nextInt(), i8);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i8 = this.f17044x;
        int i9 = i8 ^ (i8 >>> 2);
        this.f17044x = this.f17045y;
        this.f17045y = this.f17046z;
        this.f17046z = this.f17043w;
        int i10 = this.f17042v;
        this.f17043w = i10;
        int i11 = ((i9 ^ (i9 << 1)) ^ i10) ^ (i10 << 4);
        this.f17042v = i11;
        int i12 = this.addend + 362437;
        this.addend = i12;
        return i11 + i12;
    }

    public XorWowRandom(int i8, int i9) {
        this(i8, i9, 0, 0, ~i8, (i8 << 10) ^ (i9 >>> 4));
    }
}
