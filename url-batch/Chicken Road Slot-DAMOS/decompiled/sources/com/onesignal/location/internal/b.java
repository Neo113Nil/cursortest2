package com.onesignal.location.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements ib.a {
    public static final a Companion = new a(null);

    @Override // ib.a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // ib.a
    public Object requestPermission(ld.a aVar) {
        throw Companion.getEXCEPTION();
    }

    @Override // ib.a
    public void setShared(boolean z10) {
        throw Companion.getEXCEPTION();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }
}
