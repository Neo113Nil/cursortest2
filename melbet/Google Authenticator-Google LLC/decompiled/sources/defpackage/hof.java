package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hof extends hoe {
    public static final Map c;
    private final hlq d;

    static {
        EnumMap enumMap = new EnumMap(hlq.class);
        for (hlq hlqVar : hlq.values()) {
            hof[] hofVarArr = new hof[10];
            for (int i = 0; i < 10; i++) {
                hofVarArr[i] = new hof(i, hlqVar, hlr.a);
            }
            enumMap.put((EnumMap) hlqVar, (hlq) hofVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public hof(int i, hlq hlqVar, hlr hlrVar) {
        super(hlrVar, i);
        hlqVar.getClass();
        this.d = hlqVar;
        if (hlrVar.c()) {
            return;
        }
        int i2 = hlqVar.l;
        i2 = hlrVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        hlrVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.hoe
    public final void a(hoi hoiVar, Object obj) {
        hoiVar.d(obj, this.d, this.b);
    }
}
