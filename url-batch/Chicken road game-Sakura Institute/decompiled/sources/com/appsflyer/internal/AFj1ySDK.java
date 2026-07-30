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
public final class AFj1ySDK {
    final Intent AFInAppEventParameterName;

    public AFj1ySDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFInAppEventParameterName = intent;
    }

    public final String AFInAppEventParameterName(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFInAppEventParameterName(new Function0<String>() { // from class: com.appsflyer.internal.AFj1ySDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1ySDK.this.AFInAppEventParameterName.getStringExtra(str);
            }
        }, new StringBuilder("Error while trying to read ").append(str).append(" extra from intent").toString(), null, true);
    }

    public final boolean values(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFInAppEventParameterName(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1ySDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1ySDK.this.AFInAppEventParameterName.hasExtra(str));
            }
        }, new StringBuilder("Error while trying to check presence of ").append(str).append(" extra from intent").toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent AFInAppEventParameterName(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFInAppEventParameterName(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1ySDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1ySDK.this.AFInAppEventParameterName.putExtra(str, j);
            }
        }, new StringBuilder("Error while trying to write ").append(str).append(" extra to intent").toString(), null, true);
    }

    public final <T> T AFInAppEventParameterName(Function0<? extends T> function0, String str, T t, boolean z) {
        Object m6819constructorimpl;
        Object m6819constructorimpl2;
        Object obj;
        Object m6819constructorimpl3;
        synchronized (this.AFInAppEventParameterName) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFj1ySDK aFj1ySDK = this;
                m6819constructorimpl = Result.m6819constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable m6822exceptionOrNullimpl = Result.m6822exceptionOrNullimpl(m6819constructorimpl);
            if (m6822exceptionOrNullimpl != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m6819constructorimpl2 = Result.m6819constructorimpl(ResultKt.createFailure(th2));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(m6822exceptionOrNullimpl.getClass()))) {
                    if (z) {
                        obj = AFInAppEventParameterName(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m6822exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m6819constructorimpl2 = Result.m6819constructorimpl(obj);
                    m6819constructorimpl = m6819constructorimpl2;
                } else {
                    throw m6822exceptionOrNullimpl;
                }
            }
            KClass[] kClassArr2 = {Reflection.getOrCreateKotlinClass(RuntimeException.class)};
            Throwable m6822exceptionOrNullimpl2 = Result.m6822exceptionOrNullimpl(m6819constructorimpl);
            if (m6822exceptionOrNullimpl2 != null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m6819constructorimpl3 = Result.m6819constructorimpl(ResultKt.createFailure(th3));
                }
                if (ArraysKt.contains(kClassArr2, Reflection.getOrCreateKotlinClass(m6822exceptionOrNullimpl2.getClass()))) {
                    AFLogger.afErrorLog(str, m6822exceptionOrNullimpl2, false, false);
                    m6819constructorimpl3 = Result.m6819constructorimpl(t);
                    m6819constructorimpl = (T) m6819constructorimpl3;
                } else {
                    throw m6822exceptionOrNullimpl2;
                }
            }
            ResultKt.throwOnFailure(m6819constructorimpl);
        }
        return (T) m6819constructorimpl;
    }
}
