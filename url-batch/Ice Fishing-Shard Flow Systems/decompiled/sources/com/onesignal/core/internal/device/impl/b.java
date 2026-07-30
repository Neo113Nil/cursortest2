package com.onesignal.core.internal.device.impl;

import A2.d;
import R5.InterfaceC0168h;
import R5.i;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b implements d {
    private final H2.b _prefs;
    private final InterfaceC0168h currentId$delegate;

    public static final class a extends p implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            String string$default = H2.a.getString$default(b.this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(H2.b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = i.b(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // A2.d
    public Object getId(V5.b bVar) {
        return getCurrentId();
    }
}
