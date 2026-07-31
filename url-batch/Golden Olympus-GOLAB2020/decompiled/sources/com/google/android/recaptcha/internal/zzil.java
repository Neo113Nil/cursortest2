package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzil extends l implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzil(zzja zzjaVar, d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzil(this.zzc, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        return kotlin.Unit.f41027a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        ((android.webkit.WebView) r7).addJavascriptInterface(r6.zzc.zzq(), "RN");
        r7 = r6.zzc;
        r6.zzb = 4;
        r7 = r7.zzw(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.zzb;
        if (i4 == 0) {
            ResultKt.a(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            obj = zzjaVar.zzw(this);
        } else if (i4 == 1) {
            ResultKt.a(obj);
        } else if (i4 != 2) {
            ResultKt.a(obj);
        } else {
            ResultKt.a(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar2 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar2.zzw(this);
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar3 = this.zzc;
        this.zza = zzjaVar3;
        this.zzb = 2;
        obj = zzjaVar3.zzw(this);
    }
}
