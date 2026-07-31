package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.C1622d0;
import com.my.tracker.obfuscated.C1646j;
import com.my.tracker.obfuscated.C1672p1;
import com.my.tracker.obfuscated.C1712z2;
import com.my.tracker.obfuscated.InterfaceC1609a2;
import com.my.tracker.obfuscated.InterfaceC1707y1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* renamed from: com.my.tracker.obfuscated.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1640h1 extends AbstractC1679r1 {
    protected C1640h1() {
    }

    private static int a(int i4) {
        switch (i4) {
            case 1:
                return 12;
            case 2:
                return 13;
            case 3:
                return 11;
            case 4:
            case 11:
            case 12:
            case 16:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            default:
                return -1;
            case 5:
                return 17;
            case 6:
                return 22;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 10:
                return 23;
            case 13:
                return 21;
            case 14:
                return 14;
            case 15:
                return 16;
            case 17:
                return 25;
            case 18:
                return 26;
            case 19:
                return 27;
            case 20:
                return 28;
            case 21:
                return 29;
            case 22:
                return 30;
            case ConnectionResult.API_DISABLED /* 23 */:
                return 31;
            case 24:
                return 32;
            case 25:
                return 33;
            case 26:
                return 34;
            case 27:
                return 35;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return 36;
            case 29:
                return 37;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return 39;
            case 32:
                return 40;
            case 33:
                return 41;
        }
    }

    public static C1640h1 b() {
        return new C1640h1();
    }

    public synchronized byte[] c(long j4) {
        try {
            this.f21515a.a();
            this.f21515a.a(2, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 29", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(AdEvent adEvent, String str) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, adEvent.network);
            if (adEvent.eventType == 19) {
                this.f21515a.a(2, str);
                this.f21515a.a(3, adEvent.currency);
            }
            this.f21515a.a(4, adEvent.source);
            this.f21515a.a(5, adEvent.placementId);
            this.f21515a.a(6, adEvent.adId);
            this.f21515a.a(7, adEvent.adFormat);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: " + adEvent.eventType, th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] b(String str, String str2, long j4, long j5) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f21515a.a(2, str2);
            }
            this.f21515a.a(3, j5);
            this.f21515a.a(4, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, String str2, long j4, long j5) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f21515a.a(2, str2);
            }
            this.f21515a.a(3, j5);
            this.f21515a.a(4, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] b(Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] b(long j4, long j5, long j6) {
        try {
            this.f21515a.a();
            this.f21515a.a(2, j4);
            this.f21515a.a(3, j5);
            this.f21515a.a(4, j6);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 26", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, int i4, String str5, String str6, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21515a.a(2, str2);
            this.f21515a.a(3, str);
            this.f21515a.a(4, str3);
            if (str != null) {
                this.f21515a.a(5, str5);
                this.f21515a.a(6, str6);
            }
            this.f21515a.a(7, str4);
            this.f21515a.a(8, i4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 32", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] b(long j4) {
        try {
            this.f21515a.a();
            this.f21515a.a(2, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 28", th);
            return null;
        }
        return this.f21515a.c();
    }

    private byte[] a(int i4, String str, String str2, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21515a.a(2, str);
            this.f21515a.a(3, str2);
            return this.f21515a.c();
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: " + i4, th);
            return null;
        }
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f21515a.a(2, str2);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21515a.a(2, str);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 6", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] b(String str, String str2, Map map) {
        return a(8, str, str2, map);
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f21515a.a(2, str2);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21516b.a();
            this.f21516b.a(1, str2);
            this.f21516b.a(2, str);
            this.f21516b.a(3, str3);
            if (this.f21516b.b() > 0) {
                this.f21515a.a(2, this.f21516b);
            }
            if (str3 != null) {
                this.f21515a.a(4, str4);
                this.f21515a.a(5, str5);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 10", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(long j4, long j5, long j6) {
        try {
            this.f21515a.a();
            this.f21515a.a(2, j4);
            this.f21515a.a(3, j5);
            this.f21515a.a(4, j6);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 27", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(long j4, String str, C1672p1.a aVar) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, j4);
            this.f21516b.a();
            if (!TextUtils.isEmpty(str)) {
                this.f21516b.a(1, str);
            }
            if (aVar != null) {
                this.f21516b.a(2, aVar.f21490a);
            }
            if (aVar != null) {
                this.f21516b.a(3, aVar.f21491b);
            }
            if (aVar != null) {
                this.f21516b.a(4, aVar.f21492c);
            }
            if (this.f21516b.b() > 0) {
                this.f21515a.a(2, this.f21516b);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 9", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(int i4, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21515a.a(2, i4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(long j4) {
        try {
            this.f21515a.a();
            this.f21515a.a(2, j4);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 25", th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, String str2, Map map) {
        return a(7, str, str2, map);
    }

    public synchronized byte[] a(int i4, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, map, this.f21516b);
            this.f21515a.a(2, str2);
            this.f21515a.a(3, str4);
            this.f21515a.a(4, str5);
            this.f21515a.a(5, str);
            this.f21515a.a(6, str3);
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: " + i4, th);
            return null;
        }
        return this.f21515a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f21515a.a();
            this.f21515a.a(1, str3);
            this.f21515a.a(2, str4);
            this.f21515a.a(3, str);
            this.f21515a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.f21516b.a();
                this.f21516b.a(1, str5);
                if (this.f21516b.b() > 0) {
                    this.f21515a.a(5, this.f21516b);
                }
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.f21515a.c();
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1646j c1646j, r rVar) {
        if (c1646j.f21377a.isEmpty()) {
            return;
        }
        for (C1646j.a aVar : c1646j.f21377a) {
            rVar.a();
            rVar.a(1, aVar.f21378a);
            rVar.a(2, aVar.f21379b);
            abstractC1683s1.a(31, rVar);
        }
    }

    private static int a(r rVar, int i4, int i5) {
        if (i5 != Integer.MAX_VALUE) {
            return rVar.a(i4, i5);
        }
        return 0;
    }

    private static int a(r rVar, int i4, long j4) {
        if (j4 != Long.MAX_VALUE) {
            return rVar.a(i4, j4);
        }
        return 0;
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.c cVar, r rVar) {
        rVar.a();
        a(rVar, 1, cVar.f21181a);
        a(rVar, 2, cVar.f21182b);
        a(rVar, 3, cVar.f21183c);
        a(rVar, 4, cVar.f21184d);
        a(rVar, 5, cVar.f21185e);
        a(rVar, 6, cVar.f21186f);
        a(rVar, 7, cVar.f21187g);
        a(rVar, 8, cVar.f21188h);
        a(rVar, 9, cVar.f21189i);
        a(rVar, 10, cVar.f21190j);
        a(rVar, 11, cVar.f21191k);
        a(rVar, 12, cVar.f21192l);
        abstractC1683s1.a(32, rVar);
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, List list, r rVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1622d0.b bVar = (C1622d0.b) it.next();
            if (bVar instanceof C1622d0.c) {
                a(abstractC1683s1, (C1622d0.c) bVar, rVar);
            } else if (bVar instanceof C1622d0.d) {
                a(abstractC1683s1, (C1622d0.d) bVar, rVar);
            } else if (bVar instanceof C1622d0.e) {
                a(abstractC1683s1, (C1622d0.e) bVar, rVar);
            } else if (bVar instanceof C1622d0.i) {
                a(abstractC1683s1, (C1622d0.i) bVar, rVar);
            } else if (bVar instanceof C1622d0.g) {
                a(abstractC1683s1, (C1622d0.g) bVar, rVar);
            } else if (bVar instanceof C1622d0.f) {
                a(abstractC1683s1, (C1622d0.f) bVar, rVar);
            } else if (bVar instanceof C1622d0.h) {
                a(abstractC1683s1, (C1622d0.h) bVar, rVar);
            } else {
                AbstractC1708y2.a("Unknown cell-info");
            }
        }
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.d dVar, r rVar) {
        rVar.a();
        rVar.a(1, dVar.f21193a);
        rVar.a(2, dVar.f21194b);
        a(rVar, 3, dVar.f21195c);
        a(rVar, 4, dVar.f21196d);
        a(rVar, 5, dVar.f21197e);
        a(rVar, 6, dVar.f21198f);
        a(rVar, 7, dVar.f21199g);
        a(rVar, 8, dVar.f21200h);
        a(rVar, 9, dVar.f21201i);
        a(rVar, 10, dVar.f21202j);
        abstractC1683s1.a(33, rVar);
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.e eVar, r rVar) {
        rVar.a();
        rVar.a(1, eVar.f21203a);
        rVar.a(2, eVar.f21204b);
        a(rVar, 3, eVar.f21205c);
        a(rVar, 4, eVar.f21206d);
        a(rVar, 5, eVar.f21207e);
        a(rVar, 6, eVar.f21208f);
        a(rVar, 7, eVar.f21209g);
        a(rVar, 8, eVar.f21210h);
        a(rVar, 9, eVar.f21211i);
        a(rVar, 10, eVar.f21212j);
        abstractC1683s1.a(34, rVar);
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.f fVar, r rVar) {
        rVar.a();
        rVar.a(1, fVar.f21213a);
        rVar.a(2, fVar.f21214b);
        a(rVar, 3, fVar.f21215c);
        a(rVar, 4, fVar.f21216d);
        a(rVar, 5, fVar.f21217e);
        a(rVar, 6, fVar.f21218f);
        a(rVar, 7, fVar.f21219g);
        a(rVar, 8, fVar.f21220h);
        a(rVar, 9, fVar.f21221i);
        abstractC1683s1.a(37, rVar);
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.g gVar, r rVar) {
        rVar.a();
        rVar.a(1, gVar.f21222a);
        rVar.a(2, gVar.f21223b);
        a(rVar, 3, gVar.f21224c);
        a(rVar, 4, gVar.f21225d);
        a(rVar, 5, gVar.f21226e);
        a(rVar, 6, gVar.f21227f);
        a(rVar, 7, gVar.f21228g);
        a(rVar, 8, gVar.f21229h);
        a(rVar, 9, gVar.f21230i);
        abstractC1683s1.a(36, rVar);
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.h hVar, r rVar) {
        rVar.a();
        rVar.a(1, hVar.f21231a);
        rVar.a(2, hVar.f21232b);
        a(rVar, 3, hVar.f21233c);
        a(rVar, 4, hVar.f21234d);
        abstractC1683s1.a(33, rVar);
    }

    private static void a(AbstractC1683s1 abstractC1683s1, C1622d0.i iVar, r rVar) {
        rVar.a();
        rVar.a(1, iVar.f21235a);
        rVar.a(2, iVar.f21236b);
        a(rVar, 3, iVar.f21237c);
        a(rVar, 4, iVar.f21238d);
        a(rVar, 5, iVar.f21239e);
        a(rVar, 6, iVar.f21240f);
        a(rVar, 7, iVar.f21241g);
        a(rVar, 8, iVar.f21242h);
        a(rVar, 9, iVar.f21243i);
        abstractC1683s1.a(35, rVar);
    }

    protected static int a(AbstractC1683s1 abstractC1683s1, InterfaceC1707y1 interfaceC1707y1, r rVar) {
        int i4;
        StringBuilder sb;
        int i5 = 0;
        try {
            InterfaceC1707y1.a a4 = interfaceC1707y1.a();
            i4 = 0;
            while (a4.b()) {
                try {
                    try {
                        int g4 = (int) a4.g();
                        try {
                            rVar.a();
                            InterfaceC1707y1.b d4 = a4.d();
                            while (d4.b()) {
                                try {
                                    rVar.a(2, (int) d4.e());
                                } catch (Throwable th) {
                                    if (d4 != null) {
                                        try {
                                            d4.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            d4.close();
                        } catch (Throwable th3) {
                            AbstractC1708y2.b("Error: failed to pack event " + g4, th3);
                        }
                        if (rVar.b() == 0) {
                            sb = new StringBuilder();
                            sb.append("Error: no timestamps for event ");
                            sb.append(g4);
                            sb.append(", event ignored");
                        } else {
                            rVar.a(1, g4);
                            long c4 = a4.c();
                            if (c4 > 0) {
                                rVar.a(3, (int) c4);
                            }
                            byte[] l4 = a4.l();
                            if (l4.length > 0) {
                                int a5 = a(g4);
                                if (a5 == -1) {
                                    sb = new StringBuilder();
                                    sb.append("Error: unrecognized eventType ");
                                    sb.append(g4);
                                    sb.append(", event ignored");
                                } else {
                                    rVar.a(a5, l4);
                                }
                            }
                            i4 += abstractC1683s1.a(41, rVar);
                            i5++;
                        }
                        AbstractC1708y2.b(sb.toString());
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AbstractC1708y2.b("Error: failed to get stored events", th);
                    AbstractC1708y2.a("Written: events=" + i5 + ", bytes=" + i4);
                    return i4;
                }
            }
            a4.close();
        } catch (Throwable th5) {
            th = th5;
            i4 = 0;
        }
        AbstractC1708y2.a("Written: events=" + i5 + ", bytes=" + i4);
        return i4;
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, MyTrackerParams.a aVar, r rVar) {
        rVar.a();
        rVar.a(1, aVar.f20856a);
        rVar.a(2, aVar.f20858c);
        rVar.a(3, aVar.f20857b);
        if (rVar.b() > 0) {
            abstractC1683s1.a(24, rVar);
        }
    }

    public synchronized int a(AbstractC1683s1 abstractC1683s1, C1712z2.a aVar, C1615b3 c1615b3, String str, C1635g0 c1635g0, long j4, long j5, InterfaceC1707y1 interfaceC1707y1, InterfaceC1609a2 interfaceC1609a2) {
        String str2;
        String str3;
        try {
            if (a(abstractC1683s1, interfaceC1707y1, this.f21515a) + a(abstractC1683s1, interfaceC1609a2, this.f21515a, this.f21516b) == 0) {
                AbstractC1708y2.a("No events to send");
                return 3;
            }
            abstractC1683s1.a(1, MyTracker.VERSION);
            abstractC1683s1.a(2, aVar.f21613a);
            if (j4 != -1) {
                abstractC1683s1.a(3, j4);
            }
            if (j5 > 0) {
                abstractC1683s1.a(5, (int) j5);
            }
            Map map = aVar.f21623k.f20860e;
            abstractC1683s1.a(43, map, this.f21516b);
            if (map.isEmpty()) {
                str2 = null;
                str3 = null;
            } else {
                str2 = (String) map.get("android_id");
                str3 = (String) map.get("mac");
            }
            AbstractC1679r1.a(abstractC1683s1, c1635g0.f21321a, c1635g0.f21323c, this.f21515a, this.f21516b);
            AbstractC1679r1.a(abstractC1683s1, c1615b3, this.f21515a);
            AbstractC1679r1.a(abstractC1683s1, str2, str3, c1635g0, this.f21515a, this.f21516b);
            a(abstractC1683s1, aVar.f21623k, this.f21515a);
            AbstractC1679r1.a(abstractC1683s1, c1635g0.f21326f, c1635g0.f21322b, c1635g0.f21323c, this.f21515a);
            a(abstractC1683s1, aVar, this.f21515a);
            AbstractC1679r1.a(abstractC1683s1, c1635g0.f21327g, this.f21515a);
            a(abstractC1683s1, c1635g0.f21328h, this.f21515a);
            a(abstractC1683s1, c1635g0.f21329i.f21176a, this.f21515a);
            a(abstractC1683s1, c1635g0.f21329i.f21177b, this.f21515a);
            if (!TextUtils.isEmpty(str)) {
                abstractC1683s1.a(44, str.length() > 255 ? str.substring(0, KotlinVersion.MAX_COMPONENT_VALUE) : str);
            }
            a();
            return 1;
        } catch (Exception e4) {
            AbstractC1708y2.a("Create packet error: " + e4, e4);
            a();
            return 2;
        }
    }

    public synchronized boolean a(AbstractC1683s1 abstractC1683s1, long j4) {
        if (j4 > 0) {
            try {
                abstractC1683s1.a(4, j4);
            } catch (Exception e4) {
                AbstractC1708y2.a("Write timestamp send error: " + e4, e4);
                return false;
            }
        }
        return true;
    }

    protected static int a(AbstractC1683s1 abstractC1683s1, InterfaceC1609a2 interfaceC1609a2, r rVar, r rVar2) {
        int i4;
        int i5 = 0;
        try {
            InterfaceC1609a2.a a4 = interfaceC1609a2.a();
            i4 = 0;
            while (a4.b()) {
                try {
                    try {
                        String k4 = a4.k();
                        rVar.a();
                        try {
                            InterfaceC1609a2.b d4 = a4.d();
                            while (d4.b()) {
                                try {
                                    rVar2.a();
                                    rVar2.a(1, (int) d4.h());
                                    if (!d4.f()) {
                                        rVar2.a(2, (int) d4.j());
                                    }
                                    rVar.a(1, rVar2);
                                } catch (Throwable th) {
                                    if (d4 != null) {
                                        try {
                                            d4.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            d4.close();
                        } catch (Throwable th3) {
                            AbstractC1708y2.b("Error: failed to read session " + k4 + ": ", th3);
                        }
                        if (rVar.b() == 0) {
                            AbstractC1708y2.a("No periods for session " + k4 + ", id=" + a4.a() + ", session ignored");
                        } else {
                            int c4 = (int) a4.c();
                            if (c4 > 0) {
                                rVar.a(2, c4);
                            }
                            i5 += abstractC1683s1.a(42, rVar);
                            i4++;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        AbstractC1708y2.b("Error: failed to get stored sessions", th);
                        AbstractC1708y2.a("Written: sessions=" + i4 + ", bytes=" + i5);
                        return i5;
                    }
                } finally {
                }
            }
            a4.close();
        } catch (Throwable th5) {
            th = th5;
            i4 = 0;
        }
        AbstractC1708y2.a("Written: sessions=" + i4 + ", bytes=" + i5);
        return i5;
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1712z2.a aVar, r rVar) {
        rVar.a();
        int i4 = aVar.f21614b;
        if (i4 >= 0) {
            rVar.a(1, i4);
        }
        if (aVar.f21617e == 0) {
            rVar.a(2, 0);
        }
        if (!aVar.f21619g) {
            rVar.a(3, 0);
        }
        if (!aVar.f21618f) {
            rVar.a(4, 0);
        }
        int i5 = aVar.f21615c;
        if (i5 != 900) {
            rVar.a(5, i5);
        }
        int i6 = aVar.f21616d;
        if (i6 != 0) {
            rVar.a(6, i6);
        }
        if (!aVar.f21620h) {
            rVar.a(7, 0);
        }
        if (!aVar.f21621i) {
            rVar.a(8, 0);
        }
        if (!aVar.f21622j) {
            rVar.a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.f21624l;
        if (!antiFraudConfig.useLightSensor) {
            rVar.a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            rVar.a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            rVar.a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            rVar.a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            rVar.a(15, 0);
        }
        if (rVar.b() > 0) {
            abstractC1683s1.a(27, rVar);
        }
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1622d0.k kVar, r rVar) {
        if (kVar.f21249a != null) {
            rVar.a();
            rVar.a(1, kVar.f21249a.f21245b);
            rVar.a(2, kVar.f21249a.f21244a);
            rVar.a(3, kVar.f21249a.f21246c);
            rVar.a(5, kVar.f21249a.f21247d);
            rVar.a(6, kVar.f21249a.f21248e);
            abstractC1683s1.a(28, rVar);
        }
        for (C1622d0.a aVar : kVar.f21250b) {
            rVar.a();
            rVar.a(1, aVar.f21179b);
            rVar.a(2, aVar.f21178a);
            rVar.a(3, aVar.f21180c);
            abstractC1683s1.a(29, rVar);
        }
    }
}
