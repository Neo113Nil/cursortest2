package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jp extends s7 {

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    public static final jp f16866P;

    @Metadata
    public static final class a {
        public final void a() {
            new bk().b(ContextProvider.getInstance().getApplicationContext());
            jp.f16866P.a(new zb(IronSourceConstants.INIT_DEFERRED_DATA, new oi().a()));
        }
    }

    static {
        jp jpVar = new jp();
        f16866P = jpVar;
        jpVar.f18979H = "outcome";
        jpVar.f18978G = 0;
        jpVar.f18980I = IronSourceConstants.PIXEL_EVENT_TYPE;
        jpVar.e();
    }

    private jp() {
    }

    @Override // com.ironsource.s7
    protected void a(@Nullable ArrayList<zb> arrayList) {
    }

    @Override // com.ironsource.s7
    protected int c(@Nullable zb zbVar) {
        return 1;
    }

    @Override // com.ironsource.s7
    protected void d() {
    }

    @Override // com.ironsource.s7
    @NotNull
    protected String e(int i4) {
        return "";
    }

    @Override // com.ironsource.s7
    protected void f(@Nullable zb zbVar) {
    }

    @Override // com.ironsource.s7
    protected boolean g(@Nullable zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean h(@Nullable zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean j(@Nullable zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean d(@Nullable zb zbVar) {
        return true;
    }
}
