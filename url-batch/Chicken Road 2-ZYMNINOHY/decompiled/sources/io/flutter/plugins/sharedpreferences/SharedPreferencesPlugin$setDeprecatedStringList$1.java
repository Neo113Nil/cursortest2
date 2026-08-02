package io.flutter.plugins.sharedpreferences;

import O3.l;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import h3.e;
import h3.g;
import o3.p;
import x3.InterfaceC1560u;

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", f = "SharedPreferencesPlugin.kt", l = {128}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$setDeprecatedStringList$1 extends g implements p {
    final /* synthetic */ String $key;
    final /* synthetic */ String $valueString;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$setDeprecatedStringList$1(SharedPreferencesPlugin sharedPreferencesPlugin, String str, String str2, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.this$0 = sharedPreferencesPlugin;
        this.$key = str;
        this.$valueString = str2;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new SharedPreferencesPlugin$setDeprecatedStringList$1(this.this$0, this.$key, this.$valueString, interfaceC0425c);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Object dataStoreSetString;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.label;
        if (i4 == 0) {
            l.w(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
            String str = this.$key;
            String str2 = this.$valueString;
            this.label = 1;
            dataStoreSetString = sharedPreferencesPlugin.dataStoreSetString(str, str2, this);
            if (dataStoreSetString == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.w(obj);
        }
        return C0297i.f5732a;
    }

    @Override // o3.p
    public final Object invoke(InterfaceC1560u interfaceC1560u, InterfaceC0425c interfaceC0425c) {
        return ((SharedPreferencesPlugin$setDeprecatedStringList$1) create(interfaceC1560u, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
    }
}
