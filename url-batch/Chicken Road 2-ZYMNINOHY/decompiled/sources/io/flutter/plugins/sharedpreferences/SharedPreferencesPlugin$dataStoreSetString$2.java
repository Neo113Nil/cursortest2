package io.flutter.plugins.sharedpreferences;

import N.d;
import O3.l;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import h3.e;
import h3.g;
import kotlin.jvm.internal.i;
import o3.p;

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$dataStoreSetString$2 extends g implements p {
    final /* synthetic */ d $stringKey;
    final /* synthetic */ String $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$dataStoreSetString$2(d dVar, String str, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.$stringKey = dVar;
        this.$value = str;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        SharedPreferencesPlugin$dataStoreSetString$2 sharedPreferencesPlugin$dataStoreSetString$2 = new SharedPreferencesPlugin$dataStoreSetString$2(this.$stringKey, this.$value, interfaceC0425c);
        sharedPreferencesPlugin$dataStoreSetString$2.L$0 = obj;
        return sharedPreferencesPlugin$dataStoreSetString$2;
    }

    @Override // o3.p
    public final Object invoke(N.b bVar, InterfaceC0425c interfaceC0425c) {
        return ((SharedPreferencesPlugin$dataStoreSetString$2) create(bVar, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        N.b bVar = (N.b) this.L$0;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l.w(obj);
        d key = this.$stringKey;
        String str = this.$value;
        bVar.getClass();
        i.e(key, "key");
        bVar.d(key, str);
        return C0297i.f5732a;
    }
}
