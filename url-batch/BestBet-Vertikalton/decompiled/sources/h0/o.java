package h0;

import android.app.ActivityManager;
import android.content.Context;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;
import e0.ExecutorC0105d;
import g.C0121b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.C0286a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2982a;

    /* renamed from: e, reason: collision with root package name */
    public ExecutorC0105d f2985e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorC0105d f2986f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2983b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2984c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f2987g = 1;
    public final boolean h = true;
    public final long i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final A0.c f2988j = new A0.c(28);

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2989k = new LinkedHashSet();

    public o(Context context) {
        this.f2982a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d A[LOOP:4: B:64:0x01fe->B:76:0x022d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FortuneQuestDatabase a() {
        int i;
        ExecutorC0105d executorC0105d;
        ExecutorC0105d executorC0105d2 = this.f2985e;
        if (executorC0105d2 == null && this.f2986f == null) {
            ExecutorC0105d executorC0105d3 = C0286a.f3531f;
            this.f2986f = executorC0105d3;
            this.f2985e = executorC0105d3;
        } else if (executorC0105d2 != null && this.f2986f == null) {
            this.f2986f = executorC0105d2;
        } else if (executorC0105d2 == null) {
            this.f2985e = this.f2986f;
        }
        R0.e eVar = new R0.e(27);
        if (this.i > 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList = this.f2983b;
        int i2 = this.f2987g;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.f2982a;
        if (i2 == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null || activityManager.isLowRamDevice()) {
                i2 = 2;
            } else {
                i = 3;
                executorC0105d = this.f2985e;
                if (executorC0105d != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ExecutorC0105d executorC0105d4 = this.f2986f;
                if (executorC0105d4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C0121b c0121b = new C0121b(context, eVar, this.f2988j, arrayList, i, executorC0105d, executorC0105d4, this.h, this.f2989k, this.f2984c, this.d);
                Package r3 = FortuneQuestDatabase.class.getPackage();
                k1.e.b(r3);
                String name = r3.getName();
                String canonicalName = FortuneQuestDatabase.class.getCanonicalName();
                k1.e.b(canonicalName);
                k1.e.d(name, "fullPackage");
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                    k1.e.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                String replace = canonicalName.replace('.', '_');
                k1.e.d(replace, "replace(...)");
                String concat = replace.concat("_Impl");
                try {
                    Class<?> cls = Class.forName(name.length() == 0 ? concat : name + '.' + concat, true, FortuneQuestDatabase.class.getClassLoader());
                    k1.e.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                    FortuneQuestDatabase fortuneQuestDatabase = (FortuneQuestDatabase) cls.getDeclaredConstructor(null).newInstance(null);
                    fortuneQuestDatabase.getClass();
                    fortuneQuestDatabase.d = fortuneQuestDatabase.d(c0121b);
                    Set g2 = fortuneQuestDatabase.g();
                    BitSet bitSet = new BitSet();
                    Iterator it = g2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        LinkedHashMap linkedHashMap = fortuneQuestDatabase.f2101g;
                        ArrayList arrayList2 = (ArrayList) c0121b.f2645j;
                        int i3 = -1;
                        if (hasNext) {
                            Class cls2 = (Class) it.next();
                            int size = arrayList2.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i4 = size - 1;
                                    if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                        bitSet.set(size);
                                        i3 = size;
                                        break;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size = i4;
                                }
                            }
                            if (i3 < 0) {
                                throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                            }
                            linkedHashMap.put(cls2, arrayList2.get(i3));
                        } else {
                            int size2 = arrayList2.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i5 = size2 - 1;
                                    if (!bitSet.get(size2)) {
                                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    }
                                    if (i5 < 0) {
                                        break;
                                    }
                                    size2 = i5;
                                }
                            }
                            Iterator it2 = fortuneQuestDatabase.e(linkedHashMap).iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            fortuneQuestDatabase.f().setWriteAheadLoggingEnabled(c0121b.f2639a == 3);
                            fortuneQuestDatabase.f2100f = (ArrayList) c0121b.f2642e;
                            fortuneQuestDatabase.f2097b = (ExecutorC0105d) c0121b.f2643f;
                            fortuneQuestDatabase.f2098c = new g.m((ExecutorC0105d) c0121b.f2644g);
                            Map h = fortuneQuestDatabase.h();
                            BitSet bitSet2 = new BitSet();
                            Iterator it3 = h.entrySet().iterator();
                            while (true) {
                                boolean hasNext2 = it3.hasNext();
                                ArrayList arrayList3 = (ArrayList) c0121b.i;
                                if (!hasNext2) {
                                    int size3 = arrayList3.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i6 = size3 - 1;
                                            if (!bitSet2.get(size3)) {
                                                throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i6 < 0) {
                                                break;
                                            }
                                            size3 = i6;
                                        }
                                    }
                                    return fortuneQuestDatabase;
                                }
                                Map.Entry entry = (Map.Entry) it3.next();
                                Class cls3 = (Class) entry.getKey();
                                for (Class cls4 : (List) entry.getValue()) {
                                    int size4 = arrayList3.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i7 = size4 - 1;
                                            if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                                bitSet2.set(size4);
                                                break;
                                            }
                                            if (i7 < 0) {
                                                break;
                                            }
                                            size4 = i7;
                                        }
                                        if (size4 >= 0) {
                                            throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                        }
                                        fortuneQuestDatabase.f2103k.put(cls4, arrayList3.get(size4));
                                    }
                                    size4 = -1;
                                    if (size4 >= 0) {
                                    }
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("Cannot find implementation for " + FortuneQuestDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor " + FortuneQuestDatabase.class.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + FortuneQuestDatabase.class.getCanonicalName());
                }
            }
        }
        i = i2;
        executorC0105d = this.f2985e;
        if (executorC0105d != null) {
        }
    }
}
