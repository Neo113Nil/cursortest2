package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.b42;
import defpackage.b71;
import defpackage.on1;
import defpackage.q40;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class HeartBeatInfoStorage {
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final JavaDataStorage firebaseDataStore;
    private static final b42 GLOBAL = new b42("fire-global");
    private static final b42 HEART_BEAT_COUNT_TAG = new b42("fire-count");
    private static final b42 LAST_STORED_DATE = new b42("last-used-date");

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, q40.l(HEARTBEAT_PREFERENCES_NAME, str));
    }

    private synchronized long cleanUpStoredHeartBeats(on1 on1Var) {
        long j;
        try {
            long longValue = ((Long) JavaDataStorageKt.getOrDefault(on1Var, HEART_BEAT_COUNT_TAG, 0L)).longValue();
            String str = BuildConfig.FLAVOR;
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : on1Var.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = ((b42) entry.getKey()).a;
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            str.getClass();
            on1Var.d(new b42(str), hashSet2);
            j = longValue - 1;
            on1Var.c(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    private synchronized String getFormattedDate(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    private synchronized b42 getStoredUserAgentString(on1 on1Var, String str) {
        for (Map.Entry entry : on1Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((b42) entry.getKey()).a;
                        str2.getClass();
                        return new b42(str2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$deleteAllHeartBeats$0(on1 on1Var) {
        Map a = on1Var.a();
        LinkedHashMap linkedHashMap = on1Var.a;
        long j = 0;
        for (Map.Entry entry : a.entrySet()) {
            if (entry.getValue() instanceof Set) {
                b42 b42Var = (b42) entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    Object[] objArr = {formattedDate};
                    HashSet hashSet = new HashSet(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        b71.j(obj, "duplicate element: ");
                        return null;
                    }
                    on1Var.c(b42Var, Collections.unmodifiableSet(hashSet));
                    j++;
                } else {
                    b42Var.getClass();
                    on1Var.b();
                    linkedHashMap.remove(b42Var);
                }
            }
        }
        if (j == 0) {
            b42 b42Var2 = HEART_BEAT_COUNT_TAG;
            b42Var2.getClass();
            on1Var.b();
            linkedHashMap.remove(b42Var2);
        } else {
            on1Var.c(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$postHeartBeatCleanUp$1(String str, on1 on1Var) {
        on1Var.c(LAST_STORED_DATE, str);
        removeStoredDate(on1Var, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$storeHeartBeat$2(String str, String str2, b42 b42Var, on1 on1Var) {
        b42 b42Var2 = LAST_STORED_DATE;
        if (((String) JavaDataStorageKt.getOrDefault(on1Var, b42Var2, BuildConfig.FLAVOR)).equals(str)) {
            b42 storedUserAgentString = getStoredUserAgentString(on1Var, str);
            if (storedUserAgentString == null || storedUserAgentString.a.equals(str2)) {
                return null;
            }
            updateStoredUserAgent(on1Var, b42Var, str);
            return null;
        }
        b42 b42Var3 = HEART_BEAT_COUNT_TAG;
        long longValue = ((Long) JavaDataStorageKt.getOrDefault(on1Var, b42Var3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = cleanUpStoredHeartBeats(on1Var);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(on1Var, b42Var, new HashSet()));
        hashSet.add(str);
        on1Var.c(b42Var, hashSet);
        on1Var.c(b42Var3, Long.valueOf(longValue + 1));
        on1Var.c(b42Var2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$updateGlobalHeartBeat$3(long j, on1 on1Var) {
        on1Var.c(GLOBAL, Long.valueOf(j));
        return null;
    }

    private synchronized void removeStoredDate(on1 on1Var, String str) {
        b42 storedUserAgentString = getStoredUserAgentString(on1Var, str);
        if (storedUserAgentString == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(on1Var, storedUserAgentString, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            on1Var.getClass();
            on1Var.b();
            on1Var.a.remove(storedUserAgentString);
        } else {
            on1Var.getClass();
            on1Var.d(storedUserAgentString, hashSet);
        }
    }

    private synchronized void updateStoredUserAgent(on1 on1Var, b42 b42Var, String str) {
        removeStoredDate(on1Var, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(on1Var, b42Var, new HashSet()));
        hashSet.add(str);
        on1Var.c(b42Var, hashSet);
    }

    public synchronized void deleteAllHeartBeats() {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$deleteAllHeartBeats$0;
                lambda$deleteAllHeartBeats$0 = HeartBeatInfoStorage.this.lambda$deleteAllHeartBeats$0((on1) obj);
                return lambda$deleteAllHeartBeats$0;
            }
        });
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<b42, Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().a, new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public int getHeartBeatCount() {
        return ((Long) this.firebaseDataStore.getSync(HEART_BEAT_COUNT_TAG, 0L)).intValue();
    }

    public synchronized long getLastGlobalHeartBeat() {
        return ((Long) this.firebaseDataStore.getSync(GLOBAL, -1L)).longValue();
    }

    public synchronized boolean isSameDateUtc(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    public synchronized void postHeartBeatCleanUp() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$postHeartBeatCleanUp$1;
                lambda$postHeartBeatCleanUp$1 = HeartBeatInfoStorage.this.lambda$postHeartBeatCleanUp$1(formattedDate, (on1) obj);
                return lambda$postHeartBeatCleanUp$1;
            }
        });
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }

    public synchronized boolean shouldSendSdkHeartBeat(b42 b42Var, long j) {
        if (isSameDateUtc(((Long) this.firebaseDataStore.getSync(b42Var, -1L)).longValue(), j)) {
            return false;
        }
        this.firebaseDataStore.putSync(b42Var, Long.valueOf(j));
        return true;
    }

    public synchronized void storeHeartBeat(long j, final String str) {
        final String formattedDate = getFormattedDate(j);
        str.getClass();
        final b42 b42Var = new b42(str);
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$storeHeartBeat$2;
                lambda$storeHeartBeat$2 = HeartBeatInfoStorage.this.lambda$storeHeartBeat$2(formattedDate, str, b42Var, (on1) obj);
                return lambda$storeHeartBeat$2;
            }
        });
    }

    public synchronized void updateGlobalHeartBeat(final long j) {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$updateGlobalHeartBeat$3;
                lambda$updateGlobalHeartBeat$3 = HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j, (on1) obj);
                return lambda$updateGlobalHeartBeat$3;
            }
        });
    }

    public HeartBeatInfoStorage(JavaDataStorage javaDataStorage) {
        this.firebaseDataStore = javaDataStorage;
    }
}
