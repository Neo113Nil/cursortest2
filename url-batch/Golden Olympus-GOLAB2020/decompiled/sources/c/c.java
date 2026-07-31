package c;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.AbstractC1279c;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import d.AbstractC2398a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.s;
import kotlin.sequences.k;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: h, reason: collision with root package name */
    private static final b f13313h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f13314a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f13315b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f13316c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List f13317d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final transient Map f13318e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map f13319f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f13320g = new Bundle();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1375a f13321a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC2398a f13322b;

        public a(InterfaceC1375a callback, AbstractC2398a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f13321a = callback;
            this.f13322b = contract;
        }

        public final InterfaceC1375a a() {
            return this.f13321a;
        }

        public final AbstractC2398a b() {
            return this.f13322b;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: c.c$c, reason: collision with other inner class name */
    private static final class C0127c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1346l f13323a;

        /* renamed from: b, reason: collision with root package name */
        private final List f13324b;

        public C0127c(AbstractC1346l lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f13323a = lifecycle;
            this.f13324b = new ArrayList();
        }

        public final void a(InterfaceC1351q observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f13323a.addObserver(observer);
            this.f13324b.add(observer);
        }

        public final void b() {
            Iterator it = this.f13324b.iterator();
            while (it.hasNext()) {
                this.f13323a.removeObserver((InterfaceC1351q) it.next());
            }
            this.f13324b.clear();
        }
    }

    static final class d extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f13325i = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(kotlin.random.e.f41170b.k(2147418112) + 65536);
        }
    }

    public static final class e extends ActivityResultLauncher {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13327b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2398a f13328c;

        e(String str, AbstractC2398a abstractC2398a) {
            this.f13327b = str;
            this.f13328c = abstractC2398a;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void b(Object obj, AbstractC1279c abstractC1279c) {
            Object obj2 = c.this.f13315b.get(this.f13327b);
            AbstractC2398a abstractC2398a = this.f13328c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                c.this.f13317d.add(this.f13327b);
                try {
                    c.this.i(intValue, this.f13328c, obj, abstractC1279c);
                    return;
                } catch (Exception e4) {
                    c.this.f13317d.remove(this.f13327b);
                    throw e4;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2398a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void c() {
            c.this.p(this.f13327b);
        }
    }

    public static final class f extends ActivityResultLauncher {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2398a f13331c;

        f(String str, AbstractC2398a abstractC2398a) {
            this.f13330b = str;
            this.f13331c = abstractC2398a;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void b(Object obj, AbstractC1279c abstractC1279c) {
            Object obj2 = c.this.f13315b.get(this.f13330b);
            AbstractC2398a abstractC2398a = this.f13331c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                c.this.f13317d.add(this.f13330b);
                try {
                    c.this.i(intValue, this.f13331c, obj, abstractC1279c);
                    return;
                } catch (Exception e4) {
                    c.this.f13317d.remove(this.f13330b);
                    throw e4;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2398a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void c() {
            c.this.p(this.f13330b);
        }
    }

    private final void d(int i4, String str) {
        this.f13314a.put(Integer.valueOf(i4), str);
        this.f13315b.put(str, Integer.valueOf(i4));
    }

    private final void g(String str, int i4, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f13317d.contains(str)) {
            this.f13319f.remove(str);
            this.f13320g.putParcelable(str, new ActivityResult(i4, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().c(i4, intent));
            this.f13317d.remove(str);
        }
    }

    private final int h() {
        for (Number number : k.i(d.f13325i)) {
            if (!this.f13314a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(c this$0, String key, InterfaceC1375a callback, AbstractC2398a contract, InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC1346l.a.ON_START != event) {
            if (AbstractC1346l.a.ON_STOP == event) {
                this$0.f13318e.remove(key);
                return;
            } else {
                if (AbstractC1346l.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f13318e.put(key, new a(callback, contract));
        if (this$0.f13319f.containsKey(key)) {
            Object obj = this$0.f13319f.get(key);
            this$0.f13319f.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) androidx.core.os.c.a(this$0.f13320g, key, ActivityResult.class);
        if (activityResult != null) {
            this$0.f13320g.remove(key);
            callback.onActivityResult(contract.c(activityResult.d(), activityResult.c()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f13315b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i4, int i5, Intent intent) {
        String str = (String) this.f13314a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        g(str, i5, intent, (a) this.f13318e.get(str));
        return true;
    }

    public final boolean f(int i4, Object obj) {
        String str = (String) this.f13314a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f13318e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f13320g.remove(str);
            this.f13319f.put(str, obj);
            return true;
        }
        InterfaceC1375a a4 = aVar.a();
        Intrinsics.checkNotNull(a4, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f13317d.remove(str)) {
            return true;
        }
        a4.onActivityResult(obj);
        return true;
    }

    public abstract void i(int i4, AbstractC2398a abstractC2398a, Object obj, AbstractC1279c abstractC1279c);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f13317d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f13320g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str = stringArrayList.get(i4);
            if (this.f13315b.containsKey(str)) {
                Integer num = (Integer) this.f13315b.remove(str);
                if (!this.f13320g.containsKey(str)) {
                    M.d(this.f13314a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i4);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i4);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(intValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f13315b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f13315b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f13317d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f13320g));
    }

    public final ActivityResultLauncher l(final String key, InterfaceC1354u lifecycleOwner, final AbstractC2398a contract, final InterfaceC1375a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1346l lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().d(AbstractC1346l.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        C0127c c0127c = (C0127c) this.f13316c.get(key);
        if (c0127c == null) {
            c0127c = new C0127c(lifecycle);
        }
        c0127c.a(new InterfaceC1351q() { // from class: c.b
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                c.n(c.this, key, callback, contract, interfaceC1354u, aVar);
            }
        });
        this.f13316c.put(key, c0127c);
        return new e(key, contract);
    }

    public final ActivityResultLauncher m(String key, AbstractC2398a contract, InterfaceC1375a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f13318e.put(key, new a(callback, contract));
        if (this.f13319f.containsKey(key)) {
            Object obj = this.f13319f.get(key);
            this.f13319f.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) androidx.core.os.c.a(this.f13320g, key, ActivityResult.class);
        if (activityResult != null) {
            this.f13320g.remove(key);
            callback.onActivityResult(contract.c(activityResult.d(), activityResult.c()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f13317d.contains(key) && (num = (Integer) this.f13315b.remove(key)) != null) {
            this.f13314a.remove(num);
        }
        this.f13318e.remove(key);
        if (this.f13319f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f13319f.get(key));
            this.f13319f.remove(key);
        }
        if (this.f13320g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) androidx.core.os.c.a(this.f13320g, key, ActivityResult.class)));
            this.f13320g.remove(key);
        }
        C0127c c0127c = (C0127c) this.f13316c.get(key);
        if (c0127c != null) {
            c0127c.b();
            this.f13316c.remove(key);
        }
    }
}
