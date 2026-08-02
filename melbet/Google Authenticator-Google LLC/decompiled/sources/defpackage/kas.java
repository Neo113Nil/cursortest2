package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kas implements kbm {
    private final /* synthetic */ int a;

    public kas(int i) {
        this.a = i;
    }

    @Override // defpackage.kbm
    public final /* synthetic */ int a(Object obj) {
        if (this.a == 0) {
            return ((kar) obj).d();
        }
        ((jzm) obj).d();
        return 5;
    }

    @Override // defpackage.kbm
    public final /* synthetic */ void b(Object obj) {
        if (this.a != 0) {
            ((jzm) obj).e();
        } else {
            ((kar) obj).f();
        }
    }
}
