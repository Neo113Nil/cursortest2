package k2;

import N3.j;
import u0.C0675e;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0675e f5185g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f5186h;

    public /* synthetic */ d(AbstractC0467a abstractC0467a, C0675e c0675e, j jVar, int i7) {
        this.f5184f = i7;
        this.f5185g = c0675e;
        this.f5186h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5184f) {
            case 0:
                C0675e c0675e = this.f5185g;
                String str = (String) c0675e.f5975b;
                boolean contentEquals = str.contentEquals("OneSignal#requestPermission");
                j jVar = this.f5186h;
                if (!contentEquals) {
                    if (!str.contentEquals("OneSignal#setShared")) {
                        if (!str.contentEquals("OneSignal#isShared")) {
                            AbstractC0467a.e(jVar);
                            break;
                        } else {
                            try {
                                AbstractC0467a.f(jVar, Boolean.valueOf(L1.f.c().getLocation().isShared()));
                                break;
                            } catch (Throwable th) {
                                com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th);
                                AbstractC0467a.f(jVar, Boolean.FALSE);
                                return;
                            }
                        }
                    } else {
                        try {
                            L1.f.c().getLocation().setShared(((Boolean) c0675e.f5976c).booleanValue());
                        } catch (Throwable th2) {
                            com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th2);
                        }
                        AbstractC0467a.f(jVar, null);
                        break;
                    }
                } else {
                    try {
                        L1.f.c().getLocation().requestPermission(new L1.a());
                    } catch (Throwable th3) {
                        com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th3);
                    }
                    AbstractC0467a.f(jVar, null);
                    break;
                }
            default:
                C0675e c0675e2 = this.f5185g;
                String str2 = (String) c0675e2.f5975b;
                Object obj = c0675e2.f5976c;
                boolean contentEquals2 = str2.contentEquals("OneSignal#addOutcome");
                j jVar2 = this.f5186h;
                if (!contentEquals2) {
                    if (!str2.contentEquals("OneSignal#addUniqueOutcome")) {
                        if (!str2.contentEquals("OneSignal#addOutcomeWithValue")) {
                            AbstractC0467a.e(jVar2);
                            break;
                        } else {
                            String str3 = (String) c0675e2.c("outcome_name");
                            Double d7 = (Double) c0675e2.c("outcome_value");
                            if (str3 != null && !str3.isEmpty()) {
                                if (d7 != null) {
                                    L1.f.c().getSession().addOutcomeWithValue(str3, d7.floatValue());
                                    AbstractC0467a.f(jVar2, null);
                                    break;
                                } else {
                                    AbstractC0467a.d(jVar2, "sendOutcomeWithValue() value must not be null");
                                    break;
                                }
                            } else {
                                AbstractC0467a.d(jVar2, "sendOutcomeWithValue() name must not be null or empty");
                                break;
                            }
                        }
                    } else {
                        String str4 = (String) obj;
                        if (str4 != null && !str4.isEmpty()) {
                            L1.f.c().getSession().addUniqueOutcome(str4);
                            AbstractC0467a.f(jVar2, null);
                            break;
                        } else {
                            AbstractC0467a.d(jVar2, "sendUniqueOutcome() name must not be null or empty");
                            break;
                        }
                    }
                } else {
                    String str5 = (String) obj;
                    if (str5 != null && !str5.isEmpty()) {
                        L1.f.c().getSession().addOutcome(str5);
                        AbstractC0467a.f(jVar2, null);
                        break;
                    } else {
                        AbstractC0467a.d(jVar2, "addOutcome() name must not be null or empty");
                        break;
                    }
                }
                break;
        }
    }
}
