package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ds0 {

    /* renamed from: a, reason: collision with root package name */
    private long f4310a;

    public final long a(ByteBuffer byteBuffer) {
        s7 s7Var;
        r7 r7Var;
        long j7 = this.f4310a;
        if (j7 > 0) {
            return j7;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<p7> it = new n7(new cs0(duplicate), fs0.f5189c).i().iterator();
            while (true) {
                s7Var = null;
                if (!it.hasNext()) {
                    r7Var = null;
                    break;
                }
                p7 next = it.next();
                if (next instanceof r7) {
                    r7Var = (r7) next;
                    break;
                }
            }
            Iterator<p7> it2 = r7Var.i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                p7 next2 = it2.next();
                if (next2 instanceof s7) {
                    s7Var = (s7) next2;
                    break;
                }
            }
            long h7 = (s7Var.h() * 1000) / s7Var.i();
            this.f4310a = h7;
            return h7;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
