package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class drv implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ drv(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = 16;
        byte[] bArr = null;
        char c = 1;
        switch (this.a) {
            case 0:
                dsh dshVar = (dsh) obj;
                dshVar.getClass();
                return new cx(dshVar, 6, bArr);
            case 1:
                return Boolean.valueOf(SystemClock.elapsedRealtime() - ((Long) obj).longValue() < 5000);
            case 2:
                Context context = (Context) obj;
                String str = ebt.a;
                return ebt.b(context, ecy.b(context).a(ecw.DARK_YELLOW));
            case 3:
                return ((dqw) obj).b;
            case 4:
                return ((egc) obj).a();
            case 5:
                return ((egc) obj).b();
            case 6:
                return ((gzp) obj).e();
            case 7:
                dok dokVar = (dok) obj;
                gwu g = gwu.g(dokVar.c());
                ccb ccbVar = new ccb(dokVar, i);
                huf hufVar = huf.a;
                return egh.g(gwu.g(g.h(ccbVar, hufVar)).e(Exception.class, new bwu(10), hufVar).h(new cvr(15), hufVar));
            case 8:
                dok dokVar2 = (dok) obj;
                gwu g2 = gwu.g(dokVar2.c());
                doj dojVar = new doj(dokVar2, c == true ? 1 : 0);
                huf hufVar2 = huf.a;
                return gwu.g(g2.i(dojVar, hufVar2).h(new cvr(14), hufVar2)).e(Exception.class, new bwu(12), hufVar2).h(new cvr(i), hufVar2);
            case 9:
                return null;
            case 10:
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return decodeStream;
            case 11:
                return ((egc) obj).a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((egc) obj).b();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i2 = egy.b;
                ParcelFileDescriptor c2 = ((cyl) obj).c();
                if (c2 == null) {
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c2);
                    try {
                        Bitmap decodeStream2 = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return decodeStream2;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i3 = egy.b;
                cpe c3 = ((cyk) obj).c();
                ArrayList arrayList = new ArrayList();
                ksf ksfVar = new ksf(c3, 1);
                while (ksfVar.hasNext()) {
                    cpf cpfVar = (cpf) ksfVar.next();
                    if (!cpfVar.a.c()) {
                        arrayList.add(egz.a.a(cpfVar));
                    }
                }
                return hel.o(arrayList);
            case 15:
                return gzp.g(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 16:
                lhg lhgVar = (lhg) obj;
                jkj k = lgx.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                lgx lgxVar = (lgx) k.b;
                lhgVar.getClass();
                lgxVar.d = lhgVar;
                lgxVar.c = 3;
                jkj k2 = lha.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                lha lhaVar = (lha) k2.b;
                lhaVar.b |= 2;
                lhaVar.e = true;
                lha lhaVar2 = (lha) k2.q();
                if (!k.b.M()) {
                    k.t();
                }
                lgx lgxVar2 = (lgx) k.b;
                lhaVar2.getClass();
                lgxVar2.e = lhaVar2;
                lgxVar2.b |= 1;
                return (lgx) k.q();
            case 17:
                lfs lfsVar = (lfs) obj;
                jkj k3 = lgx.a.k();
                if (!k3.b.M()) {
                    k3.t();
                }
                lgx lgxVar3 = (lgx) k3.b;
                lfsVar.getClass();
                lgxVar3.d = lfsVar;
                lgxVar3.c = 1;
                jkj k4 = lha.a.k();
                if (!k4.b.M()) {
                    k4.t();
                }
                lha lhaVar3 = (lha) k4.b;
                lhaVar3.b |= 2;
                lhaVar3.e = true;
                lha lhaVar4 = (lha) k4.q();
                if (!k3.b.M()) {
                    k3.t();
                }
                lgx lgxVar4 = (lgx) k3.b;
                lhaVar4.getClass();
                lgxVar4.e = lhaVar4;
                lgxVar4.b |= 1;
                return (lgx) k3.q();
            case 18:
                return hel.o((List) obj);
            case 19:
                ((hkf) ((hkf) ((hkf) eiu.a.g()).h((RuntimeException) obj)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 412, "MemoryMetricServiceImpl.java")).s("Metric extension provider failed.");
                return null;
            default:
                return Integer.valueOf(Integer.parseInt((String) obj));
        }
    }
}
