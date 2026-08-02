package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import j$.util.Objects;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwu implements htr {
    private final /* synthetic */ int a;

    public /* synthetic */ bwu(int i) {
        this.a = i;
    }

    @Override // defpackage.htr
    public final hvi a(Object obj) {
        switch (this.a) {
            case 0:
                return hnu.aG(hdb.c((hel) obj).d(new bqh(20)).e());
            case 1:
                return ((cam) obj).a;
            case 2:
                return ((car) obj).g();
            case 3:
                ikk ikkVar = (ikk) obj;
                if (ikkVar == null) {
                    throw new bzi("Barcode is null");
                }
                String a = ikkVar.a();
                if (a == null) {
                    return hnu.aI(new bzi("The barcode has display value of null"));
                }
                Uri parse = Uri.parse(a);
                String queryParameter = parse.getQueryParameter("data");
                if (!Objects.equals(parse.getScheme(), "otpauth-migration")) {
                    throw new bzi("Incorrect migration scheme");
                }
                if (!Objects.equals(parse.getAuthority(), "offline")) {
                    throw new bzi("Incorrect migration authority");
                }
                if (queryParameter == null) {
                    throw new bzi("Migration data is empty");
                }
                try {
                    bmu bmuVar = (bmu) jkp.v(bmu.a, Base64.decode(queryParameter, 0), jkd.a());
                    int i = bmuVar.e;
                    if (i <= 0) {
                        throw new bzi("Batch size is a positive integer");
                    }
                    int i2 = bmuVar.f;
                    if (i2 < 0) {
                        throw new bzi("Negative batch index");
                    }
                    if (i <= i2) {
                        throw new bzi("A batch index exceeds the batch size");
                    }
                    if ((bmuVar.b & 1) == 0 || bmuVar.d > 2) {
                        throw new bzh();
                    }
                    return hnu.aJ(bmuVar);
                } catch (jld e) {
                    throw new bzi(e);
                }
            case 4:
                throw new cal((Exception) obj);
            case 5:
                throw new cal((Exception) obj);
            case 6:
                throw new cal((Exception) obj);
            case 7:
                throw new cal((Exception) obj);
            case 8:
                throw new cal((Exception) obj);
            case 9:
                return hnu.aI(new IllegalStateException());
            case 10:
                throw ((Exception) obj);
            case 11:
                throw ((Exception) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                throw ((Exception) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                throw ((Exception) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hnu.aJ((ikc) jkp.v(ikc.a, (byte[]) obj, jkd.a));
            case 15:
                cmm cmmVar = (cmm) obj;
                return cmmVar.a() == 17 ? hnu.aI(new MdiNotAvailableException$ApiNotConnectedException()) : hnu.aI(cmmVar);
            case 16:
                IOException iOException = (IOException) obj;
                cmm cmmVar2 = (cmm) dih.ak(iOException, cmm.class);
                return (cmmVar2 == null || cmmVar2.a() != 10) ? hnu.aI(iOException) : hnu.aI(new MdiNotAvailableException$DeveloperErrorException());
            case 17:
                cmm cmmVar3 = (cmm) obj;
                throw new etq(cmmVar3.a(), cmmVar3.getMessage(), cmmVar3);
            case 18:
                return hnu.aJ("");
            case 19:
                Throwable th = (Throwable) obj;
                th.getClass();
                if ((th instanceof cmc) || (th instanceof cmb)) {
                    return hnu.aI(th);
                }
                ((hkf) ((hkf) fvw.a.f()).h(th).i("com/google/apps/tiktok/account/data/google/GmsAccounts", "loadOwnersReturningEmptyListOnFailure$<anonymous>", 125, "GmsAccounts.kt")).s("GoogleOwnersProvider failed");
                int i3 = hel.d;
                return hnu.aJ(his.a);
            default:
                return ((gbv) obj).a();
        }
    }
}
