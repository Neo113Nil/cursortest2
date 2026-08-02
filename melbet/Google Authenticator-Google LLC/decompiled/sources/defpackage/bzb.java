package defpackage;

import com.google.android.apps.authenticator2.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzb implements gbj {
    final /* synthetic */ bze a;

    public bzb(bze bzeVar) {
        this.a = bzeVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof bzh) {
            bze bzeVar = this.a;
            bzeVar.b(bzeVar.c.bs().getString(R.string.update_app));
            ((hkf) ((hkf) ((hkf) bze.a.g()).h(th)).i("com/google/android/apps/authenticator2/migration/imports/ImportFragmentPeer$QrCodeScannedCallback", "onFailure", (char) 228, "ImportFragmentPeer.java")).s("Old version detected during scanning a QR code of migration flow");
            return;
        }
        boolean z = th instanceof bzi;
        bze bzeVar2 = this.a;
        if (z) {
            bzeVar2.b(bzeVar2.c.bs().getString(R.string.something_went_wrong));
            ((hkf) ((hkf) ((hkf) bze.a.g()).h(th)).i("com/google/android/apps/authenticator2/migration/imports/ImportFragmentPeer$QrCodeScannedCallback", "onFailure", (char) 232, "ImportFragmentPeer.java")).s("Couldn't parse a qr code during import flow.");
        } else {
            bzeVar2.b(bzeVar2.c.bs().getString(R.string.something_went_wrong));
            ((hkf) ((hkf) ((hkf) bze.a.g()).h(th)).i("com/google/android/apps/authenticator2/migration/imports/ImportFragmentPeer$QrCodeScannedCallback", "onFailure", (char) 235, "ImportFragmentPeer.java")).s("Couldn't scan a qr code during import flow.");
        }
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void b(Object obj, Object obj2) {
        bze bzeVar = this.a;
        bmu bmuVar = (bmu) ((ProtoParsers$InternalDontUse) obj2).a(bmu.a, bzeVar.g);
        int i = bmuVar.f;
        int i2 = bmuVar.e;
        Integer valueOf = Integer.valueOf(i);
        Map map = bzeVar.j;
        if (map.containsKey(valueOf)) {
            bzeVar.b(bzeVar.c.bs().getString(R.string.qr_already_scanned));
            return;
        }
        int i3 = i2 - 1;
        if (i != i3 || map.size() != i3) {
            if (i == i3) {
                bzeVar.b(bzeVar.c.bs().getString(R.string.qr_code_missing));
                return;
            } else {
                map.put(valueOf, bmuVar);
                bzeVar.b(bzeVar.c.bs().getText(R.string.scan_next_code));
                return;
            }
        }
        map.put(valueOf, bmuVar);
        bzeVar.b(bzeVar.c.bs().getString(R.string.all_qr_codes_scanned));
        heg hegVar = new heg(4);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((bmu) it.next()).c.iterator();
            while (it2.hasNext()) {
                try {
                    bpb b = bpc.d((bmv) it2.next(), null, Instant.now().toEpochMilli()).b();
                    b.i(a.R());
                    hegVar.h(b.a());
                } catch (boz | bps e) {
                    bze bzeVar2 = this.a;
                    bzeVar2.b(bzeVar2.c.bs().getString(R.string.unrecognized_algorithm_otp_type));
                    ((hkf) ((hkf) ((hkf) bze.a.g()).h(e)).i("com/google/android/apps/authenticator2/migration/imports/ImportFragmentPeer$QrCodeScannedCallback", "onSuccess", (char) 205, "ImportFragmentPeer.java")).s("Could not parse an algorithm or an otp type during import flow.");
                }
            }
        }
        hel g = hegVar.g();
        bze bzeVar3 = this.a;
        bxc bxcVar = (bxc) bzeVar3.d;
        cam c = bxcVar.c.c(g);
        bxcVar.d(c, bxb.ADD_OTPS);
        bzeVar3.f.i(new cbp(c.a), bzeVar3.k);
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
