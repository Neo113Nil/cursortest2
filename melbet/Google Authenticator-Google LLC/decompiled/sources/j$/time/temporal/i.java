package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class i implements n {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient q b;
    public final transient long c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = q.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean f(k kVar) {
        return kVar.c(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.n
    public final q g(k kVar) {
        if (kVar.c(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.i.d("Unsupported field: ".concat(String.valueOf(this)));
        return null;
    }

    @Override // j$.time.temporal.n
    public final long h(k kVar) {
        return kVar.o(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final Temporal j(Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(j$.nio.file.attribute.a.F(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.n
    public final q range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
