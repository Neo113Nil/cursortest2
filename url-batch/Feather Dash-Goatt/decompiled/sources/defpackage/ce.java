package defpackage;

import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ce extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce(int i, Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tl tlVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (s11) this.e;
            case 1:
                Object obj = dy.d;
                File file = (File) this.e;
                synchronized (obj) {
                    dy.c.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case 2:
                ((o10) this.e).B0();
                return Unit.a;
            case 3:
                Object systemService = ((y80) this.e).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 4:
                nd0 nd0Var = ((jd0) this.e).K;
                nd0Var.p.C = true;
                kj0 kj0Var = nd0Var.q;
                if (kj0Var != null) {
                    kj0Var.w = true;
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                pd0 pd0Var = (pd0) this.e;
                if (!((Boolean) pd0Var.g.getValue()).booleanValue() && (tlVar = pd0Var.c) != null) {
                    tlVar.l();
                }
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                rj0 rj0Var = (rj0) ((zg0) this.e).a.e;
                if (!rj0Var.e) {
                    if (rj0Var.g) {
                        dy0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    rj0Var.c();
                    rj0Var.g = true;
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((wo0) this.e).d;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return ((ap0) this.e).z0();
            case 9:
                File file2 = (File) ((w3) this.e).invoke();
                String name = file2.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if ((lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case RequestError.EVENT_TIMEOUT /* 10 */:
                u11 u11Var = (u11) this.e;
                u11Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    u11Var.a();
                    Trace.endSection();
                    return Unit.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                xd0 a = ((df1) this.e).a();
                jd0 jd0Var = a.d;
                if (a.r != ((bo0) jd0Var.n()).d.g) {
                    vn0 vn0Var = a.j;
                    Object[] objArr = vn0Var.c;
                    long[] jArr = vn0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        ((pd0) objArr[(i << 3) + i3]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (jd0Var.m != null) {
                        if (!jd0Var.K.e) {
                            jd0.R(jd0Var, false, 7);
                        }
                    } else if (!jd0Var.p()) {
                        jd0.T(jd0Var, false, 7);
                    }
                }
                return Unit.a;
            case 12:
                return new BaseInputConnection(((y80) this.e).a, false);
            default:
                om1 om1Var = (om1) this.e;
                Unit unit = Unit.a;
                om1Var.g.setValue(unit);
                return unit;
        }
    }
}
