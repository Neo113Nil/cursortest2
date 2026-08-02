package defpackage;

import android.accounts.Account;
import android.net.Uri;
import j$.time.Instant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bsp implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bsp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v27, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        File file;
        File file2;
        int i = 0;
        int i2 = 1;
        switch (this.c) {
            case 0:
                List list = (List) hnu.aR(this.a);
                List list2 = (List) hnu.aR(this.b);
                heg hegVar = new heg(4);
                while (i < list.size()) {
                    if (((Boolean) list2.get(i)).booleanValue()) {
                        hegVar.h((fuf) list.get(i));
                    }
                    i++;
                }
                return hegVar.g();
            case 1:
                String str = (String) hnu.aR(this.a);
                hel helVar = (hel) hnu.aR(this.b);
                heg hegVar2 = new heg(4);
                hegVar2.h((bqz) hdb.c(helVar).b(new bqg(str, i2)).d(new bqh(i2)).g());
                hegVar2.j(hdb.c(helVar).b(new bqg(str, i)).d(new bqh(i)));
                return hegVar2.g();
            case 2:
                return new btg(((Boolean) hnu.aR(this.a)).booleanValue(), hel.o((Collection) hnu.aR(this.b)));
            case 3:
                hel helVar2 = (hel) hnu.aR(this.a);
                try {
                    return new bwq(true, helVar2);
                } catch (ExecutionException e) {
                    if ((e.getCause() instanceof kbt) || (e.getCause() instanceof kbr)) {
                        return new bwq(false, helVar2);
                    }
                    throw e;
                }
            case 4:
                hel helVar3 = (hel) hnu.aR(this.a);
                try {
                    return new bwp(true, helVar3);
                } catch (ExecutionException unused) {
                    return new bwp(false, helVar3);
                }
            case 5:
                hel helVar4 = (hel) hnu.aR(this.a);
                List list3 = (List) hnu.aR(this.b);
                heg hegVar3 = new heg(4);
                while (i < helVar4.size()) {
                    hegVar3.h(((car) helVar4.get(i)).d((List) list3.get(i), Long.valueOf(Instant.now().toEpochMilli())));
                    i++;
                }
                return hegVar3.g();
            case 6:
                hel helVar5 = (hel) hnu.aR(this.a);
                hel helVar6 = (hel) hnu.aR(this.b);
                HashMap hashMap = new HashMap();
                int size = helVar5.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bpc bpcVar = (bpc) helVar5.get(i3);
                    cmq cmqVar = new cmq();
                    cmqVar.a = bpcVar;
                    hashMap.put(bpcVar.g, cmqVar);
                }
                int size2 = helVar6.size();
                while (i < size2) {
                    bpc bpcVar2 = (bpc) helVar6.get(i);
                    String str2 = bpcVar2.g;
                    cmq cmqVar2 = (cmq) hashMap.get(str2);
                    if (cmqVar2 == null) {
                        cmqVar2 = new cmq();
                    }
                    cmqVar2.b = bpcVar2;
                    hashMap.put(str2, cmqVar2);
                    i++;
                }
                return hashMap;
            case 7:
                return (Void) dih.x(((ddw) ((haf) ((cxs) this.b).a).a).d((Uri) this.a));
            case 8:
                return ((die) this.a).c(this.b);
            case 9:
                ?? r0 = this.b;
                ArrayList arrayList = new ArrayList(r0.size());
                for (dkl dklVar : r0) {
                    arrayList.add(new dkm(dklVar, ((dkj) this.a).b.a(dklVar)));
                }
                return arrayList;
            case 10:
                Object obj = this.b;
                Object obj2 = this.a;
                try {
                    file2 = new File((String) ((ewc) obj2).b.bB());
                    hqc.a(file2);
                    file = File.createTempFile("snapshot", ".pb", file2.getParentFile());
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    file = null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        ((jja) obj).e(fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (SecurityException e4) {
                            e.addSuppressed(e4);
                        }
                    }
                    ewc ewcVar = (ewc) obj2;
                    eos.N(Level.WARNING, ewcVar.a.d(), e, "Failed to update snapshot for %s flags may be stale.", ewcVar.c);
                    return null;
                } catch (RuntimeException e5) {
                    e = e5;
                    if (file != null) {
                    }
                    ewc ewcVar2 = (ewc) obj2;
                    eos.N(Level.WARNING, ewcVar2.a.d(), e, "Failed to update snapshot for %s flags may be stale.", ewcVar2.c);
                    return null;
                }
                if (file.renameTo(file2)) {
                    return null;
                }
                throw new IOException(String.valueOf(file) + " could not be renamed to " + file2.toString());
            case 11:
                this.b.close();
                return hnu.aR(this.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fdf fdfVar = (fdf) this.a;
                fdfVar.d.o();
                try {
                    return this.b.call();
                } finally {
                    fdfVar.d.n();
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                fuz fuzVar = (fuz) hnu.aR(this.a);
                return (fuzVar.b & 1) != 0 ? gdm.a((List) hnu.aR(this.b), Instant.ofEpochMilli(fuzVar.c)) : gdm.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object aR = hnu.aR(this.a);
                aR.getClass();
                Account[] accountArr = (Account[]) aR;
                HashSet<String> j = hnu.j(accountArr.length);
                for (Account account : accountArr) {
                    if (!ksp.b("Android Enterprise", account.name)) {
                        String str3 = account.name;
                        str3.getClass();
                        j.add(str3);
                    }
                }
                Object aR2 = hnu.aR(this.b);
                aR2.getClass();
                Account[] accountArr2 = (Account[]) aR2;
                int length = accountArr2.length;
                HashSet j2 = hnu.j(length);
                while (i < length) {
                    String str4 = accountArr2[i].name;
                    str4.getClass();
                    j2.add(str4);
                    i++;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str5 : j) {
                    linkedHashMap.put(str5, Boolean.valueOf(j2.contains(str5)));
                }
                return linkedHashMap;
            case 15:
                Iterator it = this.b.iterator();
                while (true) {
                    Object obj3 = this.a;
                    if (!it.hasNext()) {
                        return ((heg) obj3).g();
                    }
                    ful fulVar = (ful) hnu.aR((hvi) it.next());
                    if (fulVar != null) {
                        ((heg) obj3).h(fulVar);
                    }
                }
            case 16:
                fxl fxlVar = (fxl) this.a;
                File file3 = new File(fxlVar.b.b((gpk) this.b), fxl.a(fxlVar.c));
                file3.mkdirs();
                return file3;
            case 17:
                ?? r02 = this.b;
                ?? r8 = this.a;
                hkh hkhVar = fxo.a;
                hnu.aR(r8);
                hnu.aR(r02);
                return null;
            case 18:
                Object obj4 = ((cbp) this.a).a;
                gpm gpmVar = (gpm) this.b;
                return ((fxl) obj4).b(gpmVar.c, String.valueOf(gpmVar.a).concat(".pb")).g();
            case 19:
                this.b.run();
                return this.a;
            default:
                ThreadLocal threadLocal = ((gdh) this.a).a;
                Object call = this.b.call();
                Throwable th3 = (Throwable) threadLocal.get();
                threadLocal.remove();
                if (th3 == null) {
                    return call;
                }
                throw th3;
        }
    }

    public /* synthetic */ bsp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
