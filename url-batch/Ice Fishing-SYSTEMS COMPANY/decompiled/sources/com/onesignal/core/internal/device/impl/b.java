package com.onesignal.core.internal.device.impl;

import com.bumptech.glide.e;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q7.InterfaceC4936e;
import v7.InterfaceC5133d;
import y4.d;

/* loaded from: classes2.dex */
public final class b implements d {
    private final F4.b _prefs;
    private final InterfaceC4936e currentId$delegate;

    public static final class a extends i implements E7.a {
        public a() {
            super(0);
        }

        @Override // E7.a
        public final UUID invoke() {
            String string$default = F4.a.getString$default(b.this._prefs, com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(F4.b _prefs) {
        h.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = e.q(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        h.d(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // y4.d
    public Object getId(InterfaceC5133d interfaceC5133d) {
        return getCurrentId();
    }
}
