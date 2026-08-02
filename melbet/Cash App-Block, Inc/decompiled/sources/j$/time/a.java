package j$.time;

import java.time.LocalDate;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-22006d330b5bac27a0b9d443f2c43dfc4a96f5c4b2f368f1c0fff99760a58590 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements LongFunction {
    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return LocalDate.ofEpochDay(j);
    }
}
