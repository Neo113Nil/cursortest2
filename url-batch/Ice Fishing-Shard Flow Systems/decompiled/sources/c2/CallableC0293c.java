package c2;

import a.AbstractC0169a;
import android.util.Base64OutputStream;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0293c implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4179e;

    public /* synthetic */ CallableC0293c(int i2, Object obj) {
        this.f4178d = i2;
        this.f4179e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f4178d) {
            case 0:
                d dVar = (d) this.f4179e;
                synchronized (dVar) {
                    try {
                        l lVar = (l) dVar.f4180a.get();
                        ArrayList a7 = lVar.a();
                        synchronized (lVar) {
                            lVar.f4199a.a(new i(lVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < a7.size(); i2++) {
                            C0291a c0291a = (C0291a) a7.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c0291a.f4174a);
                            jSONObject.put("dates", new JSONArray((Collection) c0291a.f4175b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            case 1:
                d dVar2 = (d) this.f4179e;
                synchronized (dVar2) {
                    final l lVar2 = (l) dVar2.f4180a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    final String a8 = ((l2.b) dVar2.f4182c.get()).a();
                    synchronized (lVar2) {
                        final String b7 = l.b(currentTimeMillis);
                        final T.d F4 = AbstractC0169a.F(a8);
                        lVar2.f4199a.a(new Function1(lVar2, b7, a8, F4) { // from class: c2.h

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ String f4189d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ String f4190e;

                            /* renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ T.d f4191i;

                            {
                                this.f4189d = b7;
                                this.f4190e = a8;
                                this.f4191i = F4;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Object obj2;
                                long j;
                                T.b bVar = (T.b) obj;
                                T.d key = l.f4197c;
                                T.d key2 = l.f4198d;
                                String str = "";
                                String str2 = (String) d4.c.q(bVar, key2, "");
                                String str3 = this.f4189d;
                                boolean equals = str2.equals(str3);
                                T.d key3 = this.f4191i;
                                Object obj3 = null;
                                if (equals) {
                                    T.d c7 = l.c(bVar, str3);
                                    if (c7 == null || c7.f2555a.equals(this.f4190e)) {
                                        return null;
                                    }
                                    l.d(bVar, str3);
                                    HashSet hashSet = new HashSet((Collection) d4.c.q(bVar, key3, new HashSet()));
                                    hashSet.add(str3);
                                    Intrinsics.checkNotNullParameter(key3, "key");
                                    bVar.f(key3, hashSet);
                                    return null;
                                }
                                long longValue = ((Long) d4.c.q(bVar, key, 0L)).longValue();
                                long j7 = 1;
                                if (longValue + 1 == 30) {
                                    long longValue2 = ((Long) d4.c.q(bVar, key, 0L)).longValue();
                                    Set hashSet2 = new HashSet();
                                    String str4 = null;
                                    for (Map.Entry entry : bVar.a().entrySet()) {
                                        Object obj4 = obj3;
                                        if (entry.getValue() instanceof Set) {
                                            Set<String> set = (Set) entry.getValue();
                                            for (String str5 : set) {
                                                long j8 = j7;
                                                if (str4 == null || str4.compareTo(str5) > 0) {
                                                    str = ((T.d) entry.getKey()).f2555a;
                                                    hashSet2 = set;
                                                    str4 = str5;
                                                }
                                                j7 = j8;
                                            }
                                        }
                                        obj3 = obj4;
                                        j7 = j7;
                                    }
                                    obj2 = obj3;
                                    j = j7;
                                    HashSet hashSet3 = new HashSet(hashSet2);
                                    hashSet3.remove(str4);
                                    T.d key4 = AbstractC0169a.F(str);
                                    Intrinsics.checkNotNullParameter(key4, "key");
                                    bVar.f(key4, hashSet3);
                                    longValue = longValue2 - j;
                                    Long valueOf = Long.valueOf(longValue);
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    bVar.f(key, valueOf);
                                } else {
                                    obj2 = null;
                                    j = 1;
                                }
                                HashSet hashSet4 = new HashSet((Collection) d4.c.q(bVar, key3, new HashSet()));
                                hashSet4.add(str3);
                                Intrinsics.checkNotNullParameter(key3, "key");
                                bVar.f(key3, hashSet4);
                                Long valueOf2 = Long.valueOf(longValue + j);
                                Intrinsics.checkNotNullParameter(key, "key");
                                bVar.f(key, valueOf2);
                                Intrinsics.checkNotNullParameter(key2, "key");
                                bVar.f(key2, str3);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
            default:
                B.f this$0 = (B.f) this.f4179e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f152e;
                Long r7 = workDatabase.l().r("next_alarm_manager_id");
                int longValue = r7 != null ? (int) r7.longValue() : 0;
                workDatabase.l().t(new P0.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
        }
    }
}
