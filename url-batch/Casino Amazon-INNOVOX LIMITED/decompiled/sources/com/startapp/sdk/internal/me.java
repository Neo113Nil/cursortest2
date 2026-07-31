package com.startapp.sdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem;
import java.io.StringReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class me {

    /* renamed from: a, reason: collision with root package name */
    public final Context f337a;
    public final f3 b;
    public RscMetadata c;
    public List d;
    public List e;
    public final WeakHashMap f = new WeakHashMap();

    public me(Context context, f3 f3Var) {
        this.f337a = context;
        this.b = f3Var;
    }

    public static JSONArray a(oe oeVar) {
        u2 u2Var = oeVar.f366a;
        String[] strArr = u2Var.c;
        Object[] objArr = u2Var.e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i], objArr[i]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e) {
                if (oeVar.a(32)) {
                    n8.a(e);
                }
            }
        } else if (oeVar.a(512)) {
            n8 n8Var = new n8(o8.e);
            n8Var.d = "c690e4ef5365d88b";
            n8Var.e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            n8Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        ArrayList arrayList;
        u2 u2Var;
        int i;
        int i2;
        Object peVar;
        this.b.getClass();
        RscMetadata N = MetaData.A().N();
        u2 u2Var2 = null;
        RscMetadata rscMetadata = (N == null || !N.d()) ? null : N;
        if (rscMetadata == null) {
            return a(null, null, null);
        }
        synchronized (this) {
            if (rscMetadata.equals(this.c)) {
                return this.e;
            }
            String c = rscMetadata.c();
            int i3 = 4;
            int i4 = 2;
            int i5 = 8;
            int i6 = 0;
            if (c != null && c.length() >= 1) {
                try {
                    try {
                        ArrayList a2 = na.a(new JsonReader(new StringReader(new String(zh.a(g.a(Base64.decode(c, 8)))))));
                        arrayList = new ArrayList();
                        int size = a2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = a2.get(i7);
                            i7++;
                            if (!(obj instanceof Map)) {
                                peVar = new pe();
                                i = i3;
                                i2 = i4;
                            } else {
                                Map map = (Map) obj;
                                Object obj2 = map.get(WebViewManager.EVENT_TYPE_KEY);
                                Object obj3 = map.get(OutcomeEventsTable.COLUMN_NAME_PARAMS);
                                if (obj2 instanceof Number) {
                                    int intValue = ((Number) obj2).intValue();
                                    if (intValue == 1) {
                                        i = i3;
                                        i2 = i4;
                                        if (obj3 instanceof Number) {
                                            peVar = new ge(((Number) obj3).intValue());
                                        }
                                        peVar = new pe();
                                    } else if (intValue == i4) {
                                        i = i3;
                                        i2 = i4;
                                        if (obj3 instanceof List) {
                                            LinkedList linkedList = new LinkedList();
                                            for (Object obj4 : (List) obj3) {
                                                if (obj4 instanceof String) {
                                                    o8 o8Var = (o8) o8.c.get((String) obj4);
                                                    if (o8Var != null) {
                                                        linkedList.add(o8Var);
                                                    }
                                                }
                                            }
                                            if (linkedList.size() > 0) {
                                                peVar = new ke(linkedList);
                                            }
                                        }
                                        peVar = new pe();
                                    } else {
                                        if (intValue != 3) {
                                            if (intValue == i3 && (obj3 instanceof List)) {
                                                List list = (List) obj3;
                                                if (list.size() > 0) {
                                                    o8 o8Var2 = (o8) o8.c.get(String.valueOf(list.get(0)));
                                                    if (o8Var2 != null) {
                                                        i = i3;
                                                        i2 = i4;
                                                        peVar = new je(o8Var2, list.size() > 1 ? String.valueOf(list.get(1)) : null);
                                                    }
                                                }
                                            }
                                        } else if (obj3 instanceof Map) {
                                            Map map2 = (Map) obj3;
                                            Object obj5 = map2.get("action");
                                            if (obj5 instanceof String) {
                                                Object obj6 = map2.get("extras");
                                                HashMap hashMap = new HashMap();
                                                if (obj6 instanceof Map) {
                                                    for (Map.Entry entry : ((Map) obj6).entrySet()) {
                                                        int i8 = i3;
                                                        Object key = entry.getKey();
                                                        int i9 = i4;
                                                        if (key instanceof String) {
                                                            hashMap.put((String) key, String.valueOf(entry.getValue()));
                                                        }
                                                        i3 = i8;
                                                        i4 = i9;
                                                    }
                                                }
                                                i = i3;
                                                i2 = i4;
                                                peVar = new ie((String) obj5, hashMap);
                                            }
                                        }
                                        peVar = new pe();
                                    }
                                }
                                i = i3;
                                i2 = i4;
                                peVar = new pe();
                            }
                            arrayList.add(peVar);
                            i3 = i;
                            i4 = i2;
                        }
                    } catch (Throwable th) {
                        if ((rscMetadata.a() & 1) != 0) {
                            n8.a(th);
                        }
                    }
                } catch (Throwable th2) {
                    if ((rscMetadata.a() & 1) != 0) {
                        n8.a(th2);
                    }
                }
                if (arrayList == null && arrayList.size() >= 1) {
                    List<RscMetadataItem> b = rscMetadata.b();
                    if (b != null && b.size() >= 1) {
                        LinkedList linkedList2 = new LinkedList();
                        for (RscMetadataItem rscMetadataItem : b) {
                            if (rscMetadataItem != null) {
                                String a3 = rscMetadataItem.a();
                                if (a3 != null && a3.length() >= 1) {
                                    try {
                                        try {
                                            u2Var = v2.a(new String(zh.a(g.a(Base64.decode(a3, i5)))));
                                        } catch (Throwable th3) {
                                            if ((rscMetadata.a(rscMetadataItem) & 4) != 0) {
                                                n8.a(th3);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        if ((rscMetadata.a(rscMetadataItem) & 2) != 0) {
                                            n8.a(th4);
                                        }
                                    }
                                    if (u2Var == null) {
                                        int h = rscMetadataItem.h();
                                        int d = rscMetadataItem.d();
                                        ArrayList arrayList2 = new ArrayList(Math.min(arrayList.size(), Integer.bitCount(h)));
                                        int size2 = arrayList.size();
                                        int i10 = i6;
                                        int i11 = i10;
                                        while (i10 < size2) {
                                            Object obj7 = arrayList.get(i10);
                                            i10++;
                                            pe peVar2 = (pe) obj7;
                                            int i12 = 1 << i11;
                                            if ((h & i12) != 0) {
                                                arrayList2.add(new Pair(peVar2, Boolean.valueOf((d & i12) != 0 ? 1 : i6)));
                                            }
                                            i11++;
                                            i6 = 0;
                                        }
                                        if (arrayList2.size() >= 1) {
                                            linkedList2.add(new oe(u2Var, arrayList2, rscMetadataItem.i() != null ? rscMetadataItem.i().intValue() : 300, rscMetadataItem.g(), rscMetadataItem.c(), rscMetadataItem.f(), rscMetadataItem.e() != null ? rscMetadataItem.e().intValue() : 0, rscMetadata.a(rscMetadataItem)));
                                        }
                                        u2Var2 = null;
                                        i5 = 8;
                                        i6 = 0;
                                    }
                                }
                                u2Var = u2Var2;
                                if (u2Var == null) {
                                }
                            }
                        }
                        return a(rscMetadata, arrayList, linkedList2);
                    }
                    return a(rscMetadata, null, null);
                }
                return a(rscMetadata, null, null);
            }
            arrayList = null;
            if (arrayList == null) {
            }
            return a(rscMetadata, null, null);
        }
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((pe) it.next()).a(this.f337a);
                } catch (Throwable th) {
                    RscMetadata rscMetadata2 = this.c;
                    if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                        n8.a(th);
                    }
                }
            }
        }
        this.c = rscMetadata;
        this.d = arrayList;
        this.e = linkedList;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((pe) obj).a(this.f337a, this);
                } catch (Throwable th2) {
                    if (rscMetadata != null && (rscMetadata.a() & 128) != 0) {
                        n8.a(th2);
                    }
                }
            }
        }
        return linkedList;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final java.lang.String a(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.me.a(java.lang.Object):java.lang.String");
    }

    public final synchronized void a(u2 u2Var, JSONObject jSONObject) {
        this.f.put(u2Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
