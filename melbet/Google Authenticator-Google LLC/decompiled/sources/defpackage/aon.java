package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aon extends Property {
    public aon(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        aot aotVar = (aot) obj;
        PointF pointF = (PointF) obj2;
        aotVar.c = Math.round(pointF.x);
        aotVar.d = Math.round(pointF.y);
        int i = aotVar.f + 1;
        aotVar.f = i;
        if (aotVar.e == i) {
            aotVar.a();
        }
    }
}
