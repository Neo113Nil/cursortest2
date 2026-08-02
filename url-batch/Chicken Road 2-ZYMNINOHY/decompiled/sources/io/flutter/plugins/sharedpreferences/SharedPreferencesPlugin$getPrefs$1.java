package io.flutter.plugins.sharedpreferences;

import f3.InterfaceC0425c;
import h3.e;

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {256, 258}, m = "getPrefs", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getPrefs$1 extends h3.c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getPrefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.this$0 = sharedPreferencesPlugin;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Object prefs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prefs = this.this$0.getPrefs(null, this);
        return prefs;
    }
}
