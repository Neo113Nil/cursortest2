package io.flutter.plugins.sharedpreferences;

import K.InterfaceC0059h;
import N.d;
import N.h;
import O3.l;
import android.content.Context;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import h3.e;
import h3.g;
import kotlin.jvm.internal.i;
import o3.p;
import x3.InterfaceC1560u;

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", f = "SharedPreferencesPlugin.kt", l = {81}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$setBool$1 extends g implements p {
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $value;
    Object L$0;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    @e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends g implements p {
        final /* synthetic */ d $boolKey;
        final /* synthetic */ boolean $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, boolean z, InterfaceC0425c interfaceC0425c) {
            super(2, interfaceC0425c);
            this.$boolKey = dVar;
            this.$value = z;
        }

        @Override // h3.AbstractC0448a
        public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$boolKey, this.$value, interfaceC0425c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o3.p
        public final Object invoke(N.b bVar, InterfaceC0425c interfaceC0425c) {
            return ((AnonymousClass1) create(bVar, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
        }

        @Override // h3.AbstractC0448a
        public final Object invokeSuspend(Object obj) {
            N.b bVar = (N.b) this.L$0;
            EnumC0441a enumC0441a = EnumC0441a.f9038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.w(obj);
            d key = this.$boolKey;
            Boolean valueOf = Boolean.valueOf(this.$value);
            bVar.getClass();
            i.e(key, "key");
            bVar.d(key, valueOf);
            return C0297i.f5732a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$setBool$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = z;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new SharedPreferencesPlugin$setBool$1(this.$key, this.this$0, this.$value, interfaceC0425c);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Context context;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.label;
        if (i4 == 0) {
            l.w(obj);
            String name = this.$key;
            i.e(name, "name");
            d dVar = new d(name);
            context = this.this$0.context;
            if (context == null) {
                i.i("context");
                throw null;
            }
            InterfaceC0059h sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, this.$value, null);
            this.L$0 = null;
            this.label = 1;
            if (sharedPreferencesDataStore.a(new h(anonymousClass1, null), this) == enumC0441a) {
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
        return ((SharedPreferencesPlugin$setBool$1) create(interfaceC1560u, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
    }
}
