package io.flutter.plugins.sharedpreferences;

import A3.e;
import A3.w;
import E.AbstractC0005f;
import N.d;
import N.h;
import O3.l;
import android.content.Context;
import android.util.Log;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import w3.o;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String name, String str, InterfaceC0425c interfaceC0425c) {
        i.e(name, "name");
        d dVar = new d(name);
        Context context = this.context;
        if (context != null) {
            Object a3 = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).a(new h(new SharedPreferencesPlugin$dataStoreSetString$2(dVar, str, null), null), interfaceC0425c);
            return a3 == EnumC0441a.f9038a ? a3 : C0297i.f5732a;
        }
        i.i("context");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b6 -> B:11:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPrefs(List<String> list, InterfaceC0425c interfaceC0425c) {
        SharedPreferencesPlugin$getPrefs$1 sharedPreferencesPlugin$getPrefs$1;
        int i4;
        Set p02;
        Map linkedHashMap;
        Set set;
        Map map;
        Iterator it;
        Set set2;
        int i5;
        Object transformPref;
        if (interfaceC0425c instanceof SharedPreferencesPlugin$getPrefs$1) {
            sharedPreferencesPlugin$getPrefs$1 = (SharedPreferencesPlugin$getPrefs$1) interfaceC0425c;
            int i6 = sharedPreferencesPlugin$getPrefs$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesPlugin$getPrefs$1.label = i6 - Integer.MIN_VALUE;
                Object obj = sharedPreferencesPlugin$getPrefs$1.result;
                Object obj2 = EnumC0441a.f9038a;
                i4 = sharedPreferencesPlugin$getPrefs$1.label;
                if (i4 != 0) {
                    l.w(obj);
                    p02 = list != null ? d3.i.p0(list) : null;
                    linkedHashMap = new LinkedHashMap();
                    sharedPreferencesPlugin$getPrefs$1.L$0 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$1 = p02;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = linkedHashMap;
                    sharedPreferencesPlugin$getPrefs$1.label = 1;
                    obj = readAllKeys(sharedPreferencesPlugin$getPrefs$1);
                } else if (i4 == 1) {
                    linkedHashMap = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    p02 = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    l.w(obj);
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = sharedPreferencesPlugin$getPrefs$1.I$0;
                    d dVar = (d) sharedPreferencesPlugin$getPrefs$1.L$7;
                    it = (Iterator) sharedPreferencesPlugin$getPrefs$1.L$5;
                    map = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    set2 = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    l.w(obj);
                    if (SharedPreferencesPluginKt.preferencesFilter(dVar.f1790a, obj, set2) && (transformPref = SharedPreferencesPluginKt.transformPref(obj, this.listEncoder)) != null) {
                        map.put(dVar.f1790a, transformPref);
                    }
                    if (it.hasNext()) {
                        return map;
                    }
                    dVar = (d) it.next();
                    sharedPreferencesPlugin$getPrefs$1.L$0 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$1 = set2;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = map;
                    sharedPreferencesPlugin$getPrefs$1.L$3 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$4 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$5 = it;
                    sharedPreferencesPlugin$getPrefs$1.L$6 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$7 = dVar;
                    sharedPreferencesPlugin$getPrefs$1.I$0 = i5;
                    sharedPreferencesPlugin$getPrefs$1.I$1 = 0;
                    sharedPreferencesPlugin$getPrefs$1.label = 2;
                    obj = getValueByKey(dVar, sharedPreferencesPlugin$getPrefs$1);
                }
                set = (Set) obj;
                if (set != null) {
                    return linkedHashMap;
                }
                map = linkedHashMap;
                it = set.iterator();
                set2 = p02;
                i5 = 0;
                if (it.hasNext()) {
                }
            }
        }
        sharedPreferencesPlugin$getPrefs$1 = new SharedPreferencesPlugin$getPrefs$1(this, interfaceC0425c);
        Object obj3 = sharedPreferencesPlugin$getPrefs$1.result;
        Object obj22 = EnumC0441a.f9038a;
        i4 = sharedPreferencesPlugin$getPrefs$1.label;
        if (i4 != 0) {
        }
        set = (Set) obj3;
        if (set != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final d dVar, InterfaceC0425c interfaceC0425c) {
        Context context = this.context;
        if (context != null) {
            final A3.d data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return w.c(new A3.d() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements e {
                    final /* synthetic */ d $key$inlined;
                    final /* synthetic */ e $this_unsafeFlow;

                    @h3.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit", v = 1)
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends h3.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC0425c interfaceC0425c) {
                            super(interfaceC0425c);
                        }

                        @Override // h3.AbstractC0448a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(e eVar, d dVar) {
                        this.$this_unsafeFlow = eVar;
                        this.$key$inlined = dVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // A3.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
                        AnonymousClass1 anonymousClass1;
                        int i4;
                        if (interfaceC0425c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC0425c;
                            int i5 = anonymousClass1.label;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i5 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                                i4 = anonymousClass1.label;
                                if (i4 != 0) {
                                    l.w(obj2);
                                    e eVar = this.$this_unsafeFlow;
                                    Object c4 = ((N.b) obj).c(this.$key$inlined);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (eVar.emit(c4, anonymousClass1) == enumC0441a) {
                                        return enumC0441a;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    l.w(obj2);
                                }
                                return C0297i.f5732a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(interfaceC0425c);
                        Object obj22 = anonymousClass1.result;
                        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                        i4 = anonymousClass1.label;
                        if (i4 != 0) {
                        }
                        return C0297i.f5732a;
                    }
                }

                @Override // A3.d
                public Object collect(e eVar, InterfaceC0425c interfaceC0425c2) {
                    Object collect = A3.d.this.collect(new AnonymousClass2(eVar, dVar), interfaceC0425c2);
                    return collect == EnumC0441a.f9038a ? collect : C0297i.f5732a;
                }
            }, interfaceC0425c);
        }
        i.i("context");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(InterfaceC0425c interfaceC0425c) {
        Context context = this.context;
        if (context != null) {
            final A3.d data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return w.c(new A3.d() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements e {
                    final /* synthetic */ e $this_unsafeFlow;

                    @h3.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit", v = 1)
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends h3.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC0425c interfaceC0425c) {
                            super(interfaceC0425c);
                        }

                        @Override // h3.AbstractC0448a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(e eVar) {
                        this.$this_unsafeFlow = eVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // A3.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
                        AnonymousClass1 anonymousClass1;
                        int i4;
                        if (interfaceC0425c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC0425c;
                            int i5 = anonymousClass1.label;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i5 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                                i4 = anonymousClass1.label;
                                if (i4 != 0) {
                                    l.w(obj2);
                                    e eVar = this.$this_unsafeFlow;
                                    Set keySet = ((N.b) obj).a().keySet();
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (eVar.emit(keySet, anonymousClass1) == enumC0441a) {
                                        return enumC0441a;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    l.w(obj2);
                                }
                                return C0297i.f5732a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(interfaceC0425c);
                        Object obj22 = anonymousClass1.result;
                        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                        i4 = anonymousClass1.label;
                        if (i4 != 0) {
                        }
                        return C0297i.f5732a;
                    }
                }

                @Override // A3.d
                public Object collect(e eVar, InterfaceC0425c interfaceC0425c2) {
                    Object collect = A3.d.this.collect(new AnonymousClass2(eVar), interfaceC0425c2);
                    return collect == EnumC0441a.f9038a ? collect : C0297i.f5732a;
                }
            }, interfaceC0425c);
        }
        i.i("context");
        throw null;
    }

    private final void setUp(BinaryMessenger binaryMessenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(binaryMessenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(binaryMessenger, context, this.listEncoder);
        } catch (Exception e4) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions options) {
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$clear$1(this, list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions options) {
        i.e(options, "options");
        return (Map) AbstractC1562w.j(new SharedPreferencesPlugin$getAll$1(this, list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        p pVar = new p();
        AbstractC1562w.j(new SharedPreferencesPlugin$getBool$1(key, this, pVar, null));
        return (Boolean) pVar.f14159a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        p pVar = new p();
        AbstractC1562w.j(new SharedPreferencesPlugin$getDouble$1(key, this, pVar, null));
        return (Double) pVar.f14159a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        p pVar = new p();
        AbstractC1562w.j(new SharedPreferencesPlugin$getInt$1(key, this, pVar, null));
        return (Long) pVar.f14159a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions options) {
        i.e(options, "options");
        return d3.i.n0(((Map) AbstractC1562w.j(new SharedPreferencesPlugin$getKeys$prefs$1(this, list, null))).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
        List list;
        i.e(key, "key");
        i.e(options, "options");
        String string = getString(key, options);
        if (string == null || o.a0(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || !o.a0(string, SharedPreferencesPluginKt.LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        p pVar = new p();
        AbstractC1562w.j(new SharedPreferencesPlugin$getString$1(key, this, pVar, null));
        return (String) pVar.f14159a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        String string = getString(key, options);
        if (string != null) {
            return o.a0(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : o.a0(string, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        i.e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        i.e(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.Companion;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean z, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setBool$1(key, this, z, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setDeprecatedStringList$1(this, key, AbstractC0005f.n(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)), null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double d4, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setDouble$1(key, this, d4, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setEncodedStringList$1(this, key, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long j4, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setInt$1(key, this, j4, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        AbstractC1562w.j(new SharedPreferencesPlugin$setString$1(this, key, value, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin(SharedPreferencesListEncoder listEncoder) {
        this();
        i.e(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }
}
