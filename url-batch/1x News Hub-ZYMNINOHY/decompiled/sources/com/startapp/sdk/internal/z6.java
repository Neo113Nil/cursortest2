package com.startapp.sdk.internal;

import b2.C0190d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final ei f4860a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f4861b;

    /* renamed from: c, reason: collision with root package name */
    public final w6 f4862c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4863d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4864e;

    public z6(Object emitterObj, ei startEvent, e3 clock) {
        kotlin.jvm.internal.j.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.j.e(startEvent, "startEvent");
        kotlin.jvm.internal.j.e(clock, "clock");
        this.f4860a = startEvent;
        this.f4861b = clock;
        this.f4862c = new w6(emitterObj);
        this.f4863d = new ArrayList();
        this.f4864e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object relativeEmitterObject) {
        kotlin.jvm.internal.j.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.j.e(relativeEmitterObject, "relativeEmitterObject");
        if (this.f4862c.a(emitterObject)) {
            w6 w6Var = this.f4862c;
            w6Var.getClass();
            if (w6Var.a(relativeEmitterObject)) {
                return;
            }
            w6Var.f4670b.add(new w6(relativeEmitterObject));
        }
    }

    public final void a(n8 emitterObject, HashMap keyValues) {
        kotlin.jvm.internal.j.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.j.e(keyValues, "keyValues");
        if (this.f4862c.a(emitterObject)) {
            long a3 = this.f4861b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                ei eiVar = (ei) entry.getKey();
                String str = (String) entry.getValue();
                List list = (List) this.f4864e.get(eiVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f4864e.put(eiVar, list);
                }
                list.add(new C0190d(str, Long.valueOf(a3)));
            }
        }
    }
}
