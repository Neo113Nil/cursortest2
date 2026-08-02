package defpackage;

import j$.time.Instant;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ked {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public ked(Instant instant, boolean z, boolean z2) {
        instant.getClass();
        this.c = instant;
        this.a = z;
        this.b = z2;
    }

    public ked(ByteBuffer byteBuffer, boolean z, boolean z2) {
        this.c = byteBuffer;
        this.a = z;
        this.b = z2;
    }
}
