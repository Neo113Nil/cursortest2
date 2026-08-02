package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aom extends Property {
    public aom(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        aot aotVar = (aot) obj;
        PointF pointF = (PointF) obj2;
        aotVar.a = Math.round(pointF.x);
        aotVar.b = Math.round(pointF.y);
        int i = aotVar.e + 1;
        aotVar.e = i;
        if (i == aotVar.f) {
            aotVar.a();
        }
    }
}
