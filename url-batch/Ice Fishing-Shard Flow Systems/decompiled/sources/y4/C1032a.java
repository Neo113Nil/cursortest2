package y4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1032a implements o4.c, InterfaceC1036e {

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f8579d;

    /* renamed from: e, reason: collision with root package name */
    public final r4.b f8580e = new r4.b();

    public final boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f8579d.edit();
        Map<String, ?> all = this.f8579d.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            edit.remove((String) obj);
        }
        return edit.commit();
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f8579d.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z7 = obj2 instanceof String;
                r4.b bVar = this.f8580e;
                if (z7) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            bVar.getClass();
                            try {
                                ByteArrayInputStream input = new ByteArrayInputStream(Base64.decode(substring, 0));
                                Intrinsics.checkNotNullParameter(input, "input");
                                obj2 = (List) new N(input).readObject();
                            } catch (IOException | ClassNotFoundException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f8579d.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + bVar.a(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return this.f8579d.edit().putString(str, str2).commit();
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
        s4.f fVar = bVar.f7122c;
        this.f8579d = bVar.f7120a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            InterfaceC1036e.f8586h.getClass();
            C1035d.b(fVar, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
        s4.f fVar = bVar.f7122c;
        InterfaceC1036e.f8586h.getClass();
        C1035d.b(fVar, null);
    }
}
