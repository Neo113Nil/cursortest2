package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjq implements htq {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gjq(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142 A[Catch: IOException -> 0x01fa, TRY_ENTER, TryCatch #0 {IOException -> 0x01fa, blocks: (B:33:0x00cb, B:35:0x00df, B:37:0x00e3, B:39:0x0103, B:40:0x0110, B:42:0x011d, B:44:0x0123, B:70:0x0133, B:49:0x0142, B:50:0x015d, B:52:0x0163, B:54:0x0180, B:56:0x0192, B:57:0x01ad, B:59:0x01b3, B:61:0x01c2, B:65:0x01e6, B:66:0x01e9, B:71:0x01ea, B:72:0x01f1, B:73:0x0108, B:74:0x01f2, B:75:0x01f9, B:68:0x012c, B:47:0x0138), top: B:32:0x00cb, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192 A[Catch: IOException -> 0x01fa, TryCatch #0 {IOException -> 0x01fa, blocks: (B:33:0x00cb, B:35:0x00df, B:37:0x00e3, B:39:0x0103, B:40:0x0110, B:42:0x011d, B:44:0x0123, B:70:0x0133, B:49:0x0142, B:50:0x015d, B:52:0x0163, B:54:0x0180, B:56:0x0192, B:57:0x01ad, B:59:0x01b3, B:61:0x01c2, B:65:0x01e6, B:66:0x01e9, B:71:0x01ea, B:72:0x01f1, B:73:0x0108, B:74:0x01f2, B:75:0x01f9, B:68:0x012c, B:47:0x0138), top: B:32:0x00cb, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hvi a() {
        String str;
        gjw gjwVar;
        File a;
        int i = this.c;
        int i2 = 2;
        if (i == 0) {
            boolean z = this.a;
            Object obj = this.b;
            htq b = gvx.b(new gjq(obj, z, i2));
            gjw gjwVar2 = (gjw) obj;
            return djl.b(gjwVar2.a, b, gjwVar2.c);
        }
        Object obj2 = this.b;
        ghl ghlVar = null;
        int i3 = 1;
        if (i != 1) {
            boolean z2 = this.a;
            if (z2 && (a = (gjwVar = (gjw) obj2).a()) != null && a.exists()) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(a, "r");
                    try {
                        int readInt = randomAccessFile.readInt();
                        int i4 = ((gjw) obj2).d;
                        ixf.j(randomAccessFile, null);
                        if (readInt == i4) {
                            return gjwVar.b("file_completion_present");
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    ((hkf) ((hkf) gjwVar.h.g()).h(e).i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedFileBacked", 522, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Failed to read package version from file");
                }
            }
            gjw gjwVar3 = (gjw) obj2;
            int i5 = gjwVar3.d;
            bst c = gjwVar3.c();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
            arrayList.add(Long.valueOf(i5));
            gwt gwtVar = new gwt(c.s(exf.q(sb, arrayList)));
            gjp gjpVar = new gjp(new gjo(0), 0);
            ExecutorService executorService = gjwVar3.b;
            return hoq.au(gwtVar.a(gjpVar, executorService).b().d(Exception.class, new gia(new dwd(obj2, 19), 12), huf.a), new fvr(new gjr(gjwVar3, z2, i3), 17), executorService);
        }
        try {
            Object b2 = ((gjl) obj2).l.b();
            b2.getClass();
            PackageInfo packageInfo = (PackageInfo) b2;
            int i6 = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
                throw new IllegalStateException("PackageInfo was invalid.");
            }
            File file = new File(new File(str, "files"), "tiktok");
            file.mkdirs();
            File file2 = new File(file, ((fwm) ((gjl) obj2).c).l() ? hnu.bn(null) : hnu.bn(eos.I()));
            boolean createNewFile = file2.createNewFile();
            if (!file2.exists() || !file2.isFile()) {
                throw new IOException("Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup.");
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            if (!createNewFile) {
                try {
                    if (i6 == gjl.b(randomAccessFile2)) {
                        if (ghlVar != null) {
                            Set b3 = ((jsd) ((gjl) obj2).g).b();
                            b3.getClass();
                            ArrayList arrayList2 = new ArrayList(ixc.w(b3));
                            Iterator it = b3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(hoq.as(gvx.b(new gib((gka) it.next(), 4)), ((gjl) obj2).h));
                            }
                            return hoq.aU(arrayList2).s(new bws(8), huf.a);
                        }
                        Set b4 = ((jsd) ((gjl) obj2).g).b();
                        b4.getClass();
                        ArrayList arrayList3 = new ArrayList(ixc.w(b4));
                        Iterator it2 = b4.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new gjv((gka) it2.next(), 1));
                        }
                        cap capVar = new cap(obj2, hnu.ae(arrayList3), ghlVar, 13);
                        gaj gajVar = (gaj) ((gjl) obj2).i.b();
                        hvi as = hoq.as(capVar, ((gjl) obj2).h);
                        gajVar.e(as);
                        return as;
                    }
                } finally {
                    randomAccessFile2.close();
                }
            }
            hnu.bo(randomAccessFile2, -1);
            ghlVar = new ghl(randomAccessFile2, obj2, i6, i2);
            if (ghlVar != null) {
            }
        } catch (IOException e2) {
            if (this.a) {
                Context context = ((gjl) obj2).a;
                if (!djl.i(context)) {
                    Log.w("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, device was locked. Will reschedule.", e2);
                }
                djl.d(context, new gfm(obj2, 7));
            } else {
                Log.e("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, will try again next startup: ", e2);
            }
            return hve.a;
        }
    }
}
