package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class b extends m {

    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.properties.a invoke() {
            return new com.onesignal.user.internal.properties.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(H2.b prefs) {
        super(new l(a.INSTANCE, "properties", prefs));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }
}
