package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biz implements bbw {
    private final ByteBuffer a;

    public biz(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.bbw
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.bbw
    public final void b() {
    }
}
