package com.moat.analytics.mobile.tjy;

import android.media.MediaPlayer;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
class ai implements bc {

    /* renamed from: a, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7227a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7228b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7229c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7230d;
    private static final com.moat.analytics.mobile.tjy.base.functional.a e;

    static {
        com.moat.analytics.mobile.tjy.base.functional.a aVar;
        com.moat.analytics.mobile.tjy.base.functional.a aVar2;
        com.moat.analytics.mobile.tjy.base.functional.a aVar3;
        com.moat.analytics.mobile.tjy.base.functional.a aVar4;
        Method method;
        Method method2;
        com.moat.analytics.mobile.tjy.base.functional.a a2 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a3 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a4 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a5 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a6 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        try {
            Method method3 = NativeVideoTracker.class.getMethod("setDebug", Boolean.TYPE);
            Method method4 = NativeVideoTracker.class.getMethod("trackVideoAd", Map.class, MediaPlayer.class, View.class);
            Method method5 = NativeVideoTracker.class.getMethod("changeTargetView", View.class);
            method = NativeVideoTracker.class.getMethod("dispatchEvent", Map.class);
            method2 = NativeVideoTracker.class.getMethod("dispatchEvent", Map.class);
            aVar = com.moat.analytics.mobile.tjy.base.functional.a.a(method3);
            try {
                aVar2 = com.moat.analytics.mobile.tjy.base.functional.a.a(method4);
                try {
                    aVar3 = com.moat.analytics.mobile.tjy.base.functional.a.a(method5);
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    aVar3 = a4;
                    aVar4 = a6;
                    com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                    f7227a = aVar;
                    f7228b = aVar2;
                    f7229c = aVar3;
                    f7230d = aVar4;
                    e = a5;
                }
            } catch (NoSuchMethodException e3) {
                e = e3;
                aVar2 = a3;
                aVar3 = a4;
                aVar4 = a6;
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                f7227a = aVar;
                f7228b = aVar2;
                f7229c = aVar3;
                f7230d = aVar4;
                e = a5;
            }
        } catch (NoSuchMethodException e4) {
            e = e4;
            aVar = a2;
        }
        try {
            aVar4 = com.moat.analytics.mobile.tjy.base.functional.a.a(method);
            try {
                a5 = com.moat.analytics.mobile.tjy.base.functional.a.a(method2);
            } catch (NoSuchMethodException e5) {
                e = e5;
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                f7227a = aVar;
                f7228b = aVar2;
                f7229c = aVar3;
                f7230d = aVar4;
                e = a5;
            }
        } catch (NoSuchMethodException e6) {
            e = e6;
            aVar4 = a6;
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            f7227a = aVar;
            f7228b = aVar2;
            f7229c = aVar3;
            f7230d = aVar4;
            e = a5;
        }
        f7227a = aVar;
        f7228b = aVar2;
        f7229c = aVar3;
        f7230d = aVar4;
        e = a5;
    }

    ai() {
    }

    @Override // com.moat.analytics.mobile.tjy.bc
    public Class a() {
        return NativeVideoTracker.class;
    }
}
