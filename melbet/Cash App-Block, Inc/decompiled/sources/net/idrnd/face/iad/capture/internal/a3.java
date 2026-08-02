package net.idrnd.face.iad.capture.internal;

import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class a3 {
    public static final Size f = new Size(1080, 1920);
    public final Size a;
    public final u3 b;
    public final y2 d;
    public final l3 e;

    public a3(Size size, y2 y2Var) {
        l3 l3Var;
        u3 u3Var = u3.a;
        size.getClass();
        if (size.getWidth() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Photo resolution wight should be above 0.");
            throw null;
        }
        if (size.getHeight() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Photo resolution height should be above 0.");
            throw null;
        }
        if (y2Var == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Face IAD must use some payload size.");
            throw null;
        }
        int ordinal = y2Var.ordinal();
        if (ordinal == 0) {
            x2 x2Var = x2.a;
            l3Var = new l3(CollectionsKt__CollectionsJVMKt.listOf(new q0(x2Var, 100)), new q0(x2Var, 100), null);
        } else if (ordinal == 1) {
            x2 x2Var2 = x2.a;
            l3Var = new l3(CollectionsKt__CollectionsJVMKt.listOf(new q0(x2Var2, 70)), new q0(x2Var2, 70), new v(u.a, 224, 224, 100));
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            x2 x2Var3 = x2.b;
            l3Var = new l3(CollectionsKt__CollectionsJVMKt.listOf(new q0(x2Var3, null)), new q0(x2Var3, null), null);
        }
        this.e = l3Var;
        this.b = u3Var;
        this.a = size;
        this.d = y2Var;
    }

    public final String toString() {
        return Reflection.factory.getOrCreateKotlinClass(a3.class).getSimpleName() + "(photoResolution=" + this.a + ", productType=" + this.b + ", payloadSize=" + this.d + ", imageEvaluatorType=null)";
    }
}
