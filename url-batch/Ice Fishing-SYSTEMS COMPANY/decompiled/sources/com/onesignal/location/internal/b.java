package com.onesignal.location.internal;

import kotlin.jvm.internal.e;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class b implements W4.a {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // W4.a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // W4.a
    public Object requestPermission(InterfaceC5133d interfaceC5133d) {
        throw Companion.getEXCEPTION();
    }

    @Override // W4.a
    public void setShared(boolean z8) {
        throw Companion.getEXCEPTION();
    }
}
