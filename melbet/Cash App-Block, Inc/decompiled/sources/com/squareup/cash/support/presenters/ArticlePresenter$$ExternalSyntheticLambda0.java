package com.squareup.cash.support.presenters;

import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.franklin.common.PaymentRenderData;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes9.dex */
public final /* synthetic */ class ArticlePresenter$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Moshi f$0;

    public /* synthetic */ ArticlePresenter$$ExternalSyntheticLambda0(Moshi moshi, int i) {
        this.$r8$classId = i;
        this.f$0 = moshi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Moshi moshi = this.f$0;
        switch (i) {
            case 0:
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType typeOf = Reflection.typeOf(String.class);
                companion.getClass();
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf)));
            case 1:
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(PaymentRenderData.class));
            case 2:
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KType typeOf2 = Reflection.typeOf(String.class);
                companion2.getClass();
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf2)));
            case 3:
                KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
                KType typeOf3 = Reflection.typeOf(String.class);
                companion3.getClass();
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf3)));
            case 4:
                KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
                KType typeOf4 = Reflection.typeOf(String.class);
                companion4.getClass();
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf4)));
            default:
                KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
                KType typeOf5 = Reflection.typeOf(String.class);
                companion5.getClass();
                return _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf5)));
        }
    }
}
