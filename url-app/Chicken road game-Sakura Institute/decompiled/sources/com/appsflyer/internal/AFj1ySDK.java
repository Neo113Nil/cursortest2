package com.appsflyer.internal;

import M2.F;
import M2.p;
import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import z2.C1439w;

/* loaded from: classes.dex */
public final class AFj1ySDK {
    final Intent AFInAppEventParameterName;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1ySDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0 {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.getParcelableExtra(this.$valueOf);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1ySDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function0<String> {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.getStringExtra(this.$valueOf);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1ySDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function0<Boolean> {
        private /* synthetic */ String $AFInAppEventParameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFInAppEventParameterName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1ySDK.this.AFInAppEventParameterName.hasExtra(this.$AFInAppEventParameterName));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1ySDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function0<Intent> {
        private /* synthetic */ long $AFKeystoreWrapper;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j4) {
            super(0);
            this.$values = str;
            this.$AFKeystoreWrapper = j4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.putExtra(this.$values, this.$AFKeystoreWrapper);
        }
    }

    public AFj1ySDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFInAppEventParameterName = intent;
    }

    public final String AFInAppEventParameterName(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        StringBuilder sb = new StringBuilder("Error while trying to read ");
        sb.append(str);
        sb.append(" extra from intent");
        return (String) AFInAppEventParameterName(anonymousClass2, sb.toString(), null, true);
    }

    public final boolean values(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(str);
        StringBuilder sb = new StringBuilder("Error while trying to check presence of ");
        sb.append(str);
        sb.append(" extra from intent");
        Boolean bool = (Boolean) AFInAppEventParameterName(anonymousClass3, sb.toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent AFInAppEventParameterName(String str, long j4) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(str, j4);
        StringBuilder sb = new StringBuilder("Error while trying to write ");
        sb.append(str);
        sb.append(" extra to intent");
        return (Intent) AFInAppEventParameterName(anonymousClass5, sb.toString(), null, true);
    }

    public final <T> T AFInAppEventParameterName(Function0<? extends T> function0, String str, T t4, boolean z4) {
        T a4;
        Object a5;
        synchronized (this.AFInAppEventParameterName) {
            try {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                a4 = function0.invoke();
            } catch (Throwable th) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                a4 = AbstractC1343r.a(th);
            }
            S2.b[] bVarArr = {F.a(ConcurrentModificationException.class), F.a(ArrayIndexOutOfBoundsException.class)};
            Throwable a6 = AbstractC1341p.a(a4);
            if (a6 != null) {
                try {
                } catch (Throwable th2) {
                    AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                    a5 = AbstractC1343r.a(th2);
                }
                if (!C1439w.r(bVarArr, F.a(a6.getClass()))) {
                    throw a6;
                }
                if (z4) {
                    a5 = AFInAppEventParameterName(function0, str, t4, false);
                } else {
                    AFLogger.afErrorLog(str, a6, false, false);
                    a5 = t4;
                }
                a4 = a5;
            }
            S2.b[] bVarArr2 = {F.a(RuntimeException.class)};
            Throwable a7 = AbstractC1341p.a(a4);
            if (a7 != null) {
                try {
                } catch (Throwable th3) {
                    AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                    t4 = (T) AbstractC1343r.a(th3);
                }
                if (C1439w.r(bVarArr2, F.a(a7.getClass()))) {
                    AFLogger.afErrorLog(str, a7, false, false);
                    a4 = t4;
                } else {
                    throw a7;
                }
            }
            AbstractC1343r.b(a4);
        }
        return (T) a4;
    }
}
