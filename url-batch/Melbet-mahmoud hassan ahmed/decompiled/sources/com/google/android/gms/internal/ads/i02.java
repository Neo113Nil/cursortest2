package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class i02 implements nb3<ds2> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j02 f6478a;

    i02(j02 j02Var) {
        this.f6478a = j02Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(ds2 ds2Var) {
        r32 r32Var;
        r32 r32Var2;
        ds2 ds2Var2 = ds2Var;
        if (((Boolean) sw.c().b(m10.E4)).booleanValue()) {
            r32Var = this.f6478a.f6901e;
            r32Var.g(ds2Var2.f4313b.f3934b.f12950e);
            r32Var2 = this.f6478a.f6901e;
            r32Var2.h(ds2Var2.f4313b.f3934b.f12951f);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        Pattern pattern;
        r32 r32Var;
        if (((Boolean) sw.c().b(m10.E4)).booleanValue()) {
            pattern = j02.f6896f;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                r32Var = this.f6478a.f6901e;
                r32Var.g(Integer.parseInt(group));
            }
        }
    }
}
