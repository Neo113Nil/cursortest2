package com.crrepa.n0;

import android.graphics.Bitmap;
import com.crrepa.f.g;
import com.crrepa.g1.c;
import com.crrepa.l0.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: n, reason: collision with root package name */
    private byte f13384n;

    @Override // com.crrepa.l0.b
    public void a() {
        j();
        b(false);
    }

    @Override // com.crrepa.l0.b
    protected void b(boolean z7) {
        byte[] bArr = new byte[5];
        if (z7) {
            h();
        } else {
            Arrays.fill(bArr, (byte) -1);
        }
        bArr[0] = this.f13384n;
        a(g.a(-13, bArr));
    }

    @Override // com.crrepa.l0.b
    protected void i(int i8) {
        byte[] bArr = new byte[5];
        bArr[0] = this.f13384n;
        byte[] c8 = c.c(i8);
        System.arraycopy(c8, 0, bArr, 1, c8.length);
        a(g.a(-13, bArr));
    }

    public void a(byte b8, Bitmap bitmap) {
        this.f13384n = b8;
        a(bitmap);
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length < 1) {
            return null;
        }
        return b4.b.a(bitmapArr[0], z7).f();
    }
}
