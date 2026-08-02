package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class eaw implements afd, ksm {
    private final /* synthetic */ krt a;
    private final /* synthetic */ int b;

    public eaw(krt krtVar, int i, byte[] bArr) {
        this.b = i;
        krtVar.getClass();
        this.a = krtVar;
    }

    @Override // defpackage.afd
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        krt krtVar = this.a;
        if (i != 0) {
            krtVar.a(obj);
        } else {
            krtVar.a(obj);
        }
    }

    @Override // defpackage.ksm
    public final kof b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this.b != 0) {
            if ((obj instanceof afd) && (obj instanceof ksm)) {
                return ksp.b(this.a, ((ksm) obj).b());
            }
            return false;
        }
        if ((obj instanceof afd) && (obj instanceof ksm)) {
            return ksp.b(this.a, ((ksm) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        krt krtVar = this.a;
        return i != 0 ? krtVar.hashCode() : krtVar.hashCode();
    }

    public eaw(krt krtVar, int i) {
        this.b = i;
        krtVar.getClass();
        this.a = krtVar;
    }
}
