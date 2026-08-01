package x8;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f10557a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f10558b;

    public f(j jVar, w7.g gVar) {
        this.f10557a = jVar;
        this.f10558b = gVar;
    }

    @Override // x8.i
    public final boolean a(y8.b bVar) {
        if (bVar.f10676b != 4 || this.f10557a.a(bVar)) {
            return false;
        }
        String str = bVar.f10677c;
        if (str == null) {
            r.j("Null token");
            return false;
        }
        long j = bVar.f10679e;
        long j3 = bVar.f10680f;
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            this.f10558b.a(new a(str, j, j3));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        r.s(sb2, "Missing required properties:");
        return false;
    }

    @Override // x8.i
    public final boolean b(Exception exc) {
        this.f10558b.b(exc);
        return true;
    }
}
