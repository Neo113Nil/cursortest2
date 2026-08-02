package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfe implements bgf, bfd {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public bfe(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.bfd
    public final bbu a(AssetManager assetManager, String str) {
        return this.b != 0 ? new bcb(assetManager, str) : new bcj(assetManager, str);
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        return this.b != 0 ? new bfp(this.a, this, 1) : new bfp(this.a, this, 1);
    }
}
