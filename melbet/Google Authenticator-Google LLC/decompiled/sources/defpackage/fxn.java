package defpackage;

import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fxn implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ fxn(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                hkh hkhVar = fxo.a;
                return true;
            case 1:
                ((hkf) ((hkf) ((hkf) fxo.a.f()).h((Throwable) obj)).i("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 90, "WipeoutAccountsSynclet.java")).s("Wipeout accounts task failed.");
                return null;
            case 2:
                ArrayList arrayList = new ArrayList();
                for (fuf fufVar : (List) obj) {
                    if (fufVar.c != 3) {
                        ful fulVar = fufVar.b;
                        if (!Objects.equals(fulVar.k, "pseudonymous") && !Objects.equals(fulVar.k, "incognito")) {
                            arrayList.add(fufVar);
                        }
                    }
                }
                if (arrayList.size() == 1) {
                    return ((fuf) arrayList.get(0)).a;
                }
                return null;
            case 3:
                return null;
            case 4:
                return new ProtoParsers$InternalDontUse(null, (jll) obj);
            case 5:
                return null;
            case 6:
                int i = hel.d;
                heg hegVar = new heg(4);
                for (atc atcVar : (List) obj) {
                    if (!atcVar.c.contains("tiktok_account_work")) {
                        hegVar.h(atcVar);
                    }
                }
                return hegVar.g();
            case 7:
                return gge.a;
            case 8:
                hen henVar = new hen(4);
                for (AbstractMap.SimpleEntry simpleEntry : (List) obj) {
                    if (simpleEntry.getValue() != gge.a) {
                        henVar.e(simpleEntry);
                    }
                }
                return henVar.d(true);
            case 9:
                return new ggw(true);
            case 11:
                iwq iwqVar = gjw.m;
            case 10:
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                HashSet hashSet = new HashSet();
                for (fuf fufVar2 : (List) obj) {
                    if (!fufVar2.b.k.equals("incognito")) {
                        hashSet.add(fufVar2.a);
                    }
                }
                return hashSet;
            case 16:
            case 15:
                return null;
            case 17:
                return new aso();
            case 18:
                return new asn();
            case 19:
                return new aso();
            default:
                return new asn();
        }
    }
}
