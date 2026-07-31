package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import f2.InterfaceC0365b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public class c extends m {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final b invoke() {
            return new b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0365b prefs) {
        super(new l(a.INSTANCE, "config", prefs));
        i.e(prefs, "prefs");
    }
}
