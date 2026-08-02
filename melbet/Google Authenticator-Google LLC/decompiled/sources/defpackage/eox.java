package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eox {
    public final epd a;
    public final gzp b;
    public final gzp c;
    public final gzp d;
    public final gzp e;

    public eox(epd epdVar, gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4) {
        this.a = epdVar;
        this.b = gzpVar;
        this.c = gzpVar2;
        this.d = gzpVar3;
        this.e = gzpVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eox) {
            eox eoxVar = (eox) obj;
            if (this.a.equals(eoxVar.a) && this.b.equals(eoxVar.b) && this.c.equals(eoxVar.c) && this.d.equals(eoxVar.d) && this.e.equals(eoxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent(), perfettoTriggerJankFrameRatioThresholdOverride=Optional.absent(), perfettoTriggerJankDurationThresholdOverride=Optional.absent(), triggerPerfettoFromBackground=false}";
    }

    public eox() {
        throw null;
    }
}
