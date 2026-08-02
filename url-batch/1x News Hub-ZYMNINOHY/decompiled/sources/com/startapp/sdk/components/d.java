package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.sdk.internal.i7;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3489b;

    public /* synthetic */ d(Context context, int i3) {
        this.f3488a = i3;
        this.f3489b = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f3488a) {
            case 0:
                return a.b(this.f3489b);
            default:
                return a.d(this.f3489b);
        }
    }
}
