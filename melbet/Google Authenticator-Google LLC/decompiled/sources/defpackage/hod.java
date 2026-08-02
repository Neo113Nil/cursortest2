package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hod extends hoe {
    private final hoc c;

    public hod(hlr hlrVar, int i, hoc hocVar) {
        super(hlrVar, i);
        this.c = hocVar;
        StringBuilder sb = new StringBuilder("%");
        hlrVar.f(sb);
        sb.append(true != hlrVar.d() ? 't' : 'T');
        sb.append(hocVar.G);
    }

    @Override // defpackage.hoe
    public final void a(hoi hoiVar, Object obj) {
        hoc hocVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            hoi.c(hoiVar.d, obj, "%t" + hocVar.G);
            return;
        }
        hlr hlrVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        hlrVar.f(sb);
        sb.append(true != hlrVar.d() ? 't' : 'T');
        sb.append(hocVar.G);
        hoiVar.d.append(String.format(hly.a, sb.toString(), obj));
    }
}
