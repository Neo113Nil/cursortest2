package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public interface oa {

    public static final class a {
        public static CBError.Impression a(oa oaVar, String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return CBError.Impression.INTERNAL;
        }
    }

    void A();

    String B();

    String C();

    void a(float f);

    void a(float f, float f2);

    void a(ek ekVar);

    void a(o3 o3Var);

    void a(xe xeVar);

    void a(List list, Integer num);

    void a(boolean z, String str);

    void b();

    void b(float f);

    void b(o3 o3Var);

    void c(o3 o3Var);

    void c(String str);

    CBError.Impression d(String str);

    void d(o3 o3Var);

    void e(String str);

    void f();

    String h();

    void i();

    String j();

    void k();

    void l();

    void q();

    String s();

    void t();

    void u();

    void v();

    String w();

    void z();
}
