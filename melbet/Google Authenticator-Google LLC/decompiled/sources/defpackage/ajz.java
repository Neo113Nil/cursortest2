package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public /* synthetic */ class ajz {
    public ajz() {
    }

    public static Object b(ajw ajwVar, krt krtVar, kqj kqjVar) {
        if (ajwVar.q() && ajwVar.s() && ajwVar.r()) {
            return krtVar.a(kqjVar);
        }
        if (kqjVar.bU().get(kyb.b) == null) {
            return krtVar.a(kqjVar);
        }
        ajy ajyVar = new ajy(krtVar, (kqj) null, 0);
        ake akeVar = (ake) kqjVar.bU().get(ake.b);
        kqk kqkVar = akeVar != null ? akeVar.a : null;
        return kqkVar != null ? ixg.f(kqkVar, ajyVar, kqjVar) : p(ajwVar, ajyVar, kqjVar);
    }

    public static String c(Collection collection) {
        return !collection.isEmpty() ? ksp.o(ixc.y(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static String d(Collection collection) {
        return ksp.o(ixc.y(collection, ",", null, null, null, 62)).concat(ksp.o(" }"));
    }

    public static String e(Collection collection) {
        return ksp.o(ixc.y(collection, ",", null, null, null, 62)).concat(ksp.o("},"));
    }

    public static String f(aly alyVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(alyVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(c(ixc.o(alyVar.b.values(), new alu(3))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(c(alyVar.c));
        sb.append("\n            |    indices = {");
        Set set = alyVar.d;
        sb.append(c(set != null ? ixc.o(set, new alu(4)) : kpk.a));
        sb.append("\n            |}\n        ");
        return ksp.v(sb.toString());
    }

    public static boolean g(String str, String str2) {
        if (ksp.b(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i3 = 0;
                        charAt = '(';
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    substring.getClass();
                    return ksp.b(ksp.j(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean h(aly alyVar, Object obj) {
        Set set;
        if (alyVar == obj) {
            return true;
        }
        if (!(obj instanceof aly)) {
            return false;
        }
        aly alyVar2 = (aly) obj;
        if (!ksp.b(alyVar.a, alyVar2.a) || !ksp.b(alyVar.b, alyVar2.b) || !ksp.b(alyVar.c, alyVar2.c)) {
            return false;
        }
        Set set2 = alyVar.d;
        if (set2 == null || (set = alyVar2.d) == null) {
            return true;
        }
        return ksp.b(set2, set);
    }

    public static void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static Bitmap j(byte[] bArr, int i, int i2, BitmapFactory.Options options, bij bijVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        if (Build.VERSION.SDK_INT != 34 || !bif.a(options) || !m(bijVar)) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        Bitmap.Config config5 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        a.T(config5 == config, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = null;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            if (decodeByteArray == null) {
                config4 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config4;
                return null;
            }
            try {
                Bitmap l = l(decodeByteArray);
                decodeByteArray.recycle();
                config3 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config3;
                return l;
            } catch (Throwable th) {
                th = th;
                bitmap = decodeByteArray;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                config2 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap k(InputStream inputStream, BitmapFactory.Options options, bij bijVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !bif.a(options) || !m(bijVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        Bitmap.Config config5 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        a.T(config5 == config, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream == null) {
                config4 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config4;
                return null;
            }
            try {
                Bitmap l = l(decodeStream);
                decodeStream.recycle();
                config3 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config3;
                return l;
            } catch (Throwable th) {
                th = th;
                bitmap = decodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                config2 = Bitmap.Config.HARDWARE;
                options.inPreferredConfig = config2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap l(Bitmap bitmap) {
        Gainmap gainmap;
        Bitmap.Config config;
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        float[] ratioMin;
        float[] ratioMax;
        float[] gamma;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                ColorMatrixColorFilter colorMatrixColorFilter = bid.a;
                gainmapContents2 = gainmap.getGainmapContents();
                if (gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8) {
                    a.T(gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8, "");
                    Bitmap createBitmap = Bitmap.createBitmap(gainmapContents2.getWidth(), gainmapContents2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(bid.a);
                    canvas.drawBitmap(gainmapContents2, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmap2 = new Gainmap(createBitmap);
                    ratioMin = gainmap.getRatioMin();
                    gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    ratioMax = gainmap.getRatioMax();
                    gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    gamma = gainmap.getGamma();
                    gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                    epsilonSdr = gainmap.getEpsilonSdr();
                    gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    epsilonHdr = gainmap.getEpsilonHdr();
                    gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                    gainmap2.setDisplayRatioForFullHdr(displayRatioForFullHdr);
                    minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                    gainmap2.setMinDisplayRatioForHdrTransition(minDisplayRatioForHdrTransition);
                    gainmap = gainmap2;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        config = Bitmap.Config.HARDWARE;
        return bitmap.copy(config, false);
    }

    public static boolean m(bij bijVar) {
        try {
            return bijVar.e();
        } catch (IOException unused) {
            return false;
        }
    }

    public static int n(int i, ByteBuffer byteBuffer) {
        if (q(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static short o(int i, ByteBuffer byteBuffer) {
        if (q(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static Object p(ajw ajwVar, krx krxVar, kqj kqjVar) {
        kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
        kuwVar.y();
        try {
            Executor executor = ajwVar.c;
            if (executor == null) {
                ksp.a("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new ajx((kuv) kuwVar, ajwVar, krxVar, 0));
        } catch (RejectedExecutionException e) {
            kuwVar.j(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object l = kuwVar.l();
        if (l == kqp.a) {
            kqjVar.getClass();
        }
        return l;
    }

    private static boolean q(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }

    public ajz(byte[] bArr) {
    }

    public void a(amj amjVar) {
    }
}
