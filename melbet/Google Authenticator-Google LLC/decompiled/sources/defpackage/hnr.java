package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnr extends hno {
    public static final hno a = new hnr();

    @Override // defpackage.hno
    public final hlw a(String str) {
        return new hnl(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
