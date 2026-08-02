package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbh {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final qi b = new qi();
    public final qi c = new qi();
    private final String d;

    public gbh(String str) {
        hoq.y(!hoq.S(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = str;
    }

    public final int a(Object obj) {
        fao.c();
        Integer num = (Integer) this.c.get(obj.getClass());
        hoq.K(num != null, "The callback %s has not been registered", obj.getClass());
        hoq.K(b(num.intValue()) == obj, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    public final Object b(int i) {
        fao.c();
        Object obj = this.b.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.c.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        obj.getClass();
        return obj;
    }

    public final void c() {
        fao.c();
        this.b.clear();
    }

    public final void d(Object obj) {
        fao.c();
        qi qiVar = this.c;
        Class<?> cls = obj.getClass();
        if (qiVar.containsKey(cls)) {
            Integer num = (Integer) qiVar.get(cls);
            num.intValue();
            hoq.K(this.b.put(num, obj) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
        } else {
            Integer valueOf = Integer.valueOf(a.getAndIncrement());
            qiVar.put(cls, valueOf);
            this.b.put(valueOf, obj);
        }
    }

    public final void e(Bundle bundle) {
        fao.c();
        if (bundle != null) {
            String str = this.d;
            String concat = "CallbackIdMap.classes".concat(str);
            hoq.I(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(concat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        hoq.N(intValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void f(Bundle bundle) {
        fao.c();
        String str = this.d;
        String concat = "CallbackIdMap.classes".concat(str);
        hoq.K(!bundle.containsKey(concat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat);
        qi qiVar = this.c;
        int i = qiVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : qiVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(concat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(str), iArr);
    }

    public final void g() {
        fao.c();
        for (Map.Entry entry : this.c.entrySet()) {
            hoq.K(this.b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
