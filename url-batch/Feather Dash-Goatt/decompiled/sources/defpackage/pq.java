package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pq implements f71 {
    public final /* synthetic */ jb a;

    public pq(jb jbVar) {
        this.a = jbVar;
    }

    @Override // defpackage.f71
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        jb jbVar = this.a;
        float floatValue = ((Number) ((Function1) jbVar.a).invoke(Float.valueOf(f))).floatValue();
        ((av0) jbVar.e).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((av0) jbVar.f).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
