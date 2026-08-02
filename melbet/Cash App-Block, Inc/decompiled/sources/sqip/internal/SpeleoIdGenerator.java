package sqip.internal;

import java.security.SecureRandom;
import java.util.Random;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lsqip/internal/SpeleoIdGenerator;", "", "()V", "random", "Ljava/util/Random;", "next", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpeleoIdGenerator {
    private final Random random = new SecureRandom();

    public final String next() {
        return LongCodec.INSTANCE.encodeToString(this.random.nextLong());
    }
}
