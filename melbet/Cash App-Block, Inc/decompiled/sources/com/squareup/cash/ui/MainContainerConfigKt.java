package com.squareup.cash.ui;

import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class MainContainerConfigKt {
    public static final Set experimentalPersistedOverlayScreens;

    static {
        ReflectionFactory reflectionFactory = Reflection.factory;
        experimentalPersistedOverlayScreens = ArraysKt___ArraysKt.toSet(new KClass[]{reflectionFactory.getOrCreateKotlinClass(PaymentScreens.PaymentConfiguration.class), reflectionFactory.getOrCreateKotlinClass(PoolContributeScreen.class)});
    }
}
