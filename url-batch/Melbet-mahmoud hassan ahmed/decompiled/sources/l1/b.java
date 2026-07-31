package l1;

import j1.e;
import j1.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o2.a0;

/* loaded from: classes.dex */
public final class b extends h {
    @Override // j1.h
    protected j1.a b(e eVar, ByteBuffer byteBuffer) {
        return new j1.a(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(a0 a0Var) {
        return new a((String) o2.a.e(a0Var.w()), (String) o2.a.e(a0Var.w()), a0Var.v(), a0Var.v(), Arrays.copyOfRange(a0Var.d(), a0Var.e(), a0Var.f()));
    }
}
