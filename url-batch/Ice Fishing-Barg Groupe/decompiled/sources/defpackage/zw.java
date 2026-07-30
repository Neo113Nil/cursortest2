package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zw implements n02 {
    public final /* synthetic */ ax PxuCJdSBwIXG;

    public zw(ax axVar) {
        this.PxuCJdSBwIXG = axVar;
    }

    @Override // defpackage.n02
    public final float PxuCJdSBwIXG(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        ax axVar = this.PxuCJdSBwIXG;
        float floatValue = ((Number) axVar.PxuCJdSBwIXG.OPXfSBeufaJ8(Float.valueOf(f))).floatValue();
        axVar.e9gEMXR7LXtO.setValue(Boolean.valueOf(floatValue > 0.0f));
        axVar.a92UlCVFR9N8.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
