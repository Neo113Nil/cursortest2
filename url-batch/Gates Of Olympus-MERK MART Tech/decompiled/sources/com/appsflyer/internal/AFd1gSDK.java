package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1lSDK;
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
public final class AFd1gSDK implements AFd1jSDK {
    private final AFd1nSDK valueOf;

    public AFd1gSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.valueOf = aFd1nSDK;
    }

    private final File valueOf() {
        Context context = this.valueOf.AFKeystoreWrapper;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final String AFInAppEventParameterName(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File valueOf = valueOf();
            str2 = null;
            if (valueOf != null) {
                file = new File(valueOf, "6.12.6");
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
                    String obj2 = new StringBuilder().append(th).append('\n').append(CollectionsKt.joinToString$default(AFd1eSDK.AFInAppEventType(th), "\n", null, null, 0, null, AFd1eSDK.AnonymousClass5.AFInAppEventParameterName, 30, null)).toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFd1lSDK aFd1lSDK = new AFd1lSDK(obj, AFe1zSDK.AFInAppEventType(obj2, "SHA-256"), ExceptionsKt.stackTraceToString(th), 0, 8, null);
                    String str3 = aFd1lSDK.AFKeystoreWrapper;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFd1lSDK.Companion companion = AFd1lSDK.INSTANCE;
                        AFd1lSDK AFKeystoreWrapper = AFd1lSDK.Companion.AFKeystoreWrapper(FilesKt.readText$default(file2, null, 1, null));
                        if (AFKeystoreWrapper != null) {
                            AFKeystoreWrapper.values++;
                            aFd1lSDK = AFKeystoreWrapper;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("label=");
                    String str4 = aFd1lSDK.AFInAppEventParameterName;
                    Intrinsics.checkNotNullParameter(str4, "");
                    byte[] bytes = str4.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    StringBuilder append = sb2.append(Base64.encodeToString(bytes, 2)).append("\nhashName=");
                    String str5 = aFd1lSDK.AFKeystoreWrapper;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    StringBuilder append2 = append.append(Base64.encodeToString(bytes2, 2)).append("\nstackTrace=");
                    String str6 = aFd1lSDK.valueOf;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    FilesKt.writeText$default(file2, append2.append(Base64.encodeToString(bytes3, 2)).append("\nc=").append(aFd1lSDK.values).toString(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, new StringBuilder("Could not cache exception\n ").append(e.getMessage()).toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x008a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001b, B:24:0x0074, B:26:0x0077, B:31:0x0051, B:33:0x007a, B:35:0x0084, B:11:0x001d, B:13:0x0023, B:15:0x0033, B:17:0x0047, B:19:0x004a, B:22:0x004d), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1jSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1lSDK> AFKeystoreWrapper() {
        List<AFd1lSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            File valueOf = valueOf();
            list = null;
            if (valueOf != null && (listFiles = valueOf.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : listFiles) {
                    try {
                        listFiles2 = file.listFiles();
                    } catch (Throwable th) {
                        AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, new StringBuilder("Could not get stored exceptions\n ").append(th.getMessage()).toString(), false, 4, null);
                    }
                    if (listFiles2 != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                        ArrayList arrayList3 = new ArrayList();
                        for (File file2 : listFiles2) {
                            AFd1lSDK.Companion companion = AFd1lSDK.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            AFd1lSDK AFKeystoreWrapper = AFd1lSDK.Companion.AFKeystoreWrapper(FilesKt.readText$default(file2, null, 1, null));
                            if (AFKeystoreWrapper != null) {
                                arrayList3.add(AFKeystoreWrapper);
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

    @Override // com.appsflyer.internal.AFd1jSDK
    public final int AFInAppEventParameterName() {
        Iterator<T> it = AFKeystoreWrapper().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFd1lSDK) it.next()).values;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final boolean values() {
        return AFInAppEventType(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final boolean AFInAppEventType(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File valueOf = valueOf();
            z = true;
            if (valueOf != null) {
                if (strArr.length == 0) {
                    AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    z = FilesKt.deleteRecursively(valueOf);
                } else {
                    AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, new StringBuilder("delete all exceptions except for: ").append(ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).toString(), false, 4, null);
                    File[] listFiles = valueOf.listFiles();
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

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFKeystoreWrapper(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            File valueOf = valueOf();
            if (valueOf != null && (listFiles = valueOf.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int AFInAppEventParameterName = AFc1tSDK.AFInAppEventParameterName(name);
                    if (i > AFInAppEventParameterName || AFInAppEventParameterName > i2) {
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
