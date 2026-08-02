package E2;

import W.t;
import X.p;
import X.q;
import X.r;
import a.AbstractC0124a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f675a;

    public b(p pVar, r rVar) {
        int i4 = rVar.f3556a;
        ByteBuffer byteBuffer = rVar.f3557b;
        AbstractC0124a.h(i4 == 6 || i4 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        t tVar = new t(min, bArr);
        pVar.getClass();
        if (tVar.h()) {
            this.f675a = false;
            return;
        }
        int i5 = tVar.i(2);
        if (!tVar.h()) {
            this.f675a = true;
            return;
        }
        if (i5 != 3 && i5 != 0) {
            tVar.h();
        }
        tVar.s();
        throw new q();
    }
}
