package defpackage;

import j$.time.Instant;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byu {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/migration/exports/RemoveExportedCodesFragmentPeer");
    public final byr b;
    public final bxa c;
    public final gbi d;
    public final byt e = new byt(this);
    public final hel f;
    public final brn g;

    public byu(bzk bzkVar, byr byrVar, bxa bxaVar, brn brnVar, gbi gbiVar) {
        this.b = byrVar;
        this.c = bxaVar;
        this.g = brnVar;
        this.d = gbiVar;
        long epochMilli = Instant.now().toEpochMilli();
        heg hegVar = new heg(4);
        Iterator it = bzkVar.b.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((bmu) it.next()).c.iterator();
            while (it2.hasNext()) {
                try {
                    hegVar.h(bpc.d((bmv) it2.next(), null, epochMilli));
                } catch (boz | bps e) {
                    ((hkf) ((hkf) ((hkf) bzj.a.e()).h(e)).i("com/google/android/apps/authenticator2/migration/payloadprocessor/MigrationPayloadUtils", "parseOtps", (char) 128, "MigrationPayloadUtils.java")).s("Could not parse an OTP from a migration payload");
                }
            }
        }
        this.f = hegVar.g();
    }
}
