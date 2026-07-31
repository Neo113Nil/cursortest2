package com.onesignal.core.internal.device.impl;

import Y1.d;
import f2.AbstractC0364a;
import f2.InterfaceC0365b;
import java.util.UUID;
import k5.InterfaceC0475e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class b implements d {
    private final InterfaceC0365b _prefs;
    private final InterfaceC0475e currentId$delegate;

    public static final class a extends j implements InterfaceC0732a {
        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final UUID invoke() {
            String string$default = AbstractC0364a.getString$default(b.this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(InterfaceC0365b _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = AbstractC0521b.x(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        i.d(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // Y1.d
    public Object getId(InterfaceC0564d interfaceC0564d) {
        return getCurrentId();
    }
}
