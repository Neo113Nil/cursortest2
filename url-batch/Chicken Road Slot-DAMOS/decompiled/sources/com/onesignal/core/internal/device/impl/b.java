package com.onesignal.core.internal.device.impl;

import hd.g;
import hd.h;
import ja.d;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements d {
    private final qa.b _prefs;
    private final g currentId$delegate;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            String string$default = qa.a.getString$default(b.this._prefs, "OneSignal", "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString("OneSignal", "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(qa.b bVar) {
        bVar.getClass();
        this._prefs = bVar;
        this.currentId$delegate = h.b(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        value.getClass();
        return (UUID) value;
    }

    @Override // ja.d
    public Object getId(ld.a aVar) {
        return getCurrentId();
    }
}
