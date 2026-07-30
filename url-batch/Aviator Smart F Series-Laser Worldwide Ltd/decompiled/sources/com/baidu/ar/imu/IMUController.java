package com.baidu.ar.imu;

import android.content.Context;
import android.hardware.SensorManager;
import com.baidu.ar.e6;
import com.baidu.ar.n7;
import com.baidu.ar.o7;
import com.baidu.ar.q7;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class IMUController implements e6 {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f2504a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap<n7, o7> f2505b;

    @Override // com.baidu.ar.e6
    public void destroy() {
        HashMap<n7, o7> hashMap = this.f2505b;
        if (hashMap != null) {
            Iterator<o7> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f2505b.clear();
            this.f2505b = null;
        }
        this.f2504a = null;
    }

    @Override // com.baidu.ar.e6
    public void setContext(Context context) {
        if (context != null) {
            this.f2504a = (SensorManager) context.getSystemService("sensor");
        }
    }

    @Override // com.baidu.ar.e6
    public boolean start(q7 q7Var, n7 n7Var) {
        if (this.f2504a == null || q7Var == null || n7Var == null) {
            return false;
        }
        if (this.f2505b == null) {
            this.f2505b = new HashMap<>();
        }
        o7 o7Var = this.f2505b.get(n7Var);
        if (o7Var == null) {
            o7Var = new o7();
            this.f2505b.put(n7Var, o7Var);
        }
        return o7Var.a(this.f2504a, q7Var, n7Var);
    }

    @Override // com.baidu.ar.e6
    public void stop(n7 n7Var) {
        HashMap<n7, o7> hashMap;
        o7 remove;
        if (n7Var == null || (hashMap = this.f2505b) == null || (remove = hashMap.remove(n7Var)) == null) {
            return;
        }
        remove.b();
    }
}
