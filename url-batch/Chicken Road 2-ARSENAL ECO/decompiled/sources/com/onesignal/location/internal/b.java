package com.onesignal.location.internal;

import kotlin.jvm.internal.e;
import o5.InterfaceC0564d;
import x2.InterfaceC0728a;

/* loaded from: classes.dex */
public final class b implements InterfaceC0728a {
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

    @Override // x2.InterfaceC0728a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // x2.InterfaceC0728a
    public Object requestPermission(InterfaceC0564d interfaceC0564d) {
        throw Companion.getEXCEPTION();
    }

    @Override // x2.InterfaceC0728a
    public void setShared(boolean z5) {
        throw Companion.getEXCEPTION();
    }
}
