package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erl {
    private final float a;
    private final Random b;

    public erl(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        hoq.y(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
