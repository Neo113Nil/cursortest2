package com.onesignal.location.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b implements Z2.a {
    public static final a Companion = new a(null);

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

    @Override // Z2.a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // Z2.a
    public Object requestPermission(V5.b bVar) {
        throw Companion.getEXCEPTION();
    }

    @Override // Z2.a
    public void setShared(boolean z7) {
        throw Companion.getEXCEPTION();
    }
}
