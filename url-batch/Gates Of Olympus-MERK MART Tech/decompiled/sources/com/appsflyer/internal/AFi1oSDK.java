package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AFi1oSDK {
    final Intent AFKeystoreWrapper;

    public AFi1oSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFKeystoreWrapper = intent;
    }

    public final String AFInAppEventType(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFInAppEventType(new Function0<String>() { // from class: com.appsflyer.internal.AFi1oSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFi1oSDK.this.AFKeystoreWrapper.getStringExtra(str);
            }
        }, new StringBuilder("Error while trying to read ").append(str).append(" extra from intent").toString(), null, true);
    }

    public final boolean AFInAppEventParameterName(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFInAppEventType(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFi1oSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFi1oSDK.this.AFKeystoreWrapper.hasExtra(str));
            }
        }, new StringBuilder("Error while trying to check presence of ").append(str).append(" extra from intent").toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent valueOf(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFInAppEventType(new Function0<Intent>() { // from class: com.appsflyer.internal.AFi1oSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFi1oSDK.this.AFKeystoreWrapper.putExtra(str, j);
            }
        }, new StringBuilder("Error while trying to write ").append(str).append(" extra to intent").toString(), null, true);
    }

    public final <T> T AFInAppEventType(Function0<? extends T> function0, String str, T t, boolean z) {
        Object m9577constructorimpl;
        Object m9577constructorimpl2;
        Object obj;
        Object m9577constructorimpl3;
        synchronized (this.AFKeystoreWrapper) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFi1oSDK aFi1oSDK = this;
                m9577constructorimpl = Result.m9577constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable m9580exceptionOrNullimpl = Result.m9580exceptionOrNullimpl(m9577constructorimpl);
            if (m9580exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m9577constructorimpl2 = Result.m9577constructorimpl(ResultKt.createFailure(th2));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(m9580exceptionOrNullimpl.getClass()))) {
                    if (z) {
                        obj = AFInAppEventType(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m9580exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m9577constructorimpl2 = Result.m9577constructorimpl(obj);
                    m9577constructorimpl = m9577constructorimpl2;
                } else {
                    throw m9580exceptionOrNullimpl;
                }
            }
            KClass[] kClassArr2 = {Reflection.getOrCreateKotlinClass(RuntimeException.class)};
            Throwable m9580exceptionOrNullimpl2 = Result.m9580exceptionOrNullimpl(m9577constructorimpl);
            if (m9580exceptionOrNullimpl2 != null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m9577constructorimpl3 = Result.m9577constructorimpl(ResultKt.createFailure(th3));
                }
                if (ArraysKt.contains(kClassArr2, Reflection.getOrCreateKotlinClass(m9580exceptionOrNullimpl2.getClass()))) {
                    AFLogger.afErrorLog(str, m9580exceptionOrNullimpl2, false, false);
                    m9577constructorimpl3 = Result.m9577constructorimpl(t);
                    m9577constructorimpl = (T) m9577constructorimpl3;
                } else {
                    throw m9580exceptionOrNullimpl2;
                }
            }
            ResultKt.throwOnFailure(m9577constructorimpl);
        }
        return (T) m9577constructorimpl;
    }
}
