package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bja implements bdv {
    private final /* synthetic */ int a;
    private final Object b;

    public bja(byte[] bArr, int i) {
        this.a = i;
        a.v(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.bdv
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? bmi.a((Bitmap) obj) : ((byte[]) obj).length;
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.a != 0 ? Bitmap.class : byte[].class;
    }

    @Override // defpackage.bdv
    public final /* synthetic */ Object c() {
        return this.b;
    }

    public bja(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.bdv
    public final void e() {
    }
}
