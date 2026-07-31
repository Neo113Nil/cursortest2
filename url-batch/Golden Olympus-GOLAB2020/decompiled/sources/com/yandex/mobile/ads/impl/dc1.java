package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.od2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sb2<ya1> f24580a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qd2 f24581b;

    public /* synthetic */ dc1(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, new sb2(context, new za1()), new qd2(context, c2286v2, new ma1(c2286v2), new if1()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dc1 dc1Var, List list, kotlin.coroutines.d dVar) {
        bc1 bc1Var;
        int i4;
        od2 od2Var;
        dc1Var.getClass();
        if (dVar instanceof bc1) {
            bc1Var = (bc1) dVar;
            int i5 = bc1Var.f23704e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bc1Var.f23704e = i5 - Integer.MIN_VALUE;
                Object obj = bc1Var.f23702c;
                Object f4 = AbstractC1241b.f();
                i4 = bc1Var.f23704e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    qd2 qd2Var = dc1Var.f24581b;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ob2) it.next()).g());
                    }
                    bc1Var.f23701b = dc1Var;
                    bc1Var.f23704e = 1;
                    obj = qd2Var.a(arrayList, bc1Var);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dc1Var = bc1Var.f23701b;
                    ResultKt.a(obj);
                }
                od2Var = (od2) obj;
                if (!(od2Var instanceof od2.a)) {
                    return CollectionsKt.emptyList();
                }
                if (od2Var instanceof od2.b) {
                    return dc1Var.f24580a.a(((od2.b) od2Var).a());
                }
                throw new W1.m();
            }
        }
        bc1Var = new bc1(dc1Var, dVar);
        Object obj2 = bc1Var.f23702c;
        Object f42 = AbstractC1241b.f();
        i4 = bc1Var.f23704e;
        if (i4 != 0) {
        }
        od2Var = (od2) obj2;
        if (!(od2Var instanceof od2.a)) {
        }
    }

    public dc1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull sb2<ya1> videoAdInfoListCreator, @NotNull qd2 videoAdsResponseHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdInfoListCreator, "videoAdInfoListCreator");
        Intrinsics.checkNotNullParameter(videoAdsResponseHandler, "videoAdsResponseHandler");
        this.f24580a = videoAdInfoListCreator;
        this.f24581b = videoAdsResponseHandler;
    }
}
