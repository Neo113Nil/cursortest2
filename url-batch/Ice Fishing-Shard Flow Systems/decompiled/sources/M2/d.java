package M2;

import n2.AbstractC0755f;
import n2.C0750a;
import r4.l;
import s4.n;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f1738e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f1739i;

    public /* synthetic */ d(a aVar, n nVar, l lVar, int i2) {
        this.f1737d = i2;
        this.f1738e = nVar;
        this.f1739i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1737d) {
            case 0:
                n nVar = this.f1738e;
                String str = nVar.f7767a;
                boolean contentEquals = str.contentEquals("OneSignal#requestPermission");
                l lVar = this.f1739i;
                if (!contentEquals) {
                    if (!str.contentEquals("OneSignal#setShared")) {
                        if (!str.contentEquals("OneSignal#isShared")) {
                            a.e(lVar);
                            break;
                        } else {
                            try {
                                a.f(Boolean.valueOf(AbstractC0755f.c().getLocation().isShared()), lVar);
                                break;
                            } catch (Throwable th) {
                                com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th);
                                a.f(Boolean.FALSE, lVar);
                                return;
                            }
                        }
                    } else {
                        try {
                            AbstractC0755f.c().getLocation().setShared(((Boolean) nVar.f7768b).booleanValue());
                        } catch (Throwable th2) {
                            com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th2);
                        }
                        a.f(null, lVar);
                        break;
                    }
                } else {
                    try {
                        AbstractC0755f.c().getLocation().requestPermission(new C0750a());
                    } catch (Throwable th3) {
                        com.onesignal.debug.internal.logging.b.error("OneSignal location module is not available. Add the location dependency to use OneSignal.Location.", th3);
                    }
                    a.f(null, lVar);
                    break;
                }
            default:
                n nVar2 = this.f1738e;
                String str2 = nVar2.f7767a;
                Object obj = nVar2.f7768b;
                boolean contentEquals2 = str2.contentEquals("OneSignal#addOutcome");
                l lVar2 = this.f1739i;
                if (!contentEquals2) {
                    if (!str2.contentEquals("OneSignal#addUniqueOutcome")) {
                        if (!str2.contentEquals("OneSignal#addOutcomeWithValue")) {
                            a.e(lVar2);
                            break;
                        } else {
                            String str3 = (String) nVar2.a("outcome_name");
                            Double d7 = (Double) nVar2.a("outcome_value");
                            if (str3 != null && !str3.isEmpty()) {
                                if (d7 != null) {
                                    AbstractC0755f.c().getSession().addOutcomeWithValue(str3, d7.floatValue());
                                    a.f(null, lVar2);
                                    break;
                                } else {
                                    a.d("sendOutcomeWithValue() value must not be null", lVar2);
                                    break;
                                }
                            } else {
                                a.d("sendOutcomeWithValue() name must not be null or empty", lVar2);
                                break;
                            }
                        }
                    } else {
                        String str4 = (String) obj;
                        if (str4 != null && !str4.isEmpty()) {
                            AbstractC0755f.c().getSession().addUniqueOutcome(str4);
                            a.f(null, lVar2);
                            break;
                        } else {
                            a.d("sendUniqueOutcome() name must not be null or empty", lVar2);
                            break;
                        }
                    }
                } else {
                    String str5 = (String) obj;
                    if (str5 != null && !str5.isEmpty()) {
                        AbstractC0755f.c().getSession().addOutcome(str5);
                        a.f(null, lVar2);
                        break;
                    } else {
                        a.d("addOutcome() name must not be null or empty", lVar2);
                        break;
                    }
                }
                break;
        }
    }
}
