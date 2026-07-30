package p000createpolar;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperThreadNeoPulse2163 extends CancellationException {
    public final transient PolarVoyageInputFilterFusionMax7714 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageLooperThreadNeoPulse2163(String str, Throwable th, PolarVoyageInputFilterFusionMax7714 polarVoyageInputFilterFusionMax7714) {
        super(str);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageInputFilterFusionMax7714;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageLooperThreadNeoPulse2163)) {
            return false;
        }
        PolarVoyageLooperThreadNeoPulse2163 polarVoyageLooperThreadNeoPulse2163 = (PolarVoyageLooperThreadNeoPulse2163) obj;
        if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLooperThreadNeoPulse2163.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = polarVoyageLooperThreadNeoPulse2163.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj2 == null) {
            obj2 = PolarVoyageGraphFusionAlphaStorm2231.PolarVoyageStrictModeLegendEpic1532;
        }
        Object obj3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj3 == null) {
            obj3 = PolarVoyageGraphFusionAlphaStorm2231.PolarVoyageStrictModeLegendEpic1532;
        }
        return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj2, obj3) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageLooperThreadNeoPulse2163.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj == null) {
            obj = PolarVoyageGraphFusionAlphaStorm2231.PolarVoyageStrictModeLegendEpic1532;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj == null) {
            obj = PolarVoyageGraphFusionAlphaStorm2231.PolarVoyageStrictModeLegendEpic1532;
        }
        sb.append(obj);
        return sb.toString();
    }
}
