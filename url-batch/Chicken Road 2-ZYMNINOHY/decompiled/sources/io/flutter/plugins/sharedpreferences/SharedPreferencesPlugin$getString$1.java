package io.flutter.plugins.sharedpreferences;

import A3.w;
import N.d;
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

@e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", f = "SharedPreferencesPlugin.kt", l = {201}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getString$1 extends g implements p {
    final /* synthetic */ String $key;
    final /* synthetic */ kotlin.jvm.internal.p $value;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getString$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, kotlin.jvm.internal.p pVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = pVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new SharedPreferencesPlugin$getString$1(this.$key, this.this$0, this.$value, interfaceC0425c);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Context context;
        kotlin.jvm.internal.p pVar;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.label;
        if (i4 == 0) {
            l.w(obj);
            String name = this.$key;
            i.e(name, "name");
            final d dVar = new d(name);
            context = this.this$0.context;
            if (context == null) {
                i.i("context");
                throw null;
            }
            final A3.d data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            A3.d dVar2 = new A3.d() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements A3.e {
                    final /* synthetic */ d $preferencesKey$inlined;
                    final /* synthetic */ A3.e $this_unsafeFlow;

                    @e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit", v = 1)
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends h3.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC0425c interfaceC0425c) {
                            super(interfaceC0425c);
                        }

                        @Override // h3.AbstractC0448a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(A3.e eVar, d dVar) {
                        this.$this_unsafeFlow = eVar;
                        this.$preferencesKey$inlined = dVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // A3.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
                        AnonymousClass1 anonymousClass1;
                        int i4;
                        if (interfaceC0425c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC0425c;
                            int i5 = anonymousClass1.label;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i5 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                                i4 = anonymousClass1.label;
                                if (i4 != 0) {
                                    l.w(obj2);
                                    A3.e eVar = this.$this_unsafeFlow;
                                    Object c4 = ((N.b) obj).c(this.$preferencesKey$inlined);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (eVar.emit(c4, anonymousClass1) == enumC0441a) {
                                        return enumC0441a;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    l.w(obj2);
                                }
                                return C0297i.f5732a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(interfaceC0425c);
                        Object obj22 = anonymousClass1.result;
                        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                        i4 = anonymousClass1.label;
                        if (i4 != 0) {
                        }
                        return C0297i.f5732a;
                    }
                }

                @Override // A3.d
                public Object collect(A3.e eVar, InterfaceC0425c interfaceC0425c) {
                    Object collect = A3.d.this.collect(new AnonymousClass2(eVar, dVar), interfaceC0425c);
                    return collect == EnumC0441a.f9038a ? collect : C0297i.f5732a;
                }
            };
            kotlin.jvm.internal.p pVar2 = this.$value;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = pVar2;
            this.label = 1;
            Object c4 = w.c(dVar2, this);
            if (c4 == enumC0441a) {
                return enumC0441a;
            }
            pVar = pVar2;
            obj = c4;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (kotlin.jvm.internal.p) this.L$2;
            l.w(obj);
        }
        pVar.f14159a = obj;
        return C0297i.f5732a;
    }

    @Override // o3.p
    public final Object invoke(InterfaceC1560u interfaceC1560u, InterfaceC0425c interfaceC0425c) {
        return ((SharedPreferencesPlugin$getString$1) create(interfaceC1560u, interfaceC0425c)).invokeSuspend(C0297i.f5732a);
    }
}
