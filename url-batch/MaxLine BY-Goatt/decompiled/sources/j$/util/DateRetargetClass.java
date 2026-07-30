package j$.util;

import j$.time.Instant;
import java.util.Date;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.c;
        return Instant.s(Math.floorDiv(time, 1000L), ((int) Math.floorMod(time, 1000L)) * 1000000);
    }
}
