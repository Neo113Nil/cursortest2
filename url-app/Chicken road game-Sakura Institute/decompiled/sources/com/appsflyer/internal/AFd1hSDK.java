package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import y2.C1331f;
import z2.C1400D;
import z2.C1403G;
import z2.C1405I;
import z2.C1439w;
import z2.C1442z;

/* loaded from: classes.dex */
public final class AFd1hSDK implements AFd1gSDK {
    private final AFd1lSDK AFInAppEventParameterName;

    public AFd1hSDK(AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.AFInAppEventParameterName = aFd1lSDK;
    }

    private final File AFKeystoreWrapper() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String AFInAppEventParameterName(Throwable th, String str) {
        String str2;
        File file;
        AFd1fSDK valueOf;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File AFKeystoreWrapper = AFKeystoreWrapper();
            str2 = null;
            if (AFKeystoreWrapper != null) {
                file = new File(AFKeystoreWrapper, "6.14.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    Intrinsics.checkNotNullParameter(th, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkNotNullParameter(th, "");
                    String name = th.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    sb.append(name);
                    sb.append(": ");
                    sb.append(str);
                    String obj = sb.toString();
                    Intrinsics.checkNotNullParameter(th, "");
                    Intrinsics.checkNotNullParameter(th, "");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(th);
                    sb2.append('\n');
                    sb2.append(C1403G.w(AFd1dSDK.values(th), "\n", null, null, AFd1dSDK.AnonymousClass5.AFInAppEventParameterName, 30));
                    String obj2 = sb2.toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFd1fSDK aFd1fSDK = new AFd1fSDK(obj, AFe1vSDK.AFKeystoreWrapper(obj2, "SHA-256"), C1331f.b(th), 0, 8, null);
                    String str3 = aFd1fSDK.values;
                    File file2 = new File(file, str3);
                    if (file2.exists() && (valueOf = AFd1fSDK.AFa1vSDK.valueOf(J2.k.a(file2))) != null) {
                        valueOf.valueOf++;
                        aFd1fSDK = valueOf;
                    }
                    StringBuilder sb3 = new StringBuilder("label=");
                    String str4 = aFd1fSDK.AFKeystoreWrapper;
                    Intrinsics.checkNotNullParameter(str4, "");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = str4.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    sb3.append(Base64.encodeToString(bytes, 2));
                    sb3.append("\nhashName=");
                    String str5 = aFd1fSDK.values;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    sb3.append(Base64.encodeToString(bytes2, 2));
                    sb3.append("\nstackTrace=");
                    String str6 = aFd1fSDK.AFInAppEventType;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    sb3.append(Base64.encodeToString(bytes3, 2));
                    sb3.append("\nc=");
                    sb3.append(aFd1fSDK.valueOf);
                    J2.k.b(file2, sb3.toString());
                    str2 = str3;
                } catch (Exception e4) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.EXCEPTION_MANAGER;
                    StringBuilder sb4 = new StringBuilder("Could not cache exception\n ");
                    sb4.append(e4.getMessage());
                    AFg1fSDK.v$default(aFLogger, aFg1aSDK, sb4.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType() {
        return AFInAppEventType(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int values() {
        Iterator<T> it = AFInAppEventParameterName().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((AFd1fSDK) it.next()).valueOf;
        }
        return i2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType(String... strArr) {
        boolean z4;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File AFKeystoreWrapper = AFKeystoreWrapper();
                z4 = true;
                if (AFKeystoreWrapper != null) {
                    if (strArr.length == 0) {
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z4 = J2.m.d(AFKeystoreWrapper);
                    } else {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK = AFg1aSDK.EXCEPTION_MANAGER;
                        StringBuilder sb = new StringBuilder("delete all exceptions except for: ");
                        sb.append(C1439w.x(strArr));
                        AFg1fSDK.v$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
                        File[] listFiles = AFKeystoreWrapper.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!C1439w.r(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(J2.m.d(file2)));
                            }
                            Set K3 = C1403G.K(arrayList2);
                            if (K3.isEmpty()) {
                                K3 = Collections.singleton(Boolean.TRUE);
                                Intrinsics.checkNotNullExpressionValue(K3, "singleton(...)");
                            }
                            Set set = K3;
                            if (set.size() != 1 || !((Boolean) C1403G.p(set)).booleanValue()) {
                                z4 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFInAppEventType(int i2, int i4) {
        File[] listFiles;
        synchronized (this) {
            try {
                File AFKeystoreWrapper = AFKeystoreWrapper();
                if (AFKeystoreWrapper != null && (listFiles = AFKeystoreWrapper.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int valueOf = AFc1rSDK.valueOf(name);
                        if (i2 > valueOf || valueOf > i4) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(J2.m.d(file2)));
                    }
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0069, B:25:0x006f, B:30:0x004a, B:32:0x0072, B:33:0x0080, B:35:0x0086, B:38:0x0092, B:11:0x001a, B:13:0x0020, B:15:0x002e, B:17:0x0041), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.appsflyer.internal.AFd1fSDK>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [z2.I] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // com.appsflyer.internal.AFd1gSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1fSDK> AFInAppEventParameterName() {
        ?? r12;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File AFKeystoreWrapper = AFKeystoreWrapper();
                r12 = 0;
                r12 = 0;
                if (AFKeystoreWrapper != null && (listFiles = AFKeystoreWrapper.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1aSDK aFg1aSDK = AFg1aSDK.EXCEPTION_MANAGER;
                            StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                            sb.append(th.getMessage());
                            AFg1fSDK.v$default(aFLogger, aFg1aSDK, sb.toString(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFd1fSDK.AFa1vSDK aFa1vSDK = AFd1fSDK.AFa1vSDK;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFd1fSDK valueOf = AFd1fSDK.AFa1vSDK.valueOf(J2.k.a(file2));
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                            if (arrayList == null) {
                                arrayList2.add(arrayList);
                            }
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                    r12 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C1400D.j((Iterable) it.next(), r12);
                    }
                }
                if (r12 == 0) {
                    r12 = C1405I.f11931d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r12;
    }
}
