package defpackage;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.authenticator2.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cbs implements aia {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cbs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    @Override // defpackage.aia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Preference preference, Object obj) {
        int i;
        int i2;
        Integer valueOf;
        dev devVar;
        dev devVar2;
        Executor mainExecutor;
        dev devVar3;
        Executor mainExecutor2;
        int i3 = this.b;
        if (i3 == 0) {
            boolean equals = Boolean.TRUE.equals(obj);
            Object obj2 = this.a;
            if (equals) {
                cbw cbwVar = (cbw) obj2;
                if (((pb) cbwVar.l.a).a(33023) != 0) {
                    cbwVar.j.k(false);
                    return false;
                }
            }
            cbw cbwVar2 = (cbw) obj2;
            cbt cbtVar = new cbt(cbwVar2, equals);
            cbr cbrVar = cbwVar2.b;
            brn brnVar = new brn(cbrVar, new gwo(cbwVar2.m, cbtVar));
            pd pdVar = new pd();
            pdVar.a = cbrVar.bs().getString(R.string.unlock_authenticator_title);
            pdVar.b = cbrVar.bs().getString(R.string.unlock_authenticator_subtitle);
            pdVar.c();
            pdVar.b();
            brnVar.a(pdVar.a());
            return false;
        }
        if (i3 == 1) {
            int parseInt = Integer.parseInt(obj.toString());
            dff dffVar = parseInt != 0 ? parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? dff.UNKNOWN_DELAY : dff.TEN_MINUTES : dff.ONE_MINUTE : dff.TEN_SECONDS : dff.IMMEDIATE;
            cbw cbwVar3 = (cbw) this.a;
            cbwVar3.e.j(cbp.k(cbwVar3.c.d.c(dffVar)), new cbp(Integer.valueOf(obj.toString())), cbwVar3.h);
            return true;
        }
        if (i3 != 2) {
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) preference;
            obj.getClass();
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj3 = this.a;
            dfj dfjVar = (dfj) obj3;
            dfjVar.aH(false);
            Boolean bool = dfjVar.aG().b;
            if (bool != null) {
                dfjVar.aG().a = bool.booleanValue() != booleanValue;
            }
            dev devVar4 = dfjVar.f;
            if (devVar4 == null) {
                ksp.a("privacyScreen");
                devVar3 = null;
            } else {
                devVar3 = devVar4;
            }
            hvi d = devVar3.d(booleanValue);
            dfi dfiVar = new dfi(dfjVar, booleanValue, switchPreferenceCompat);
            mainExecutor2 = ((aij) obj3).a.a.getMainExecutor();
            hnu.aS(d, dfiVar, mainExecutor2);
            return true;
        }
        ListPreference listPreference = (ListPreference) preference;
        String str = listPreference.i;
        obj.getClass();
        String str2 = (String) obj;
        int length = str2.length();
        if (length != 0) {
            char charAt = str2.charAt(0);
            int i4 = -2147483647;
            if (charAt >= '0') {
                i = 0;
            } else if (length != 1) {
                if (charAt == '+') {
                    i2 = 0;
                    i = 1;
                    int i5 = 0;
                    int i6 = -59652323;
                    while (i < length) {
                        int digit = Character.digit((int) str2.charAt(i), 10);
                        if (digit >= 0) {
                            if (i5 < i6) {
                                if (i6 == -59652323) {
                                    i6 = -214748364;
                                    if (i5 < -214748364) {
                                    }
                                }
                            }
                            int i7 = i5 * 10;
                            if (i7 >= i4 + digit) {
                                i5 = i7 - digit;
                                i++;
                            }
                        }
                    }
                    valueOf = i2 == 0 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
                    if (valueOf != null || (r1 = dff.b(valueOf.intValue())) == null) {
                        dff dffVar2 = dff.IMMEDIATE;
                    }
                    dff dffVar3 = dffVar2;
                    Object obj4 = this.a;
                    dfj dfjVar2 = (dfj) obj4;
                    dfjVar2.aH(false);
                    devVar = dfjVar2.f;
                    if (devVar == null) {
                        ksp.a("privacyScreen");
                        devVar2 = null;
                    } else {
                        devVar2 = devVar;
                    }
                    hvi c = devVar2.c(dffVar3);
                    kct kctVar = new kct(dfjVar2, dffVar3, listPreference, str, 1);
                    mainExecutor = ((aij) obj4).a.a.getMainExecutor();
                    hnu.aS(c, kctVar, mainExecutor);
                    return true;
                }
                if (charAt == '-') {
                    i4 = Integer.MIN_VALUE;
                    i = 1;
                }
            }
            i2 = i;
            int i52 = 0;
            int i62 = -59652323;
            while (i < length) {
            }
            if (i2 == 0) {
            }
            if (valueOf != null) {
            }
            dff dffVar22 = dff.IMMEDIATE;
            dff dffVar32 = dffVar22;
            Object obj42 = this.a;
            dfj dfjVar22 = (dfj) obj42;
            dfjVar22.aH(false);
            devVar = dfjVar22.f;
            if (devVar == null) {
            }
            hvi c2 = devVar2.c(dffVar32);
            kct kctVar2 = new kct(dfjVar22, dffVar32, listPreference, str, 1);
            mainExecutor = ((aij) obj42).a.a.getMainExecutor();
            hnu.aS(c2, kctVar2, mainExecutor);
            return true;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        dff dffVar222 = dff.IMMEDIATE;
        dff dffVar322 = dffVar222;
        Object obj422 = this.a;
        dfj dfjVar222 = (dfj) obj422;
        dfjVar222.aH(false);
        devVar = dfjVar222.f;
        if (devVar == null) {
        }
        hvi c22 = devVar2.c(dffVar322);
        kct kctVar22 = new kct(dfjVar222, dffVar322, listPreference, str, 1);
        mainExecutor = ((aij) obj422).a.a.getMainExecutor();
        hnu.aS(c22, kctVar22, mainExecutor);
        return true;
    }
}
