package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class epd {
    public final eik a;

    public epd(eik eikVar) {
        this.a = eikVar;
    }

    static epd a(Activity activity) {
        return new epd(new eik(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof epd) && b().equals(((epd) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return a.Z(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }

    public epd() {
        throw null;
    }
}
