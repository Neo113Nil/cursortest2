package com.startapp.sdk.internal;

import c3.C0292d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final ei f8010a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f8011b;

    /* renamed from: c, reason: collision with root package name */
    public final w6 f8012c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8013d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8014e;

    public z6(Object emitterObj, ei startEvent, e3 clock) {
        kotlin.jvm.internal.i.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.i.e(startEvent, "startEvent");
        kotlin.jvm.internal.i.e(clock, "clock");
        this.f8010a = startEvent;
        this.f8011b = clock;
        this.f8012c = new w6(emitterObj);
        this.f8013d = new ArrayList();
        this.f8014e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object relativeEmitterObject) {
        kotlin.jvm.internal.i.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.i.e(relativeEmitterObject, "relativeEmitterObject");
        if (this.f8012c.a(emitterObject)) {
            w6 w6Var = this.f8012c;
            w6Var.getClass();
            if (w6Var.a(relativeEmitterObject)) {
                return;
            }
            w6Var.f7815b.add(new w6(relativeEmitterObject));
        }
    }

    public final void a(n8 emitterObject, HashMap keyValues) {
        kotlin.jvm.internal.i.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.i.e(keyValues, "keyValues");
        if (this.f8012c.a(emitterObject)) {
            long a3 = this.f8011b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                ei eiVar = (ei) entry.getKey();
                String str = (String) entry.getValue();
                List list = (List) this.f8014e.get(eiVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f8014e.put(eiVar, list);
                }
                list.add(new C0292d(str, Long.valueOf(a3)));
            }
        }
    }
}
