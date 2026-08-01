package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b extends m {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
    public b(qa.b bVar) {
        super(new l(a.INSTANCE, "properties", bVar));
        bVar.getClass();
    }
}
