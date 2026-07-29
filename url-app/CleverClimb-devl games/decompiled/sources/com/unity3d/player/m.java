package com.unity3d.player;

import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f9385a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Class f9386b;

    /* renamed from: c, reason: collision with root package name */
    private Object f9387c;

    class a {

        /* renamed from: a, reason: collision with root package name */
        public Class[] f9388a;

        /* renamed from: b, reason: collision with root package name */
        public Method f9389b = null;

        public a(Class[] clsArr) {
            this.f9388a = clsArr;
        }
    }

    public m(Class cls, Object obj) {
        this.f9386b = null;
        this.f9387c = null;
        this.f9386b = cls;
        this.f9387c = obj;
    }

    private void a(String str, a aVar) {
        try {
            aVar.f9389b = this.f9386b.getMethod(str, aVar.f9388a);
        } catch (Exception e) {
            e.Log(6, "Exception while trying to get method " + str + ". " + e.getLocalizedMessage());
            aVar.f9389b = null;
        }
    }

    public final Object a(String str, Object... objArr) {
        StringBuilder sb;
        if (this.f9385a.containsKey(str)) {
            a aVar = (a) this.f9385a.get(str);
            if (aVar.f9389b == null) {
                a(str, aVar);
            }
            if (aVar.f9389b != null) {
                try {
                    return objArr.length == 0 ? aVar.f9389b.invoke(this.f9387c, new Object[0]) : aVar.f9389b.invoke(this.f9387c, objArr);
                } catch (Exception e) {
                    e.Log(6, "Error trying to call delegated method " + str + ". " + e.getLocalizedMessage());
                    return null;
                }
            }
            sb = new StringBuilder("Unable to create method: ");
        } else {
            sb = new StringBuilder("No definition for method ");
            sb.append(str);
            str = " can be found";
        }
        sb.append(str);
        e.Log(6, sb.toString());
        return null;
    }

    public final void a(String str, Class[] clsArr) {
        this.f9385a.put(str, new a(clsArr));
    }
}
