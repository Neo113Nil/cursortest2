package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends e {

    /* renamed from: a, reason: collision with root package name */
    private Set f12084a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private List f12085b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f12086c = new CopyOnWriteArrayList();

    private boolean b() {
        boolean z4 = false;
        for (String str : this.f12086c) {
            try {
                Class<?> cls = Class.forName(str);
                if (e.class.isAssignableFrom(cls)) {
                    a((e) cls.newInstance());
                    this.f12086c.remove(str);
                    z4 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e4) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e4);
            } catch (InstantiationException e5) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e5);
            }
        }
        return z4;
    }

    public void a(e eVar) {
        if (this.f12084a.add(eVar.getClass())) {
            this.f12085b.add(eVar);
            Iterator it = eVar.collectDependencies().iterator();
            while (it.hasNext()) {
                a((e) it.next());
            }
        }
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        Iterator it = this.f12085b.iterator();
        while (it.hasNext()) {
            o dataBinder = ((e) it.next()).getDataBinder(dataBindingComponent, view, i4);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(dataBindingComponent, view, i4);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        Iterator it = this.f12085b.iterator();
        while (it.hasNext()) {
            o dataBinder = ((e) it.next()).getDataBinder(dataBindingComponent, viewArr, i4);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(dataBindingComponent, viewArr, i4);
        }
        return null;
    }
}
