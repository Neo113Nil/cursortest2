package com.startapp.sdk.ads.video.downloader.impl;

import android.content.SharedPreferences;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.r2;
import com.startapp.sdk.internal.si;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final pa f108a;
    public final pa b;
    public final Mutex c = MutexKt.Mutex$default(false, 1, null);

    public c(pa paVar, pa paVar2) {
        this.f108a = paVar;
        this.b = paVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x004e, B:21:0x006e, B:23:0x007b, B:25:0x005f, B:27:0x0067), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        VideoFileCache$peek$1 videoFileCache$peek$1;
        int i;
        Mutex mutex;
        SharedPreferences sharedPreferences;
        Set<String> stringSet;
        r2 a2;
        try {
            if (continuationImpl instanceof VideoFileCache$peek$1) {
                videoFileCache$peek$1 = (VideoFileCache$peek$1) continuationImpl;
                int i2 = videoFileCache$peek$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    videoFileCache$peek$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = videoFileCache$peek$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = videoFileCache$peek$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        videoFileCache$peek$1.L$0 = str;
                        videoFileCache$peek$1.L$1 = mutex;
                        videoFileCache$peek$1.label = 1;
                        if (mutex.lock(null, videoFileCache$peek$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) videoFileCache$peek$1.L$1;
                        String str2 = (String) videoFileCache$peek$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        str = str2;
                    }
                    sharedPreferences = (SharedPreferences) this.b.a();
                    stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
                    if (stringSet != null && stringSet.contains(str)) {
                        a2 = a(str, sharedPreferences);
                        if (a2 != null) {
                            if (!new File(a2.b).exists()) {
                                a(str);
                            }
                            return a2;
                        }
                        a2 = null;
                        return a2;
                    }
                    a2 = null;
                    if (a2 != null) {
                    }
                    a2 = null;
                    return a2;
                }
            }
            sharedPreferences = (SharedPreferences) this.b.a();
            stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
            if (stringSet != null) {
                a2 = a(str, sharedPreferences);
                if (a2 != null) {
                }
                a2 = null;
                return a2;
            }
            a2 = null;
            if (a2 != null) {
            }
            a2 = null;
            return a2;
        } finally {
            mutex.unlock(null);
        }
        videoFileCache$peek$1 = new VideoFileCache$peek$1(this, continuationImpl);
        Object obj2 = videoFileCache$peek$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoFileCache$peek$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:11:0x0054, B:17:0x0090, B:22:0x0074, B:23:0x0065, B:25:0x006d), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        VideoFileCache$touch$1 videoFileCache$touch$1;
        int i;
        Mutex mutex;
        String str2;
        SharedPreferences sharedPreferences;
        Set<String> stringSet;
        r2 a2;
        try {
            if (continuationImpl instanceof VideoFileCache$touch$1) {
                videoFileCache$touch$1 = (VideoFileCache$touch$1) continuationImpl;
                int i2 = videoFileCache$touch$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    videoFileCache$touch$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = videoFileCache$touch$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = videoFileCache$touch$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.c;
                        videoFileCache$touch$1.L$0 = str;
                        videoFileCache$touch$1.L$1 = mutex2;
                        videoFileCache$touch$1.label = 1;
                        if (mutex2.lock(null, videoFileCache$touch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        str2 = str;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) videoFileCache$touch$1.L$1;
                        str2 = (String) videoFileCache$touch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    sharedPreferences = (SharedPreferences) this.b.a();
                    stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
                    if (stringSet != null && stringSet.contains(str2)) {
                        a2 = a(str2, sharedPreferences);
                        if (a2 == null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            String str3 = a2.f398a;
                            String str4 = a2.b;
                            long j = a2.c;
                            String str5 = a2.d;
                            String str6 = a2.e;
                            str3.getClass();
                            str4.getClass();
                            a(new r2(str3, str4, j, str5, str6, currentTimeMillis));
                        }
                        return Unit.INSTANCE;
                    }
                    a2 = null;
                    if (a2 == null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            sharedPreferences = (SharedPreferences) this.b.a();
            stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
            if (stringSet != null) {
                a2 = a(str2, sharedPreferences);
                if (a2 == null) {
                }
                return Unit.INSTANCE;
            }
            a2 = null;
            if (a2 == null) {
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        videoFileCache$touch$1 = new VideoFileCache$touch$1(this, continuationImpl);
        Object obj2 = videoFileCache$touch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoFileCache$touch$1.label;
        if (i != 0) {
        }
    }

    public final Map b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.a();
        Set<String> stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
        if (stringSet == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(stringSet, 10)), 16));
        for (Object obj : stringSet) {
            linkedHashMap.put(obj, a((String) obj, sharedPreferences));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x0079, B:13:0x008c, B:17:0x0091), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x0079, B:13:0x008c, B:17:0x0091), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, File file, long j, String str2, String str3, ContinuationImpl continuationImpl) {
        VideoFileCache$commit$1 videoFileCache$commit$1;
        int i;
        long j2;
        Mutex mutex;
        String str4;
        String str5;
        String str6;
        File file2;
        File file3;
        r2 r2Var;
        try {
            if (continuationImpl instanceof VideoFileCache$commit$1) {
                videoFileCache$commit$1 = (VideoFileCache$commit$1) continuationImpl;
                int i2 = videoFileCache$commit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    videoFileCache$commit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = videoFileCache$commit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = videoFileCache$commit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.c;
                        videoFileCache$commit$1.L$0 = str;
                        videoFileCache$commit$1.L$1 = file;
                        videoFileCache$commit$1.L$2 = str2;
                        videoFileCache$commit$1.L$3 = str3;
                        videoFileCache$commit$1.L$4 = mutex2;
                        j2 = j;
                        videoFileCache$commit$1.J$0 = j2;
                        videoFileCache$commit$1.label = 1;
                        if (mutex2.lock(null, videoFileCache$commit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        str4 = str2;
                        str5 = str3;
                        str6 = str;
                        file2 = file;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j3 = videoFileCache$commit$1.J$0;
                        mutex = (Mutex) videoFileCache$commit$1.L$4;
                        String str7 = (String) videoFileCache$commit$1.L$3;
                        String str8 = (String) videoFileCache$commit$1.L$2;
                        file2 = (File) videoFileCache$commit$1.L$1;
                        String str9 = (String) videoFileCache$commit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        j2 = j3;
                        str5 = str7;
                        str4 = str8;
                        str6 = str9;
                    }
                    file3 = new File((File) this.f108a.a(), str6);
                    if (file2.renameTo(file3)) {
                        file2.delete();
                        r2Var = null;
                    } else {
                        new File((File) this.f108a.a(), str6 + ".prg").delete();
                        String absolutePath = file3.getAbsolutePath();
                        absolutePath.getClass();
                        r2Var = new r2(str6, absolutePath, j2, str4, str5, System.currentTimeMillis());
                        a(r2Var);
                    }
                    return r2Var;
                }
            }
            file3 = new File((File) this.f108a.a(), str6);
            if (file2.renameTo(file3)) {
            }
            return r2Var;
        } finally {
            mutex.unlock(null);
        }
        videoFileCache$commit$1 = new VideoFileCache$commit$1(this, continuationImpl);
        Object obj2 = videoFileCache$commit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoFileCache$commit$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:11:0x0052, B:12:0x0063, B:14:0x0069, B:17:0x0078, B:22:0x007c, B:23:0x008f, B:25:0x0095, B:27:0x009f, B:28:0x00a3, B:30:0x00a9, B:33:0x00c2, B:45:0x00cf, B:39:0x00eb), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[Catch: all -> 0x00f1, LOOP:1: B:23:0x008f->B:25:0x0095, LOOP_END, TryCatch #0 {all -> 0x00f1, blocks: (B:11:0x0052, B:12:0x0063, B:14:0x0069, B:17:0x0078, B:22:0x007c, B:23:0x008f, B:25:0x0095, B:27:0x009f, B:28:0x00a3, B:30:0x00a9, B:33:0x00c2, B:45:0x00cf, B:39:0x00eb), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:11:0x0052, B:12:0x0063, B:14:0x0069, B:17:0x0078, B:22:0x007c, B:23:0x008f, B:25:0x0095, B:27:0x009f, B:28:0x00a3, B:30:0x00a9, B:33:0x00c2, B:45:0x00cf, B:39:0x00eb), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        VideoFileCache$ensureSpace$1 videoFileCache$ensureSpace$1;
        int i2;
        Mutex mutex;
        Iterator it;
        Iterator it2;
        try {
            if (continuationImpl instanceof VideoFileCache$ensureSpace$1) {
                videoFileCache$ensureSpace$1 = (VideoFileCache$ensureSpace$1) continuationImpl;
                int i3 = videoFileCache$ensureSpace$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    videoFileCache$ensureSpace$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = videoFileCache$ensureSpace$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = videoFileCache$ensureSpace$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.c;
                        videoFileCache$ensureSpace$1.L$0 = str;
                        videoFileCache$ensureSpace$1.L$1 = mutex;
                        videoFileCache$ensureSpace$1.I$0 = i;
                        videoFileCache$ensureSpace$1.label = 1;
                        if (mutex.lock(null, videoFileCache$ensureSpace$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = videoFileCache$ensureSpace$1.I$0;
                        Mutex mutex2 = (Mutex) videoFileCache$ensureSpace$1.L$1;
                        String str2 = (String) videoFileCache$ensureSpace$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        str = str2;
                    }
                    Collection values = b().values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : values) {
                        if (!Intrinsics.areEqual(((r2) obj2).f398a, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList, new si()));
                    it = mutableList.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        j += ((r2) it.next()).c;
                    }
                    it2 = mutableList.iterator();
                    while (it2.hasNext()) {
                        long j2 = i;
                        boolean z = ((File) this.f108a.a()).getFreeSpace() >= 52428800 + j2;
                        boolean z2 = j2 + j <= 209715200;
                        if (z && z2) {
                            break;
                        }
                        r2 r2Var = (r2) it2.next();
                        new File(r2Var.b).delete();
                        a(r2Var.f398a);
                        j -= r2Var.c;
                        it2.remove();
                    }
                    return Unit.INSTANCE;
                }
            }
            Collection values2 = b().values();
            ArrayList arrayList2 = new ArrayList();
            while (r0.hasNext()) {
            }
            List mutableList2 = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList2, new si()));
            it = mutableList2.iterator();
            long j3 = 0;
            while (it.hasNext()) {
            }
            it2 = mutableList2.iterator();
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        videoFileCache$ensureSpace$1 = new VideoFileCache$ensureSpace$1(this, continuationImpl);
        Object obj3 = videoFileCache$ensureSpace$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = videoFileCache$ensureSpace$1.label;
        if (i2 != 0) {
        }
    }

    public final void a() {
        Set<String> stringSet = ((SharedPreferences) this.b.a()).getStringSet("bf2b24245814b6d9", null);
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        File[] listFiles = ((File) this.f108a.a()).listFiles();
        if (listFiles == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : listFiles) {
            hashSet.add(file.getName());
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!stringSet.contains(name)) {
                name.getClass();
                if (StringsKt.endsWith$default(name, DefaultDiskStorage.FileType.TEMP, false, 2, (Object) null)) {
                    if (!hashSet.contains(StringsKt.removeSuffix(name, (CharSequence) DefaultDiskStorage.FileType.TEMP) + ".prg")) {
                        file2.delete();
                    }
                } else if (StringsKt.endsWith$default(name, ".prg", false, 2, (Object) null)) {
                    if (!hashSet.contains(StringsKt.removeSuffix(name, (CharSequence) ".prg") + DefaultDiskStorage.FileType.TEMP)) {
                        file2.delete();
                    }
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final r2 a(String str, SharedPreferences sharedPreferences) {
        String absolutePath = new File((File) this.f108a.a(), str).getAbsolutePath();
        absolutePath.getClass();
        return new r2(str, absolutePath, sharedPreferences.getLong(str + ":e3761e3caeb8468b", 0L), sharedPreferences.getString(str + ":35351a026e50b082", null), sharedPreferences.getString(str + ":0af5fe1f197f792d", null), sharedPreferences.getLong(str + ":4f61a15dc5930019", 0L));
    }

    public final void a(r2 r2Var) {
        Set<String> linkedHashSet;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.a();
        Set<String> stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
        if (stringSet == null || (linkedHashSet = CollectionsKt.toMutableSet(stringSet)) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        linkedHashSet.add(r2Var.f398a);
        sharedPreferences.edit().putStringSet("bf2b24245814b6d9", linkedHashSet).putLong(r2Var.f398a + ":e3761e3caeb8468b", r2Var.c).putString(r2Var.f398a + ":35351a026e50b082", r2Var.d).putString(r2Var.f398a + ":0af5fe1f197f792d", r2Var.e).putLong(r2Var.f398a + ":4f61a15dc5930019", r2Var.f).apply();
    }

    public final void a(String str) {
        Set<String> mutableSet;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.a();
        Set<String> stringSet = sharedPreferences.getStringSet("bf2b24245814b6d9", null);
        if (stringSet == null || (mutableSet = CollectionsKt.toMutableSet(stringSet)) == null) {
            return;
        }
        mutableSet.remove(str);
        sharedPreferences.edit().putStringSet("bf2b24245814b6d9", mutableSet).remove(str + ":e3761e3caeb8468b").remove(str + ":35351a026e50b082").remove(str + ":0af5fe1f197f792d").remove(str + ":4f61a15dc5930019").apply();
    }
}
