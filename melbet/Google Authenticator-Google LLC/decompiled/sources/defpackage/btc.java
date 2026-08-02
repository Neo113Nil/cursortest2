package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btc {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/loginrequirement/ariconsent/AriLoggerImpl");
    public final Context b;
    public final bov c;
    public final hvl d;
    public final chb e;

    public btc(Context context, chb chbVar, bov bovVar, hvl hvlVar) {
        this.b = context;
        this.e = chbVar;
        this.c = bovVar;
        this.d = hvlVar;
    }

    public static final iip b(ful fulVar) {
        jkj k = iip.a.k();
        jkj k2 = iio.a.k();
        String str = fulVar.c;
        if (!k2.b.M()) {
            k2.t();
        }
        iio iioVar = (iio) k2.b;
        str.getClass();
        iioVar.b = 1;
        iioVar.c = str;
        iio iioVar2 = (iio) k2.q();
        if (!k.b.M()) {
            k.t();
        }
        iip iipVar = (iip) k.b;
        iioVar2.getClass();
        iipVar.c = iioVar2;
        iipVar.b |= 1;
        return (iip) k.q();
    }

    public static final iiv c(boolean z, boolean z2) {
        iit iitVar;
        jkj k = iiv.a.k();
        int i = z ? 844 : 845;
        if (!k.b.M()) {
            k.t();
        }
        iiv iivVar = (iiv) k.b;
        iivVar.c = i - 2;
        iivVar.b |= 1;
        if (z) {
            jkj k2 = iit.a.k();
            jkj k3 = iil.a.k();
            k3.F(R.string.esi_page_text);
            iil iilVar = (iil) k3.q();
            if (!k2.b.M()) {
                k2.t();
            }
            iit iitVar2 = (iit) k2.b;
            iilVar.getClass();
            iitVar2.c = iilVar;
            iitVar2.b |= 512;
            iitVar = (iit) k2.q();
        } else if (z2) {
            jkj k4 = iit.a.k();
            jkj k5 = iil.a.k();
            k5.F(R.string.consent_title);
            k5.F(R.string.consent_message);
            iil iilVar2 = (iil) k5.q();
            if (!k4.b.M()) {
                k4.t();
            }
            iit iitVar3 = (iit) k4.b;
            iilVar2.getClass();
            iitVar3.c = iilVar2;
            iitVar3.b |= 512;
            iitVar = (iit) k4.q();
        } else {
            jkj k6 = iit.a.k();
            jkj k7 = iil.a.k();
            k7.F(R.string.use_without_an_account_title);
            k7.F(R.string.use_without_an_account_text);
            iil iilVar3 = (iil) k7.q();
            if (!k6.b.M()) {
                k6.t();
            }
            iit iitVar4 = (iit) k6.b;
            iilVar3.getClass();
            iitVar4.c = iilVar3;
            iitVar4.b |= 512;
            iitVar = (iit) k6.q();
        }
        if (!k.b.M()) {
            k.t();
        }
        iiv iivVar2 = (iiv) k.b;
        iitVar.getClass();
        iivVar2.d = iitVar;
        iivVar2.b |= 8;
        return (iiv) k.q();
    }

    public static final iif d() {
        jkj k = iif.a.k();
        iih iihVar = iih.a;
        jkj k2 = iihVar.k();
        UUID randomUUID = UUID.randomUUID();
        jkj k3 = iii.a.k();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        if (!k3.b.M()) {
            k3.t();
        }
        iii iiiVar = (iii) k3.b;
        iiiVar.b |= 1;
        iiiVar.c = mostSignificantBits;
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        if (!k3.b.M()) {
            k3.t();
        }
        iii iiiVar2 = (iii) k3.b;
        iiiVar2.b |= 2;
        iiiVar2.d = leastSignificantBits;
        iii iiiVar3 = (iii) k3.q();
        if (!k2.b.M()) {
            k2.t();
        }
        iih iihVar2 = (iih) k2.b;
        iiiVar3.getClass();
        iihVar2.c = iiiVar3;
        iihVar2.b |= 1;
        iih iihVar3 = (iih) jkp.v(iihVar, ((iih) k2.q()).f(), jkd.a());
        if (!k.b.M()) {
            k.t();
        }
        iif iifVar = (iif) k.b;
        iihVar3.getClass();
        iifVar.c = iihVar3;
        iifVar.b |= 1;
        return (iif) k.q();
    }

    public static final iiq e(int i) {
        jkj k = iiq.a.k();
        if (!k.b.M()) {
            k.t();
        }
        iiq iiqVar = (iiq) k.b;
        iiqVar.c = 479;
        iiqVar.b |= 1;
        jkj k2 = iir.a.k();
        jkj k3 = iis.a.k();
        jkj k4 = iiu.a.k();
        if (!k4.b.M()) {
            k4.t();
        }
        iiu iiuVar = (iiu) k4.b;
        iiuVar.c = i - 1;
        iiuVar.b |= 1;
        iiu iiuVar2 = (iiu) k4.q();
        if (!k3.b.M()) {
            k3.t();
        }
        iis iisVar = (iis) k3.b;
        iiuVar2.getClass();
        iisVar.c = iiuVar2;
        iisVar.b |= 1;
        iis iisVar2 = (iis) k3.q();
        if (!k2.b.M()) {
            k2.t();
        }
        iir iirVar = (iir) k2.b;
        iisVar2.getClass();
        iirVar.c = iisVar2;
        iirVar.b |= 1024;
        iir iirVar2 = (iir) k2.q();
        if (!k.b.M()) {
            k.t();
        }
        iiq iiqVar2 = (iiq) k.b;
        iirVar2.getClass();
        iiqVar2.d = iirVar2;
        iiqVar2.b |= 2;
        return (iiq) k.q();
    }

    public final iip a(ful fulVar) {
        jkj k = iip.a.k();
        jkj k2 = iio.a.k();
        String str = fulVar.c;
        if (!k2.b.M()) {
            k2.t();
        }
        iio iioVar = (iio) k2.b;
        str.getClass();
        iioVar.b = 1;
        iioVar.c = str;
        iio iioVar2 = (iio) k2.q();
        if (!k.b.M()) {
            k.t();
        }
        iip iipVar = (iip) k.b;
        iioVar2.getClass();
        iipVar.c = iioVar2;
        iipVar.b |= 1;
        jkj k3 = iin.a.k();
        String hexString = Long.toHexString(del.a(this.b.getContentResolver()));
        if (!k3.b.M()) {
            k3.t();
        }
        iin iinVar = (iin) k3.b;
        hexString.getClass();
        iinVar.b |= 1;
        iinVar.c = hexString;
        iin iinVar2 = (iin) k3.q();
        if (!k.b.M()) {
            k.t();
        }
        iip iipVar2 = (iip) k.b;
        iinVar2.getClass();
        iipVar2.d = iinVar2;
        iipVar2.b |= 4;
        return (iip) k.q();
    }
}
