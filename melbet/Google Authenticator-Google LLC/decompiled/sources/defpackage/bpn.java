package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import j$.util.Map;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpn implements htr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bpn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [hvi, java.lang.Object] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i = 10;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                return ((bpr) obj2).e.p(new bpi(obj2, 0));
            case 1:
                ikk ikkVar = (ikk) obj;
                if (ikkVar == null) {
                    throw new cbk("Empty barcode scanned");
                }
                boo booVar = (boo) this.a;
                booVar.j = kt.A(ikkVar.a());
                return hnu.aJ(booVar.j);
            case 2:
                return hnu.aG(hdb.c((hel) obj).d(new bpf(this.a, 0)).e());
            case 3:
                Object obj3 = this.a;
                return ((bpr) obj3).e.p(new bpi(obj3, i2));
            case 4:
                return hnu.aG(hdb.c((List) obj).d(new bpf(this.a, 6)).e());
            case 5:
                ikk ikkVar2 = (ikk) obj;
                if (ikkVar2 != null) {
                    return hnu.aJ(kt.A(ikkVar2.a()));
                }
                throw new cbk("Empty barcode scanned");
            case 6:
                return ((bww) this.a).g.i();
            case 7:
                return hoq.aW((hel) obj).s(new bws(1), ((bww) this.a).f);
            case 8:
                return ((bww) this.a).g.g();
            case 9:
                return ((car) this.a).f((hel) obj);
            case 10:
                return hoq.aW((hel) obj).s(new bws(0), ((bww) this.a).f);
            case 11:
                return this.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((bwz) this.a).d.i();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((iyi) this.a).z((bxe) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bxe bxeVar = (bxe) obj;
                return bxeVar == bxe.FAILED ? ((bxc) this.a).d.z(bxeVar) : hve.a;
            case 15:
                return ((bpr) this.a).b((bpc) obj);
            case 16:
                String str = (String) obj;
                if (str.equals("pseudonymous")) {
                    return hnu.aI(new can());
                }
                Object obj4 = this.a;
                final long epochMilli = Instant.now().toEpochMilli();
                final cbz cbzVar = new cbz(new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0));
                Object obj5 = ((car) obj4).f;
                final ccd ccdVar = (ccd) obj5;
                bpr bprVar = ccdVar.h;
                hvi a = bprVar.d.a();
                bpn bpnVar = new bpn(bprVar, i4);
                hvl hvlVar = bprVar.b;
                hvi au = hoq.au(a, bpnVar, hvlVar);
                long epochMilli2 = Instant.now().toEpochMilli();
                int i5 = 1;
                hvi s = hoq.aV(au, gwu.g(au).h(new dez(epochMilli2, i5), hvlVar).i(new bpn(bprVar, 2), hvlVar)).s(new gqg(au, epochMilli2, i5), hvlVar);
                long epochMilli3 = Instant.now().toEpochMilli();
                String d = caz.d("-", str);
                jmh b = jmx.b(Instant.now().toEpochMilli() - 30000);
                jkj k = jni.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                d.getClass();
                ((jni) jkpVar).c = d;
                if (!jkpVar.M()) {
                    k.t();
                }
                ((jni) k.b).e = true;
                jkj k2 = jnl.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar2 = k2.b;
                ((jnl) jkpVar2).c = 2;
                if (!jkpVar2.M()) {
                    k2.t();
                }
                jnl jnlVar = (jnl) k2.b;
                b.getClass();
                jnlVar.d = b;
                jnlVar.b |= 1;
                jnl jnlVar2 = (jnl) k2.q();
                if (!k.b.M()) {
                    k.t();
                }
                caz cazVar = ccdVar.i;
                jni jniVar = (jni) k.b;
                jnlVar2.getClass();
                jniVar.d = jnlVar2;
                jniVar.b |= 1;
                hvi c = cazVar.c((jni) k.q(), d, b, epochMilli3);
                bwv bwvVar = new bwv(10);
                hvl hvlVar2 = cazVar.d;
                hvi at = hoq.at(c, bwvVar, hvlVar2);
                hvi ap = hoq.ap(at, Exception.class, new bpm(cazVar, epochMilli3, at, 4), hvlVar2);
                brn aX = hoq.aX(s, ap);
                bsp bspVar = new bsp(s, ap, 6);
                hvl hvlVar3 = ccdVar.c;
                return hoq.aW(hdb.c(ccdVar.a).d(new gcw(obj5, hoq.at(aX.s(bspVar, hvlVar3), new ccb(obj5, i4), hvlVar3), cbzVar, str, 1)).e()).s(new Callable() { // from class: ccc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long epochMilli4 = Instant.now().toEpochMilli() - epochMilli;
                        ccd ccdVar2 = ccd.this;
                        int i6 = ccdVar2.g;
                        int i7 = ccdVar2.f;
                        jkj k3 = hqs.a.k();
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        hqs hqsVar = (hqs) k3.b;
                        hqsVar.c = 12;
                        hqsVar.b |= 1;
                        jkj k4 = hqx.a.k();
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        jkp jkpVar3 = k4.b;
                        hqx hqxVar = (hqx) jkpVar3;
                        hqxVar.b |= 2;
                        hqxVar.d = i6;
                        int i8 = i6 + i7;
                        if (!jkpVar3.M()) {
                            k4.t();
                        }
                        jkp jkpVar4 = k4.b;
                        hqx hqxVar2 = (hqx) jkpVar4;
                        hqxVar2.b |= 1;
                        hqxVar2.c = i8;
                        if (!jkpVar4.M()) {
                            k4.t();
                        }
                        cbz cbzVar2 = cbzVar;
                        hqx hqxVar3 = (hqx) k4.b;
                        hqxVar3.b |= 4;
                        hqxVar3.e = epochMilli4;
                        jkj k5 = hqw.a.k();
                        AtomicInteger atomicInteger = cbzVar2.d;
                        int intValue = atomicInteger.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar = (hqw) k5.b;
                        hqwVar.b |= 8;
                        hqwVar.f = intValue;
                        AtomicInteger atomicInteger2 = cbzVar2.e;
                        int intValue2 = atomicInteger2.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar2 = (hqw) k5.b;
                        hqwVar2.b |= 4;
                        hqwVar2.e = intValue2;
                        AtomicInteger atomicInteger3 = cbzVar2.f;
                        int intValue3 = atomicInteger3.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar3 = (hqw) k5.b;
                        hqwVar3.b |= 2;
                        hqwVar3.d = intValue3;
                        AtomicInteger atomicInteger4 = cbzVar2.g;
                        int intValue4 = atomicInteger4.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar4 = (hqw) k5.b;
                        hqwVar4.b |= 1;
                        hqwVar4.c = intValue4;
                        int intValue5 = atomicInteger.intValue() + atomicInteger3.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar5 = (hqw) k5.b;
                        hqwVar5.b |= 32;
                        hqwVar5.h = intValue5;
                        int intValue6 = atomicInteger2.intValue() + atomicInteger4.intValue();
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        hqw hqwVar6 = (hqw) k5.b;
                        hqwVar6.b |= 16;
                        hqwVar6.g = intValue6;
                        hqw hqwVar7 = (hqw) k5.q();
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        hqx hqxVar4 = (hqx) k4.b;
                        hqwVar7.getClass();
                        hqxVar4.f = hqwVar7;
                        hqxVar4.b |= 8;
                        jkj k6 = hqt.a.k();
                        int intValue7 = cbzVar2.a.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar = (hqt) k6.b;
                        hqtVar.b |= 1;
                        hqtVar.c = intValue7;
                        int intValue8 = cbzVar2.b.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar2 = (hqt) k6.b;
                        hqtVar2.b |= 2;
                        hqtVar2.d = intValue8;
                        int intValue9 = cbzVar2.c.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar3 = (hqt) k6.b;
                        hqtVar3.b |= 4;
                        hqtVar3.e = intValue9;
                        int intValue10 = cbzVar2.h.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar4 = (hqt) k6.b;
                        hqtVar4.b |= 8;
                        hqtVar4.f = intValue10;
                        int intValue11 = cbzVar2.i.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar5 = (hqt) k6.b;
                        hqtVar5.b |= 16;
                        hqtVar5.g = intValue11;
                        int intValue12 = cbzVar2.j.intValue();
                        if (!k6.b.M()) {
                            k6.t();
                        }
                        hqt hqtVar6 = (hqt) k6.b;
                        hqtVar6.b |= 32;
                        hqtVar6.h = intValue12;
                        hqt hqtVar7 = (hqt) k6.q();
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        hqx hqxVar5 = (hqx) k4.b;
                        hqtVar7.getClass();
                        hqxVar5.g = hqtVar7;
                        hqxVar5.b |= 16;
                        hqx hqxVar6 = (hqx) k4.q();
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        jkp jkpVar5 = k3.b;
                        hqs hqsVar2 = (hqs) jkpVar5;
                        hqxVar6.getClass();
                        hqsVar2.d = hqxVar6;
                        hqsVar2.b |= 2;
                        if (!jkpVar5.M()) {
                            k3.t();
                        }
                        String str2 = ccdVar2.e;
                        bov bovVar = ccdVar2.b;
                        hqs hqsVar3 = (hqs) k3.b;
                        str2.getClass();
                        hqsVar3.b |= 64;
                        hqsVar3.g = str2;
                        bovVar.a((hqs) k3.q());
                        return null;
                    }
                }, ccdVar.d);
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    return hve.a;
                }
                Object obj6 = this.a;
                hkh hkhVar = cbe.a;
                ((hkf) ((hkf) hkhVar.e()).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "getObfuscatedGaiaIdToOtpMap", 227, "PreTikTokDatabaseMigrationImpl.java")).s("Opening old database");
                final cbe cbeVar = (cbe) obj6;
                hvi p = cbeVar.j.p(new fds() { // from class: cbd
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0 A[Catch: all -> 0x04d6, TryCatch #2 {all -> 0x04d6, blocks: (B:3:0x001b, B:5:0x003c, B:10:0x0043, B:14:0x0069, B:28:0x00b4, B:29:0x00bb, B:30:0x0105, B:32:0x010b, B:36:0x0273, B:37:0x0130, B:40:0x013d, B:42:0x0143, B:44:0x0149, B:45:0x0151, B:48:0x016a, B:52:0x0183, B:54:0x018f, B:56:0x0199, B:58:0x019f, B:59:0x01b6, B:61:0x01d0, B:62:0x01e4, B:64:0x01dc, B:67:0x0176, B:71:0x0223, B:75:0x024c, B:79:0x0294, B:80:0x02be, B:82:0x02c4, B:85:0x02d4, B:101:0x02dd, B:88:0x02eb, B:91:0x02fc, B:95:0x0311, B:97:0x0386, B:98:0x0306, B:105:0x036b, B:112:0x0398, B:113:0x03b4, B:115:0x03ba, B:118:0x03ce, B:122:0x03de, B:123:0x03d6, B:128:0x0439, B:129:0x0451, B:131:0x0457, B:134:0x046b, B:137:0x047b, B:139:0x0473, B:150:0x0058, B:153:0x0060), top: B:2:0x001b, inners: #3, #4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc A[Catch: all -> 0x04d6, TryCatch #2 {all -> 0x04d6, blocks: (B:3:0x001b, B:5:0x003c, B:10:0x0043, B:14:0x0069, B:28:0x00b4, B:29:0x00bb, B:30:0x0105, B:32:0x010b, B:36:0x0273, B:37:0x0130, B:40:0x013d, B:42:0x0143, B:44:0x0149, B:45:0x0151, B:48:0x016a, B:52:0x0183, B:54:0x018f, B:56:0x0199, B:58:0x019f, B:59:0x01b6, B:61:0x01d0, B:62:0x01e4, B:64:0x01dc, B:67:0x0176, B:71:0x0223, B:75:0x024c, B:79:0x0294, B:80:0x02be, B:82:0x02c4, B:85:0x02d4, B:101:0x02dd, B:88:0x02eb, B:91:0x02fc, B:95:0x0311, B:97:0x0386, B:98:0x0306, B:105:0x036b, B:112:0x0398, B:113:0x03b4, B:115:0x03ba, B:118:0x03ce, B:122:0x03de, B:123:0x03d6, B:128:0x0439, B:129:0x0451, B:131:0x0457, B:134:0x046b, B:137:0x047b, B:139:0x0473, B:150:0x0058, B:153:0x0060), top: B:2:0x001b, inners: #3, #4 }] */
                    @Override // defpackage.fds
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a(fwm fwmVar) {
                        cbd cbdVar;
                        HashMap hashMap;
                        cbe cbeVar2;
                        int i6;
                        int i7;
                        HashMap hashMap2;
                        int i8;
                        long j;
                        int i9;
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        int i18;
                        HashMap hashMap3;
                        String str2;
                        int i19;
                        String str3;
                        Integer valueOf;
                        String str4;
                        long epochMilli4;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        sb.append("SELECT * FROM accounts");
                        Cursor p2 = fwmVar.p(exf.q(sb, arrayList));
                        try {
                            ((hkf) ((hkf) cbe.a.e()).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "buildOtpsFromOldDb", 316, "PreTikTokDatabaseMigrationImpl.java")).s("Building OTPs from old database's cursor");
                            if (p2.getCount() == 0) {
                                hashMap = new HashMap();
                            } else {
                                char c2 = 65535;
                                String str5 = p2.getColumnIndex("issuer") == -1 ? "initial" : p2.getColumnIndex("isencrypted") == -1 ? "issuer_added" : p2.getColumnIndex("obfuscated_gaia_id") == -1 ? "encryption_added" : "last_version";
                                switch (str5.hashCode()) {
                                    case -1126365190:
                                        if (str5.equals("issuer_added")) {
                                            cbdVar = this;
                                            c2 = 1;
                                            break;
                                        }
                                        cbdVar = this;
                                        break;
                                    case -545102524:
                                        if (str5.equals("encryption_added")) {
                                            cbdVar = this;
                                            c2 = 2;
                                            break;
                                        }
                                        cbdVar = this;
                                        break;
                                    case 924737583:
                                        if (str5.equals("last_version")) {
                                            cbdVar = this;
                                            c2 = 3;
                                            break;
                                        }
                                        cbdVar = this;
                                        break;
                                    case 1948342084:
                                        if (str5.equals("initial")) {
                                            c2 = 0;
                                        }
                                        cbdVar = this;
                                        break;
                                    default:
                                        cbdVar = this;
                                        break;
                                }
                                cbe cbeVar3 = cbe.this;
                                if (c2 == 0) {
                                    int columnIndex = p2.getColumnIndex("email");
                                    int columnIndex2 = p2.getColumnIndex("secret");
                                    int columnIndex3 = p2.getColumnIndex("type");
                                    int columnIndex4 = p2.getColumnIndex("counter");
                                    HashMap hashMap4 = new HashMap();
                                    for (int i20 = 0; i20 < p2.getCount(); i20++) {
                                        p2.moveToPosition(i20);
                                        int i21 = p2.getInt(columnIndex3);
                                        Integer.valueOf(i21).getClass();
                                        String str6 = i21 == 0 ? "totp" : "hotp";
                                        Integer valueOf2 = str6.equals("totp") ? null : Integer.valueOf(p2.getInt(columnIndex4));
                                        bpb bpbVar = new bpb();
                                        bpbVar.e(p2.getString(columnIndex));
                                        bpbVar.a = null;
                                        bpbVar.g(p2.getString(columnIndex2));
                                        bpbVar.i(a.R());
                                        bpbVar.h(Instant.now().toEpochMilli());
                                        bpbVar.f(str6);
                                        bpbVar.b = valueOf2;
                                        bpbVar.b(bpa.SHA1.d);
                                        bpbVar.d(false);
                                        bpbVar.c(6);
                                        bpc a2 = bpbVar.a();
                                        Map.EL.putIfAbsent(hashMap4, "pseudonymous", new ArrayList());
                                        ((List) hashMap4.get("pseudonymous")).add(a2);
                                    }
                                    hashMap = hashMap4;
                                } else if (c2 == 1) {
                                    int columnIndex5 = p2.getColumnIndex("email");
                                    int columnIndex6 = p2.getColumnIndex("secret");
                                    int columnIndex7 = p2.getColumnIndex("type");
                                    int columnIndex8 = p2.getColumnIndex("counter");
                                    int columnIndex9 = p2.getColumnIndex("issuer");
                                    HashMap hashMap5 = new HashMap();
                                    for (int i22 = 0; i22 < p2.getCount(); i22++) {
                                        p2.moveToPosition(i22);
                                        int i23 = p2.getInt(columnIndex7);
                                        Integer.valueOf(i23).getClass();
                                        String str7 = i23 == 0 ? "totp" : "hotp";
                                        Integer valueOf3 = str7.equals("totp") ? null : Integer.valueOf(p2.getInt(columnIndex8));
                                        bpb bpbVar2 = new bpb();
                                        bpbVar2.e(p2.getString(columnIndex5));
                                        bpbVar2.a = p2.getString(columnIndex9);
                                        bpbVar2.g(p2.getString(columnIndex6));
                                        bpbVar2.i(a.R());
                                        bpbVar2.h(Instant.now().toEpochMilli());
                                        bpbVar2.f(str7);
                                        bpbVar2.b = valueOf3;
                                        bpbVar2.b(bpa.SHA1.d);
                                        bpbVar2.d(false);
                                        bpbVar2.c(6);
                                        bpc a3 = bpbVar2.a();
                                        Map.EL.putIfAbsent(hashMap5, "pseudonymous", new ArrayList());
                                        ((List) hashMap5.get("pseudonymous")).add(a3);
                                    }
                                    hashMap = hashMap5;
                                } else if (c2 == 2) {
                                    String str8 = "PreTikTokDatabaseMigrationImpl.java";
                                    int columnIndex10 = p2.getColumnIndex("email");
                                    int columnIndex11 = p2.getColumnIndex("secret");
                                    int columnIndex12 = p2.getColumnIndex("isencrypted");
                                    int columnIndex13 = p2.getColumnIndex("type");
                                    int columnIndex14 = p2.getColumnIndex("counter");
                                    int columnIndex15 = p2.getColumnIndex("issuer");
                                    HashMap hashMap6 = new HashMap();
                                    long epochMilli5 = Instant.now().toEpochMilli();
                                    int i24 = 0;
                                    while (i24 < p2.getCount()) {
                                        p2.moveToPosition(i24);
                                        int i25 = p2.getInt(columnIndex12);
                                        Integer.valueOf(i25).getClass();
                                        String str9 = str8;
                                        try {
                                            String string = p2.getString(columnIndex11);
                                            i7 = columnIndex11;
                                            if (i25 == 1) {
                                                try {
                                                    string = cbeVar3.f.a(string);
                                                } catch (bpv e) {
                                                    e = e;
                                                    cbeVar2 = cbeVar3;
                                                    i6 = columnIndex14;
                                                    hashMap2 = hashMap6;
                                                    i8 = columnIndex15;
                                                    j = epochMilli5;
                                                    str8 = str9;
                                                    i9 = i24;
                                                    ((hkf) ((hkf) ((hkf) cbe.a.g()).h(e)).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "migrateFromEncryptedDbState", (char) 425, str8)).s("Could not decrypt a secret from encrypted db state");
                                                    i24 = i9 + 1;
                                                    hashMap6 = hashMap2;
                                                    columnIndex15 = i8;
                                                    cbeVar3 = cbeVar2;
                                                    columnIndex11 = i7;
                                                    columnIndex14 = i6;
                                                    epochMilli5 = j;
                                                }
                                            }
                                            int i26 = p2.getInt(columnIndex13);
                                            Integer.valueOf(i26).getClass();
                                            String str10 = i26 == 0 ? "totp" : "hotp";
                                            Integer valueOf4 = str10.equals("totp") ? null : Integer.valueOf(p2.getInt(columnIndex14));
                                            cbeVar2 = cbeVar3;
                                            bpb bpbVar3 = new bpb();
                                            i6 = columnIndex14;
                                            bpbVar3.e(p2.getString(columnIndex10));
                                            bpbVar3.a = p2.getString(columnIndex15);
                                            bpbVar3.g(string);
                                            bpbVar3.i(a.R());
                                            bpbVar3.h(epochMilli5);
                                            bpbVar3.f(str10);
                                            bpbVar3.b = valueOf4;
                                            bpbVar3.b(bpa.SHA1.d);
                                            bpbVar3.d(false);
                                            bpbVar3.c(6);
                                            bpc a4 = bpbVar3.a();
                                            Map.EL.putIfAbsent(hashMap6, "pseudonymous", new ArrayList());
                                            ((List) hashMap6.get("pseudonymous")).add(a4);
                                            i8 = columnIndex15;
                                            hashMap2 = hashMap6;
                                            j = epochMilli5;
                                            str8 = str9;
                                            i9 = i24;
                                        } catch (bpv e2) {
                                            e = e2;
                                            cbeVar2 = cbeVar3;
                                            i6 = columnIndex14;
                                            i7 = columnIndex11;
                                        }
                                        i24 = i9 + 1;
                                        hashMap6 = hashMap2;
                                        columnIndex15 = i8;
                                        cbeVar3 = cbeVar2;
                                        columnIndex11 = i7;
                                        columnIndex14 = i6;
                                        epochMilli5 = j;
                                    }
                                    hashMap = hashMap6;
                                } else if (c2 != 3) {
                                    hashMap = new HashMap();
                                } else {
                                    int columnIndex16 = p2.getColumnIndex("email");
                                    int columnIndex17 = p2.getColumnIndex("secret");
                                    int columnIndex18 = p2.getColumnIndex("isencrypted");
                                    int columnIndex19 = p2.getColumnIndex("type");
                                    int columnIndex20 = p2.getColumnIndex("counter");
                                    int columnIndex21 = p2.getColumnIndex("issuer");
                                    int columnIndex22 = p2.getColumnIndex("obfuscated_gaia_id");
                                    int columnIndex23 = p2.getColumnIndex("otp_timestamp");
                                    int columnIndex24 = p2.getColumnIndex("unique_id");
                                    int columnIndex25 = p2.getColumnIndex("is_deleted");
                                    String str11 = "PreTikTokDatabaseMigrationImpl.java";
                                    int columnIndex26 = p2.getColumnIndex("algorithm");
                                    int columnIndex27 = p2.getColumnIndex("digits");
                                    HashMap hashMap7 = new HashMap();
                                    int i27 = 0;
                                    while (i27 < p2.getCount()) {
                                        p2.moveToPosition(i27);
                                        int i28 = i27;
                                        if (p2.getInt(columnIndex25) == 1) {
                                            i11 = columnIndex26;
                                            i12 = columnIndex20;
                                            i13 = columnIndex22;
                                            i14 = columnIndex19;
                                            i10 = columnIndex18;
                                            i15 = columnIndex21;
                                            i16 = columnIndex23;
                                            i17 = columnIndex16;
                                            i18 = columnIndex27;
                                            hashMap3 = hashMap7;
                                            str2 = str11;
                                            i19 = columnIndex24;
                                        } else {
                                            int i29 = p2.getInt(columnIndex18);
                                            Integer.valueOf(i29).getClass();
                                            i10 = columnIndex18;
                                            try {
                                                String string2 = p2.getString(columnIndex17);
                                                if (i29 == 1) {
                                                    string2 = cbeVar3.f.a(string2);
                                                }
                                                try {
                                                    bpa a5 = bpa.a(p2.getString(columnIndex26));
                                                    String string3 = p2.getString(columnIndex22);
                                                    int i30 = p2.getInt(columnIndex19);
                                                    Integer.valueOf(i30).getClass();
                                                    if (i30 == 0) {
                                                        i11 = columnIndex26;
                                                        str3 = "totp";
                                                    } else {
                                                        i11 = columnIndex26;
                                                        str3 = "hotp";
                                                    }
                                                    if (str3.equals("totp")) {
                                                        i12 = columnIndex20;
                                                        valueOf = null;
                                                    } else {
                                                        i12 = columnIndex20;
                                                        valueOf = Integer.valueOf(p2.getInt(columnIndex20));
                                                    }
                                                    i13 = columnIndex22;
                                                    String string4 = p2.getString(columnIndex16);
                                                    i14 = columnIndex19;
                                                    String string5 = p2.getString(columnIndex21);
                                                    if (string5 != null) {
                                                        i15 = columnIndex21;
                                                        if (string4.contains(":") && string4.contains(string5)) {
                                                            i17 = columnIndex16;
                                                            str4 = (String) hnu.U(gzz.f().c(string4), 1);
                                                            bpb bpbVar4 = new bpb();
                                                            bpbVar4.e(str4);
                                                            bpbVar4.a = string5;
                                                            bpbVar4.g(string2);
                                                            bpbVar4.i(p2.getString(columnIndex24));
                                                            if (string4.equals(str4)) {
                                                                epochMilli4 = Instant.now().toEpochMilli();
                                                            } else {
                                                                epochMilli4 = p2.getLong(columnIndex23);
                                                                Long.valueOf(epochMilli4).getClass();
                                                            }
                                                            bpbVar4.h(epochMilli4);
                                                            bpbVar4.f(str3);
                                                            bpbVar4.b = valueOf;
                                                            bpbVar4.b(a5.d);
                                                            bpbVar4.d(false);
                                                            i18 = columnIndex27;
                                                            int i31 = p2.getInt(i18);
                                                            Integer.valueOf(i31).getClass();
                                                            bpbVar4.c(i31);
                                                            bpc a6 = bpbVar4.a();
                                                            hashMap3 = hashMap7;
                                                            Map.EL.putIfAbsent(hashMap3, string3, new ArrayList());
                                                            ((List) hashMap3.get(string3)).add(a6);
                                                            i16 = columnIndex23;
                                                            i19 = columnIndex24;
                                                            str2 = str11;
                                                        }
                                                    } else {
                                                        i15 = columnIndex21;
                                                    }
                                                    i17 = columnIndex16;
                                                    str4 = string4;
                                                    bpb bpbVar42 = new bpb();
                                                    bpbVar42.e(str4);
                                                    bpbVar42.a = string5;
                                                    bpbVar42.g(string2);
                                                    bpbVar42.i(p2.getString(columnIndex24));
                                                    if (string4.equals(str4)) {
                                                    }
                                                    bpbVar42.h(epochMilli4);
                                                    bpbVar42.f(str3);
                                                    bpbVar42.b = valueOf;
                                                    bpbVar42.b(a5.d);
                                                    bpbVar42.d(false);
                                                    i18 = columnIndex27;
                                                    int i312 = p2.getInt(i18);
                                                    Integer.valueOf(i312).getClass();
                                                    bpbVar42.c(i312);
                                                    bpc a62 = bpbVar42.a();
                                                    hashMap3 = hashMap7;
                                                    Map.EL.putIfAbsent(hashMap3, string3, new ArrayList());
                                                    ((List) hashMap3.get(string3)).add(a62);
                                                    i16 = columnIndex23;
                                                    i19 = columnIndex24;
                                                    str2 = str11;
                                                } catch (boz e3) {
                                                    i11 = columnIndex26;
                                                    i12 = columnIndex20;
                                                    i13 = columnIndex22;
                                                    i14 = columnIndex19;
                                                    i15 = columnIndex21;
                                                    i17 = columnIndex16;
                                                    i18 = columnIndex27;
                                                    hashMap3 = hashMap7;
                                                    i16 = columnIndex23;
                                                    i19 = columnIndex24;
                                                    str2 = str11;
                                                    ((hkf) ((hkf) ((hkf) cbe.a.g()).h(e3)).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "migrateFromLastDbState", (char) 488, str2)).s("Could not parse an algorithm");
                                                }
                                            } catch (bpv e4) {
                                                i11 = columnIndex26;
                                                i12 = columnIndex20;
                                                i13 = columnIndex22;
                                                i14 = columnIndex19;
                                                i15 = columnIndex21;
                                                i16 = columnIndex23;
                                                i17 = columnIndex16;
                                                i18 = columnIndex27;
                                                hashMap3 = hashMap7;
                                                str2 = str11;
                                                i19 = columnIndex24;
                                                ((hkf) ((hkf) ((hkf) cbe.a.g()).h(e4)).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "migrateFromLastDbState", (char) 479, str2)).s("Could not decrypt a secret from last pre-tiktok db state");
                                            }
                                        }
                                        str11 = str2;
                                        hashMap7 = hashMap3;
                                        columnIndex24 = i19;
                                        columnIndex18 = i10;
                                        columnIndex22 = i13;
                                        columnIndex20 = i12;
                                        columnIndex19 = i14;
                                        columnIndex21 = i15;
                                        columnIndex16 = i17;
                                        columnIndex27 = i18;
                                        columnIndex23 = i16;
                                        columnIndex26 = i11;
                                        i27 = i28 + 1;
                                    }
                                    hashMap = hashMap7;
                                }
                            }
                            if (p2 != null) {
                                p2.close();
                            }
                            return hashMap;
                        } finally {
                        }
                    }
                });
                long epochMilli4 = Instant.now().toEpochMilli();
                ((hkf) ((hkf) hkhVar.e()).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "moveOtpsToTiktokAsyncDatabase", 242, "PreTikTokDatabaseMigrationImpl.java")).s("Migrating pre-TikTok database.");
                hvi e = cbeVar.i.e(cbeVar.c.a(), geh.FEW_SECONDS);
                brn aV = hoq.aV(p, e);
                cap capVar = new cap(obj6, p, e, 5);
                hvl hvlVar4 = cbeVar.e;
                hvi at2 = hoq.at(aV.t(capVar, hvlVar4), new cay(obj6, epochMilli4, i3), hvlVar4);
                return hoq.ap(at2, Exception.class, new bpm(obj6, epochMilli4, at2, 7), hvlVar4);
            case 18:
                dke dkeVar = (dke) obj;
                ?? r1 = this.a;
                if (dkeVar == null) {
                    return r1;
                }
                if (dkeVar.a == 4) {
                    return hti.f(r1, new gzg(dkeVar), huf.a);
                }
                throw new UnsupportedOperationException("Unsupported LogAuthSpec Override");
            case 19:
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size + size);
                Iterator it = list.iterator();
                while (true) {
                    Object obj7 = this.a;
                    if (!it.hasNext()) {
                        return hnu.aX(arrayList).a(new bws(19), ((dkj) obj7).a);
                    }
                    dkm dkmVar = (dkm) it.next();
                    try {
                        List a2 = ((dkj) obj7).a(dkmVar.a.getClass());
                        List a3 = ((dkj) obj7).a(dkl.class);
                        ArrayList arrayList2 = new ArrayList(a2.size() + a3.size());
                        Iterator it2 = a2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(dkj.c((dkk) it2.next()));
                        }
                        Iterator it3 = a3.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(dkj.c((dkk) it3.next()));
                        }
                        arrayList.add(hti.f(hnu.aG(arrayList2), new cvr(i), huf.a));
                        arrayList.add(dkmVar.b);
                    } catch (Throwable th) {
                        arrayList.add(hnu.aI(th));
                    }
                }
            default:
                IOException iOException = (IOException) obj;
                int i6 = hag.a;
                IOException iOException2 = iOException;
                Throwable th2 = iOException2;
                while (true) {
                    Throwable cause = iOException2.getCause();
                    if (cause == null) {
                        if (iOException2 instanceof FileNotFoundException) {
                            return ((dok) this.a).b();
                        }
                        throw iOException;
                    }
                    if (cause == th2) {
                        throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                    }
                    if (i4 != 0) {
                        th2 = th2.getCause();
                    }
                    i4 ^= 1;
                    iOException2 = cause;
                }
        }
    }
}
