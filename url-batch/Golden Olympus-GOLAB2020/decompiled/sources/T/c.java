package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f9286a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f9287b;

    /* renamed from: c, reason: collision with root package name */
    private int f9288c;

    /* renamed from: d, reason: collision with root package name */
    private int f9289d;

    /* renamed from: e, reason: collision with root package name */
    d f9290e = d.a();

    protected int a(int i4) {
        return i4 + this.f9287b.getInt(i4);
    }

    protected int b(int i4) {
        if (i4 < this.f9289d) {
            return this.f9287b.getShort(this.f9288c + i4);
        }
        return 0;
    }

    protected void c(int i4, ByteBuffer byteBuffer) {
        this.f9287b = byteBuffer;
        if (byteBuffer == null) {
            this.f9286a = 0;
            this.f9288c = 0;
            this.f9289d = 0;
        } else {
            this.f9286a = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.f9288c = i5;
            this.f9289d = this.f9287b.getShort(i5);
        }
    }

    protected int d(int i4) {
        int i5 = i4 + this.f9286a;
        return i5 + this.f9287b.getInt(i5) + 4;
    }

    protected int e(int i4) {
        int i5 = i4 + this.f9286a;
        return this.f9287b.getInt(i5 + this.f9287b.getInt(i5));
    }
}
