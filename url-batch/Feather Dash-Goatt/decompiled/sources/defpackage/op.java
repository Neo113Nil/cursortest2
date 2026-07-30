package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.feathherdashh.dashgame.R;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class op implements uv {
    public static final hk b;
    public static final hk c;
    public static final fv e;
    public static final fv f;
    public static final fv l;
    public static ao1 p;
    public static boolean r;
    public static int s;
    public static final j50 a = new j50(14);
    public static final r10 d = new r10(7);
    public static final double[][] g = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] h = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] i = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] j = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final f6 k = new f6(5);
    public static final StackTraceElement[] m = new StackTraceElement[0];
    public static final sb0 n = new sb0(2);
    public static final Object o = new Object();
    public static final Object q = new Object();

    static {
        byte b2 = 0;
        b = new hk(954879418, false, new e9(3, b2));
        c = new hk(1918065384, false, new e9(4, b2));
        int i2 = 1;
        e = new fv("REMOVED_TASK", i2);
        f = new fv("CLOSED_EMPTY", i2);
        l = new fv("NULL", i2);
    }

    public static final void A(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = nn.a.iterator();
        while (it.hasNext()) {
            try {
                ((mn) it.next()).y(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    lw.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            lw.a(th, new cs(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static double B(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = g;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double t = t(d7);
        double t2 = t(d8);
        double t3 = t(d9);
        return Math.atan2(((t + t2) - (t3 * 2.0d)) / 9.0d, ((((-12.0d) * t2) + (t * 11.0d)) + t3) / 11.0d);
    }

    public static final t5 C(int i2, hl hlVar) {
        Resources resources = (Resources) hlVar.j(AndroidCompositionLocals_androidKt.c);
        Object L = hlVar.L();
        j41 j41Var = bl.a;
        if (L == j41Var) {
            L = new TypedValue();
            hlVar.h0(L);
        }
        TypedValue typedValue = (TypedValue) L;
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean f2 = hlVar.f(charSequence.toString());
        Object L2 = hlVar.L();
        if (f2 || L2 == j41Var) {
            Drawable drawable = resources.getDrawable(i2, null);
            drawable.getClass();
            L2 = new t5(((BitmapDrawable) drawable).getBitmap());
            hlVar.h0(L2);
        }
        return (t5) L2;
    }

    public static double D(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static boolean E(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final Object F(Object obj) {
        if (obj instanceof hj) {
            i31 i31Var = k31.d;
            return ca0.g(((hj) obj).a);
        }
        i31 i31Var2 = k31.d;
        return obj;
    }

    public static final qp0 G(yq yqVar, int i2) {
        qp0 qp0Var = ((zl0) yqVar).d.l;
        qp0Var.getClass();
        if (qp0Var.J0() != yqVar || !rp0.g(i2)) {
            return qp0Var;
        }
        qp0 qp0Var2 = qp0Var.t;
        qp0Var2.getClass();
        return qp0Var2;
    }

    public static final qp0 H(yq yqVar) {
        if (!((zl0) yqVar).d.r) {
            o80.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        qp0 G = G(yqVar, 2);
        if (!G.J0().r) {
            o80.b("LayoutCoordinates is not attached.");
        }
        return G;
    }

    public static final jd0 I(yq yqVar) {
        qp0 qp0Var = ((zl0) yqVar).d.l;
        if (qp0Var != null) {
            return qp0Var.s;
        }
        throw qy0.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final eu0 J(yq yqVar) {
        eu0 eu0Var = I(yqVar).s;
        if (eu0Var != null) {
            return eu0Var;
        }
        throw qy0.g("This node does not have an owner.");
    }

    public static am0 K(am0 am0Var, wf0 wf0Var, et0 et0Var, i5 i5Var, boolean z, xp xpVar, gn0 gn0Var) {
        et0 et0Var2 = et0.d;
        xl0 xl0Var = xl0.a;
        return am0Var.c(et0Var == et0Var2 ? mo.h(xl0Var, p60.c) : mo.h(xl0Var, p60.b)).c(new i71(i5Var, xpVar, gn0Var, et0Var, wf0Var, z, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0201, code lost:
    
        if (r42 > 100.01d) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0205, code lost:
    
        if (r6 <= 100.01d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0208, code lost:
    
        r0 = ((((defpackage.la0.B(r40) & 255) << 16) | (-16777216)) | ((defpackage.la0.B(r42) & 255) << 8)) | (defpackage.la0.B(r6) & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fd, code lost:
    
        if (r40 > 100.01d) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long L(float f2, long j2) {
        int K;
        float f3;
        float f4;
        float f5;
        double[] dArr;
        double d2;
        int i2;
        int i3;
        int ceil;
        double floor;
        double d3;
        double[] dArr2;
        double d4 = f2;
        if ((d4 < 1.0E-4d) || (d4 > 99.9999d)) {
            return la0.c(la0.v(d4));
        }
        nf p2 = mo.p(la0.W(j2));
        float f6 = p2.a;
        float f7 = p2.b;
        d30 d30Var = d30.k;
        if (Intrinsics.a(d30Var, d30Var)) {
            double d5 = f6;
            double d6 = f7;
            if (d6 < 1.0E-4d || d4 < 1.0E-4d || d4 > 99.9999d) {
                K = la0.v(d4);
            } else {
                double d7 = d5 % 360.0d;
                if (d7 < 0.0d) {
                    d7 += 360.0d;
                }
                double radians = Math.toRadians(d7);
                double pow = d4 > 8.0d ? Math.pow((d4 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d4 / 903.2962962962963d) * 100.0d;
                double sqrt = Math.sqrt(pow) * 11.0d;
                double pow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, d30Var.a), 0.73d);
                double cos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * d30Var.f * d30Var.d;
                double sin = Math.sin(radians);
                double cos2 = Math.cos(radians);
                int i4 = 0;
                while (true) {
                    dArr = i;
                    if (i4 >= 5) {
                        d2 = pow;
                        i2 = 8;
                        i3 = 1;
                        break;
                    }
                    i2 = 8;
                    double d8 = sqrt / 100.0d;
                    double d9 = d6;
                    i3 = 1;
                    double pow3 = Math.pow(((d6 == 0.0d || sqrt == 0.0d) ? 0.0d : d6 / Math.sqrt(d8)) * pow2, 1.1111111111111112d);
                    d2 = pow;
                    double pow4 = (Math.pow(d8, (1.0d / d30Var.e) / d30Var.j) * d30Var.b) / d30Var.c;
                    double d10 = (((0.305d + pow4) * 23.0d) * pow3) / (((pow3 * 108.0d) * sin) + (((11.0d * pow3) * cos2) + (23.0d * cos)));
                    double d11 = d10 * cos2;
                    double d12 = d10 * sin;
                    double d13 = pow4 * 460.0d;
                    double d14 = ((288.0d * d12) + ((451.0d * d11) + d13)) / 1403.0d;
                    double d15 = ((d13 - (891.0d * d11)) - (261.0d * d12)) / 1403.0d;
                    double d16 = ((d13 - (d11 * 220.0d)) - (d12 * 6300.0d)) / 1403.0d;
                    double D = D(d14);
                    double D2 = D(d15);
                    double D3 = D(d16);
                    double[][] dArr3 = h;
                    double[] dArr4 = dArr3[0];
                    double d17 = (dArr4[2] * D3) + (dArr4[1] * D2) + (dArr4[0] * D);
                    double[] dArr5 = dArr3[1];
                    double d18 = (dArr5[2] * D3) + (dArr5[1] * D2) + (dArr5[0] * D);
                    double[] dArr6 = dArr3[2];
                    double d19 = (D3 * dArr6[2]) + (D2 * dArr6[1]) + (D * dArr6[0]);
                    if (d17 < 0.0d || d18 < 0.0d || d19 < 0.0d) {
                        break;
                    }
                    double d20 = (dArr[2] * d19) + (dArr[1] * d18) + (dArr[0] * d17);
                    if (d20 <= 0.0d) {
                        break;
                    }
                    if (i4 == 4) {
                        break;
                    }
                    double d21 = d20 - d2;
                    if (Math.abs(d21) < 0.002d) {
                        break;
                    }
                    sqrt -= (d21 * sqrt) / (2.0d * d20);
                    i4++;
                    d6 = d9;
                    pow = d2;
                }
                K = 0;
                if (K == 0) {
                    double[] dArr7 = new double[3];
                    double d22 = -1.0d;
                    dArr7[0] = -1.0d;
                    dArr7[i3] = -1.0d;
                    dArr7[2] = -1.0d;
                    double[] dArr8 = dArr7;
                    double d23 = 0.0d;
                    double d24 = 0.0d;
                    boolean z = false;
                    int i5 = 0;
                    int i6 = i3;
                    while (i5 < 12) {
                        double d25 = dArr[0];
                        double d26 = dArr[i3];
                        double d27 = dArr[2];
                        double d28 = i5 % 4 <= i3 ? 0.0d : 100.0d;
                        double d29 = i5 % 2 == 0 ? 0.0d : 100.0d;
                        if (i5 < 4) {
                            double d30 = ((d2 - (d26 * d28)) - (d27 * d29)) / d25;
                            dArr2 = E(d30) ? new double[]{d30, d28, d29} : new double[]{d22, d22, d22};
                            d3 = d22;
                        } else {
                            d3 = d22;
                            if (i5 < i2) {
                                double d31 = ((d2 - (d25 * d29)) - (d27 * d28)) / d26;
                                dArr2 = E(d31) ? new double[]{d29, d31, d28} : new double[]{d3, d3, d3};
                            } else {
                                double d32 = ((d2 - (d25 * d28)) - (d26 * d29)) / d27;
                                dArr2 = E(d32) ? new double[]{d28, d29, d32} : new double[]{d3, d3, d3};
                            }
                        }
                        if (dArr2[0] >= 0.0d) {
                            double B = B(dArr2);
                            if (!z) {
                                dArr7 = dArr2;
                                dArr8 = dArr7;
                                d23 = B;
                                d24 = d23;
                                z = true;
                            } else if (i6 != 0 || q(d23, B, d24)) {
                                double d33 = d23;
                                d23 = d33;
                                if (q(d33, radians, B)) {
                                    dArr8 = dArr2;
                                    i6 = 0;
                                    d24 = B;
                                } else {
                                    dArr7 = dArr2;
                                    i6 = 0;
                                    d23 = B;
                                }
                            }
                        }
                        i5++;
                        d22 = d3;
                        i2 = 8;
                        i3 = 1;
                    }
                    double[][] dArr9 = {dArr7, dArr8};
                    double[] dArr10 = dArr9[0];
                    double B2 = B(dArr10);
                    double[] dArr11 = dArr9[1];
                    for (int i7 = 0; i7 < 3; i7++) {
                        double d34 = dArr10[i7];
                        double d35 = dArr11[i7];
                        if (d34 != d35) {
                            if (d34 < d35) {
                                ceil = (int) Math.floor(R(d34) - 0.5d);
                                floor = Math.ceil(R(dArr11[i7]) - 0.5d);
                            } else {
                                ceil = (int) Math.ceil(R(d34) - 0.5d);
                                floor = Math.floor(R(dArr11[i7]) - 0.5d);
                            }
                            int i8 = (int) floor;
                            double d36 = B2;
                            for (int i9 = 0; i9 < 8 && Math.abs(i8 - ceil) > 1.0d; i9++) {
                                int floor2 = (int) Math.floor((ceil + i8) / 2.0d);
                                double d37 = j[floor2];
                                double d38 = dArr10[i7];
                                double d39 = dArr11[i7];
                                if (d39 != d38) {
                                    d39 = (d37 - d38) / (d39 - d38);
                                }
                                double d40 = dArr10[0];
                                double d41 = ((dArr11[0] - d40) * d39) + d40;
                                double d42 = dArr10[1];
                                double d43 = ((dArr11[1] - d42) * d39) + d42;
                                double d44 = dArr10[2];
                                double[] dArr12 = {d41, d43, ((dArr11[2] - d44) * d39) + d44};
                                double B3 = B(dArr12);
                                if (q(d36, radians, B3)) {
                                    i8 = floor2;
                                    dArr11 = dArr12;
                                } else {
                                    ceil = floor2;
                                    dArr10 = dArr12;
                                    d36 = B3;
                                }
                            }
                            B2 = d36;
                        }
                    }
                    K = ((la0.B((dArr10[0] + dArr11[0]) / 2.0d) & 255) << 16) | (-16777216) | ((la0.B((dArr10[1] + dArr11[1]) / 2.0d) & 255) << 8) | (la0.B((dArr10[2] + dArr11[2]) / 2.0d) & 255);
                }
            }
        } else if (f7 < 1.0d || Math.round(f2) <= 0.0d || Math.round(f2) >= 100.0d) {
            K = la0.K(f2);
        } else {
            float f8 = 0.0f;
            float min = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
            float f9 = 0.0f;
            float f10 = f7;
            nf nfVar = null;
            boolean z2 = true;
            while (true) {
                if (Math.abs(f9 - f7) >= 0.4000000059604645d) {
                    float f11 = 1000.0f;
                    float f12 = f8;
                    float f13 = f12;
                    float f14 = 1000.0f;
                    float f15 = 100.0f;
                    nf nfVar2 = null;
                    while (true) {
                        f3 = f7;
                        if (Math.abs(f13 - f15) <= 0.009999999776482582d) {
                            f4 = 2.0f;
                            break;
                        }
                        float f16 = ((f15 - f13) / 2.0f) + f13;
                        int c2 = mo.q(f16, f10, min).c(d30.k);
                        float M = la0.M((c2 >> 16) & 255);
                        f4 = 2.0f;
                        float M2 = la0.M((c2 >> 8) & 255);
                        float M3 = la0.M(c2 & 255);
                        double d45 = M;
                        double[] dArr13 = la0.l[1];
                        float f17 = ((float) ((M3 * dArr13[2]) + ((M2 * dArr13[1]) + (d45 * dArr13[0])))) / 100.0f;
                        float cbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                        float abs = (float) Math.abs(f2 - cbrt);
                        if (abs < 0.2f) {
                            nf p3 = mo.p(c2);
                            nf q2 = mo.q(p3.c, p3.b, min);
                            float f18 = p3.d - q2.d;
                            f5 = cbrt;
                            float f19 = p3.e - q2.e;
                            float f20 = p3.f - q2.f;
                            float pow5 = (float) (Math.pow(Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18)), 0.63d) * 1.41d);
                            if (pow5 <= 1.0f) {
                                f14 = pow5;
                                nfVar2 = p3;
                                f11 = abs;
                            }
                        } else {
                            f5 = cbrt;
                        }
                        if (f11 == f12 && f14 == f12) {
                            break;
                        }
                        if (f5 < f2) {
                            f7 = f3;
                            f13 = f16;
                        } else {
                            f7 = f3;
                            f15 = f16;
                        }
                    }
                    nf nfVar3 = nfVar2;
                    if (!z2) {
                        if (nfVar3 == null) {
                            f7 = f10;
                        } else {
                            nfVar = nfVar3;
                            f9 = f10;
                            f7 = f3;
                        }
                        f10 = ((f7 - f9) / f4) + f9;
                        f8 = f12;
                    } else {
                        if (nfVar3 != null) {
                            K = nfVar3.c(d30Var);
                            break;
                        }
                        f10 = ((f3 - f9) / f4) + f9;
                        f8 = f12;
                        f7 = f3;
                        z2 = false;
                    }
                } else {
                    K = nfVar == null ? la0.K(f2) : nfVar.c(d30Var);
                }
            }
        }
        return la0.c(K);
    }

    public static ComponentName M(Context context, Intent intent) {
        synchronized (o) {
            try {
                s(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    p.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(int i2, Object obj, c31 c31Var, x20 x20Var, int i3) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if ((i2 & 1) != 0 && !Intrinsics.a(c31Var.a, x20Var)) {
            x20 x20Var2 = x20.h;
            if (x20Var.compareTo(x20Var2) >= 0 && Intrinsics.b(c31Var.a.d, x20Var2.d) < 0) {
                z = true;
                if ((i2 & 2) != 0) {
                    c31Var.getClass();
                    if (i3 != 0) {
                        z2 = true;
                        if (z2 && !z) {
                            return obj;
                        }
                        int i4 = z ? x20Var.d : c31Var.a.d;
                        if (!z2) {
                            c31Var.getClass();
                        } else if (i3 == 1) {
                            z3 = true;
                        }
                        return Typeface.create((Typeface) obj, i4, z3);
                    }
                }
                z2 = false;
                if (z2) {
                }
                if (z) {
                }
                if (!z2) {
                }
                return Typeface.create((Typeface) obj, i4, z3);
            }
        }
        z = false;
        if ((i2 & 2) != 0) {
        }
        z2 = false;
        if (z2) {
        }
        if (z) {
        }
        if (!z2) {
        }
        return Typeface.create((Typeface) obj, i4, z3);
    }

    public static final BlendMode O(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 1 ? BlendMode.SRC : i2 == 2 ? BlendMode.DST : i2 == 3 ? BlendMode.SRC_OVER : i2 == 4 ? BlendMode.DST_OVER : i2 == 5 ? BlendMode.SRC_IN : i2 == 6 ? BlendMode.DST_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 8 ? BlendMode.DST_OUT : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 10 ? BlendMode.DST_ATOP : i2 == 11 ? BlendMode.XOR : i2 == 12 ? BlendMode.PLUS : i2 == 13 ? BlendMode.MODULATE : i2 == 14 ? BlendMode.SCREEN : i2 == 15 ? BlendMode.OVERLAY : i2 == 16 ? BlendMode.DARKEN : i2 == 17 ? BlendMode.LIGHTEN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 23 ? BlendMode.EXCLUSION : i2 == 24 ? BlendMode.MULTIPLY : i2 == 25 ? BlendMode.HUE : i2 == 26 ? BlendMode.SATURATION : i2 == 27 ? BlendMode.COLOR : i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Bitmap.Config P(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final String Q(dn dnVar) {
        Object j31Var;
        if (dnVar instanceof hs) {
            return ((hs) dnVar).toString();
        }
        try {
            i31 i31Var = k31.d;
            j31Var = dnVar + '@' + y(dnVar);
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        if (k31.a(j31Var) != null) {
            j31Var = dnVar.getClass().getName() + '@' + y(dnVar);
        }
        return (String) j31Var;
    }

    public static double R(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final int S(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(n01 n01Var, hk hkVar, hl hlVar, int i2) {
        gm1 gm1Var;
        boolean z;
        i11 r2;
        hlVar.Y(-149765515);
        da0 da0Var = hlVar.x;
        kw0 l2 = hlVar.l();
        hlVar.U(201, kl.b);
        Object L = hlVar.L();
        if (Intrinsics.a(L, bl.a)) {
            gm1Var = null;
        } else {
            L.getClass();
            gm1Var = (gm1) L;
        }
        m01 m01Var = n01Var.a;
        gm1 c2 = m01Var.c(n01Var, gm1Var);
        boolean equals = c2.equals(gm1Var);
        if (!equals) {
            hlVar.h0(c2);
        }
        if (hlVar.S) {
            if (n01Var.f || !l2.containsKey(m01Var)) {
                l2 = l2.g(m01Var, c2);
            }
            hlVar.J = true;
        } else {
            za1 za1Var = hlVar.G;
            Object b2 = za1Var.b(za1Var.b, za1Var.g);
            b2.getClass();
            kw0 kw0Var = (kw0) b2;
            if (!(hlVar.A() && equals) && (n01Var.f || !l2.containsKey(m01Var))) {
                l2 = l2.g(m01Var, c2);
            } else if ((equals && !hlVar.w) || !hlVar.w) {
                l2 = kw0Var;
            }
            if (hlVar.y || kw0Var != l2) {
                z = true;
                if (z && !hlVar.S) {
                    hlVar.J(l2);
                }
                da0Var.c(hlVar.w ? 1 : 0);
                hlVar.w = z;
                hlVar.K = l2;
                hlVar.S(202, kl.c, 0, l2);
                hkVar.b(hlVar, Integer.valueOf((i2 >> 3) & 14));
                hlVar.p(false);
                hlVar.p(false);
                hlVar.w = da0Var.b() != 0;
                hlVar.K = null;
                r2 = hlVar.r();
                if (r2 == null) {
                    r2.d = new ag(i2, 2, n01Var, hkVar);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            hlVar.J(l2);
        }
        da0Var.c(hlVar.w ? 1 : 0);
        hlVar.w = z;
        hlVar.K = l2;
        hlVar.S(202, kl.c, 0, l2);
        hkVar.b(hlVar, Integer.valueOf((i2 >> 3) & 14));
        hlVar.p(false);
        hlVar.p(false);
        hlVar.w = da0Var.b() != 0;
        hlVar.K = null;
        r2 = hlVar.r();
        if (r2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(n01[] n01VarArr, Function2 function2, hl hlVar, int i2) {
        kw0 g0;
        boolean z;
        i11 r2;
        hlVar.Y(415205898);
        da0 da0Var = hlVar.x;
        kw0 l2 = hlVar.l();
        hlVar.U(201, kl.b);
        if (hlVar.S) {
            g0 = hlVar.g0(l2, m90.O(n01VarArr, l2, kw0.k));
            hlVar.J = true;
        } else {
            za1 za1Var = hlVar.G;
            Object h2 = za1Var.h(za1Var.g, 0);
            h2.getClass();
            kw0 kw0Var = (kw0) h2;
            za1 za1Var2 = hlVar.G;
            Object h3 = za1Var2.h(za1Var2.g, 1);
            h3.getClass();
            kw0 kw0Var2 = (kw0) h3;
            kw0 O = m90.O(n01VarArr, l2, kw0Var2);
            if (hlVar.A() && !hlVar.y && kw0Var2.equals(O)) {
                hlVar.l = hlVar.G.s() + hlVar.l;
                g0 = kw0Var;
            } else {
                g0 = hlVar.g0(l2, O);
                if (hlVar.y || !Intrinsics.a(g0, kw0Var)) {
                    z = true;
                    if (z && !hlVar.S) {
                        hlVar.J(g0);
                    }
                    da0Var.c(hlVar.w ? 1 : 0);
                    hlVar.w = z;
                    hlVar.K = g0;
                    hlVar.S(202, kl.c, 0, g0);
                    function2.b(hlVar, Integer.valueOf((i2 >> 3) & 14));
                    hlVar.p(false);
                    hlVar.p(false);
                    hlVar.w = da0Var.b() != 0;
                    hlVar.K = null;
                    r2 = hlVar.r();
                    if (r2 == null) {
                        r2.d = new ag(i2, 3, n01VarArr, function2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            hlVar.J(g0);
        }
        da0Var.c(hlVar.w ? 1 : 0);
        hlVar.w = z;
        hlVar.K = g0;
        hlVar.S(202, kl.c, 0, g0);
        function2.b(hlVar, Integer.valueOf((i2 >> 3) & 14));
        hlVar.p(false);
        hlVar.p(false);
        hlVar.w = da0Var.b() != 0;
        hlVar.K = null;
        r2 = hlVar.r();
        if (r2 == null) {
        }
    }

    public static final long c(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void d(final float f2, hl hlVar, final int i2) {
        hl hlVar2;
        hlVar.Y(1226226635);
        int i3 = (hlVar.c(f2) ? 4 : 2) | i2;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            hlVar2 = hlVar;
            mo.c(t80.F(R.drawable.startup_no_internet_panel, hlVar, 0), null, xa1.e(xl0.a, f2), null, xm.b, 0.0f, hlVar2, 24632);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new Function2(f2, i2) { // from class: sd1
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(1);
                    op.d(this.d, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final float f2, float f3, hl hlVar, final int i2) {
        final float f4 = f3;
        hlVar.Y(1614411334);
        if (hlVar.O(i2 & 1, (i2 & 147) != 146)) {
            List asList = Arrays.asList(p4.c());
            asList.getClass();
            a20 a20Var = new a20(asList);
            long j2 = hi.c;
            long x = t80.x(18);
            long E = t80.E(1.16f * f2, 4294967296L);
            x20 x20Var = x20.i;
            xl0 xl0Var = xl0.a;
            eh1.b("ALLOW NOTIFICATIONS ABOUT BONUSES AND PROMOS", xa1.e(xl0Var, f4), j2, x, x20Var, a20Var, 0L, new tg1(3), E, 0, false, 0, 0, null, hlVar, 1597830, 0, 258856);
            ca0.b(hlVar, xa1.b(xl0Var, 10.0f));
            f4 = f3;
            eh1.b("STAY TUNED WITH BEST OFFERS FROM OUR CASINO", xa1.e(xl0Var, f4), j2, t80.x(14), x20Var, a20Var, 0L, new tg1(3), t80.E(12.4f, 4294967296L), 0, false, 0, 0, null, hlVar, 1597830, 0, 258856);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2(f2, f4, i2) { // from class: td1
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(439);
                    op.e(this.d, this.e, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final Function0 function0, final float f2, hl hlVar, final int i2) {
        hl hlVar2 = hlVar;
        hlVar2.Y(-951175145);
        int i3 = i2 | (hlVar2.h(function0) ? 32 : 16);
        if (hlVar2.O(i3 & 1, (i3 & 1171) != 1170)) {
            List asList = Arrays.asList(p4.c());
            asList.getClass();
            a20 a20Var = new a20(asList);
            xl0 xl0Var = xl0.a;
            am0 w = p4.w(mo.h(p4.n(xa1.e(xl0Var, f2), 5.9890304f), n41.a(0.08f * f2)), function0);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            am0 N = p4.N(hlVar2, w);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, d2, xk.e);
            ka0.C(hlVar2, l2, xk.d);
            ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar2, xk.g);
            ka0.C(hlVar2, N, xk.c);
            mo.c(t80.F(R.drawable.startup_button_blank, hlVar2, 0), null, xa1.b, null, xm.c, 0.0f, hlVar2, 25016);
            eh1.b("YES, I WANT BONUSES!", yr1.T(xl0Var, 0.06f * f2, 2), la0.d(4282521093L), t80.x(15), null, a20Var, 0L, new tg1(3), t80.E(f2 / 17.0f, 4294967296L), 0, false, 0, 0, null, hlVar, 24966, 0, 258920);
            hlVar2 = hlVar;
            hlVar2.p(true);
        } else {
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new Function2(f2, i2) { // from class: ud1
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(3463);
                    op.f(Function0.this, this.e, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(Function0 function0, hl hlVar, int i2) {
        hlVar.Y(-85158410);
        int i3 = i2 | (hlVar.h(function0) ? 4 : 2);
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            long d2 = la0.d(4293454056L);
            List asList = Arrays.asList(p4.c());
            asList.getClass();
            eh1.b("SKIP", mo.e(yr1.S(p4.w(mo.h(xl0.a, n41.a(999.0f)), function0), 18.0f, 7.0f), 0.96f), d2, t80.x(16), null, new a20(asList), 0L, new tg1(3), 0L, 0, false, 0, 0, null, hlVar, 24966, 0, 260968);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new jl(i2, 11, function0);
        }
    }

    public static final void h(int i2, am0 am0Var, hk hkVar, hl hlVar, int i3) {
        int i4;
        hlVar.Y(662937827);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.f(am0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.h(hkVar) ? 256 : 128;
        }
        if (hlVar.O(i4 & 1, (i4 & 147) != 146)) {
            vy vyVar = xa1.b;
            am0 c2 = am0Var.c(vyVar);
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, c2);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            mo.c(t80.F(i2, hlVar, i4 & 14), null, vyVar, null, xm.c, 0.0f, hlVar, 25016);
            hkVar.a(zd.a, hlVar, Integer.valueOf(((i4 >> 3) & 112) | 6));
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ei0(i2, am0Var, hkVar, i3, 1);
        }
    }

    public static final void i(am0 am0Var, hl hlVar, int i2) {
        hlVar.Y(-632846837);
        int i3 = i2 | 6;
        int i4 = 2;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            Configuration configuration = (Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a);
            boolean z = configuration.orientation == 2;
            int i5 = configuration.screenWidthDp;
            final float f2 = z ? ((bt) b11.e(new bt(i5 * 0.39f), new bt(300.0f), new bt(500.0f))).d : ((bt) b11.e(new bt(i5 * 0.72f), new bt(260.0f), new bt(370.0f))).d;
            int i6 = z ? R.drawable.startup_bg_no_internet_landscape : R.drawable.startup_bg_no_internet_portrait;
            hk J = m90.J(610437313, new s30() { // from class: pd1
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    zd zdVar = (zd) obj;
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    zdVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= hlVar2.f(zdVar) ? 4 : 2;
                    }
                    if (hlVar2.O(intValue & 1, (intValue & 19) != 18)) {
                        kd kdVar = j50.k;
                        am0 S = yr1.S(uq1.S(zd.a(kdVar)), 20.0f, 18.0f);
                        vk0 d2 = vd.d(kdVar, false);
                        int hashCode = Long.hashCode(hlVar2.T);
                        kw0 l2 = hlVar2.l();
                        am0 N = p4.N(hlVar2, S);
                        yk.b.getClass();
                        xl xlVar = xk.b;
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, d2, xk.e);
                        ka0.C(hlVar2, l2, xk.d);
                        ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
                        ka0.A(hlVar2, xk.g);
                        ka0.C(hlVar2, N, xk.c);
                        op.d(f2, hlVar2, 0);
                        hlVar2.p(true);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar);
            xl0 xl0Var = xl0.a;
            h(i6, xl0Var, J, hlVar, 432);
            am0Var = xl0Var;
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new di0(i2, i4, am0Var);
        }
    }

    public static final void j(final Function0 function0, final Function0 function02, am0 am0Var, hl hlVar, int i2) {
        am0 am0Var2;
        function0.getClass();
        function02.getClass();
        hlVar.Y(-1406911677);
        int i3 = (hlVar.h(function0) ? 4 : 2) | i2 | (hlVar.h(function02) ? 32 : 16) | 384;
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            final boolean z = ((Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            int i4 = z ? R.drawable.startup_bg_notification_landscape : R.drawable.startup_bg_notification_portrait;
            hk J = m90.J(-1673353607, new s30() { // from class: qd1
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    zd zdVar = (zd) obj;
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    f9 f9Var = yr1.c;
                    id idVar = j50.t;
                    kd kdVar = j50.n;
                    zdVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= hlVar2.f(zdVar) ? 4 : 2;
                    }
                    if (hlVar2.O(intValue & 1, (intValue & 19) != 18)) {
                        xl0 xl0Var = xl0.a;
                        boolean z2 = z;
                        Function0 function03 = function0;
                        Function0 function04 = function02;
                        if (z2) {
                            hlVar2.W(808154337);
                            am0 S = yr1.S(mo.J(xa1.f(uq1.S(zd.a(kdVar))), mo.C(hlVar2)), 34.0f, 16.0f);
                            yi a2 = wi.a(f9Var, idVar, hlVar2, 48);
                            int hashCode = Long.hashCode(hlVar2.T);
                            kw0 l2 = hlVar2.l();
                            am0 N = p4.N(hlVar2, S);
                            yk.b.getClass();
                            xl xlVar = xk.b;
                            hlVar2.a0();
                            if (hlVar2.S) {
                                hlVar2.k(xlVar);
                            } else {
                                hlVar2.k0();
                            }
                            ka0.C(hlVar2, a2, xk.e);
                            ka0.C(hlVar2, l2, xk.d);
                            ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
                            ka0.A(hlVar2, xk.g);
                            ka0.C(hlVar2, N, xk.c);
                            op.e(18.0f, 610.0f, hlVar2, 438);
                            ca0.b(hlVar2, xa1.b(xl0Var, 17.0f));
                            op.f(function03, 248.0f, hlVar2, 3462);
                            ca0.b(hlVar2, xa1.b(xl0Var, 9.0f));
                            op.g(function04, hlVar2, 0);
                            hlVar2.p(true);
                            hlVar2.p(false);
                        } else {
                            hlVar2.W(809024197);
                            am0 V = yr1.V(mo.J(uq1.S(zd.a(kdVar)), mo.C(hlVar2)), 22.0f, 22.0f, 2);
                            yi a3 = wi.a(f9Var, idVar, hlVar2, 48);
                            int hashCode2 = Long.hashCode(hlVar2.T);
                            kw0 l3 = hlVar2.l();
                            am0 N2 = p4.N(hlVar2, V);
                            yk.b.getClass();
                            xl xlVar2 = xk.b;
                            hlVar2.a0();
                            if (hlVar2.S) {
                                hlVar2.k(xlVar2);
                            } else {
                                hlVar2.k0();
                            }
                            ka0.C(hlVar2, a3, xk.e);
                            ka0.C(hlVar2, l3, xk.d);
                            ka0.u(hlVar2, Integer.valueOf(hashCode2), xk.f);
                            ka0.A(hlVar2, xk.g);
                            ka0.C(hlVar2, N2, xk.c);
                            op.e(17.0f, 302.0f, hlVar2, 438);
                            ca0.b(hlVar2, xa1.b(xl0Var, 21.0f));
                            op.f(function03, 236.0f, hlVar2, 3462);
                            ca0.b(hlVar2, xa1.b(xl0Var, 15.0f));
                            op.g(function04, hlVar2, 0);
                            hlVar2.p(true);
                            hlVar2.p(false);
                        }
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar);
            xl0 xl0Var = xl0.a;
            h(i4, xl0Var, J, hlVar, 432);
            am0Var2 = xl0Var;
        } else {
            hlVar.R();
            am0Var2 = am0Var;
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new h40(function0, function02, am0Var2, i2, 3);
        }
    }

    public static final void k(final boolean z, final am0 am0Var, hl hlVar, final int i2) {
        int i3;
        hlVar.Y(617477167);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (hlVar.O(i4 & 1, (i4 & 19) != 18)) {
            int i5 = i4 & 126;
            xl0 xl0Var = xl0.a;
            la0.j(z, xl0Var, hlVar, i5, 0);
            am0Var = xl0Var;
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: rd1
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(i2 | 1);
                    op.k(z, am0Var, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(eo0 eo0Var, zl0 zl0Var) {
        eo0 x = I(zl0Var).x();
        int i2 = x.g - 1;
        Object[] objArr = x.d;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                eo0Var.b((zl0) ((jd0) objArr[i2]).J.g);
                i2--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(ji1 ji1Var, zo zoVar, Throwable th, fn fnVar) {
        f00 f00Var;
        int i2;
        try {
            if (fnVar instanceof f00) {
                f00Var = (f00) fnVar;
                int i3 = f00Var.j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    f00Var.j = i3 - Integer.MIN_VALUE;
                    Object obj = f00Var.i;
                    Object obj2 = tn.d;
                    i2 = f00Var.j;
                    if (i2 != 0) {
                        ca0.v(obj);
                        f00Var.h = th;
                        f00Var.j = 1;
                        if (zoVar.a(ji1Var, th, f00Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = f00Var.h;
                        ca0.v(obj);
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                lw.a(th2, th);
            }
            throw th2;
        }
        f00Var = new f00(fnVar);
        Object obj3 = f00Var.i;
        Object obj22 = tn.d;
        i2 = f00Var.j;
    }

    public static final void n(pn1 pn1Var, jd0 jd0Var) {
        long M = ((v80) jd0Var.J.d).M(0L);
        int round = Math.round(Float.intBitsToFloat((int) (M >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (M & 4294967295L)));
        pn1Var.layout(round, round2, pn1Var.getMeasuredWidth() + round, pn1Var.getMeasuredHeight() + round2);
    }

    public static final zl0 o(eo0 eo0Var) {
        int i2;
        if (eo0Var == null || (i2 = eo0Var.g) == 0) {
            return null;
        }
        return (zl0) eo0Var.k(i2 - 1);
    }

    public static boolean q(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ad0 r(zl0 zl0Var) {
        if ((zl0Var.g & 2) != 0) {
            if (zl0Var instanceof ad0) {
                return (ad0) zl0Var;
            }
            if (zl0Var instanceof zq) {
                zl0 zl0Var2 = ((zq) zl0Var).t;
                while (zl0Var2 != 0) {
                    if (zl0Var2 instanceof ad0) {
                        return (ad0) zl0Var2;
                    }
                    zl0Var2 = (!(zl0Var2 instanceof zq) || (zl0Var2.g & 2) == 0) ? zl0Var2.j : ((zq) zl0Var2).t;
                }
            }
        }
        return null;
    }

    public static void s(Context context) {
        if (p == null) {
            ao1 ao1Var = new ao1(context);
            p = ao1Var;
            synchronized (ao1Var.a) {
                ao1Var.g = true;
            }
        }
    }

    public static double t(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final void u(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                lw.a(th, th2);
            }
        }
    }

    public static void v(Intent intent) {
        synchronized (o) {
            try {
                if (p != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    p.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final v7 w(v7 v7Var) {
        v7 c2 = v7Var.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(v7Var.a(i2), i2);
        }
        return c2;
    }

    public static final qi1 x(Context context) {
        yr1.K(context, android.R.color.system_neutral1_0);
        yr1.K(context, android.R.color.system_neutral1_10);
        L(98.0f, yr1.K(context, android.R.color.system_neutral1_600));
        L(96.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_50);
        L(94.0f, yr1.K(context, android.R.color.system_neutral1_600));
        L(92.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_100);
        L(87.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_200);
        yr1.K(context, android.R.color.system_neutral1_300);
        yr1.K(context, android.R.color.system_neutral1_400);
        yr1.K(context, android.R.color.system_neutral1_500);
        yr1.K(context, android.R.color.system_neutral1_600);
        yr1.K(context, android.R.color.system_neutral1_700);
        L(24.0f, yr1.K(context, android.R.color.system_neutral1_600));
        L(22.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_800);
        L(17.0f, yr1.K(context, android.R.color.system_neutral1_600));
        L(12.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_900);
        L(6.0f, yr1.K(context, android.R.color.system_neutral1_600));
        L(4.0f, yr1.K(context, android.R.color.system_neutral1_600));
        yr1.K(context, android.R.color.system_neutral1_1000);
        long K = yr1.K(context, android.R.color.system_neutral2_0);
        yr1.K(context, android.R.color.system_neutral2_10);
        long L = L(98.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long L2 = L(96.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K2 = yr1.K(context, android.R.color.system_neutral2_50);
        long L3 = L(94.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long L4 = L(92.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K3 = yr1.K(context, android.R.color.system_neutral2_100);
        long L5 = L(87.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K4 = yr1.K(context, android.R.color.system_neutral2_200);
        yr1.K(context, android.R.color.system_neutral2_300);
        long K5 = yr1.K(context, android.R.color.system_neutral2_400);
        long K6 = yr1.K(context, android.R.color.system_neutral2_500);
        yr1.K(context, android.R.color.system_neutral2_600);
        long K7 = yr1.K(context, android.R.color.system_neutral2_700);
        long L6 = L(24.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long L7 = L(22.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K8 = yr1.K(context, android.R.color.system_neutral2_800);
        long L8 = L(17.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long L9 = L(12.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K9 = yr1.K(context, android.R.color.system_neutral2_900);
        long L10 = L(6.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long L11 = L(4.0f, yr1.K(context, android.R.color.system_neutral2_600));
        long K10 = yr1.K(context, android.R.color.system_neutral2_1000);
        long K11 = yr1.K(context, android.R.color.system_accent1_0);
        yr1.K(context, android.R.color.system_accent1_10);
        yr1.K(context, android.R.color.system_accent1_50);
        long K12 = yr1.K(context, android.R.color.system_accent1_100);
        long K13 = yr1.K(context, android.R.color.system_accent1_200);
        yr1.K(context, android.R.color.system_accent1_300);
        yr1.K(context, android.R.color.system_accent1_400);
        yr1.K(context, android.R.color.system_accent1_500);
        long K14 = yr1.K(context, android.R.color.system_accent1_600);
        long K15 = yr1.K(context, android.R.color.system_accent1_700);
        long K16 = yr1.K(context, android.R.color.system_accent1_800);
        long K17 = yr1.K(context, android.R.color.system_accent1_900);
        yr1.K(context, android.R.color.system_accent1_1000);
        long K18 = yr1.K(context, android.R.color.system_accent2_0);
        yr1.K(context, android.R.color.system_accent2_10);
        yr1.K(context, android.R.color.system_accent2_50);
        long K19 = yr1.K(context, android.R.color.system_accent2_100);
        long K20 = yr1.K(context, android.R.color.system_accent2_200);
        yr1.K(context, android.R.color.system_accent2_300);
        yr1.K(context, android.R.color.system_accent2_400);
        yr1.K(context, android.R.color.system_accent2_500);
        long K21 = yr1.K(context, android.R.color.system_accent2_600);
        long K22 = yr1.K(context, android.R.color.system_accent2_700);
        long K23 = yr1.K(context, android.R.color.system_accent2_800);
        long K24 = yr1.K(context, android.R.color.system_accent2_900);
        yr1.K(context, android.R.color.system_accent2_1000);
        long K25 = yr1.K(context, android.R.color.system_accent3_0);
        yr1.K(context, android.R.color.system_accent3_10);
        yr1.K(context, android.R.color.system_accent3_50);
        long K26 = yr1.K(context, android.R.color.system_accent3_100);
        long K27 = yr1.K(context, android.R.color.system_accent3_200);
        yr1.K(context, android.R.color.system_accent3_300);
        yr1.K(context, android.R.color.system_accent3_400);
        yr1.K(context, android.R.color.system_accent3_500);
        long K28 = yr1.K(context, android.R.color.system_accent3_600);
        long K29 = yr1.K(context, android.R.color.system_accent3_700);
        long K30 = yr1.K(context, android.R.color.system_accent3_800);
        long K31 = yr1.K(context, android.R.color.system_accent3_900);
        yr1.K(context, android.R.color.system_accent3_1000);
        return new qi1(K, L, L2, K2, L3, L4, K3, L5, K4, K5, K6, K7, L6, L7, K8, L8, L9, K9, L10, L11, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31);
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final tf z(dn dnVar) {
        if (!(dnVar instanceof hs)) {
            return new tf(1, dnVar);
        }
        tf k2 = ((hs) dnVar).k();
        if (k2 != null) {
            if (!k2.F()) {
                k2 = null;
            }
            if (k2 != null) {
                return k2;
            }
        }
        return new tf(2, dnVar);
    }

    public abstract void p(float f2, long j2, xu1 xu1Var);
}
