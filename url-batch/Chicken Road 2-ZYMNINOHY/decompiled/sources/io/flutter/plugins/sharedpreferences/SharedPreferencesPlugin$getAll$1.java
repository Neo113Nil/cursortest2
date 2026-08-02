package io.flutter.plugins.sharedpreferences;

import O3.l;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import h3.e;
import h3.g;
import java.util.List;
import o3.p;
import x3.InterfaceC1560u;

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f = "SharedPreferencesPlugin.kt", l = {150}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getAll$1 extends g implements p {
    final /* synthetic */ List<String> $allowList;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getAll$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new SharedPreferencesPlugin$getAll$1(this.this$0, this.$allowList, interfaceC0425c);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Object prefs;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.w(obj);
            return obj;
        }
        l.w(obj);
        SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
        List<String> list = this.$allowList;
        this.label = 1;
        prefs = sharedPreferencesPlugin.getPrefs(list, this);
        return prefs == enumC0441a ? enumC0441a : prefs;
    }

    @Override // o3.p
    public final Object invoke(InterfaceC1560u interfaceC1560u, InterfaceC0425c interfaceC0425c) {
        return ((SharedPreferencesPlugin$getAll$1) create(interfaceC1560u, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
    }
}
