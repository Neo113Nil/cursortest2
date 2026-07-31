package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import android.app.Application;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzco extends l implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzco(Application application, String str, long j4, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzco(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.zza;
        ResultKt.a(obj);
        if (i4 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j4 = this.zzd;
        this.zza = 1;
        Object zzb = zzcq.zzb(application, str, j4, this);
        return zzb == f4 ? f4 : zzb;
    }
}
