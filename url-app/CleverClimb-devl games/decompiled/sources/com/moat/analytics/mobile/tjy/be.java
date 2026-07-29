package com.moat.analytics.mobile.tjy;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
class be implements bc {

    /* renamed from: a, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7258a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7259b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7260c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7261d;

    static {
        com.moat.analytics.mobile.tjy.base.functional.a aVar;
        com.moat.analytics.mobile.tjy.base.functional.a aVar2;
        com.moat.analytics.mobile.tjy.base.functional.a aVar3;
        com.moat.analytics.mobile.tjy.base.functional.a aVar4;
        Method method;
        Method method2;
        Method method3;
        com.moat.analytics.mobile.tjy.base.functional.a a2 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a3 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a4 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a5 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        try {
            Method method4 = ReactiveVideoTracker.class.getMethod("setDebug", Boolean.TYPE);
            method = ReactiveVideoTracker.class.getMethod("trackVideoAd", Map.class, View.class, View.class);
            method2 = ReactiveVideoTracker.class.getMethod("changeTargetView", View.class);
            method3 = ReactiveVideoTracker.class.getMethod("dispatchEvent", MoatAdEvent.class);
            aVar = com.moat.analytics.mobile.tjy.base.functional.a.a(method4);
        } catch (NoSuchMethodException e) {
            e = e;
            aVar = a2;
        }
        try {
            aVar2 = com.moat.analytics.mobile.tjy.base.functional.a.a(method);
            try {
                aVar3 = com.moat.analytics.mobile.tjy.base.functional.a.a(method2);
                try {
                    aVar4 = com.moat.analytics.mobile.tjy.base.functional.a.a(method3);
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                    aVar4 = a5;
                    f7258a = aVar;
                    f7259b = aVar2;
                    f7260c = aVar3;
                    f7261d = aVar4;
                }
            } catch (NoSuchMethodException e3) {
                e = e3;
                aVar3 = a4;
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                aVar4 = a5;
                f7258a = aVar;
                f7259b = aVar2;
                f7260c = aVar3;
                f7261d = aVar4;
            }
        } catch (NoSuchMethodException e4) {
            e = e4;
            aVar2 = a3;
            aVar3 = a4;
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            aVar4 = a5;
            f7258a = aVar;
            f7259b = aVar2;
            f7260c = aVar3;
            f7261d = aVar4;
        }
        f7258a = aVar;
        f7259b = aVar2;
        f7260c = aVar3;
        f7261d = aVar4;
    }

    be() {
    }

    @Override // com.moat.analytics.mobile.tjy.bc
    public Class a() {
        return ReactiveVideoTracker.class;
    }
}
