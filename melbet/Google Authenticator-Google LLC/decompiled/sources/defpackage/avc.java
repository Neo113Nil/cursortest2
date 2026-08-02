package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.authenticator2.R;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class avc implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public avc(ahc ahcVar, int i) {
        this.b = i;
        this.a = ahcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Type inference failed for: r0v60, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v101 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v42, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v69, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v85, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v91, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        InputStream inputStream;
        jnx jnxVar;
        Object obj;
        int i = 4;
        boolean z = false;
        int i2 = 0;
        Object obj2 = null;
        InputStream inputStream2 = null;
        dke dkeVar = null;
        switch (this.b) {
            case 0:
                axt axtVar = ((avi) this.a).a;
                if (axtVar.c != atb.a) {
                    String str = avk.a;
                    asq.a();
                    return true;
                }
                if ((!axtVar.d() && !axtVar.c()) || System.currentTimeMillis() >= axtVar.a()) {
                    return false;
                }
                asq.a();
                String str2 = avk.a;
                return true;
            case 1:
                Object obj3 = this.a;
                ((ahc) obj3).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    obj2 = ((ahc) obj3).a();
                    Binder.flushPendingCommands();
                    return obj2;
                } finally {
                }
            case 2:
                avi aviVar = (avi) this.a;
                String str3 = aviVar.c;
                axu axuVar = aviVar.f;
                if (axuVar.b(str3) == atb.a) {
                    axuVar.B(atb.b, str3);
                    axuVar.w(str3);
                    axuVar.s(str3, -256);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((brn) this.a).a;
                Long a = workDatabase.x().a("next_job_scheduler_id");
                int longValue = a != null ? (int) a.longValue() : 0;
                afg.h(workDatabase, longValue == Integer.MAX_VALUE ? 0 : longValue + 1);
                if (longValue < 0) {
                    afg.h(workDatabase, 1);
                } else {
                    i2 = longValue;
                }
                return Integer.valueOf(i2);
            case 4:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    dke dkeVar2 = (dke) hnu.aR((hvi) it.next());
                    if (dkeVar2 != null) {
                        hoq.I(dkeVar == null, "More than one auth provider provided result.");
                        dkeVar = dkeVar2;
                    }
                }
                if (dkeVar != null) {
                    return dkeVar;
                }
                throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
            case 5:
                Context context = ((efy) this.a).b;
                String str4 = chi.a;
                oy.at(context);
                cho.e(context, 11400000);
                return (Boolean) cho.b(context, cho.d, new chm(context.getApplicationInfo().packageName, context), 0L, null);
            case 6:
                Object obj4 = this.a;
                String[] strArr = efy.a;
                Context context2 = ((efy) obj4).b;
                String str5 = chi.a;
                return Arrays.asList(cho.i(context2, strArr));
            case 7:
                Context context3 = ((efy) this.a).b;
                String str6 = chi.a;
                return Arrays.asList(cho.h(context3));
            case 8:
                return (egc) this.a.bB();
            case 9:
                ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 114, "DeferrableExecutor.java")).s("DeferrableExecutor unblocked after max task delay");
                ((eij) this.a).g();
                return null;
            case 10:
                ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).s("DeferrableExecutor unblocked after onResume");
                ((eij) this.a).g();
                return null;
            case 11:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                synchronized (((fct) obj5).b.d) {
                    ((fct) obj5).a = null;
                }
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ?? r10 = this.a;
                try {
                    try {
                        inputStream = ((fen) r10).b.getResources().openRawResource(R.raw.monogram_data_pb);
                        try {
                            jnx jnxVar2 = jnx.a;
                            jnxVar = (jnx) jkp.D(jnx.class).d(inputStream);
                            r10 = inputStream;
                        } catch (IOException e) {
                            e = e;
                            ((hkf) ((hkf) ((hkf) fen.a.f()).h(e)).i("com/google/android/libraries/toolkit/monogram/impl/MonogramData", "createPrefixToMonogramMap", 98, "MonogramData.java")).s("Error reading config, using defaults.");
                            jnxVar = jnx.a;
                            r10 = inputStream;
                            hqa.a(r10);
                            Map unmodifiableMap = DesugarCollections.unmodifiableMap(jnxVar.b);
                            qy qyVar = new qy(unmodifiableMap.size());
                            while (r10.hasNext()) {
                            }
                            return qyVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = r10;
                        hqa.a(inputStream2);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    hqa.a(inputStream2);
                    throw th;
                }
                hqa.a(r10);
                Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(jnxVar.b);
                qy qyVar2 = new qy(unmodifiableMap2.size());
                for (Map.Entry entry : unmodifiableMap2.entrySet()) {
                    String str7 = (String) entry.getKey();
                    String str8 = ((String) entry.getValue()).isEmpty() ? str7 : (String) entry.getValue();
                    fem femVar = null;
                    for (char c : str7.toCharArray()) {
                        if (femVar == null) {
                            obj = qyVar2;
                        } else {
                            if (femVar.b == null) {
                                femVar.b = new qy(0);
                            }
                            obj = femVar.b;
                        }
                        Character valueOf = Character.valueOf(c);
                        qy qyVar3 = (qy) obj;
                        fem femVar2 = (fem) qyVar3.get(valueOf);
                        if (femVar2 == null) {
                            femVar2 = new fem();
                            qyVar3.put(valueOf, femVar2);
                        }
                        femVar = femVar2;
                    }
                    femVar.a = str8;
                }
                return qyVar2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i3 = hel.d;
                heg hegVar = new heg(4);
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    hegVar.j((Iterable) hnu.aR((hvi) it2.next()));
                }
                return hegVar.g();
            case 15:
                ikm ikmVar = ((fwv) this.a).c;
                SharedPreferences.Editor edit = ikmVar.a.edit();
                ?? r102 = ikmVar.b;
                int size = r102.size();
                for (int i4 = 0; i4 < size; i4++) {
                    edit.remove((String) r102.get(i4));
                }
                ((ArrayList) r102).clear();
                return Boolean.valueOf(edit.commit());
            case 16:
                File d = ((iyi) ((ikm) this.a).a).d();
                File parentFile = d.getParentFile();
                if (parentFile.mkdirs() || (parentFile.exists() && parentFile.isDirectory())) {
                    return d;
                }
                throw new FileNotFoundException("Cannot create parent directory.");
            case 17:
                Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    hnu.aR((hvi) it3.next());
                }
                return null;
            case 18:
                Object obj6 = this.a;
                File file = (File) obj6;
                if (file.exists()) {
                    final kee keeVar = new kee(hqc.a);
                    final hfm n = hfm.n(new hjn(obj6));
                    hjr it4 = n.iterator();
                    while (it4.hasNext()) {
                        hoq.r(it4.next());
                    }
                    boolean z2 = true;
                    for (File file2 : new Iterable() { // from class: hos
                        @Override // java.lang.Iterable
                        public final Iterator iterator() {
                            hjr it5 = n.iterator();
                            ArrayDeque arrayDeque = new ArrayDeque();
                            ArrayDeque arrayDeque2 = new ArrayDeque();
                            arrayDeque2.add(it5);
                            return new hot(arrayDeque2, arrayDeque);
                        }
                    }) {
                        if (!file.equals(file2) && file2.exists()) {
                            file2.setWritable(true, true);
                            z2 &= file2.delete();
                        }
                    }
                    if (!z2 || !file.setWritable(false, false) || file.list().length != 0) {
                        file.setWritable(true, true);
                        throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(obj6))));
                    }
                }
                return null;
            case 19:
                return hnu.aR(this.a);
            default:
                iwq iwqVar = (iwq) this.a;
                return hnu.x(new ifn((PackageManager) iwqVar.c).c(((Context) iwqVar.b).getPackageName()), new gia(new ghz(i), 6));
        }
    }

    public /* synthetic */ avc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
