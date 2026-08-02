package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.sdk.internal.i7;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6587b;

    public /* synthetic */ d(Context context, int i4) {
        this.f6586a = i4;
        this.f6587b = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f6586a) {
            case 0:
                return a.b(this.f6587b);
            default:
                return a.d(this.f6587b);
        }
    }
}
