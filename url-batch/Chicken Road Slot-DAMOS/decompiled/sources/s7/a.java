package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8459e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8460i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f8461r;

    public /* synthetic */ a(z zVar, String str, long j, int i3) {
        this.f8458d = i3;
        this.f8459e = str;
        this.f8460i = j;
        this.f8461r = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8458d) {
            case 0:
                z zVar = this.f8461r;
                zVar.s();
                String str = this.f8459e;
                c7.c0.d(str);
                s.e eVar = zVar.f9136i;
                boolean isEmpty = eVar.isEmpty();
                long j = this.f8460i;
                if (isEmpty) {
                    zVar.f9137r = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num == null) {
                    if (eVar.f8369i < 100) {
                        eVar.put(str, 1);
                        zVar.f9135e.put(str, Long.valueOf(j));
                        break;
                    } else {
                        v0 v0Var = ((q1) zVar.f1478d).f8937t;
                        q1.l(v0Var);
                        v0Var.f9053w.a("Too many ads visible");
                        break;
                    }
                } else {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                z zVar2 = this.f8461r;
                zVar2.s();
                String str2 = this.f8459e;
                c7.c0.d(str2);
                s.e eVar2 = zVar2.f9136i;
                Integer num2 = (Integer) eVar2.get(str2);
                q1 q1Var = (q1) zVar2.f1478d;
                if (num2 == null) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    b3 b3Var = q1Var.f8943z;
                    v0 v0Var3 = q1Var.f8937t;
                    q1.k(b3Var);
                    y2 w6 = b3Var.w(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        eVar2.put(str2, Integer.valueOf(intValue));
                        break;
                    } else {
                        eVar2.remove(str2);
                        s.e eVar3 = zVar2.f9135e;
                        Long l10 = (Long) eVar3.get(str2);
                        long j3 = this.f8460i;
                        if (l10 == null) {
                            q1.l(v0Var3);
                            v0Var3.f9050t.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j3 - l10.longValue();
                            eVar3.remove(str2);
                            zVar2.x(str2, longValue, w6);
                        }
                        if (eVar2.isEmpty()) {
                            long j10 = zVar2.f9137r;
                            if (j10 != 0) {
                                zVar2.w(j3 - j10, w6);
                                zVar2.f9137r = 0L;
                                break;
                            } else {
                                q1.l(v0Var3);
                                v0Var3.f9050t.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
