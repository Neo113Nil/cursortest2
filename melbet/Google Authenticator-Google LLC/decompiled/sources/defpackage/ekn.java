package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekn extends ekl {
    private final String a;

    public ekn(Class cls) {
        this.a = cls.getName();
    }

    @Override // defpackage.ekl
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.ekl
    public final String b() {
        return this.a;
    }

    public ekn(String str) {
        this.a = str;
    }

    public ekn(eik eikVar) {
        this.a = eikVar.a;
    }

    public ekn(Enum r1) {
        this.a = r1.name();
    }
}
