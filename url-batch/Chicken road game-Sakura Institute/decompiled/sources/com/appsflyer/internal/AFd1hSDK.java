package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
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
                    String obj = sb.append(name).append(": ").append(str).toString();
                    Intrinsics.checkNotNullParameter(th, "");
                    Intrinsics.checkNotNullParameter(th, "");
                    String obj2 = new StringBuilder().append(th).append('\n').append(CollectionsKt.joinToString$default(AFd1dSDK.values(th), "\n", null, null, 0, null, AFd1dSDK.AnonymousClass5.AFInAppEventParameterName, 30, null)).toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFd1fSDK aFd1fSDK = new AFd1fSDK(obj, AFe1vSDK.AFKeystoreWrapper(obj2, "SHA-256"), ExceptionsKt.stackTraceToString(th), 0, 8, null);
                    String str3 = aFd1fSDK.AFKeystoreWrapper;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                        AFd1fSDK valueOf = AFd1fSDK.Companion.valueOf(FilesKt.readText$default(file2, null, 1, null));
                        if (valueOf != null) {
                            valueOf.AFInAppEventParameterName++;
                            aFd1fSDK = valueOf;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("label=");
                    String str4 = aFd1fSDK.values;
                    Intrinsics.checkNotNullParameter(str4, "");
                    byte[] bytes = str4.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    StringBuilder append = sb2.append(Base64.encodeToString(bytes, 2)).append("\nhashName=");
                    String str5 = aFd1fSDK.AFKeystoreWrapper;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    StringBuilder append2 = append.append(Base64.encodeToString(bytes2, 2)).append("\nstackTrace=");
                    String str6 = aFd1fSDK.AFInAppEventType;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    FilesKt.writeText$default(file2, append2.append(Base64.encodeToString(bytes3, 2)).append("\nc=").append(aFd1fSDK.AFInAppEventParameterName).toString(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, new StringBuilder("Could not cache exception\n ").append(e.getMessage()).toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001a, B:24:0x0073, B:26:0x0076, B:31:0x0050, B:33:0x0079, B:35:0x0083, B:11:0x001c, B:13:0x0022, B:15:0x0032, B:17:0x0046, B:19:0x0049, B:22:0x004c), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1gSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1fSDK> AFInAppEventParameterName() {
        List<AFd1fSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            File AFKeystoreWrapper = AFKeystoreWrapper();
            list = null;
            if (AFKeystoreWrapper != null && (listFiles = AFKeystoreWrapper.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : listFiles) {
                    try {
                        listFiles2 = file.listFiles();
                    } catch (Throwable th) {
                        AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, new StringBuilder("Could not get stored exceptions\n ").append(th.getMessage()).toString(), false, 4, null);
                    }
                    if (listFiles2 != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                        ArrayList arrayList3 = new ArrayList();
                        for (File file2 : listFiles2) {
                            AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            AFd1fSDK valueOf = AFd1fSDK.Companion.valueOf(FilesKt.readText$default(file2, null, 1, null));
                            if (valueOf != null) {
                                arrayList3.add(valueOf);
                            }
                        }
                        arrayList = arrayList3;
                        if (arrayList == null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                }
                list = CollectionsKt.flatten(arrayList2);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int values() {
        Iterator<T> it = AFInAppEventParameterName().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFd1fSDK) it.next()).AFInAppEventParameterName;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType() {
        return AFInAppEventType(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean AFInAppEventType(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File AFKeystoreWrapper = AFKeystoreWrapper();
            z = true;
            if (AFKeystoreWrapper != null) {
                if (strArr.length == 0) {
                    AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    z = FilesKt.deleteRecursively(AFKeystoreWrapper);
                } else {
                    AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, new StringBuilder("delete all exceptions except for: ").append(ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).toString(), false, 4, null);
                    File[] listFiles = AFKeystoreWrapper.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFInAppEventType(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            File AFKeystoreWrapper = AFKeystoreWrapper();
            if (AFKeystoreWrapper != null && (listFiles = AFKeystoreWrapper.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int valueOf = AFc1rSDK.valueOf(name);
                    if (i > valueOf || valueOf > i2) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (File file2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                }
                ArrayList arrayList4 = arrayList3;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
