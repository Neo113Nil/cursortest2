package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwo {
    public double a;

    public final boolean a() {
        short epochSecond = (short) (Instant.now().getEpochSecond() % 30);
        if (epochSecond == 0) {
            this.a = 1.0d;
            return true;
        }
        this.a = 1.0d - (epochSecond / 30.0d);
        return false;
    }
}
