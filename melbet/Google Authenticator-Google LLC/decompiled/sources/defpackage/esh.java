package defpackage;

import android.util.Log;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class esh implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ esh(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 1:
                return false;
            case 2:
                return hnu.av((String) obj);
            case 3:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 4:
                evh evhVar = evi.a;
                return "";
            case 5:
                etq etqVar = (etq) obj;
                if (etqVar.a != 29514) {
                    throw etqVar;
                }
                jkj k = euh.a.k();
                jkj k2 = eud.b.k();
                long currentTimeMillis = System.currentTimeMillis();
                if (!k2.b.M()) {
                    k2.t();
                }
                eud eudVar = (eud) k2.b;
                eudVar.c |= 8;
                eudVar.g = currentTimeMillis;
                if (!k.b.M()) {
                    k.t();
                }
                euh euhVar = (euh) k.b;
                eud eudVar2 = (eud) k2.q();
                eudVar2.getClass();
                euhVar.c = eudVar2;
                euhVar.b |= 1;
                return (euh) k.q();
            case 6:
                throw new fsw();
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    return fue.a();
                }
                throw new fsw();
            case 8:
                fue fueVar = (fue) obj;
                return fueVar == null ? fue.a() : fueVar;
            case 9:
                fuf fufVar = (fuf) obj;
                int i = fufVar.c;
                hkh hkhVar = fuj.b;
                hoq.C(i == 2, "Account must be in ENABLED state, but was %s.", i != 1 ? i != 2 ? "DISABLED" : "ENABLED" : "UNSPECIFIED");
                return fufVar;
            case 10:
                jkj C = ((fuz) obj).C();
                if (C.a.M()) {
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                C.b = C.p();
                long epochMilli = Instant.now().toEpochMilli();
                if (!C.b.M()) {
                    C.t();
                }
                fuz fuzVar = (fuz) C.b;
                fuzVar.b |= 2;
                fuzVar.d = epochMilli;
                return (fuz) C.q();
            case 11:
                return gzp.h((List) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fuz fuzVar2 = (fuz) obj;
                return (fuzVar2.b & 1) != 0 ? gzp.h(Long.valueOf(fuzVar2.c)) : gyf.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                throw new fvb((IllegalArgumentException) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return null;
            case 15:
                String str = (String) obj;
                ((hkf) fvw.a.f().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$<anonymous>$<anonymous>$<anonymous>", 403, "GmsAccounts.kt")).s("Found case where getToken fixed the getAccountId failure");
                return str;
            case 16:
                return DesugarCollections.unmodifiableMap(((fxd) obj).d).keySet();
            case 17:
                int i2 = hel.d;
                heg hegVar = new heg(4);
                for (fxf fxfVar : DesugarCollections.unmodifiableMap(((fxd) obj).d).values()) {
                    int x = a.x(fxfVar.e);
                    if (x == 0) {
                        x = 1;
                    }
                    if (x == 2) {
                        hegVar.h(iyi.j(fxfVar));
                    }
                }
                return hegVar.g();
            case 18:
                int i3 = hel.d;
                heg hegVar2 = new heg(4);
                Iterator it = DesugarCollections.unmodifiableMap(((fxd) obj).d).values().iterator();
                while (it.hasNext()) {
                    hegVar2.h(iyi.j((fxf) it.next()));
                }
                return hegVar2.g();
            case 19:
                return null;
            default:
                return ((File) obj).getAbsolutePath();
        }
    }
}
