package net.idrnd.face.iad.capture.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okio.Utf8;
import papa.AppUpdateData;

/* loaded from: classes9.dex */
public abstract class f4 {
    public static final LinkedHashSet a = new LinkedHashSet();

    public static void a() {
        Object failure;
        List split$default;
        String[] strArr = {"HACK_APP_PKG", "HACK_CORE_DIR", "HACK_HOST_PKG", "HACK_MODE"};
        String[] strArr2 = {"virtual.camera.app"};
        try {
            Result.Companion companion = Result.Companion;
            failure = Runtime.getRuntime().exec("env");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        if (z) {
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
            m4120exceptionOrNullimpl.getClass();
            if (!(m4120exceptionOrNullimpl instanceof SecurityException)) {
                throw new c4(m4120exceptionOrNullimpl);
            }
            throw new e0("We don't have access permissions to call \"env\"");
        }
        if (z) {
            failure = null;
        }
        failure.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Process) failure).getInputStream()));
        try {
            ArrayList arrayList = new ArrayList();
            AppUpdateData.forEachLine(bufferedReader, new TextStreamsKt$$ExternalSyntheticLambda0(0, arrayList));
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                arrayList2.add(split$default);
            }
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                linkedHashMap.put(CollectionsKt.first(list), CollectionsKt.last(list));
            }
            bufferedReader.close();
            Set<String> keySet = linkedHashMap.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                for (String str : keySet) {
                    for (int i = 0; i < 4; i++) {
                        if (Intrinsics.areEqual(str, strArr[i])) {
                            throw new i0("We found the hack environment variables");
                        }
                    }
                }
            }
            String str2 = strArr2[0];
            String str3 = (String) linkedHashMap.get("LD_PRELOAD");
            if (str3 != null && StringsKt.contains((CharSequence) str3, (CharSequence) str2, false)) {
                throw new j0("We found the hack preloads");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Utf8.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }
}
