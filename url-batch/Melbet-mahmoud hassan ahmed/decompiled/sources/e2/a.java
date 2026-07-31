package e2;

import c2.g;
import c2.h;
import java.util.List;
import o2.a0;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o, reason: collision with root package name */
    private final b f16012o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f16012o = new b(a0Var.I(), a0Var.I());
    }

    @Override // c2.g
    protected h A(byte[] bArr, int i7, boolean z6) {
        if (z6) {
            this.f16012o.r();
        }
        return new c(this.f16012o.b(bArr, i7));
    }
}
