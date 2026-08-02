package defpackage;

import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcf implements gce {
    private final /* synthetic */ int a;
    private final Object b;

    public gcf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gce
    public final hvi a(String str) {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((azh) obj).a() : hnu.bI(((asw) ((atd) obj).a(str)).c);
    }

    @Override // defpackage.gce
    public final hvi b(UUID uuid) {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((azh) obj).b() : hnu.bI(((asw) ((atd) obj).b(uuid)).c);
    }

    @Override // defpackage.gce
    public final hvi c(String str, int i, List list) {
        int i2 = this.a;
        Object obj = this.b;
        return i2 != 0 ? ((azh) obj).e() : hnu.bI(((asw) ((atd) obj).e(str, i, list)).c);
    }

    @Override // defpackage.gce
    public final hvi d(bvw bvwVar) {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((azh) obj).c() : hnu.bI(((asw) ((atd) obj).f(bvwVar)).c);
    }

    @Override // defpackage.gce
    public final hvi e(String str, int i, bvw bvwVar) {
        int i2 = this.a;
        Object obj = this.b;
        return i2 != 0 ? ((azh) obj).d() : hnu.bI(((asw) ((atd) obj).g(str, i, bvwVar)).c);
    }

    @Override // defpackage.gce
    public final /* synthetic */ hvi f(String str, int i, bvw bvwVar) {
        return this.a != 0 ? hnu.bO(this, str, i, bvwVar) : hnu.bO(this, str, i, bvwVar);
    }

    @Override // defpackage.gce
    public final hvi g(brn brnVar) {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((azh) obj).f() : ((atd) obj).h(brnVar);
    }
}
