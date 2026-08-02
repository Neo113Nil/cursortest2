package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axv implements krt {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ axv(int i, String str, int i2) {
        this.d = i2;
        this.c = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r5v5, types: [hac, java.lang.Object] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        amh a;
        int i = this.d;
        if (i == 0) {
            ana anaVar = (ana) obj;
            anaVar.getClass();
            a = anaVar.a((String) this.c);
            String str = this.b;
            try {
                a.g(1, this.a);
                a.i(2, str);
                a.l();
                a.close();
                return kow.a;
            } finally {
            }
        }
        if (i == 1) {
            ana anaVar2 = (ana) obj;
            anaVar2.getClass();
            a = anaVar2.a((String) this.c);
            int i2 = this.a;
            try {
                a.i(1, this.b);
                a.g(2, i2);
                return a.l() ? new axh(a.d(afg.d(a, "work_spec_id")), (int) a.b(afg.d(a, "generation")), (int) a.b(afg.d(a, "system_id"))) : null;
            } finally {
            }
        }
        if (i == 2) {
            ana anaVar3 = (ana) obj;
            anaVar3.getClass();
            a = anaVar3.a((String) this.c);
            int i3 = this.a;
            try {
                a.i(1, this.b);
                a.g(2, i3);
                a.l();
                a.close();
                return kow.a;
            } finally {
            }
        }
        if (i != 3) {
            if (((Boolean) obj).booleanValue()) {
                String str2 = this.b;
                int i4 = this.a;
                gka gkaVar = (gka) this.c;
                fea feaVar = (fea) ((ldt) gkaVar.b.b()).c.bB();
                ikj ikjVar = (ikj) gkaVar.d;
                feaVar.b(ikjVar.b, ikjVar.a, hnu.bt(i4), str2);
            }
            return null;
        }
        if (((Boolean) obj).booleanValue()) {
            int i5 = this.a;
            String str3 = this.b;
            gka gkaVar2 = (gka) this.c;
            ldt ldtVar = (ldt) gkaVar2.b.b();
            ikj ikjVar2 = (ikj) gkaVar2.d;
            ldtVar.g((String) ikjVar2.b, (String) ikjVar2.a, str3, hnu.bt(i5), "attempt");
        }
        return null;
    }

    public /* synthetic */ axv(gka gkaVar, int i, String str, int i2) {
        this.d = i2;
        this.c = gkaVar;
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ axv(gka gkaVar, String str, int i, int i2) {
        this.d = i2;
        this.c = gkaVar;
        this.b = str;
        this.a = i;
    }

    public /* synthetic */ axv(String str, int i, int i2) {
        this.d = i2;
        this.c = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.b = str;
        this.a = i;
    }

    public /* synthetic */ axv(String str, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.b = str;
        this.a = i;
    }
}
