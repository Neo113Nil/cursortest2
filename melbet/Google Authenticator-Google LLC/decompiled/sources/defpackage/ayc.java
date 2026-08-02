package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayc implements krt {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ ayc(long j, String str, int i) {
        this.d = i;
        this.a = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.krt
    public final Object a(Object obj) {
        amh a;
        if (this.d == 0) {
            ana anaVar = (ana) obj;
            anaVar.getClass();
            a = anaVar.a(this.a);
            String str = this.c;
            try {
                a.g(1, this.b);
                a.i(2, str);
                a.l();
                a.close();
                return kow.a;
            } finally {
            }
        }
        ana anaVar2 = (ana) obj;
        anaVar2.getClass();
        a = anaVar2.a(this.a);
        String str2 = this.c;
        try {
            a.g(1, this.b);
            a.i(2, str2);
            a.l();
            int e = afg.e(anaVar2);
            a.close();
            return Integer.valueOf(e);
        } finally {
        }
    }

    public /* synthetic */ ayc(long j, String str, int i, byte[] bArr) {
        this.d = i;
        this.a = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        this.b = j;
        this.c = str;
    }
}
